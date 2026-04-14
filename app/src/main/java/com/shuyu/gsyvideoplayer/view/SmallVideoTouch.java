package com.shuyu.gsyvideoplayer.view;

import android.view.MotionEvent;
import android.view.View;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SmallVideoTouch implements View.OnTouchListener {
    private int _xDelta;
    private int _yDelta;
    private int mDownX;
    private int mDownY;
    private GSYBaseVideoPlayer mGsyBaseVideoPlayer;
    private int mMarginLeft;
    private int mMarginTop;

    public SmallVideoTouch(GSYBaseVideoPlayer gSYBaseVideoPlayer, int i, int i2) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }
}
