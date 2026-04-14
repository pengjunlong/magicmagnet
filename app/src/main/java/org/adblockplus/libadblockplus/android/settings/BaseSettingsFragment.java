package org.adblockplus.libadblockplus.android.settings;

import android.app.Activity;
import androidx.preference.dpbdpqRKAscW1lll1l;
import org.adblockplus.libadblockplus.android.AdblockEngine;
import org.adblockplus.libadblockplus.android.AdblockEngineProvider;
import org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment.Listener;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class BaseSettingsFragment<ListenerClass extends Listener> extends dpbdpqRKAscW1lll1l {
    private final AdblockEngineProvider.EngineCreatedListener engineCreatedListener;
    protected ListenerClass listener;
    protected Provider provider;
    protected AdblockSettings settings;

    /* renamed from: org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment$1 */
    class C17541 implements AdblockEngineProvider.EngineCreatedListener {
        final /* synthetic */ BaseSettingsFragment this$0;

        C17541(BaseSettingsFragment baseSettingsFragment) {
        }

        @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider.EngineCreatedListener
        public void onAdblockEngineCreated(AdblockEngine adblockEngine) {
        }
    }

    public interface Listener {
        void onAdblockSettingsChanged(BaseSettingsFragment baseSettingsFragment);
    }

    public interface Provider {
        AdblockEngineProvider getAdblockEngineProvider();

        AdblockSettingsStorage getAdblockSettingsStorage();

        AdblockEngine lockEngine();

        void unlockEngine();
    }

    private void startLoadSettings() {
    }

    protected <T> T castOrThrow(Activity activity, Class<T> cls) {
    }

    public AdblockSettings getSettings() {
    }

    protected abstract void onAdblockEngineReady();

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }

    protected abstract void onSettingsReady();
}
