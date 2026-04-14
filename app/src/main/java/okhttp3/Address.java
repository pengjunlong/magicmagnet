package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
    }

    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m886deprecated_certificatePinner() {
    }

    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m887deprecated_connectionSpecs() {
    }

    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m888deprecated_dns() {
    }

    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m889deprecated_hostnameVerifier() {
    }

    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m890deprecated_protocols() {
    }

    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m891deprecated_proxy() {
    }

    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m892deprecated_proxyAuthenticator() {
    }

    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m893deprecated_proxySelector() {
    }

    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m894deprecated_socketFactory() {
    }

    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m895deprecated_sslSocketFactory() {
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m896deprecated_url() {
    }

    public final CertificatePinner certificatePinner() {
    }

    public final List<ConnectionSpec> connectionSpecs() {
    }

    public final Dns dns() {
    }

    public boolean equals(Object obj) {
    }

    public final boolean equalsNonHost$okhttp(Address address) {
    }

    public int hashCode() {
    }

    public final HostnameVerifier hostnameVerifier() {
    }

    public final List<Protocol> protocols() {
    }

    public final Proxy proxy() {
    }

    public final Authenticator proxyAuthenticator() {
    }

    public final ProxySelector proxySelector() {
    }

    public final SocketFactory socketFactory() {
    }

    public final SSLSocketFactory sslSocketFactory() {
    }

    public String toString() {
    }

    public final HttpUrl url() {
    }
}
