package com.simplecityapps.recyclerview_fastscroll.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import p000.in0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FastScroller {
    private boolean bbdbbpdOJSuInlll111l;
    private boolean bdddqmITkkeGpsxVXHR1l1llll;
    private Paint bpdqqiQNVROMLC1ll1l1l11;
    private int bppbpdbCeZVhQNTixBml1lll11l;
    private boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private final Runnable dbbpdqqpdVUhpQ1ll11;
    private int dbppbdqpeLmcbs11l11;
    private FastScrollRecyclerView dbpqdHhmDSIHIJiwc1ll1l1;
    private Rect ddbbbeXHXx111ll;
    private Point ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private FastScrollPopup dpbdbdpbLwkLpObyKsq1lll1;
    private int dpbdpqRKAscW1lll1l;
    private Animator dqdqbpQposEBDyDxIyyz1ll11;
    private Rect dqpdbEevAufTOvPphbjykClll1l11;
    private Rect dqpqqqbqQyjyB11111l1;
    private int dqqppqiKzJi1l1lll1l;
    private int pbppbpqbamJRy11l1l1;
    private Paint ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private boolean qbddqbdJBkudFfhX1ll1l111;
    private Point qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private int qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
        final /* synthetic */ FastScroller dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(FastScroller fastScroller) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 extends RecyclerView.bppbpdbCeZVhQNTixBml1lll11l {
        final /* synthetic */ FastScroller dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdbdpbLwkLpObyKsq1lll1(FastScroller fastScroller) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.bppbpdbCeZVhQNTixBml1lll11l
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    class dqqppqiKzJi1l1lll1l extends AnimatorListenerAdapter {
        final /* synthetic */ FastScroller dbpqdHhmDSIHIJiwc1ll1l1;

        dqqppqiKzJi1l1lll1l(FastScroller fastScroller) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public FastScroller(Context context, FastScrollRecyclerView fastScrollRecyclerView, AttributeSet attributeSet) {
    }

    private boolean bdddqmITkkeGpsxVXHR1l1llll(int i, int i2) {
    }

    static /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11(FastScroller fastScroller) {
    }

    static /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(FastScroller fastScroller) {
    }

    static /* synthetic */ Animator dpbdbdpbLwkLpObyKsq1lll1(FastScroller fastScroller) {
    }

    static /* synthetic */ FastScrollRecyclerView dpbdpqRKAscW1lll1l(FastScroller fastScroller) {
    }

    static /* synthetic */ Animator dqqppqiKzJi1l1lll1l(FastScroller fastScroller, Animator animator) {
    }

    static /* synthetic */ boolean ppbdpwWWljzmXXdHNabfWhgjl111l11(FastScroller fastScroller, boolean z) {
    }

    public void bbdbbpdOJSuInlll111l(int i, int i2) {
    }

    public void bpbbpOxqjGWQAsycX11ll1l1(int i) {
    }

    public void bppbpdbCeZVhQNTixBml1lll11l(int i) {
    }

    public void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(int i) {
    }

    public void bpqdqbqpviKiORjqgp1l111l11(int i) {
    }

    public void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(boolean z) {
    }

    public void dbbpdqqpdVUhpQ1ll11(int i) {
    }

    public void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1() {
    }

    public int dbppbdqpeLmcbs11l11() {
    }

    public void ddbbbeXHXx111ll(Canvas canvas) {
    }

    public void dddbpbpNqzZZJmSG1111l(int i, int i2) {
    }

    public void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(MotionEvent motionEvent, int i, int i2, int i3, in0 in0Var) {
    }

    protected void dqdqbpQposEBDyDxIyyz1ll11() {
    }

    public void dqpdbEevAufTOvPphbjykClll1l11(boolean z) {
    }

    protected void dqpqqqbqQyjyB11111l1() {
    }

    @Keep
    public int getOffsetX() {
    }

    public int pbppbpqbamJRy11l1l1() {
    }

    public void qbddqbdJBkudFfhX1ll1l111(int i) {
    }

    public boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
    }

    public void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(int i) {
    }

    public void qdqdpyALEmZFGGaahRTIU1ll11(Typeface typeface) {
    }

    public void qppqdpppIauLKaAtRkB11111l(int i) {
    }

    @Keep
    public void setOffsetX(int i) {
    }
}
