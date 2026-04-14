package org.cybergarage.http;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class HTTPStatus {
    public static final int BAD_REQUEST = 400;
    public static final int CONTINUE = 100;
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int INVALID_RANGE = 416;
    public static final int NOT_FOUND = 404;
    public static final int OK = 200;
    public static final int PARTIAL_CONTENT = 206;
    public static final int PRECONDITION_FAILED = 412;
    private String reasonPhrase;
    private int statusCode;
    private String version;

    public HTTPStatus() {
    }

    public static final String code2String(int i) {
    }

    public static final boolean isSuccessful(int i) {
    }

    public String getReasonPhrase() {
    }

    public int getStatusCode() {
    }

    public String getVersion() {
    }

    public boolean isSuccessful() {
    }

    public void set(String str) {
    }

    public void setReasonPhrase(String str) {
    }

    public void setStatusCode(int i) {
    }

    public void setVersion(String str) {
    }

    public HTTPStatus(String str, int i, String str2) {
    }

    public HTTPStatus(String str) {
    }
}
