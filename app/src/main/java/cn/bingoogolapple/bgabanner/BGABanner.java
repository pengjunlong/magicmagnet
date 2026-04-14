package cn.bingoogolapple.bgabanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import cn.bingoogolapple.bgabanner.BGAViewPager;
import java.lang.ref.WeakReference;
import java.util.List;
import p000.bdbpqqqdlWnGPAbrRIKhl1l1l11;
import p000.cu1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class BGABanner extends RelativeLayout implements BGAViewPager.dbpqdHhmDSIHIJiwc1ll1l1, ViewPager.dbppbdqpeLmcbs11l11 {
    private static final ImageView.ScaleType[] bpbqbqdqqjASPQfJSXuVkkgll1lll1ll = null;
    private int bbdbbpdOJSuInlll111l;
    private int bdddqmITkkeGpsxVXHR1l1llll;
    private int bdpdqYMMfHmzHyUIbllllll1;
    private bpdqqiQNVROMLC1ll1l1l11 bdqbblVddTYAmqrWwacZmi111ll1;
    private ImageView bpbbpOxqjGWQAsycX11ll1l1;
    private boolean bpdddqbpEtpkwNYukGjjNs1l111;
    private List<View> bpdqqiQNVROMLC1ll1l1l11;
    private Drawable bppbpdbCeZVhQNTixBml1lll11l;
    private int bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private ViewPager.dbppbdqpeLmcbs11l11 bpppqdQjfPiCT111111111;
    private View bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
    private int bpqbbqTOKdRXac1ll1l1lll;
    private int bpqdqbqpviKiORjqgp1l111l11;
    private boolean bpqpbicsQtfVpOtr11l1l;
    private int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private int dbbpdqqpdVUhpQ1ll11;
    private List<? extends Object> dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private boolean dbppbdqpeLmcbs11l11;
    private LinearLayout ddbbbeXHXx111ll;
    private ImageView.ScaleType dddbpbpNqzZZJmSG1111l;
    private dpbdpqRKAscW1lll1l ddddbbdqIccDnEitQc1l1l1l;
    private int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private BGAViewPager dpbdpqRKAscW1lll1l;
    private float dpbdqAKWNZAIXLyehU1lll1lll1;
    private View dqbbdddqpLERmaRLiHiDpL1l1l1l;
    private int dqdqbpQposEBDyDxIyyz1ll11;
    private TextView dqpdbEevAufTOvPphbjykClll1l11;
    private List<String> dqpqqqbqQyjyB11111l1;
    private TextView dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private int pbppbpqbamJRy11l1l1;
    private dpbdbdpbLwkLpObyKsq1lll1 pdpqbmApOBCmNMwnn1ll111;
    private List<View> ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private Drawable ppdqqzXJzQiU11ll11;
    private int qbddqbdJBkudFfhX1ll1l111;
    private int qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private dqqppqiKzJi1l1lll1l qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private bdbpqqqdlWnGPAbrRIKhl1l1l11 qbpbbZWTnlDkwOgZlllll;
    private boolean qbpbddbpyaPAbpThgWCvm11l11l1;
    private float qdqdpyALEmZFGGaahRTIU1ll11;
    private cu1 qppqdpppIauLKaAtRkB11111l;
    private boolean qqbqbddiRRgLpniPxlUfQzP1l1l1l;
    private int qqdbbfmUWwoYYpfYHJZdaUO1111llll;
    private int qqpbppebHUxqEmlGoAJWl1lll;

    public interface bpdqqiQNVROMLC1ll1l1l11 {
        void dbpqdHhmDSIHIJiwc1ll1l1();
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 extends bdbpqqqdlWnGPAbrRIKhl1l1l11 {
        final /* synthetic */ BGABanner ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dbpqdHhmDSIHIJiwc1ll1l1(BGABanner bGABanner) {
        }

        @Override // p000.bdbpqqqdlWnGPAbrRIKhl1l1l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }
    }

    public interface dpbdbdpbLwkLpObyKsq1lll1<V extends View, M> {
        void dbpqdHhmDSIHIJiwc1ll1l1(BGABanner bGABanner, V v, M m, int i);
    }

    public interface dpbdpqRKAscW1lll1l<V extends View, M> {
        void dbpqdHhmDSIHIJiwc1ll1l1(BGABanner bGABanner, V v, M m, int i);
    }

    private static class dqqppqiKzJi1l1lll1l implements Runnable {
        private final WeakReference<BGABanner> dpbdpqRKAscW1lll1l;

        /* synthetic */ dqqppqiKzJi1l1lll1l(BGABanner bGABanner, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        private dqqppqiKzJi1l1lll1l(BGABanner bGABanner) {
        }
    }

    private class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ BGABanner dqqppqiKzJi1l1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 extends bdbpqqqdlWnGPAbrRIKhl1l1l11 {
            final /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dbpqdHhmDSIHIJiwc1ll1l1(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
            }

            @Override // p000.bdbpqqqdlWnGPAbrRIKhl1l1l11
            public void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
            }
        }

        private ppbdpwWWljzmXXdHNabfWhgjl111l11(BGABanner bGABanner) {
        }

        @Override // androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1
        public int bpdqqiQNVROMLC1ll1l1l11(Object obj) {
        }

        @Override // androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1
        public void dbpqdHhmDSIHIJiwc1ll1l1(ViewGroup viewGroup, int i, Object obj) {
        }

        @Override // androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1
        public Object ddbbbeXHXx111ll(ViewGroup viewGroup, int i) {
        }

        @Override // androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1
        public int dpbdpqRKAscW1lll1l() {
        }

        @Override // androidx.viewpager.widget.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean dqpdbEevAufTOvPphbjykClll1l11(View view, Object obj) {
        }

        /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11(BGABanner bGABanner, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    public BGABanner(Context context, AttributeSet attributeSet) {
    }

    private void bbdbbpdOJSuInlll111l(TextView textView) {
    }

    private void bdddqmITkkeGpsxVXHR1l1llll(Context context) {
    }

    static /* synthetic */ boolean bpdqqiQNVROMLC1ll1l1l11(BGABanner bGABanner) {
    }

    private void bpqdqbqpviKiORjqgp1l111l11() {
    }

    private void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
    }

    private void dbbpdqqpdVUhpQ1ll11() {
    }

    private void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(int i) {
    }

    static /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 dbppbdqpeLmcbs11l11(BGABanner bGABanner) {
    }

    static /* synthetic */ BGAViewPager ddbbbeXHXx111ll(BGABanner bGABanner) {
    }

    private void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(int i, TypedArray typedArray) {
    }

    static /* synthetic */ bpdqqiQNVROMLC1ll1l1l11 dpbdbdpbLwkLpObyKsq1lll1(BGABanner bGABanner) {
    }

    static /* synthetic */ List dpbdpqRKAscW1lll1l(BGABanner bGABanner) {
    }

    private void dqdqbpQposEBDyDxIyyz1ll11() {
    }

    static /* synthetic */ List dqpdbEevAufTOvPphbjykClll1l11(BGABanner bGABanner) {
    }

    static /* synthetic */ dpbdpqRKAscW1lll1l dqpqqqbqQyjyB11111l1(BGABanner bGABanner) {
    }

    static /* synthetic */ void dqqppqiKzJi1l1lll1l(BGABanner bGABanner) {
    }

    private void pbppbpqbamJRy11l1l1(int i, float f) {
    }

    static /* synthetic */ List ppbdpwWWljzmXXdHNabfWhgjl111l11(BGABanner bGABanner) {
    }

    private void qbddqbdJBkudFfhX1ll1l111(Context context) {
    }

    private void qbdpqpstJKhhKkXrsOGvbWw1l1llll(Context context, AttributeSet attributeSet) {
    }

    public void bpbbpOxqjGWQAsycX11ll1l1() {
    }

    public void bppbpdbCeZVhQNTixBml1lll11l() {
    }

    public void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(List<? extends Object> list, List<String> list2) {
    }

    @Override // cn.bingoogolapple.bgabanner.BGAViewPager.dbpqdHhmDSIHIJiwc1ll1l1
    public void dbpqdHhmDSIHIJiwc1ll1l1(float f) {
    }

    public void dddbpbpNqzZZJmSG1111l() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
    }

    public int getCurrentItem() {
    }

    public int getItemCount() {
    }

    public List<String> getTips() {
    }

    public BGAViewPager getViewPager() {
    }

    public List<? extends View> getViews() {
    }

    public TextView getmTipTv() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.dbppbdqpeLmcbs11l11
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.dbppbdqpeLmcbs11l11
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.dbppbdqpeLmcbs11l11
    public void onPageSelected(int i) {
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
    }

    public void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(int i, List<? extends Object> list, List<String> list2) {
    }

    public void qdqdpyALEmZFGGaahRTIU1ll11(List<View> list, List<? extends Object> list2, List<String> list3) {
    }

    public void qppqdpppIauLKaAtRkB11111l() {
    }

    public void setAdapter(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    public void setAllowUserScrollable(boolean z) {
    }

    public void setAspectRatio(float f) {
    }

    public void setAutoPlayAble(boolean z) {
    }

    public void setAutoPlayInterval(int i) {
    }

    public void setCurrentItem(int i) {
    }

    public void setData(List<View> list) {
    }

    public void setDelegate(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
    }

    public void setIsNeedShowIndicatorOnOnlyOnePage(boolean z) {
    }

    public void setOnPageChangeListener(ViewPager.dbppbdqpeLmcbs11l11 dbppbdqpelmcbs11l11) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
    }

    public void setPageChangeDuration(int i) {
    }

    public void setPageTransformer(ViewPager.pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
    }

    public void setTransitionEffect(cu1 cu1Var) {
    }

    public BGABanner(Context context, AttributeSet attributeSet, int i) {
    }
}
