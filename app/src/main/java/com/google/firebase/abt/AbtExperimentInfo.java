package com.google.firebase.abt;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class AbtExperimentInfo {
    private static final String[] ALL_REQUIRED_KEYS = null;
    static final String EXPERIMENT_ID_KEY = "experimentId";
    static final String EXPERIMENT_START_TIME_KEY = "experimentStartTime";
    static final String TIME_TO_LIVE_KEY = "timeToLiveMillis";
    static final String TRIGGER_EVENT_KEY = "triggerEvent";
    static final String TRIGGER_TIMEOUT_KEY = "triggerTimeoutMillis";
    static final String VARIANT_ID_KEY = "variantId";
    static final DateFormat protoTimestampStringParser = null;
    private final String experimentId;
    private final Date experimentStartTime;
    private final long timeToLiveInMillis;
    private final String triggerEventName;
    private final long triggerTimeoutInMillis;
    private final String variantId;

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j, long j2) {
    }

    static AbtExperimentInfo fromConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
    }

    static AbtExperimentInfo fromMap(Map<String, String> map) throws AbtException {
    }

    static void validateAbtExperimentInfo(AbtExperimentInfo abtExperimentInfo) throws AbtException {
    }

    private static void validateExperimentInfoMap(Map<String, String> map) throws AbtException {
    }

    String getExperimentId() {
    }

    long getStartTimeInMillisSinceEpoch() {
    }

    long getTimeToLiveInMillis() {
    }

    String getTriggerEventName() {
    }

    long getTriggerTimeoutInMillis() {
    }

    String getVariantId() {
    }

    AnalyticsConnector.ConditionalUserProperty toConditionalUserProperty(String str) {
    }

    Map<String, String> toStringMap() {
    }
}
