package org.adblockplus.libadblockplus.android.settings;

import android.app.Application;
import java.util.Set;
import org.adblockplus.libadblockplus.android.ConnectionType;
import org.adblockplus.libadblockplus.android.settings.BaseSettingsFragment;
import p000.bg0;
import p000.bpppbpdWDyOLaxxbWEl1lllll;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SettingsViewModel extends bpppbpdWDyOLaxxbWEl1lllll {
    private final bg0<CharSequence[]> availableSubscriptionsTitles;
    private final bg0<CharSequence[]> availableSubscriptionsValues;
    private final BaseSettingsFragment.Provider provider;
    private final bg0<Set<String>> selectedSubscriptionValues;
    private final AdblockSettings settings;

    protected SettingsViewModel(Application application, AdblockSettings adblockSettings, BaseSettingsFragment.Provider provider) {
    }

    private void initFilterListsValues() {
    }

    protected boolean addDomain(String str) {
    }

    protected ConnectionType getAllowedConnectionType() {
    }

    protected Object getAllowlistedDomain(int i) {
    }

    protected int getAllowlistedDomainsCount() {
    }

    protected bg0<CharSequence[]> getAvailableSubscriptionsTitles() {
    }

    protected bg0<CharSequence[]> getAvailableSubscriptionsValues() {
    }

    protected bg0<Set<String>> getSelectedSubscriptionValues() {
    }

    protected void handleAcceptableAdsEnabledChanged(Boolean bool) {
    }

    protected void handleAllowedConnectionTypeChanged(String str) {
    }

    protected void handleEnabledChanged(boolean z) {
    }

    protected void handleFilterListsChanged(Set<String> set) {
    }

    public boolean isAcceptableAdsEnabled() {
    }

    public boolean isAdblockEnabled() {
    }

    protected String prepareDomain(String str) {
    }

    protected void removeDomain(int i) {
    }
}
