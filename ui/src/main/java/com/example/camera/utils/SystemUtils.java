package com.example.camera.utils;

import android.Manifest;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.annotation.RequiresPermission;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;

import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;

/**
 * Created by laorencel on 2017/9/14.
 */
public class SystemUtils {

    /**
     * @return 获取手机序列号
     */
    public static String getSerialNumber(Context context) {
        String serial = null;
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            return null;
        }
        try {
            Class<?> c = Class.forName("android.os.SystemProperties");
            Method get = c.getMethod("get", String.class);
            serial = (String) get.invoke(c, "ro.serialno");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serial;
    }

    /**
     * * 获取版本号
     * * @return 当前应用的版本号
     */
    @RequiresPermission(value = Manifest.permission.READ_PHONE_STATE)
    public static String getVersion() {
        PackageManager manager = Utils.getApp().getPackageManager();
        PackageInfo info;
        try {
            info = manager.getPackageInfo(Utils.getApp().getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
        return info.versionName;
    }

    /**
     * 获取手机IMEI(需要“android.permission.READ_PHONE_STATE”权限)
     *
     * @return 手机IMEI
     */
//    @RequiresPermission(value = Manifest.permission.READ_PHONE_STATE)
    public static String getIMEI() {
        TelephonyManager tm = (TelephonyManager) Utils.getApp().getSystemService(Activity.TELEPHONY_SERVICE);
        if (tm != null) {
            String arg = tm.getDeviceId();
            return arg != null ? arg : "";
        }
        return "";
    }

    /**
     * 获取手机IMSI(需要“android.permission.READ_PHONE_STATE”权限)
     *
     * @param
     * @return
     */
//    @RequiresPermission(value = Manifest.permission.READ_PHONE_STATE)
    public static String getIMSI() {
        TelephonyManager tm = (TelephonyManager) Utils.getApp().getSystemService(Activity.TELEPHONY_SERVICE);
        if (tm != null) {
            String arg = tm.getSubscriberId();
            return arg != null ? arg : "";
        }
        return "";
    }

    /**
     * 获取UUID
     *
     * @return
     */
    @RequiresPermission(value = Manifest.permission.READ_PHONE_STATE)
    public static String getUuid() {
        TelephonyManager tm = (TelephonyManager) Utils.getApp().getSystemService(Context.TELEPHONY_SERVICE);
        String tmDevice, tmSerial, androidId;
        tmDevice = tm.getDeviceId().toString();
        tmSerial = "ANDROID_ID";
        androidId = android.provider.Settings.Secure.getString(Utils.getApp().getContentResolver(), android.provider.Settings.Secure.ANDROID_ID).toString();
        UUID deviceUuid = new UUID(androidId.hashCode(), ((long) tmDevice.hashCode() << 32) | tmSerial.hashCode());
        String uniqueId = deviceUuid.toString();
        return uniqueId;
    }

    /**
     * 获取机型
     */
    @RequiresPermission(value = Manifest.permission.READ_PHONE_STATE)
    private static String getdevice() {
        String s = android.os.Build.MODEL;
        String t = s.replaceAll(" ", "");
        return t;
    }

    /**
     * 判断本应用是否存活
     * 如果需要判断本应用是否在后台还是前台用getRunningTask
     * */
    public static boolean isAPPALive(Context mContext,String packageName){
        boolean isAPPRunning = false;
        // 获取activity管理对象
        ActivityManager activityManager = (ActivityManager) mContext.getSystemService(Context.ACTIVITY_SERVICE);
        // 获取所有正在运行的app
        List<ActivityManager.RunningAppProcessInfo> appProcessInfoList = activityManager.getRunningAppProcesses();
        // 遍历，进程名即包名
        for(ActivityManager.RunningAppProcessInfo appInfo : appProcessInfoList){
            if(packageName.equals(appInfo.processName)){
                isAPPRunning = true;
                break;
            }
        }
        return isAPPRunning;
    }
}
