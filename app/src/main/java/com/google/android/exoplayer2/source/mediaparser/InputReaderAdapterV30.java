package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import com.google.android.exoplayer2.upstream.DataReader;
import java.io.IOException;

@SuppressLint({"Override"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class InputReaderAdapterV30 implements MediaParser.SeekableInputReader {
    private long currentPosition;
    private DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
    }

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
    }

    @Override // android.media.MediaParser.InputReader
    public long getPosition() {
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
    }

    @Override // android.media.MediaParser.SeekableInputReader
    public void seekToPosition(long j) {
    }

    public void setCurrentPosition(long j) {
    }

    public void setDataReader(DataReader dataReader, long j) {
    }
}
