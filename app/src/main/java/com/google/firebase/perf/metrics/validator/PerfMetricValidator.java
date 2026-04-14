package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import com.google.firebase.perf.v1.PerfMetric;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class PerfMetricValidator {
    private static List<PerfMetricValidator> getValidators(PerfMetric perfMetric, Context context) {
    }

    public static boolean isValid(PerfMetric perfMetric, Context context) {
    }

    public static String validateAttribute(Map.Entry<String, String> entry) {
    }

    public static String validateMetricName(String str) {
    }

    public static String validateTraceName(String str) {
    }

    public abstract boolean isValidPerfMetric();
}
