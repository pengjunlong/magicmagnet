package com.simplecityapps.recyclerview_fastscroll.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p000.in0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FastScrollRecyclerView extends RecyclerView implements RecyclerView.dbbpdqqpdVUhpQ1ll11 {
    private boolean bpdqqiQNVROMLC1ll1l1l11;
    private SparseIntArray dbppbdqpeLmcbs11l11;
    private int ddbbbeXHXx111ll;
    private in0 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private FastScroller dpbdpqRKAscW1lll1l;
    private int dqpdbEevAufTOvPphbjykClll1l11;
    private int dqpqqqbqQyjyB11111l1;
    private dqqppqiKzJi1l1lll1l pbppbpqbamJRy11l1l1;
    private dpbdpqRKAscW1lll1l ppbdpwWWljzmXXdHNabfWhgjl111l11;

    public interface bpdqqiQNVROMLC1ll1l1l11 {
        String dbpqdHhmDSIHIJiwc1ll1l1(int i);
    }

    public interface dpbdbdpbLwkLpObyKsq1lll1<VH extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll> {
        int dbpqdHhmDSIHIJiwc1ll1l1(RecyclerView recyclerView, VH vh, int i);
    }

    public static class dpbdpqRKAscW1lll1l {
        int dbpqdHhmDSIHIJiwc1ll1l1;
        int dpbdbdpbLwkLpObyKsq1lll1;
        int dqqppqiKzJi1l1lll1l;
    }

    private class dqqppqiKzJi1l1lll1l extends RecyclerView.dbppbdqpeLmcbs11l11 {
        final /* synthetic */ FastScrollRecyclerView dbpqdHhmDSIHIJiwc1ll1l1;

        private dqqppqiKzJi1l1lll1l(FastScrollRecyclerView fastScrollRecyclerView) {
        }

        private void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onChanged() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeChanged(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeInserted(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeRemoved(int i, int i2) {
        }

        /* synthetic */ dqqppqiKzJi1l1lll1l(FastScrollRecyclerView fastScrollRecyclerView, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeChanged(int i, int i2, Object obj) {
        }
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
    }

    private void dbppbdqpeLmcbs11l11(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
    }

    private float ddbbbeXHXx111ll(float f) {
    }

    static /* synthetic */ SparseIntArray dpbdpqRKAscW1lll1l(FastScrollRecyclerView fastScrollRecyclerView) {
    }

    private int dqpqqqbqQyjyB11111l1(int i) {
    }

    private boolean pbppbpqbamJRy11l1l1(MotionEvent motionEvent) {
    }

    private int ppbdpwWWljzmXXdHNabfWhgjl111l11() {
    }

    protected void bdddqmITkkeGpsxVXHR1l1llll(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, int i) {
    }

    public void bpdqqiQNVROMLC1ll1l1l11(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dbbpdqqpdVUhpQ1ll11
    public void dbpqdHhmDSIHIJiwc1ll1l1(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dbbpdqqpdVUhpQ1ll11
    public boolean dpbdbdpbLwkLpObyKsq1lll1(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    protected int dqpdbEevAufTOvPphbjykClll1l11(int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dbbpdqqpdVUhpQ1ll11
    public void dqqppqiKzJi1l1lll1l(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
    }

    protected int getAvailableScrollBarHeight() {
    }

    public int getScrollBarThumbHeight() {
    }

    public int getScrollBarWidth() {
    }

    @Override // android.view.View
    protected void onFinishInflate() {
    }

    public String qbdpqpstJKhhKkXrsOGvbWw1l1llll(float f) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.ddbbbeXHXx111ll ddbbbexhxx111ll) {
    }

    public void setAutoHideDelay(int i) {
    }

    public void setAutoHideEnabled(boolean z) {
    }

    public void setFastScrollEnabled(boolean z) {
    }

    public void setOnFastScrollStateChangeListener(in0 in0Var) {
    }

    public void setPopUpTypeface(Typeface typeface) {
    }

    public void setPopupBgColor(int i) {
    }

    public void setPopupPosition(int i) {
    }

    public void setPopupTextColor(int i) {
    }

    public void setPopupTextSize(int i) {
    }

    @Deprecated
    public void setStateChangeListener(in0 in0Var) {
    }

    public void setThumbColor(int i) {
    }

    @Deprecated
    public void setThumbEnabled(boolean z) {
    }

    public void setThumbInactiveColor(int i) {
    }

    public void setTrackColor(int i) {
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
    }

    @Deprecated
    public void setThumbInactiveColor(boolean z) {
    }
}
