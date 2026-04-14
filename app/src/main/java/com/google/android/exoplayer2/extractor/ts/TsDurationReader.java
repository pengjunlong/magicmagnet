package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class TsDurationReader {
    private static final String TAG = "TsDurationReader";
    private long durationUs;
    private long firstPcrValue;
    private boolean isDurationRead;
    private boolean isFirstPcrValueRead;
    private boolean isLastPcrValueRead;
    private long lastPcrValue;
    private final ParsableByteArray packetBuffer;
    private final TimestampAdjuster pcrTimestampAdjuster;
    private final int timestampSearchBytes;

    TsDurationReader(int i) {
    }

    private int finishReadDuration(ExtractorInput extractorInput) {
    }

    private int readFirstPcrValue(ExtractorInput extractorInput, PositionHolder positionHolder, int i) throws IOException {
    }

    private long readFirstPcrValueFromBuffer(ParsableByteArray parsableByteArray, int i) {
    }

    private int readLastPcrValue(ExtractorInput extractorInput, PositionHolder positionHolder, int i) throws IOException {
    }

    private long readLastPcrValueFromBuffer(ParsableByteArray parsableByteArray, int i) {
    }

    public long getDurationUs() {
    }

    public TimestampAdjuster getPcrTimestampAdjuster() {
    }

    public boolean isDurationReadFinished() {
    }

    public int readDuration(ExtractorInput extractorInput, PositionHolder positionHolder, int i) throws IOException {
    }
}
