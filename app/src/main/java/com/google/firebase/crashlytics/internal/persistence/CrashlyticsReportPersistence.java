package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class CrashlyticsReportPersistence {
    private static final String APP_EXIT_INFO_FILE_NAME = "app-exit-info";
    private static final String EVENT_COUNTER_FORMAT = "%010d";
    private static final int EVENT_COUNTER_WIDTH = 10;
    private static final FilenameFilter EVENT_FILE_FILTER = null;
    private static final String EVENT_FILE_NAME_PREFIX = "event";
    private static final int EVENT_NAME_LENGTH = 0;
    private static final String EVENT_TYPE_ANR = "anr";
    private static final Comparator<? super File> LATEST_SESSION_ID_FIRST_COMPARATOR = null;
    private static final int MAX_OPEN_SESSIONS = 8;
    private static final String NATIVE_REPORTS_DIRECTORY = "native-reports";
    private static final String NORMAL_EVENT_SUFFIX = "";
    private static final String OPEN_SESSIONS_DIRECTORY_NAME = "sessions";
    private static final String PRIORITY_EVENT_SUFFIX = "_";
    private static final String PRIORITY_REPORTS_DIRECTORY = "priority-reports";
    private static final String REPORTS_DIRECTORY = "reports";
    private static final String REPORT_FILE_NAME = "report";
    private static final String SESSION_START_TIMESTAMP_FILE_NAME = "start-time";
    private static final CrashlyticsReportJsonTransform TRANSFORM = null;
    private static final String USER_FILE_NAME = "user";
    private static final Charset UTF_8 = null;
    private static final String WORKING_DIRECTORY_NAME = "report-persistence";
    private final AtomicInteger eventCounter;
    private final File nativeReportsDirectory;
    private final File openSessionsDirectory;
    private final File priorityReportsDirectory;
    private final File reportsDirectory;
    private final SettingsDataProvider settingsDataProvider;

    public CrashlyticsReportPersistence(File file, SettingsDataProvider settingsDataProvider) {
    }

    public static /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11(File file, File file2) {
    }

    private List<File> capAndGetOpenSessions(String str) {
    }

    private static int capFilesCount(List<File> list, int i) {
    }

    private void capFinalizedReports() {
    }

    private static List<File> combineReportFiles(List<File>... listArr) {
    }

    private static long convertTimestampFromSecondsToMs(long j) {
    }

    public static /* synthetic */ int dbpqdHhmDSIHIJiwc1ll1l1(File file, File file2) {
    }

    public static /* synthetic */ boolean dpbdbdpbLwkLpObyKsq1lll1(File file, String str) {
    }

    public static /* synthetic */ boolean dpbdpqRKAscW1lll1l(String str, File file) {
    }

    public static /* synthetic */ boolean dqqppqiKzJi1l1lll1l(String str, File file, String str2) {
    }

    private static String generateEventFilename(int i, boolean z) {
    }

    private static List<File> getAllFilesInDirectory(File file) {
    }

    private List<File> getAllFinalizedReportFiles() {
    }

    private static String getEventNameWithoutPriority(String str) {
    }

    private static List<File> getFilesInDirectory(File file, FilenameFilter filenameFilter) {
    }

    private File getSessionDirectoryById(String str) {
    }

    private static boolean isHighPriorityEventFile(String str) {
    }

    private static boolean isNormalPriorityEventFile(File file, String str) {
    }

    private static /* synthetic */ boolean lambda$capAndGetOpenSessions$3(String str, File file) {
    }

    private static /* synthetic */ boolean lambda$deleteFinalizedReport$2(String str, File file, String str2) {
    }

    private static /* synthetic */ int lambda$static$0(File file, File file2) {
    }

    private static /* synthetic */ boolean lambda$static$1(File file, String str) {
    }

    private static boolean makeDirectory(File file) {
    }

    private static int oldestEventFileFirst(File file, File file2) {
    }

    public static /* synthetic */ boolean ppbdpwWWljzmXXdHNabfWhgjl111l11(File file, String str) {
    }

    private static File prepareDirectory(File file) throws IOException {
    }

    private static String readTextFile(File file) throws IOException {
    }

    private static void recursiveDelete(File file) {
    }

    private static List<File> sortAndCombineReportFiles(List<File>... listArr) {
    }

    private static void synthesizeNativeReportFile(File file, File file2, CrashlyticsReport.FilesPayload filesPayload, String str) {
    }

    private void synthesizeReport(File file, long j) {
    }

    private static void synthesizeReportFile(File file, File file2, List<CrashlyticsReport.Session.Event> list, long j, boolean z, String str) {
    }

    private static int trimEvents(File file, int i) {
    }

    private static void writeTextFile(File file, String str) throws IOException {
    }

    public void deleteAllReports() {
    }

    public void deleteFinalizedReport(String str) {
    }

    public void finalizeReports(String str, long j) {
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload) {
    }

    public long getStartTimestampMillis(String str) {
    }

    public boolean hasFinalizedReports() {
    }

    public List<String> listSortedOpenSessionIds() {
    }

    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
    }

    public void persistEvent(CrashlyticsReport.Session.Event event, String str) {
    }

    public void persistReport(CrashlyticsReport crashlyticsReport) {
    }

    public void persistUserIdForSession(String str, String str2) {
    }

    public void persistEvent(CrashlyticsReport.Session.Event event, String str, boolean z) {
    }

    private static List<File> getFilesInDirectory(File file, FileFilter fileFilter) {
    }

    private static void writeTextFile(File file, String str, long j) throws IOException {
    }
}
