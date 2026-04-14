package com.google.firebase.crashlytics.internal.log;

import com.google.firebase.crashlytics.internal.log.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class QueueFileLogStore implements FileLogStore {
    private static final Charset UTF_8 = null;
    private QueueFile logFile;
    private final int maxLogSize;
    private final File workingFile;

    /* renamed from: com.google.firebase.crashlytics.internal.log.QueueFileLogStore$1 */
    class C11191 implements QueueFile.ElementReader {
        final /* synthetic */ QueueFileLogStore this$0;
        final /* synthetic */ byte[] val$logBytes;
        final /* synthetic */ int[] val$offsetHolder;

        C11191(QueueFileLogStore queueFileLogStore, byte[] bArr, int[] iArr) {
        }

        @Override // com.google.firebase.crashlytics.internal.log.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) throws IOException {
        }
    }

    private static class LogBytes {
        public final byte[] bytes;
        public final int offset;

        LogBytes(byte[] bArr, int i) {
        }
    }

    QueueFileLogStore(File file, int i) {
    }

    private void doWriteToLog(long j, String str) {
    }

    private LogBytes getLogBytes() {
    }

    private void openLogFile() {
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
}
