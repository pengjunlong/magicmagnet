package androidx.preference;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import androidx.preference.dqpqqqbqQyjyB11111l1;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class dpbdpqRKAscW1lll1l extends Fragment implements dqpqqqbqQyjyB11111l1.dqqppqiKzJi1l1lll1l, dqpqqqbqQyjyB11111l1.dbpqdHhmDSIHIJiwc1ll1l1, dqpqqqbqQyjyB11111l1.dpbdbdpbLwkLpObyKsq1lll1, DialogPreference.dbpqdHhmDSIHIJiwc1ll1l1 {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private final C1968dpbdpqRKAscW1lll1l mDividerDecoration;
    private final Handler mHandler;
    private boolean mHavePrefs;
    private boolean mInitDone;
    private int mLayoutResId;
    RecyclerView mList;
    private androidx.preference.dqpqqqbqQyjyB11111l1 mPreferenceManager;
    private final Runnable mRequestFocus;
    private Runnable mSelectPreferenceRunnable;

    public interface bpdqqiQNVROMLC1ll1l1l11 {
        boolean dbpqdHhmDSIHIJiwc1ll1l1(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, Preference preference);
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 extends Handler {
        final /* synthetic */ dpbdpqRKAscW1lll1l dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    private static class ddbbbeXHXx111ll extends RecyclerView.dbppbdqpeLmcbs11l11 {
        private final RecyclerView.ddbbbeXHXx111ll<?> dbpqdHhmDSIHIJiwc1ll1l1;
        private final RecyclerView dpbdbdpbLwkLpObyKsq1lll1;
        private final String dpbdpqRKAscW1lll1l;
        private final Preference dqqppqiKzJi1l1lll1l;

        ddbbbeXHXx111ll(RecyclerView.ddbbbeXHXx111ll<?> ddbbbexhxx111ll, RecyclerView recyclerView, Preference preference, String str) {
        }

        private void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onChanged() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeChanged(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeInserted(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeRemoved(int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dbppbdqpeLmcbs11l11
        public void onItemRangeChanged(int i, int i2, Object obj) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements Runnable {
        final /* synthetic */ dpbdpqRKAscW1lll1l dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.preference.dpbdpqRKAscW1lll1l$dpbdpqRKAscW1lll1l, reason: collision with other inner class name */
    private class C1968dpbdpqRKAscW1lll1l extends RecyclerView.dqdqbpQposEBDyDxIyyz1ll11 {
        private Drawable dbpqdHhmDSIHIJiwc1ll1l1;
        private int dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ dpbdpqRKAscW1lll1l dpbdpqRKAscW1lll1l;
        private boolean dqqppqiKzJi1l1lll1l;

        C1968dpbdpqRKAscW1lll1l(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
        }

        private boolean dqpqqqbqQyjyB11111l1(View view, RecyclerView recyclerView) {
        }

        public void bpdqqiQNVROMLC1ll1l1l11(Drawable drawable) {
        }

        public void dpbdpqRKAscW1lll1l(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dqdqbpQposEBDyDxIyyz1ll11
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dqdqbpQposEBDyDxIyyz1ll11
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }

        public void ppbdpwWWljzmXXdHNabfWhgjl111l11(int i) {
        }
    }

    public interface dqpqqqbqQyjyB11111l1 {
        boolean dbpqdHhmDSIHIJiwc1ll1l1(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, PreferenceScreen preferenceScreen);
    }

    class dqqppqiKzJi1l1lll1l implements Runnable {
        final /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ Preference dpbdpqRKAscW1lll1l;
        final /* synthetic */ dpbdpqRKAscW1lll1l ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dqqppqiKzJi1l1lll1l(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, Preference preference, String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public interface ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        boolean dbpqdHhmDSIHIJiwc1ll1l1(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l, Preference preference);
    }

    private void postBindPreferences() {
    }

    private void requirePreferenceManager() {
    }

    private void scrollToPreferenceInternal(Preference preference, String str) {
    }

    private void unbindPreferences() {
    }

    public void addPreferencesFromResource(int i) {
    }

    void bindPreferences() {
    }

    @Override // androidx.preference.DialogPreference.dbpqdHhmDSIHIJiwc1ll1l1
    public <T extends Preference> T findPreference(CharSequence charSequence) {
    }

    public Fragment getCallbackFragment() {
    }

    public final RecyclerView getListView() {
    }

    public androidx.preference.dqpqqqbqQyjyB11111l1 getPreferenceManager() {
    }

    public PreferenceScreen getPreferenceScreen() {
    }

    protected void onBindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    protected RecyclerView.ddbbbeXHXx111ll onCreateAdapter(PreferenceScreen preferenceScreen) {
    }

    public RecyclerView.LayoutManager onCreateLayoutManager() {
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Override // androidx.preference.dqpqqqbqQyjyB11111l1.dbpqdHhmDSIHIJiwc1ll1l1
    public void onDisplayPreferenceDialog(Preference preference) {
    }

    @Override // androidx.preference.dqpqqqbqQyjyB11111l1.dpbdbdpbLwkLpObyKsq1lll1
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
    }

    @Override // androidx.preference.dqpqqqbqQyjyB11111l1.dqqppqiKzJi1l1lll1l
    public boolean onPreferenceTreeClick(Preference preference) {
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

    protected void onUnbindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }

    public void scrollToPreference(String str) {
    }

    public void setDivider(Drawable drawable) {
    }

    public void setDividerHeight(int i) {
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
    }

    public void setPreferencesFromResource(int i, String str) {
    }

    public void scrollToPreference(Preference preference) {
    }
}
