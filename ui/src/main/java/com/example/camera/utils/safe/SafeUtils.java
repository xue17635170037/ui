package com.example.camera.utils.safe;

import android.text.TextUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by laorencel on 2017/8/26.
 */

public class SafeUtils {

    public static boolean isHttpEncrypt = true;

    /**
     * 本地加密
     * @param str
     * @return
     */
    public static String encrypt(String str) {
        return AESOperator.getInstance().encrypt(str);
    }

    public static String decrypt(String str) {
        return AESOperator.getInstance().decrypt(str);
    }

    /**
     * 涉及http加密
     * @param str
     * @return
     */
    public static String encryptHttp(String str) {
        if (isHttpEncrypt)
            return AESOperator.getInstance().encrypt(str);
        else return str;
    }

    public static String decryptHttp(String str) {
        if (isHttpEncrypt)
            return AESOperator.getInstance().decrypt(str);
        else return str;
    }

    public static String getMD5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("NoSuchAlgorithmException caught!");
            System.exit(-1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte[] byteArray = messageDigest.digest();
        StringBuilder md5StrBuff = new StringBuilder();
        for (int i = 0; i < byteArray.length; i++) {
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));
            else
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
        }
        return md5StrBuff.toString().toLowerCase();
    }
}
