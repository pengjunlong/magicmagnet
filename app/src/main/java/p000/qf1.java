package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreference;
import com.magicmagnet.data.db.AriaServer;
import io.realm.bppbpdbCeZVhQNTixBml1lll11l;
import io.realm.pdpqbmApOBCmNMwnn1ll111;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class qf1 extends androidx.preference.dpbdpqRKAscW1lll1l {
    private ListPreference bbdbbpdOJSuInlll111l;
    private ListPreference bdddqmITkkeGpsxVXHR1l1llll;
    private final t51 bdpdqYMMfHmzHyUIbllllll1;
    private final int bpbbpOxqjGWQAsycX11ll1l1;
    private ListPreference bpdqqiQNVROMLC1ll1l1l11;
    private Preference bppbpdbCeZVhQNTixBml1lll11l;
    private ListPreference bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private final f41<pdpqbmApOBCmNMwnn1ll111<AriaServer>> bpppqdQjfPiCT111111111;
    private final Preference.bpdqqiQNVROMLC1ll1l1l11 bpqbbqTOKdRXac1ll1l1lll;
    private HashMap<String, String> bpqdqbqpviKiORjqgp1l111l11;
    private Preference dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private Preference dbbpdqqpdVUhpQ1ll11;
    private pdpqbmApOBCmNMwnn1ll111<AriaServer> dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private SwitchPreference dbppbdqpeLmcbs11l11;
    private SharedPreferences ddbbbeXHXx111ll;
    private final y40 dddbpbpNqzZZJmSG1111l;
    private final HashMap<Preference, AriaServer> ddddbbdqIccDnEitQc1l1l1l;
    private Preference ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private Preference dpbdpqRKAscW1lll1l;
    private ListPreference dqdqbpQposEBDyDxIyyz1ll11;
    private Preference dqpdbEevAufTOvPphbjykClll1l11;
    private Preference dqpqqqbqQyjyB11111l1;
    private boolean dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private MultiSelectListPreference pbppbpqbamJRy11l1l1;
    private final y40 pdpqbmApOBCmNMwnn1ll111;
    private Preference ppbdpwWWljzmXXdHNabfWhgjl111l11;
    public Map<Integer, View> ppdqqzXJzQiU11ll11;
    private Preference qbddqbdJBkudFfhX1ll1l111;
    private Preference qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private SwitchPreference qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private AlertDialog qbpbddbpyaPAbpThgWCvm11l11l1;
    private SwitchPreference qdqdpyALEmZFGGaahRTIU1ll11;
    private final int qppqdpppIauLKaAtRkB11111l;
    private final t51 qqpbppebHUxqEmlGoAJWl1lll;

    @xc0
    static final class bdddqmITkkeGpsxVXHR1l1llll extends v40 implements qh<Object> {
        public static final bdddqmITkkeGpsxVXHR1l1llll dpbdpqRKAscW1lll1l = null;

        bdddqmITkkeGpsxVXHR1l1llll() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class bpdqqiQNVROMLC1ll1l1l11 extends v40 implements gi<DialogInterface, Integer, mv1> {
        final /* synthetic */ qf1 dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(qf1 qf1Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(DialogInterface dialogInterface, int i) {
        }

        @Override // p000.gi
        public /* bridge */ /* synthetic */ mv1 ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(DialogInterface dialogInterface, Integer num) {
        }
    }

    @xc0
    static final class dbppbdqpeLmcbs11l11 extends v40 implements qh<Object> {
        public static final dbppbdqpeLmcbs11l11 dpbdpqRKAscW1lll1l = null;

        dbppbdqpeLmcbs11l11() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<PreferenceCategory> {
        final /* synthetic */ qf1 dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(qf1 qf1Var) {
        }

        public final PreferenceCategory dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ PreferenceCategory invoke() {
        }
    }

    @xc0
    static final class ddbbbeXHXx111ll extends v40 implements qh<Object> {
        public static final ddbbbeXHXx111ll dpbdpqRKAscW1lll1l = null;

        ddbbbeXHXx111ll() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll extends v40 implements qh<Object> {
        public static final ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll dpbdpqRKAscW1lll1l = null;

        ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class dpbdbdpbLwkLpObyKsq1lll1 extends v40 implements qh<Object> {
        public static final dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l = null;

        dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class dpbdpqRKAscW1lll1l extends v40 implements sh<sa0, mv1> {
        final /* synthetic */ qf1 dpbdpqRKAscW1lll1l;

        @Metadata
        static final class dbpqdHhmDSIHIJiwc1ll1l1 extends v40 implements qh<mv1> {
            final /* synthetic */ qf1 dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(qf1 qf1Var) {
            }

            public final void dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // p000.qh
            public /* bridge */ /* synthetic */ mv1 invoke() {
            }
        }

        dpbdpqRKAscW1lll1l(qf1 qf1Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(sa0 sa0Var) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(sa0 sa0Var) {
        }
    }

    @Metadata
    static final class dqdqbpQposEBDyDxIyyz1ll11 extends v40 implements qh<bppbpdbCeZVhQNTixBml1lll11l> {
        public static final dqdqbpQposEBDyDxIyyz1ll11 dpbdpqRKAscW1lll1l = null;

        dqdqbpQposEBDyDxIyyz1ll11() {
        }

        public final bppbpdbCeZVhQNTixBml1lll11l dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ bppbpdbCeZVhQNTixBml1lll11l invoke() {
        }
    }

    @xc0
    static final class dqpdbEevAufTOvPphbjykClll1l11 extends v40 implements qh<Object> {
        public static final dqpdbEevAufTOvPphbjykClll1l11 dpbdpqRKAscW1lll1l = null;

        dqpdbEevAufTOvPphbjykClll1l11() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class dqpqqqbqQyjyB11111l1 extends v40 implements qh<Object> {
        public static final dqpqqqbqQyjyB11111l1 dpbdpqRKAscW1lll1l = null;

        dqpqqqbqQyjyB11111l1() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class dqqppqiKzJi1l1lll1l extends v40 implements sh<sa0, mv1> {
        public static final dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l = null;

        dqqppqiKzJi1l1lll1l() {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1(sa0 sa0Var) {
        }

        @Override // p000.sh
        public /* bridge */ /* synthetic */ mv1 invoke(sa0 sa0Var) {
        }
    }

    @xc0
    static final class pbppbpqbamJRy11l1l1 extends v40 implements qh<Object> {
        public static final pbppbpqbamJRy11l1l1 dpbdpqRKAscW1lll1l = null;

        pbppbpqbamJRy11l1l1() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @Metadata
    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends v40 implements qh<mv1> {
        final /* synthetic */ qf1 dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(qf1 qf1Var) {
        }

        public final void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // p000.qh
        public /* bridge */ /* synthetic */ mv1 invoke() {
        }
    }

    @xc0
    static final class qbddqbdJBkudFfhX1ll1l111 extends v40 implements qh<Object> {
        final /* synthetic */ pdpqbmApOBCmNMwnn1ll111<AriaServer> dpbdpqRKAscW1lll1l;

        qbddqbdJBkudFfhX1ll1l111(pdpqbmApOBCmNMwnn1ll111<AriaServer> pdpqbmapobcmnmwnn1ll111) {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    @xc0
    static final class qbdpqpstJKhhKkXrsOGvbWw1l1llll extends v40 implements qh<Object> {
        public static final qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l = null;

        qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
        }

        @Override // p000.qh
        public final Object invoke() {
        }
    }

    private static final void bbbbqbqdppWJqwUrzOvzCyynHqslll1l(qf1 qf1Var, DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ void bbbddbppbHkZyStOxwRl1lll1(qf1 qf1Var, pdpqbmApOBCmNMwnn1ll111 pdpqbmapobcmnmwnn1ll111, AriaServer ariaServer, DialogInterface dialogInterface, int i) {
    }

    private static final boolean bbbpbdqpbcaiJFLILHVgrofkL1l1l1l(Preference preference) {
    }

    public static /* synthetic */ boolean bbdpdpbqqKUJRGenrYmXhiuAY1l111(qf1 qf1Var, Preference preference) {
    }

    private static final void bbpbppdbyWAgVaIRmPOgsLl1ll1111l(DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ boolean bbpdpppbUguqPPWzZvAwKR1lll11ll(qf1 qf1Var, Preference preference) {
    }

    public static /* synthetic */ void bbpqddpdpMWPNcLVjpAOBLtzBwll1l1(DialogInterface dialogInterface, int i) {
    }

    private static final void bbqpqppQWI1llllll1l(DialogInterface dialogInterface, int i) {
    }

    private static final void bdbddpbwjddaHll1l1(qf1 qf1Var, AriaServer ariaServer, View view) {
    }

    public static /* synthetic */ boolean bdpbpsDcyJTPrj1lll11(Preference preference) {
    }

    public static /* synthetic */ boolean bdpqbmWvwOSl1111(qf1 qf1Var, Preference preference, Object obj) {
    }

    private static final void bdqddpbdHdAXdLWTdGIMpzClllll11(qf1 qf1Var, Boolean bool) {
    }

    private static final boolean bdqqdqDqtua11l11l1(qf1 qf1Var, Preference preference) {
    }

    private final void bpbpqbqdpJnMXABHXnGl1ll11lll() {
    }

    private static final boolean bpdbdpbdbSgOKZVkhOgPfvUtl11l1l11(Preference preference, Object obj) {
    }

    private static final boolean bpdbpdqbSDCYKyFxRFDrXOojll111(Preference preference) {
    }

    private static final boolean bpdddqdbdIHjDsl1ll1ll(qf1 qf1Var, Preference preference) {
    }

    private static final boolean bppqppdMchpThwHisjikcod1ll11(qf1 qf1Var, Preference preference) {
    }

    private static final boolean bppqpqdImdXYlgl111l11l(qf1 qf1Var, Preference preference) {
    }

    private final void bqdbqqAlarZsSbAl1ll1l() {
    }

    private static final boolean bqdbqqpbqTPejjypqgplll1ll1l1(qf1 qf1Var, Preference preference) {
    }

    public static /* synthetic */ boolean bqppbbbqLsCdM1llll(qf1 qf1Var, Preference preference) {
    }

    public static /* synthetic */ void bqpqdNBFMzNEiipaXQPl11l11ll(DialogInterface dialogInterface, int i) {
    }

    public static final /* synthetic */ SwitchPreference bqpqpdRGoNS1ll1111l1(qf1 qf1Var) {
    }

    private static final boolean bqqqdboFHPLTwaMWMSXnDNNlll11l1(qf1 qf1Var, Preference preference, Object obj) {
    }

    private static final boolean dbqpqqqDeeyyCuJnUmGLGcbvl11l11(qf1 qf1Var, Preference preference, Object obj) {
    }

    private static final void ddbbbbdqpIQmIAbUVaWLdbEll1l1111(View view, CompoundButton compoundButton, boolean z) {
    }

    static /* synthetic */ void ddbppbpdbjhGMwFHhQLuACGxTll1ll11l(qf1 qf1Var, AriaServer ariaServer, int i, Object obj) {
    }

    public static /* synthetic */ boolean ddqddbKRuFDcoInll11ll11(qf1 qf1Var, Preference preference) {
    }

    public static /* synthetic */ boolean dpbqpXiNmkuFJMoGemM1llll1ll1(List list, Preference preference, Object obj) {
    }

    private static final void dpddppbpssQkdaWsxnuFll1l1(qf1 qf1Var, pdpqbmApOBCmNMwnn1ll111 pdpqbmapobcmnmwnn1ll111) {
    }

    private final void dpqqbbuANGlaBCDTaRbQLms1111l11(pdpqbmApOBCmNMwnn1ll111<AriaServer> pdpqbmapobcmnmwnn1ll111) {
    }

    private static final boolean dpqqpqonhvzMuzONUGiUa111l11l11(qf1 qf1Var, Preference preference) {
    }

    public static /* synthetic */ boolean dqbbbarhSjFxjxEEl1ll11(qf1 qf1Var, Preference preference) {
    }

    public static /* synthetic */ boolean dqbbdbpqbvChgeruisCbWCnl11lllll(Preference preference, Object obj) {
    }

    public static /* synthetic */ void dqbpbqXLoKDkRdCKHlKfl11llll1l(DialogInterface dialogInterface, int i) {
    }

    private static final boolean dqbqdqdpdDjmBPUzEkoOlll1l1llll(qf1 qf1Var, Preference preference, Object obj) {
    }

    private final void dqdbdbddbsXTuiebVrav1l11111l1(String str) {
    }

    public static /* synthetic */ void dqpqbdWhIsNIidXUell11l111(qf1 qf1Var, String str, Activity activity, Uri uri) {
    }

    private static final boolean dqqdbdpbqDDIkmksEKxFufZKgZ1l1l11lll(qf1 qf1Var, Preference preference, Object obj) {
    }

    private static final void dqqpdbqqRQNrLXyCEsRll1111l(DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ void pbbbqppqTbuPhHQEDqbrOKDl11ll1(DialogInterface dialogInterface, int i) {
    }

    private final void pbdqqlSueJKUgejs11lllll1l() {
    }

    private final void pbpbbdbDgqWVllll11l(AriaServer ariaServer) {
    }

    public static /* synthetic */ void pbpqbdqbgDbTEaTebvZl111l1l1l(qf1 qf1Var, AriaServer ariaServer, View view) {
    }

    public static /* synthetic */ void pbpqqqqFBwYCJOfRsCpOLdMl11l11l11(qf1 qf1Var, pdpqbmApOBCmNMwnn1ll111 pdpqbmapobcmnmwnn1ll111) {
    }

    public static /* synthetic */ boolean pbqbdpDzmUH1l1ll(qf1 qf1Var, Preference preference, Object obj) {
    }

    public static /* synthetic */ boolean pbqdbbLIoUwreKSxbxAll11ll(qf1 qf1Var, Preference preference, Object obj) {
    }

    private static final boolean pdddbdppbXDXrwiTFfril111ll1(List list, Preference preference, Object obj) {
    }

    public static /* synthetic */ void pddpddbdIotonl1ll1l11(View view, CompoundButton compoundButton, boolean z) {
    }

    private static final boolean pddqdpdfpNEYjzViyCS111ll(qf1 qf1Var, Preference preference) {
    }

    @SuppressLint({"MissingPermission"})
    private final void pdpdqqdusMOjculBX1111l11() {
    }

    private static final void pdqpdddqVdiDmDB1ll1ll(DialogInterface dialogInterface, int i) {
    }

    private static final void pqdpbdbMIFQJSTVxZl11ll111l(qf1 qf1Var, AriaServer ariaServer, View view) {
    }

    public static /* synthetic */ boolean pqppppegKDAsRqZIkSmKphiLl1l111l1(qf1 qf1Var, Preference preference) {
    }

    private static final boolean qbbpqRDtzbBqlll1l(qf1 qf1Var, Preference preference, Object obj) {
    }

    private static final boolean qbbqppqqFyNGaQFr1l1l11(qf1 qf1Var, Preference preference, Object obj) {
    }

    public static /* synthetic */ boolean qbdpbdotUKqbANmgeJETNyAM1l111(qf1 qf1Var, Preference preference, Object obj) {
    }

    public static /* synthetic */ void qbqddbqpnPHFHyPasib1l1ll11ll(qf1 qf1Var, AriaServer ariaServer, View view) {
    }

    private final bppbpdbCeZVhQNTixBml1lll11l qbqqdoZvfpl1l111ll() {
    }

    private final void qdbbdhsmdYJSqeHT1111ll1l(AriaServer ariaServer) {
    }

    public static /* synthetic */ void qddbbdbhYkPuzADhZsZuZo1ll11l(qf1 qf1Var, Boolean bool) {
    }

    public static /* synthetic */ void qddqpzYVacW1llllll(View view, CompoundButton compoundButton, boolean z) {
    }

    public static /* synthetic */ boolean qdpbqymSOslll11l(qf1 qf1Var, Preference preference) {
    }

    public static /* synthetic */ boolean qdppdqpdjZLhPwmBZxlfll11l1(qf1 qf1Var, Preference preference) {
    }

    private final boolean qdpqqddfnOtUxPENkGSNa1111ll1l1(AriaServer ariaServer) {
    }

    private static final void qdqddftZvRmltIahaEHKjU1l11ll1l1(qf1 qf1Var, String str, Activity activity, Uri uri) {
    }

    private final void qpbbdddeJUjFZrllll11ll() {
    }

    private static final boolean qpbdqjmuGiXlll1lll11(Preference preference, Object obj) {
    }

    public static /* synthetic */ boolean qpbpqyVmtiFZEJ11ll1l(qf1 qf1Var, Preference preference, Object obj) {
    }

    public static /* synthetic */ void qpdpdszwYFiQbkll1ll(qf1 qf1Var, DialogInterface dialogInterface, int i) {
    }

    public static /* synthetic */ boolean qpdqbdPyEdYfPapCpapvHHNll1lll1ll(Preference preference, Object obj) {
    }

    static /* synthetic */ void qppqqpikNLfoKXdLaUfupiCllllll1l1(qf1 qf1Var, pdpqbmApOBCmNMwnn1ll111 pdpqbmapobcmnmwnn1ll111, int i, Object obj) {
    }

    public static /* synthetic */ boolean qpqqbbppqEgWHdoNWoll11l1l1l(Preference preference) {
    }

    private static final void qqbqbpsKECLkNpMSYTJWTcuk11l11(View view, CompoundButton compoundButton, boolean z) {
    }

    private static final void qqpbbbpElrBCTDfMihU11111(qf1 qf1Var, pdpqbmApOBCmNMwnn1ll111 pdpqbmapobcmnmwnn1ll111, AriaServer ariaServer, DialogInterface dialogInterface, int i) {
    }

    private static final boolean qqqbbqRaDWEaifHrXcEBrw1ll1l1(qf1 qf1Var, Preference preference) {
    }

    public static /* synthetic */ boolean qqqdbddwLHHSrqKnVcHujUhU1llll(qf1 qf1Var, Preference preference, Object obj) {
    }

    @eo1(priority = 1, sticky = true, threadMode = ThreadMode.MAIN)
    public final void foundNewVersion(yj0 yj0Var) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // androidx.preference.dpbdpqRKAscW1lll1l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.preference.dpbdpqRKAscW1lll1l
    public void onCreatePreferences(Bundle bundle, String str) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // androidx.preference.dpbdpqRKAscW1lll1l, androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Override // androidx.preference.dpbdpqRKAscW1lll1l, androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // androidx.preference.dpbdpqRKAscW1lll1l, androidx.fragment.app.Fragment
    public void onStop() {
    }

    @Override // androidx.preference.dpbdpqRKAscW1lll1l, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }

    public void pbqddddDusqnIBFOMWnENLpll1111() {
    }

    public final PreferenceCategory qbqqdqdboCzbEGhywRrZi1lll1l1l() {
    }
}
