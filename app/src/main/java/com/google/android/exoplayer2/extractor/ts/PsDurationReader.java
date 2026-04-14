package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class PsDurationReader {
    private static final String TAG = "PsDurationReader";
    private static final int TIMESTAMP_SEARCH_BYTES = 20000;
    private long durationUs;
    private long firstScrValue;
    private boolean isDurationRead;
    private boolean isFirstScrValueRead;
    private boolean isLastScrValueRead;
    private long lastScrValue;
    private final ParsableByteArray packetBuffer;
    private final TimestampAdjuster scrTimestampAdjuster;

    PsDurationReader() {
    }

    private static boolean checkMarkerBits(byte[] bArr) {
    }

    private int finishReadDuration(ExtractorInput extractorInput) {
    }

    private int peekIntAtPosition(byte[] bArr, int i) {
    }

    private int readFirstScrValue(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
    }

    private long readFirstScrValueFromBuffer(ParsableByteArray parsableByteArray) {
    }

    private int readLastScrValue(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
    }

    private long readLastScrValueFromBuffer(ParsableByteArray parsableByteArray) {
    }

    public static long readScrValueFromPack(ParsableByteArray parsableByteArray) {
    }

    private static long readScrValueFromPackHeader(byte[] bArr) {
    }

    public long getDurationUs() {
    }

    public TimestampAdjuster getScrTimestampAdjuster() {
    }

    public boolean isDurationReadFinished() {
    }

    public int readDuration(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
    }
}
