package androidx.preference;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.List;
import p000.fg1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class PreferenceGroup extends Preference {
    private boolean bddbppbdHQMVgPvQSDhmnXZYkDh1ll111;
    private final Runnable bpbbpbppqsLrtEPjeDMEnOv1l1l1;
    private final List<Preference> bpbqbqdqqjASPQfJSXuVkkgll1lll1ll;
    final fg1<String, Long> bpqpbicsQtfVpOtr11l1l;
    private dpbdbdpbLwkLpObyKsq1lll1 pbdbqZLBIrMLYk1l11l1ll1;
    private int pbddqdbpoVvTyZPOoYl1111;
    private boolean ppppqdfPOyVswFHMTylxLClll1l1111;
    private final Handler qbpbbZWTnlDkwOgZlllll;
    private int qddbbpxsbNjqxvn111ll;

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
        final /* synthetic */ PreferenceGroup dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(PreferenceGroup preferenceGroup) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public interface dpbdbdpbLwkLpObyKsq1lll1 {
        void dbpqdHhmDSIHIJiwc1ll1l1();
    }

    public interface dqqppqiKzJi1l1lll1l {
        int dpbdbdpbLwkLpObyKsq1lll1(Preference preference);

        int ppbdpwWWljzmXXdHNabfWhgjl111l11(String str);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    private boolean qddqdbuvJUsrNuNes11111lll1(Preference preference) {
    }

    public void bbdbbNgXIvtfDESTvydOl11lll(int i) {
    }

    @Override // androidx.preference.Preference
    protected void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(Parcelable parcelable) {
    }

    public int bddqqdpgLnHt1ll1l1l() {
    }

    public int bdpqbqqdpVtpTLhDYl11ll1l() {
    }

    @Override // androidx.preference.Preference
    protected void bpdqqiQNVROMLC1ll1l1l11(Bundle bundle) {
    }

    @Override // androidx.preference.Preference
    public void bpqpbicsQtfVpOtr11l1l() {
    }

    void bqbpbxbDWbYusagGEGEkKZ1ll1l1() {
    }

    public Preference bqpqpbCjWyZxLLtQbYeCDl1l11(int i) {
    }

    public void bqqqqKuUKQfBoZwqWsGJYYlll111(boolean z) {
    }

    public <T extends Preference> T dbbddpAOiFIsWEXHFvDl11ll1(CharSequence charSequence) {
    }

    protected boolean dpppqdppqSnABbIYdrll1lll11ll() {
    }

    public boolean dqdppbTIDavqwXzOuQmLoejlll1l(Preference preference) {
    }

    public void pbdpdbqqdJtdUmQAgX1llll1(Preference preference) {
    }

    public dpbdbdpbLwkLpObyKsq1lll1 pbpdbpqdpIXNqwSGhm111ll1() {
    }

    @Override // androidx.preference.Preference
    protected void ppbdpwWWljzmXXdHNabfWhgjl111l11(Bundle bundle) {
    }

    @Override // androidx.preference.Preference
    public void ppdqqzXJzQiU11ll11(boolean z) {
    }

    protected boolean pppqdppdpWhurwZr1l1111l1(Preference preference) {
    }

    @Override // androidx.preference.Preference
    protected Parcelable qddbbpxsbNjqxvn111ll() {
    }

    @Override // androidx.preference.Preference
    public void qqdbbfmUWwoYYpfYHJZdaUO1111llll() {
    }

    public boolean qqqpbbqdUOEcdwaGGHQOKYwGi1l1l1l1l1(Preference preference) {
    }

    static class dpbdpqRKAscW1lll1l extends Preference.dpbdbdpbLwkLpObyKsq1lll1 {
        public static final Parcelable.Creator<dpbdpqRKAscW1lll1l> CREATOR = null;
        int dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.Creator<dpbdpqRKAscW1lll1l> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dpbdpqRKAscW1lll1l createFromParcel(Parcel parcel) {
            }

            public dpbdpqRKAscW1lll1l dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public dpbdpqRKAscW1lll1l[] dpbdbdpbLwkLpObyKsq1lll1(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dpbdpqRKAscW1lll1l[] newArray(int i) {
            }
        }

        dpbdpqRKAscW1lll1l(Parcel parcel) {
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        dpbdpqRKAscW1lll1l(Parcelable parcelable, int i) {
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
    }
}
