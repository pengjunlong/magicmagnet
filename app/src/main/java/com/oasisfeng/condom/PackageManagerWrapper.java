package com.oasisfeng.condom;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.FeatureInfo;
import android.content.pm.IPackageDataObserver;
import android.content.pm.IPackageDeleteObserver;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.InstrumentationInfo;
import android.content.pm.KeySet;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.UserHandle;
import androidx.annotation.Keep;
import java.util.List;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class PackageManagerWrapper extends PackageManager {
    private PackageManager mBase;

    PackageManagerWrapper(PackageManager packageManager) {
    }

    public void addCrossProfileIntentFilter(IntentFilter intentFilter, int i, int i2, int i3) {
    }

    public void addOnPermissionsChangeListener(PackageManager.OnPermissionsChangedListener onPermissionsChangedListener) {
    }

    @Override // android.content.pm.PackageManager
    public void addPackageToPreferred(String str) {
    }

    @Override // android.content.pm.PackageManager
    public boolean addPermission(PermissionInfo permissionInfo) {
    }

    @Override // android.content.pm.PackageManager
    public boolean addPermissionAsync(PermissionInfo permissionInfo) {
    }

    @Override // android.content.pm.PackageManager
    public void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
    }

    public void addPreferredActivityAsUser(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName, int i2) {
    }

    public Intent buildRequestPermissionsIntent(String[] strArr) {
    }

    @Override // android.content.pm.PackageManager
    public boolean canRequestPackageInstalls() {
    }

    @Override // android.content.pm.PackageManager
    public String[] canonicalToCurrentPackageNames(String[] strArr) {
    }

    @Override // android.content.pm.PackageManager
    public int checkPermission(String str, String str2) {
    }

    @Override // android.content.pm.PackageManager
    public int checkSignatures(String str, String str2) {
    }

    public void clearApplicationUserData(String str, IPackageDataObserver iPackageDataObserver) {
    }

    public void clearCrossProfileIntentFilters(int i) {
    }

    @Override // android.content.pm.PackageManager
    public void clearInstantAppCookie() {
    }

    @Override // android.content.pm.PackageManager
    public void clearPackagePreferredActivities(String str) {
    }

    @Override // android.content.pm.PackageManager
    public String[] currentToCanonicalPackageNames(String[] strArr) {
    }

    public void deleteApplicationCacheFiles(String str, IPackageDataObserver iPackageDataObserver) {
    }

    public void deleteApplicationCacheFilesAsUser(String str, int i, IPackageDataObserver iPackageDataObserver) {
    }

    public void deletePackage(String str, IPackageDeleteObserver iPackageDeleteObserver, int i) {
    }

    public void deletePackageAsUser(String str, IPackageDeleteObserver iPackageDeleteObserver, int i, int i2) {
    }

    @Override // android.content.pm.PackageManager
    public void extendVerificationTimeout(int i, int i2, long j) {
    }

    public void flushPackageRestrictionsAsUser(int i) {
    }

    public void freeStorage(long j, IntentSender intentSender) {
    }

    public void freeStorageAndNotify(long j, IPackageDataObserver iPackageDataObserver) {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityBanner(ComponentName componentName) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityIcon(ComponentName componentName) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public ActivityInfo getActivityInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityLogo(ComponentName componentName) throws PackageManager.NameNotFoundException {
    }

    public List<IntentFilter> getAllIntentFilters(String str) {
    }

    @Override // android.content.pm.PackageManager
    public List<PermissionGroupInfo> getAllPermissionGroups(int i) {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
    }

    @Override // android.content.pm.PackageManager
    public int getApplicationEnabledSetting(String str) {
    }

    public boolean getApplicationHiddenSettingAsUser(String str, UserHandle userHandle) {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
    }

    @Override // android.content.pm.PackageManager
    public ApplicationInfo getApplicationInfo(String str, int i) throws PackageManager.NameNotFoundException {
    }

    public ApplicationInfo getApplicationInfoAsUser(String str, int i, int i2) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
    }

    @Override // android.content.pm.PackageManager
    public ChangedPackages getChangedPackages(int i) {
    }

    @Override // android.content.pm.PackageManager
    public int getComponentEnabledSetting(ComponentName componentName) {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getDefaultActivityIcon() {
    }

    public String getDefaultBrowserPackageNameAsUser(int i) {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
    }

    public Drawable getEphemeralApplicationIcon(String str) {
    }

    public byte[] getEphemeralCookie() {
    }

    public int getEphemeralCookieMaxSizeBytes() {
    }

    public ComponentName getHomeActivities(List<ResolveInfo> list) {
    }

    @Override // android.content.pm.PackageManager
    public List<ApplicationInfo> getInstalledApplications(int i) {
    }

    @Override // android.content.pm.PackageManager
    public List<PackageInfo> getInstalledPackages(int i) {
    }

    public List<PackageInfo> getInstalledPackagesAsUser(int i, int i2) {
    }

    @Override // android.content.pm.PackageManager
    public String getInstallerPackageName(String str) {
    }

    @Override // android.content.pm.PackageManager
    public byte[] getInstantAppCookie() {
    }

    @Override // android.content.pm.PackageManager
    public int getInstantAppCookieMaxBytes() {
    }

    @Override // android.content.pm.PackageManager
    public InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
    }

    public int getIntentVerificationStatusAsUser(String str, int i) {
    }

    public KeySet getKeySetByAlias(String str, String str2) {
    }

    @Override // android.content.pm.PackageManager
    public Intent getLaunchIntentForPackage(String str) {
    }

    @Override // android.content.pm.PackageManager
    public Intent getLeanbackLaunchIntentForPackage(String str) {
    }

    public Drawable getManagedUserBadgedDrawable(Drawable drawable, Rect rect, int i) {
    }

    public int getMoveStatus(int i) {
    }

    @Override // android.content.pm.PackageManager
    public String getNameForUid(int i) {
    }

    @Override // android.content.pm.PackageManager
    public PackageInfo getPackageArchiveInfo(String str, int i) {
    }

    @Override // android.content.pm.PackageManager
    public int[] getPackageGids(String str) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
    }

    public PackageInfo getPackageInfoAsUser(String str, int i, int i2) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public PackageInstaller getPackageInstaller() {
    }

    public void getPackageSizeInfo(String str, IPackageStatsObserver iPackageStatsObserver) {
    }

    public void getPackageSizeInfoAsUser(String str, int i, IPackageStatsObserver iPackageStatsObserver) {
    }

    @Override // android.content.pm.PackageManager
    public int getPackageUid(String str, int i) throws PackageManager.NameNotFoundException {
    }

    public int getPackageUidAsUser(String str, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public String[] getPackagesForUid(int i) {
    }

    @Override // android.content.pm.PackageManager
    public List<PackageInfo> getPackagesHoldingPermissions(String[] strArr, int i) {
    }

    public String getPermissionControllerPackageName() {
    }

    public int getPermissionFlags(String str, String str2, UserHandle userHandle) {
    }

    @Override // android.content.pm.PackageManager
    public PermissionGroupInfo getPermissionGroupInfo(String str, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public PermissionInfo getPermissionInfo(String str, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public int getPreferredActivities(List<IntentFilter> list, List<ComponentName> list2, String str) {
    }

    @Override // android.content.pm.PackageManager
    public List<PackageInfo> getPreferredPackages(int i) {
    }

    @Override // android.content.pm.PackageManager
    public ProviderInfo getProviderInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public ActivityInfo getReceiverInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public Resources getResourcesForActivity(ComponentName componentName) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public Resources getResourcesForApplication(ApplicationInfo applicationInfo) throws PackageManager.NameNotFoundException {
    }

    public Resources getResourcesForApplicationAsUser(String str, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public ServiceInfo getServiceInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
    }

    public String getServicesSystemSharedLibraryPackageName() {
    }

    @Override // android.content.pm.PackageManager
    public List<SharedLibraryInfo> getSharedLibraries(int i) {
    }

    public String getSharedSystemSharedLibraryPackageName() {
    }

    public KeySet getSigningKeySet(String str) {
    }

    @Override // android.content.pm.PackageManager
    public FeatureInfo[] getSystemAvailableFeatures() {
    }

    @Override // android.content.pm.PackageManager
    public String[] getSystemSharedLibraryNames() {
    }

    @Override // android.content.pm.PackageManager
    public CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
    }

    public int getUidForSharedUser(String str) throws PackageManager.NameNotFoundException {
    }

    public Drawable getUserBadgeForDensity(UserHandle userHandle, int i) {
    }

    public Drawable getUserBadgeForDensityNoBackground(UserHandle userHandle, int i) {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
    }

    @Override // android.content.pm.PackageManager
    public CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
    }

    @Override // android.content.pm.PackageManager
    public XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
    }

    public void grantRuntimePermission(String str, String str2, UserHandle userHandle) {
    }

    @Override // android.content.pm.PackageManager
    public boolean hasSystemFeature(String str) {
    }

    public int installExistingPackage(String str) throws PackageManager.NameNotFoundException {
    }

    public int installExistingPackageAsUser(String str, int i) throws PackageManager.NameNotFoundException {
    }

    public boolean isEphemeralApplication() {
    }

    @Override // android.content.pm.PackageManager
    public boolean isInstantApp() {
    }

    public boolean isPackageAvailable(String str) {
    }

    public boolean isPackageSuspendedForUser(String str, int i) {
    }

    @Override // android.content.pm.PackageManager
    public boolean isPermissionRevokedByPolicy(String str, String str2) {
    }

    @Override // android.content.pm.PackageManager
    public boolean isSafeMode() {
    }

    public boolean isSignedBy(String str, KeySet keySet) {
    }

    public boolean isSignedByExactly(String str, KeySet keySet) {
    }

    public boolean isUpgrade() {
    }

    public Drawable loadItemIcon(PackageItemInfo packageItemInfo, ApplicationInfo applicationInfo) {
    }

    public Drawable loadUnbadgedItemIcon(PackageItemInfo packageItemInfo, ApplicationInfo applicationInfo) {
    }

    @Override // android.content.pm.PackageManager
    public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i) {
    }

    public List<ResolveInfo> queryBroadcastReceiversAsUser(Intent intent, int i, UserHandle userHandle) {
    }

    @Override // android.content.pm.PackageManager
    public List<ProviderInfo> queryContentProviders(String str, int i, int i2) {
    }

    @Override // android.content.pm.PackageManager
    public List<InstrumentationInfo> queryInstrumentation(String str, int i) {
    }

    @Override // android.content.pm.PackageManager
    public List<ResolveInfo> queryIntentActivities(Intent intent, int i) {
    }

    public List<ResolveInfo> queryIntentActivitiesAsUser(Intent intent, int i, int i2) {
    }

    @Override // android.content.pm.PackageManager
    public List<ResolveInfo> queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
    }

    @Override // android.content.pm.PackageManager
    public List<ResolveInfo> queryIntentContentProviders(Intent intent, int i) {
    }

    public List<ResolveInfo> queryIntentContentProvidersAsUser(Intent intent, int i, int i2) {
    }

    @Override // android.content.pm.PackageManager
    public List<ResolveInfo> queryIntentServices(Intent intent, int i) {
    }

    public List<ResolveInfo> queryIntentServicesAsUser(Intent intent, int i, int i2) {
    }

    @Override // android.content.pm.PackageManager
    public List<PermissionInfo> queryPermissionsByGroup(String str, int i) throws PackageManager.NameNotFoundException {
    }

    public void registerMoveCallback(PackageManager.MoveCallback moveCallback, Handler handler) {
    }

    public void removeOnPermissionsChangeListener(PackageManager.OnPermissionsChangedListener onPermissionsChangedListener) {
    }

    @Override // android.content.pm.PackageManager
    public void removePackageFromPreferred(String str) {
    }

    @Override // android.content.pm.PackageManager
    public void removePermission(String str) {
    }

    @Deprecated
    public void replacePreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
    }

    @Deprecated
    public void replacePreferredActivityAsUser(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName, int i2) {
    }

    @Override // android.content.pm.PackageManager
    public ResolveInfo resolveActivity(Intent intent, int i) {
    }

    public ResolveInfo resolveActivityAsUser(Intent intent, int i, int i2) {
    }

    @Override // android.content.pm.PackageManager
    public ProviderInfo resolveContentProvider(String str, int i) {
    }

    public ProviderInfo resolveContentProviderAsUser(String str, int i, int i2) {
    }

    @Override // android.content.pm.PackageManager
    public ResolveInfo resolveService(Intent intent, int i) {
    }

    public void revokeRuntimePermission(String str, String str2, UserHandle userHandle) {
    }

    @Override // android.content.pm.PackageManager
    public void setApplicationCategoryHint(String str, int i) {
    }

    @Override // android.content.pm.PackageManager
    public void setApplicationEnabledSetting(String str, int i, int i2) {
    }

    public boolean setApplicationHiddenSettingAsUser(String str, boolean z, UserHandle userHandle) {
    }

    @Override // android.content.pm.PackageManager
    public void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
    }

    public boolean setDefaultBrowserPackageNameAsUser(String str, int i) {
    }

    public boolean setEphemeralCookie(byte[] bArr) {
    }

    @Override // android.content.pm.PackageManager
    public void setInstallerPackageName(String str, String str2) {
    }

    public String[] setPackagesSuspendedAsUser(String[] strArr, boolean z, int i) {
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
    }

    public void unregisterMoveCallback(PackageManager.MoveCallback moveCallback) {
    }

    @Override // android.content.pm.PackageManager
    public void updateInstantAppCookie(byte[] bArr) {
    }

    public boolean updateIntentVerificationStatusAsUser(String str, int i, int i2) {
    }

    public void updatePermissionFlags(String str, String str2, int i, int i2, UserHandle userHandle) {
    }

    public void verifyIntentFilter(int i, int i2, List<String> list) {
    }

    @Override // android.content.pm.PackageManager
    public void verifyPendingInstall(int i, int i2) {
    }

    @Override // android.content.pm.PackageManager
    public int checkSignatures(int i, int i2) {
    }

    public void freeStorage(String str, long j, IntentSender intentSender) {
    }

    public void freeStorageAndNotify(String str, long j, IPackageDataObserver iPackageDataObserver) {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityBanner(Intent intent) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityIcon(Intent intent) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityLogo(Intent intent) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationBanner(String str) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationIcon(String str) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationLogo(String str) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public int[] getPackageGids(String str, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public PackageInfo getPackageInfo(VersionedPackage versionedPackage, int i) throws PackageManager.NameNotFoundException {
    }

    public int getPackageUidAsUser(String str, int i, int i2) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public Resources getResourcesForApplication(String str) throws PackageManager.NameNotFoundException {
    }

    @Override // android.content.pm.PackageManager
    public boolean hasSystemFeature(String str, int i) {
    }

    @Override // android.content.pm.PackageManager
    public boolean isInstantApp(String str) {
    }

    @Deprecated
    public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i, int i2) {
    }

    public List<ResolveInfo> queryBroadcastReceiversAsUser(Intent intent, int i, int i2) {
    }
}
