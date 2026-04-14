package org.apache.xml.serialize;

import java.io.UnsupportedEncodingException;
import java.util.Hashtable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Encodings {
    static final String DEFAULT_ENCODING = "UTF8";
    static final int DEFAULT_LAST_PRINTABLE = 127;
    static final String JIS_DANGER_CHARS = "\\~\u007f¢£¥¬—―‖…‾‾∥∯〜＼～￠￡￢￣";
    static final int LAST_PRINTABLE_UNICODE = 65535;
    static final String[] UNICODE_ENCODINGS = null;
    static Hashtable _encodings;

    static EncodingInfo getEncodingInfo(String str, boolean z) throws UnsupportedEncodingException {
    }
}
