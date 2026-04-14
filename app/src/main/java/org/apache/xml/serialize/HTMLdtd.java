package org.apache.xml.serialize;

import java.util.Hashtable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class HTMLdtd {
    private static final int ALLOWED_HEAD = 32;
    private static final int CLOSE_DD_DT = 128;
    private static final int CLOSE_P = 64;
    private static final int CLOSE_SELF = 256;
    private static final int CLOSE_TABLE = 512;
    private static final int CLOSE_TH_TD = 16384;
    private static final int ELEM_CONTENT = 2;
    private static final int EMPTY = 17;
    private static final String ENTITIES_RESOURCE = "HTMLEntities.res";
    public static final String HTMLPublicId = "-//W3C//DTD HTML 4.01//EN";
    public static final String HTMLSystemId = "http://www.w3.org/TR/html4/strict.dtd";
    private static final int ONLY_OPENING = 1;
    private static final int OPT_CLOSING = 8;
    private static final int PRESERVE = 4;
    public static final String XHTMLPublicId = "-//W3C//DTD XHTML 1.0 Strict//EN";
    public static final String XHTMLSystemId = "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd";
    private static Hashtable _boolAttrs;
    private static Hashtable _byChar;
    private static Hashtable _byName;
    private static Hashtable _elemDefs;

    public static int charFromName(String str) {
    }

    private static void defineBoolean(String str, String str2) {
    }

    private static void defineElement(String str, int i) {
    }

    private static void defineEntity(String str, char c) {
    }

    public static String fromChar(int i) {
    }

    private static void initialize() {
    }

    public static boolean isBoolean(String str, String str2) {
    }

    public static boolean isClosing(String str, String str2) {
    }

    private static boolean isElement(String str, int i) {
    }

    public static boolean isElementContent(String str) {
    }

    public static boolean isEmptyTag(String str) {
    }

    public static boolean isOnlyOpening(String str) {
    }

    public static boolean isOptionalClosing(String str) {
    }

    public static boolean isPreserveSpace(String str) {
    }

    public static boolean isURI(String str, String str2) {
    }

    private static void defineBoolean(String str, String[] strArr) {
    }
}
