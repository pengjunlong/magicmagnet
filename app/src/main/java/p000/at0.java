package p000;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class at0 implements View.OnTouchListener, View.OnLayoutChangeListener {
    private static float bdpdqYMMfHmzHyUIbllllll1 = 1.75f;
    private static float ppdqqzXJzQiU11ll11 = 1.0f;
    private static int qqbqbddiRRgLpniPxlUfQzP1l1l1l = 200;
    private static int qqdbbfmUWwoYYpfYHJZdaUO1111llll = 1;
    private static float qqpbppebHUxqEmlGoAJWl1lll = 3.0f;
    private final float[] bbdbbpdOJSuInlll111l;
    private final Matrix bdddqmITkkeGpsxVXHR1l1llll;
    private un0 bpbbpOxqjGWQAsycX11ll1l1;
    private int bpdqqiQNVROMLC1ll1l1l11;
    private qn0 bppbpdbCeZVhQNTixBml1lll11l;
    private mo0 bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private boolean bpppqdQjfPiCT111111111;
    private float bpqbbqTOKdRXac1ll1l1lll;
    private lo0 bpqdqbqpviKiORjqgp1l111l11;
    private final RectF dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private nn0 dbbpdqqpdVUhpQ1ll11;
    private ppbdpwWWljzmXXdHNabfWhgjl111l11 dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private boolean dbppbdqpeLmcbs11l11;
    private float ddbbbeXHXx111ll;
    private xn0 dddbpbpNqzZZJmSG1111l;
    private int ddddbbdqIccDnEitQc1l1l1l;
    private GestureDetector ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private Interpolator dpbdpqRKAscW1lll1l;
    private final Matrix dqdqbpQposEBDyDxIyyz1ll11;
    private boolean dqpdbEevAufTOvPphbjykClll1l11;
    private float dqpqqqbqQyjyB11111l1;
    private jn0 dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private ImageView pbppbpqbamJRy11l1l1;
    private int pdpqbmApOBCmNMwnn1ll111;
    private float ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private final Matrix qbddqbdJBkudFfhX1ll1l111;
    private pdbdpbsxoacXEffWudypIcll1l11 qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private pn0 qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private ImageView.ScaleType qbpbddbpyaPAbpThgWCvm11l11l1;
    private View.OnClickListener qdqdpyALEmZFGGaahRTIU1ll11;
    private View.OnLongClickListener qppqdpppIauLKaAtRkB11111l;

    private class bpdqqiQNVROMLC1ll1l1l11 implements Runnable {
        private final float bpdqqiQNVROMLC1ll1l1l11;
        private final float ddbbbeXHXx111ll;
        private final float dpbdpqRKAscW1lll1l;
        final /* synthetic */ at0 dqpdbEevAufTOvPphbjykClll1l11;
        private final float dqpqqqbqQyjyB11111l1;
        private final long ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public bpdqqiQNVROMLC1ll1l1l11(at0 at0Var, float f, float f2, float f3, float f4) {
        }

        private float dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements jn0 {
        final /* synthetic */ at0 dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(at0 at0Var) {
        }

        @Override // p000.jn0
        public void dbpqdHhmDSIHIJiwc1ll1l1(float f, float f2) {
        }

        @Override // p000.jn0
        public void dpbdbdpbLwkLpObyKsq1lll1(float f, float f2, float f3) {
        }

        @Override // p000.jn0
        public void dqqppqiKzJi1l1lll1l(float f, float f2, float f3, float f4) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 extends GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ at0 dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(at0 at0Var) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }
    }

    static /* synthetic */ class dpbdpqRKAscW1lll1l {
        static final /* synthetic */ int[] dbpqdHhmDSIHIJiwc1ll1l1 = null;
    }

    class dqqppqiKzJi1l1lll1l implements GestureDetector.OnDoubleTapListener {
        final /* synthetic */ at0 dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(at0 at0Var) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    private class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements Runnable {
        private int bpdqqiQNVROMLC1ll1l1l11;
        private final OverScroller dpbdpqRKAscW1lll1l;
        final /* synthetic */ at0 dqpqqqbqQyjyB11111l1;
        private int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(at0 at0Var, Context context) {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(int i, int i2, int i3, int i4) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public at0(ImageView imageView) {
    }

    static /* synthetic */ Interpolator bbdbbpdOJSuInlll111l(at0 at0Var) {
    }

    static /* synthetic */ qn0 bdddqmITkkeGpsxVXHR1l1llll(at0 at0Var) {
    }

    private void bdqbblVddTYAmqrWwacZmi111ll1(Matrix matrix) {
    }

    static /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 bpbbpOxqjGWQAsycX11ll1l1(at0 at0Var) {
    }

    private float bpdddqbpEtpkwNYukGjjNs1l111(Matrix matrix, int i) {
    }

    static /* synthetic */ float bpdqqiQNVROMLC1ll1l1l11(at0 at0Var) {
    }

    static /* synthetic */ ImageView bppbpdbCeZVhQNTixBml1lll11l(at0 at0Var) {
    }

    static /* synthetic */ boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l(at0 at0Var) {
    }

    private Matrix bpppqdQjfPiCT111111111() {
    }

    private void bpqbbpqpqkDmeOUxxUylkHyYgWv11111() {
    }

    private RectF bpqbbqTOKdRXac1ll1l1lll(Matrix matrix) {
    }

    private void bpqdqbqpviKiORjqgp1l111l11() {
    }

    static /* synthetic */ int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(at0 at0Var) {
    }

    static /* synthetic */ void dbbpdqqpdVUhpQ1ll11(at0 at0Var) {
    }

    private void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1() {
    }

    static /* synthetic */ int dbppbdqpeLmcbs11l11() {
    }

    static /* synthetic */ pdbdpbsxoacXEffWudypIcll1l11 dbpqdHhmDSIHIJiwc1ll1l1(at0 at0Var) {
    }

    static /* synthetic */ xn0 ddbbbeXHXx111ll(at0 at0Var) {
    }

    static /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 dddbpbpNqzZZJmSG1111l(at0 at0Var, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    private boolean ddddbbdqIccDnEitQc1l1l1l() {
    }

    static /* synthetic */ mo0 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(at0 at0Var) {
    }

    static /* synthetic */ lo0 dpbdbdpbLwkLpObyKsq1lll1(at0 at0Var) {
    }

    static /* synthetic */ int dpbdpqRKAscW1lll1l(at0 at0Var, ImageView imageView) {
    }

    static /* synthetic */ pn0 dqdqbpQposEBDyDxIyyz1ll11(at0 at0Var) {
    }

    static /* synthetic */ float dqpdbEevAufTOvPphbjykClll1l11() {
    }

    static /* synthetic */ View.OnLongClickListener dqpqqqbqQyjyB11111l1(at0 at0Var) {
    }

    private int dqqpbqaYiRPLeqRCYteXfDW1l111l11l(ImageView imageView) {
    }

    static /* synthetic */ int dqqppqiKzJi1l1lll1l(at0 at0Var, ImageView imageView) {
    }

    static /* synthetic */ View.OnClickListener pbppbpqbamJRy11l1l1(at0 at0Var) {
    }

    static /* synthetic */ un0 ppbdpwWWljzmXXdHNabfWhgjl111l11(at0 at0Var) {
    }

    static /* synthetic */ jn0 qbddqbdJBkudFfhX1ll1l111(at0 at0Var) {
    }

    static /* synthetic */ Matrix qbdpqpstJKhhKkXrsOGvbWw1l1llll(at0 at0Var) {
    }

    static /* synthetic */ boolean qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(at0 at0Var) {
    }

    static /* synthetic */ int qdqdpyALEmZFGGaahRTIU1ll11(at0 at0Var) {
    }

    private void qpdbbbbbmKdyKHlllllll1(Drawable drawable) {
    }

    static /* synthetic */ int qppqdpppIauLKaAtRkB11111l(at0 at0Var) {
    }

    private int qqpbppebHUxqEmlGoAJWl1lll(ImageView imageView) {
    }

    public void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(View.OnLongClickListener onLongClickListener) {
    }

    public float bdpdqYMMfHmzHyUIbllllll1() {
    }

    public void bdqpqbqbgFttbl1ll1l(float f) {
    }

    public void bpbbpbppqsLrtEPjeDMEnOv1l1l1(qn0 qn0Var) {
    }

    public void bpbqbqdqqjASPQfJSXuVkkgll1lll1ll(float f) {
    }

    public void bppqdpqbpvFfYvVMQwal1l1l1(int i) {
    }

    public void bpqpbicsQtfVpOtr11l1l(float f) {
    }

    public void bqdbpBvxFUC1lll11(un0 un0Var) {
    }

    public void bqdppdGFpODiqhzhhiaXKl11l1(float f) {
    }

    public void ddppqbqqbIhInevqvPYIBnGmBIE111lll(mo0 mo0Var) {
    }

    public ImageView.ScaleType dpbdqAKWNZAIXLyehU1lll1lll1() {
    }

    public void dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1(float f, boolean z) {
    }

    public void dqbbdddqpLERmaRLiHiDpL1l1l1l(boolean z) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    public void pbdbqZLBIrMLYk1l11l1ll1(pn0 pn0Var) {
    }

    public void pbddqdbpoVvTyZPOoYl1111(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
    }

    public RectF pdpqbmApOBCmNMwnn1ll111() {
    }

    public void pdpqqbqbpFAaViLnU1l1ll11l1(float f, float f2, float f3, boolean z) {
    }

    public void pdqdddDNpMbeVT11ll11(lo0 lo0Var) {
    }

    public void ppbddpbbYwysRtaAnAwzNYP11l11111l(boolean z) {
    }

    public float ppdqqzXJzQiU11ll11() {
    }

    public void ppppqdfPOyVswFHMTylxLClll1l1111(View.OnClickListener onClickListener) {
    }

    public void pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l(xn0 xn0Var) {
    }

    public void qbdbqqdbJdTsszXtJeXGasJIiGllll1l(float f) {
    }

    public void qbpbbZWTnlDkwOgZlllll(float f) {
    }

    public Matrix qbpbddbpyaPAbpThgWCvm11l11l1() {
    }

    public void qbqdqqqqdvTduGNll111l1(ImageView.ScaleType scaleType) {
    }

    public void qddbbpxsbNjqxvn111ll(nn0 nn0Var) {
    }

    public void qpbqqHZCUeoATyA11ll1l1() {
    }

    public float qqbqbddiRRgLpniPxlUfQzP1l1l1l() {
    }

    public float qqdbbfmUWwoYYpfYHJZdaUO1111llll() {
    }
}
