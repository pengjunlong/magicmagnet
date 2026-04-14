package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11;
import androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11;
import androidx.appcompat.view.menu.dqpqqqbqQyjyB11111l1;
import androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1;
import androidx.appcompat.view.menu.qbdpqpstJKhhKkXrsOGvbWw1l1llll;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class NavigationBarPresenter implements dbppbdqpeLmcbs11l11 {
    private int id;
    private bpdqqiQNVROMLC1ll1l1l11 menu;
    private NavigationBarMenuView menuView;
    private boolean updateSuspended;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$1 */
        class C03941 implements Parcelable.Creator<SavedState> {
            C03941() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        SavedState(Parcel parcel) {
        }
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public boolean collapseItemActionView(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public boolean expandItemActionView(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public boolean flagActionItems() {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public int getId() {
    }

    public pbppbpqbamJRy11l1l1 getMenuView(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void initForMenu(Context context, bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void onCloseMenu(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public Parcelable onSaveInstanceState() {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public boolean onSubMenuSelected(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void setCallback(dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    public void setId(int i) {
    }

    public void setMenuView(NavigationBarMenuView navigationBarMenuView) {
    }

    public void setUpdateSuspended(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11
    public void updateMenuView(boolean z) {
    }
}
