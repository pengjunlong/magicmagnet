package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.CircularRevealWidget;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    private static final boolean DEBUG = false;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 0;
    private boolean buildingCircularRevealCache;
    private Paint debugPaint;
    private final Delegate delegate;
    private boolean hasCircularRevealCache;
    private Drawable overlayDrawable;
    private CircularRevealWidget.RevealInfo revealInfo;
    private final Paint revealPaint;
    private final Path revealPath;
    private final Paint scrimPaint;
    private final View view;

    public interface Delegate {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    public CircularRevealHelper(Delegate delegate) {
    }

    private void drawDebugCircle(Canvas canvas, int i, float f) {
    }

    private void drawDebugMode(Canvas canvas) {
    }

    private void drawOverlayDrawable(Canvas canvas) {
    }

    private float getDistanceToFurthestCorner(CircularRevealWidget.RevealInfo revealInfo) {
    }

    private void invalidateRevealInfo() {
    }

    private boolean shouldDrawCircularReveal() {
    }

    private boolean shouldDrawOverlayDrawable() {
    }

    private boolean shouldDrawScrim() {
    }

    public void buildCircularRevealCache() {
    }

    public void destroyCircularRevealCache() {
    }

    public void draw(Canvas canvas) {
    }

    public Drawable getCircularRevealOverlayDrawable() {
    }

    public int getCircularRevealScrimColor() {
    }

    public CircularRevealWidget.RevealInfo getRevealInfo() {
    }

    public boolean isOpaque() {
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
    }

    public void setCircularRevealScrimColor(int i) {
    }

    public void setRevealInfo(CircularRevealWidget.RevealInfo revealInfo) {
    }
}
