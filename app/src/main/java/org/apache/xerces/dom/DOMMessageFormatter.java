package org.apache.xerces.dom;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DOMMessageFormatter {
    public static final String DOM_DOMAIN = "http://www.w3.org/dom/DOMTR";
    public static final String SERIALIZER_DOMAIN = "http://apache.org/xml/serializer";
    public static final String XML_DOMAIN = "http://www.w3.org/TR/1998/REC-xml-19980210";
    private static ResourceBundle domResourceBundle;
    private static Locale locale;
    private static ResourceBundle serResourceBundle;
    private static ResourceBundle xmlResourceBundle;

    DOMMessageFormatter() {
    }

    public static String formatMessage(String str, String str2, Object[] objArr) throws MissingResourceException {
    }

    static ResourceBundle getResourceBundle(String str) {
    }

    public static void init() {
    }

    public static void setLocale(Locale locale2) {
    }
}
