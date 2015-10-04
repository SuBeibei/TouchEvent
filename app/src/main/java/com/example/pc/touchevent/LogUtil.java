package com.example.pc.touchevent;

import android.util.Log;
import android.view.MotionEvent;

public class LogUtil {
    public static void log(String view, MotionEvent event, String method) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(view, "ACTION_DOWN ---> " + method);
                break;
            case MotionEvent.ACTION_MOVE:
                Log.w(view, "ACTION_MOVE ---> " + method);
                break;
            case MotionEvent.ACTION_UP:
                Log.e(view, "ACTION_UP ---> " + method);
                break;
        }
    }
}
