package org.conscrypt;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class PeerInfoProvider {
    private static final PeerInfoProvider NULL_PEER_INFO_PROVIDER = null;

    /* renamed from: org.conscrypt.PeerInfoProvider$1 */
    class C18671 extends PeerInfoProvider {
        C18671() {
        }

        @Override // org.conscrypt.PeerInfoProvider
        String getHostname() {
        }

        @Override // org.conscrypt.PeerInfoProvider
        public String getHostnameOrIP() {
        }

        @Override // org.conscrypt.PeerInfoProvider
        public int getPort() {
        }
    }

    /* renamed from: org.conscrypt.PeerInfoProvider$2 */
    class C18682 extends PeerInfoProvider {
        final /* synthetic */ String val$host;
        final /* synthetic */ int val$port;

        C18682(String str, int i) {
        }

        @Override // org.conscrypt.PeerInfoProvider
        String getHostname() {
        }

        @Override // org.conscrypt.PeerInfoProvider
        public String getHostnameOrIP() {
        }

        @Override // org.conscrypt.PeerInfoProvider
        public int getPort() {
        }
    }

    PeerInfoProvider() {
    }

    static PeerInfoProvider forHostAndPort(String str, int i) {
    }

    static PeerInfoProvider nullProvider() {
    }

    abstract String getHostname();

    abstract String getHostnameOrIP();

    abstract int getPort();
}
