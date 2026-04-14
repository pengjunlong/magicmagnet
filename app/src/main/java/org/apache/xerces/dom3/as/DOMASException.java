package org.apache.xerces.dom3.as;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMASException extends RuntimeException {
    public static final short DUPLICATE_NAME_ERR = 1;
    public static final short NO_AS_AVAILABLE = 3;
    public static final short TYPE_ERR = 2;
    public static final short WRONG_MIME_TYPE_ERR = 4;
    public short code;

    public DOMASException(short s, String str) {
    }
}
