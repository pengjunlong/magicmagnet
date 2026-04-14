package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.Allocator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DefaultAllocator implements Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z, int i) {
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized Allocation allocate() {
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public int getIndividualAllocationLength() {
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(Allocation allocation) {
    }

    public synchronized void reset() {
    }

    public synchronized void setTargetBufferSize(int i) {
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void trim() {
    }

    public DefaultAllocator(boolean z, int i, int i2) {
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(Allocator.AllocationNode allocationNode) {
    }
}
