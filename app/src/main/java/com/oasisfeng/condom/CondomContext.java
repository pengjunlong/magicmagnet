package com.oasisfeng.condom;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.UserHandle;
import androidx.annotation.Keep;
import com.oasisfeng.condom.CondomCore;
import com.oasisfeng.condom.util.Lazy;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class CondomContext extends ContextWrapper {
    final String TAG;
    private final Context mApplicationContext;
    private final Lazy<Context> mBaseContext;
    CondomCore mCondom;

    /* renamed from: com.oasisfeng.condom.CondomContext$1 */
    class C14131 implements CondomCore.WrappedValueProcedure<Boolean> {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ ServiceConnection dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomContext dpbdpqRKAscW1lll1l;
        final /* synthetic */ int dqqppqiKzJi1l1lll1l;

        C14131(CondomContext condomContext, Intent intent, ServiceConnection serviceConnection, int i) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public Boolean dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$10, reason: invalid class name */
    class AnonymousClass10 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomContext dpbdbdpbLwkLpObyKsq1lll1;

        AnonymousClass10(CondomContext condomContext, Intent intent) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$11, reason: invalid class name */
    class AnonymousClass11 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ UserHandle dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomContext dqqppqiKzJi1l1lll1l;

        AnonymousClass11(CondomContext condomContext, Intent intent, UserHandle userHandle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$12, reason: invalid class name */
    class AnonymousClass12 extends CondomCore.WrappedProcedure {
        final /* synthetic */ String bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ BroadcastReceiver dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ int dpbdpqRKAscW1lll1l;
        final /* synthetic */ CondomContext dqpqqqbqQyjyB11111l1;
        final /* synthetic */ Handler dqqppqiKzJi1l1lll1l;
        final /* synthetic */ Bundle ppbdpwWWljzmXXdHNabfWhgjl111l11;

        AnonymousClass12(CondomContext condomContext, Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$13, reason: invalid class name */
    class AnonymousClass13 extends CondomCore.WrappedProcedure {
        final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomContext ddbbbeXHXx111ll;
        final /* synthetic */ UserHandle dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ Handler dpbdpqRKAscW1lll1l;
        final /* synthetic */ Bundle dqpqqqbqQyjyB11111l1;
        final /* synthetic */ BroadcastReceiver dqqppqiKzJi1l1lll1l;
        final /* synthetic */ String ppbdpwWWljzmXXdHNabfWhgjl111l11;

        AnonymousClass13(CondomContext condomContext, Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$14, reason: invalid class name */
    class AnonymousClass14 extends Lazy<Context> {
        final /* synthetic */ CondomContext dbpqdHhmDSIHIJiwc1ll1l1;

        AnonymousClass14(CondomContext condomContext) {
        }

        @Override // com.oasisfeng.condom.util.Lazy
        protected /* bridge */ /* synthetic */ Context create() {
        }

        protected Context dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$2 */
    class C14142 implements CondomCore.WrappedValueProcedure<ComponentName> {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomContext dpbdbdpbLwkLpObyKsq1lll1;

        C14142(CondomContext condomContext, Intent intent) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
        public /* bridge */ /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
        }

        public ComponentName dpbdbdpbLwkLpObyKsq1lll1() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$3 */
    class C14153 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomContext dpbdbdpbLwkLpObyKsq1lll1;

        C14153(CondomContext condomContext, Intent intent) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$4 */
    class C14164 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ String dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomContext dqqppqiKzJi1l1lll1l;

        C14164(CondomContext condomContext, Intent intent, String str) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$5 */
    class C14175 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ UserHandle dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomContext dqqppqiKzJi1l1lll1l;

        C14175(CondomContext condomContext, Intent intent, UserHandle userHandle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$6 */
    class C14186 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ UserHandle dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomContext dpbdpqRKAscW1lll1l;
        final /* synthetic */ String dqqppqiKzJi1l1lll1l;

        C14186(CondomContext condomContext, Intent intent, UserHandle userHandle, String str) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$7 */
    class C14197 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ String dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ CondomContext dqqppqiKzJi1l1lll1l;

        C14197(CondomContext condomContext, Intent intent, String str) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$8 */
    class C14208 extends CondomCore.WrappedProcedure {
        final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ CondomContext ddbbbeXHXx111ll;
        final /* synthetic */ String dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ Handler dpbdpqRKAscW1lll1l;
        final /* synthetic */ Bundle dqpqqqbqQyjyB11111l1;
        final /* synthetic */ BroadcastReceiver dqqppqiKzJi1l1lll1l;
        final /* synthetic */ String ppbdpwWWljzmXXdHNabfWhgjl111l11;

        C14208(CondomContext condomContext, Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    /* renamed from: com.oasisfeng.condom.CondomContext$9 */
    class C14219 extends CondomCore.WrappedProcedure {
        final /* synthetic */ Handler bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ Bundle ddbbbeXHXx111ll;
        final /* synthetic */ UserHandle dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ BroadcastReceiver dpbdpqRKAscW1lll1l;
        final /* synthetic */ CondomContext dqpdbEevAufTOvPphbjykClll1l11;
        final /* synthetic */ String dqpqqqbqQyjyB11111l1;
        final /* synthetic */ String dqqppqiKzJi1l1lll1l;
        final /* synthetic */ int ppbdpwWWljzmXXdHNabfWhgjl111l11;

        C14219(CondomContext condomContext, Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        }

        @Override // com.oasisfeng.condom.CondomCore.WrappedProcedure
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    private static class PseudoContextImpl extends PseudoContextWrapper {
        public PseudoContextImpl(CondomContext condomContext) {
        }
    }

    private CondomContext(CondomCore condomCore, Context context, String str) {
    }

    static /* synthetic */ boolean access$001(CondomContext condomContext, Intent intent, ServiceConnection serviceConnection, int i) {
    }

    static /* synthetic */ void access$1001(CondomContext condomContext, Intent intent, UserHandle userHandle) {
    }

    static /* synthetic */ ComponentName access$101(CondomContext condomContext, Intent intent) {
    }

    static /* synthetic */ void access$1101(CondomContext condomContext, Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
    }

    static /* synthetic */ void access$1201(CondomContext condomContext, Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
    }

    static /* synthetic */ void access$201(CondomContext condomContext, Intent intent) {
    }

    static /* synthetic */ void access$301(CondomContext condomContext, Intent intent, String str) {
    }

    static /* synthetic */ void access$401(CondomContext condomContext, Intent intent, UserHandle userHandle) {
    }

    static /* synthetic */ void access$501(CondomContext condomContext, Intent intent, UserHandle userHandle, String str) {
    }

    static /* synthetic */ void access$601(CondomContext condomContext, Intent intent, String str) {
    }

    static /* synthetic */ void access$701(CondomContext condomContext, Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
    }

    static /* synthetic */ void access$801(CondomContext condomContext, Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
    }

    static /* synthetic */ void access$901(CondomContext condomContext, Intent intent) {
    }

    public static CondomContext wrap(Context context, String str) {
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

    @Deprecated
    public CondomContext preventBroadcastToBackgroundPackages(boolean z) {
    }

    @Deprecated
    public CondomContext preventServiceInBackgroundPackages(boolean z) {
    }

    @Deprecated
    public CondomContext preventWakingUpStoppedPackages(boolean z) {
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

    public CondomContext setDryRun(boolean z) {
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ComponentName startService(Intent intent) {
    }

    public static CondomContext wrap(Context context, String str, CondomOptions condomOptions) {
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
