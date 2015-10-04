package com.example.pc.touchevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        LogUtil.log("MainActivity", event, "dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
        //return false;
        //return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        LogUtil.log("MainActivity", event, "onTouchEvent");
        return super.onTouchEvent(event);
        //return false;
        //return true;
    }
}
