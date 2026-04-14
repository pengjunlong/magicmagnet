package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.bppbpdbCeZVhQNTixBml1lll11l;
import androidx.lifecycle.dqpqqqbqQyjyB11111l1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.bg0;
import p000.bqdppdGFpODiqhzhhiaXKl11l1;
import p000.dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1;
import p000.dqdqqbpddhjDeevSAyYPsslll11111l;
import p000.m22;
import p000.pdqdddDNpMbeVT11ll11;
import p000.pi;
import p000.qbdbqqdbJdTsszXtJeXGasJIiGllll1l;
import p000.r50;
import p000.rg;
import p000.sf1;
import p000.v91;
import p000.w91;
import p000.x91;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, r50, m22, androidx.lifecycle.ppbdpwWWljzmXXdHNabfWhgjl111l11, x91 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = null;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    dbppbdqpeLmcbs11l11 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    androidx.fragment.app.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    bppbpdbCeZVhQNTixBml1lll11l.dpbdbdpbLwkLpObyKsq1lll1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    androidx.fragment.app.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    androidx.fragment.app.dqpdbEevAufTOvPphbjykClll1l11<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.pbppbpqbamJRy11l1l1 mLifecycleRegistry;
    dqpqqqbqQyjyB11111l1.dqqppqiKzJi1l1lll1l mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll mSavedStateAttachListener;
    w91 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    qppqdpppIauLKaAtRkB11111l mViewLifecycleOwner;
    bg0<r50> mViewLifecycleOwnerLiveData;
    String mWho;

    /* renamed from: androidx.fragment.app.Fragment$6 */
    class C00376 implements androidx.lifecycle.dqpdbEevAufTOvPphbjykClll1l11 {
        final /* synthetic */ Fragment dpbdpqRKAscW1lll1l;

        C00376(Fragment fragment) {
        }

        @Override // androidx.lifecycle.dqpdbEevAufTOvPphbjykClll1l11
        public void dbpqdHhmDSIHIJiwc1ll1l1(r50 r50Var, dqpqqqbqQyjyB11111l1.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
        }
    }

    class bpdqqiQNVROMLC1ll1l1l11 implements Runnable {
        final /* synthetic */ Fragment bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ dddbpbpNqzZZJmSG1111l dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(Fragment fragment, dddbpbpNqzZZJmSG1111l dddbpbpnqzzzjmsg1111l) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static class dbppbdqpeLmcbs11l11 {
        sf1 bbdbbpdOJSuInlll111l;
        Object bdddqmITkkeGpsxVXHR1l1llll;
        int bpdqqiQNVROMLC1ll1l1l11;
        float bppbpdbCeZVhQNTixBml1lll11l;
        boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
        Boolean dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
        sf1 dbbpdqqpdVUhpQ1ll11;
        Object dbppbdqpeLmcbs11l11;
        View dbpqdHhmDSIHIJiwc1ll1l1;
        ArrayList<String> ddbbbeXHXx111ll;
        Object ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        boolean dpbdbdpbLwkLpObyKsq1lll1;
        int dpbdpqRKAscW1lll1l;
        Object dqdqbpQposEBDyDxIyyz1ll11;
        ArrayList<String> dqpdbEevAufTOvPphbjykClll1l11;
        int dqpqqqbqQyjyB11111l1;
        int dqqppqiKzJi1l1lll1l;
        Object pbppbpqbamJRy11l1l1;
        int ppbdpwWWljzmXXdHNabfWhgjl111l11;
        Boolean qbddqbdJBkudFfhX1ll1l111;
        Object qbdpqpstJKhhKkXrsOGvbWw1l1llll;
        View qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;

        dbppbdqpeLmcbs11l11() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class dbpqdHhmDSIHIJiwc1ll1l1<I> extends dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1<I> {
        final /* synthetic */ AtomicReference dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ qbdbqqdbJdTsszXtJeXGasJIiGllll1l dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ Fragment dqqppqiKzJi1l1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(Fragment fragment, AtomicReference atomicReference, qbdbqqdbJdTsszXtJeXGasJIiGllll1l qbdbqqdbjdtsszxtjexgasjiigllll1l) {
        }

        @Override // p000.dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1
        public void dpbdbdpbLwkLpObyKsq1lll1(I i, pdqdddDNpMbeVT11ll11 pdqddddnpmbevt11ll11) {
        }

        @Override // p000.dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    class ddbbbeXHXx111ll implements pi<Void, ActivityResultRegistry> {
        final /* synthetic */ ActivityResultRegistry dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ Fragment dpbdbdpbLwkLpObyKsq1lll1;

        ddbbbeXHXx111ll(Fragment fragment, ActivityResultRegistry activityResultRegistry) {
        }

        @Override // p000.pi
        public /* bridge */ /* synthetic */ ActivityResultRegistry apply(Void r1) {
        }

        public ActivityResultRegistry dbpqdHhmDSIHIJiwc1ll1l1(Void r1) {
        }
    }

    private static abstract class ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        private ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
        }

        abstract void dbpqdHhmDSIHIJiwc1ll1l1();

        /* synthetic */ ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements Runnable {
        final /* synthetic */ Fragment dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(Fragment fragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dpbdpqRKAscW1lll1l implements Runnable {
        final /* synthetic */ Fragment dpbdpqRKAscW1lll1l;

        dpbdpqRKAscW1lll1l(Fragment fragment) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dqpdbEevAufTOvPphbjykClll1l11 extends ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        final /* synthetic */ Fragment bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ pi dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ AtomicReference dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ bqdppdGFpODiqhzhhiaXKl11l1 dpbdpqRKAscW1lll1l;
        final /* synthetic */ qbdbqqdbJdTsszXtJeXGasJIiGllll1l dqqppqiKzJi1l1lll1l;

        dqpdbEevAufTOvPphbjykClll1l11(Fragment fragment, pi piVar, AtomicReference atomicReference, qbdbqqdbJdTsszXtJeXGasJIiGllll1l qbdbqqdbjdtsszxtjexgasjiigllll1l, bqdppdGFpODiqhzhhiaXKl11l1 bqdppdgfpodiqhzhhiaxkl11l1) {
        }

        @Override // androidx.fragment.app.Fragment.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll
        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    class dqpqqqbqQyjyB11111l1 implements pi<Void, ActivityResultRegistry> {
        final /* synthetic */ Fragment dbpqdHhmDSIHIJiwc1ll1l1;

        dqpqqqbqQyjyB11111l1(Fragment fragment) {
        }

        @Override // p000.pi
        public /* bridge */ /* synthetic */ ActivityResultRegistry apply(Void r1) {
        }

        public ActivityResultRegistry dbpqdHhmDSIHIJiwc1ll1l1(Void r3) {
        }
    }

    class dqqppqiKzJi1l1lll1l extends ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        final /* synthetic */ Fragment dbpqdHhmDSIHIJiwc1ll1l1;

        dqqppqiKzJi1l1lll1l(Fragment fragment) {
        }

        @Override // androidx.fragment.app.Fragment.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll
        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    static class pbppbpqbamJRy11l1l1 {
        static void dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends rg {
        final /* synthetic */ Fragment dbpqdHhmDSIHIJiwc1ll1l1;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(Fragment fragment) {
        }

        @Override // p000.rg
        public boolean dpbdpqRKAscW1lll1l() {
        }

        @Override // p000.rg
        public View dqqppqiKzJi1l1lll1l(int i) {
        }
    }

    public Fragment() {
    }

    private dbppbdqpeLmcbs11l11 ensureAnimationInfo() {
    }

    private int getMinimumMaxLifecycleState() {
    }

    private void initLifecycle() {
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
    }

    private <I, O> dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1<I> prepareCallInternal(qbdbqqdbJdTsszXtJeXGasJIiGllll1l<I, O> qbdbqqdbjdtsszxtjexgasjiigllll1l, pi<Void, ActivityResultRegistry> piVar, bqdppdGFpODiqhzhhiaXKl11l1<O> bqdppdgfpodiqhzhhiaxkl11l1) {
    }

    private void registerOnPreAttachListener(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll) {
    }

    void callStartTransitionListener(boolean z) {
    }

    rg createFragmentContainer() {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final boolean equals(Object obj) {
    }

    Fragment findFragmentByWho(String str) {
    }

    String generateActivityResultKey() {
    }

    public final FragmentActivity getActivity() {
    }

    public boolean getAllowEnterTransitionOverlap() {
    }

    public boolean getAllowReturnTransitionOverlap() {
    }

    View getAnimatingAway() {
    }

    public final Bundle getArguments() {
    }

    public final androidx.fragment.app.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll getChildFragmentManager() {
    }

    public Context getContext() {
    }

    @Override // androidx.lifecycle.ppbdpwWWljzmXXdHNabfWhgjl111l11
    public dqdqqbpddhjDeevSAyYPsslll11111l getDefaultViewModelCreationExtras() {
    }

    @Override // androidx.lifecycle.ppbdpwWWljzmXXdHNabfWhgjl111l11
    public bppbpdbCeZVhQNTixBml1lll11l.dpbdbdpbLwkLpObyKsq1lll1 getDefaultViewModelProviderFactory() {
    }

    int getEnterAnim() {
    }

    public Object getEnterTransition() {
    }

    sf1 getEnterTransitionCallback() {
    }

    int getExitAnim() {
    }

    public Object getExitTransition() {
    }

    sf1 getExitTransitionCallback() {
    }

    View getFocusedView() {
    }

    @Deprecated
    public final androidx.fragment.app.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll getFragmentManager() {
    }

    public final Object getHost() {
    }

    public final int getId() {
    }

    public final LayoutInflater getLayoutInflater() {
    }

    @Override // p000.r50
    public androidx.lifecycle.dqpqqqbqQyjyB11111l1 getLifecycle() {
    }

    @Deprecated
    public androidx.loader.app.dbpqdHhmDSIHIJiwc1ll1l1 getLoaderManager() {
    }

    int getNextTransition() {
    }

    public final Fragment getParentFragment() {
    }

    public final androidx.fragment.app.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll getParentFragmentManager() {
    }

    boolean getPopDirection() {
    }

    int getPopEnterAnim() {
    }

    int getPopExitAnim() {
    }

    float getPostOnViewCreatedAlpha() {
    }

    public Object getReenterTransition() {
    }

    public final Resources getResources() {
    }

    @Deprecated
    public final boolean getRetainInstance() {
    }

    public Object getReturnTransition() {
    }

    @Override // p000.x91
    public final v91 getSavedStateRegistry() {
    }

    public Object getSharedElementEnterTransition() {
    }

    public Object getSharedElementReturnTransition() {
    }

    ArrayList<String> getSharedElementSourceNames() {
    }

    ArrayList<String> getSharedElementTargetNames() {
    }

    public final String getString(int i) {
    }

    public final String getTag() {
    }

    @Deprecated
    public final Fragment getTargetFragment() {
    }

    @Deprecated
    public final int getTargetRequestCode() {
    }

    public final CharSequence getText(int i) {
    }

    @Deprecated
    public boolean getUserVisibleHint() {
    }

    public View getView() {
    }

    public r50 getViewLifecycleOwner() {
    }

    public LiveData<r50> getViewLifecycleOwnerLiveData() {
    }

    @Override // p000.m22
    public androidx.lifecycle.qbdqqpbqpCWRpIKEKtzoceYOll1ll1l getViewModelStore() {
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
    }

    public final int hashCode() {
    }

    void initState() {
    }

    public final boolean isAdded() {
    }

    public final boolean isDetached() {
    }

    public final boolean isHidden() {
    }

    final boolean isInBackStack() {
    }

    public final boolean isInLayout() {
    }

    public final boolean isMenuVisible() {
    }

    boolean isPostponed() {
    }

    public final boolean isRemoving() {
    }

    public final boolean isResumed() {
    }

    public final boolean isStateSaved() {
    }

    public final boolean isVisible() {
    }

    void noteStateNotSaved() {
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach(Context context) {
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
    }

    public void onCreate(Bundle bundle) {
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    public void onDestroy() {
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
    }

    public void onDetach() {
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
    }

    void performActivityCreated(Bundle bundle) {
    }

    void performAttach() {
    }

    void performConfigurationChanged(Configuration configuration) {
    }

    boolean performContextItemSelected(MenuItem menuItem) {
    }

    void performCreate(Bundle bundle) {
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    void performDestroy() {
    }

    void performDestroyView() {
    }

    void performDetach() {
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
    }

    void performLowMemory() {
    }

    void performMultiWindowModeChanged(boolean z) {
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
    }

    void performOptionsMenuClosed(Menu menu) {
    }

    void performPause() {
    }

    void performPictureInPictureModeChanged(boolean z) {
    }

    boolean performPrepareOptionsMenu(Menu menu) {
    }

    void performPrimaryNavigationFragmentChanged() {
    }

    void performResume() {
    }

    void performSaveInstanceState(Bundle bundle) {
    }

    void performStart() {
    }

    void performStop() {
    }

    void performViewCreated() {
    }

    public void postponeEnterTransition() {
    }

    public final <I, O> dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1<I> registerForActivityResult(qbdbqqdbJdTsszXtJeXGasJIiGllll1l<I, O> qbdbqqdbjdtsszxtjexgasjiigllll1l, bqdppdGFpODiqhzhhiaXKl11l1<O> bqdppdgfpodiqhzhhiaxkl11l1) {
    }

    public void registerForContextMenu(View view) {
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
    }

    public final FragmentActivity requireActivity() {
    }

    public final Bundle requireArguments() {
    }

    public final Context requireContext() {
    }

    @Deprecated
    public final androidx.fragment.app.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll requireFragmentManager() {
    }

    public final Object requireHost() {
    }

    public final Fragment requireParentFragment() {
    }

    public final View requireView() {
    }

    void restoreChildFragmentState(Bundle bundle) {
    }

    final void restoreViewState(Bundle bundle) {
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
    }

    void setAnimations(int i, int i2, int i3, int i4) {
    }

    public void setArguments(Bundle bundle) {
    }

    public void setEnterSharedElementCallback(sf1 sf1Var) {
    }

    public void setEnterTransition(Object obj) {
    }

    public void setExitSharedElementCallback(sf1 sf1Var) {
    }

    public void setExitTransition(Object obj) {
    }

    void setFocusedView(View view) {
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
    }

    public void setInitialSavedState(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
    }

    public void setMenuVisibility(boolean z) {
    }

    void setNextTransition(int i) {
    }

    void setPopDirection(boolean z) {
    }

    void setPostOnViewCreatedAlpha(float f) {
    }

    public void setReenterTransition(Object obj) {
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
    }

    public void setReturnTransition(Object obj) {
    }

    public void setSharedElementEnterTransition(Object obj) {
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
    }

    public void setSharedElementReturnTransition(Object obj) {
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
    }

    public void startPostponedEnterTransition() {
    }

    public String toString() {
    }

    public void unregisterForContextMenu(View view) {
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class qbdpqpstJKhhKkXrsOGvbWw1l1llll implements Parcelable {
        public static final Parcelable.Creator<qbdpqpstJKhhKkXrsOGvbWw1l1llll> CREATOR = null;
        final Bundle dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.ClassLoaderCreator<qbdpqpstJKhhKkXrsOGvbWw1l1llll> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            public qbdpqpstJKhhKkXrsOGvbWw1l1llll dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdbdpbLwkLpObyKsq1lll1(Parcel parcel, ClassLoader classLoader) {
            }

            public qbdpqpstJKhhKkXrsOGvbWw1l1llll[] dqqppqiKzJi1l1lll1l(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(Bundle bundle) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        qbdpqpstJKhhKkXrsOGvbWw1l1llll(Parcel parcel, ClassLoader classLoader) {
        }
    }

    private Fragment getTargetFragment(boolean z) {
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
    }

    public final String getString(int i, Object... objArr) {
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
    }

    public final <I, O> dpbqbddbqzdZeRSfMQrmeYoaTpk11l11lll1<I> registerForActivityResult(qbdbqqdbJdTsszXtJeXGasJIiGllll1l<I, O> qbdbqqdbjdtsszxtjexgasjiigllll1l, ActivityResultRegistry activityResultRegistry, bqdppdGFpODiqhzhhiaXKl11l1<O> bqdppdgfpodiqhzhhiaxkl11l1) {
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
    }

    @Deprecated
    public void onAttach(Activity activity) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
    }

    private void restoreViewState() {
    }

    public Fragment(int i) {
    }
}
