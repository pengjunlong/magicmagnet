package com.google.firebase.crashlytics.internal.log;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class LogFileManager {
    private static final String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
    private static final String LOGFILE_EXT = ".temp";
    private static final String LOGFILE_PREFIX = "crashlytics-userlog-";
    static final int MAX_LOG_SIZE = 65536;
    private static final NoopLogStore NOOP_LOG_STORE = null;
    private final Context context;
    private FileLogStore currentLog;
    private final DirectoryProvider directoryProvider;

    public interface DirectoryProvider {
        File getLogFileDir();
    }

    private static final class NoopLogStore implements FileLogStore {
        private NoopLogStore() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.FileLogStore
        public void closeLogFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.FileLogStore
        public void deleteLogFile() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.FileLogStore
        public byte[] getLogAsBytes() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.FileLogStore
        public String getLogAsString() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.FileLogStore
        public void writeToLog(long j, String str) {
        }

        /* synthetic */ NoopLogStore(C11171 c11171) {
        }
    }

    public LogFileManager(Context context, DirectoryProvider directoryProvider) {
    }

    private String getSessionIdForFile(File file) {
    }

    private File getWorkingFileForSession(String str) {
    }

    public void clearLog() {
    }

    public void discardOldLogFiles(Set<String> set) {
    }

    public byte[] getBytesForLog() {
    }

    public String getLogString() {
    }

    public final void setCurrentSession(String str) {
    }

    void setLogFile(File file, int i) {
    }

    public void writeToLog(long j, String str) {
    }

    public LogFileManager(Context context, DirectoryProvider directoryProvider, String str) {
    }
}
