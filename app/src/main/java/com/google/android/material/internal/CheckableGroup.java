package com.google.android.material.internal;

import android.view.ViewGroup;
import com.google.android.material.internal.MaterialCheckable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables;
    private final Set<Integer> checkedIds;
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    /* renamed from: com.google.android.material.internal.CheckableGroup$1 */
    class C03681 implements MaterialCheckable.OnCheckedChangeListener<T> {
        final /* synthetic */ CheckableGroup this$0;

        C03681(CheckableGroup checkableGroup) {
        }

        @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
        public /* bridge */ /* synthetic */ void onCheckedChanged(Object obj, boolean z) {
        }

        public void onCheckedChanged(T t, boolean z) {
        }
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(Set<Integer> set);
    }

    static /* synthetic */ boolean access$000(CheckableGroup checkableGroup, MaterialCheckable materialCheckable) {
    }

    static /* synthetic */ boolean access$100(CheckableGroup checkableGroup) {
    }

    static /* synthetic */ boolean access$200(CheckableGroup checkableGroup, MaterialCheckable materialCheckable, boolean z) {
    }

    static /* synthetic */ void access$300(CheckableGroup checkableGroup) {
    }

    private boolean checkInternal(MaterialCheckable<T> materialCheckable) {
    }

    private void onCheckedStateChanged() {
    }

    private boolean uncheckInternal(MaterialCheckable<T> materialCheckable, boolean z) {
    }

    public void addCheckable(T t) {
    }

    public void check(int i) {
    }

    public void clearCheck() {
    }

    public Set<Integer> getCheckedIds() {
    }

    public List<Integer> getCheckedIdsSortedByChildOrder(ViewGroup viewGroup) {
    }

    public int getSingleCheckedId() {
    }

    public boolean isSelectionRequired() {
    }

    public boolean isSingleSelection() {
    }

    public void removeCheckable(T t) {
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
    }

    public void setSelectionRequired(boolean z) {
    }

    public void setSingleSelection(boolean z) {
    }

    public void uncheck(int i) {
    }
}
