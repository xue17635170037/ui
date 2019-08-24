package com.example.camera.utils.safe;

import android.app.Activity;

import com.example.camera.utils.log.LogI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by Administrator on 2017/7/18.
 */

public class ProtectUtils {

    public static boolean checkAppChanged(Activity activity, Long dexCrc, String sha1) {
        boolean changed = false;
        if (classDexCrcChanged(activity, dexCrc)) {
            changed = true;
        }
        if (sha1Changed(activity, sha1)) {
            changed = true;
        }
        return changed;
    }

    /**
     * 监测代码是否改动
     *
     * @param activity
     */
    public static boolean classDexCrcChanged(Activity activity, Long dexCrc) {
        try {
            String apkPath = activity.getPackageCodePath();
//            Long dexCrc = Long.parseLong(activity.getString(R.string.classesdex_crc));

            ZipFile zipfile = new ZipFile(apkPath);
            ZipEntry dexentry = zipfile.getEntry("classes.dex");

            LogI.i("classes.dexcrc:" + dexentry.getCrc() + "");
            if (dexentry.getCrc() != dexCrc ) {
                LogI.i("Dexhas been modified!");
                return true;
            } else {
                LogI.i("Dex hasn't been modified!");
                return false;
            }
        } catch (NumberFormatException e) {
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean sha1Changed(Activity activity, String sha1) {
        String apkPath = activity.getPackageCodePath();
        MessageDigest msgDigest = null;
        try {
            msgDigest = MessageDigest.getInstance("SHA-1");
            byte[] bytes = new byte[1024];
            int byteCount;
            FileInputStream fis = new FileInputStream(new File(apkPath));
            while ((byteCount = fis.read(bytes)) > 0) {
                msgDigest.update(bytes, 0, byteCount);
            }

            BigInteger bi = new BigInteger(1, msgDigest.digest());
            String sha1Local = bi.toString(16);
            LogI.i("sha1:" + SafeUtils.encryptHttp(sha1Local));
            fis.close();
            //这里添加从服务器中获取哈希值然后进行对比校验
            if (!sha1Local.equalsIgnoreCase(SafeUtils.decryptHttp(sha1))) {
                LogI.i("Sha1 been modified!");
                return true;
            } else {
                LogI.i("Sha1 hasn't been modified!");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }


}
