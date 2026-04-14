package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.exoplayer2.util.CopyOnWriteMultiset;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class DefaultDrmSession implements DrmSession {
    private static final int MAX_LICENSE_DURATION_TO_RENEW_SECONDS = 60;
    private static final int MSG_KEYS = 1;
    private static final int MSG_PROVISION = 0;
    private static final String TAG = "DefaultDrmSession";
    final MediaDrmCallback callback;
    private CryptoConfig cryptoConfig;
    private ExoMediaDrm.KeyRequest currentKeyRequest;
    private ExoMediaDrm.ProvisionRequest currentProvisionRequest;
    private final CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> eventDispatchers;
    private final boolean isPlaceholderSession;
    private final HashMap<String, String> keyRequestParameters;
    private DrmSession.DrmSessionException lastException;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final ExoMediaDrm mediaDrm;
    private final int mode;
    private byte[] offlineLicenseKeySetId;
    private final boolean playClearSamplesWithoutKeys;
    private final PlayerId playerId;
    private final ProvisioningManager provisioningManager;
    private int referenceCount;
    private final ReferenceCountListener referenceCountListener;
    private RequestHandler requestHandler;
    private HandlerThread requestHandlerThread;
    final ResponseHandler responseHandler;
    public final List<DrmInitData.SchemeData> schemeDatas;
    private byte[] sessionId;
    private int state;
    final UUID uuid;

    public interface ProvisioningManager {
        void onProvisionCompleted();

        void onProvisionError(Exception exc, boolean z);

        void provisionRequired(DefaultDrmSession defaultDrmSession);
    }

    public interface ReferenceCountListener {
        void onReferenceCountDecremented(DefaultDrmSession defaultDrmSession, int i);

        void onReferenceCountIncremented(DefaultDrmSession defaultDrmSession, int i);
    }

    @SuppressLint({"HandlerLeak"})
    private class RequestHandler extends Handler {
        private boolean isReleased;
        final /* synthetic */ DefaultDrmSession this$0;

        public RequestHandler(DefaultDrmSession defaultDrmSession, Looper looper) {
        }

        private boolean maybeRetryRequest(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }

        void post(int i, Object obj, boolean z) {
        }

        public synchronized void release() {
        }
    }

    private static final class RequestTask {
        public final boolean allowRetry;
        public int errorCount;
        public final Object request;
        public final long startTimeMs;
        public final long taskId;

        public RequestTask(long j, boolean z, long j2, Object obj) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class ResponseHandler extends Handler {
        final /* synthetic */ DefaultDrmSession this$0;

        public ResponseHandler(DefaultDrmSession defaultDrmSession, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
        }
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, ProvisioningManager provisioningManager, ReferenceCountListener referenceCountListener, List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, MediaDrmCallback mediaDrmCallback, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy, PlayerId playerId) {
    }

    static /* synthetic */ void access$000(DefaultDrmSession defaultDrmSession, Object obj, Object obj2) {
    }

    static /* synthetic */ void access$100(DefaultDrmSession defaultDrmSession, Object obj, Object obj2) {
    }

    static /* synthetic */ LoadErrorHandlingPolicy access$200(DefaultDrmSession defaultDrmSession) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(Exception exc, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    private void dispatchEvent(Consumer<DrmSessionEventListener.EventDispatcher> consumer) {
    }

    @RequiresNonNull({"sessionId"})
    private void doLicense(boolean z) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(int i, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    private long getLicenseDurationRemainingSec() {
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean isOpen() {
    }

    private static /* synthetic */ void lambda$onError$1(Exception exc, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    private static /* synthetic */ void lambda$openInternal$0(int i, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    private void onError(Exception exc, int i) {
    }

    private void onKeyResponse(Object obj, Object obj2) {
    }

    private void onKeysError(Exception exc, boolean z) {
    }

    private void onKeysRequired() {
    }

    private void onProvisionResponse(Object obj, Object obj2) {
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean openInternal() {
    }

    private void postKeyRequest(byte[] bArr, int i, boolean z) {
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean restoreKeys() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final CryptoConfig getCryptoConfig() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public byte[] getOfflineLicenseKeySetId() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID getSchemeUuid() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
    }

    public boolean hasSessionId(byte[] bArr) {
    }

    public void onMediaDrmEvent(int i) {
    }

    public void onProvisionCompleted() {
    }

    public void onProvisionError(Exception exc, boolean z) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
    }

    public void provision() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map<String, String> queryKeyStatus() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean requiresSecureDecoder(String str) {
    }
}
