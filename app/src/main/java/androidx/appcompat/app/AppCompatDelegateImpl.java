package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11;
import androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.dddbpbpNqzZZJmSG1111l;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import p000.bn0;
import p000.ddpppsnTvuMTCFFfnFiYul1111;
import p000.dpbdqAKWNZAIXLyehU1lll1lll1;
import p000.dqbbdbpqbvChgeruisCbWCnl11lllll;
import p000.dqbbdddqpLERmaRLiHiDpL1l1l1l;
import p000.fg1;
import p000.r22;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.dqqppqiKzJi1l1lll1l implements bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1, LayoutInflater.Factory2 {
    private static final boolean dbppbpzxVnfullll1 = false;
    private static boolean ddpbddGpKmMvSPZaXEkLg11l11;
    private static final fg1<String, Integer> ppbddpbbYwysRtaAnAwzNYP11l11111l = null;
    private static final boolean pqqqddFCECdWHkSTrqHcll111111l = false;
    private static final boolean qpbqqHZCUeoATyA11ll1l1 = false;
    private static final int[] qpdbbbbbmKdyKHlllllll1 = null;
    androidx.appcompat.app.dbpqdHhmDSIHIJiwc1ll1l1 bbdbbpdOJSuInlll111l;
    private int bddbppbdHQMVgPvQSDhmnXZYkDh1ll111;
    final Context bdddqmITkkeGpsxVXHR1l1llll;
    boolean bdpdqYMMfHmzHyUIbllllll1;
    private boolean bdqbblVddTYAmqrWwacZmi111ll1;
    private Rect bdqpqbqbgFttbl1ll1l;
    ActionBarContextView bpbbpOxqjGWQAsycX11ll1l1;
    private AutoNightModeManager bpbbpbppqsLrtEPjeDMEnOv1l1l1;
    boolean bpbqbqdqqjASPQfJSXuVkkgll1lll1ll;
    private boolean bpdddqbpEtpkwNYukGjjNs1l111;
    private CharSequence bppbpdbCeZVhQNTixBml1lll11l;
    private dbppbdqpeLmcbs11l11 bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private TextView bpppqdQjfPiCT111111111;
    private OnBackInvokedCallback bppqdpqbpvFfYvVMQwal1l1l1;
    private bpppdpppqFAXRSTHUAmVJLvH11lllll1l[] bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
    ViewGroup bpqbbqTOKdRXac1ll1l1lll;
    Runnable bpqdqbqpviKiORjqgp1l111l11;
    private boolean bpqpbicsQtfVpOtr11l1l;
    private AutoNightModeManager bqdbpBvxFUC1lll11;
    private boolean bqdppdGFpODiqhzhhiaXKl11l1;
    final dqbbdbpqbvChgeruisCbWCnl11lllll dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    MenuInflater dbbpdqqpdVUhpQ1ll11;
    androidx.core.view.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    PopupWindow dddbpbpNqzZZJmSG1111l;
    private boolean ddddbbdqIccDnEitQc1l1l1l;
    private final Runnable ddppqbqqbIhInevqvPYIBnGmBIE111lll;
    boolean dpbdqAKWNZAIXLyehU1lll1lll1;
    private androidx.appcompat.app.dbppbdqpeLmcbs11l11 dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1;
    private bpppdpppqFAXRSTHUAmVJLvH11lllll1l dqbbdddqpLERmaRLiHiDpL1l1l1l;
    Window dqdqbpQposEBDyDxIyyz1ll11;
    private boolean dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private boolean pbdbqZLBIrMLYk1l11l1ll1;
    private int pbddqdbpoVvTyZPOoYl1111;
    private boolean pdpqbmApOBCmNMwnn1ll111;
    private androidx.appcompat.app.dqpqqqbqQyjyB11111l1 pdpqqbqbpFAaViLnU1l1ll11l1;
    int pdqdddDNpMbeVT11ll11;
    boolean ppdqqzXJzQiU11ll11;
    private Configuration ppppqdfPOyVswFHMTylxLClll1l1111;
    boolean pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l;
    private Rect qbdbqqdbJdTsszXtJeXGasJIiGllll1l;
    private dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 qbddqbdJBkudFfhX1ll1l111;
    final Object qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private ddpppsnTvuMTCFFfnFiYul1111 qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private boolean qbpbbZWTnlDkwOgZlllll;
    private View qbpbddbpyaPAbpThgWCvm11l11l1;
    private OnBackInvokedDispatcher qbqdqqqqdvTduGNll111l1;
    private int qddbbpxsbNjqxvn111ll;
    private qdqdpyALEmZFGGaahRTIU1ll11 qdqdpyALEmZFGGaahRTIU1ll11;
    dqbbdddqpLERmaRLiHiDpL1l1l1l qppqdpppIauLKaAtRkB11111l;
    boolean qqbqbddiRRgLpniPxlUfQzP1l1l1l;
    boolean qqdbbfmUWwoYYpfYHJZdaUO1111llll;
    private boolean qqpbppebHUxqEmlGoAJWl1lll;

    abstract class AutoNightModeManager {
        private BroadcastReceiver dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ AppCompatDelegateImpl dpbdbdpbLwkLpObyKsq1lll1;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager$1 */
        class C00351 extends BroadcastReceiver {
            final /* synthetic */ AutoNightModeManager dbpqdHhmDSIHIJiwc1ll1l1;

            C00351(AutoNightModeManager autoNightModeManager) {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
            }
        }

        AutoNightModeManager(AppCompatDelegateImpl appCompatDelegateImpl) {
        }

        void bpdqqiQNVROMLC1ll1l1l11() {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        abstract IntentFilter dpbdbdpbLwkLpObyKsq1lll1();

        abstract void dpbdpqRKAscW1lll1l();

        abstract int dqqppqiKzJi1l1lll1l();
    }

    private class bbdbbpdOJSuInlll111l extends AutoNightModeManager {
        final /* synthetic */ AppCompatDelegateImpl dpbdpqRKAscW1lll1l;
        private final PowerManager dqqppqiKzJi1l1lll1l;

        bbdbbpdOJSuInlll111l(AppCompatDelegateImpl appCompatDelegateImpl, Context context) {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        IntentFilter dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void dpbdpqRKAscW1lll1l() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int dqqppqiKzJi1l1lll1l() {
        }
    }

    static class bdddqmITkkeGpsxVXHR1l1llll {
        static void dbpqdHhmDSIHIJiwc1ll1l1(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        }

        static androidx.core.os.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpbLwkLpObyKsq1lll1(Configuration configuration) {
        }

        static void dpbdpqRKAscW1lll1l(Configuration configuration, androidx.core.os.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        public static void dqqppqiKzJi1l1lll1l(androidx.core.os.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }
    }

    class bpdqqiQNVROMLC1ll1l1l11 implements ContentFrameLayout.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ AppCompatDelegateImpl dbpqdHhmDSIHIJiwc1ll1l1;

        bpdqqiQNVROMLC1ll1l1l11(AppCompatDelegateImpl appCompatDelegateImpl) {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.dbpqdHhmDSIHIJiwc1ll1l1
        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.dbpqdHhmDSIHIJiwc1ll1l1
        public void onDetachedFromWindow() {
        }
    }

    private static class bppbpdbCeZVhQNTixBml1lll11l {
        static void dbpqdHhmDSIHIJiwc1ll1l1(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
        }
    }

    protected static final class bpppdpppqFAXRSTHUAmVJLvH11lllll1l {
        boolean bbdbbpdOJSuInlll111l;
        boolean bdddqmITkkeGpsxVXHR1l1llll;
        int bpdqqiQNVROMLC1ll1l1l11;
        boolean dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
        Bundle dbbpdqqpdVUhpQ1ll11;
        androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 dbppbdqpeLmcbs11l11;
        int dbpqdHhmDSIHIJiwc1ll1l1;
        View ddbbbeXHXx111ll;
        Context ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        int dpbdbdpbLwkLpObyKsq1lll1;
        int dpbdpqRKAscW1lll1l;
        boolean dqdqbpQposEBDyDxIyyz1ll11;
        View dqpdbEevAufTOvPphbjykClll1l11;
        ViewGroup dqpqqqbqQyjyB11111l1;
        int dqqppqiKzJi1l1lll1l;
        androidx.appcompat.view.menu.dqqppqiKzJi1l1lll1l pbppbpqbamJRy11l1l1;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;
        public boolean qbddqbdJBkudFfhX1ll1l111;
        boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll;

        bpppdpppqFAXRSTHUAmVJLvH11lllll1l(int i) {
        }

        androidx.appcompat.view.menu.pbppbpqbamJRy11l1l1 dbpqdHhmDSIHIJiwc1ll1l1(dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public boolean dpbdbdpbLwkLpObyKsq1lll1() {
        }

        void dpbdpqRKAscW1lll1l(Context context) {
        }

        void dqqppqiKzJi1l1lll1l(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }
    }

    private class dbbpdqqpdVUhpQ1ll11 extends AutoNightModeManager {
        final /* synthetic */ AppCompatDelegateImpl dpbdpqRKAscW1lll1l;
        private final androidx.appcompat.app.dqdqbpQposEBDyDxIyyz1ll11 dqqppqiKzJi1l1lll1l;

        dbbpdqqpdVUhpQ1ll11(AppCompatDelegateImpl appCompatDelegateImpl, androidx.appcompat.app.dqdqbpQposEBDyDxIyyz1ll11 dqdqbpqposebdydxiyyz1ll11) {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        IntentFilter dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void dpbdpqRKAscW1lll1l() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int dqqppqiKzJi1l1lll1l() {
        }
    }

    private final class dbppbdqpeLmcbs11l11 implements dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ AppCompatDelegateImpl dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(AppCompatDelegateImpl appCompatDelegateImpl) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean dbpqdHhmDSIHIJiwc1ll1l1(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1
        public void onCloseMenu(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, boolean z) {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        }

        private boolean dbpqdHhmDSIHIJiwc1ll1l1(Throwable th) {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
        }
    }

    private class ddbbbeXHXx111ll implements dpbdqAKWNZAIXLyehU1lll1lll1 {
        final /* synthetic */ AppCompatDelegateImpl dbpqdHhmDSIHIJiwc1ll1l1;

        ddbbbeXHXx111ll(AppCompatDelegateImpl appCompatDelegateImpl) {
        }
    }

    static class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        static Context dbpqdHhmDSIHIJiwc1ll1l1(Context context, Configuration configuration) {
        }

        static void dpbdbdpbLwkLpObyKsq1lll1(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        }

        static void dpbdpqRKAscW1lll1l(Configuration configuration, Locale locale) {
        }

        static void dqqppqiKzJi1l1lll1l(Configuration configuration, Locale locale) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements Runnable {
        final /* synthetic */ AppCompatDelegateImpl dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(AppCompatDelegateImpl appCompatDelegateImpl) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dpbdpqRKAscW1lll1l implements dddbpbpNqzZZJmSG1111l.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ AppCompatDelegateImpl dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdpqRKAscW1lll1l(AppCompatDelegateImpl appCompatDelegateImpl) {
        }

        @Override // androidx.appcompat.widget.dddbpbpNqzZZJmSG1111l.dbpqdHhmDSIHIJiwc1ll1l1
        public void dbpqdHhmDSIHIJiwc1ll1l1(Rect rect) {
        }
    }

    static class dqdqbpQposEBDyDxIyyz1ll11 {
        static void dbpqdHhmDSIHIJiwc1ll1l1(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        }
    }

    interface dqpdbEevAufTOvPphbjykClll1l11 {
        boolean dbpqdHhmDSIHIJiwc1ll1l1(int i);

        View onCreatePanelView(int i);
    }

    class dqpqqqbqQyjyB11111l1 extends r22 {
        final /* synthetic */ AppCompatDelegateImpl dbpqdHhmDSIHIJiwc1ll1l1;

        dqpqqqbqQyjyB11111l1(AppCompatDelegateImpl appCompatDelegateImpl) {
        }

        @Override // p000.r22, p000.q22
        public void dpbdbdpbLwkLpObyKsq1lll1(View view) {
        }

        @Override // p000.r22, p000.q22
        public void dqqppqiKzJi1l1lll1l(View view) {
        }
    }

    class dqqppqiKzJi1l1lll1l implements bn0 {
        final /* synthetic */ AppCompatDelegateImpl dbpqdHhmDSIHIJiwc1ll1l1;

        dqqppqiKzJi1l1lll1l(AppCompatDelegateImpl appCompatDelegateImpl) {
        }

        @Override // p000.bn0
        public androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll onApplyWindowInsets(View view, androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }
    }

    class pbppbpqbamJRy11l1l1 implements dqbbdddqpLERmaRLiHiDpL1l1l1l.dbpqdHhmDSIHIJiwc1ll1l1 {
        private dqbbdddqpLERmaRLiHiDpL1l1l1l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ AppCompatDelegateImpl dpbdbdpbLwkLpObyKsq1lll1;

        class dbpqdHhmDSIHIJiwc1ll1l1 extends r22 {
            final /* synthetic */ pbppbpqbamJRy11l1l1 dbpqdHhmDSIHIJiwc1ll1l1;

            dbpqdHhmDSIHIJiwc1ll1l1(pbppbpqbamJRy11l1l1 pbppbpqbamjry11l1l1) {
            }

            @Override // p000.r22, p000.q22
            public void dpbdbdpbLwkLpObyKsq1lll1(View view) {
            }
        }

        public pbppbpqbamJRy11l1l1(AppCompatDelegateImpl appCompatDelegateImpl, dqbbdddqpLERmaRLiHiDpL1l1l1l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        @Override // dqbbdddqpLERmaRLiHiDpL1l1l1l.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean dbpqdHhmDSIHIJiwc1ll1l1(dqbbdddqpLERmaRLiHiDpL1l1l1l dqbbdddqplermarlihidpl1l1l1l, MenuItem menuItem) {
        }

        @Override // dqbbdddqpLERmaRLiHiDpL1l1l1l.dbpqdHhmDSIHIJiwc1ll1l1
        public void dpbdbdpbLwkLpObyKsq1lll1(dqbbdddqpLERmaRLiHiDpL1l1l1l dqbbdddqplermarlihidpl1l1l1l) {
        }

        @Override // dqbbdddqpLERmaRLiHiDpL1l1l1l.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean dpbdpqRKAscW1lll1l(dqbbdddqpLERmaRLiHiDpL1l1l1l dqbbdddqplermarlihidpl1l1l1l, Menu menu) {
        }

        @Override // dqbbdddqpLERmaRLiHiDpL1l1l1l.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean dqqppqiKzJi1l1lll1l(dqbbdddqpLERmaRLiHiDpL1l1l1l dqbbdddqplermarlihidpl1l1l1l, Menu menu) {
        }
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements Runnable {
        final /* synthetic */ AppCompatDelegateImpl dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 extends r22 {
            final /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 dbpqdHhmDSIHIJiwc1ll1l1;

            dbpqdHhmDSIHIJiwc1ll1l1(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
            }

            @Override // p000.r22, p000.q22
            public void dpbdbdpbLwkLpObyKsq1lll1(View view) {
            }

            @Override // p000.r22, p000.q22
            public void dqqppqiKzJi1l1lll1l(View view) {
            }
        }

        ppbdpwWWljzmXXdHNabfWhgjl111l11(AppCompatDelegateImpl appCompatDelegateImpl) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static class qbddqbdJBkudFfhX1ll1l111 {
        static OnBackInvokedDispatcher dbpqdHhmDSIHIJiwc1ll1l1(Activity activity) {
        }

        static OnBackInvokedCallback dpbdbdpbLwkLpObyKsq1lll1(Object obj, AppCompatDelegateImpl appCompatDelegateImpl) {
        }

        static void dqqppqiKzJi1l1lll1l(Object obj, Object obj2) {
        }
    }

    static class qbdpqpstJKhhKkXrsOGvbWw1l1llll {
        static boolean dbpqdHhmDSIHIJiwc1ll1l1(PowerManager powerManager) {
        }

        static String dpbdbdpbLwkLpObyKsq1lll1(Locale locale) {
        }
    }

    private class qbdqqpbqpCWRpIKEKtzoceYOll1ll1l extends ContentFrameLayout {
        final /* synthetic */ AppCompatDelegateImpl ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;

        public qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(AppCompatDelegateImpl appCompatDelegateImpl, Context context) {
        }

        private boolean dqqppqiKzJi1l1lll1l(int i, int i2) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
        }
    }

    private final class qdqdpyALEmZFGGaahRTIU1ll11 implements dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ AppCompatDelegateImpl dpbdpqRKAscW1lll1l;

        qdqdpyALEmZFGGaahRTIU1ll11(AppCompatDelegateImpl appCompatDelegateImpl) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1
        public boolean dbpqdHhmDSIHIJiwc1ll1l1(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        @Override // androidx.appcompat.view.menu.dbppbdqpeLmcbs11l11.dbpqdHhmDSIHIJiwc1ll1l1
        public void onCloseMenu(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, boolean z) {
        }
    }

    AppCompatDelegateImpl(Activity activity, dqbbdbpqbvChgeruisCbWCnl11lllll dqbbdbpqbvchgeruiscbwcnl11lllll) {
    }

    private int bbdbbNgXIvtfDESTvydOl11lll(int i) {
    }

    private int bddbppbdHQMVgPvQSDhmnXZYkDh1ll111() {
    }

    private void bdpqbqqdpVtpTLhDYl11ll1l(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, KeyEvent keyEvent) {
    }

    private void bpbbpbppqsLrtEPjeDMEnOv1l1l1() {
    }

    private void bpbqbqdqqjASPQfJSXuVkkgll1lll1ll() {
    }

    private void bpppbpdWDyOLaxxbWEl1lllll(View view) {
    }

    private void bppqdpqbpvFfYvVMQwal1l1l1() {
    }

    private boolean bpqbdddbQzWMiIJFWdSJrGCER1l1l11ll(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
    }

    private boolean bpqpbicsQtfVpOtr11l1l(boolean z) {
    }

    private boolean bqppqdRbgUpzcKwrjaSh1lll1l11(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
    }

    private boolean bqppqddoVGlDvfgOKHTJ1ll11111(int i, androidx.core.os.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, boolean z) {
    }

    private boolean dbbddpAOiFIsWEXHFvDl11ll1(int i, KeyEvent keyEvent) {
    }

    private void dbdpqdqbxaVJPXHgWAxfdYMEQF1111l() {
    }

    private int dbppbpzxVnfullll1(Context context) {
    }

    private boolean dddqbpqXicmakzZohTSxll11l(ViewParent viewParent) {
    }

    private AutoNightModeManager ddpbddGpKmMvSPZaXEkLg11l11(Context context) {
    }

    private ViewGroup ddppqbqqbIhInevqvPYIBnGmBIE111lll() {
    }

    private void dqbdbtYbcXnOwavgobEX1111l(int i) {
    }

    private boolean dqdppbTIDavqwXzOuQmLoejlll1l(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, KeyEvent keyEvent) {
    }

    private void dqpqpqvoxmkkrR11ll111l1() {
    }

    private boolean pbbpbqqbKSyiLKXJmkvAl11lll1ll(int i, KeyEvent keyEvent) {
    }

    private AppCompatActivity pddpddbdIotonl1ll1l11() {
    }

    private boolean pdpppduUgcghSRP11l11l(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l) {
    }

    private Configuration pdqdddDNpMbeVT11ll11(Context context, int i, androidx.core.os.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, Configuration configuration, boolean z) {
    }

    private void ppppqdfPOyVswFHMTylxLClll1l1111(Window window) {
    }

    private boolean pppqdppdpWhurwZr1l1111l1(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, int i, KeyEvent keyEvent, int i2) {
    }

    private void ppqdbdqMCHkVyItgr111ll1l(int i, androidx.core.os.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, boolean z, Configuration configuration) {
    }

    private void pqpbdqDHFpey1l1lll11l(Configuration configuration) {
    }

    private AutoNightModeManager pqqqddFCECdWHkSTrqHcll111111l(Context context) {
    }

    private boolean qbpbbZWTnlDkwOgZlllll(boolean z, boolean z2) {
    }

    private void qbqdqqqqdvTduGNll111l1() {
    }

    private void qddqdbuvJUsrNuNes11111lll1(boolean z) {
    }

    private static Configuration qpbqqHZCUeoATyA11ll1l1(Configuration configuration, Configuration configuration2) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public final dpbdqAKWNZAIXLyehU1lll1lll1 bdddqmITkkeGpsxVXHR1l1llll() {
    }

    void bddqqdpgLnHt1ll1l1l(int i) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void bdpdqYMMfHmzHyUIbllllll1(View view) {
    }

    boolean bdqpqbqbgFttbl1ll1l(KeyEvent keyEvent) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void bpbbpOxqjGWQAsycX11ll1l1(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void bpdddqbpEtpkwNYukGjjNs1l111(int i) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void bppbpdbCeZVhQNTixBml1lll11l() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public final void bpqbbpqpqkDmeOUxxUylkHyYgWv11111(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void bpqbbqTOKdRXac1ll1l1lll() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void bpqdqbqpviKiORjqgp1l111l11(Bundle bundle) {
    }

    void bqbpbxbDWbYusagGEGEkKZ1ll1l1(androidx.core.os.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    void bqdbpBvxFUC1lll11(int i) {
    }

    public View bqdppdGFpODiqhzhhiaXKl11l1(View view, String str, Context context, AttributeSet attributeSet) {
    }

    void bqpqpbCjWyZxLLtQbYeCDl1l11(ViewGroup viewGroup) {
    }

    void bqqqqKuUKQfBoZwqWsGJYYlll111(Configuration configuration, androidx.core.os.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public MenuInflater dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public androidx.appcompat.app.dbpqdHhmDSIHIJiwc1ll1l1 dbbpdqqpdVUhpQ1ll11() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public <T extends View> T dbppbdqpeLmcbs11l11(int i) {
    }

    public boolean dbqbbqpdqHtvJXil111l1ll() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void dddbpbpNqzZZJmSG1111l() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void ddddbbdqIccDnEitQc1l1l1l(Bundle bundle) {
    }

    final int ddqddbKRuFDcoInll11ll11(androidx.core.view.bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll, Rect rect) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public Context ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
    }

    final Window.Callback dpbdppqbVlmCUMWETyfoYOI1l11l1l() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public boolean dpbdpqRKAscW1lll1l() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void dpbdqAKWNZAIXLyehU1lll1lll1(Toolbar toolbar) {
    }

    void dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1() {
    }

    boolean dpdqpXgfqpODrtwusppe1l1l1l1ll() {
    }

    final CharSequence dpdqqbdppwRMsRSyLKfcWKCxeblll11ll11() {
    }

    final androidx.appcompat.app.dbpqdHhmDSIHIJiwc1ll1l1 dpppqdppqSnABbIYdrll1lll11ll() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public dqbbdddqpLERmaRLiHiDpL1l1l1l dqbbdddqpLERmaRLiHiDpL1l1l1l(dqbbdddqpLERmaRLiHiDpL1l1l1l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public int dqdqbpQposEBDyDxIyyz1ll11() {
    }

    dqbbdddqpLERmaRLiHiDpL1l1l1l dqpqddqpbvPVlymdpLsl11l1ll1(dqbbdddqpLERmaRLiHiDpL1l1l1l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public Context dqpqqqbqQyjyB11111l1(Context context) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public boolean dqqpbqaYiRPLeqRCYteXfDW1l111l11l(int i) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void dqqppqiKzJi1l1lll1l(View view, ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, MenuItem menuItem) {
    }

    @Override // androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
    public void onMenuModeChange(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    void pbdbqZLBIrMLYk1l11l1ll1(androidx.appcompat.view.menu.bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    androidx.core.os.dpbdbdpbLwkLpObyKsq1lll1 pbddqdbpoVvTyZPOoYl1111(Context context) {
    }

    boolean pbdpdbqqdJtdUmQAgX1llll1(int i, KeyEvent keyEvent) {
    }

    androidx.core.os.dpbdbdpbLwkLpObyKsq1lll1 pbpbpmdJpqmdGNwEepmjpVlll11l1(Configuration configuration) {
    }

    void pbpdbpqdpIXNqwSGhm111ll1(int i) {
    }

    boolean pbpqpdqpDkfTMiEll11l11l(int i, KeyEvent keyEvent) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void pdpqbmApOBCmNMwnn1ll111() {
    }

    boolean pdpqbuMsiTd1ll1l1() {
    }

    void pdpqqbqbpFAaViLnU1l1ll11l1(int i) {
    }

    protected bpppdpppqFAXRSTHUAmVJLvH11lllll1l pdqbbpCQzQWOl111l1(int i, boolean z) {
    }

    bpppdpppqFAXRSTHUAmVJLvH11lllll1l ppbddpbbYwysRtaAnAwzNYP11l11111l(Menu menu) {
    }

    final boolean ppdqdfATjLvOVDRgppcqyifll1l1lll() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void ppdqqzXJzQiU11ll11(View view, ViewGroup.LayoutParams layoutParams) {
    }

    void pqqbbpbdGewtfncEzUzUgwaxnAl11lll1l(bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, boolean z) {
    }

    int qbbqpzukjahUWUWfxIll11lll1(Context context, int i) {
    }

    void qbdbqqdbJdTsszXtJeXGasJIiGllll1l() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() {
    }

    void qddbbpxsbNjqxvn111ll(int i, bpppdpppqFAXRSTHUAmVJLvH11lllll1l bpppdpppqfaxrsthuamvjlvh11lllll1l, Menu menu) {
    }

    void qpbqqbpqdbZmlLPGCGeflll11l() {
    }

    final Context qpdbbbbbmKdyKHlllllll1() {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void qppqdpppIauLKaAtRkB11111l(Configuration configuration) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void qqdbbfmUWwoYYpfYHJZdaUO1111llll(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    @Override // androidx.appcompat.app.dqqppqiKzJi1l1lll1l
    public void qqpbppebHUxqEmlGoAJWl1lll(int i) {
    }

    boolean qqqpbbqdUOEcdwaGGHQOKYwGi1l1l1l1l1(int i, KeyEvent keyEvent) {
    }

    AppCompatDelegateImpl(Dialog dialog, dqbbdbpqbvChgeruisCbWCnl11lllll dqbbdbpqbvchgeruiscbwcnl11lllll) {
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
    }

    private AppCompatDelegateImpl(Context context, Window window, dqbbdbpqbvChgeruisCbWCnl11lllll dqbbdbpqbvchgeruiscbwcnl11lllll, Object obj) {
    }

    class dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 extends androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1 {
        private dqpdbEevAufTOvPphbjykClll1l11 bpdqqiQNVROMLC1ll1l1l11;
        private boolean ddbbbeXHXx111ll;
        final /* synthetic */ AppCompatDelegateImpl dqpdbEevAufTOvPphbjykClll1l11;
        private boolean dqpqqqbqQyjyB11111l1;
        private boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(AppCompatDelegateImpl appCompatDelegateImpl, Window.Callback callback) {
        }

        void bpdqqiQNVROMLC1ll1l1l11(dqpdbEevAufTOvPphbjykClll1l11 dqpdbeevauftovpphbjykclll1l11) {
        }

        @Override // androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        }

        @Override // androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        }

        public boolean dpbdbdpbLwkLpObyKsq1lll1(Window.Callback callback, KeyEvent keyEvent) {
        }

        public void dpbdpqRKAscW1lll1l(Window.Callback callback, int i, Menu menu) {
        }

        public void dqqppqiKzJi1l1lll1l(Window.Callback callback) {
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
        }

        @Override // androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1, android.view.Window.Callback
        public View onCreatePanelView(int i) {
        }

        @Override // androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
        }

        @Override // androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
        }

        @Override // androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
        }

        @Override // androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        }

        @Override // androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        }

        final ActionMode ppbdpwWWljzmXXdHNabfWhgjl111l11(ActionMode.Callback callback) {
        }

        @Override // androidx.appcompat.view.dpbdbdpbLwkLpObyKsq1lll1, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        }
    }
}
