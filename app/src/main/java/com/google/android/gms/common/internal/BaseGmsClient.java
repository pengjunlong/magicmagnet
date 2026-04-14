package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BaseGmsClient<T extends IInterface> {

    @KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = null;

    @KeepForSdk
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final Feature[] zzd = null;
    final Handler zza;
    private ConnectionResult zzaa;
    private boolean zzab;
    private volatile com.google.android.gms.common.internal.zzc zzac;

    @VisibleForTesting
    protected ConnectionProgressReportCallbacks zzb;

    @VisibleForTesting
    protected AtomicInteger zzc;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private volatile String zzj;

    @VisibleForTesting
    private zzk zzk;
    private final Context zzl;
    private final Looper zzm;
    private final GmsClientSupervisor zzn;
    private final GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    private final Object zzq;
    private IGmsServiceBroker zzr;
    private T zzs;
    private final ArrayList<zzc<?>> zzt;
    private zzd zzu;
    private int zzv;
    private final BaseConnectionCallbacks zzw;
    private final BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final String zzz;

    @KeepForSdk
    public interface BaseConnectionCallbacks {

        @KeepForSdk
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;

        @KeepForSdk
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @KeepForSdk
        void onConnected(Bundle bundle);

        @KeepForSdk
        void onConnectionSuspended(int i);
    }

    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void onReportServiceBinding(ConnectionResult connectionResult);
    }

    protected class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        private final /* synthetic */ BaseGmsClient zza;

        @KeepForSdk
        public LegacyClientCallbackAdapter(BaseGmsClient baseGmsClient) {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public void onReportServiceBinding(ConnectionResult connectionResult) {
        }
    }

    @KeepForSdk
    public interface SignOutCallbacks {
        @KeepForSdk
        void onSignOutComplete();
    }

    private abstract class zza extends zzc<Boolean> {
        private final int zza;
        private final Bundle zzb;
        private final /* synthetic */ BaseGmsClient zzc;

        protected zza(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        }

        protected abstract void zza(ConnectionResult connectionResult);

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zzc
        protected final /* synthetic */ void zza(Boolean bool) {
        }

        protected abstract boolean zza();

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zzc
        protected final void zzb() {
        }
    }

    final class zzb extends com.google.android.gms.internal.common.zzi {
        private final /* synthetic */ BaseGmsClient zza;

        public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        }

        private static void zza(Message message) {
        }

        private static boolean zzb(Message message) {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
        }
    }

    protected abstract class zzc<TListener> {
        private TListener zza;
        private boolean zzb;
        private final /* synthetic */ BaseGmsClient zzc;

        public zzc(BaseGmsClient baseGmsClient, TListener tlistener) {
        }

        protected abstract void zza(TListener tlistener);

        protected abstract void zzb();

        public final void zzc() {
        }

        public final void zzd() {
        }

        public final void zze() {
        }
    }

    @VisibleForTesting
    public final class zzd implements ServiceConnection {
        private final int zza;
        private final /* synthetic */ BaseGmsClient zzb;

        public zzd(BaseGmsClient baseGmsClient, int i) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @VisibleForTesting
    public static final class zze extends IGmsCallbacks.zza {
        private BaseGmsClient zza;
        private final int zzb;

        public zze(BaseGmsClient baseGmsClient, int i) {
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) {
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void zza(int i, Bundle bundle) {
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void zza(int i, IBinder iBinder, com.google.android.gms.common.internal.zzc zzcVar) {
        }
    }

    @KeepForSdk
    protected BaseGmsClient(Context context, Looper looper, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
    }

    private final String zza() {
    }

    private final boolean zzb() {
    }

    private final boolean zzc() {
    }

    static /* synthetic */ ConnectionResult zzd(BaseGmsClient baseGmsClient) {
    }

    static /* synthetic */ BaseConnectionCallbacks zze(BaseGmsClient baseGmsClient) {
    }

    static /* synthetic */ ArrayList zzf(BaseGmsClient baseGmsClient) {
    }

    static /* synthetic */ BaseOnConnectionFailedListener zzg(BaseGmsClient baseGmsClient) {
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
    }

    @KeepForSdk
    protected final void checkConnected() {
    }

    @KeepForSdk
    public void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
    }

    @KeepForSdk
    protected abstract T createServiceInterface(IBinder iBinder);

    @KeepForSdk
    public void disconnect(String str) {
    }

    @KeepForSdk
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @KeepForSdk
    protected boolean enableLocalFallback() {
    }

    @KeepForSdk
    public Account getAccount() {
    }

    @KeepForSdk
    public Feature[] getApiFeatures() {
    }

    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
    }

    @KeepForSdk
    public Bundle getConnectionHint() {
    }

    @KeepForSdk
    public final Context getContext() {
    }

    @KeepForSdk
    public String getEndpointPackageName() {
    }

    @KeepForSdk
    protected Bundle getGetServiceRequestExtraArgs() {
    }

    @KeepForSdk
    public String getLastDisconnectMessage() {
    }

    @KeepForSdk
    protected String getLocalStartServiceAction() {
    }

    @KeepForSdk
    public final Looper getLooper() {
    }

    @KeepForSdk
    public int getMinApkVersion() {
    }

    @KeepForSdk
    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
    }

    @KeepForSdk
    protected Set<Scope> getScopes() {
    }

    @KeepForSdk
    public final T getService() throws DeadObjectException {
    }

    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
    }

    @KeepForSdk
    protected abstract String getServiceDescriptor();

    @KeepForSdk
    public Intent getSignInIntent() {
    }

    @KeepForSdk
    protected abstract String getStartServiceAction();

    @KeepForSdk
    protected String getStartServicePackage() {
    }

    @KeepForSdk
    protected boolean getUseDynamicLookup() {
    }

    @KeepForSdk
    public boolean isConnected() {
    }

    @KeepForSdk
    public boolean isConnecting() {
    }

    @KeepForSdk
    protected void onConnectedLocked(T t) {
    }

    @KeepForSdk
    protected void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @KeepForSdk
    protected void onConnectionSuspended(int i) {
    }

    @KeepForSdk
    protected void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
    }

    @KeepForSdk
    void onSetConnectState(int i, T t) {
    }

    @KeepForSdk
    public void onUserSignOut(SignOutCallbacks signOutCallbacks) {
    }

    @KeepForSdk
    public boolean providesSignIn() {
    }

    @KeepForSdk
    public boolean requiresAccount() {
    }

    @KeepForSdk
    public boolean requiresGooglePlayServices() {
    }

    @KeepForSdk
    public boolean requiresSignIn() {
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int i) {
    }

    @VisibleForTesting
    @KeepForSdk
    protected void triggerNotAvailable(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, PendingIntent pendingIntent) {
    }

    private final void zza(com.google.android.gms.common.internal.zzc zzcVar) {
    }

    protected final class zzf extends zza {
        private final IBinder zza;
        private final /* synthetic */ BaseGmsClient zzb;

        public zzf(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zza
        protected final void zza(ConnectionResult connectionResult) {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zza
        protected final boolean zza() {
        }
    }

    private final void zza(int i, T t) {
    }

    @KeepForSdk
    public void disconnect() {
    }

    protected final class zzg extends zza {
        private final /* synthetic */ BaseGmsClient zza;

        public zzg(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zza
        protected final void zza(ConnectionResult connectionResult) {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zza
        protected final boolean zza() {
        }
    }

    static /* synthetic */ boolean zzb(BaseGmsClient baseGmsClient) {
    }

    static /* synthetic */ boolean zzc(BaseGmsClient baseGmsClient) {
    }

    @VisibleForTesting
    @KeepForSdk
    protected BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
    }

    @VisibleForTesting
    @KeepForSdk
    protected BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
    }

    private final boolean zza(int i, int i2, T t) {
    }

    private final void zza(int i) {
    }

    protected final void zza(int i, Bundle bundle, int i2) {
    }

    static /* synthetic */ void zza(BaseGmsClient baseGmsClient, int i) {
    }

    static /* synthetic */ Object zza(BaseGmsClient baseGmsClient) {
    }

    static /* synthetic */ IGmsServiceBroker zza(BaseGmsClient baseGmsClient, IGmsServiceBroker iGmsServiceBroker) {
    }

    static /* synthetic */ ConnectionResult zza(BaseGmsClient baseGmsClient, ConnectionResult connectionResult) {
    }

    static /* synthetic */ void zza(BaseGmsClient baseGmsClient, int i, IInterface iInterface) {
    }

    static /* synthetic */ boolean zza(BaseGmsClient baseGmsClient, int i, int i2, IInterface iInterface) {
    }

    static /* synthetic */ void zza(BaseGmsClient baseGmsClient, com.google.android.gms.common.internal.zzc zzcVar) {
    }
}
