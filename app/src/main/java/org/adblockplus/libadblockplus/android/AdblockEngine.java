package org.adblockplus.libadblockplus.android;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.adblockplus.libadblockplus.AppInfo;
import org.adblockplus.libadblockplus.FileSystem;
import org.adblockplus.libadblockplus.FilterChangeCallback;
import org.adblockplus.libadblockplus.FilterEngine;
import org.adblockplus.libadblockplus.HttpClient;
import org.adblockplus.libadblockplus.IsAllowedConnectionCallback;
import org.adblockplus.libadblockplus.LogSystem;
import org.adblockplus.libadblockplus.Platform;
import org.adblockplus.libadblockplus.android.AndroidHttpClientResourceWrapper;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class AdblockEngine {
    public static final String BASE_PATH_DIRECTORY = "adblock";
    private volatile boolean elemhideEnabled;
    private volatile boolean enabled;
    private volatile FileSystem fileSystem;
    private volatile FilterChangeCallback filterChangeCallback;
    private volatile FilterEngine filterEngine;
    private volatile HttpClient httpClient;
    private volatile LogSystem logSystem;
    private volatile Platform platform;
    private final Set<SettingsChangedListener> settingsChangedListeners;

    public static class Builder implements Factory {
        private HttpClient androidHttpClient;
        private final AppInfo appInfo;
        private final String basePath;
        private Context context;
        private boolean enabledByDefault;
        private final AdblockEngine engine;
        private boolean forceUpdatePreloadedSubscriptions;
        private IsAllowedConnectionCallback isAllowedConnectionCallback;
        private AndroidHttpClientResourceWrapper.Storage resourceStorage;
        private Map<String, Integer> urlToResourceIdMap;
        private Long v8IsolateProviderPtr;

        /* renamed from: org.adblockplus.libadblockplus.android.AdblockEngine$Builder$1 */
        class C17401 implements AndroidHttpClientResourceWrapper.Listener {
            final /* synthetic */ Builder this$0;

            C17401(Builder builder) {
            }

            @Override // org.adblockplus.libadblockplus.android.AndroidHttpClientResourceWrapper.Listener
            public void onIntercepted(String str, int i) {
            }
        }

        protected Builder(Context context, AppInfo appInfo, String str) {
        }

        static /* synthetic */ AdblockEngine access$300(Builder builder) {
        }

        private void createEngines() {
        }

        private void initCallbacks() {
        }

        private void initRequests() {
        }

        @Override // org.adblockplus.libadblockplus.android.AdblockEngine.Factory
        public AdblockEngine build() {
        }

        public Builder enableElementHiding(boolean z) {
        }

        public boolean getDisableByDefault() {
        }

        public Builder preloadSubscriptions(Context context, Map<String, Integer> map, AndroidHttpClientResourceWrapper.Storage storage) {
        }

        public Builder setDisableByDefault() {
        }

        public Builder setFilterChangeCallback(FilterChangeCallback filterChangeCallback) {
        }

        public Builder setForceUpdatePreloadedSubscriptions(boolean z) {
        }

        public Builder setHttpClient(HttpClient httpClient) {
        }

        public Builder setIsAllowedConnectionCallback(IsAllowedConnectionCallback isAllowedConnectionCallback) {
        }

        public Builder useV8IsolateProvider(long j) {
        }
    }

    public interface Factory {
        AdblockEngine build();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class MatchesResult {
        private static final /* synthetic */ MatchesResult[] $VALUES = null;
        public static final MatchesResult ALLOWLISTED = null;
        public static final MatchesResult BLOCKED = null;
        public static final MatchesResult NOT_ENABLED = null;
        public static final MatchesResult NOT_FOUND = null;

        private static /* synthetic */ MatchesResult[] $values() {
        }

        private MatchesResult(String str, int i) {
        }

        public static MatchesResult valueOf(String str) {
        }

        public static MatchesResult[] values() {
        }
    }

    public interface SettingsChangedListener {
        void onEnableStateChanged(boolean z);
    }

    static /* synthetic */ boolean access$002(AdblockEngine adblockEngine, boolean z) {
    }

    static /* synthetic */ FilterChangeCallback access$100(AdblockEngine adblockEngine) {
    }

    static /* synthetic */ FilterChangeCallback access$102(AdblockEngine adblockEngine, FilterChangeCallback filterChangeCallback) {
    }

    static /* synthetic */ HttpClient access$200(AdblockEngine adblockEngine) {
    }

    static /* synthetic */ HttpClient access$202(AdblockEngine adblockEngine, HttpClient httpClient) {
    }

    static /* synthetic */ FilterEngine access$400(AdblockEngine adblockEngine) {
    }

    static /* synthetic */ FilterEngine access$402(AdblockEngine adblockEngine, FilterEngine filterEngine) {
    }

    static /* synthetic */ LogSystem access$500(AdblockEngine adblockEngine) {
    }

    static /* synthetic */ LogSystem access$502(AdblockEngine adblockEngine, LogSystem logSystem) {
    }

    static /* synthetic */ FileSystem access$600(AdblockEngine adblockEngine) {
    }

    static /* synthetic */ FileSystem access$602(AdblockEngine adblockEngine, FileSystem fileSystem) {
    }

    static /* synthetic */ Platform access$700(AdblockEngine adblockEngine) {
    }

    static /* synthetic */ Platform access$702(AdblockEngine adblockEngine, Platform platform) {
    }

    static /* synthetic */ boolean access$802(AdblockEngine adblockEngine, boolean z) {
    }

    public static Builder builder(Context context, AppInfo appInfo, String str) {
    }

    private static Subscription convertJsSubscription(org.adblockplus.libadblockplus.Subscription subscription) {
    }

    private static Subscription[] convertJsSubscriptions(List<org.adblockplus.libadblockplus.Subscription> list) {
    }

    public static AppInfo generateAppInfo(Context context, String str, String str2) {
    }

    public void addDomainAllowlistingFilter(String str) {
    }

    public void addDomainWhitelistingFilter(String str) {
    }

    public synchronized AdblockEngine addSettingsChangedListener(SettingsChangedListener settingsChangedListener) {
    }

    public void clearSubscriptions() {
    }

    public void dispose() {
    }

    public String getAcceptableAdsSubscriptionURL() {
    }

    public String getDocumentationLink() {
    }

    public List<FilterEngine.EmulationSelector> getElementHidingEmulationSelectors(String str, String str2, List<String> list, String str3) {
    }

    public String getElementHidingStyleSheet(String str, String str2, List<String> list, String str3, boolean z) {
    }

    public FilterEngine getFilterEngine() {
    }

    public Subscription[] getListedSubscriptions() {
    }

    public Subscription[] getRecommendedSubscriptions() {
    }

    public void initAllowlistedDomains(List<String> list) {
    }

    public boolean isAcceptableAdsEnabled() {
    }

    public boolean isContentAllowlisted(String str, Set<FilterEngine.ContentType> set, List<String> list, String str2) {
    }

    public boolean isElemhideEnabled() {
    }

    public boolean isEnabled() {
    }

    public MatchesResult matches(String str, Set<FilterEngine.ContentType> set, String str2, String str3, boolean z) {
    }

    public void onLowMemory() {
    }

    public void removeDomainAllowlistingFilter(String str) {
    }

    public synchronized AdblockEngine removeSettingsChangedListener(SettingsChangedListener settingsChangedListener) {
    }

    public void setAcceptableAdsEnabled(boolean z) {
    }

    public void setEnabled(boolean z) {
    }

    public void setSubscription(String str) {
    }

    public void setSubscriptions(Collection<String> collection) {
    }

    public static Builder builder(Context context, String str) {
    }

    public static AppInfo generateAppInfo(Context context) {
    }
}
