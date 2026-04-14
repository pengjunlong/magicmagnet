package com.google.zxing.client.result;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class CalendarParsedResult extends ParsedResult {
    private static final Pattern DATE_TIME = null;
    private static final Pattern RFC2445_DURATION = null;
    private static final long[] RFC2445_DURATION_FIELD_UNITS = null;
    private final String[] attendees;
    private final String description;
    private final Date end;
    private final boolean endAllDay;
    private final double latitude;
    private final String location;
    private final double longitude;
    private final String organizer;
    private final Date start;
    private final boolean startAllDay;
    private final String summary;

    public CalendarParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
    }

    private static DateFormat buildDateFormat() {
    }

    private static DateFormat buildDateTimeFormat() {
    }

    private static String format(boolean z, Date date) {
    }

    private static Date parseDate(String str) throws ParseException {
    }

    private static long parseDurationMS(CharSequence charSequence) {
    }

    public String[] getAttendees() {
    }

    public String getDescription() {
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
    }

    public Date getEnd() {
    }

    public double getLatitude() {
    }

    public String getLocation() {
    }

    public double getLongitude() {
    }

    public String getOrganizer() {
    }

    public Date getStart() {
    }

    public String getSummary() {
    }

    public boolean isEndAllDay() {
    }

    public boolean isStartAllDay() {
    }
}
