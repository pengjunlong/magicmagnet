package com.wang.avi;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.wang.avi.indicators.BallPulseIndicator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AVLoadingIndicatorView extends View {
    private static final BallPulseIndicator DEFAULT_INDICATOR = null;
    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private static final String TAG = "AVLoadingIndicatorView";
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    private boolean mDismissed;
    private Indicator mIndicator;
    private int mIndicatorColor;
    int mMaxHeight;
    int mMaxWidth;
    int mMinHeight;
    int mMinWidth;
    private boolean mPostedHide;
    private boolean mPostedShow;
    private boolean mShouldStartAnimationDrawable;
    private long mStartTime;

    /* renamed from: com.wang.avi.AVLoadingIndicatorView$1 */
    class RunnableC16601 implements Runnable {
        final /* synthetic */ AVLoadingIndicatorView this$0;

        RunnableC16601(AVLoadingIndicatorView aVLoadingIndicatorView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.wang.avi.AVLoadingIndicatorView$2 */
    class RunnableC16612 implements Runnable {
        final /* synthetic */ AVLoadingIndicatorView this$0;

        RunnableC16612(AVLoadingIndicatorView aVLoadingIndicatorView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public AVLoadingIndicatorView(Context context) {
    }

    static /* synthetic */ boolean access$002(AVLoadingIndicatorView aVLoadingIndicatorView, boolean z) {
    }

    static /* synthetic */ long access$102(AVLoadingIndicatorView aVLoadingIndicatorView, long j) {
    }

    static /* synthetic */ boolean access$202(AVLoadingIndicatorView aVLoadingIndicatorView, boolean z) {
    }

    static /* synthetic */ boolean access$300(AVLoadingIndicatorView aVLoadingIndicatorView) {
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    private void removeCallbacks() {
    }

    private void updateDrawableBounds(int i, int i2) {
    }

    private void updateDrawableState() {
    }

    void drawTrack(Canvas canvas) {
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
    }

    public Indicator getIndicator() {
    }

    public void hide() {
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.view.View
    protected synchronized void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected synchronized void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
    }

    public void setIndicator(Indicator indicator) {
    }

    public void setIndicatorColor(int i) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public void show() {
    }

    public void smoothToHide() {
    }

    public void smoothToShow() {
    }

    void startAnimation() {
    }

    void stopAnimation() {
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
    }

    public void setIndicator(String str) {
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i) {
    }

    @TargetApi(21)
    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
    }
}
