package com.mikepenz.materialdrawer.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class BezelImageView extends ImageView {
    private boolean bbdbbpdOJSuInlll111l;
    private boolean bdddqmITkkeGpsxVXHR1l1llll;
    private Paint bpdqqiQNVROMLC1ll1l1l11;
    private int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private boolean dbbpdqqpdVUhpQ1ll11;
    private ColorMatrixColorFilter dbppbdqpeLmcbs11l11;
    private Drawable ddbbbeXHXx111ll;
    private int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private Paint dpbdpqRKAscW1lll1l;
    private Bitmap dqdqbpQposEBDyDxIyyz1ll11;
    private boolean dqpdbEevAufTOvPphbjykClll1l11;
    private RectF dqpqqqbqQyjyB11111l1;
    private int pbppbpqbamJRy11l1l1;
    private Rect ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private int qbddqbdJBkudFfhX1ll1l111;
    private ColorFilter qbdpqpstJKhhKkXrsOGvbWw1l1llll;

    @TargetApi(21)
    private class dbpqdHhmDSIHIJiwc1ll1l1 extends ViewOutlineProvider {
        int dbpqdHhmDSIHIJiwc1ll1l1;
        int dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ BezelImageView dqqppqiKzJi1l1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(BezelImageView bezelImageView, int i, int i2) {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
        }
    }

    public BezelImageView(Context context, AttributeSet attributeSet) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
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

    public void setSelectorColor(int i) {
    }

    @Override // android.widget.ImageView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
    }

    public BezelImageView(Context context, AttributeSet attributeSet, int i) {
    }
}
