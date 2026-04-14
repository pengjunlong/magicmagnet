package org.conscrypt;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = null;

    /* renamed from: org.conscrypt.BufferAllocator$1 */
    class C18421 extends BufferAllocator {
        C18421() {
        }

        @Override // org.conscrypt.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int i) {
        }
    }

    public static BufferAllocator unpooled() {
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int i);
}
