package org.adblockplus.libadblockplus;

import java.lang.ref.WeakReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Subscription {
    private final String author;
    protected final WeakReference<FilterEngine> filterEngine;
    private final String homepage;
    private final String languages;
    private final String title;
    protected final String url;

    private Subscription(String str, String str2, String str3, String str4, String str5, FilterEngine filterEngine) {
    }

    private static native String getSynchronizationStatus(long j, String str);

    private static native boolean isAcceptableAds(long j, String str);

    private static native boolean isDisabled(long j, String str);

    private static native boolean isUpdating(long j, String str);

    private static native void registerNatives();

    private static native void setDisabled(long j, boolean z, String str);

    private static native void updateFilters(long j, String str);

    public void addToList() {
    }

    public boolean equals(Object obj) {
    }

    public String getAuthor() {
    }

    public String getHomepage() {
    }

    public String getLanguages() {
    }

    public String getSynchronizationStatus() {
    }

    public String getTitle() {
    }

    public String getUrl() {
    }

    public int hashCode() {
    }

    public boolean isAcceptableAds() {
    }

    public boolean isDisabled() {
    }

    public boolean isListed() {
    }

    public boolean isUpdating() {
    }

    public void removeFromList() {
    }

    public void setDisabled(boolean z) {
    }

    public void updateFilters() {
    }
}
