package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
import java.util.Set;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
import p000.sv0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class Preference implements Comparable<Preference> {
    private String bbdbbpdOJSuInlll111l;
    private int bdddqmITkkeGpsxVXHR1l1llll;
    private int bdpdqYMMfHmzHyUIbllllll1;
    private final View.OnClickListener bdqbblVddTYAmqrWwacZmi111ll1;
    private boolean bpbbpOxqjGWQAsycX11ll1l1;
    private boolean bpdddqbpEtpkwNYukGjjNs1l111;
    private androidx.preference.dqpqqqbqQyjyB11111l1 bpdqqiQNVROMLC1ll1l1l11;
    private boolean bppbpdbCeZVhQNTixBml1lll11l;
    private boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private boolean bpppqdQjfPiCT111111111;
    private ppbdpwWWljzmXXdHNabfWhgjl111l11 bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
    private boolean bpqbbqTOKdRXac1ll1l1lll;
    private boolean bpqdqbqpviKiORjqgp1l111l11;
    private Intent dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private Bundle dbbpdqqpdVUhpQ1ll11;
    private boolean dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private int dbppbdqpeLmcbs11l11;
    private dpbdpqRKAscW1lll1l ddbbbeXHXx111ll;
    private boolean dddbpbpNqzZZJmSG1111l;
    private boolean ddddbbdqIccDnEitQc1l1l1l;
    private CharSequence ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private final Context dpbdpqRKAscW1lll1l;
    private boolean dpbdqAKWNZAIXLyehU1lll1lll1;
    private dqpqqqbqQyjyB11111l1 dqbbdddqpLERmaRLiHiDpL1l1l1l;
    private Drawable dqdqbpQposEBDyDxIyyz1ll11;
    private bpdqqiQNVROMLC1ll1l1l11 dqpdbEevAufTOvPphbjykClll1l11;
    private boolean dqpqqqbqQyjyB11111l1;
    private boolean dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private int pbppbpqbamJRy11l1l1;
    private boolean pdpqbmApOBCmNMwnn1ll111;
    private long ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private dqqppqiKzJi1l1lll1l ppdqqzXJzQiU11ll11;
    private String qbddqbdJBkudFfhX1ll1l111;
    private CharSequence qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private boolean qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private boolean qbpbddbpyaPAbpThgWCvm11l11l1;
    private String qdqdpyALEmZFGGaahRTIU1ll11;
    private Object qppqdpppIauLKaAtRkB11111l;
    private List<Preference> qqbqbddiRRgLpniPxlUfQzP1l1l1l;
    private PreferenceGroup qqdbbfmUWwoYYpfYHJZdaUO1111llll;
    private int qqpbppebHUxqEmlGoAJWl1lll;

    public interface bpdqqiQNVROMLC1ll1l1l11 {
        boolean onPreferenceClick(Preference preference);
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements View.OnClickListener {
        final /* synthetic */ Preference dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(Preference preference) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static class dpbdbdpbLwkLpObyKsq1lll1 extends AbsSavedState {
        public static final Parcelable.Creator<dpbdbdpbLwkLpObyKsq1lll1> CREATOR = null;

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

        public dpbdbdpbLwkLpObyKsq1lll1(Parcel parcel) {
        }

        public dpbdbdpbLwkLpObyKsq1lll1(Parcelable parcelable) {
        }
    }

    public interface dpbdpqRKAscW1lll1l {
        boolean onPreferenceChange(Preference preference, Object obj);
    }

    public interface dqpqqqbqQyjyB11111l1<T extends Preference> {
        CharSequence dbpqdHhmDSIHIJiwc1ll1l1(T t);
    }

    interface dqqppqiKzJi1l1lll1l {
        void dbpqdHhmDSIHIJiwc1ll1l1(Preference preference);

        void dpbdpqRKAscW1lll1l(Preference preference);

        void dqqppqiKzJi1l1lll1l(Preference preference);
    }

    private static class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        private final Preference dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(Preference preference) {
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    private void bdqpqbqbgFttbl1ll1l() {
    }

    private void dpdqpXgfqpODrtwusppe1l1l1l1ll(SharedPreferences.Editor editor) {
    }

    private void dqpqqqbqQyjyB11111l1() {
    }

    private void pbbpbqqbKSyiLKXJmkvAl11lll1ll(Preference preference) {
    }

    private void pbpqpdqpDkfTMiEll11l11l() {
    }

    private void pdpqqbqbpFAaViLnU1l1ll11l1(Preference preference) {
    }

    private void qpbqqHZCUeoATyA11ll1l1(View view, boolean z) {
    }

    public PreferenceGroup bbdbbpdOJSuInlll111l() {
    }

    protected void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(Parcelable parcelable) {
    }

    public Intent bdddqmITkkeGpsxVXHR1l1llll() {
    }

    protected void bdpdqYMMfHmzHyUIbllllll1() {
    }

    public void bdqbblVddTYAmqrWwacZmi111ll1(Preference preference, boolean z) {
    }

    public SharedPreferences bpbbpOxqjGWQAsycX11ll1l1() {
    }

    @Deprecated
    protected void bpbbpbppqsLrtEPjeDMEnOv1l1l1(boolean z, Object obj) {
    }

    @Deprecated
    public void bpbqbqdqqjASPQfJSXuVkkgll1lll1ll(dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
    }

    protected void bpdddqbpEtpkwNYukGjjNs1l111(androidx.preference.dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1, long j) {
    }

    void bpdqqiQNVROMLC1ll1l1l11(Bundle bundle) {
    }

    protected int bppbpdbCeZVhQNTixBml1lll11l(int i) {
    }

    public Set<String> bpppdpppqFAXRSTHUAmVJLvH11lllll1l(Set<String> set) {
    }

    public boolean bpppqdQjfPiCT111111111() {
    }

    public void bppqdpqbpvFfYvVMQwal1l1l1(Object obj) {
    }

    public void bpqbbpqpqkDmeOUxxUylkHyYgWv11111(ddbbbeXHXx111ll ddbbbexhxx111ll) {
    }

    public boolean bpqbbqTOKdRXac1ll1l1lll() {
    }

    public final void bpqbdddbQzWMiIJFWdSJrGCER1l1l11ll(dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    public final dqpqqqbqQyjyB11111l1 bpqdqbqpviKiORjqgp1l111l11() {
    }

    public void bpqpbicsQtfVpOtr11l1l() {
    }

    public void bqdbpBvxFUC1lll11() {
    }

    protected boolean bqdppdGFpODiqhzhhiaXKl11l1(String str) {
    }

    public void bqppqdRbgUpzcKwrjaSh1lll1l11(CharSequence charSequence) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Preference preference) {
    }

    public int dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
    }

    protected boolean dbbpdqqpdVUhpQ1ll11(boolean z) {
    }

    public void dbdpqdqbxaVJPXHgWAxfdYMEQF1111l(CharSequence charSequence) {
    }

    public CharSequence dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1() {
    }

    public Bundle dbppbdqpeLmcbs11l11() {
    }

    public void dbppbpzxVnfullll1(Drawable drawable) {
    }

    void dbpqdHhmDSIHIJiwc1ll1l1(PreferenceGroup preferenceGroup) {
    }

    public boolean dbqbbqpdqHtvJXil111l1ll() {
    }

    protected <T extends Preference> T ddbbbeXHXx111ll(String str) {
    }

    public CharSequence dddbpbpNqzZZJmSG1111l() {
    }

    public final int ddddbbdqIccDnEitQc1l1l1l() {
    }

    public void ddpbddGpKmMvSPZaXEkLg11l11(int i) {
    }

    protected boolean ddppqbqqbIhInevqvPYIBnGmBIE111lll(int i) {
    }

    public String ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
    }

    public boolean dpbdbdpbLwkLpObyKsq1lll1(Object obj) {
    }

    public void dpbdppqbVlmCUMWETyfoYOI1l11l1l(int i) {
    }

    public int dpbdpqRKAscW1lll1l(Preference preference) {
    }

    protected void dpbdqAKWNZAIXLyehU1lll1lll1(androidx.preference.dqpqqqbqQyjyB11111l1 dqpqqqbqqyjyb11111l1) {
    }

    public void dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1(Bundle bundle) {
    }

    public void dpdqqbdppwRMsRSyLKfcWKCxeblll11ll11(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    protected void dqbbdddqpLERmaRLiHiDpL1l1l1l() {
    }

    public final void dqbdbtYbcXnOwavgobEX1111l(boolean z) {
    }

    public String dqdqbpQposEBDyDxIyyz1ll11() {
    }

    public Context dqpdbEevAufTOvPphbjykClll1l11() {
    }

    public boolean dqqpbqaYiRPLeqRCYteXfDW1l111l11l() {
    }

    final void dqqppqiKzJi1l1lll1l() {
    }

    protected void pbdbqZLBIrMLYk1l11l1ll1(Object obj) {
    }

    protected void pbddqdbpoVvTyZPOoYl1111() {
    }

    final void pbpbpmdJpqmdGNwEepmjpVlll11l1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    StringBuilder pbppbpqbamJRy11l1l1() {
    }

    public void pdpppduUgcghSRP11l11l(int i) {
    }

    public boolean pdpqbmApOBCmNMwnn1ll111() {
    }

    public void pdqbbpCQzQWOl111l1(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
    }

    protected boolean pdqdddDNpMbeVT11ll11(boolean z) {
    }

    public void ppbddpbbYwysRtaAnAwzNYP11l11111l(boolean z) {
    }

    void ppbdpwWWljzmXXdHNabfWhgjl111l11(Bundle bundle) {
    }

    public void ppdqqzXJzQiU11ll11(boolean z) {
    }

    public void ppppqdfPOyVswFHMTylxLClll1l1111(Preference preference, boolean z) {
    }

    protected void pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l(View view) {
    }

    public void pqqqddFCECdWHkSTrqHcll111111l(Intent intent) {
    }

    protected boolean qbbqpzukjahUWUWfxIll11lll1() {
    }

    public boolean qbdbqqdbJdTsszXtJeXGasJIiGllll1l(Set<String> set) {
    }

    public final int qbddqbdJBkudFfhX1ll1l111() {
    }

    long qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
    }

    protected String qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(String str) {
    }

    protected Object qbpbbZWTnlDkwOgZlllll(TypedArray typedArray, int i) {
    }

    public boolean qbpbddbpyaPAbpThgWCvm11l11l1() {
    }

    public void qbqdqqqqdvTduGNll111l1(Bundle bundle) {
    }

    protected Parcelable qddbbpxsbNjqxvn111ll() {
    }

    public sv0 qdqdpyALEmZFGGaahRTIU1ll11() {
    }

    public void qpdbbbbbmKdyKHlllllll1(int i) {
    }

    public androidx.preference.dqpqqqbqQyjyB11111l1 qppqdpppIauLKaAtRkB11111l() {
    }

    protected void qqbqbddiRRgLpniPxlUfQzP1l1l1l() {
    }

    public void qqdbbfmUWwoYYpfYHJZdaUO1111llll() {
    }

    public final boolean qqpbppebHUxqEmlGoAJWl1lll() {
    }

    public String toString() {
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
    }

    public Preference(Context context, AttributeSet attributeSet) {
    }

    public Preference(Context context) {
    }
}
