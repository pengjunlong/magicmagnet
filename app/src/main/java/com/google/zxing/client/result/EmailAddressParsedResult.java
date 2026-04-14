package com.google.zxing.client.result;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class EmailAddressParsedResult extends ParsedResult {
    private final String[] bccs;
    private final String body;
    private final String[] ccs;
    private final String subject;
    private final String[] tos;

    EmailAddressParsedResult(String str) {
    }

    public String[] getBCCs() {
    }

    public String getBody() {
    }

    public String[] getCCs() {
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
    }

    @Deprecated
    public String getEmailAddress() {
    }

    @Deprecated
    public String getMailtoURI() {
    }

    public String getSubject() {
    }

    public String[] getTos() {
    }

    EmailAddressParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
    }
}
