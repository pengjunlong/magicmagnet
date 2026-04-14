package com.shuyu.gsyvideoplayer.utils;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class MeasureHelper {
    private int mCurrentAspectRatio;
    private int mMeasuredHeight;
    private int mMeasuredWidth;
    private final MeasureFormVideoParamsListener mParamsListener;
    private int mVideoHeight;
    private int mVideoRotationDegree;
    private int mVideoSarDen;
    private int mVideoSarNum;
    private int mVideoWidth;
    private WeakReference<View> mWeakView;

    public interface MeasureFormVideoParamsListener {
        int getCurrentVideoHeight();

        int getCurrentVideoWidth();

        int getVideoSarDen();

        int getVideoSarNum();
    }

    public MeasureHelper(View view, MeasureFormVideoParamsListener measureFormVideoParamsListener) {
    }

    public void doMeasure(int i, int i2) {
    }

    public int getMeasuredHeight() {
    }

    public int getMeasuredWidth() {
    }

    public View getView() {
    }

    public void prepareMeasure(int i, int i2, int i3) {
    }

    public void setAspectRatio(int i) {
    }

    public void setVideoRotation(int i) {
    }

    public void setVideoSampleAspectRatio(int i, int i2) {
    }

    public void setVideoSize(int i, int i2) {
    }
}
