package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class UtcDates {
    static final String UTC = "UTC";
    static AtomicReference<TimeSource> timeSourceRef;

    private UtcDates() {
    }

    static long canonicalYearMonthDay(long j) {
    }

    private static int findCharactersInDateFormatPattern(String str, String str2, int i, int i2) {
    }

    @TargetApi(24)
    static DateFormat getAbbrMonthDayFormat(Locale locale) {
    }

    @TargetApi(24)
    static DateFormat getAbbrMonthWeekdayDayFormat(Locale locale) {
    }

    @TargetApi(24)
    private static DateFormat getAndroidFormat(String str, Locale locale) {
    }

    static Calendar getDayCopy(Calendar calendar) {
    }

    static SimpleDateFormat getDefaultTextInputFormat() {
    }

    static String getDefaultTextInputHint(Resources resources, SimpleDateFormat simpleDateFormat) {
    }

    private static java.text.DateFormat getFormat(int i, Locale locale) {
    }

    static java.text.DateFormat getFullFormat() {
    }

    static java.text.DateFormat getMediumFormat() {
    }

    static java.text.DateFormat getMediumNoYear() {
    }

    static SimpleDateFormat getSimpleFormat(String str) {
    }

    static TimeSource getTimeSource() {
    }

    private static TimeZone getTimeZone() {
    }

    static Calendar getTodayCalendar() {
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone getUtcAndroidTimeZone() {
    }

    static Calendar getUtcCalendar() {
    }

    static Calendar getUtcCalendarOf(Calendar calendar) {
    }

    @TargetApi(24)
    static DateFormat getYearAbbrMonthDayFormat(Locale locale) {
    }

    @TargetApi(24)
    static DateFormat getYearAbbrMonthWeekdayDayFormat(Locale locale) {
    }

    private static String removeYearFromDateFormatPattern(String str) {
    }

    static void setTimeSource(TimeSource timeSource) {
    }

    static java.text.DateFormat getFullFormat(Locale locale) {
    }

    static java.text.DateFormat getMediumFormat(Locale locale) {
    }

    static java.text.DateFormat getMediumNoYear(Locale locale) {
    }

    private static SimpleDateFormat getSimpleFormat(String str, Locale locale) {
    }
}
