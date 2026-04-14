package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialSwitch extends SwitchCompat {
    private static final int DEF_STYLE_RES = 0;
    private static final int[] STATE_SET_WITH_ICON = null;
    private int[] currentStateChecked;
    private int[] currentStateUnchecked;
    private Drawable thumbDrawable;
    private Drawable thumbIconDrawable;
    private ColorStateList thumbIconTintList;
    private PorterDuff.Mode thumbIconTintMode;
    private ColorStateList thumbTintList;
    private Drawable trackDecorationDrawable;
    private ColorStateList trackDecorationTintList;
    private PorterDuff.Mode trackDecorationTintMode;
    private Drawable trackDrawable;
    private ColorStateList trackTintList;

    public MaterialSwitch(Context context) {
    }

    private void refreshThumbDrawable() {
    }

    private void refreshTrackDrawable() {
    }

    private static void setInterpolatedDrawableTintIfPossible(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
    }

    private void updateDrawableTints() {
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
    }

    public Drawable getThumbIconDrawable() {
    }

    public ColorStateList getThumbIconTintList() {
    }

    public PorterDuff.Mode getThumbIconTintMode() {
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
    }

    public Drawable getTrackDecorationDrawable() {
    }

    public ColorStateList getTrackDecorationTintList() {
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
    }

    @Override // android.view.View
    public void invalidate() {
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
    }

    public void setThumbIconDrawable(Drawable drawable) {
    }

    public void setThumbIconResource(int i) {
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
    }

    public void setTrackDecorationResource(int i) {
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
    }
}
