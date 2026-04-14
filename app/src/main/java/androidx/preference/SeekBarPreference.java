package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SeekBarPreference extends Preference {
    SeekBar bddbppbdHQMVgPvQSDhmnXZYkDh1ll111;
    private boolean bpbbpbppqsLrtEPjeDMEnOv1l1l1;
    private int bpbqbqdqqjASPQfJSXuVkkgll1lll1ll;
    int bpqpbicsQtfVpOtr11l1l;
    boolean bqdbpBvxFUC1lll11;
    boolean pbdbqZLBIrMLYk1l11l1ll1;
    boolean pbddqdbpoVvTyZPOoYl1111;
    private final View.OnKeyListener pdqdddDNpMbeVT11ll11;
    private int ppppqdfPOyVswFHMTylxLClll1l1111;
    private final SeekBar.OnSeekBarChangeListener pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l;
    int qbpbbZWTnlDkwOgZlllll;
    private TextView qddbbpxsbNjqxvn111ll;

    class dbpqdHhmDSIHIJiwc1ll1l1 implements SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ SeekBarPreference dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(SeekBarPreference seekBarPreference) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements View.OnKeyListener {
        final /* synthetic */ SeekBarPreference dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(SeekBarPreference seekBarPreference) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    private void bddqqdpgLnHt1ll1l1l(int i, boolean z) {
    }

    @Override // androidx.preference.Preference
    protected void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(Parcelable parcelable) {
    }

    @Override // androidx.preference.Preference
    public void bpqbbpqpqkDmeOUxxUylkHyYgWv11111(ddbbbeXHXx111ll ddbbbexhxx111ll) {
    }

    void bqpqpbCjWyZxLLtQbYeCDl1l11(int i) {
    }

    public void dbbddpAOiFIsWEXHFvDl11ll1(int i) {
    }

    @Override // androidx.preference.Preference
    protected void pbdbqZLBIrMLYk1l11l1ll1(Object obj) {
    }

    public final void pbdpdbqqdJtdUmQAgX1llll1(int i) {
    }

    void pbpdbpqdpIXNqwSGhm111ll1(SeekBar seekBar) {
    }

    @Override // androidx.preference.Preference
    protected Object qbpbbZWTnlDkwOgZlllll(TypedArray typedArray, int i) {
    }

    @Override // androidx.preference.Preference
    protected Parcelable qddbbpxsbNjqxvn111ll() {
    }

    public final void qqqpbbqdUOEcdwaGGHQOKYwGi1l1l1l1l1(int i) {
    }

    private static class dqqppqiKzJi1l1lll1l extends Preference.dpbdbdpbLwkLpObyKsq1lll1 {
        public static final Parcelable.Creator<dqqppqiKzJi1l1lll1l> CREATOR = null;
        int bpdqqiQNVROMLC1ll1l1l11;
        int dpbdpqRKAscW1lll1l;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.Creator<dqqppqiKzJi1l1lll1l> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dqqppqiKzJi1l1lll1l createFromParcel(Parcel parcel) {
            }

            public dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public dqqppqiKzJi1l1lll1l[] dpbdbdpbLwkLpObyKsq1lll1(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dqqppqiKzJi1l1lll1l[] newArray(int i) {
            }
        }

        dqqppqiKzJi1l1lll1l(Parcel parcel) {
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        dqqppqiKzJi1l1lll1l(Parcelable parcelable) {
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
    }
}
