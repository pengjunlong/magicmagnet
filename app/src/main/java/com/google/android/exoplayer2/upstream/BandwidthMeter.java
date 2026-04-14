package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<HandlerAndListener> listeners;

            /* JADX INFO: Access modifiers changed from: private */
            static final class HandlerAndListener {
                private final Handler handler;
                private final EventListener listener;
                private boolean released;

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                }

                static /* synthetic */ EventListener access$000(HandlerAndListener handlerAndListener) {
                }

                static /* synthetic */ boolean access$100(HandlerAndListener handlerAndListener) {
                }

                static /* synthetic */ Handler access$200(HandlerAndListener handlerAndListener) {
                }

                public void release() {
                }
            }

            public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(HandlerAndListener handlerAndListener, int i, long j, long j2) {
            }

            private static /* synthetic */ void lambda$bandwidthSample$0(HandlerAndListener handlerAndListener, int i, long j, long j2) {
            }

            public void addListener(Handler handler, EventListener eventListener) {
            }

            public void bandwidthSample(int i, long j, long j2) {
            }

            public void removeListener(EventListener eventListener) {
            }
        }

        void onBandwidthSample(int i, long j, long j2);
    }

    void addEventListener(Handler handler, EventListener eventListener);

    long getBitrateEstimate();

    long getTimeToFirstByteEstimateUs();

    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);
}
