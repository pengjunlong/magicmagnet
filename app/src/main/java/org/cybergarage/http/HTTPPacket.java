package org.cybergarage.http;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Vector;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class HTTPPacket {
    private byte[] content;
    private InputStream contentInput;
    private String firstLine;
    private Vector httpHeaderList;
    private String version;

    public HTTPPacket() {
    }

    private String readLine(BufferedInputStream bufferedInputStream) {
    }

    private void setFirstLine(String str) {
    }

    public void addHeader(HTTPHeader hTTPHeader) {
    }

    public void clearHeaders() {
    }

    public String getCacheControl() {
    }

    public String getCharSet() {
    }

    public String getConnection() {
    }

    public byte[] getContent() {
    }

    public InputStream getContentInputStream() {
    }

    public String getContentLanguage() {
    }

    public long getContentLength() {
    }

    public long[] getContentRange() {
    }

    public long getContentRangeFirstPosition() {
    }

    public long getContentRangeInstanceLength() {
    }

    public long getContentRangeLastPosition() {
    }

    public String getContentString() {
    }

    public String getContentType() {
    }

    public String getDate() {
    }

    protected String getFirstLine() {
    }

    protected String getFirstLineToken(int i) {
    }

    public HTTPHeader getHeader(int i) {
    }

    public String getHeaderString() {
    }

    public String getHeaderValue(String str) {
    }

    public String getHost() {
    }

    public int getIntegerHeaderValue(String str) {
    }

    public long getLongHeaderValue(String str) {
    }

    public int getNHeaders() {
    }

    public String getServer() {
    }

    public String getStringHeaderValue(String str, String str2, String str3) {
    }

    public String getTransferEncoding() {
    }

    public String getVersion() {
    }

    public boolean hasConnection() {
    }

    public boolean hasContent() {
    }

    public boolean hasContentInputStream() {
    }

    public boolean hasContentRange() {
    }

    public boolean hasFirstLine() {
    }

    public boolean hasHeader(String str) {
    }

    public boolean hasTransferEncoding() {
    }

    public void init() {
    }

    public boolean isChunked() {
    }

    public boolean isCloseConnection() {
    }

    public boolean isKeepAliveConnection() {
    }

    public boolean read(HTTPSocket hTTPSocket) {
    }

    protected boolean set(InputStream inputStream, boolean z) {
    }

    public void setCacheControl(String str) {
    }

    public void setConnection(String str) {
    }

    public void setContent(byte[] bArr, boolean z) {
    }

    public void setContentInputStream(InputStream inputStream) {
    }

    public void setContentLanguage(String str) {
    }

    public void setContentLength(long j) {
    }

    public void setContentRange(long j, long j2, long j3) {
    }

    public void setContentType(String str) {
    }

    public void setDate(Calendar calendar) {
    }

    public void setHeader(String str, String str2) {
    }

    public void setHost(String str, int i) {
    }

    public void setIntegerHeader(String str, int i) {
    }

    public void setLongHeader(String str, long j) {
    }

    public void setServer(String str) {
    }

    public void setStringHeader(String str, String str2, String str3, String str4) {
    }

    public void setTransferEncoding(String str) {
    }

    public void setVersion(String str) {
    }

    public void addHeader(String str, String str2) {
    }

    public HTTPHeader getHeader(String str) {
    }

    public void setCacheControl(String str, int i) {
    }

    public void setContent(byte[] bArr) {
    }

    public void setCacheControl(int i) {
    }

    public void setContent(String str, boolean z) {
    }

    public void setHeader(String str, int i) {
    }

    public void setHost(String str) {
    }

    public void setContent(String str) {
    }

    public void setHeader(String str, long j) {
    }

    public String getStringHeaderValue(String str) {
    }

    public void setHeader(HTTPHeader hTTPHeader) {
    }

    public void setStringHeader(String str, String str2) {
    }

    public HTTPPacket(HTTPPacket hTTPPacket) {
    }

    public HTTPPacket(InputStream inputStream) {
    }

    protected boolean set(InputStream inputStream) {
    }

    protected boolean set(HTTPSocket hTTPSocket) {
    }

    protected void set(HTTPPacket hTTPPacket) {
    }
}
