package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface DrmSessionManager {
    public static final DrmSessionManager DRM_UNSUPPORTED = null;

    @Deprecated
    public static final DrmSessionManager DUMMY = null;

    /* renamed from: com.google.android.exoplayer2.drm.DrmSessionManager$1 */
    class C01001 implements DrmSessionManager {
        C01001() {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public DrmSession acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public int getCryptoType(Format format) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ DrmSessionReference preacquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ void prepare() {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ void release() {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public void setPlayer(Looper looper, PlayerId playerId) {
        }
    }

    public interface DrmSessionReference {
        public static final DrmSessionReference EMPTY = null;

        void release();
    }

    DrmSession acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    int getCryptoType(Format format);

    DrmSessionReference preacquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    void prepare();

    void release();

    void setPlayer(Looper looper, PlayerId playerId);
}
