package org.adblockplus.libadblockplus.android.settings;

import android.app.Activity;
import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import java.util.Set;
import org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment;
import p000.zl0;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class GeneralSettingsFragment extends BaseSettingsFragment<Listener> implements Preference.dpbdpqRKAscW1lll1l, Preference.bpdqqiQNVROMLC1ll1l1l11 {
    private String SETTINGS_AA_ENABLED_KEY;
    private String SETTINGS_ALLOWED_CONNECTION_TYPE_KEY;
    private String SETTINGS_AL_DOMAINS_KEY;
    private String SETTINGS_ENABLED_KEY;
    private String SETTINGS_FILTER_LISTS_KEY;
    private SwitchPreferenceCompat acceptableAdsEnabled;
    private SwitchPreferenceCompat adblockEnabled;
    private ListPreference allowedConnectionType;
    private Preference allowlistedDomains;
    private MultiSelectListPreference filterLists;
    private SettingsViewModel settingsViewModel;

    /* renamed from: org.adblockplus.libadblockplus.android.settings.GeneralSettingsFragment$1 */
    class C17551 implements zl0<CharSequence[]> {
        final /* synthetic */ GeneralSettingsFragment this$0;

        C17551(GeneralSettingsFragment generalSettingsFragment) {
        }

        @Override // p000.zl0
        public /* bridge */ /* synthetic */ void onChanged(CharSequence[] charSequenceArr) {
        }

        /* renamed from: onChanged, reason: avoid collision after fix types in other method */
        public void onChanged2(CharSequence[] charSequenceArr) {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.settings.GeneralSettingsFragment$2 */
    class C17562 implements zl0<CharSequence[]> {
        final /* synthetic */ GeneralSettingsFragment this$0;

        C17562(GeneralSettingsFragment generalSettingsFragment) {
        }

        @Override // p000.zl0
        public /* bridge */ /* synthetic */ void onChanged(CharSequence[] charSequenceArr) {
        }

        /* renamed from: onChanged, reason: avoid collision after fix types in other method */
        public void onChanged2(CharSequence[] charSequenceArr) {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.settings.GeneralSettingsFragment$3 */
    class C17573 implements zl0<Set<String>> {
        final /* synthetic */ GeneralSettingsFragment this$0;

        C17573(GeneralSettingsFragment generalSettingsFragment) {
        }

        @Override // p000.zl0
        public /* bridge */ /* synthetic */ void onChanged(Set<String> set) {
        }

        /* renamed from: onChanged, reason: avoid collision after fix types in other method */
        public void onChanged2(Set<String> set) {
        }
    }

    public interface Listener extends BaseSettingsFragment.Listener {
        void onAllowlistedDomainsClicked(GeneralSettingsFragment generalSettingsFragment);
    }

    static /* synthetic */ MultiSelectListPreference access$000(GeneralSettingsFragment generalSettingsFragment) {
    }

    private void applyAdblockEnabled(boolean z) {
    }

    private void bindPreferences() {
    }

    private void checkReadyAndInit() {
    }

    private void initAcceptableAdsEnabled() {
    }

    private void initAllowlistedDomains() {
    }

    private void initFilterLists() {
    }

    private void initUpdatesConnection() {
    }

    private void initViewModel() {
    }

    public static GeneralSettingsFragment newInstance() {
    }

    private void readKeys() {
    }

    @Override // org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment
    protected void onAdblockEngineReady() {
    }

    @Override // org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
    }

    @Override // androidx.preference.dpbdpqRKAscW1lll1l
    public void onCreatePreferences(Bundle bundle, String str) {
    }

    @Override // androidx.preference.Preference.dpbdpqRKAscW1lll1l
    public boolean onPreferenceChange(Preference preference, Object obj) {
    }

    @Override // androidx.preference.Preference.bpdqqiQNVROMLC1ll1l1l11
    public boolean onPreferenceClick(Preference preference) {
    }

    @Override // org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment
    protected void onSettingsReady() {
    }
}
