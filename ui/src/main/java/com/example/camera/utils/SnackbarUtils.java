package com.example.camera.utils;

import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/3/3.
 */

public class SnackbarUtils {

    public static final int Info = 1;
    public static final int Confirm = 2;
    public static final int Warning = 3;
    public static final int Alert = 4;

    /**
     * 短显示Snackbar，自定义颜色
     *
     * @param view
     * @param message
     * @param messageColor
     * @param backgroundColor
     * @return
     */
    public static Snackbar ShortSnackbar(View view, String message, int messageColor, int backgroundColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT);
        return setSnackbarColor(snackbar, messageColor, backgroundColor);
    }

    public static Snackbar ShortSnackbar(View view, String message) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT);
        return setSnackbarMsgColor(snackbar, MaterialColor.WHITE);
    }

    /**
     * 长显示Snackbar，自定义颜色
     *
     * @param view
     * @param message
     * @param messageColor
     * @param backgroundColor
     * @return
     */
    public static Snackbar LongSnackbar(View view, String message, int messageColor, int backgroundColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        return setSnackbarColor(snackbar, messageColor, backgroundColor);
    }

    public static Snackbar LongSnackbar(View view, String message) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        return setSnackbarMsgColor(snackbar, MaterialColor.WHITE);
    }

    /**
     * 自定义时常显示Snackbar，自定义颜色
     *
     * @param view
     * @param message
     * @param messageColor
     * @param backgroundColor
     * @return
     */
    public static Snackbar IndefiniteSnackbar(View view, String message, int duration, int messageColor, int backgroundColor) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE).setDuration(duration);
        return setSnackbarColor(snackbar, messageColor, backgroundColor);
    }

    /**
     * 短显示Snackbar，可选预设类型
     *
     * @param view
     * @param message
     * @param type
     * @return
     */
    public static Snackbar ShortSnackbar(View view, String message, int type) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT);
        return switchType(snackbar, type);
    }

    /**
     * 长显示Snackbar，可选预设类型
     *
     * @param view
     * @param message
     * @param type
     * @return
     */
    public static Snackbar LongSnackbar(View view, String message, int type) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG);
        return switchType(snackbar, type);
    }

    /**
     * 自定义时常显示Snackbar，可选预设类型
     *
     * @param view
     * @param message
     * @param type
     * @return
     */
    public static Snackbar IndefiniteSnackbar(View view, String message, int duration, int type) {
        Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE).setDuration(duration);
        return switchType(snackbar, type);
    }

    //选择预设类型
    private static Snackbar switchType(Snackbar snackbar, int type) {
        switch (type) {
            case Info:
                setSnackbarBgColor(snackbar, MaterialColor.BLUE);
                break;
            case Confirm:
                setSnackbarBgColor(snackbar, MaterialColor.GREEN);
                break;
            case Warning:
                setSnackbarBgColor(snackbar, MaterialColor.ORANGE);
                break;
            case Alert:
                setSnackbarColor(snackbar, MaterialColor.YELLOW, MaterialColor.RED);
                break;
        }
        return snackbar;
    }

    /**
     * 设置Snackbar背景颜色
     *
     * @param snackbar
     * @param backgroundColor
     */
    public static Snackbar setSnackbarBgColor(Snackbar snackbar, int backgroundColor) {
        View view = snackbar.getView();
        if (view != null) {
            view.setBackgroundColor(backgroundColor);
        }
        return snackbar;
    }

    public static Snackbar setSnackbarMsgColor(Snackbar snackbar, int messageColor) {
        View view = snackbar.getView();
        if (view != null) {
            ((TextView) view.findViewById(R.id.snackbar_text)).setTextColor(messageColor);
        }
        return snackbar;
    }

    /**
     * 设置Snackbar文字和背景颜色
     *
     * @param snackbar
     * @param messageColor
     * @param backgroundColor
     */
    public static Snackbar setSnackbarColor(Snackbar snackbar, int messageColor, int backgroundColor) {
        View view = snackbar.getView();
        if (view != null) {
            view.setBackgroundColor(backgroundColor);
            ((TextView) view.findViewById(R.id.snackbar_text)).setTextColor(messageColor);
        }
        return snackbar;
    }

    /**
     * 向Snackbar中添加view
     *
     * @param snackbar
     * @param layoutId
     * @param index    新加布局在Snackbar中的位置
     */
    public static Snackbar SnackbarAddView(Snackbar snackbar, int layoutId, int index) {
        View snackbarview = snackbar.getView();
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbarview;

        View add_view = LayoutInflater.from(snackbarview.getContext()).inflate(layoutId, null);

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        p.gravity = Gravity.CENTER_VERTICAL;

        snackbarLayout.addView(add_view, index, p);
        return snackbar;
    }
}
