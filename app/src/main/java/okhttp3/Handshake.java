package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;
import p000.xc0;
import p000.y40;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Handshake {
    public static final Companion Companion = null;
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final y40 peerCertificates$delegate;
    private final TlsVersion tlsVersion;

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, qh<? extends List<? extends Certificate>> qhVar) {
    }

    public static final Handshake get(SSLSession sSLSession) throws IOException {
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
    }

    private final String getName(Certificate certificate) {
    }

    /* renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m927deprecated_cipherSuite() {
    }

    /* renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m928deprecated_localCertificates() {
    }

    /* renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m929deprecated_localPrincipal() {
    }

    /* renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m930deprecated_peerCertificates() {
    }

    /* renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m931deprecated_peerPrincipal() {
    }

    /* renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m932deprecated_tlsVersion() {
    }

    public final CipherSuite cipherSuite() {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    public final List<Certificate> localCertificates() {
    }

    public final Principal localPrincipal() {
    }

    public final List<Certificate> peerCertificates() {
    }

    public final Principal peerPrincipal() {
    }

    public final TlsVersion tlsVersion() {
    }

    public String toString() {
    }

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m933deprecated_get(SSLSession sSLSession) throws IOException {
        }

        public final Handshake get(SSLSession sSLSession) throws IOException {
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        }
    }
}
