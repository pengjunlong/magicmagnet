package org.apache.xml.serialize;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class EncodingInfo {
    private Object[] fArgsForMethod;
    Object fCharToByteConverter;
    Object fCharsetEncoder;
    boolean fHaveTriedCToB;
    boolean fHaveTriedCharsetEncoder;
    String ianaName;
    String javaName;
    int lastPrintable;

    static class CharToByteConverterMethods {
        private static java.lang.reflect.Method fgCanConvertMethod = null;
        private static boolean fgConvertersAvailable = false;
        private static java.lang.reflect.Method fgGetConverterMethod;

        private CharToByteConverterMethods() {
        }

        static /* synthetic */ boolean access$500() {
        }

        static /* synthetic */ java.lang.reflect.Method access$600() {
        }

        static /* synthetic */ java.lang.reflect.Method access$700() {
        }
    }

    static class CharsetMethods {
        private static java.lang.reflect.Method fgCharsetCanEncodeMethod = null;
        private static java.lang.reflect.Method fgCharsetEncoderCanEncodeMethod = null;
        private static java.lang.reflect.Method fgCharsetForNameMethod = null;
        private static java.lang.reflect.Method fgCharsetNewEncoderMethod = null;
        private static boolean fgNIOCharsetAvailable = false;

        private CharsetMethods() {
        }

        static /* synthetic */ boolean access$000() {
        }

        static /* synthetic */ java.lang.reflect.Method access$100() {
        }

        static /* synthetic */ java.lang.reflect.Method access$200() {
        }

        static /* synthetic */ java.lang.reflect.Method access$300() {
        }

        static /* synthetic */ java.lang.reflect.Method access$400() {
        }
    }

    public EncodingInfo(String str, String str2, int i) {
    }

    private boolean isPrintable0(char c) {
    }

    public static void testJavaEncodingName(String str) throws UnsupportedEncodingException {
    }

    public String getIANAName() {
    }

    public Writer getWriter(OutputStream outputStream) throws UnsupportedEncodingException {
    }

    public boolean isPrintable(char c) {
    }
}
