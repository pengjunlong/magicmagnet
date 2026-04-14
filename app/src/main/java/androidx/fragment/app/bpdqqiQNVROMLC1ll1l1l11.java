package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p000.r50;
import p000.rg;
import p000.zl0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class bpdqqiQNVROMLC1ll1l1l11 extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private zl0<r50> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* renamed from: androidx.fragment.app.bpdqqiQNVROMLC1ll1l1l11$bpdqqiQNVROMLC1ll1l1l11, reason: collision with other inner class name */
    class C1955bpdqqiQNVROMLC1ll1l1l11 extends rg {
        final /* synthetic */ rg dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ bpdqqiQNVROMLC1ll1l1l11 dpbdbdpbLwkLpObyKsq1lll1;

        C1955bpdqqiQNVROMLC1ll1l1l11(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11, rg rgVar) {
        }

        @Override // p000.rg
        public boolean dpbdpqRKAscW1lll1l() {
        }

        @Override // p000.rg
        public View dqqppqiKzJi1l1lll1l(int i) {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
        final /* synthetic */ bpdqqiQNVROMLC1ll1l1l11 dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements DialogInterface.OnCancelListener {
        final /* synthetic */ bpdqqiQNVROMLC1ll1l1l11 dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    class dpbdpqRKAscW1lll1l implements zl0<r50> {
        final /* synthetic */ bpdqqiQNVROMLC1ll1l1l11 dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdpqRKAscW1lll1l(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void dbpqdHhmDSIHIJiwc1ll1l1(r50 r50Var) {
        }

        @Override // p000.zl0
        @SuppressLint({"SyntheticAccessor"})
        public /* bridge */ /* synthetic */ void onChanged(r50 r50Var) {
        }
    }

    class dqqppqiKzJi1l1lll1l implements DialogInterface.OnDismissListener {
        final /* synthetic */ bpdqqiQNVROMLC1ll1l1l11 dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public bpdqqiQNVROMLC1ll1l1l11() {
    }

    static /* synthetic */ Dialog access$000(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    static /* synthetic */ DialogInterface.OnDismissListener access$100(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    static /* synthetic */ boolean access$200(bpdqqiQNVROMLC1ll1l1l11 bpdqqiqnvromlc1ll1l1l11) {
    }

    private void dismissInternal(boolean z, boolean z2, boolean z3) {
    }

    private void prepareDialog(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    rg createFragmentContainer() {
    }

    public void dismiss() {
    }

    public void dismissAllowingStateLoss() {
    }

    public void dismissNow() {
    }

    public Dialog getDialog() {
    }

    public boolean getShowsDialog() {
    }

    public int getTheme() {
    }

    public boolean isCancelable() {
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    public Dialog onCreateDialog(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
    }

    View onFindViewById(int i) {
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
    }

    boolean onHasView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    public final Dialog requireDialog() {
    }

    public void setCancelable(boolean z) {
    }

    public void setShowsDialog(boolean z) {
    }

    public void setStyle(int i, int i2) {
    }

    public void setupDialog(Dialog dialog, int i) {
    }

    public void show(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, String str) {
    }

    public void showNow(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll, String str) {
    }

    public int show(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l, String str) {
    }

    public bpdqqiQNVROMLC1ll1l1l11(int i) {
    }
}
