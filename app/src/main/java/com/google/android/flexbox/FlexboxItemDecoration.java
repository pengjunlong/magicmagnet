package com.google.android.flexbox;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class FlexboxItemDecoration extends RecyclerView.dqdqbpQposEBDyDxIyyz1ll11 {
    public static final int BOTH = 3;
    public static final int HORIZONTAL = 1;
    private static final int[] LIST_DIVIDER_ATTRS = null;
    public static final int VERTICAL = 2;
    private Drawable mDrawable;
    private int mOrientation;

    public FlexboxItemDecoration(Context context) {
    }

    private void drawHorizontalDecorations(Canvas canvas, RecyclerView recyclerView) {
    }

    private void drawVerticalDecorations(Canvas canvas, RecyclerView recyclerView) {
    }

    private boolean isFirstItemInLine(int i, List<FlexLine> list, FlexboxLayoutManager flexboxLayoutManager) {
    }

    private boolean needsHorizontalDecoration() {
    }

    private boolean needsVerticalDecoration() {
    }

    private void setOffsetAlongCrossAxis(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<FlexLine> list) {
    }

    private void setOffsetAlongMainAxis(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<FlexLine> list, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dqdqbpQposEBDyDxIyyz1ll11
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dqdqbpQposEBDyDxIyyz1ll11
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    public void setDrawable(Drawable drawable) {
    }

    public void setOrientation(int i) {
    }
}
