package com.example.pc.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

public class InnerView extends TextView {

    public InnerView(Context context) {
        this(context, null);
    }

    public InnerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        LogUtil.log("InnerView", event, "dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
        //return false;
        //return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtil.log("InnerView", event, "onTouchEvent");
        return super.onTouchEvent(event);
        //return false;
        //return true;
    }
}
