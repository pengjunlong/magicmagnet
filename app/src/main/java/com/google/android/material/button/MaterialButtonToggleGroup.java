package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    private static final int DEF_STYLE_RES = 0;
    private static final String LOG_TAG = "MButtonToggleGroup";
    private Set<Integer> checkedIds;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private final int defaultCheckId;
    private final LinkedHashSet<OnButtonCheckedListener> onButtonCheckedListeners;
    private final List<CornerData> originalCornerData;
    private final PressedStateTracker pressedStateTracker;
    private boolean selectionRequired;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$1 */
    class C02991 implements Comparator<MaterialButton> {
        final /* synthetic */ MaterialButtonToggleGroup this$0;

        C02991(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(MaterialButton materialButton, MaterialButton materialButton2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(MaterialButton materialButton, MaterialButton materialButton2) {
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$2 */
    class C03002 extends dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ MaterialButtonToggleGroup this$0;

        C03002(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    private static class CornerData {
        private static final CornerSize noCorner = null;
        CornerSize bottomLeft;
        CornerSize bottomRight;
        CornerSize topLeft;
        CornerSize topRight;

        CornerData(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        }

        public static CornerData bottom(CornerData cornerData) {
        }

        public static CornerData end(CornerData cornerData, View view) {
        }

        public static CornerData left(CornerData cornerData) {
        }

        public static CornerData right(CornerData cornerData) {
        }

        public static CornerData start(CornerData cornerData, View view) {
        }

        public static CornerData top(CornerData cornerData) {
        }
    }

    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    private class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        final /* synthetic */ MaterialButtonToggleGroup this$0;

        private PressedStateTracker(MaterialButtonToggleGroup materialButtonToggleGroup) {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(MaterialButton materialButton, boolean z) {
        }

        /* synthetic */ PressedStateTracker(MaterialButtonToggleGroup materialButtonToggleGroup, C02991 c02991) {
        }
    }

    public MaterialButtonToggleGroup(Context context) {
    }

    static /* synthetic */ int access$100(MaterialButtonToggleGroup materialButtonToggleGroup, View view) {
    }

    private void adjustChildMarginsAndUpdateLayout() {
    }

    private LinearLayout.LayoutParams buildLayoutParams(View view) {
    }

    private void checkInternal(int i, boolean z) {
    }

    private void dispatchOnButtonChecked(int i, boolean z) {
    }

    private MaterialButton getChildButton(int i) {
    }

    private int getFirstVisibleChildIndex() {
    }

    private int getIndexWithinVisibleButtons(View view) {
    }

    private int getLastVisibleChildIndex() {
    }

    private CornerData getNewCornerData(int i, int i2, int i3) {
    }

    private int getVisibleButtonCount() {
    }

    private boolean isChildVisible(int i) {
    }

    private void resetChildMargins(int i) {
    }

    private void setCheckedStateForView(int i, boolean z) {
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
    }

    private void setupButtonChild(MaterialButton materialButton) {
    }

    private static void updateBuilderWithCornerData(ShapeAppearanceModel.Builder builder, CornerData cornerData) {
    }

    private void updateCheckedIds(Set<Integer> set) {
    }

    private void updateChildOrder() {
    }

    public void addOnButtonCheckedListener(OnButtonCheckedListener onButtonCheckedListener) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
    }

    public void check(int i) {
    }

    public void clearChecked() {
    }

    public void clearOnButtonCheckedListeners() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    public int getCheckedButtonId() {
    }

    public List<Integer> getCheckedButtonIds() {
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
    }

    public boolean isSelectionRequired() {
    }

    public boolean isSingleSelection() {
    }

    void onButtonCheckedStateChanged(MaterialButton materialButton, boolean z) {
    }

    @Override // android.view.View
    protected void onFinishInflate() {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
    }

    public void removeOnButtonCheckedListener(OnButtonCheckedListener onButtonCheckedListener) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setSelectionRequired(boolean z) {
    }

    public void setSingleSelection(boolean z) {
    }

    public void uncheck(int i) {
    }

    void updateChildShapes() {
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
    }

    public void setSingleSelection(int i) {
    }
}
