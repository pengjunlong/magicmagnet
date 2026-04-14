package com.google.protobuf;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = null;

    /* renamed from: com.google.protobuf.BufferAllocator$1 */
    static class C12811 extends BufferAllocator {
        C12811() {
        }

        @Override // com.google.protobuf.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int i) {
        }

        @Override // com.google.protobuf.BufferAllocator
        public AllocatedBuffer allocateHeapBuffer(int i) {
        }
    }

    BufferAllocator() {
    }

    public static BufferAllocator unpooled() {
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int i);

    public abstract AllocatedBuffer allocateHeapBuffer(int i);
}
