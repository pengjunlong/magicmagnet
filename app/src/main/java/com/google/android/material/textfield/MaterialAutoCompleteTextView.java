package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class MaterialAutoCompleteTextView extends androidx.appcompat.widget.dpbdpqRKAscW1lll1l {
    private static final int MAX_ITEMS_MEASURED = 15;
    private final AccessibilityManager accessibilityManager;
    private final dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 modalListPopup;
    private final float popupElevation;
    private final int simpleItemLayout;
    private int simpleItemSelectedColor;
    private ColorStateList simpleItemSelectedRippleColor;
    private final Rect tempRect;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$1 */
    class C04741 implements AdapterView.OnItemClickListener {
        final /* synthetic */ MaterialAutoCompleteTextView this$0;

        C04741(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    private class MaterialArrayAdapter<T> extends ArrayAdapter<String> {
        private ColorStateList pressedRippleColor;
        private ColorStateList selectedItemRippleOverlaidColor;
        final /* synthetic */ MaterialAutoCompleteTextView this$0;

        MaterialArrayAdapter(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i, String[] strArr) {
        }

        private ColorStateList createItemSelectedColorStateList() {
        }

        private Drawable getSelectedItemDrawable() {
        }

        private boolean hasSelectedColor() {
        }

        private boolean hasSelectedRippleColor() {
        }

        private ColorStateList sanitizeDropdownItemSelectedRippleColor() {
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
        }

        void updateSelectedItemColorStateList() {
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
    }

    static /* synthetic */ dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 access$000(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
    }

    static /* synthetic */ void access$100(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
    }

    static /* synthetic */ int access$200(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
    }

    static /* synthetic */ ColorStateList access$300(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
    }

    private TextInputLayout findTextInputLayoutAncestor() {
    }

    private boolean isTouchExplorationEnabled() {
    }

    private int measureContentWidth() {
    }

    private void onInputTypeChanged() {
    }

    private <T extends ListAdapter & Filterable> void updateText(Object obj) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
    }

    public float getPopupElevation() {
    }

    public int getSimpleItemSelectedColor() {
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
    }

    public void setSimpleItemSelectedColor(int i) {
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
    }

    public void setSimpleItems(int i) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
    }

    public void setSimpleItems(String[] strArr) {
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
    }
}
