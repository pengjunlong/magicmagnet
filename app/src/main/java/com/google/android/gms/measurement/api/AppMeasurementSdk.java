package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgv;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class AppMeasurementSdk {
    private final zzee zza;

    @KeepForSdk
    public static final class ConditionalUserProperty {

        @KeepForSdk
        public static final String ACTIVE = "active";

        @KeepForSdk
        public static final String CREATION_TIMESTAMP = "creation_timestamp";

        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";

        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";

        @KeepForSdk
        public static final String NAME = "name";

        @KeepForSdk
        public static final String ORIGIN = "origin";

        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";

        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";

        @KeepForSdk
        public static final String TIME_TO_LIVE = "time_to_live";

        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";

        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";

        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";

        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";

        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";

        @KeepForSdk
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzgu {
        @Override // com.google.android.gms.measurement.internal.zzgu
        @ShowFirstParty
        @KeepForSdk
        void interceptEvent(String str, String str2, Bundle bundle, long j);
    }

    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzgv {
        @Override // com.google.android.gms.measurement.internal.zzgv
        @ShowFirstParty
        @KeepForSdk
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    public AppMeasurementSdk(zzee zzeeVar) {
    }

    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurementSdk getInstance(Context context) {
    }

    @KeepForSdk
    public void beginAdUnitExposure(String str) {
    }

    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
    }

    @KeepForSdk
    public void endAdUnitExposure(String str) {
    }

    @KeepForSdk
    public long generateEventId() {
    }

    @KeepForSdk
    public String getAppIdOrigin() {
    }

    @KeepForSdk
    public String getAppInstanceId() {
    }

    @KeepForSdk
    public List<Bundle> getConditionalUserProperties(String str, String str2) {
    }

    @KeepForSdk
    public String getCurrentScreenClass() {
    }

    @KeepForSdk
    public String getCurrentScreenName() {
    }

    @KeepForSdk
    public String getGmpAppId() {
    }

    @KeepForSdk
    public int getMaxUserProperties(String str) {
    }

    @KeepForSdk
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
    }

    @KeepForSdk
    public void logEvent(String str, String str2, Bundle bundle) {
    }

    @KeepForSdk
    public void logEventNoInterceptor(String str, String str2, Bundle bundle, long j) {
    }

    @KeepForSdk
    public void performAction(Bundle bundle) {
    }

    @KeepForSdk
    public Bundle performActionWithResponse(Bundle bundle) {
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
    }

    @KeepForSdk
    public void setConditionalUserProperty(Bundle bundle) {
    }

    @KeepForSdk
    public void setConsent(Bundle bundle) {
    }

    @KeepForSdk
    public void setCurrentScreen(Activity activity, String str, String str2) {
    }

    @ShowFirstParty
    @KeepForSdk
    public void setEventInterceptor(EventInterceptor eventInterceptor) {
    }

    @KeepForSdk
    public void setMeasurementEnabled(Boolean bool) {
    }

    @KeepForSdk
    public void setUserProperty(String str, String str2, Object obj) {
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
    }

    public final void zza(boolean z) {
    }

    @KeepForSdk
    public void setMeasurementEnabled(boolean z) {
    }

    @KeepForSdk
    public static AppMeasurementSdk getInstance(Context context, String str, String str2, String str3, Bundle bundle) {
    }
}
