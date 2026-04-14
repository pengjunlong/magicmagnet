package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {
    private static final NativeSessionFileProvider MISSING_NATIVE_SESSION_FILE_PROVIDER = null;
    private final AtomicReference<CrashlyticsNativeComponent> availableNativeComponent;
    private final Deferred<CrashlyticsNativeComponent> deferredNativeComponent;

    private static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        private MissingNativeSessionFileProvider() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getAppFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getBinaryImagesFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getDeviceFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getMetadataFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getMinidumpFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getOsFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public File getSessionFile() {
        }

        /* synthetic */ MissingNativeSessionFileProvider(C10941 c10941) {
        }
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred<CrashlyticsNativeComponent> deferred) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy, Provider provider) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(String str, Provider provider) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(String str, String str2, long j, StaticSessionData staticSessionData, Provider provider) {
    }

    private static /* synthetic */ void lambda$finalizeSession$2(String str, Provider provider) {
    }

    private /* synthetic */ void lambda$new$0(Provider provider) {
    }

    private static /* synthetic */ void lambda$openSession$1(String str, String str2, long j, StaticSessionData staticSessionData, Provider provider) {
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void finalizeSession(String str) {
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public NativeSessionFileProvider getSessionFileProvider(String str) {
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(String str) {
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void openSession(String str, String str2, long j, StaticSessionData staticSessionData) {
    }
}
