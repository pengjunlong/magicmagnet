package org.adblockplus.libadblockplus.android.settings;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import java.util.List;
import org.adblockplus.libadblockplus.android.Subscription;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SharedPrefsStorage extends AdblockSettingsStorage {
    private static final String SETTINGS_AA_ENABLED_KEY = "aa_enabled";
    private static final String SETTINGS_ALLOWED_CONNECTION_TYPE_KEY = "allowed_connection_type";
    private static final String SETTINGS_AL_DOMAINS_KEY = "allowlisted_domains";
    private static final String SETTINGS_AL_DOMAIN_KEY = "domain";
    private static final String SETTINGS_AVAILABLE_SUBSCRIPTION_ITEM_KEY = "availableSubscription";
    private static final String SETTINGS_ENABLED_KEY = "enabled";
    private static final String SETTINGS_SELECTED_SUBSCRIPTION_ITEM_KEY = "subscription";
    private static final String SETTINGS_SUBSCRIPTION_COUNT_KEY_SUFFIX = "s";
    private static final String SETTINGS_SUBSCRIPTION_PREFIXES_KEY = "prefixes";
    private static final String SETTINGS_SUBSCRIPTION_TITLE_KEY = "title";
    private static final String SETTINGS_SUBSCRIPTION_URL_KEY = "url";
    private boolean commit;
    private final SharedPreferences prefs;

    public SharedPrefsStorage(SharedPreferences sharedPreferences) {
    }

    private static String getArrayItemKey(int i, String str) {
    }

    private static String getCountKey(String str) {
    }

    private String getSubscriptionItemKey(String str, int i, String str2) {
    }

    private String getSubscriptionPrefixesKey(String str, int i) {
    }

    private String getSubscriptionTitleKey(String str, int i) {
    }

    private String getSubscriptionURLKey(String str, int i) {
    }

    private void loadAllowlistedDomains(AdblockSettings adblockSettings) {
    }

    private List<Subscription> loadSubscriptions(String str) {
    }

    private void saveAllowlistedDomains(AdblockSettings adblockSettings, SharedPreferences.Editor editor) {
    }

    private void saveSubscriptions(SharedPreferences.Editor editor, List<Subscription> list, String str) {
    }

    public boolean isCommit() {
    }

    @Override // org.adblockplus.libadblockplus.android.settings.AdblockSettingsStorage
    public AdblockSettings load() {
    }

    @Override // org.adblockplus.libadblockplus.android.settings.AdblockSettingsStorage
    @SuppressLint({"ApplySharedPref"})
    public void save(AdblockSettings adblockSettings) {
    }

    public void setCommit(boolean z) {
    }
}
