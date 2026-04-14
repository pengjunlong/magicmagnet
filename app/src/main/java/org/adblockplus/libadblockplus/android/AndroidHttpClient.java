package org.adblockplus.libadblockplus.android;

import java.net.HttpURLConnection;
import java.util.List;
import org.adblockplus.libadblockplus.HeaderEntry;
import org.adblockplus.libadblockplus.HttpClient;
import org.adblockplus.libadblockplus.HttpRequest;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AndroidHttpClient extends HttpClient {
    protected static final String ENCODING_GZIP = "gzip";
    protected static final String ENCODING_IDENTITY = "identity";
    protected static final int SOCKET_TAG = 1;
    private final boolean compressedStream;

    public AndroidHttpClient(boolean z) {
    }

    private void setGetRequestHeaders(List<HeaderEntry> list, HttpURLConnection httpURLConnection) {
    }

    @Override // org.adblockplus.libadblockplus.HttpClient
    public void request(HttpRequest httpRequest, HttpClient.Callback callback) {
    }

    public AndroidHttpClient() {
    }
}
