package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface dbppbdqpeLmcbs11l11 {

    public interface dbpqdHhmDSIHIJiwc1ll1l1 {
        boolean dbpqdHhmDSIHIJiwc1ll1l1(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11);

        void onCloseMenu(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, boolean z);
    }

    boolean collapseItemActionView(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1);

    boolean expandItemActionView(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11);

    void onCloseMenu(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll);

    void setCallback(dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1);

    void updateMenuView(boolean z);
}
