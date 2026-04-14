package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.List;
import p000.bj1;
import p000.c1;
import p000.d81;
import p000.ddpqdqbdbdJkabpBEoFWxKGuBDOl1l11l;
import p000.dpddpbpwPsgYeCcGllll1l;
import p000.e81;
import p000.pbdbpdpbdIZkvBoFmcz11ll1ll;
import p000.xv0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class dbpqdHhmDSIHIJiwc1ll1l1 extends ViewGroup {
    private static final String pdpqbmApOBCmNMwnn1ll111 = null;
    private Rect bbdbbpdOJSuInlll111l;
    private c1 bdddqmITkkeGpsxVXHR1l1llll;
    private boolean bpbbpOxqjGWQAsycX11ll1l1;
    private WindowManager bpdqqiQNVROMLC1ll1l1l11;
    private Rect bppbpdbCeZVhQNTixBml1lll11l;
    private bj1 bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private final Handler.Callback bpqdqbqpviKiORjqgp1l111l11;
    private bj1 dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private bj1 dbbpdqqpdVUhpQ1ll11;
    private d81 dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private boolean dbppbdqpeLmcbs11l11;
    private SurfaceView ddbbbeXHXx111ll;
    private final SurfaceHolder.Callback dddbpbpNqzZZJmSG1111l;
    private final ppbdpwWWljzmXXdHNabfWhgjl111l11 ddddbbdqIccDnEitQc1l1l1l;
    private int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private ddpqdqbdbdJkabpBEoFWxKGuBDOl1l11l dpbdpqRKAscW1lll1l;
    private dpddpbpwPsgYeCcGllll1l dqdqbpQposEBDyDxIyyz1ll11;
    private TextureView dqpdbEevAufTOvPphbjykClll1l11;
    private boolean dqpqqqbqQyjyB11111l1;
    private e81 pbppbpqbamJRy11l1l1;
    private Handler ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private bj1 qbddqbdJBkudFfhX1ll1l111;
    private List<ppbdpwWWljzmXXdHNabfWhgjl111l11> qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private Rect qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private double qdqdpyALEmZFGGaahRTIU1ll11;
    private xv0 qppqdpppIauLKaAtRkB11111l;

    class bpdqqiQNVROMLC1ll1l1l11 implements ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;

        bpdqqiQNVROMLC1ll1l1l11(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // com.journeyapps.barcodescanner.dbpqdHhmDSIHIJiwc1ll1l1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void bpdqqiQNVROMLC1ll1l1l11() {
        }

        @Override // com.journeyapps.barcodescanner.dbpqdHhmDSIHIJiwc1ll1l1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // com.journeyapps.barcodescanner.dbpqdHhmDSIHIJiwc1ll1l1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // com.journeyapps.barcodescanner.dbpqdHhmDSIHIJiwc1ll1l1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dpbdpqRKAscW1lll1l() {
        }

        @Override // com.journeyapps.barcodescanner.dbpqdHhmDSIHIJiwc1ll1l1.ppbdpwWWljzmXXdHNabfWhgjl111l11
        public void dqqppqiKzJi1l1lll1l(Exception exc) {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
    class TextureViewSurfaceTextureListenerC2009dbpqdHhmDSIHIJiwc1ll1l1 implements TextureView.SurfaceTextureListener {
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l;

        TextureViewSurfaceTextureListenerC2009dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements SurfaceHolder.Callback {
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    class dpbdpqRKAscW1lll1l implements d81 {
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdpqRKAscW1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
        }

        private /* synthetic */ void dqqppqiKzJi1l1lll1l() {
        }

        @Override // p000.d81
        public void dbpqdHhmDSIHIJiwc1ll1l1(int i) {
        }
    }

    class dqqppqiKzJi1l1lll1l implements Handler.Callback {
        final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    public interface ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        void bpdqqiQNVROMLC1ll1l1l11();

        void dbpqdHhmDSIHIJiwc1ll1l1();

        void dpbdbdpbLwkLpObyKsq1lll1();

        void dpbdpqRKAscW1lll1l();

        void dqqppqiKzJi1l1lll1l(Exception exc);
    }

    public dbpqdHhmDSIHIJiwc1ll1l1(Context context, AttributeSet attributeSet) {
    }

    static /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 bpdqqiQNVROMLC1ll1l1l11(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private void bpqdqbqpviKiORjqgp1l111l11() {
    }

    private void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(pbdbpdpbdIZkvBoFmcz11ll1ll pbdbpdpbdizkvbofmcz11ll1ll) {
    }

    private void dbppbdqpeLmcbs11l11() {
    }

    static /* synthetic */ bj1 dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, bj1 bj1Var) {
    }

    static /* synthetic */ List ddbbbeXHXx111ll(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private void dddbpbpNqzZZJmSG1111l() {
    }

    private void ddddbbdqIccDnEitQc1l1l1l() {
    }

    static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    static /* synthetic */ void dpbdpqRKAscW1lll1l(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, bj1 bj1Var) {
    }

    private void dqdqbpQposEBDyDxIyyz1ll11() {
    }

    static /* synthetic */ void dqpqqqbqQyjyB11111l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    static /* synthetic */ String dqqppqiKzJi1l1lll1l() {
    }

    private int getDisplayRotation() {
    }

    @TargetApi(14)
    private TextureView.SurfaceTextureListener pdpqbmApOBCmNMwnn1ll111() {
    }

    static /* synthetic */ Handler ppbdpwWWljzmXXdHNabfWhgjl111l11(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    private void qbddqbdJBkudFfhX1ll1l111(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    private void qbdpqpstJKhhKkXrsOGvbWw1l1llll(bj1 bj1Var) {
    }

    private void qdqdpyALEmZFGGaahRTIU1ll11(bj1 bj1Var) {
    }

    protected boolean bbdbbpdOJSuInlll111l() {
    }

    protected ddpqdqbdbdJkabpBEoFWxKGuBDOl1l11l bdddqmITkkeGpsxVXHR1l1llll() {
    }

    public void bpbbpOxqjGWQAsycX11ll1l1() {
    }

    public boolean bppbpdbCeZVhQNTixBml1lll11l() {
    }

    public void bpppdpppqFAXRSTHUAmVJLvH11lllll1l() {
    }

    protected void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(AttributeSet attributeSet) {
    }

    public boolean dbbpdqqpdVUhpQ1ll11() {
    }

    protected Matrix ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(bj1 bj1Var, bj1 bj1Var2) {
    }

    public void dqpdbEevAufTOvPphbjykClll1l11(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    public ddpqdqbdbdJkabpBEoFWxKGuBDOl1l11l getCameraInstance() {
    }

    public dpddpbpwPsgYeCcGllll1l getCameraSettings() {
    }

    public Rect getFramingRect() {
    }

    public bj1 getFramingRectSize() {
    }

    public double getMarginFraction() {
    }

    public Rect getPreviewFramingRect() {
    }

    public xv0 getPreviewScalingStrategy() {
    }

    public bj1 getPreviewSize() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    protected Rect pbppbpqbamJRy11l1l1(Rect rect, Rect rect2) {
    }

    public void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
    }

    protected void qppqdpppIauLKaAtRkB11111l() {
    }

    public void setCameraSettings(dpddpbpwPsgYeCcGllll1l dpddpbpwpsgyeccgllll1l) {
    }

    public void setFramingRectSize(bj1 bj1Var) {
    }

    public void setMarginFraction(double d) {
    }

    public void setPreviewScalingStrategy(xv0 xv0Var) {
    }

    public void setTorch(boolean z) {
    }

    public void setUseTextureView(boolean z) {
    }
}
