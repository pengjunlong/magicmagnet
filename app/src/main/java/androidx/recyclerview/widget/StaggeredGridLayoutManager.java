package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.dddbpbpNqzZZJmSG1111l.dpbdbdpbLwkLpObyKsq1lll1 {
    private boolean bbdbbpdOJSuInlll111l;
    int bdddqmITkkeGpsxVXHR1l1llll;
    private boolean bpbbpOxqjGWQAsycX11ll1l1;
    ppbdpwWWljzmXXdHNabfWhgjl111l11[] bpdqqiQNVROMLC1ll1l1l11;
    private bpdqqiQNVROMLC1ll1l1l11 bppbpdbCeZVhQNTixBml1lll11l;
    private final Rect bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private final Runnable bpqdqbqpviKiORjqgp1l111l11;
    private int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private boolean dbbpdqqpdVUhpQ1ll11;
    private final ddbbbeXHXx111ll dbppbdqpeLmcbs11l11;
    private int ddbbbeXHXx111ll;
    private int[] dddbpbpNqzZZJmSG1111l;
    boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private int dpbdpqRKAscW1lll1l;
    int dqdqbpQposEBDyDxIyyz1ll11;
    private int dqpdbEevAufTOvPphbjykClll1l11;
    ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll dqpqqqbqQyjyB11111l1;
    boolean pbppbpqbamJRy11l1l1;
    ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ppbdpwWWljzmXXdHNabfWhgjl111l11;
    dpbdpqRKAscW1lll1l qbddqbdJBkudFfhX1ll1l111;
    private BitSet qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private int qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private final dpbdbdpbLwkLpObyKsq1lll1 qdqdpyALEmZFGGaahRTIU1ll11;
    private boolean qppqdpppIauLKaAtRkB11111l;

    @SuppressLint({"BanParcelableUsage"})
    public static class bpdqqiQNVROMLC1ll1l1l11 implements Parcelable {
        public static final Parcelable.Creator<bpdqqiQNVROMLC1ll1l1l11> CREATOR = null;
        int bpdqqiQNVROMLC1ll1l1l11;
        List<dpbdpqRKAscW1lll1l.dbpqdHhmDSIHIJiwc1ll1l1> dbppbdqpeLmcbs11l11;
        int ddbbbeXHXx111ll;
        boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        int dpbdpqRKAscW1lll1l;
        int[] dqpdbEevAufTOvPphbjykClll1l11;
        int[] dqpqqqbqQyjyB11111l1;
        boolean pbppbpqbamJRy11l1l1;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;
        boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.Creator<bpdqqiQNVROMLC1ll1l1l11> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ bpdqqiQNVROMLC1ll1l1l11 createFromParcel(Parcel parcel) {
            }

            public bpdqqiQNVROMLC1ll1l1l11 dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public bpdqqiQNVROMLC1ll1l1l11[] dpbdbdpbLwkLpObyKsq1lll1(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ bpdqqiQNVROMLC1ll1l1l11[] newArray(int i) {
            }
        }

        public bpdqqiQNVROMLC1ll1l1l11() {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        bpdqqiQNVROMLC1ll1l1l11(Parcel parcel) {
        }

        public bpdqqiQNVROMLC1ll1l1l11(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
        final /* synthetic */ StaggeredGridLayoutManager dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 {
        boolean bpdqqiQNVROMLC1ll1l1l11;
        int dbpqdHhmDSIHIJiwc1ll1l1;
        int dpbdbdpbLwkLpObyKsq1lll1;
        boolean dpbdpqRKAscW1lll1l;
        final /* synthetic */ StaggeredGridLayoutManager dqpqqqbqQyjyB11111l1;
        boolean dqqppqiKzJi1l1lll1l;
        int[] ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dpbdbdpbLwkLpObyKsq1lll1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        void dpbdbdpbLwkLpObyKsq1lll1(int i) {
        }

        void dpbdpqRKAscW1lll1l(ppbdpwWWljzmXXdHNabfWhgjl111l11[] ppbdpwwwljzmxxdhnabfwhgjl111l11Arr) {
        }

        void dqqppqiKzJi1l1lll1l() {
        }
    }

    public static class dqqppqiKzJi1l1lll1l extends RecyclerView.qbddqbdJBkudFfhX1ll1l111 {
        ppbdpwWWljzmXXdHNabfWhgjl111l11 dbpqdHhmDSIHIJiwc1ll1l1;
        boolean dpbdbdpbLwkLpObyKsq1lll1;

        public dqqppqiKzJi1l1lll1l(Context context, AttributeSet attributeSet) {
        }

        public boolean dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public dqqppqiKzJi1l1lll1l(int i, int i2) {
        }

        public dqqppqiKzJi1l1lll1l(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        public dqqppqiKzJi1l1lll1l(ViewGroup.LayoutParams layoutParams) {
        }
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        final int bpdqqiQNVROMLC1ll1l1l11;
        ArrayList<View> dbpqdHhmDSIHIJiwc1ll1l1;
        int dpbdbdpbLwkLpObyKsq1lll1;
        int dpbdpqRKAscW1lll1l;
        int dqqppqiKzJi1l1lll1l;
        final /* synthetic */ StaggeredGridLayoutManager ppbdpwWWljzmXXdHNabfWhgjl111l11;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        }

        void bbdbbpdOJSuInlll111l(int i) {
        }

        dqqppqiKzJi1l1lll1l bdddqmITkkeGpsxVXHR1l1llll(View view) {
        }

        void bpdqqiQNVROMLC1ll1l1l11() {
        }

        void bppbpdbCeZVhQNTixBml1lll11l() {
        }

        void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(int i) {
        }

        void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
        }

        void dbbpdqqpdVUhpQ1ll11() {
        }

        public int dbppbdqpeLmcbs11l11() {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        int ddbbbeXHXx111ll(int i, int i2, boolean z, boolean z2, boolean z3) {
        }

        int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(int i) {
        }

        void dpbdbdpbLwkLpObyKsq1lll1(boolean z, int i) {
        }

        void dpbdpqRKAscW1lll1l() {
        }

        int dqdqbpQposEBDyDxIyyz1ll11() {
        }

        int dqpdbEevAufTOvPphbjykClll1l11(int i, int i2, boolean z) {
        }

        public int dqpqqqbqQyjyB11111l1() {
        }

        void dqqppqiKzJi1l1lll1l() {
        }

        int pbppbpqbamJRy11l1l1() {
        }

        public int ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }

        int qbddqbdJBkudFfhX1ll1l111(int i) {
        }

        public View qbdpqpstJKhhKkXrsOGvbWw1l1llll(int i, int i2) {
        }

        void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(View view) {
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    private void bbdbbpdOJSuInlll111l(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, boolean z) {
    }

    private void bdpdqYMMfHmzHyUIbllllll1(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, ddbbbeXHXx111ll ddbbbexhxx111ll) {
    }

    private int bpbbpOxqjGWQAsycX11ll1l1(int i) {
    }

    private void bpdqqiQNVROMLC1ll1l1l11(View view, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, ddbbbeXHXx111ll ddbbbexhxx111ll) {
    }

    private int bpppdpppqFAXRSTHUAmVJLvH11lllll1l(int i) {
    }

    private void bpppqdQjfPiCT111111111(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, boolean z) {
    }

    private void bpqbbpqpqkDmeOUxxUylkHyYgWv11111(int i, int i2) {
    }

    private void bpqbbqTOKdRXac1ll1l1lll(View view, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, boolean z) {
    }

    private void bpqdqbqpviKiORjqgp1l111l11(int i, int i2, int i3) {
    }

    private int computeScrollExtent(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private int computeScrollOffset(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private int computeScrollRange(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
    }

    private int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(int i) {
    }

    private void dbbpdqqpdVUhpQ1ll11(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, boolean z) {
    }

    private dpbdpqRKAscW1lll1l.dbpqdHhmDSIHIJiwc1ll1l1 dbppbdqpeLmcbs11l11(int i) {
    }

    private void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
    }

    private boolean ddbbbeXHXx111ll(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    private ppbdpwWWljzmXXdHNabfWhgjl111l11 dddbpbpNqzZZJmSG1111l(ddbbbeXHXx111ll ddbbbexhxx111ll) {
    }

    private int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, ddbbbeXHXx111ll ddbbbexhxx111ll, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private void dpbdbdpbLwkLpObyKsq1lll1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    private void dpbdqAKWNZAIXLyehU1lll1lll1(int i) {
    }

    private boolean dqbbdddqpLERmaRLiHiDpL1l1l1l(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    private dpbdpqRKAscW1lll1l.dbpqdHhmDSIHIJiwc1ll1l1 dqpdbEevAufTOvPphbjykClll1l11(int i) {
    }

    private int pbddqdbpoVvTyZPOoYl1111(int i, int i2, int i3) {
    }

    private void pbppbpqbamJRy11l1l1() {
    }

    private void pdpqbmApOBCmNMwnn1ll111(View view, int i, int i2, boolean z) {
    }

    private int ppbdpwWWljzmXXdHNabfWhgjl111l11(int i) {
    }

    private void ppdqqzXJzQiU11ll11(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, int i) {
    }

    private void ppppqdfPOyVswFHMTylxLClll1l1111(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, int i, int i2) {
    }

    private int qbdpqpstJKhhKkXrsOGvbWw1l1llll(int i) {
    }

    private void qbpbbZWTnlDkwOgZlllll(int i, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    private boolean qbpbddbpyaPAbpThgWCvm11l11l1(int i) {
    }

    private int qdqdpyALEmZFGGaahRTIU1ll11(int i) {
    }

    private int qppqdpppIauLKaAtRkB11111l(int i) {
    }

    private void qqbqbddiRRgLpniPxlUfQzP1l1l1l(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, int i) {
    }

    private void qqdbbfmUWwoYYpfYHJZdaUO1111llll() {
    }

    private void qqpbppebHUxqEmlGoAJWl1lll(View view) {
    }

    private void resolveShouldLayoutReverse() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
    }

    View bdddqmITkkeGpsxVXHR1l1llll(boolean z) {
    }

    boolean bdqbblVddTYAmqrWwacZmi111ll1(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    void bpbqbqdqqjASPQfJSXuVkkgll1lll1ll(int i) {
    }

    public void bpdddqbpEtpkwNYukGjjNs1l111(int i) {
    }

    int bppbpdbCeZVhQNTixBml1lll11l() {
    }

    void bpqpbicsQtfVpOtr11l1l(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.qbddqbdJBkudFfhX1ll1l111 qbddqbdjbkudffhx1ll1l111) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, RecyclerView.LayoutManager.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dddbpbpNqzZZJmSG1111l.dpbdbdpbLwkLpObyKsq1lll1
    public PointF computeScrollVectorForPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    View dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1() {
    }

    public void ddddbbdqIccDnEitQc1l1l1l() {
    }

    boolean dpbdpqRKAscW1lll1l() {
    }

    View dqdqbpQposEBDyDxIyyz1ll11(boolean z) {
    }

    boolean dqpqqqbqQyjyB11111l1() {
    }

    void dqqpbqaYiRPLeqRCYteXfDW1l111l11l(int i, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    boolean dqqppqiKzJi1l1lll1l() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.qbddqbdJBkudFfhX1ll1l111 generateDefaultLayoutParams() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.qbddqbdJBkudFfhX1ll1l111 generateLayoutParams(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
    }

    boolean isLayoutRTL() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.ddbbbeXHXx111ll ddbbbexhxx111ll, RecyclerView.ddbbbeXHXx111ll ddbbbexhxx111ll2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
    }

    int qbddqbdJBkudFfhX1ll1l111() {
    }

    int qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
    }

    int scrollBy(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
    }

    public void setOrientation(int i) {
    }

    public void setReverseLayout(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.qbddqbdJBkudFfhX1ll1l111 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    static class dpbdpqRKAscW1lll1l {
        int[] dbpqdHhmDSIHIJiwc1ll1l1;
        List<dbpqdHhmDSIHIJiwc1ll1l1> dpbdbdpbLwkLpObyKsq1lll1;

        dpbdpqRKAscW1lll1l() {
        }

        private void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(int i, int i2) {
        }

        private int dqpdbEevAufTOvPphbjykClll1l11(int i) {
        }

        private void qbdpqpstJKhhKkXrsOGvbWw1l1llll(int i, int i2) {
        }

        void bdddqmITkkeGpsxVXHR1l1llll(int i, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
        }

        public dbpqdHhmDSIHIJiwc1ll1l1 bpdqqiQNVROMLC1ll1l1l11(int i, int i2, int i3, boolean z) {
        }

        void dbppbdqpeLmcbs11l11(int i, int i2) {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        int ddbbbeXHXx111ll(int i) {
        }

        void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        int dpbdpqRKAscW1lll1l(int i) {
        }

        int dqdqbpQposEBDyDxIyyz1ll11(int i) {
        }

        int dqpqqqbqQyjyB11111l1(int i) {
        }

        void dqqppqiKzJi1l1lll1l(int i) {
        }

        void pbppbpqbamJRy11l1l1(int i, int i2) {
        }

        public dbpqdHhmDSIHIJiwc1ll1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11(int i) {
        }

        @SuppressLint({"BanParcelableUsage"})
        static class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable {
            public static final Parcelable.Creator<dbpqdHhmDSIHIJiwc1ll1l1> CREATOR = null;
            int bpdqqiQNVROMLC1ll1l1l11;
            int dpbdpqRKAscW1lll1l;
            boolean dqpqqqbqQyjyB11111l1;
            int[] ppbdpwWWljzmXXdHNabfWhgjl111l11;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$dpbdpqRKAscW1lll1l$dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
            class C1969dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.Creator<dbpqdHhmDSIHIJiwc1ll1l1> {
                C1969dbpqdHhmDSIHIJiwc1ll1l1() {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1 createFromParcel(Parcel parcel) {
                }

                public dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
                }

                public dbpqdHhmDSIHIJiwc1ll1l1[] dpbdbdpbLwkLpObyKsq1lll1(int i) {
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1[] newArray(int i) {
                }
            }

            dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            int dbpqdHhmDSIHIJiwc1ll1l1(int i) {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
            }

            public String toString() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
            }

            dbpqdHhmDSIHIJiwc1ll1l1() {
            }
        }
    }
}
