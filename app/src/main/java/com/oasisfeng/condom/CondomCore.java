package com.oasisfeng.condom;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import androidx.annotation.Keep;
import com.oasisfeng.condom.CondomKit;
import com.oasisfeng.condom.util.Lazy;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CondomCore {
    private static final int EVENT_TAG = 0;
    static final int FLAG_RECEIVER_EXCLUDE_BACKGROUND = 8388608;
    static final Function<ResolveInfo, String> RECEIVER_PACKAGE_GETTER = null;
    static final Function<ResolveInfo, String> SERVICE_PACKAGE_GETTER = null;
    final boolean DEBUG;
    final Context mBase;
    private final Lazy<ContentResolver> mContentResolver;
    boolean mDryRun;
    boolean mExcludeBackgroundReceivers;
    boolean mExcludeBackgroundServices;
    boolean mExcludeStoppedPackages;
    private final CondomKitManager mKitManager;
    OutboundJudge mOutboundJudge;
    private final Lazy<PackageManager> mPackageManager;

    /* JADX INFO: Add missing generic type declarations: [T, E] */
    /* renamed from: com.oasisfeng.condom.CondomCore$1 */
    class C14221<E, T> implements WrappedValueProcedureThrows<List<T>, E> {
        final /* synthetic */ CondomCore bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ WrappedValueProcedureThrows dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ Intent dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ OutboundType dpbdpqRKAscW1lll1l;
        final /* synthetic */ Function dqqppqiKzJi1l1lll1l;

        C14221(CondomCore condomCore, WrappedValueProcedureThrows wrappedValueProcedureThrows, Intent intent, Function function, OutboundType outboundType) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public List<T> dpbdbdpbLwkLpObyKsq1lll1() throws Throwable {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomCore$2 */
    class C14232 extends Lazy<PackageManager> {
        final /* synthetic */ Context dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ String dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomCore dqqppqiKzJi1l1lll1l;

        C14232(CondomCore condomCore, Context context, String str) {
        }

        @Override // com.oasisfeng.condom.util.Lazy
        protected /* bridge */ /* synthetic */ PackageManager create() {
        }

        protected PackageManager dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomCore$3 */
    class C14243 extends Lazy<ContentResolver> {
        final /* synthetic */ Context dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomCore dpbdbdpbLwkLpObyKsq1lll1;

        C14243(CondomCore condomCore, Context context) {
        }

        @Override // com.oasisfeng.condom.util.Lazy
        protected /* bridge */ /* synthetic */ ContentResolver create() {
        }

        protected ContentResolver dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomCore$4 */
    static class C14254 implements Function<ResolveInfo, String> {
        C14254() {
        }

        @Override // com.oasisfeng.condom.CondomCore.Function
        public /* bridge */ /* synthetic */ String apply(ResolveInfo resolveInfo) {
        }

        public String dbpqdHhmDSIHIJiwc1ll1l1(ResolveInfo resolveInfo) {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomCore$5 */
    static class C14265 implements Function<ResolveInfo, String> {
        C14265() {
        }

        @Override // com.oasisfeng.condom.CondomCore.Function
        public /* bridge */ /* synthetic */ String apply(ResolveInfo resolveInfo) {
        }

        public String dbpqdHhmDSIHIJiwc1ll1l1(ResolveInfo resolveInfo) {
        }
    }

    class BackgroundUidFilter {
        private final List<ActivityManager.RunningServiceInfo> dbpqdHhmDSIHIJiwc1ll1l1;
        private final List<ActivityManager.RunningAppProcessInfo> dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomCore dqqppqiKzJi1l1lll1l;

        BackgroundUidFilter(CondomCore condomCore) {
        }

        boolean dbpqdHhmDSIHIJiwc1ll1l1(int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class CondomEvent {
        public static final CondomEvent bpdqqiQNVROMLC1ll1l1l11 = null;
        private static final /* synthetic */ CondomEvent[] ddbbbeXHXx111ll = null;
        public static final CondomEvent dpbdpqRKAscW1lll1l = null;
        public static final CondomEvent dqpqqqbqQyjyB11111l1 = null;
        public static final CondomEvent ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;

        private CondomEvent(String str, int i) {
        }

        public static CondomEvent valueOf(String str) {
        }

        public static CondomEvent[] values() {
        }
    }

    static class CondomKitManager implements CondomKit.CondomKitRegistry {
        final Map<String, CondomKit.SystemServiceSupplier> dbpqdHhmDSIHIJiwc1ll1l1;
        final Set<String> dpbdbdpbLwkLpObyKsq1lll1;

        CondomKitManager() {
        }

        @Override // com.oasisfeng.condom.CondomKit.CondomKitRegistry
        public void dbpqdHhmDSIHIJiwc1ll1l1(String str, CondomKit.SystemServiceSupplier systemServiceSupplier) {
        }

        @Override // com.oasisfeng.condom.CondomKit.CondomKitRegistry
        public void dpbdbdpbLwkLpObyKsq1lll1(String str) {
        }
    }

    interface Function<T, R> {
        R apply(T t);
    }

    class ReceiverRestrictedContext extends ContextWrapper {
        final /* synthetic */ CondomCore dbpqdHhmDSIHIJiwc1ll1l1;

        ReceiverRestrictedContext(CondomCore condomCore, Context context) {
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        }
    }

    static abstract class WrappedProcedure implements WrappedValueProcedure<Boolean> {
        WrappedProcedure() {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public Boolean dpbdbdpbLwkLpObyKsq1lll1() {
        }

        abstract void dqqppqiKzJi1l1lll1l();
    }

    interface WrappedValueProcedure<R> extends WrappedValueProcedureThrows<R, RuntimeException> {
    }

    interface WrappedValueProcedureThrows<R, T extends Throwable> {
        R dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable;
    }

    CondomCore(Context context, CondomOptions condomOptions, String str) {
    }

    static /* synthetic */ boolean access$000(CondomCore condomCore, OutboundType outboundType, Intent intent, String str) {
    }

    @SuppressLint({"WrongConstant"})
    private int adjustIntentFlags(OutboundType outboundType, Intent intent) {
    }

    static String asLogTag(String str) {
    }

    static String buildLogTag(String str, String str2, String str3) {
    }

    private static String getCaller() {
    }

    static String getTargetPackage(Intent intent) {
    }

    private void log(String str, CondomEvent condomEvent, String... strArr) {
    }

    private boolean shouldBlockRequestTarget(OutboundType outboundType, Intent intent, String str) {
    }

    ResolveInfo filterCandidates(OutboundType outboundType, Intent intent, List<ResolveInfo> list, String str, boolean z) {
    }

    ContentResolver getContentResolver() {
    }

    PackageManager getPackageManager() {
    }

    String getPackageName() {
    }

    Set<String> getSpoofPermissions() {
    }

    Object getSystemService(String str) {
    }

    void logConcern(String str, String str2) {
    }

    void logIfOutboundPass(String str, Intent intent, String str2, CondomEvent condomEvent) {
    }

    <R, T extends Throwable> R proceed(OutboundType outboundType, Intent intent, R r, WrappedValueProcedureThrows<R, T> wrappedValueProcedureThrows) throws Throwable {
    }

    void proceedBroadcast(Context context, Intent intent, WrappedValueProcedure<Boolean> wrappedValueProcedure, BroadcastReceiver broadcastReceiver) {
    }

    <T, E extends Throwable> List<T> proceedQuery(OutboundType outboundType, Intent intent, WrappedValueProcedureThrows<List<T>, E> wrappedValueProcedureThrows, Function<T, String> function) throws Throwable {
    }

    boolean shouldAllowProvider(ProviderInfo providerInfo) {
    }

    boolean shouldSpoofPermission(String str) {
    }

    boolean shouldAllowProvider(Context context, String str, int i) {
    }

    <R, T extends Throwable> R proceed(OutboundType outboundType, String str, R r, WrappedValueProcedureThrows<R, T> wrappedValueProcedureThrows) throws Throwable {
    }
}
