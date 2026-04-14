package com.google.firebase.perf.network;

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
public final class InstrHttpURLConnection extends HttpURLConnection {
    private final InstrURLConnectionBase delegate;

    InstrHttpURLConnection(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
    }

    public boolean equals(Object obj) {
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
    }

    @Override // java.net.URLConnection
    public String getContentType() {
    }

    @Override // java.net.URLConnection
    public long getDate() {
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
    }

    @Override // java.net.URLConnection
    public URL getURL() {
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
    }

    public int hashCode() {
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
    }

    @Override // java.net.URLConnection
    public String toString() {
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
    }
}
