package com.example.camera.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

/**
 * ResourceUtils
 * Created by laorencel on 2017/8/25.
 */

public class ResourceUtils {

    public static String getString(Context context, int resId) {
        return context.getString(resId);
    }

    public static int getColor(int resId) {
        return getColor(Utils.getApp(), resId);
    }

    public static int getColor(Context context, int resId) {
        return ContextCompat.getColor(context, resId);
    }

    public static Drawable getDrawable(Context context, int resId) {
        return ContextCompat.getDrawable(context, resId);
    }
}
