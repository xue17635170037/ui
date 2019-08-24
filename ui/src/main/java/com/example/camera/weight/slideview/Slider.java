package com.example.camera.weight.slideview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class Slider extends android.support.v7.widget.AppCompatSeekBar {

    private static final long REPEAT_TIME = 3000;
    private Drawable thumb;
    private SlideView.OnSlideCompleteListener listener;
    private SlideView slideView;
    private int slideCompletePercent = 70;
    private long lastTime;

    public Slider(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setThumb(Drawable thumb) {
        this.thumb = thumb;
        super.setThumb(thumb);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            if (thumb.getBounds().contains((int) event.getX(), (int) event.getY())) {
                // This fixes an issue where the parent view (e.g ScrollView) receives
                // touch events along with the SlideView
                getParent().requestDisallowInterceptTouchEvent(true);
                super.onTouchEvent(event);
            } else {
                return false;
            }
        } else if (event.getAction() == MotionEvent.ACTION_UP) {


            if (getProgress() > slideCompletePercent) {
                if (System.currentTimeMillis() - lastTime > REPEAT_TIME) {
                    if (listener != null) listener.onSlideComplete(slideView);
                }
                if (slideView != null) {
                    if (slideView.isReset()) {
                        setProgress(0);
                    } else {
                        setProgress(100);
                        setEnabled(false);
                    }
                } else {
                    setProgress(0);
                }
            } else {
                setProgress(0);
            }

            getParent().requestDisallowInterceptTouchEvent(false);

        } else
            super.onTouchEvent(event);

        return true;
    }

    void setOnSlideCompleteListenerInternal(SlideView.OnSlideCompleteListener listener, SlideView slideView) {
        this.listener = listener;
        this.slideView = slideView;
        if (slideView != null) slideCompletePercent = slideView.getSlideCompletePercent();
    }

    @Override
    public Drawable getThumb() {
        // getThumb method was added in SDK16 but our minSDK is 14
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            return super.getThumb();
        } else {
            return thumb;
        }
    }
}
