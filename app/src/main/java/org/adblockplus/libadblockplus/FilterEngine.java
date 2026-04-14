package org.adblockplus.libadblockplus;

import java.util.List;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class FilterEngine {
    public static final String EMPTY_PARENT = "";
    public static final String EMPTY_SITEKEY = "";
    protected final long ptr;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class ContentType {
        private static final /* synthetic */ ContentType[] $VALUES = null;
        public static final ContentType DOCUMENT = null;
        public static final ContentType ELEMHIDE = null;
        public static final ContentType FONT = null;
        public static final ContentType GENERICBLOCK = null;
        public static final ContentType GENERICHIDE = null;
        public static final ContentType IMAGE = null;
        public static final ContentType MEDIA = null;
        public static final ContentType OBJECT = null;
        public static final ContentType OBJECT_SUBREQUEST = null;
        public static final ContentType OTHER = null;
        public static final ContentType PING = null;
        public static final ContentType SCRIPT = null;
        public static final ContentType STYLESHEET = null;
        public static final ContentType SUBDOCUMENT = null;
        public static final ContentType WEBRTC = null;
        public static final ContentType WEBSOCKET = null;
        public static final ContentType XMLHTTPREQUEST = null;

        private static /* synthetic */ ContentType[] $values() {
        }

        private ContentType(String str, int i) {
        }

        public static Set<ContentType> maskOf(ContentType... contentTypeArr) {
        }

        public static ContentType valueOf(String str) {
        }

        public static ContentType[] values() {
        }
    }

    public static class EmulationSelector {
        public String selector;
        public String text;

        public EmulationSelector(String str, String str2) {
        }
    }

    FilterEngine(long j) {
    }

    private static native void addFilter(long j, String str);

    private static native void addSubscription(long j, String str);

    private static native List<Subscription> fetchAvailableSubscriptions(long j, FilterEngine filterEngine);

    private static native String getAcceptableAdsSubscriptionURL(long j);

    private static native String getAllowedConnectionType(long j);

    private static native List<EmulationSelector> getElementHidingEmulationSelectors(long j, String str);

    private static native String getElementHidingStyleSheet(long j, String str, boolean z);

    private static native Filter getFilter(long j, String str);

    private static native String getHostFromURL(long j, String str);

    private static native List<Filter> getListedFilters(long j);

    private static native List<Subscription> getListedSubscriptions(long j, FilterEngine filterEngine);

    private static native long getNativePtr(long j);

    private static native JsValue getPref(long j, String str);

    private static native Subscription getSubscription(long j, String str, FilterEngine filterEngine);

    private static native boolean isAcceptableAdsEnabled(long j);

    private static native boolean isContentAllowlisted(long j, String str, ContentType[] contentTypeArr, List<String> list, String str2);

    private static native boolean isDocumentAllowlisted(long j, String str, List<String> list, String str2);

    private static native boolean isElemhideAllowlisted(long j, String str, List<String> list, String str2);

    private static native boolean isEnabled(long j);

    private static native boolean isGenericblockAllowlisted(long j, String str, List<String> list, String str2);

    private static native Filter matches(long j, String str, ContentType[] contentTypeArr, String str2, String str3, boolean z);

    private static native Filter matches(long j, String str, ContentType[] contentTypeArr, List<String> list, String str2, boolean z);

    private static native void registerNatives();

    private static native void removeFilter(long j, String str);

    private static native void removeFilterChangeCallback(long j);

    private static native void removeSubscription(long j, String str);

    private static native void setAcceptableAdsEnabled(long j, boolean z);

    private static native void setAllowedConnectionType(long j, String str);

    private static native void setEnabled(long j, boolean z);

    private static native void setFilterChangeCallback(long j, long j2);

    private static native void setPref(long j, String str, long j2);

    private static native void updateFiltersAsync(long j, String str);

    public void addFilter(Filter filter) {
    }

    public void addSubscription(Subscription subscription) {
    }

    public List<Subscription> fetchAvailableSubscriptions() {
    }

    public String getAcceptableAdsSubscriptionURL() {
    }

    public String getAllowedConnectionType() {
    }

    public List<EmulationSelector> getElementHidingEmulationSelectors(String str) {
    }

    public String getElementHidingStyleSheet(String str) {
    }

    public Filter getFilter(String str) {
    }

    public String getHostFromURL(String str) {
    }

    public List<Filter> getListedFilters() {
    }

    public List<Subscription> getListedSubscriptions() {
    }

    public long getNativePtr() {
    }

    public JsValue getPref(String str) {
    }

    public Subscription getSubscription(String str) {
    }

    public boolean isAcceptableAdsEnabled() {
    }

    public boolean isContentAllowlisted(String str, Set<ContentType> set, List<String> list, String str2) {
    }

    @Deprecated
    public boolean isDocumentAllowlisted(String str, List<String> list, String str2) {
    }

    @Deprecated
    public boolean isElemhideAllowlisted(String str, List<String> list, String str2) {
    }

    public boolean isEnabled() {
    }

    @Deprecated
    public boolean isGenericblockAllowlisted(String str, List<String> list, String str2) {
    }

    @Deprecated
    public Filter matches(String str, Set<ContentType> set, List<String> list, String str2) {
    }

    public void removeFilter(Filter filter) {
    }

    public void removeFilterChangeCallback() {
    }

    public void removeSubscription(Subscription subscription) {
    }

    public void setAcceptableAdsEnabled(boolean z) {
    }

    public void setAllowedConnectionType(String str) {
    }

    public void setEnabled(boolean z) {
    }

    public void setFilterChangeCallback(FilterChangeCallback filterChangeCallback) {
    }

    public void setPref(String str, JsValue jsValue) {
    }

    public void updateFiltersAsync(String str) {
    }

    public String getElementHidingStyleSheet(String str, boolean z) {
    }

    @Deprecated
    public Filter matches(String str, Set<ContentType> set, List<String> list, String str2, boolean z) {
    }

    public Filter matches(String str, Set<ContentType> set, String str2, String str3, boolean z) {
    }
}
