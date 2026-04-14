package org.conscrypt;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class NativeRef {
    final long address;

    static final class EC_GROUP extends NativeRef {
        EC_GROUP(long j) {
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j) {
        }
    }

    static final class EC_POINT extends NativeRef {
        EC_POINT(long j) {
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j) {
        }
    }

    static final class EVP_CIPHER_CTX extends NativeRef {
        EVP_CIPHER_CTX(long j) {
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j) {
        }
    }

    static final class EVP_MD_CTX extends NativeRef {
        EVP_MD_CTX(long j) {
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j) {
        }
    }

    static final class EVP_PKEY extends NativeRef {
        EVP_PKEY(long j) {
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j) {
        }
    }

    static final class EVP_PKEY_CTX extends NativeRef {
        EVP_PKEY_CTX(long j) {
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j) {
        }
    }

    static final class HMAC_CTX extends NativeRef {
        HMAC_CTX(long j) {
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j) {
        }
    }

    static final class SSL_SESSION extends NativeRef {
        SSL_SESSION(long j) {
        }

        @Override // org.conscrypt.NativeRef
        void doFree(long j) {
        }
    }

    NativeRef(long j) {
    }

    abstract void doFree(long j);

    public boolean equals(Object obj) {
    }

    protected void finalize() throws Throwable {
    }

    public int hashCode() {
    }
}
