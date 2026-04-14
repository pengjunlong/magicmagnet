package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.preference.Preference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class EditTextPreference extends DialogPreference {
    private dbpqdHhmDSIHIJiwc1ll1l1 pbdbqZLBIrMLYk1l11l1ll1;
    private String qddbbpxsbNjqxvn111ll;

    public interface dbpqdHhmDSIHIJiwc1ll1l1 {
        void dbpqdHhmDSIHIJiwc1ll1l1(EditText editText);
    }

    public static final class dqqppqiKzJi1l1lll1l implements Preference.dqpqqqbqQyjyB11111l1<EditTextPreference> {
        private static dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1;

        private dqqppqiKzJi1l1lll1l() {
        }

        public static dqqppqiKzJi1l1lll1l dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // androidx.preference.Preference.dqpqqqbqQyjyB11111l1
        public /* bridge */ /* synthetic */ CharSequence dbpqdHhmDSIHIJiwc1ll1l1(EditTextPreference editTextPreference) {
        }

        public CharSequence dqqppqiKzJi1l1lll1l(EditTextPreference editTextPreference) {
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    @Override // androidx.preference.Preference
    protected void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(Parcelable parcelable) {
    }

    dbpqdHhmDSIHIJiwc1ll1l1 bdpqbqqdpVtpTLhDYl11ll1l() {
    }

    @Override // androidx.preference.Preference
    public boolean dbqbbqpdqHtvJXil111l1ll() {
    }

    public String dpppqdppqSnABbIYdrll1lll11ll() {
    }

    @Override // androidx.preference.Preference
    protected void pbdbqZLBIrMLYk1l11l1ll1(Object obj) {
    }

    public void pppqdppdpWhurwZr1l1111l1(String str) {
    }

    @Override // androidx.preference.Preference
    protected Object qbpbbZWTnlDkwOgZlllll(TypedArray typedArray, int i) {
    }

    @Override // androidx.preference.Preference
    protected Parcelable qddbbpxsbNjqxvn111ll() {
    }

    private static class dpbdbdpbLwkLpObyKsq1lll1 extends Preference.dpbdbdpbLwkLpObyKsq1lll1 {
        public static final Parcelable.Creator<dpbdbdpbLwkLpObyKsq1lll1> CREATOR = null;
        String dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.Creator<dpbdbdpbLwkLpObyKsq1lll1> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 createFromParcel(Parcel parcel) {
            }

            public dpbdbdpbLwkLpObyKsq1lll1 dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public dpbdbdpbLwkLpObyKsq1lll1[] dpbdbdpbLwkLpObyKsq1lll1(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1[] newArray(int i) {
            }
        }

        dpbdbdpbLwkLpObyKsq1lll1(Parcel parcel) {
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        dpbdbdpbLwkLpObyKsq1lll1(Parcelable parcelable) {
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
    }
}
