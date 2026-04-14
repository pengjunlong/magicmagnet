package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = null;
    private static final String UTC_ID = "UTC";

    private static boolean checkOffset(String str, int i, char c) {
    }

    public static String format(Date date) {
    }

    private static int indexOfNonDigit(String str, int i) {
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
    }

    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
    }

    public static String format(Date date, boolean z) {
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
    }
}
