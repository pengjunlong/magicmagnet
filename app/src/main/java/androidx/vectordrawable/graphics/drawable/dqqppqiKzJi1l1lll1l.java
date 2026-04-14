package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.qdqddftZvRmltIahaEHKjU1l11ll1l1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class dqqppqiKzJi1l1lll1l extends ppbdpwWWljzmXXdHNabfWhgjl111l11 implements Animatable {
    private C1979dqqppqiKzJi1l1lll1l bpdqqiQNVROMLC1ll1l1l11;
    ArrayList<androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1> dbppbdqpeLmcbs11l11;
    dpbdpqRKAscW1lll1l ddbbbeXHXx111ll;
    private Animator.AnimatorListener dqpdbEevAufTOvPphbjykClll1l11;
    private ArgbEvaluator dqpqqqbqQyjyB11111l1;
    final Drawable.Callback pbppbpqbamJRy11l1l1;
    private Context ppbdpwWWljzmXXdHNabfWhgjl111l11;

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Drawable.Callback {
        final /* synthetic */ dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 extends AnimatorListenerAdapter {
        final /* synthetic */ dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdbdpbLwkLpObyKsq1lll1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.dqqppqiKzJi1l1lll1l$dqqppqiKzJi1l1lll1l, reason: collision with other inner class name */
    private static class C1979dqqppqiKzJi1l1lll1l extends Drawable.ConstantState {
        qdqddftZvRmltIahaEHKjU1l11ll1l1<Animator, String> bpdqqiQNVROMLC1ll1l1l11;
        int dbpqdHhmDSIHIJiwc1ll1l1;
        dqpqqqbqQyjyB11111l1 dpbdbdpbLwkLpObyKsq1lll1;
        ArrayList<Animator> dpbdpqRKAscW1lll1l;
        AnimatorSet dqqppqiKzJi1l1lll1l;

        public C1979dqqppqiKzJi1l1lll1l(Context context, C1979dqqppqiKzJi1l1lll1l c1979dqqppqiKzJi1l1lll1l, Drawable.Callback callback, Resources resources) {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
        }
    }

    dqqppqiKzJi1l1lll1l() {
    }

    private void bpdqqiQNVROMLC1ll1l1l11() {
    }

    public static dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1(Context context, int i) {
    }

    public static dqqppqiKzJi1l1lll1l dpbdbdpbLwkLpObyKsq1lll1(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
    }

    private static void dpbdpqRKAscW1lll1l(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    private static boolean dqpdbEevAufTOvPphbjykClll1l11(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    private void dqpqqqbqQyjyB11111l1(Animator animator) {
    }

    private void ppbdpwWWljzmXXdHNabfWhgjl111l11(String str, Animator animator) {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
    }

    public boolean ddbbbeXHXx111ll(androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    public void dqqppqiKzJi1l1lll1l(androidx.vectordrawable.graphics.drawable.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
    }

    @Override // androidx.vectordrawable.graphics.drawable.ppbdpwWWljzmXXdHNabfWhgjl111l11, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
    }

    @Override // android.graphics.drawable.Drawable, p000.ks1
    public void setTint(int i) {
    }

    @Override // android.graphics.drawable.Drawable, p000.ks1
    public void setTintList(ColorStateList colorStateList) {
    }

    @Override // android.graphics.drawable.Drawable, p000.ks1
    public void setTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    private dqqppqiKzJi1l1lll1l(Context context) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private static class dpbdpqRKAscW1lll1l extends Drawable.ConstantState {
        private final Drawable.ConstantState dbpqdHhmDSIHIJiwc1ll1l1;

        public dpbdpqRKAscW1lll1l(Drawable.ConstantState constantState) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        }
    }

    private dqqppqiKzJi1l1lll1l(Context context, C1979dqqppqiKzJi1l1lll1l c1979dqqppqiKzJi1l1lll1l, Resources resources) {
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
    }
}
