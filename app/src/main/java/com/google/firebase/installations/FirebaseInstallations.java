package com.google.firebase.installations;

import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    private static final String API_KEY_VALIDATION_MSG = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String APP_ID_VALIDATION_MSG = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String AUTH_ERROR_MSG = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    private static final String CHIME_FIREBASE_APP_NAME = "CHIME_ANDROID_SDK";
    private static final int CORE_POOL_SIZE = 0;
    private static final long KEEP_ALIVE_TIME_IN_SECONDS = 30;
    private static final String LOCKFILE_NAME_GENERATE_FID = "generatefid.lock";
    private static final int MAXIMUM_POOL_SIZE = 1;
    private static final String PROJECT_ID_VALIDATION_MSG = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final ThreadFactory THREAD_FACTORY = null;
    private static final Object lockGenerateFid = null;
    private final ExecutorService backgroundExecutor;
    private String cachedFid;
    private final RandomFidGenerator fidGenerator;
    private Set<FidListener> fidListeners;
    private final FirebaseApp firebaseApp;
    private final IidStore iidStore;
    private final List<StateListener> listeners;
    private final Object lock;
    private final ExecutorService networkExecutor;
    private final PersistedInstallation persistedInstallation;
    private final FirebaseInstallationServiceClient serviceClient;
    private final Utils utils;

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$1 */
    class ThreadFactoryC11541 implements ThreadFactory {
        private final AtomicInteger mCount;

        ThreadFactoryC11541() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$2 */
    class C11552 implements FidListenerHandle {
        final /* synthetic */ FirebaseInstallations this$0;
        final /* synthetic */ FidListener val$listener;

        C11552(FirebaseInstallations firebaseInstallations, FidListener fidListener) {
        }

        @Override // com.google.firebase.installations.internal.FidListenerHandle
        public void unregister() {
        }
    }

    /* renamed from: com.google.firebase.installations.FirebaseInstallations$3 */
    static /* synthetic */ class C11563 {

        /* renamed from: $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode */
        static final /* synthetic */ int[] f114xc38d2559 = null;

        /* renamed from: $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode */
        static final /* synthetic */ int[] f115xe5baa01a = null;
    }

    FirebaseInstallations(FirebaseApp firebaseApp, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2) {
    }

    static /* synthetic */ Set access$000(FirebaseInstallations firebaseInstallations) {
    }

    private Task<InstallationTokenResult> addGetAuthTokenListener() {
    }

    private Task<String> addGetIdListener() {
    }

    private void addStateListeners(StateListener stateListener) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(FirebaseInstallations firebaseInstallations, boolean z) {
    }

    private Void deleteFirebaseInstallationId() throws FirebaseInstallationsException {
    }

    private void doNetworkCallIfNecessary(boolean z) {
    }

    private final void doRegistrationOrRefresh(boolean z) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(FirebaseInstallations firebaseInstallations) {
    }

    public static /* synthetic */ Void dpbdpqRKAscW1lll1l(FirebaseInstallations firebaseInstallations) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(FirebaseInstallations firebaseInstallations, boolean z) {
    }

    private PersistedInstallationEntry fetchAuthTokenFromServer(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
    }

    private synchronized String getCacheFid() {
    }

    public static FirebaseInstallations getInstance() {
    }

    private PersistedInstallationEntry getMultiProcessSafePrefs() {
    }

    private PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
    }

    private void insertOrUpdatePrefs(PersistedInstallationEntry persistedInstallationEntry) {
    }

    private /* synthetic */ void lambda$doRegistrationOrRefresh$2(boolean z) {
    }

    private /* synthetic */ void lambda$getId$0() {
    }

    private /* synthetic */ void lambda$getToken$1(boolean z) {
    }

    private void preConditionChecks() {
    }

    private String readExistingIidOrCreateFid(PersistedInstallationEntry persistedInstallationEntry) {
    }

    private PersistedInstallationEntry registerFidWithServer(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
    }

    private void triggerOnException(Exception exc) {
    }

    private void triggerOnStateReached(PersistedInstallationEntry persistedInstallationEntry) {
    }

    private synchronized void updateCacheFid(String str) {
    }

    private synchronized void updateFidListener(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public Task<Void> delete() {
    }

    String getApiKey() {
    }

    String getApplicationId() {
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public Task<String> getId() {
    }

    String getName() {
    }

    String getProjectIdentifier() {
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public Task<InstallationTokenResult> getToken(boolean z) {
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public synchronized FidListenerHandle registerFidListener(FidListener fidListener) {
    }

    public static FirebaseInstallations getInstance(FirebaseApp firebaseApp) {
    }

    FirebaseInstallations(ExecutorService executorService, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, IidStore iidStore, RandomFidGenerator randomFidGenerator) {
    }
}
