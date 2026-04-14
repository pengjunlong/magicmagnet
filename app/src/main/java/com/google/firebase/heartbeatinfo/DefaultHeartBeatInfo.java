package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class DefaultHeartBeatInfo implements HeartBeatInfo {
    private static final ThreadFactory THREAD_FACTORY = null;
    private final Executor backgroundExecutor;
    private final Set<HeartBeatConsumer> consumers;
    private Provider<HeartBeatInfoStorage> storageProvider;

    private DefaultHeartBeatInfo(Context context, Set<HeartBeatConsumer> set) {
    }

    public static /* synthetic */ HeartBeatInfo bpdqqiQNVROMLC1ll1l1l11(ComponentContainer componentContainer) {
    }

    public static Component<HeartBeatInfo> component() {
    }

    public static /* synthetic */ Thread dbpqdHhmDSIHIJiwc1ll1l1(Runnable runnable) {
    }

    public static /* synthetic */ List dpbdbdpbLwkLpObyKsq1lll1(DefaultHeartBeatInfo defaultHeartBeatInfo) {
    }

    public static /* synthetic */ Void dpbdpqRKAscW1lll1l(DefaultHeartBeatInfo defaultHeartBeatInfo, String str) {
    }

    public static /* synthetic */ HeartBeatInfoStorage dqqppqiKzJi1l1lll1l(Context context) {
    }

    private static /* synthetic */ HeartBeatInfo lambda$component$4(ComponentContainer componentContainer) {
    }

    private /* synthetic */ List lambda$getAndClearStoredHeartBeatInfo$2() throws Exception {
    }

    private static /* synthetic */ HeartBeatInfoStorage lambda$new$1(Context context) {
    }

    private static /* synthetic */ Thread lambda$static$0(Runnable runnable) {
    }

    private /* synthetic */ Void lambda$storeHeartBeatInfo$3(String str) throws Exception {
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public Task<List<HeartBeatResult>> getAndClearStoredHeartBeatInfo() {
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public HeartBeatInfo.HeartBeat getHeartBeatCode(String str) {
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public Task<Void> storeHeartBeatInfo(String str) {
    }

    DefaultHeartBeatInfo(Provider<HeartBeatInfoStorage> provider, Set<HeartBeatConsumer> set, Executor executor) {
    }
}
