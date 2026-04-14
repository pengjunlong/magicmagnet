package okhttp3.internal.http;

import java.io.EOFException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Challenge;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class HttpHeaders {
    private static final qqbddbbsOSPMeeOGlgesDt1l1l1 QUOTED_STRING_DELIMITERS = null;
    private static final qqbddbbsOSPMeeOGlgesDt1l1l1 TOKEN_DELIMITERS = null;

    public static final boolean hasBody(Response response) {
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
    }

    public static final boolean promisesBody(Response response) {
    }

    private static final void readChallengeHeader(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, List<Challenge> list) throws EOFException {
    }

    private static final String readQuotedString(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l) throws EOFException {
    }

    private static final String readToken(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l) {
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
    }

    private static final boolean skipCommasAndWhitespace(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l) {
    }

    private static final boolean startsWith(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, byte b) {
    }
}
