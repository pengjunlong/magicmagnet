package okhttp3;

import java.util.List;
import kotlin.Metadata;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface CookieJar {
    public static final Companion Companion = null;
    public static final CookieJar NO_COOKIES = null;

    @xc0
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        @Metadata
        private static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public List<Cookie> loadForRequest(HttpUrl httpUrl) {
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
            }
        }

        private Companion() {
        }
    }

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
