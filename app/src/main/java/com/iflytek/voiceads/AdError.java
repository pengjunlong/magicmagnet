package com.iflytek.voiceads;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AdError extends Exception {
    protected static final int TIP_INVALID_AD_UNIT_ID = 5;
    protected static final int TIP_INVALID_APPID = 9;
    protected static final int TIP_INVALID_BROWSER = 12;
    protected static final int TIP_INVALID_REQUEST = 3;
    protected static final int TIP_NETWORK_ERROR = 1;
    protected static final int TIP_NO_FILL = 4;
    protected static final int TIP_OVER_REQUEST_NUM = 8;
    protected static final int TIP_PAGE_LOAD_ERROR = 11;
    protected static final int TIP_PAGE_LOAD_TIMEOUT = 10;
    protected static final int TIP_PERMISSION_ERROR = 6;
    protected static final int TIP_SERVER_ERROR = 2;
    protected static final int TIP_SUCCESS = 0;
    protected static final int TIP_UNKNOWN_ERROR = 7;
    private static final long serialVersionUID = 1;
    private String mDescription;
    private int mErrorCode;

    public AdError(int i) {
    }

    public static int convertErrorCode(int i) {
    }

    public int getErrorCode() {
    }

    public String getErrorDescription() {
    }
}
