package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000.ls1;
import p000.ps1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class AppCompatImageView extends ImageView implements ls1, ps1 {
    private final bpdqqiQNVROMLC1ll1l1l11 mBackgroundTintHelper;
    private boolean mHasLevel;
    private final dqdqbpQposEBDyDxIyyz1ll11 mImageHelper;

    public AppCompatImageView(Context context) {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
    }

    @Override // p000.ls1
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // p000.ls1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    @Override // p000.ps1
    public ColorStateList getSupportImageTintList() {
    }

    @Override // p000.ps1
    public PorterDuff.Mode getSupportImageTintMode() {
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
    }

    @Override // p000.ls1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // p000.ls1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    @Override // p000.ps1
    public void setSupportImageTintList(ColorStateList colorStateList) {
    }

    @Override // p000.ps1
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
    }
}
