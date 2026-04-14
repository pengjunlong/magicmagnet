package org.conscrypt;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class AbstractSessionContext implements SSLSessionContext {
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 28800;
    private volatile int maximumSize;
    private final Map<ByteArray, NativeSslSession> sessions;
    final long sslCtxNativePointer;
    private volatile int timeout;

    /* renamed from: org.conscrypt.AbstractSessionContext$1 */
    class C18391 extends LinkedHashMap<ByteArray, NativeSslSession> {
        final /* synthetic */ AbstractSessionContext this$0;

        C18391(AbstractSessionContext abstractSessionContext) {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<ByteArray, NativeSslSession> entry) {
        }
    }

    /* renamed from: org.conscrypt.AbstractSessionContext$2 */
    class C18402 implements Enumeration<byte[]> {
        private NativeSslSession next;
        final /* synthetic */ AbstractSessionContext this$0;
        final /* synthetic */ Iterator val$iter;

        C18402(AbstractSessionContext abstractSessionContext, Iterator it) {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
        }

        @Override // java.util.Enumeration
        public /* bridge */ /* synthetic */ byte[] nextElement() {
        }

        @Override // java.util.Enumeration
        /* renamed from: nextElement, reason: avoid collision after fix types in other method */
        public byte[] nextElement2() {
        }
    }

    AbstractSessionContext(int i) {
    }

    static /* synthetic */ int access$000(AbstractSessionContext abstractSessionContext) {
    }

    private void trimToSize() {
    }

    final void cacheSession(NativeSslSession nativeSslSession) {
    }

    protected void finalize() throws Throwable {
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final Enumeration<byte[]> getIds() {
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final SSLSession getSession(byte[] bArr) {
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionCacheSize() {
    }

    final NativeSslSession getSessionFromCache(byte[] bArr) {
    }

    abstract NativeSslSession getSessionFromPersistentCache(byte[] bArr);

    @Override // javax.net.ssl.SSLSessionContext
    public final int getSessionTimeout() {
    }

    abstract void onBeforeAddSession(NativeSslSession nativeSslSession);

    abstract void onBeforeRemoveSession(NativeSslSession nativeSslSession);

    final void removeSession(NativeSslSession nativeSslSession) {
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionCacheSize(int i) throws IllegalArgumentException {
    }

    @Override // javax.net.ssl.SSLSessionContext
    public final void setSessionTimeout(int i) throws IllegalArgumentException {
    }
}
