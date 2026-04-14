package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class BaseUrlExclusionList {
    private final Map<Integer, Long> excludedPriorities;
    private final Map<String, Long> excludedServiceLocations;
    private final Random random;
    private final Map<List<Pair<String, Integer>>, BaseUrl> selectionsTaken;

    public BaseUrlExclusionList() {
    }

    private static <T> void addExclusion(T t, long j, Map<T, Long> map) {
    }

    private List<BaseUrl> applyExclusions(List<BaseUrl> list) {
    }

    private static int compareBaseUrl(BaseUrl baseUrl, BaseUrl baseUrl2) {
    }

    public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(BaseUrl baseUrl, BaseUrl baseUrl2) {
    }

    public static int getPriorityCount(List<BaseUrl> list) {
    }

    private static <T> void removeExpiredExclusions(long j, Map<T, Long> map) {
    }

    private BaseUrl selectWeighted(List<BaseUrl> list) {
    }

    public void exclude(BaseUrl baseUrl, long j) {
    }

    public int getPriorityCountAfterExclusion(List<BaseUrl> list) {
    }

    public void reset() {
    }

    public BaseUrl selectBaseUrl(List<BaseUrl> list) {
    }

    BaseUrlExclusionList(Random random) {
    }
}
