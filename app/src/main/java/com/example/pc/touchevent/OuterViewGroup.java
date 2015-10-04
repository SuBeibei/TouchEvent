package com.example.pc.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class OuterViewGroup extends RelativeLayout {

    public OuterViewGroup(Context context) {
        this(context, null);
    }

    public OuterViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        LogUtil.log("OuterViewGroup", event, "dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
        //return false;
        //return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        LogUtil.log("OuterViewGroup", event, "onInterceptTouchEvent");
        return super.onInterceptTouchEvent(event);
        //return false;
        //return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtil.log("OuterViewGroup", event, "onTouchEvent");
        return super.onTouchEvent(event);
        //return false;
        //return true;
    }
}
