package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class dqpdbEevAufTOvPphbjykClll1l11 extends RecyclerView.dddbpbpNqzZZJmSG1111l {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    protected final DecelerateInterpolator mDecelerateInterpolator;
    private final DisplayMetrics mDisplayMetrics;
    private boolean mHasCalculatedMillisPerPixel;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final LinearInterpolator mLinearInterpolator;
    private float mMillisPerPixel;

    @SuppressLint({"UnknownNullness"})
    protected PointF mTargetVector;

    @SuppressLint({"UnknownNullness"})
    public dqpdbEevAufTOvPphbjykClll1l11(Context context) {
    }

    private int clampApplyScroll(int i, int i2) {
    }

    private float getSpeedPerPixel() {
    }

    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDxToMakeVisible(View view, int i) {
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDyToMakeVisible(View view, int i) {
    }

    @SuppressLint({"UnknownNullness"})
    protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
    }

    protected int calculateTimeForDeceleration(int i) {
    }

    protected int calculateTimeForScrolling(int i) {
    }

    protected int getHorizontalSnapPreference() {
    }

    protected int getVerticalSnapPreference() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dddbpbpNqzZZJmSG1111l
    @SuppressLint({"UnknownNullness"})
    protected void onSeekTargetStep(int i, int i2, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, RecyclerView.dddbpbpNqzZZJmSG1111l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dddbpbpNqzZZJmSG1111l
    protected void onStart() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dddbpbpNqzZZJmSG1111l
    protected void onStop() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dddbpbpNqzZZJmSG1111l
    @SuppressLint({"UnknownNullness"})
    protected void onTargetFound(View view, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, RecyclerView.dddbpbpNqzZZJmSG1111l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    @SuppressLint({"UnknownNullness"})
    protected void updateActionForInterimTarget(RecyclerView.dddbpbpNqzZZJmSG1111l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }
}
