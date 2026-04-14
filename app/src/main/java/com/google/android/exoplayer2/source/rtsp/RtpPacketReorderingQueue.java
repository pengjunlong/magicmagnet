package com.google.android.exoplayer2.source.rtsp;

import java.util.TreeSet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class RtpPacketReorderingQueue {
    static final int MAX_SEQUENCE_LEAP_ALLOWED = 1000;
    private static final int QUEUE_SIZE_THRESHOLD_FOR_RESET = 5000;
    private int lastDequeuedSequenceNumber;
    private int lastReceivedSequenceNumber;
    private final TreeSet<RtpPacketContainer> packetQueue;
    private boolean started;

    private static final class RtpPacketContainer {
        public final RtpPacket packet;
        public final long receivedTimestampMs;

        public RtpPacketContainer(RtpPacket rtpPacket, long j) {
        }
    }

    private synchronized void addToQueue(RtpPacketContainer rtpPacketContainer) {
    }

    private static int calculateSequenceNumberShift(int i, int i2) {
    }

    public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(RtpPacketContainer rtpPacketContainer, RtpPacketContainer rtpPacketContainer2) {
    }

    private static /* synthetic */ int lambda$new$0(RtpPacketContainer rtpPacketContainer, RtpPacketContainer rtpPacketContainer2) {
    }

    public synchronized boolean offer(RtpPacket rtpPacket, long j) {
    }

    public synchronized RtpPacket poll(long j) {
    }

    public synchronized void reset() {
    }
}
