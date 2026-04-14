package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import java.util.List;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ChipGroup extends FlowLayout {
    private static final int DEF_STYLE_RES = 0;
    private final CheckableGroup<Chip> checkableGroup;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private final int defaultCheckedId;
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private final PassThroughHierarchyChangeListener passThroughListener;

    /* renamed from: com.google.android.material.chip.ChipGroup$1 */
    class C03061 implements CheckableGroup.OnCheckedStateChangeListener {
        final /* synthetic */ ChipGroup this$0;

        C03061(ChipGroup chipGroup) {
        }

        @Override // com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener
        public void onCheckedStateChanged(Set<Integer> set) {
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$2 */
    class C03072 implements OnCheckedStateChangeListener {
        final /* synthetic */ ChipGroup this$0;
        final /* synthetic */ OnCheckedChangeListener val$listener;

        C03072(ChipGroup chipGroup, OnCheckedChangeListener onCheckedChangeListener) {
        }

        @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
        public void onCheckedChanged(ChipGroup chipGroup, List<Integer> list) {
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        public LayoutParams(int i, int i2) {
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }
    }

    @Deprecated
    public interface OnCheckedChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, int i);
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, List<Integer> list);
    }

    private class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;
        final /* synthetic */ ChipGroup this$0;

        private PassThroughHierarchyChangeListener(ChipGroup chipGroup) {
        }

        static /* synthetic */ ViewGroup.OnHierarchyChangeListener access$302(PassThroughHierarchyChangeListener passThroughHierarchyChangeListener, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }

        /* synthetic */ PassThroughHierarchyChangeListener(ChipGroup chipGroup, C03061 c03061) {
        }
    }

    public ChipGroup(Context context) {
    }

    static /* synthetic */ OnCheckedStateChangeListener access$100(ChipGroup chipGroup) {
    }

    static /* synthetic */ CheckableGroup access$200(ChipGroup chipGroup) {
    }

    private int getVisibleChipCount() {
    }

    private boolean isChildVisible(int i) {
    }

    public void check(int i) {
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void clearCheck() {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
    }

    public int getCheckedChipId() {
    }

    public List<Integer> getCheckedChipIds() {
    }

    public int getChipSpacingHorizontal() {
    }

    public int getChipSpacingVertical() {
    }

    int getIndexOfChip(View view) {
    }

    public boolean isSelectionRequired() {
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
    }

    public boolean isSingleSelection() {
    }

    @Override // android.view.View
    protected void onFinishInflate() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    public void setChipSpacing(int i) {
    }

    public void setChipSpacingHorizontal(int i) {
    }

    public void setChipSpacingHorizontalResource(int i) {
    }

    public void setChipSpacingResource(int i) {
    }

    public void setChipSpacingVertical(int i) {
    }

    public void setChipSpacingVerticalResource(int i) {
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
    }

    @Deprecated
    public void setFlexWrap(int i) {
    }

    @Deprecated
    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
    }

    public void setSelectionRequired(boolean z) {
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
    }

    public void setSingleSelection(boolean z) {
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void setSingleLine(int i) {
    }

    public void setSingleSelection(int i) {
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
    }
}
