package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.source.MediaSource;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface DrmSessionEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        private static final class ListenerAndHandler {
            public Handler handler;
            public DrmSessionEventListener listener;

            public ListenerAndHandler(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            }
        }

        public EventDispatcher() {
        }

        public static /* synthetic */ void bpdqqiQNVROMLC1ll1l1l11(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, Exception exc) {
        }

        public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
        }

        public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
        }

        public static /* synthetic */ void dpbdpqRKAscW1lll1l(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
        }

        public static /* synthetic */ void dqqppqiKzJi1l1lll1l(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener) {
        }

        private /* synthetic */ void lambda$drmKeysLoaded$1(DrmSessionEventListener drmSessionEventListener) {
        }

        private /* synthetic */ void lambda$drmKeysRemoved$4(DrmSessionEventListener drmSessionEventListener) {
        }

        private /* synthetic */ void lambda$drmKeysRestored$3(DrmSessionEventListener drmSessionEventListener) {
        }

        private /* synthetic */ void lambda$drmSessionAcquired$0(DrmSessionEventListener drmSessionEventListener, int i) {
        }

        private /* synthetic */ void lambda$drmSessionManagerError$2(DrmSessionEventListener drmSessionEventListener, Exception exc) {
        }

        private /* synthetic */ void lambda$drmSessionReleased$5(DrmSessionEventListener drmSessionEventListener) {
        }

        public static /* synthetic */ void ppbdpwWWljzmXXdHNabfWhgjl111l11(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
        }

        public void drmKeysLoaded() {
        }

        public void drmKeysRemoved() {
        }

        public void drmKeysRestored() {
        }

        public void drmSessionAcquired(int i) {
        }

        public void drmSessionManagerError(Exception exc) {
        }

        public void drmSessionReleased() {
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
        }

        public EventDispatcher withParameters(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }
    }

    void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId);

    @Deprecated
    void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2);

    void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc);

    void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId);
}
