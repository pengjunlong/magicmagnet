package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.URLWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
    }

    static InputStream openStream(URLWrapper uRLWrapper, TransportManager transportManager, Timer timer) throws IOException {
    }

    static Object getContent(URLWrapper uRLWrapper, TransportManager transportManager, Timer timer) throws IOException {
    }

    static Object getContent(URLWrapper uRLWrapper, Class[] clsArr, TransportManager transportManager, Timer timer) throws IOException {
    }
}
