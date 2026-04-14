package org.conscrypt;

import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class AllocatedBuffer {

    /* renamed from: org.conscrypt.AllocatedBuffer$1 */
    class C18411 extends AllocatedBuffer {
        final /* synthetic */ ByteBuffer val$buffer;

        C18411(ByteBuffer byteBuffer) {
        }

        @Override // org.conscrypt.AllocatedBuffer
        public ByteBuffer nioBuffer() {
        }

        @Override // org.conscrypt.AllocatedBuffer
        public AllocatedBuffer release() {
        }
    }

    public static AllocatedBuffer wrap(ByteBuffer byteBuffer) {
    }

    public abstract ByteBuffer nioBuffer();

    public abstract AllocatedBuffer release();

    @Deprecated
    public AllocatedBuffer retain() {
    }
}
