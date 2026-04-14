package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.ui.TimeBar;
import java.util.Formatter;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DefaultTimeBar extends View implements TimeBar {
    private static final String ACCESSIBILITY_CLASS_NAME = "android.widget.SeekBar";
    public static final int BAR_GRAVITY_BOTTOM = 1;
    public static final int BAR_GRAVITY_CENTER = 0;
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    public static final int DEFAULT_BUFFERED_COLOR = -855638017;
    private static final int DEFAULT_INCREMENT_COUNT = 20;
    public static final int DEFAULT_PLAYED_AD_MARKER_COLOR = 872414976;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    public static final int DEFAULT_UNPLAYED_COLOR = 872415231;
    private static final int FINE_SCRUB_RATIO = 3;
    private static final int FINE_SCRUB_Y_THRESHOLD_DP = -50;
    private static final float HIDDEN_SCRUBBER_SCALE = 0.0f;
    private static final float SHOWN_SCRUBBER_SCALE = 1.0f;
    private static final long STOP_SCRUBBING_TIMEOUT_MS = 1000;
    private int adGroupCount;
    private long[] adGroupTimesMs;
    private final Paint adMarkerPaint;
    private final int adMarkerWidth;
    private final int barGravity;
    private final int barHeight;
    private final Rect bufferedBar;
    private final Paint bufferedPaint;
    private long bufferedPosition;
    private final float density;
    private long duration;
    private final int fineScrubYThreshold;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private int keyCountIncrement;
    private long keyTimeIncrement;
    private int lastCoarseScrubXPosition;
    private Rect lastExclusionRectangle;
    private final CopyOnWriteArraySet<TimeBar.OnScrubListener> listeners;
    private boolean[] playedAdGroups;
    private final Paint playedAdMarkerPaint;
    private final Paint playedPaint;
    private long position;
    private final Rect progressBar;
    private long scrubPosition;
    private final Rect scrubberBar;
    private final int scrubberDisabledSize;
    private final int scrubberDraggedSize;
    private final Drawable scrubberDrawable;
    private final int scrubberEnabledSize;
    private final int scrubberPadding;
    private boolean scrubberPaddingDisabled;
    private final Paint scrubberPaint;
    private float scrubberScale;
    private ValueAnimator scrubberScalingAnimator;
    private boolean scrubbing;
    private final Rect seekBounds;
    private final Runnable stopScrubbingRunnable;
    private final Point touchPosition;
    private final int touchTargetHeight;
    private final Paint unplayedPaint;

    public DefaultTimeBar(Context context) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DefaultTimeBar defaultTimeBar) {
    }

    private static int dpToPx(float f, int i) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
    }

    private void drawPlayhead(Canvas canvas) {
    }

    private void drawTimeBar(Canvas canvas) {
    }

    private long getPositionIncrement() {
    }

    private String getProgressText() {
    }

    private long getScrubberPosition() {
    }

    private boolean isInSeekBar(float f, float f2) {
    }

    private /* synthetic */ void lambda$new$0() {
    }

    private /* synthetic */ void lambda$new$1(ValueAnimator valueAnimator) {
    }

    private void positionScrubber(float f) {
    }

    private static int pxToDp(float f, int i) {
    }

    private Point resolveRelativeTouchPosition(MotionEvent motionEvent) {
    }

    private boolean scrubIncrementally(long j) {
    }

    private boolean setDrawableLayoutDirection(Drawable drawable) {
    }

    private void setSystemGestureExclusionRectsV29(int i, int i2) {
    }

    private void startScrubbing(long j) {
    }

    private void stopScrubbing(boolean z) {
    }

    private void update() {
    }

    private void updateDrawableState() {
    }

    private void updateScrubbing(long j) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void addListener(TimeBar.OnScrubListener onScrubListener) {
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public long getPreferredUpdateDelay() {
    }

    public void hideScrubber(boolean z) {
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void removeListener(TimeBar.OnScrubListener onScrubListener) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i) {
    }

    public void setAdMarkerColor(int i) {
    }

    public void setBufferedColor(int i) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setBufferedPosition(long j) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setDuration(long j) {
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.TimeBar
    public void setEnabled(boolean z) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyCountIncrement(int i) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyTimeIncrement(long j) {
    }

    public void setPlayedAdMarkerColor(int i) {
    }

    public void setPlayedColor(int i) {
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setPosition(long j) {
    }

    public void setScrubberColor(int i) {
    }

    public void setUnplayedColor(int i) {
    }

    public void showScrubber() {
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
    }

    private static boolean setDrawableLayoutDirection(Drawable drawable, int i) {
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
    }

    public void hideScrubber(long j) {
    }

    public void showScrubber(long j) {
    }
}
