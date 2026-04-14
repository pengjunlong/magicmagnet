package com.google.android.material.elevation;

import android.content.Context;
import android.view.View;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = 0;
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
    }

    private boolean isThemeSurfaceColor(int i) {
    }

    public int calculateOverlayAlpha(float f) {
    }

    public float calculateOverlayAlphaFraction(float f) {
    }

    public int compositeOverlay(int i, float f, View view) {
    }

    public int compositeOverlayIfNeeded(int i, float f, View view) {
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f, View view) {
    }

    public float getParentAbsoluteElevation(View view) {
    }

    public int getThemeElevationOverlayColor() {
    }

    public int getThemeSurfaceColor() {
    }

    public boolean isThemeElevationOverlayEnabled() {
    }

    public int compositeOverlay(int i, float f) {
    }

    public int compositeOverlayIfNeeded(int i, float f) {
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f) {
    }

    public ElevationOverlayProvider(boolean z, int i, int i2, int i3, float f) {
    }
}
