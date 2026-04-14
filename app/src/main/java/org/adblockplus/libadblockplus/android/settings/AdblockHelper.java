package org.adblockplus.libadblockplus.android.settings;

import android.content.Context;
import java.util.Map;
import org.adblockplus.libadblockplus.android.AdblockEngine;
import org.adblockplus.libadblockplus.android.AdblockEngineProvider;
import org.adblockplus.libadblockplus.android.SingleInstanceEngineProvider;
import org.adblockplus.libadblockplus.sitekey.SiteKeysConfiguration;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AdblockHelper {
    public static final String PREFERENCE_NAME = "ADBLOCK";
    public static final String PRELOAD_PREFERENCE_NAME = "ADBLOCK_PRELOAD";
    private static AdblockHelper _instance;
    private final AdblockEngineProvider.BeforeEngineDisposedListener beforeEngineDisposedListener;
    private Context context;
    private final AdblockEngineProvider.EngineCreatedListener engineCreatedListener;
    private final AdblockEngineProvider.EngineDisposedListener engineDisposedListener;
    private AdblockEngine.Builder factory;
    private boolean isInitialized;
    private SingleInstanceEngineProvider provider;
    private SiteKeysConfiguration siteKeysConfiguration;
    private AdblockSettingsStorage storage;

    /* renamed from: org.adblockplus.libadblockplus.android.settings.AdblockHelper$1 */
    class C17491 implements AdblockEngineProvider.EngineCreatedListener {
        final /* synthetic */ AdblockHelper this$0;

        C17491(AdblockHelper adblockHelper) {
        }

        @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider.EngineCreatedListener
        public void onAdblockEngineCreated(AdblockEngine adblockEngine) {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.settings.AdblockHelper$2 */
    class C17502 implements AdblockEngineProvider.BeforeEngineDisposedListener {
        final /* synthetic */ AdblockHelper this$0;

        C17502(AdblockHelper adblockHelper) {
        }

        @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider.BeforeEngineDisposedListener
        public void onBeforeAdblockEngineDispose() {
        }
    }

    /* renamed from: org.adblockplus.libadblockplus.android.settings.AdblockHelper$3 */
    class C17513 implements AdblockEngineProvider.EngineDisposedListener {
        final /* synthetic */ AdblockHelper this$0;

        C17513(AdblockHelper adblockHelper) {
        }

        @Override // org.adblockplus.libadblockplus.android.AdblockEngineProvider.EngineDisposedListener
        public void onAdblockEngineDisposed() {
        }
    }

    protected AdblockHelper() {
    }

    static /* synthetic */ AdblockSettingsStorage access$000(AdblockHelper adblockHelper) {
    }

    public static synchronized void deinit() {
    }

    public static synchronized AdblockHelper get() {
    }

    private void initFactory(Context context, String str) {
    }

    private void initProvider() {
    }

    private void initSiteKeysConfiguration() {
    }

    private void initStorage(Context context, String str) {
    }

    public AdblockHelper addEngineCreatedListener(AdblockEngineProvider.EngineCreatedListener engineCreatedListener) {
    }

    public AdblockHelper addEngineDisposedListener(AdblockEngineProvider.EngineDisposedListener engineDisposedListener) {
    }

    @Deprecated
    public int getCounter() {
    }

    public boolean getDisabledByDefault() {
    }

    @Deprecated
    public AdblockEngine getEngine() {
    }

    public AdblockEngine.Builder getFactory() {
    }

    public AdblockEngineProvider getProvider() {
    }

    public SiteKeysConfiguration getSiteKeysConfiguration() {
    }

    public AdblockSettingsStorage getStorage() {
    }

    public AdblockHelper init(Context context, String str, String str2) {
    }

    public boolean isInit() {
    }

    public AdblockHelper preloadSubscriptions(String str, Map<String, Integer> map) {
    }

    @Deprecated
    public boolean release() {
    }

    @Deprecated
    public boolean retain(boolean z) {
    }

    public AdblockHelper setDisabledByDefault() {
    }

    @Deprecated
    public void waitForReady() {
    }

    public AdblockHelper preloadSubscriptions(Integer num, Integer num2) {
    }

    @Deprecated
    public AdblockHelper init(Context context, String str, boolean z, String str2) {
    }
}
