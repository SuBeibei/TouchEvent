package com.example.pc.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class MiddleViewGroup extends RelativeLayout {

    public MiddleViewGroup(Context context) {
        this(context, null);
    }

    public MiddleViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        LogUtil.log("MiddleViewGroup", event, "dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
        //return false;
        //return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        LogUtil.log("MiddleViewGroup", event, "onInterceptTouchEvent");
        return super.onInterceptTouchEvent(event);
        //return false;
        //return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtil.log("MiddleViewGroup", event, "onTouchEvent");
        return super.onTouchEvent(event);
        //return false;
        //return true;
    }
}
