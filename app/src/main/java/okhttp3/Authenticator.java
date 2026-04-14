package okhttp3;

import java.io.IOException;
import p000.xc0;

@xc0
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface Authenticator {
    public static final Companion Companion = null;
    public static final Authenticator JAVA_NET_AUTHENTICATOR = null;
    public static final Authenticator NONE = null;

    @xc0
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        @xc0
        private static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public Request authenticate(Route route, Response response) {
            }
        }

        private Companion() {
        }
    }

    Request authenticate(Route route, Response response) throws IOException;
}
