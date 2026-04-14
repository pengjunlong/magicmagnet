package com.oasisfeng.condom;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.oasisfeng.condom.CondomCore;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CondomPackageManager extends PackageManagerWrapper {
    private static final CondomCore.Function<String, String> dqqppqiKzJi1l1lll1l = null;
    private final CondomCore dbpqdHhmDSIHIJiwc1ll1l1;
    private final String dpbdbdpbLwkLpObyKsq1lll1;

    /* renamed from: com.oasisfeng.condom.CondomPackageManager$1 */
    class C14271 implements CondomCore.WrappedValueProcedure<List<ResolveInfo>> {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomPackageManager dqqppqiKzJi1l1lll1l;

        C14271(CondomPackageManager condomPackageManager, Intent intent, int i) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public List<ResolveInfo> dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomPackageManager$2 */
    class C14282 implements CondomCore.WrappedValueProcedure<List<ResolveInfo>> {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomPackageManager dpbdpqRKAscW1lll1l;
        final /* synthetic */ int dqqppqiKzJi1l1lll1l;

        C14282(CondomPackageManager condomPackageManager, Intent intent, int i, int i2) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public List<ResolveInfo> dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomPackageManager$3 */
    class C14293 implements CondomCore.WrappedValueProcedure<ResolveInfo> {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomPackageManager dpbdpqRKAscW1lll1l;
        final /* synthetic */ int dqqppqiKzJi1l1lll1l;

        C14293(CondomPackageManager condomPackageManager, Intent intent, int i, int i2) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public ResolveInfo dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomPackageManager$4 */
    class C14304 implements CondomCore.WrappedValueProcedureThrows<ApplicationInfo, PackageManager.NameNotFoundException> {
        final /* synthetic */ String dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomPackageManager dqqppqiKzJi1l1lll1l;

        C14304(CondomPackageManager condomPackageManager, String str, int i) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ ApplicationInfo dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public ApplicationInfo dpbdbdpbLwkLpObyKsq1lll1() throws PackageManager.NameNotFoundException {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomPackageManager$5 */
    class C14315 implements CondomCore.WrappedValueProcedureThrows<PackageInfo, PackageManager.NameNotFoundException> {
        final /* synthetic */ String dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ int dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomPackageManager dqqppqiKzJi1l1lll1l;

        C14315(CondomPackageManager condomPackageManager, String str, int i) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ PackageInfo dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public PackageInfo dpbdbdpbLwkLpObyKsq1lll1() throws PackageManager.NameNotFoundException {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomPackageManager$6 */
    class C14326 implements CondomCore.WrappedValueProcedure<List<String>> {
        final /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomPackageManager dpbdbdpbLwkLpObyKsq1lll1;

        C14326(CondomPackageManager condomPackageManager, int i) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public List<String> dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomPackageManager$7 */
    class C14337 implements CondomCore.WrappedValueProcedure<Integer> {
        final /* synthetic */ String dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ String dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomPackageManager dqqppqiKzJi1l1lll1l;

        C14337(CondomPackageManager condomPackageManager, String str, String str2) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public Integer dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomPackageManager$8 */
    static class C14348 implements CondomCore.Function<String, String> {
        C14348() {
        }

        @Override // com.oasisfeng.condom.CondomCore.Function
        public /* bridge */ /* synthetic */ String apply(String str) {
        }

        public String dbpqdHhmDSIHIJiwc1ll1l1(String str) {
        }
    }

    CondomPackageManager(CondomCore condomCore, PackageManager packageManager, String str) {
    }

    static /* synthetic */ ResolveInfo bpdqqiQNVROMLC1ll1l1l11(CondomPackageManager condomPackageManager, Intent intent, int i) {
    }

    static /* synthetic */ int dbppbdqpeLmcbs11l11(CondomPackageManager condomPackageManager, String str, String str2) {
    }

    static /* synthetic */ List dbpqdHhmDSIHIJiwc1ll1l1(CondomPackageManager condomPackageManager, Intent intent, int i) {
    }

    static /* synthetic */ PackageInfo ddbbbeXHXx111ll(CondomPackageManager condomPackageManager, String str, int i) throws PackageManager.NameNotFoundException {
    }

    static /* synthetic */ List dpbdbdpbLwkLpObyKsq1lll1(CondomPackageManager condomPackageManager, Intent intent, int i) {
    }

    static /* synthetic */ CondomCore dpbdpqRKAscW1lll1l(CondomPackageManager condomPackageManager) {
    }

    static /* synthetic */ String[] dqpdbEevAufTOvPphbjykClll1l11(CondomPackageManager condomPackageManager, int i) {
    }

    static /* synthetic */ ApplicationInfo dqpqqqbqQyjyB11111l1(CondomPackageManager condomPackageManager, String str, int i) throws PackageManager.NameNotFoundException {
    }

    static /* synthetic */ String dqqppqiKzJi1l1lll1l(CondomPackageManager condomPackageManager) {
    }

    static /* synthetic */ List ppbdpwWWljzmXXdHNabfWhgjl111l11(CondomPackageManager condomPackageManager, Intent intent, int i) {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public int checkPermission(String str, String str2) {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public ApplicationInfo getApplicationInfo(String str, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public List<ApplicationInfo> getInstalledApplications(int i) {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public List<PackageInfo> getInstalledPackages(int i) {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public PackageInstaller getPackageInstaller() {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public String[] getPackagesForUid(int i) {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i) {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public List<ResolveInfo> queryIntentServices(Intent intent, int i) {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public ProviderInfo resolveContentProvider(String str, int i) {
    }

    @Override // com.oasisfeng.condom.PackageManagerWrapper, android.content.pm.PackageManager
    public ResolveInfo resolveService(Intent intent, int i) {
    }
}
