package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_API_KEY = null;
    private static final String CRASHLYTICS_ENDPOINT = null;
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private static final Transformer<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = null;
    private static final CrashlyticsReportJsonTransform TRANSFORM = null;
    private final Transport<CrashlyticsReport> transport;
    private final Transformer<CrashlyticsReport, byte[]> transportTransform;

    DataTransportCrashlyticsReportSender(Transport<CrashlyticsReport> transport, Transformer<CrashlyticsReport, byte[]> transformer) {
    }

    public static DataTransportCrashlyticsReportSender create(Context context) {
    }

    public static /* synthetic */ byte[] dbpqdHhmDSIHIJiwc1ll1l1(CrashlyticsReport crashlyticsReport) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
    }

    private static /* synthetic */ void lambda$sendReport$1(TaskCompletionSource taskCompletionSource, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
    }

    private static /* synthetic */ byte[] lambda$static$0(CrashlyticsReport crashlyticsReport) {
    }

    private static String mergeStrings(String str, String str2) {
    }

    public Task<CrashlyticsReportWithSessionId> sendReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
    }
}
