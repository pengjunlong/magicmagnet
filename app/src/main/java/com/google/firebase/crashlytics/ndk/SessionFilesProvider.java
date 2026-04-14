package com.google.firebase.crashlytics.ndk;

import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class SessionFilesProvider implements NativeSessionFileProvider {
    private final SessionFiles sessionFiles;

    SessionFilesProvider(SessionFiles sessionFiles) {
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
}
