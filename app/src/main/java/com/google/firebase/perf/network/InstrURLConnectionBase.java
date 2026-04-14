package com.google.firebase.perf.network;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class InstrURLConnectionBase {
    private static final String USER_AGENT_PROPERTY = "User-Agent";
    private static final AndroidLogger logger = null;
    private final HttpURLConnection httpUrlConnection;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private long timeRequestedInMicros;
    private long timeToResponseInitiatedInMicros;
    private final Timer timer;

    public InstrURLConnectionBase(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
    }

    private void updateRequestInfo() {
    }

    public void addRequestProperty(String str, String str2) {
    }

    public void connect() throws IOException {
    }

    public void disconnect() {
    }

    public boolean equals(Object obj) {
    }

    public boolean getAllowUserInteraction() {
    }

    public int getConnectTimeout() {
    }

    public Object getContent() throws IOException {
    }

    public String getContentEncoding() {
    }

    public int getContentLength() {
    }

    public long getContentLengthLong() {
    }

    public String getContentType() {
    }

    public long getDate() {
    }

    public boolean getDefaultUseCaches() {
    }

    public boolean getDoInput() {
    }

    public boolean getDoOutput() {
    }

    public InputStream getErrorStream() {
    }

    public long getExpiration() {
    }

    public String getHeaderField(int i) {
    }

    public long getHeaderFieldDate(String str, long j) {
    }

    public int getHeaderFieldInt(String str, int i) {
    }

    public String getHeaderFieldKey(int i) {
    }

    public long getHeaderFieldLong(String str, long j) {
    }

    public Map<String, List<String>> getHeaderFields() {
    }

    public long getIfModifiedSince() {
    }

    public InputStream getInputStream() throws IOException {
    }

    public boolean getInstanceFollowRedirects() {
    }

    public long getLastModified() {
    }

    public OutputStream getOutputStream() throws IOException {
    }

    public Permission getPermission() throws IOException {
    }

    public int getReadTimeout() {
    }

    public String getRequestMethod() {
    }

    public Map<String, List<String>> getRequestProperties() {
    }

    public String getRequestProperty(String str) {
    }

    public int getResponseCode() throws IOException {
    }

    public String getResponseMessage() throws IOException {
    }

    public URL getURL() {
    }

    public boolean getUseCaches() {
    }

    public int hashCode() {
    }

    public void setAllowUserInteraction(boolean z) {
    }

    public void setChunkedStreamingMode(int i) {
    }

    public void setConnectTimeout(int i) {
    }

    public void setDefaultUseCaches(boolean z) {
    }

    public void setDoInput(boolean z) {
    }

    public void setDoOutput(boolean z) {
    }

    public void setFixedLengthStreamingMode(int i) {
    }

    public void setIfModifiedSince(long j) {
    }

    public void setInstanceFollowRedirects(boolean z) {
    }

    public void setReadTimeout(int i) {
    }

    public void setRequestMethod(String str) throws ProtocolException {
    }

    public void setRequestProperty(String str, String str2) {
    }

    public void setUseCaches(boolean z) {
    }

    public String toString() {
    }

    public boolean usingProxy() {
    }

    public void setFixedLengthStreamingMode(long j) {
    }

    public String getHeaderField(String str) {
    }

    public Object getContent(Class[] clsArr) throws IOException {
    }
}
