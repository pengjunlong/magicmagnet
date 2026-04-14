package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.encoders.DataEncoder;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class CrashlyticsReportJsonTransform {
    private static final DataEncoder CRASHLYTICS_REPORT_JSON_ENCODER = null;

    /* JADX INFO: Access modifiers changed from: private */
    interface ObjectParser<T> {
        T parse(JsonReader jsonReader) throws IOException;
    }

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.BinaryImage bpdqqiQNVROMLC1ll1l1l11(JsonReader jsonReader) {
    }

    public static /* synthetic */ CrashlyticsReport.Session.Event dbpqdHhmDSIHIJiwc1ll1l1(JsonReader jsonReader) {
    }

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame dpbdbdpbLwkLpObyKsq1lll1(JsonReader jsonReader) {
    }

    public static /* synthetic */ CrashlyticsReport.FilesPayload.File dpbdpqRKAscW1lll1l(JsonReader jsonReader) {
    }

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.Thread dqqppqiKzJi1l1lll1l(JsonReader jsonReader) {
    }

    private static CrashlyticsReport.Session.Application parseApp(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.ApplicationExitInfo parseAppExitInfo(JsonReader jsonReader) throws IOException {
    }

    private static <T> ImmutableList<T> parseArray(JsonReader jsonReader, ObjectParser<T> objectParser) throws IOException {
    }

    private static CrashlyticsReport.CustomAttribute parseCustomAttribute(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Device parseDevice(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Event parseEvent(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Event.Application parseEventApp(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Event.Application.Execution.BinaryImage parseEventBinaryImage(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Event.Device parseEventDevice(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Event.Application.Execution parseEventExecution(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Event.Application.Execution.Exception parseEventExecutionException(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame parseEventFrame(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Event.Log parseEventLog(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Event.Application.Execution.Signal parseEventSignal(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.Event.Application.Execution.Thread parseEventThread(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.FilesPayload.File parseFile(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.FilesPayload parseNdkPayload(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.OperatingSystem parseOs(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport parseReport(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session parseSession(JsonReader jsonReader) throws IOException {
    }

    private static CrashlyticsReport.Session.User parseUser(JsonReader jsonReader) throws IOException {
    }

    public static /* synthetic */ CrashlyticsReport.CustomAttribute ppbdpwWWljzmXXdHNabfWhgjl111l11(JsonReader jsonReader) {
    }

    public CrashlyticsReport.ApplicationExitInfo applicationExitInfoFromJson(String str) throws IOException {
    }

    public String applicationExitInfoToJson(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
    }

    public CrashlyticsReport.Session.Event eventFromJson(String str) throws IOException {
    }

    public String eventToJson(CrashlyticsReport.Session.Event event) {
    }

    public CrashlyticsReport reportFromJson(String str) throws IOException {
    }

    public String reportToJson(CrashlyticsReport crashlyticsReport) {
    }
}
