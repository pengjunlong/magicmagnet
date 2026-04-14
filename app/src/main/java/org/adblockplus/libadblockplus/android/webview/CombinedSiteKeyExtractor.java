package org.adblockplus.libadblockplus.android.webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import org.adblockplus.libadblockplus.sitekey.SiteKeysConfiguration;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CombinedSiteKeyExtractor implements SiteKeyExtractor {
    private final SiteKeyExtractor httpExtractor;
    private final SiteKeyExtractor jsExtractor;

    protected CombinedSiteKeyExtractor(AdblockWebView adblockWebView) {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public WebResourceResponse extract(WebResourceRequest webResourceRequest) {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public void setEnabled(boolean z) {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public void setSiteKeysConfiguration(SiteKeysConfiguration siteKeysConfiguration) {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public void startNewPage() {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.SiteKeyExtractor
    public boolean waitForSitekeyCheck(String str, boolean z) {
    }
}
