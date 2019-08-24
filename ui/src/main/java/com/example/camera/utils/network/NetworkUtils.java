package com.example.camera.utils.network;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

import com.example.camera.utils.EmptyUtils;
import com.example.camera.utils.ShellUtils;
import com.example.camera.utils.Utils;
import com.example.camera.utils.log.LogI;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * NetworkUtils
 * Created by laorencel on 2017/8/19.
 */

public class NetworkUtils {

    /**
     * 判断网络是否连通
     */
    public static boolean isNetworkConnected(Context context) {
        try {
            if (context != null) {
                @SuppressWarnings("static-access")
                ConnectivityManager cm = (ConnectivityManager) context
                        .getSystemService(context.CONNECTIVITY_SERVICE);
                NetworkInfo info = cm.getActiveNetworkInfo();
                return info != null && info.isConnected();
            } else {
                //如果context为空，就返回false，表示网络未连接
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }

    public static boolean isWifiConnected(Context context) {
        if (context != null) {
            ConnectivityManager cm = (ConnectivityManager) context
                    .getSystemService(context.CONNECTIVITY_SERVICE);
            NetworkInfo info = cm.getActiveNetworkInfo();
            return info != null && (info.getType() == ConnectivityManager.TYPE_WIFI);
        } else {
            /**如果context为null就表示为未连接*/
            return false;
        }
    }

    // 判断移动网络
    public static boolean isMobileConnected(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mMobileNetworkInfo = null;
            if (mConnectivityManager != null) {
                mMobileNetworkInfo = mConnectivityManager
                        .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            }
            if (mMobileNetworkInfo != null) {
                return mMobileNetworkInfo.isAvailable();
            }
        }
        return false;
    }

    public static void openNetIntent(Context context) {
        Intent intent;
        //判断手机系统的版本  即API大于10 就是3.0或以上版本
        if (android.os.Build.VERSION.SDK_INT > 10) {
            intent = new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS);
        } else {
            intent = new Intent();
            ComponentName component = new ComponentName("com.android.settings", "com.android.settings.WirelessSettings");
            intent.setComponent(component);
            intent.setAction("android.intent.action.VIEW");
        }
        context.startActivity(intent);
    }

    //获取外网的IP(要访问Url，要放到后台线程里处理)
    public static void getOuterIpAddress(final OutIpAddrCallback callback) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                URL infoUrl;
                InputStream inStream = null;
                String ipLine = "";
                HttpURLConnection httpConnection = null;
                try {
//            infoUrl = new URL("http://ip168.com/");
                    infoUrl = new URL("http://pv.sohu.com/cityjson?ie=utf-8");
                    URLConnection connection = infoUrl.openConnection();
                    httpConnection = (HttpURLConnection) connection;
                    int responseCode = httpConnection.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        inStream = httpConnection.getInputStream();
                        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(inStream, "utf-8"));
                        StringBuilder strber = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            strber.append(line).append("\n");
                        }
                        Pattern pattern = Pattern
                                .compile("((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))");
                        Matcher matcher = pattern.matcher(strber.toString());
                        if (matcher.find()) {
                            ipLine = matcher.group();
                        }
                        if (EmptyUtils.isEmpty(ipLine)) {
                            ipLine = getIpAddress();
                        }
                        LogI.i("getNetIp:" + ipLine);
                        if (null != callback) callback.ipAddress(ipLine);
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    if (null != callback) callback.ipAddress(null);
                } catch (IOException e) {
                    e.printStackTrace();
                    if (null != callback) callback.ipAddress(null);
                } finally {
                    try {
                        if (null != inStream)
                            inStream.close();
                        if (null != httpConnection)
                            httpConnection.disconnect();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public interface OutIpAddrCallback {
        void ipAddress(String ipAddress);
    }

    public static String getIpAddress() {
        if (isNetworkConnected(Utils.getApp())) {
            if (isWifiConnected(Utils.getApp())) {
                return getWifiIpAddress(Utils.getApp());
            } else if (isMobileConnected(Utils.getApp())) {
                return getLocalIpAddress();
            }
        }
        return null;
    }

    private static String getWifiIpAddress(Context context) {
        //获取wifi服务
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        //判断wifi是否开启
        if (!wifiManager.isWifiEnabled()) {
            wifiManager.setWifiEnabled(true);
        }
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        int ipAddress = wifiInfo.getIpAddress();
        return intToIp(ipAddress);
    }

    private static String getLocalIpAddress() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements(); ) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements(); ) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress()) {
                        return inetAddress.getHostAddress().toString();
                    }
                }
            }
        } catch (SocketException ex) {
            LogI.i("WifiPreference IpAddress:" + ex.toString());
        }
        return null;
    }

    private static String intToIp(int i) {
        return (i & 0xFF) + "." +
                ((i >> 8) & 0xFF) + "." +
                ((i >> 16) & 0xFF) + "." +
                (i >> 24 & 0xFF);
    }

    /**
     * 获取设备MAC地址
     * <p>需添加权限 {@code <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>}</p>
     * <p>需添加权限 {@code <uses-permission android:name="android.permission.INTERNET"/>}</p>
     *
     * @return MAC地址
     */
    public static String getMacAddress() {
        try {
            String macAddress = getMacAddressByWifiInfo();
            if (!"02:00:00:00:00:00".equals(macAddress)) {
                return macAddress.toUpperCase().replaceAll(":", "-");
            }
            macAddress = getMacAddressByNetworkInterface();
            if (!"02:00:00:00:00:00".equals(macAddress)) {
                return macAddress.toUpperCase().replaceAll(":", "-");
            }
            macAddress = getMacAddressByFile();
            if (!"02:00:00:00:00:00".equals(macAddress)) {
                return macAddress.toUpperCase().replaceAll(":", "-");
            }
        } catch (Exception e) {
            LogI.i(e.toString());
        }
        return "02-00-00-00-00-00";
    }

    /**
     * 获取设备MAC地址
     * <p>需添加权限 {@code <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>}</p>
     *
     * @return MAC地址
     */
    @SuppressLint("HardwareIds")
    private static String getMacAddressByWifiInfo() {
        try {
            @SuppressLint("WifiManagerLeak")
            WifiManager wifi = (WifiManager) Utils.getApp().getSystemService(Context.WIFI_SERVICE);
            if (wifi != null) {
                WifiInfo info = wifi.getConnectionInfo();
                if (info != null) return info.getMacAddress();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "02:00:00:00:00:00";
    }

    /**
     * 获取设备MAC地址
     * <p>需添加权限 {@code <uses-permission android:name="android.permission.INTERNET"/>}</p>
     *
     * @return MAC地址
     */
    private static String getMacAddressByNetworkInterface() {
        try {
            List<NetworkInterface> nis = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface ni : nis) {
                if (!ni.getName().equalsIgnoreCase("wlan0")) continue;
                byte[] macBytes = ni.getHardwareAddress();
                if (macBytes != null && macBytes.length > 0) {
                    StringBuilder res1 = new StringBuilder();
                    for (byte b : macBytes) {
                        res1.append(String.format("%02x:", b));
                    }
                    return res1.deleteCharAt(res1.length() - 1).toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "02:00:00:00:00:00";
    }

    /**
     * 获取设备MAC地址
     *
     * @return MAC地址
     */
    private static String getMacAddressByFile() {
        ShellUtils.CommandResult result = ShellUtils.execCmd("getprop wifi.interface", false);
        if (result.result == 0) {
            String name = result.successMsg;
            if (name != null) {
                result = ShellUtils.execCmd("cat /sys/class/net/" + name + "/address", false);
                if (result.result == 0) {
                    if (result.successMsg != null) {
                        return result.successMsg;
                    }
                }
            }
        }
        return "02:00:00:00:00:00";
    }

    /**
     * 获取ip端口号，暂未找到方法，以空代替
     */
    public static String getIpPort() {
//        return exec(new String[]{"netstat"});
        return "";
    }

    protected static String exec(String[] args) {
        String result = "";
        ProcessBuilder processBuilder = new ProcessBuilder(args);
        Process process = null;
        InputStream errIs = null;
        InputStream inIs = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int read ;
            process = processBuilder.start();
            errIs = process.getErrorStream();
            while ((read = errIs.read()) != -1) {
                baos.write(read);
            }
            baos.write('\n');
            inIs = process.getInputStream();
            while ((read = inIs.read()) != -1) {
                baos.write(read);
            }
            byte[] data = baos.toByteArray();
            result = new String(data);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (errIs != null) {
                    errIs.close();
                }
                if (inIs != null) {
                    inIs.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (process != null) {
                process.destroy();
            }
        }
        return result;
    }
}
