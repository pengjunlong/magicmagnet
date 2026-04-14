package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.bppbpdbCeZVhQNTixBml1lll11l;
import androidx.lifecycle.dqpdbEevAufTOvPphbjykClll1l11;
import androidx.lifecycle.dqpqqqbqQyjyB11111l1;
import androidx.lifecycle.pbppbpqbamJRy11l1l1;
import androidx.lifecycle.ppbdpwWWljzmXXdHNabfWhgjl111l11;
import androidx.lifecycle.qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000.bqdppdGFpODiqhzhhiaXKl11l1;
import p000.dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1;
import p000.dqdqqbpddhjDeevSAyYPsslll11111l;
import p000.dqqbbdbpuvRfPll1lll1l;
import p000.fn0;
import p000.gn0;
import p000.hn0;
import p000.ko0;
import p000.lc0;
import p000.m22;
import p000.oc0;
import p000.on0;
import p000.pdqbqFLLJtCSEl1llll;
import p000.pdqdddDNpMbeVT11ll11;
import p000.qbdbqqdbJdTsszXtJeXGasJIiGllll1l;
import p000.qbqdqqqqdvTduGNll111l1;
import p000.r50;
import p000.rn0;
import p000.sc0;
import p000.v91;
import p000.vt0;
import p000.w91;
import p000.x91;
import p000.xf0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements m22, ppbdpwWWljzmXXdHNabfWhgjl111l11, x91, fn0, qbqdqqqqdvTduGNll111l1, gn0, ko0, on0, rn0, lc0 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final pdqbqFLLJtCSEl1llll mContextAwareHelper;
    private bppbpdbCeZVhQNTixBml1lll11l.dpbdbdpbLwkLpObyKsq1lll1 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final pbppbpqbamJRy11l1l1 mLifecycleRegistry;
    private final oc0 mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<dqqbbdbpuvRfPll1lll1l<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<dqqbbdbpuvRfPll1lll1l<xf0>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<dqqbbdbpuvRfPll1lll1l<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<dqqbbdbpuvRfPll1lll1l<vt0>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<dqqbbdbpuvRfPll1lll1l<Integer>> mOnTrimMemoryListeners;
    final w91 mSavedStateRegistryController;
    private qbdqqpbqpCWRpIKEKtzoceYOll1ll1l mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$3 */
    class C00313 implements dqpdbEevAufTOvPphbjykClll1l11 {
        final /* synthetic */ ComponentActivity dpbdpqRKAscW1lll1l;

        C00313(ComponentActivity componentActivity) {
        }

        @Override // androidx.lifecycle.dqpdbEevAufTOvPphbjykClll1l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(r50 r50Var, dqpqqqbqQyjyB11111l1.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$4 */
    class C00324 implements dqpdbEevAufTOvPphbjykClll1l11 {
        final /* synthetic */ ComponentActivity dpbdpqRKAscW1lll1l;

        C00324(ComponentActivity componentActivity) {
        }

        @Override // androidx.lifecycle.dqpdbEevAufTOvPphbjykClll1l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(r50 r50Var, dqpqqqbqQyjyB11111l1.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$5 */
    class C00335 implements dqpdbEevAufTOvPphbjykClll1l11 {
        final /* synthetic */ ComponentActivity dpbdpqRKAscW1lll1l;

        C00335(ComponentActivity componentActivity) {
        }

        @Override // androidx.lifecycle.dqpdbEevAufTOvPphbjykClll1l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(r50 r50Var, dqpqqqbqQyjyB11111l1.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }
    }

    static final class bpdqqiQNVROMLC1ll1l1l11 {
        Object dbpqdHhmDSIHIJiwc1ll1l1;
        qbdqqpbqpCWRpIKEKtzoceYOll1ll1l dpbdbdpbLwkLpObyKsq1lll1;

        bpdqqiQNVROMLC1ll1l1l11() {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
        final /* synthetic */ ComponentActivity dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(ComponentActivity componentActivity) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 extends ActivityResultRegistry {
        final /* synthetic */ ComponentActivity dqpdbEevAufTOvPphbjykClll1l11;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
            final /* synthetic */ qbdbqqdbJdTsszXtJeXGasJIiGllll1l.dbpqdHhmDSIHIJiwc1ll1l1 bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ int dpbdpqRKAscW1lll1l;
            final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, int i, qbdbqqdbJdTsszXtJeXGasJIiGllll1l.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$dpbdbdpbLwkLpObyKsq1lll1$dpbdbdpbLwkLpObyKsq1lll1, reason: collision with other inner class name */
        class RunnableC1908dpbdbdpbLwkLpObyKsq1lll1 implements Runnable {
            final /* synthetic */ IntentSender.SendIntentException bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ int dpbdpqRKAscW1lll1l;
            final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            RunnableC1908dpbdbdpbLwkLpObyKsq1lll1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, int i, IntentSender.SendIntentException sendIntentException) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        dpbdbdpbLwkLpObyKsq1lll1(ComponentActivity componentActivity) {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void ppbdpwWWljzmXXdHNabfWhgjl111l11(int i, qbdbqqdbJdTsszXtJeXGasJIiGllll1l<I, O> qbdbqqdbjdtsszxtjexgasjiigllll1l, I i2, pdqdddDNpMbeVT11ll11 pdqddddnpmbevt11ll11) {
        }
    }

    static class dpbdpqRKAscW1lll1l {
        static OnBackInvokedDispatcher dbpqdHhmDSIHIJiwc1ll1l1(Activity activity) {
        }
    }

    static class dqqppqiKzJi1l1lll1l {
        static void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }
    }

    public ComponentActivity() {
    }

    static /* synthetic */ void access$001(ComponentActivity componentActivity) {
    }

    public static /* synthetic */ void bbpdpppbUguqPPWzZvAwKR1lll11ll(ComponentActivity componentActivity, Context context) {
    }

    private void initViewTreeOwners() {
    }

    private /* synthetic */ Bundle lambda$new$0() {
    }

    private /* synthetic */ void lambda$new$1(Context context) {
    }

    public static /* synthetic */ Bundle qpbpqyVmtiFZEJ11ll1l(ComponentActivity componentActivity) {
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
    }

    @Override // p000.lc0
    public void addMenuProvider(sc0 sc0Var) {
    }

    @Override // p000.gn0
    public final void addOnConfigurationChangedListener(dqqbbdbpuvRfPll1lll1l<Configuration> dqqbbdbpuvrfpll1lll1l) {
    }

    public final void addOnContextAvailableListener(hn0 hn0Var) {
    }

    @Override // p000.on0
    public final void addOnMultiWindowModeChangedListener(dqqbbdbpuvRfPll1lll1l<xf0> dqqbbdbpuvrfpll1lll1l) {
    }

    public final void addOnNewIntentListener(dqqbbdbpuvRfPll1lll1l<Intent> dqqbbdbpuvrfpll1lll1l) {
    }

    @Override // p000.rn0
    public final void addOnPictureInPictureModeChangedListener(dqqbbdbpuvRfPll1lll1l<vt0> dqqbbdbpuvrfpll1lll1l) {
    }

    @Override // p000.ko0
    public final void addOnTrimMemoryListener(dqqbbdbpuvRfPll1lll1l<Integer> dqqbbdbpuvrfpll1lll1l) {
    }

    void ensureViewModelStore() {
    }

    @Override // p000.qbqdqqqqdvTduGNll111l1
    public final ActivityResultRegistry getActivityResultRegistry() {
    }

    @Override // androidx.lifecycle.ppbdpwWWljzmXXdHNabfWhgjl111l11
    public dqdqqbpddhjDeevSAyYPsslll11111l getDefaultViewModelCreationExtras() {
    }

    @Override // androidx.lifecycle.ppbdpwWWljzmXXdHNabfWhgjl111l11
    public bppbpdbCeZVhQNTixBml1lll11l.dpbdbdpbLwkLpObyKsq1lll1 getDefaultViewModelProviderFactory() {
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
    }

    @Override // androidx.core.app.ComponentActivity, p000.r50
    public dqpqqqbqQyjyB11111l1 getLifecycle() {
    }

    @Override // p000.fn0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
    }

    @Override // p000.x91
    public final v91 getSavedStateRegistry() {
    }

    @Override // p000.m22
    public qbdqqpbqpCWRpIKEKtzoceYOll1ll1l getViewModelStore() {
    }

    public void invalidateMenu() {
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    public Context peekAvailableContext() {
    }

    public final <I, O> dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1<I> registerForActivityResult(qbdbqqdbJdTsszXtJeXGasJIiGllll1l<I, O> qbdbqqdbjdtsszxtjexgasjiigllll1l, ActivityResultRegistry activityResultRegistry, bqdppdGFpODiqhzhhiaXKl11l1<O> bqdppdgfpodiqhzhhiaxkl11l1) {
    }

    @Override // p000.lc0
    public void removeMenuProvider(sc0 sc0Var) {
    }

    @Override // p000.gn0
    public final void removeOnConfigurationChangedListener(dqqbbdbpuvRfPll1lll1l<Configuration> dqqbbdbpuvrfpll1lll1l) {
    }

    public final void removeOnContextAvailableListener(hn0 hn0Var) {
    }

    @Override // p000.on0
    public final void removeOnMultiWindowModeChangedListener(dqqbbdbpuvRfPll1lll1l<xf0> dqqbbdbpuvrfpll1lll1l) {
    }

    public final void removeOnNewIntentListener(dqqbbdbpuvRfPll1lll1l<Intent> dqqbbdbpuvrfpll1lll1l) {
    }

    @Override // p000.rn0
    public final void removeOnPictureInPictureModeChangedListener(dqqbbdbpuvRfPll1lll1l<vt0> dqqbbdbpuvrfpll1lll1l) {
    }

    @Override // p000.ko0
    public final void removeOnTrimMemoryListener(dqqbbdbpuvRfPll1lll1l<Integer> dqqbbdbpuvrfpll1lll1l) {
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
    }

    public void addMenuProvider(sc0 sc0Var, r50 r50Var) {
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(sc0 sc0Var, r50 r50Var, dqpqqqbqQyjyB11111l1.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
    }

    public final <I, O> dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1<I> registerForActivityResult(qbdbqqdbJdTsszXtJeXGasJIiGllll1l<I, O> qbdbqqdbjdtsszxtjexgasjiigllll1l, bqdppdGFpODiqhzhhiaXKl11l1<O> bqdppdgfpodiqhzhhiaxkl11l1) {
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
    }

    public ComponentActivity(int i) {
    }
}
