package org.cybergarage.http;

import java.io.InputStream;
import java.net.Socket;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class HTTPRequest extends HTTPPacket {
    private HTTPSocket httpSocket;
    private String method;
    private Socket postSocket;
    private String requestHost;
    private int requestPort;
    private String uri;

    public HTTPRequest() {
    }

    public String getFirstLineString() {
    }

    public String getHTTPVersion() {
    }

    public String getHeader() {
    }

    public String getLocalAddress() {
    }

    public int getLocalPort() {
    }

    public String getMethod() {
    }

    public ParameterList getParameterList() {
    }

    public String getParameterValue(String str) {
    }

    public String getRequestHost() {
    }

    public int getRequestPort() {
    }

    public HTTPSocket getSocket() {
    }

    public String getURI() {
    }

    public boolean isGetRequest() {
    }

    public boolean isHeadRequest() {
    }

    public boolean isKeepAlive() {
    }

    public boolean isMethod(String str) {
    }

    public boolean isNotifyRequest() {
    }

    public boolean isPostRequest() {
    }

    public boolean isSOAPAction() {
    }

    public boolean isSubscribeRequest() {
    }

    public boolean isUnsubscribeRequest() {
    }

    public boolean parseRequestLine(String str) {
    }

    public boolean post(HTTPResponse hTTPResponse) {
    }

    public void print() {
    }

    public boolean read() {
    }

    public boolean returnBadRequest() {
    }

    public boolean returnOK() {
    }

    public boolean returnResponse(int i) {
    }

    public void set(HTTPRequest hTTPRequest) {
    }

    public void setMethod(String str) {
    }

    public void setRequestHost(String str) {
    }

    public void setRequestPort(int i) {
    }

    public void setSocket(HTTPSocket hTTPSocket) {
    }

    public void setURI(String str, boolean z) {
    }

    public String toString() {
    }

    public void setURI(String str) {
    }

    public HTTPRequest(InputStream inputStream) {
    }

    public HTTPResponse post(String str, int i, boolean z) {
    }

    public HTTPRequest(HTTPSocket hTTPSocket) {
    }

    public HTTPResponse post(String str, int i) {
    }
}
