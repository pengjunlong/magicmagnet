package com.tencent.bugly.beta.tinker;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.tencent.tinker.loader.app.TinkerApplication;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TinkerPatchReflectApplication extends TinkerApplication {
    private static final String TAG = "Tinker.ReflectApp";
    private boolean isReflectFailure;
    private String rawApplicationName;
    private Application realApplication;

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ContentResolver getContentResolver() {
    }

    public String getRawApplicationName(Context context) {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.app.Application
    public void onCreate() {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.app.Application
    public void onTerminate() {
    }

    @Override // com.tencent.tinker.loader.app.TinkerApplication, android.app.Application, android.content.ComponentCallbacks2
    @TargetApi(14)
    public void onTrimMemory(int i) {
    }

    @Override // android.app.Application
    @TargetApi(14)
    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
    }

    @Override // android.app.Application, android.content.ContextWrapper, android.content.Context
    @TargetApi(14)
    public void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
    }

    @Override // android.app.Application
    @TargetApi(18)
    public void registerOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(ServiceConnection serviceConnection) {
    }

    @Override // android.app.Application
    @TargetApi(14)
    public void unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
    }

    @Override // android.app.Application, android.content.ContextWrapper, android.content.Context
    @TargetApi(14)
    public void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
    }

    @Override // android.app.Application
    @TargetApi(18)
    public void unregisterOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
    }
}
