package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.bdddqmITkkeGpsxVXHR1l1llll;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class CheckableImageButton extends bdddqmITkkeGpsxVXHR1l1llll implements Checkable {
    private static final int[] DRAWABLE_STATE_CHECKED = null;
    private boolean checkable;
    private boolean checked;
    private boolean pressable;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$1 */
    class C03691 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ CheckableImageButton this$0;

        C03691(CheckableImageButton checkableImageButton) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    static class SavedState extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        boolean checked;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$1 */
        class C03701 implements Parcelable.ClassLoaderCreator<SavedState> {
            C03701() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }
        }

        public SavedState(Parcelable parcelable) {
        }

        private void readFromParcel(Parcel parcel) {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public CheckableImageButton(Context context) {
    }

    public boolean isCheckable() {
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
    }

    public boolean isPressable() {
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    public void setCheckable(boolean z) {
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
    }

    public void setPressable(boolean z) {
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
    }
}
