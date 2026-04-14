package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DefaultDrmSessionManager implements DrmSessionManager {
    public static final long DEFAULT_SESSION_KEEPALIVE_MS = 300000;
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final String TAG = "DefaultDrmSessionMgr";
    private final MediaDrmCallback callback;
    private ExoMediaDrm exoMediaDrm;
    private final ExoMediaDrm.Provider exoMediaDrmProvider;
    private final Set<DefaultDrmSession> keepaliveSessions;
    private final HashMap<String, String> keyRequestParameters;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    volatile MediaDrmHandler mediaDrmHandler;
    private int mode;
    private final boolean multiSession;
    private DefaultDrmSession noMultiSessionDrmSession;
    private byte[] offlineLicenseKeySetId;
    private DefaultDrmSession placeholderDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private Handler playbackHandler;
    private Looper playbackLooper;
    private PlayerId playerId;
    private final Set<PreacquiredSessionReference> preacquiredSessionReferences;
    private int prepareCallsCount;
    private final ProvisioningManagerImpl provisioningManagerImpl;
    private final ReferenceCountListenerImpl referenceCountListener;
    private final long sessionKeepaliveMs;
    private final List<DefaultDrmSession> sessions;
    private final int[] useDrmSessionsForClearContentTrackTypes;
    private final UUID uuid;

    public static final class Builder {
        private ExoMediaDrm.Provider exoMediaDrmProvider;
        private final HashMap<String, String> keyRequestParameters;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private boolean multiSession;
        private boolean playClearSamplesWithoutKeys;
        private long sessionKeepaliveMs;
        private int[] useDrmSessionsForClearContentTrackTypes;
        private UUID uuid;

        public DefaultDrmSessionManager build(MediaDrmCallback mediaDrmCallback) {
        }

        @CanIgnoreReturnValue
        public Builder setKeyRequestParameters(Map<String, String> map) {
        }

        @CanIgnoreReturnValue
        public Builder setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        @CanIgnoreReturnValue
        public Builder setMultiSession(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setPlayClearSamplesWithoutKeys(boolean z) {
        }

        @CanIgnoreReturnValue
        public Builder setSessionKeepaliveMs(long j) {
        }

        @CanIgnoreReturnValue
        public Builder setUseDrmSessionsForClearContent(int... iArr) {
        }

        @CanIgnoreReturnValue
        public Builder setUuidAndExoMediaDrmProvider(UUID uuid, ExoMediaDrm.Provider provider) {
        }
    }

    private class MediaDrmEventListener implements ExoMediaDrm.OnEventListener {
        final /* synthetic */ DefaultDrmSessionManager this$0;

        private MediaDrmEventListener(DefaultDrmSessionManager defaultDrmSessionManager) {
        }

        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener
        public void onEvent(ExoMediaDrm exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        }

        /* synthetic */ MediaDrmEventListener(DefaultDrmSessionManager defaultDrmSessionManager, C00971 c00971) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class MediaDrmHandler extends Handler {
        final /* synthetic */ DefaultDrmSessionManager this$0;

        public MediaDrmHandler(DefaultDrmSessionManager defaultDrmSessionManager, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public static final class MissingSchemeDataException extends Exception {
        /* synthetic */ MissingSchemeDataException(UUID uuid, C00971 c00971) {
        }

        private MissingSchemeDataException(UUID uuid) {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* JADX INFO: Access modifiers changed from: private */
    class PreacquiredSessionReference implements DrmSessionManager.DrmSessionReference {
        private final DrmSessionEventListener.EventDispatcher eventDispatcher;
        private boolean isReleased;
        private DrmSession session;
        final /* synthetic */ DefaultDrmSessionManager this$0;

        public PreacquiredSessionReference(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(PreacquiredSessionReference preacquiredSessionReference) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(PreacquiredSessionReference preacquiredSessionReference, Format format) {
        }

        private /* synthetic */ void lambda$acquire$0(Format format) {
        }

        private /* synthetic */ void lambda$release$1() {
        }

        public void acquire(Format format) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
        public void release() {
        }
    }

    private class ProvisioningManagerImpl implements DefaultDrmSession.ProvisioningManager {
        private DefaultDrmSession provisioningSession;
        private final Set<DefaultDrmSession> sessionsAwaitingProvisioning;

        public ProvisioningManagerImpl(DefaultDrmSessionManager defaultDrmSessionManager) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionCompleted() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionError(Exception exc, boolean z) {
        }

        public void onSessionFullyReleased(DefaultDrmSession defaultDrmSession) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void provisionRequired(DefaultDrmSession defaultDrmSession) {
        }
    }

    private class ReferenceCountListenerImpl implements DefaultDrmSession.ReferenceCountListener {
        final /* synthetic */ DefaultDrmSessionManager this$0;

        private ReferenceCountListenerImpl(DefaultDrmSessionManager defaultDrmSessionManager) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(DefaultDrmSession defaultDrmSession) {
        }

        private static /* synthetic */ void lambda$onReferenceCountDecremented$0(DefaultDrmSession defaultDrmSession) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountDecremented(DefaultDrmSession defaultDrmSession, int i) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountIncremented(DefaultDrmSession defaultDrmSession, int i) {
        }

        /* synthetic */ ReferenceCountListenerImpl(DefaultDrmSessionManager defaultDrmSessionManager, C00971 c00971) {
        }
    }

    /* synthetic */ DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.Provider provider, MediaDrmCallback mediaDrmCallback, HashMap hashMap, boolean z, int[] iArr, boolean z2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j, C00971 c00971) {
    }

    static /* synthetic */ DefaultDrmSession access$1000(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ DefaultDrmSession access$1002(DefaultDrmSessionManager defaultDrmSessionManager, DefaultDrmSession defaultDrmSession) {
    }

    static /* synthetic */ ProvisioningManagerImpl access$1100(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ void access$1200(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ Set access$1300(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ Looper access$1400(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ DrmSession access$1500(DefaultDrmSessionManager defaultDrmSessionManager, Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean z) {
    }

    static /* synthetic */ List access$400(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ long access$500(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ Set access$600(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ Handler access$700(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ int access$800(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ DefaultDrmSession access$900(DefaultDrmSessionManager defaultDrmSessionManager) {
    }

    static /* synthetic */ DefaultDrmSession access$902(DefaultDrmSessionManager defaultDrmSessionManager, DefaultDrmSession defaultDrmSession) {
    }

    private static boolean acquisitionFailedIndicatingResourceShortage(DrmSession drmSession) {
    }

    private boolean canAcquireSession(DrmInitData drmInitData) {
    }

    private DefaultDrmSession createAndAcquireSession(List<DrmInitData.SchemeData> list, boolean z, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    private DefaultDrmSession createAndAcquireSessionWithRetry(List<DrmInitData.SchemeData> list, boolean z, DrmSessionEventListener.EventDispatcher eventDispatcher, boolean z2) {
    }

    private static List<DrmInitData.SchemeData> getSchemeDatas(DrmInitData drmInitData, UUID uuid, boolean z) {
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void initPlaybackLooper(Looper looper) {
    }

    private DrmSession maybeAcquirePlaceholderSession(int i, boolean z) {
    }

    private void maybeCreateMediaDrmHandler(Looper looper) {
    }

    private void maybeReleaseMediaDrm() {
    }

    private void releaseAllKeepaliveSessions() {
    }

    private void releaseAllPreacquiredSessions() {
    }

    private void undoAcquisition(DrmSession drmSession, DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public DrmSession acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public int getCryptoType(Format format) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public DrmSessionManager.DrmSessionReference preacquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void prepare() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void release() {
    }

    public void setMode(int i, byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public void setPlayer(Looper looper, PlayerId playerId) {
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap) {
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, boolean z) {
    }

    private DrmSession acquireSession(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean z) {
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, boolean z, int i) {
    }

    private DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.Provider provider, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j) {
    }
}
