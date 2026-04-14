package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class SampleDataQueue {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final Allocator allocator;
    private AllocationNode firstAllocationNode;
    private AllocationNode readAllocationNode;
    private final ParsableByteArray scratch;
    private long totalBytesWritten;
    private AllocationNode writeAllocationNode;

    private static final class AllocationNode implements Allocator.AllocationNode {
        public Allocation allocation;
        public long endPosition;
        public AllocationNode next;
        public long startPosition;

        public AllocationNode(long j, int i) {
        }

        public AllocationNode clear() {
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public Allocation getAllocation() {
        }

        public void initialize(Allocation allocation, AllocationNode allocationNode) {
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public Allocator.AllocationNode next() {
        }

        public void reset(long j, int i) {
        }

        public int translateOffset(long j) {
        }
    }

    public SampleDataQueue(Allocator allocator) {
    }

    private void clearAllocationNodes(AllocationNode allocationNode) {
    }

    private static AllocationNode getNodeContainingPosition(AllocationNode allocationNode, long j) {
    }

    private void postAppend(int i) {
    }

    private int preAppend(int i) {
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j, ByteBuffer byteBuffer, int i) {
    }

    private static AllocationNode readEncryptionData(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
    }

    private static AllocationNode readSampleData(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
    }

    public void discardDownstreamTo(long j) {
    }

    public void discardUpstreamSampleBytes(long j) {
    }

    public long getTotalBytesWritten() {
    }

    public void peekToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
    }

    public void readToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
    }

    public void reset() {
    }

    public void rewind() {
    }

    public int sampleData(DataReader dataReader, int i, boolean z) throws IOException {
    }

    private static AllocationNode readData(AllocationNode allocationNode, long j, byte[] bArr, int i) {
    }

    public void sampleData(ParsableByteArray parsableByteArray, int i) {
    }
}
