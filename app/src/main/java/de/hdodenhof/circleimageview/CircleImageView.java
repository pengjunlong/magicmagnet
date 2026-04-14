package de.hdodenhof.circleimageview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CircleImageView extends ImageView {
    private static final Bitmap.Config bpbbpOxqjGWQAsycX11ll1l1 = null;
    private static final ImageView.ScaleType qppqdpppIauLKaAtRkB11111l = null;
    private float bbdbbpdOJSuInlll111l;
    private BitmapShader bdddqmITkkeGpsxVXHR1l1llll;
    private final RectF bpdqqiQNVROMLC1ll1l1l11;
    private boolean bppbpdbCeZVhQNTixBml1lll11l;
    private boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private float dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private ColorFilter dbbpdqqpdVUhpQ1ll11;
    private int dbppbdqpeLmcbs11l11;
    private final Paint ddbbbeXHXx111ll;
    private int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private final RectF dpbdpqRKAscW1lll1l;
    private int dqdqbpQposEBDyDxIyyz1ll11;
    private final Paint dqpdbEevAufTOvPphbjykClll1l11;
    private final Paint dqpqqqbqQyjyB11111l1;
    private int pbppbpqbamJRy11l1l1;
    private final Matrix ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private int qbddqbdJBkudFfhX1ll1l111;
    private Bitmap qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private boolean qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private boolean qdqdpyALEmZFGGaahRTIU1ll11;

    private class dpbdbdpbLwkLpObyKsq1lll1 extends ViewOutlineProvider {
        final /* synthetic */ CircleImageView dbpqdHhmDSIHIJiwc1ll1l1;

        private dpbdbdpbLwkLpObyKsq1lll1(CircleImageView circleImageView) {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
        }

        /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1(CircleImageView circleImageView, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
    }

    private boolean bpdqqiQNVROMLC1ll1l1l11(float f, float f2) {
    }

    static /* synthetic */ RectF dbpqdHhmDSIHIJiwc1ll1l1(CircleImageView circleImageView) {
    }

    private void ddbbbeXHXx111ll() {
    }

    private void dpbdbdpbLwkLpObyKsq1lll1() {
    }

    private Bitmap dpbdpqRKAscW1lll1l(Drawable drawable) {
    }

    private void dqpdbEevAufTOvPphbjykClll1l11() {
    }

    private void dqpqqqbqQyjyB11111l1() {
    }

    private RectF dqqppqiKzJi1l1lll1l() {
    }

    private void ppbdpwWWljzmXXdHNabfWhgjl111l11() {
    }

    public int getBorderColor() {
    }

    public int getBorderWidth() {
    }

    public int getCircleBackgroundColor() {
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
    }

    public void setBorderColor(int i) {
    }

    public void setBorderOverlay(boolean z) {
    }

    public void setBorderWidth(int i) {
    }

    public void setCircleBackgroundColor(int i) {
    }

    public void setCircleBackgroundColorResource(int i) {
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setDisableCircularTransformation(boolean z) {
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
    }
}
