package com.google.firebase.abt;

import android.content.Context;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class FirebaseABTesting {
    static final String ABT_PREFERENCES = "com.google.firebase.abt";
    static final String ORIGIN_LAST_KNOWN_START_TIME_KEY_FORMAT = "%s_lastKnownExperimentStartTime";
    private final Provider<AnalyticsConnector> analyticsConnector;
    private Integer maxUserProperties;
    private final String originService;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(Context context, Provider<AnalyticsConnector> provider, String str) {
    }

    private void addExperimentToAnalytics(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
    }

    private void addExperiments(List<AbtExperimentInfo> list) {
    }

    private static List<AbtExperimentInfo> convertMapsToExperimentInfos(List<Map<String, String>> list) throws AbtException {
    }

    private List<AnalyticsConnector.ConditionalUserProperty> getAllExperimentsInAnalytics() {
    }

    private ArrayList<AbtExperimentInfo> getExperimentsToAdd(List<AbtExperimentInfo> list, Set<String> set) {
    }

    private ArrayList<AnalyticsConnector.ConditionalUserProperty> getExperimentsToRemove(List<AnalyticsConnector.ConditionalUserProperty> list, Set<String> set) {
    }

    private int getMaxUserPropertiesInAnalytics() {
    }

    private void removeExperimentFromAnalytics(String str) {
    }

    private void removeExperiments(Collection<AnalyticsConnector.ConditionalUserProperty> collection) {
    }

    private void replaceAllExperimentsWith(List<AbtExperimentInfo> list) throws AbtException {
    }

    private void throwAbtExceptionIfAnalyticsIsNull() throws AbtException {
    }

    public List<AbtExperimentInfo> getAllExperiments() throws AbtException {
    }

    public void removeAllExperiments() throws AbtException {
    }

    public void replaceAllExperiments(List<Map<String, String>> list) throws AbtException {
    }

    public void reportActiveExperiment(AbtExperimentInfo abtExperimentInfo) throws AbtException {
    }

    public void validateRunningExperiments(List<AbtExperimentInfo> list) throws AbtException {
    }
}
