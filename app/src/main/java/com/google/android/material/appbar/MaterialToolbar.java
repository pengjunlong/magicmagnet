package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialToolbar extends Toolbar {
    private static final int DEF_STYLE_RES = 0;
    private static final ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = null;
    private Boolean logoAdjustViewBounds;
    private ImageView.ScaleType logoScaleType;
    private Integer navigationIconTint;
    private boolean subtitleCentered;
    private boolean titleCentered;

    public MaterialToolbar(Context context) {
    }

    private Pair<Integer, Integer> calculateTitleBoundLimits(TextView textView, TextView textView2) {
    }

    private void initBackground(Context context) {
    }

    private void layoutTitleCenteredHorizontally(View view, Pair<Integer, Integer> pair) {
    }

    private void maybeCenterTitleViews() {
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
    }

    private void updateLogoImageView() {
    }

    public void clearNavigationIconTint() {
    }

    public ImageView.ScaleType getLogoScaleType() {
    }

    public Integer getNavigationIconTint() {
    }

    public boolean isLogoAdjustViewBounds() {
    }

    public boolean isSubtitleCentered() {
    }

    public boolean isTitleCentered() {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setElevation(float f) {
    }

    public void setLogoAdjustViewBounds(boolean z) {
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
    }

    public void setNavigationIconTint(int i) {
    }

    public void setSubtitleCentered(boolean z) {
    }

    public void setTitleCentered(boolean z) {
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
    }
}
