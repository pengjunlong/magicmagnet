package com.tencent.tinker.entry;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.tencent.tinker.anno.Keep;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class ApplicationLike implements ApplicationLifeCycle {
    private final Application application;
    private final long applicationStartElapsedTime;
    private final long applicationStartMillisTime;
    private final int tinkerFlags;
    private final boolean tinkerLoadVerifyFlag;
    private final Intent tinkerResultIntent;

    public ApplicationLike(Application application, int i, boolean z, long j, long j2, Intent intent) {
    }

    public Application getApplication() {
    }

    public long getApplicationStartElapsedTime() {
    }

    public long getApplicationStartMillisTime() {
    }

    @Keep
    public AssetManager getAssets(AssetManager assetManager) {
    }

    @Keep
    public Context getBaseContext(Context context) {
    }

    @Keep
    public ClassLoader getClassLoader(ClassLoader classLoader) {
    }

    @Keep
    public Resources getResources(Resources resources) {
    }

    @Keep
    public Object getSystemService(String str, Object obj) {
    }

    public final int getTinkerFlags() {
    }

    public final boolean getTinkerLoadVerifyFlag() {
    }

    public final Intent getTinkerResultIntent() {
    }

    @Keep
    public int mzNightModeUseOf() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onBaseContextAttached(Context context) {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onCreate() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onLowMemory() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTerminate() {
    }

    @Override // com.tencent.tinker.entry.ApplicationLifeCycle
    public void onTrimMemory(int i) {
    }
}
