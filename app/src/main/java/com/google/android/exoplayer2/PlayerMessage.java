package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.Clock;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeoutException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class PlayerMessage {
    private final Clock clock;
    private boolean deleteAfterDelivery;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Looper looper;
    private int mediaItemIndex;
    private Object payload;
    private long positionMs;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;

    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i, Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i, Clock clock, Looper looper) {
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
    }

    @CanIgnoreReturnValue
    public synchronized PlayerMessage cancel() {
    }

    public boolean getDeleteAfterDelivery() {
    }

    public Looper getLooper() {
    }

    public int getMediaItemIndex() {
    }

    public Object getPayload() {
    }

    public long getPositionMs() {
    }

    public Target getTarget() {
    }

    public Timeline getTimeline() {
    }

    public int getType() {
    }

    public synchronized boolean isCanceled() {
    }

    public synchronized void markAsProcessed(boolean z) {
    }

    @CanIgnoreReturnValue
    public PlayerMessage send() {
    }

    @CanIgnoreReturnValue
    public PlayerMessage setDeleteAfterDelivery(boolean z) {
    }

    @CanIgnoreReturnValue
    @Deprecated
    public PlayerMessage setHandler(Handler handler) {
    }

    @CanIgnoreReturnValue
    public PlayerMessage setLooper(Looper looper) {
    }

    @CanIgnoreReturnValue
    public PlayerMessage setPayload(Object obj) {
    }

    @CanIgnoreReturnValue
    public PlayerMessage setPosition(long j) {
    }

    @CanIgnoreReturnValue
    public PlayerMessage setType(int i) {
    }

    @CanIgnoreReturnValue
    public PlayerMessage setPosition(int i, long j) {
    }

    public synchronized boolean blockUntilDelivered(long j) throws InterruptedException, TimeoutException {
    }
}
