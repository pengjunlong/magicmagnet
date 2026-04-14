package org.adblockplus.libadblockplus.android.settings;

import java.io.Serializable;
import java.util.List;
import org.adblockplus.libadblockplus.android.ConnectionType;
import org.adblockplus.libadblockplus.android.Subscription;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AdblockSettings implements Serializable {
    private volatile boolean acceptableAdsEnabled;
    private volatile boolean adblockEnabled;
    private ConnectionType allowedConnectionType;
    private List<String> allowlistedDomains;
    private List<Subscription> availableSubscriptions;
    private List<Subscription> selectedSubscriptions;

    public ConnectionType getAllowedConnectionType() {
    }

    public List<String> getAllowlistedDomains() {
    }

    public List<Subscription> getAvailableSubscriptions() {
    }

    public List<Subscription> getSelectedSubscriptions() {
    }

    public boolean isAcceptableAdsEnabled() {
    }

    public boolean isAdblockEnabled() {
    }

    public void setAcceptableAdsEnabled(boolean z) {
    }

    public void setAdblockEnabled(boolean z) {
    }

    public void setAllowedConnectionType(ConnectionType connectionType) {
    }

    public void setAllowlistedDomains(List<String> list) {
    }

    public void setAvailableSubscriptions(List<Subscription> list) {
    }

    public void setSelectedSubscriptions(List<Subscription> list) {
    }

    public String toString() {
    }
}
