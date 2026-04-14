package com.arlib.floatingsearchview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.arlib.floatingsearchview.util.view.MenuView;
import com.arlib.floatingsearchview.util.view.SearchInputView;
import java.util.List;
import p000.ck;
import p000.cr1;
import p000.d4;
import p000.mn0;
import p000.r22;
import p000.s22;
import p000.xb1;
import p000.yb1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class FloatingSearchView extends FrameLayout {
    private static final String qpbqqHZCUeoATyA11ll1l1 = null;
    private static final Interpolator qpdbbbbbmKdyKHlllllll1 = null;
    private boolean bbdbbpdOJSuInlll111l;
    private RelativeLayout bddbppbdHQMVgPvQSDhmnXZYkDh1ll111;
    private SearchInputView bdddqmITkkeGpsxVXHR1l1llll;
    private MenuView bdpdqYMMfHmzHyUIbllllll1;
    private int bdqbblVddTYAmqrWwacZmi111ll1;
    private boolean bdqpqbqbgFttbl1ll1l;
    private dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 bpbbpOxqjGWQAsycX11ll1l1;
    private int bpbbpbppqsLrtEPjeDMEnOv1l1l1;
    private View.OnClickListener bpbqbqdqqjASPQfJSXuVkkgll1lll1ll;
    private ImageView bpdddqbpEtpkwNYukGjjNs1l111;
    private View bpdqqiQNVROMLC1ll1l1l11;
    private int bppbpdbCeZVhQNTixBml1lll11l;
    private String bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private int bpppqdQjfPiCT111111111;
    private bpppqdQjfPiCT111111111 bppqdpqbpvFfYvVMQwal1l1l1;
    private int bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
    int bpqbbqTOKdRXac1ll1l1lll;
    private ProgressBar bpqdqbqpviKiORjqgp1l111l11;
    private boolean bpqpbicsQtfVpOtr11l1l;
    private int bqdbpBvxFUC1lll11;
    private boolean bqdppdGFpODiqhzhhiaXKl11l1;
    private String dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private int dbbpdqqpdVUhpQ1ll11;
    private d4 dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private dddbpbpNqzZZJmSG1111l dbppbdqpeLmcbs11l11;
    private boolean ddbbbeXHXx111ll;
    private bpqdqbqpviKiORjqgp1l111l11 dddbpbpNqzZZJmSG1111l;
    private Drawable ddddbbdqIccDnEitQc1l1l1l;
    private int ddppqbqqbIhInevqvPYIBnGmBIE111lll;
    private CardView ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private Activity dpbdpqRKAscW1lll1l;
    private ddddbbdqIccDnEitQc1l1l1l dpbdqAKWNZAIXLyehU1lll1lll1;
    private long dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1;
    private Drawable dqbbdddqpLERmaRLiHiDpL1l1l1l;
    private int dqdqbpQposEBDyDxIyyz1ll11;
    private boolean dqpdbEevAufTOvPphbjykClll1l11;
    private boolean dqpqqqbqQyjyB11111l1;
    private boolean dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private RecyclerView pbdbqZLBIrMLYk1l11l1ll1;
    private int pbddqdbpoVvTyZPOoYl1111;
    private boolean pbppbpqbamJRy11l1l1;
    private Drawable pdpqbmApOBCmNMwnn1ll111;
    private qbpbddbpyaPAbpThgWCvm11l11l1 pdpqqbqbpFAaViLnU1l1ll11l1;
    private yb1.dqqppqiKzJi1l1lll1l pdqdddDNpMbeVT11ll11;
    private DrawerLayout.bpdqqiQNVROMLC1ll1l1l11 ppbddpbbYwysRtaAnAwzNYP11l11111l;
    private Drawable ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private int ppdqqzXJzQiU11ll11;
    private View ppppqdfPOyVswFHMTylxLClll1l1111;
    private yb1 pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l;
    private boolean qbdbqqdbJdTsszXtJeXGasJIiGllll1l;
    private boolean qbddqbdJBkudFfhX1ll1l111;
    private bpqbbqTOKdRXac1ll1l1lll qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private View qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private boolean qbpbbZWTnlDkwOgZlllll;
    private String qbpbddbpyaPAbpThgWCvm11l11l1;
    private bpbbpOxqjGWQAsycX11ll1l1 qbqdqqqqdvTduGNll111l1;
    private View qddbbpxsbNjqxvn111ll;
    private pdpqbmApOBCmNMwnn1ll111 qdqdpyALEmZFGGaahRTIU1ll11;
    private ImageView qppqdpppIauLKaAtRkB11111l;
    private int qqbqbddiRRgLpniPxlUfQzP1l1l1l;
    private int qqdbbfmUWwoYYpfYHJZdaUO1111llll;
    private boolean qqpbppebHUxqEmlGoAJWl1lll;

    class bbdbbpdOJSuInlll111l implements MenuView.bppbpdbCeZVhQNTixBml1lll11l {
        final /* synthetic */ FloatingSearchView dbpqdHhmDSIHIJiwc1ll1l1;

        bbdbbpdOJSuInlll111l(FloatingSearchView floatingSearchView) {
        }

        @Override // com.arlib.floatingsearchview.util.view.MenuView.bppbpdbCeZVhQNTixBml1lll11l
        public void dbpqdHhmDSIHIJiwc1ll1l1(int i) {
        }
    }

    class bdddqmITkkeGpsxVXHR1l1llll implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ FloatingSearchView dbpqdHhmDSIHIJiwc1ll1l1;

        bdddqmITkkeGpsxVXHR1l1llll(FloatingSearchView floatingSearchView) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    public interface bpbbpOxqjGWQAsycX11ll1l1 {
        void dbpqdHhmDSIHIJiwc1ll1l1();
    }

    class bpdqqiQNVROMLC1ll1l1l11 implements yb1.dpbdbdpbLwkLpObyKsq1lll1 {
        final /* synthetic */ FloatingSearchView dbpqdHhmDSIHIJiwc1ll1l1;

        bpdqqiQNVROMLC1ll1l1l11(FloatingSearchView floatingSearchView) {
        }

        @Override // yb1.dpbdbdpbLwkLpObyKsq1lll1
        public void dbpqdHhmDSIHIJiwc1ll1l1(xb1 xb1Var) {
        }

        @Override // yb1.dpbdbdpbLwkLpObyKsq1lll1
        public void dpbdbdpbLwkLpObyKsq1lll1(xb1 xb1Var) {
        }
    }

    class bppbpdbCeZVhQNTixBml1lll11l extends cr1 {
        final /* synthetic */ FloatingSearchView dpbdpqRKAscW1lll1l;

        bppbpdbCeZVhQNTixBml1lll11l(FloatingSearchView floatingSearchView) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class bpppdpppqFAXRSTHUAmVJLvH11lllll1l implements SearchInputView.dpbdbdpbLwkLpObyKsq1lll1 {
        final /* synthetic */ FloatingSearchView dbpqdHhmDSIHIJiwc1ll1l1;

        bpppdpppqFAXRSTHUAmVJLvH11lllll1l(FloatingSearchView floatingSearchView) {
        }

        @Override // com.arlib.floatingsearchview.util.view.SearchInputView.dpbdbdpbLwkLpObyKsq1lll1
        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    private interface bpppqdQjfPiCT111111111 {
        void dbpqdHhmDSIHIJiwc1ll1l1();
    }

    public interface bpqbbqTOKdRXac1ll1l1lll {
        void dbpqdHhmDSIHIJiwc1ll1l1(xb1 xb1Var);

        void dpbdbdpbLwkLpObyKsq1lll1(String str);
    }

    public interface bpqdqbqpviKiORjqgp1l111l11 {
        void dbpqdHhmDSIHIJiwc1ll1l1();
    }

    class dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 implements bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ FloatingSearchView dpbdpqRKAscW1lll1l;

        dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(FloatingSearchView floatingSearchView) {
        }

        @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, MenuItem menuItem) {
        }

        @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public void onMenuModeChange(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }
    }

    class dbbpdqqpdVUhpQ1ll11 implements View.OnClickListener {
        final /* synthetic */ FloatingSearchView dpbdpqRKAscW1lll1l;

        dbbpdqqpdVUhpQ1ll11(FloatingSearchView floatingSearchView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public interface dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 {
        void dbpqdHhmDSIHIJiwc1ll1l1();

        void dpbdbdpbLwkLpObyKsq1lll1();
    }

    class dbppbdqpeLmcbs11l11 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ FloatingSearchView bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ int dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(FloatingSearchView floatingSearchView, int i) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements View.OnClickListener {
        final /* synthetic */ FloatingSearchView dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(FloatingSearchView floatingSearchView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    class ddbbbeXHXx111ll implements s22 {
        final /* synthetic */ float dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ FloatingSearchView dpbdbdpbLwkLpObyKsq1lll1;

        ddbbbeXHXx111ll(FloatingSearchView floatingSearchView, float f) {
        }

        @Override // p000.s22
        public void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }
    }

    public interface dddbpbpNqzZZJmSG1111l {
        void dbpqdHhmDSIHIJiwc1ll1l1();

        void dpbdbdpbLwkLpObyKsq1lll1();
    }

    public interface ddddbbdqIccDnEitQc1l1l1l {
        void dbpqdHhmDSIHIJiwc1ll1l1(MenuItem menuItem);
    }

    class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ d4 dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ FloatingSearchView dpbdbdpbLwkLpObyKsq1lll1;

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(FloatingSearchView floatingSearchView, d4 d4Var) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements View.OnTouchListener {
        final /* synthetic */ FloatingSearchView dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(FloatingSearchView floatingSearchView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    class dpbdpqRKAscW1lll1l extends mn0 {
        final /* synthetic */ FloatingSearchView bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ GestureDetector dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(FloatingSearchView floatingSearchView, GestureDetector gestureDetector) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbbpdqqpdVUhpQ1ll11
        public boolean dpbdbdpbLwkLpObyKsq1lll1(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }

    class dqdqbpQposEBDyDxIyyz1ll11 implements bpppqdQjfPiCT111111111 {
        final /* synthetic */ dqqpbqaYiRPLeqRCYteXfDW1l111l11l dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ FloatingSearchView dpbdbdpbLwkLpObyKsq1lll1;

        dqdqbpQposEBDyDxIyyz1ll11(FloatingSearchView floatingSearchView, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // com.arlib.floatingsearchview.FloatingSearchView.bpppqdQjfPiCT111111111
        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    class dqpdbEevAufTOvPphbjykClll1l11 extends AnimatorListenerAdapter {
        final /* synthetic */ FloatingSearchView dbpqdHhmDSIHIJiwc1ll1l1;

        dqpdbEevAufTOvPphbjykClll1l11(FloatingSearchView floatingSearchView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    class dqpqqqbqQyjyB11111l1 extends r22 {
        final /* synthetic */ float dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ FloatingSearchView dpbdbdpbLwkLpObyKsq1lll1;

        dqpqqqbqQyjyB11111l1(FloatingSearchView floatingSearchView, float f) {
        }

        @Override // p000.r22, p000.q22
        public void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }
    }

    static class dqqpbqaYiRPLeqRCYteXfDW1l111l11l extends View.BaseSavedState {
        public static final Parcelable.Creator<dqqpbqaYiRPLeqRCYteXfDW1l111l11l> CREATOR = null;
        private int bbdbbpdOJSuInlll111l;
        private int bdddqmITkkeGpsxVXHR1l1llll;
        private int bpbbpOxqjGWQAsycX11ll1l1;
        private boolean bpdqqiQNVROMLC1ll1l1l11;
        private int bppbpdbCeZVhQNTixBml1lll11l;
        private int bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
        private long bpqdqbqpviKiORjqgp1l111l11;
        private int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
        private int dbbpdqqpdVUhpQ1ll11;
        private boolean dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
        private boolean dbppbdqpeLmcbs11l11;
        private int ddbbbeXHXx111ll;
        private boolean dddbpbpNqzZZJmSG1111l;
        private boolean ddddbbdqIccDnEitQc1l1l1l;
        private boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        private List<? extends xb1> dpbdpqRKAscW1lll1l;
        private int dqdqbpQposEBDyDxIyyz1ll11;
        private String dqpdbEevAufTOvPphbjykClll1l11;
        private int dqpqqqbqQyjyB11111l1;
        private boolean pbppbpqbamJRy11l1l1;
        private String ppbdpwWWljzmXXdHNabfWhgjl111l11;
        private int qbddqbdJBkudFfhX1ll1l111;
        private boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll;
        private int qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
        private int qdqdpyALEmZFGGaahRTIU1ll11;
        private int qppqdpppIauLKaAtRkB11111l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.Creator<dqqpbqaYiRPLeqRCYteXfDW1l111l11l> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dqqpbqaYiRPLeqRCYteXfDW1l111l11l createFromParcel(Parcel parcel) {
            }

            public dqqpbqaYiRPLeqRCYteXfDW1l111l11l dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public dqqpbqaYiRPLeqRCYteXfDW1l111l11l[] dpbdbdpbLwkLpObyKsq1lll1(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dqqpbqaYiRPLeqRCYteXfDW1l111l11l[] newArray(int i) {
            }
        }

        /* synthetic */ dqqpbqaYiRPLeqRCYteXfDW1l111l11l(Parcel parcel, dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
        }

        static /* synthetic */ boolean bbdbbpdOJSuInlll111l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, boolean z) {
        }

        static /* synthetic */ boolean bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, boolean z) {
        }

        static /* synthetic */ boolean bdddqmITkkeGpsxVXHR1l1llll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, boolean z) {
        }

        static /* synthetic */ int bdpdqYMMfHmzHyUIbllllll1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int bdqbblVddTYAmqrWwacZmi111ll1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int bpbbpOxqjGWQAsycX11ll1l1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ boolean bpbqbqdqqjASPQfJSXuVkkgll1lll1ll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int bpdddqbpEtpkwNYukGjjNs1l111(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int bppbpdbCeZVhQNTixBml1lll11l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int bpppdpppqFAXRSTHUAmVJLvH11lllll1l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int bpppqdQjfPiCT111111111(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int bpqbbpqpqkDmeOUxxUylkHyYgWv11111(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int bpqbbqTOKdRXac1ll1l1lll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int bpqdqbqpviKiORjqgp1l111l11(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ boolean bpqpbicsQtfVpOtr11l1l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ boolean dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int dbbpdqqpdVUhpQ1ll11(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ String dbppbdqpeLmcbs11l11(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, String str) {
        }

        static /* synthetic */ List dbpqdHhmDSIHIJiwc1ll1l1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int ddbbbeXHXx111ll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int dddbpbpNqzZZJmSG1111l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int ddddbbdqIccDnEitQc1l1l1l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, boolean z) {
        }

        static /* synthetic */ List dpbdbdpbLwkLpObyKsq1lll1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, List list) {
        }

        static /* synthetic */ boolean dpbdpqRKAscW1lll1l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, boolean z) {
        }

        static /* synthetic */ int dpbdqAKWNZAIXLyehU1lll1lll1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int dqbbdddqpLERmaRLiHiDpL1l1l1l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ boolean dqdqbpQposEBDyDxIyyz1ll11(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ String dqpdbEevAufTOvPphbjykClll1l11(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int dqpqqqbqQyjyB11111l1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int dqqpbqaYiRPLeqRCYteXfDW1l111l11l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ boolean dqqppqiKzJi1l1lll1l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ boolean pbddqdbpoVvTyZPOoYl1111(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ boolean pbppbpqbamJRy11l1l1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int pdpqbmApOBCmNMwnn1ll111(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ String ppbdpwWWljzmXXdHNabfWhgjl111l11(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, String str) {
        }

        static /* synthetic */ int ppdqqzXJzQiU11ll11(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ boolean ppppqdfPOyVswFHMTylxLClll1l1111(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, boolean z) {
        }

        static /* synthetic */ boolean qbddqbdJBkudFfhX1ll1l111(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, boolean z) {
        }

        static /* synthetic */ boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ boolean qbpbbZWTnlDkwOgZlllll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, boolean z) {
        }

        static /* synthetic */ int qbpbddbpyaPAbpThgWCvm11l11l1(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ long qddbbpxsbNjqxvn111ll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int qdqdpyALEmZFGGaahRTIU1ll11(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int qppqdpppIauLKaAtRkB11111l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int qqbqbddiRRgLpniPxlUfQzP1l1l1l(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l, int i) {
        }

        static /* synthetic */ int qqdbbfmUWwoYYpfYHJZdaUO1111llll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        static /* synthetic */ int qqpbppebHUxqEmlGoAJWl1lll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        dqqpbqaYiRPLeqRCYteXfDW1l111l11l(Parcelable parcelable) {
        }

        private dqqpbqaYiRPLeqRCYteXfDW1l111l11l(Parcel parcel) {
        }
    }

    class dqqppqiKzJi1l1lll1l extends ck {
        final /* synthetic */ FloatingSearchView dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(FloatingSearchView floatingSearchView) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        }
    }

    class pbppbpqbamJRy11l1l1 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ d4 dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ FloatingSearchView dpbdbdpbLwkLpObyKsq1lll1;

        pbppbpqbamJRy11l1l1(FloatingSearchView floatingSearchView, d4 d4Var) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    public interface pdpqbmApOBCmNMwnn1ll111 {
        void dbpqdHhmDSIHIJiwc1ll1l1(String str, String str2);
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ boolean bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ List dpbdpqRKAscW1lll1l;
        final /* synthetic */ FloatingSearchView ppbdpwWWljzmXXdHNabfWhgjl111l11;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(FloatingSearchView floatingSearchView, List list, boolean z) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    class qbddqbdJBkudFfhX1ll1l111 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ FloatingSearchView dpbdpqRKAscW1lll1l;

        qbddqbdJBkudFfhX1ll1l111(FloatingSearchView floatingSearchView) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    class qbdpqpstJKhhKkXrsOGvbWw1l1llll implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ FloatingSearchView dbpqdHhmDSIHIJiwc1ll1l1;

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(FloatingSearchView floatingSearchView) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    class qbdqqpbqpCWRpIKEKtzoceYOll1ll1l implements View.OnFocusChangeListener {
        final /* synthetic */ FloatingSearchView dbpqdHhmDSIHIJiwc1ll1l1;

        qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(FloatingSearchView floatingSearchView) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    public interface qbpbddbpyaPAbpThgWCvm11l11l1 {
        void dbpqdHhmDSIHIJiwc1ll1l1(float f);
    }

    class qdqdpyALEmZFGGaahRTIU1ll11 implements SearchInputView.dqqppqiKzJi1l1lll1l {
        final /* synthetic */ FloatingSearchView dbpqdHhmDSIHIJiwc1ll1l1;

        qdqdpyALEmZFGGaahRTIU1ll11(FloatingSearchView floatingSearchView) {
        }

        @Override // com.arlib.floatingsearchview.util.view.SearchInputView.dqqppqiKzJi1l1lll1l
        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    private class qppqdpppIauLKaAtRkB11111l implements DrawerLayout.bpdqqiQNVROMLC1ll1l1l11 {
        final /* synthetic */ FloatingSearchView dbpqdHhmDSIHIJiwc1ll1l1;

        private qppqdpppIauLKaAtRkB11111l(FloatingSearchView floatingSearchView) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.bpdqqiQNVROMLC1ll1l1l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.bpdqqiQNVROMLC1ll1l1l11
        public void dpbdbdpbLwkLpObyKsq1lll1(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.bpdqqiQNVROMLC1ll1l1l11
        public void dpbdpqRKAscW1lll1l(View view, float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.bpdqqiQNVROMLC1ll1l1l11
        public void dqqppqiKzJi1l1lll1l(int i) {
        }

        /* synthetic */ qppqdpppIauLKaAtRkB11111l(FloatingSearchView floatingSearchView, dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
        }
    }

    public FloatingSearchView(Context context, AttributeSet attributeSet) {
    }

    static /* synthetic */ boolean bbdbbpdOJSuInlll111l(FloatingSearchView floatingSearchView, boolean z) {
    }

    private void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111() {
    }

    static /* synthetic */ void bdddqmITkkeGpsxVXHR1l1llll(FloatingSearchView floatingSearchView, boolean z) {
    }

    static /* synthetic */ int bdpdqYMMfHmzHyUIbllllll1(FloatingSearchView floatingSearchView) {
    }

    private int bdqbblVddTYAmqrWwacZmi111ll1(List<? extends xb1> list, int i) {
    }

    private void bdqpqbqbgFttbl1ll1l(d4 d4Var, boolean z) {
    }

    static /* synthetic */ boolean bpbbpOxqjGWQAsycX11ll1l1(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ SearchInputView bpdddqbpEtpkwNYukGjjNs1l111(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ boolean bpdqqiQNVROMLC1ll1l1l11(FloatingSearchView floatingSearchView, boolean z) {
    }

    static /* synthetic */ ImageView bppbpdbCeZVhQNTixBml1lll11l(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ bpqdqbqpviKiORjqgp1l111l11 bpppdpppqFAXRSTHUAmVJLvH11lllll1l(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ Drawable bpppqdQjfPiCT111111111(FloatingSearchView floatingSearchView) {
    }

    private void bppqdpqbpvFfYvVMQwal1l1l1() {
    }

    private int bpqbbpqpqkDmeOUxxUylkHyYgWv11111() {
    }

    static /* synthetic */ qbpbddbpyaPAbpThgWCvm11l11l1 bpqbbqTOKdRXac1ll1l1lll(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ RecyclerView bpqdqbqpviKiORjqgp1l111l11(FloatingSearchView floatingSearchView) {
    }

    private void bpqpbicsQtfVpOtr11l1l(ImageView imageView, Drawable drawable, boolean z) {
    }

    private void bqdppdGFpODiqhzhhiaXKl11l1() {
    }

    static /* synthetic */ boolean dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ View.OnClickListener dbbpdqqpdVUhpQ1ll11(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ String dbppbdqpeLmcbs11l11(FloatingSearchView floatingSearchView) {
    }

    private void dbppbpzxVnfullll1(List<? extends xb1> list, boolean z) {
    }

    static /* synthetic */ RelativeLayout dbpqdHhmDSIHIJiwc1ll1l1(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ ImageView ddbbbeXHXx111ll(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ void dddbpbpNqzZZJmSG1111l(FloatingSearchView floatingSearchView, CharSequence charSequence) {
    }

    static /* synthetic */ boolean ddddbbdqIccDnEitQc1l1l1l(FloatingSearchView floatingSearchView, List list, boolean z) {
    }

    private void ddpbddGpKmMvSPZaXEkLg11l11(boolean z) {
    }

    static /* synthetic */ boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ View dpbdbdpbLwkLpObyKsq1lll1(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ boolean dpbdpqRKAscW1lll1l(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ void dpbdqAKWNZAIXLyehU1lll1lll1(FloatingSearchView floatingSearchView, int i) {
    }

    private void dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1() {
    }

    private void dqbbdddqpLERmaRLiHiDpL1l1l1l(AttributeSet attributeSet) {
    }

    static /* synthetic */ boolean dqdqbpQposEBDyDxIyyz1ll11(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ pdpqbmApOBCmNMwnn1ll111 dqpdbEevAufTOvPphbjykClll1l11(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ boolean dqpqqqbqQyjyB11111l1(FloatingSearchView floatingSearchView, boolean z) {
    }

    static /* synthetic */ bpppqdQjfPiCT111111111 dqqpbqaYiRPLeqRCYteXfDW1l111l11l(FloatingSearchView floatingSearchView, bpppqdQjfPiCT111111111 bpppqdqjfpict111111111) {
    }

    static /* synthetic */ bpbbpOxqjGWQAsycX11ll1l1 dqqppqiKzJi1l1lll1l(FloatingSearchView floatingSearchView) {
    }

    private void pbdbqZLBIrMLYk1l11l1ll1(int i) {
    }

    private void pbddqdbpoVvTyZPOoYl1111(d4 d4Var, boolean z) {
    }

    private void pbpbpmdJpqmdGNwEepmjpVlll11l1(boolean z) {
    }

    static /* synthetic */ String pbppbpqbamJRy11l1l1(FloatingSearchView floatingSearchView, String str) {
    }

    static /* synthetic */ yb1 pdpqbmApOBCmNMwnn1ll111(FloatingSearchView floatingSearchView) {
    }

    private void pdpqqbqbpFAaViLnU1l1ll11l1() {
    }

    private boolean pdqbbpCQzQWOl111l1(List<? extends xb1> list, boolean z) {
    }

    private void pdqdddDNpMbeVT11ll11() {
    }

    private void ppbddpbbYwysRtaAnAwzNYP11l11111l() {
    }

    static /* synthetic */ boolean ppbdpwWWljzmXXdHNabfWhgjl111l11(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ void ppdqqzXJzQiU11ll11(FloatingSearchView floatingSearchView, List list, boolean z) {
    }

    private void pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l(AttributeSet attributeSet) {
    }

    private void pqqqddFCECdWHkSTrqHcll111111l() {
    }

    static /* synthetic */ bpqbbqTOKdRXac1ll1l1lll qbddqbdJBkudFfhX1ll1l111(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll(FloatingSearchView floatingSearchView, boolean z) {
    }

    static /* synthetic */ void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ bpppqdQjfPiCT111111111 qbpbddbpyaPAbpThgWCvm11l11l1(FloatingSearchView floatingSearchView) {
    }

    private void qbqdqqqqdvTduGNll111l1() {
    }

    private void qddbbpxsbNjqxvn111ll() {
    }

    static /* synthetic */ boolean qdqdpyALEmZFGGaahRTIU1ll11(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ Activity qppqdpppIauLKaAtRkB11111l(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ void qqbqbddiRRgLpniPxlUfQzP1l1l1l(FloatingSearchView floatingSearchView, boolean z) {
    }

    static /* synthetic */ ddddbbdqIccDnEitQc1l1l1l qqdbbfmUWwoYYpfYHJZdaUO1111llll(FloatingSearchView floatingSearchView) {
    }

    static /* synthetic */ CardView qqpbppebHUxqEmlGoAJWl1lll(FloatingSearchView floatingSearchView) {
    }

    private void setQueryText(CharSequence charSequence) {
    }

    private void setSearchFocusedInternal(boolean z) {
    }

    private void setSuggestionItemTextSize(int i) {
    }

    private void setupViews(AttributeSet attributeSet) {
    }

    public void bpbbpbppqsLrtEPjeDMEnOv1l1l1() {
    }

    public void bpbqbqdqqjASPQfJSXuVkkgll1lll1ll() {
    }

    public void bqdbpBvxFUC1lll11(int i) {
    }

    public boolean ddppqbqqbIhInevqvPYIBnGmBIE111lll() {
    }

    public List<androidx.appcompat.view.menu.dqpqqqbqQyjyB11111l1> getCurrentMenuItems() {
    }

    public String getQuery() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
    }

    public void ppppqdfPOyVswFHMTylxLClll1l1111(boolean z) {
    }

    public void qbdbqqdbJdTsszXtJeXGasJIiGllll1l(boolean z) {
    }

    public void qbpbbZWTnlDkwOgZlllll() {
    }

    public void qpbqqHZCUeoATyA11ll1l1() {
    }

    public void qpdbbbbbmKdyKHlllllll1(List<? extends xb1> list) {
    }

    public void setActionMenuOverflowColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    public void setClearBtnColor(int i) {
    }

    public void setCloseSearchOnKeyboardDismiss(boolean z) {
    }

    public void setDimBackground(boolean z) {
    }

    public void setDismissFocusOnItemSelection(boolean z) {
    }

    public void setDismissOnOutsideClick(boolean z) {
    }

    public void setDividerColor(int i) {
    }

    public void setHintTextColor(int i) {
    }

    public void setLeftActionIconColor(int i) {
    }

    public void setLeftActionMode(int i) {
    }

    public void setLeftMenuOpen(boolean z) {
    }

    public void setMenuIconProgress(float f) {
    }

    public void setMenuItemIconColor(int i) {
    }

    public void setOnBindSuggestionCallback(yb1.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    public void setOnClearSearchActionListener(bpbbpOxqjGWQAsycX11ll1l1 bpbbpoxqjgwqasycx11ll1l1) {
    }

    public void setOnFocusChangeListener(dddbpbpNqzZZJmSG1111l dddbpbpnqzzzjmsg1111l) {
    }

    public void setOnHomeActionClickListener(bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    public void setOnLeftMenuClickListener(dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 dbdqqqdddpgrkoykeyfgiifsohyll11ll1l1) {
    }

    public void setOnMenuClickListener(dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 dbdqqqdddpgrkoykeyfgiifsohyll11ll1l1) {
    }

    public void setOnMenuItemClickListener(ddddbbdqIccDnEitQc1l1l1l ddddbbdqiccdneitqc1l1l1l) {
    }

    public void setOnQueryChangeListener(pdpqbmApOBCmNMwnn1ll111 pdpqbmapobcmnmwnn1ll111) {
    }

    public void setOnSearchListener(bpqbbqTOKdRXac1ll1l1lll bpqbbqtokdrxac1ll1l1lll) {
    }

    public void setOnSuggestionsListHeightChanged(qbpbddbpyaPAbpThgWCvm11l11l1 qbpbddbpyapabpthgwcvm11l11l1) {
    }

    public void setQueryTextColor(int i) {
    }

    public void setQueryTextSize(int i) {
    }

    public void setSearchBarTitle(CharSequence charSequence) {
    }

    public void setSearchFocusable(boolean z) {
    }

    public void setSearchHint(String str) {
    }

    public void setSearchText(CharSequence charSequence) {
    }

    public void setShowMoveUpSuggestion(boolean z) {
    }

    public void setShowSearchKey(boolean z) {
    }

    public void setSuggestionRightIconColor(int i) {
    }

    public void setSuggestionsAnimDuration(long j) {
    }

    public void setSuggestionsTextColor(int i) {
    }

    public void setViewTextColor(int i) {
    }
}
