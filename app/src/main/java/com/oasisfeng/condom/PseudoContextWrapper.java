package com.oasisfeng.condom;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.view.Display;
import androidx.annotation.Keep;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class PseudoContextWrapper extends Context {
    final Context mBase;

    public PseudoContextWrapper(Context context) {
    }

    @Override // android.content.Context
    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
    }

    @Override // android.content.Context
    public int checkCallingOrSelfPermission(String str) {
    }

    @Override // android.content.Context
    public int checkCallingOrSelfUriPermission(Uri uri, int i) {
    }

    @Override // android.content.Context
    public int checkCallingPermission(String str) {
    }

    @Override // android.content.Context
    public int checkCallingUriPermission(Uri uri, int i) {
    }

    @Override // android.content.Context
    public int checkPermission(String str, int i, int i2) {
    }

    @Override // android.content.Context
    public int checkSelfPermission(String str) {
    }

    @Override // android.content.Context
    public int checkUriPermission(Uri uri, int i, int i2, int i3) {
    }

    @Override // android.content.Context
    @Deprecated
    public void clearWallpaper() throws IOException {
    }

    @Override // android.content.Context
    public Context createConfigurationContext(Configuration configuration) {
    }

    @Override // android.content.Context
    public Context createContextForSplit(String str) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.Context
    public Context createDeviceProtectedStorageContext() {
    }

    @Override // android.content.Context
    public Context createDisplayContext(Display display) {
    }

    @Override // android.content.Context
    public Context createPackageContext(String str, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.Context
    public String[] databaseList() {
    }

    @Override // android.content.Context
    public boolean deleteDatabase(String str) {
    }

    @Override // android.content.Context
    public boolean deleteFile(String str) {
    }

    @Override // android.content.Context
    public boolean deleteSharedPreferences(String str) {
    }

    @Override // android.content.Context
    public void enforceCallingOrSelfPermission(String str, String str2) {
    }

    @Override // android.content.Context
    public void enforceCallingOrSelfUriPermission(Uri uri, int i, String str) {
    }

    @Override // android.content.Context
    public void enforceCallingPermission(String str, String str2) {
    }

    @Override // android.content.Context
    public void enforceCallingUriPermission(Uri uri, int i, String str) {
    }

    @Override // android.content.Context
    public void enforcePermission(String str, int i, int i2, String str2) {
    }

    @Override // android.content.Context
    public void enforceUriPermission(Uri uri, int i, int i2, int i3, String str) {
    }

    @Override // android.content.Context
    public String[] fileList() {
    }

    @Override // android.content.Context
    public Context getApplicationContext() {
    }

    @Override // android.content.Context
    public ApplicationInfo getApplicationInfo() {
    }

    @Override // android.content.Context
    public AssetManager getAssets() {
    }

    @Override // android.content.Context
    public File getCacheDir() {
    }

    @Override // android.content.Context
    public ClassLoader getClassLoader() {
    }

    @Override // android.content.Context
    public File getCodeCacheDir() {
    }

    @Override // android.content.Context
    public ContentResolver getContentResolver() {
    }

    @Override // android.content.Context
    public File getDataDir() {
    }

    @Override // android.content.Context
    public File getDatabasePath(String str) {
    }

    @Override // android.content.Context
    public File getDir(String str, int i) {
    }

    @Override // android.content.Context
    public File getExternalCacheDir() {
    }

    @Override // android.content.Context
    public File[] getExternalCacheDirs() {
    }

    @Override // android.content.Context
    public File getExternalFilesDir(String str) {
    }

    @Override // android.content.Context
    public File[] getExternalFilesDirs(String str) {
    }

    @Override // android.content.Context
    public File[] getExternalMediaDirs() {
    }

    @Override // android.content.Context
    public File getFileStreamPath(String str) {
    }

    @Override // android.content.Context
    public File getFilesDir() {
    }

    @Override // android.content.Context
    public Looper getMainLooper() {
    }

    @Override // android.content.Context
    public File getNoBackupFilesDir() {
    }

    @Override // android.content.Context
    public File getObbDir() {
    }

    @Override // android.content.Context
    public File[] getObbDirs() {
    }

    @Override // android.content.Context
    public String getPackageCodePath() {
    }

    @Override // android.content.Context
    public PackageManager getPackageManager() {
    }

    @Override // android.content.Context
    public String getPackageName() {
    }

    @Override // android.content.Context
    public String getPackageResourcePath() {
    }

    @Override // android.content.Context
    public Resources getResources() {
    }

    @Override // android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
    }

    @Override // android.content.Context
    public Object getSystemService(String str) {
    }

    @Override // android.content.Context
    public String getSystemServiceName(Class<?> cls) {
    }

    @Override // android.content.Context
    public Resources.Theme getTheme() {
    }

    @Override // android.content.Context
    @Deprecated
    public Drawable getWallpaper() {
    }

    @Override // android.content.Context
    @Deprecated
    public int getWallpaperDesiredMinimumHeight() {
    }

    @Override // android.content.Context
    @Deprecated
    public int getWallpaperDesiredMinimumWidth() {
    }

    @Override // android.content.Context
    public void grantUriPermission(String str, Uri uri, int i) {
    }

    @Override // android.content.Context
    public boolean isDeviceProtectedStorage() {
    }

    @Override // android.content.Context
    public boolean isRestricted() {
    }

    @Override // android.content.Context
    public boolean moveDatabaseFrom(Context context, String str) {
    }

    @Override // android.content.Context
    public boolean moveSharedPreferencesFrom(Context context, String str) {
    }

    @Override // android.content.Context
    public FileInputStream openFileInput(String str) throws FileNotFoundException {
    }

    @Override // android.content.Context
    public FileOutputStream openFileOutput(String str, int i) throws FileNotFoundException {
    }

    @Override // android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
    }

    @Override // android.content.Context
    @Deprecated
    public Drawable peekWallpaper() {
    }

    @Override // android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
    }

    @Override // android.content.Context
    @SuppressLint({"MissingPermission"})
    public void removeStickyBroadcast(Intent intent) {
    }

    @Override // android.content.Context
    @SuppressLint({"MissingPermission"})
    @Deprecated
    public void removeStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
    }

    @Override // android.content.Context
    public void revokeUriPermission(Uri uri, int i) {
    }

    @Override // android.content.Context
    public void sendBroadcast(Intent intent) {
    }

    @Override // android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle) {
    }

    @Override // android.content.Context
    public void sendOrderedBroadcast(Intent intent, String str) {
    }

    @Override // android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
    }

    @Override // android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendStickyBroadcast(Intent intent) {
    }

    @Override // android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
    }

    @Override // android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
    }

    @Override // android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
    }

    @Override // android.content.Context
    public void setTheme(int i) {
    }

    @Override // android.content.Context
    @Deprecated
    public void setWallpaper(Bitmap bitmap) throws IOException {
    }

    @Override // android.content.Context
    public void startActivities(Intent[] intentArr) {
    }

    @Override // android.content.Context
    public void startActivity(Intent intent) {
    }

    @Override // android.content.Context
    public ComponentName startForegroundService(Intent intent) {
    }

    @Override // android.content.Context
    public boolean startInstrumentation(ComponentName componentName, String str, Bundle bundle) {
    }

    @Override // android.content.Context
    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) throws IntentSender.SendIntentException {
    }

    @Override // android.content.Context
    public ComponentName startService(Intent intent) {
    }

    @Override // android.content.Context
    public boolean stopService(Intent intent) {
    }

    @Override // android.content.Context
    public void unbindService(ServiceConnection serviceConnection) {
    }

    @Override // android.content.Context
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
    }

    @Override // android.content.Context
    public int checkUriPermission(Uri uri, String str, String str2, int i, int i2, int i3) {
    }

    @Override // android.content.Context
    public void enforceUriPermission(Uri uri, String str, String str2, int i, int i2, int i3, String str3) {
    }

    @Override // android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
    }

    @Override // android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
    }

    @Override // android.content.Context
    public void revokeUriPermission(String str, Uri uri, int i) {
    }

    @Override // android.content.Context
    public void sendBroadcast(Intent intent, String str) {
    }

    @Override // android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str) {
    }

    @Override // android.content.Context
    public void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
    }

    @Override // android.content.Context
    @Deprecated
    public void setWallpaper(InputStream inputStream) throws IOException {
    }

    @Override // android.content.Context
    public void startActivities(Intent[] intentArr, Bundle bundle) {
    }

    @Override // android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
    }

    @Override // android.content.Context
    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) throws IntentSender.SendIntentException {
    }

    @Override // android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
    }

    @Override // android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
    }
}
