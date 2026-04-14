package org.conscrypt;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class Java8EngineSocket extends ConscryptEngineSocket {
    private BiFunction<SSLSocket, List<String>, String> selector;

    /* renamed from: org.conscrypt.Java8EngineSocket$1 */
    class C18521 extends ApplicationProtocolSelector {
        final /* synthetic */ BiFunction val$selector;

        C18521(BiFunction biFunction) {
        }

        @Override // org.conscrypt.ApplicationProtocolSelector
        public String selectApplicationProtocol(SSLEngine sSLEngine, List<String> list) {
        }

        @Override // org.conscrypt.ApplicationProtocolSelector
        public String selectApplicationProtocol(SSLSocket sSLSocket, List<String> list) {
        }
    }

    Java8EngineSocket(SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    private static ApplicationProtocolSelector toApplicationProtocolSelector(BiFunction<SSLSocket, List<String>, String> biFunction) {
    }

    @Override // javax.net.ssl.SSLSocket
    public BiFunction<SSLSocket, List<String>, String> getHandshakeApplicationProtocolSelector() {
    }

    @Override // javax.net.ssl.SSLSocket
    public void setHandshakeApplicationProtocolSelector(BiFunction<SSLSocket, List<String>, String> biFunction) {
    }

    Java8EngineSocket(String str, int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    Java8EngineSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    Java8EngineSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    Java8EngineSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) throws IOException {
    }

    Java8EngineSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) throws IOException {
    }
}
