package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.CircularRevealHelper;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface CircularRevealWidget extends CircularRevealHelper.Delegate {

    public static class CircularRevealEvaluator implements TypeEvaluator<RevealInfo> {
        public static final TypeEvaluator<RevealInfo> CIRCULAR_REVEAL = null;
        private final RevealInfo revealInfo;

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ RevealInfo evaluate(float f, RevealInfo revealInfo, RevealInfo revealInfo2) {
        }

        /* renamed from: evaluate, reason: avoid collision after fix types in other method */
        public RevealInfo evaluate2(float f, RevealInfo revealInfo, RevealInfo revealInfo2) {
        }
    }

    public static class CircularRevealProperty extends Property<CircularRevealWidget, RevealInfo> {
        public static final Property<CircularRevealWidget, RevealInfo> CIRCULAR_REVEAL = null;

        private CircularRevealProperty(String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ RevealInfo get(CircularRevealWidget circularRevealWidget) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(CircularRevealWidget circularRevealWidget, RevealInfo revealInfo) {
        }

        /* renamed from: get, reason: avoid collision after fix types in other method */
        public RevealInfo get2(CircularRevealWidget circularRevealWidget) {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(CircularRevealWidget circularRevealWidget, RevealInfo revealInfo) {
        }
    }

    public static class CircularRevealScrimColorProperty extends Property<CircularRevealWidget, Integer> {
        public static final Property<CircularRevealWidget, Integer> CIRCULAR_REVEAL_SCRIM_COLOR = null;

        private CircularRevealScrimColorProperty(String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Integer get(CircularRevealWidget circularRevealWidget) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(CircularRevealWidget circularRevealWidget, Integer num) {
        }

        /* renamed from: get, reason: avoid collision after fix types in other method */
        public Integer get2(CircularRevealWidget circularRevealWidget) {
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(CircularRevealWidget circularRevealWidget, Integer num) {
        }
    }

    public static class RevealInfo {
        public static final float INVALID_RADIUS = Float.MAX_VALUE;
        public float centerX;
        public float centerY;
        public float radius;

        /* synthetic */ RevealInfo(C03091 c03091) {
        }

        public boolean isInvalid() {
        }

        public void set(float f, float f2, float f3) {
        }

        private RevealInfo() {
        }

        public RevealInfo(float f, float f2, float f3) {
        }

        public void set(RevealInfo revealInfo) {
        }

        public RevealInfo(RevealInfo revealInfo) {
        }
    }

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    void draw(Canvas canvas);

    Drawable getCircularRevealOverlayDrawable();

    int getCircularRevealScrimColor();

    RevealInfo getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(RevealInfo revealInfo);
}
