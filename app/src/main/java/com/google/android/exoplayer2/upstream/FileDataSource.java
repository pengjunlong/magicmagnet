package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class FileDataSource extends BaseDataSource {
    private long bytesRemaining;
    private RandomAccessFile file;
    private boolean opened;
    private Uri uri;

    private static final class Api21 {
        private Api21() {
        }

        static /* synthetic */ boolean access$000(Throwable th) {
        }

        private static boolean isPermissionError(Throwable th) {
        }
    }

    public static final class Factory implements DataSource.Factory {
        private TransferListener listener;

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ DataSource createDataSource() {
        }

        @CanIgnoreReturnValue
        public Factory setListener(TransferListener transferListener) {
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public FileDataSource createDataSource() {
        }
    }

    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception exc) {
        }

        @Deprecated
        public FileDataSourceException(String str, IOException iOException) {
        }

        public FileDataSourceException(Throwable th, int i) {
        }

        public FileDataSourceException(String str, Throwable th, int i) {
        }
    }

    private static RandomAccessFile openLocalFile(Uri uri) throws FileDataSourceException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws FileDataSourceException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws FileDataSourceException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
    }
}
