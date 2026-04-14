package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {
    static final float DEFAULT_OPACITY = 0.2f;
    static final int DEF_STYLE_RES = 0;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    static final int MAX_ALPHA = 255;
    static final int MAX_HIDE_DELAY = 1000;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    AnimatorDurationScaleProvider animatorDurationScaleProvider;
    private final Runnable delayedHide;
    private final Runnable delayedShow;
    private final dpbdbdpbLwkLpObyKsq1lll1 hideAnimationCallback;
    private boolean isIndeterminateModeChangeRequested;
    private boolean isParentDoneInitializing;
    private long lastShowStartTime;
    private final int minHideDelay;
    private final int showDelay;
    S spec;
    private int storedProgress;
    private boolean storedProgressAnimated;
    private final dpbdbdpbLwkLpObyKsq1lll1 switchIndeterminateModeCallback;
    private int visibilityAfterHide;

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$1 */
    class RunnableC04011 implements Runnable {
        final /* synthetic */ BaseProgressIndicator this$0;

        RunnableC04011(BaseProgressIndicator baseProgressIndicator) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$2 */
    class RunnableC04022 implements Runnable {
        final /* synthetic */ BaseProgressIndicator this$0;

        RunnableC04022(BaseProgressIndicator baseProgressIndicator) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$3 */
    class C04033 extends dpbdbdpbLwkLpObyKsq1lll1 {
        final /* synthetic */ BaseProgressIndicator this$0;

        C04033(BaseProgressIndicator baseProgressIndicator) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1
        public void onAnimationEnd(Drawable drawable) {
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$4 */
    class C04044 extends dpbdbdpbLwkLpObyKsq1lll1 {
        final /* synthetic */ BaseProgressIndicator this$0;

        C04044(BaseProgressIndicator baseProgressIndicator) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1
        public void onAnimationEnd(Drawable drawable) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HideAnimationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowAnimationBehavior {
    }

    protected BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    static /* synthetic */ void access$000(BaseProgressIndicator baseProgressIndicator) {
    }

    static /* synthetic */ void access$100(BaseProgressIndicator baseProgressIndicator) {
    }

    static /* synthetic */ long access$202(BaseProgressIndicator baseProgressIndicator, long j) {
    }

    static /* synthetic */ int access$300(BaseProgressIndicator baseProgressIndicator) {
    }

    static /* synthetic */ boolean access$400(BaseProgressIndicator baseProgressIndicator) {
    }

    static /* synthetic */ boolean access$500(BaseProgressIndicator baseProgressIndicator) {
    }

    static /* synthetic */ int access$600(BaseProgressIndicator baseProgressIndicator) {
    }

    private DrawingDelegate<S> getCurrentDrawingDelegate() {
    }

    private void internalHide() {
    }

    private void internalShow() {
    }

    private boolean isNoLongerNeedToBeVisible() {
    }

    private void registerAnimationCallbacks() {
    }

    private void unregisterAnimationCallbacks() {
    }

    protected void applyNewVisibility(boolean z) {
    }

    abstract S createSpec(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
    }

    public int getHideAnimationBehavior() {
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ Drawable getIndeterminateDrawable() {
    }

    public int[] getIndicatorColor() {
    }

    @Override // android.widget.ProgressBar
    public /* bridge */ /* synthetic */ Drawable getProgressDrawable() {
    }

    public int getShowAnimationBehavior() {
    }

    public int getTrackColor() {
    }

    public int getTrackCornerRadius() {
    }

    public int getTrackThickness() {
    }

    public void hide() {
    }

    @Override // android.view.View
    public void invalidate() {
    }

    boolean isEffectivelyVisible() {
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
    }

    public void setAnimatorDurationScaleProvider(AnimatorDurationScaleProvider animatorDurationScaleProvider) {
    }

    public void setHideAnimationBehavior(int i) {
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
    }

    public void setIndicatorColor(int... iArr) {
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
    }

    public void setProgressCompat(int i, boolean z) {
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
    }

    public void setShowAnimationBehavior(int i) {
    }

    public void setTrackColor(int i) {
    }

    public void setTrackCornerRadius(int i) {
    }

    public void setTrackThickness(int i) {
    }

    public void setVisibilityAfterHide(int i) {
    }

    public void show() {
    }

    boolean visibleToUser() {
    }

    @Override // android.widget.ProgressBar
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
    }

    @Override // android.widget.ProgressBar
    public DeterminateDrawable<S> getProgressDrawable() {
    }
}
