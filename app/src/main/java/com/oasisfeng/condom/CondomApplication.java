package com.oasisfeng.condom;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.UserHandle;
import com.oasisfeng.condom.CondomCore;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class CondomApplication extends Application {
    private final Application bpdqqiQNVROMLC1ll1l1l11;
    private final CondomCore dpbdpqRKAscW1lll1l;
    private final String ppbdpwWWljzmXXdHNabfWhgjl111l11;

    /* renamed from: com.oasisfeng.condom.CondomApplication$1 */
    class C14041 implements CondomCore.WrappedValueProcedure<Boolean> {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ ServiceConnection dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomApplication dpbdpqRKAscW1lll1l;
        final /* synthetic */ int dqqppqiKzJi1l1lll1l;

        C14041(CondomApplication condomApplication, Intent intent, ServiceConnection serviceConnection, int i) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public Boolean dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$10, reason: invalid class name */
    class AnonymousClass10 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomApplication dpbdbdpbLwkLpObyKsq1lll1;

        AnonymousClass10(CondomApplication condomApplication, Intent intent) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$11, reason: invalid class name */
    class AnonymousClass11 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ UserHandle dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomApplication dqqppqiKzJi1l1lll1l;

        AnonymousClass11(CondomApplication condomApplication, Intent intent, UserHandle userHandle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$12, reason: invalid class name */
    class AnonymousClass12 extends CondomCore.WrappedProcedure {
        final /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ BroadcastReceiver dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ int dpbdpqRKAscW1lll1l;
        final /* synthetic */ CondomApplication dqpqqqbqQyjyB11111l1;
        final /* synthetic */ Handler dqqppqiKzJi1l1lll1l;
        final /* synthetic */ Bundle ppbdpwWWljzmXXdHNabfWhgjl111l11;

        AnonymousClass12(CondomApplication condomApplication, Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$13, reason: invalid class name */
    class AnonymousClass13 extends CondomCore.WrappedProcedure {
        final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomApplication ddbbbeXHXx111ll;
        final /* synthetic */ UserHandle dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ Handler dpbdpqRKAscW1lll1l;
        final /* synthetic */ Bundle dqpqqqbqQyjyB11111l1;
        final /* synthetic */ BroadcastReceiver dqqppqiKzJi1l1lll1l;
        final /* synthetic */ String ppbdpwWWljzmXXdHNabfWhgjl111l11;

        AnonymousClass13(CondomApplication condomApplication, Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$2 */
    class C14052 implements CondomCore.WrappedValueProcedure<ComponentName> {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomApplication dpbdbdpbLwkLpObyKsq1lll1;

        C14052(CondomApplication condomApplication, Intent intent) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public ComponentName dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$3 */
    class C14063 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomApplication dpbdbdpbLwkLpObyKsq1lll1;

        C14063(CondomApplication condomApplication, Intent intent) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$4 */
    class C14074 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ String dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomApplication dqqppqiKzJi1l1lll1l;

        C14074(CondomApplication condomApplication, Intent intent, String str) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$5 */
    class C14085 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ UserHandle dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomApplication dqqppqiKzJi1l1lll1l;

        C14085(CondomApplication condomApplication, Intent intent, UserHandle userHandle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$6 */
    class C14096 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ UserHandle dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomApplication dpbdpqRKAscW1lll1l;
        final /* synthetic */ String dqqppqiKzJi1l1lll1l;

        C14096(CondomApplication condomApplication, Intent intent, UserHandle userHandle, String str) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$7 */
    class C14107 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ String dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomApplication dqqppqiKzJi1l1lll1l;

        C14107(CondomApplication condomApplication, Intent intent, String str) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$8 */
    class C14118 extends CondomCore.WrappedProcedure {
        final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomApplication ddbbbeXHXx111ll;
        final /* synthetic */ String dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ Handler dpbdpqRKAscW1lll1l;
        final /* synthetic */ Bundle dqpqqqbqQyjyB11111l1;
        final /* synthetic */ BroadcastReceiver dqqppqiKzJi1l1lll1l;
        final /* synthetic */ String ppbdpwWWljzmXXdHNabfWhgjl111l11;

        C14118(CondomApplication condomApplication, Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomApplication$9 */
    class C14129 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Handler bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ Bundle ddbbbeXHXx111ll;
        final /* synthetic */ UserHandle dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ BroadcastReceiver dpbdpqRKAscW1lll1l;
        final /* synthetic */ CondomApplication dqpdbEevAufTOvPphbjykClll1l11;
        final /* synthetic */ String dqpqqqbqQyjyB11111l1;
        final /* synthetic */ String dqqppqiKzJi1l1lll1l;
        final /* synthetic */ int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        C14129(CondomApplication condomApplication, Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    CondomApplication(CondomCore condomCore, Application application, String str) {
    }

    static /* synthetic */ Application dbpqdHhmDSIHIJiwc1ll1l1(CondomApplication condomApplication) {
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public int checkPermission(String str, int i, int i2) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public int checkSelfPermission(String str) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ContentResolver getContentResolver() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public PackageManager getPackageManager() {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
    }

    @Override // android.app.Application
    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
    }

    @Override // android.app.Application, android.content.ContextWrapper, android.content.Context
    public void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
    }

    @Override // android.app.Application
    public void registerOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void sendBroadcast(Intent intent) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void sendOrderedBroadcast(Intent intent, String str) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendStickyBroadcast(Intent intent) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ComponentName startService(Intent intent) {
    }

    @Override // android.app.Application
    public void unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
    }

    @Override // android.app.Application, android.content.ContextWrapper, android.content.Context
    public void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
    }

    @Override // android.app.Application
    public void unregisterOnProvideAssistDataListener(Application.OnProvideAssistDataListener onProvideAssistDataListener) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void sendBroadcast(Intent intent, String str) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @SuppressLint({"MissingPermission"})
    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
    }
}
