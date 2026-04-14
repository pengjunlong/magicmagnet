package org.adblockplus.libadblockplus.android.webview;

import java.lang.ref.WeakReference;
import org.adblockplus.libadblockplus.sitekey.SiteKeysConfiguration;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class BaseSiteKeyExtractor implements SiteKeyExtractor {
    public static final int RESOURCE_HOLD_MAX_TIME_MS = 1000;
    private boolean isEnabled;
    private SiteKeysConfiguration siteKeysConfiguration;
    protected final WeakReference<AdblockWebView> webViewWeakReference;

    protected BaseSiteKeyExtractor(AdblockWebView adblockWebView) {
    }

    protected SiteKeysConfiguration getSiteKeysConfiguration() {
    }

    public boolean isEnabled() {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public void setEnabled(boolean z) {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public void setSiteKeysConfiguration(SiteKeysConfiguration siteKeysConfiguration) {
    }
}
