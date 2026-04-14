package org.adblockplus.libadblockplus.android.webview;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.adblockplus.libadblockplus.HeaderEntry;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class SharedCookieManager extends CookieManager {
    static final String PROP_ACCEPT_TPC = "X-Prop-Accept-Tpc";
    static final String PROP_NAVIGATION_URL = "X-Prop-Navigation-Url";
    private static final AtomicReference<CookieHandler> previousCookieManager = null;

    private SharedCookieManager() {
    }

    static void enforceCookieManager() {
    }

    static void injectPropertyHeaders(boolean z, String str, List<HeaderEntry> list) {
    }

    static void unloadCookieManager() {
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
    }

    @Override // java.net.CookieManager
    public CookieStore getCookieStore() {
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) {
    }

    @Override // java.net.CookieManager
    public void setCookiePolicy(CookiePolicy cookiePolicy) {
    }
}
