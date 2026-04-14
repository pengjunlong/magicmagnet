package com.google.android.material.divider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialDividerItemDecoration extends RecyclerView.dqdqbpQposEBDyDxIyyz1ll11 {
    private static final int DEF_STYLE_RES = 0;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int color;
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    public MaterialDividerItemDecoration(Context context, int i) {
    }

    private void drawForHorizontalOrientation(Canvas canvas, RecyclerView recyclerView) {
    }

    private void drawForVerticalOrientation(Canvas canvas, RecyclerView recyclerView) {
    }

    private boolean shouldDrawDivider(RecyclerView recyclerView, View view) {
    }

    public int getDividerColor() {
    }

    public int getDividerInsetEnd() {
    }

    public int getDividerInsetStart() {
    }

    public int getDividerThickness() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dqdqbpQposEBDyDxIyyz1ll11
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    public int getOrientation() {
    }

    public boolean isLastItemDecorated() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.dqdqbpQposEBDyDxIyyz1ll11
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
    }

    public void setDividerColor(int i) {
    }

    public void setDividerColorResource(Context context, int i) {
    }

    public void setDividerInsetEnd(int i) {
    }

    public void setDividerInsetEndResource(Context context, int i) {
    }

    public void setDividerInsetStart(int i) {
    }

    public void setDividerInsetStartResource(Context context, int i) {
    }

    public void setDividerThickness(int i) {
    }

    public void setDividerThicknessResource(Context context, int i) {
    }

    public void setLastItemDecorated(boolean z) {
    }

    public void setOrientation(int i) {
    }

    protected boolean shouldDrawDivider(int i, RecyclerView.ddbbbeXHXx111ll<?> ddbbbexhxx111ll) {
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i, int i2) {
    }
}
