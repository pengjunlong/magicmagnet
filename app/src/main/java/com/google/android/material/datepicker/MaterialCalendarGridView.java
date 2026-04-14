package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$1 */
    class C03331 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ MaterialCalendarGridView this$0;

        C03331(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    public MaterialCalendarGridView(Context context) {
    }

    private void gainFocus(int i, Rect rect) {
    }

    private View getChildAtPosition(int i) {
    }

    private static int horizontalMidPoint(View view) {
    }

    private static boolean skipMonth(Long l, Long l2, Long l3, Long l4) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.widget.GridView, android.widget.AdapterView
    public /* bridge */ /* synthetic */ ListAdapter getAdapter() {
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ ListAdapter getAdapter2() {
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public final void setAdapter2(ListAdapter listAdapter) {
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public ListAdapter getAdapter() {
    }
}
