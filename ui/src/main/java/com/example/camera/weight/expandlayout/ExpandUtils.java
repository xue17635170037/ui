package com.example.camera.weight.expandlayout;

import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;

/**
 * Created by SilenceDut on 16/8/21.
 */

class ExpandUtils {

     static ExpandScrolledParent getScrolledParent (ViewGroup child) {

        ViewParent parent= child.getParent();
        int childBetweenParentCount =0;
        while (parent!=null){
            if((parent instanceof RecyclerView || parent instanceof AbsListView)) {
                ExpandScrolledParent expandScrolledParent = new ExpandScrolledParent();
                expandScrolledParent.scrolledView = (ViewGroup)parent;
                expandScrolledParent.childBetweenParentCount =childBetweenParentCount;
                return expandScrolledParent;
            }
            childBetweenParentCount++;
            parent = parent.getParent();
        }
        return null;
    }

    static ValueAnimator createParentAnimator(final View parent, int distance , long duration) {

        ValueAnimator parentAnimator = ValueAnimator.ofInt(0,distance);

        parentAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            int lastDy;
            int dy;
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                dy = (int)animation.getAnimatedValue()-lastDy;
                lastDy = (int)animation.getAnimatedValue();
                parent.scrollBy(0,dy);
            }
        });
        parentAnimator.setDuration(duration);

        return  parentAnimator;
    }




}
