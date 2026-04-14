package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE = null;
    private final Long fixedTimeMs;
    private final TimeZone fixedTimeZone;

    private TimeSource(Long l, TimeZone timeZone) {
    }

    static TimeSource fixed(long j, TimeZone timeZone) {
    }

    static TimeSource system() {
    }

    Calendar now() {
    }

    static TimeSource fixed(long j) {
    }

    Calendar now(TimeZone timeZone) {
    }
}
