package org.adblockplus.libadblockplus.android.webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import org.adblockplus.libadblockplus.sitekey.SiteKeysConfiguration;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface SiteKeyExtractor {
    WebResourceResponse extract(WebResourceRequest webResourceRequest);

    void setEnabled(boolean z);

    void setSiteKeysConfiguration(SiteKeysConfiguration siteKeysConfiguration);

    void startNewPage();

    boolean waitForSitekeyCheck(String str, boolean z);
}
