package com.google.android.exoplayer2.extractor.amr;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AmrExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = null;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_FRAME_SIZE_BYTES = 0;
    private static final int NUM_SAME_SIZE_CONSTANT_BIT_RATE_THRESHOLD = 20;
    private static final int SAMPLE_RATE_NB = 8000;
    private static final int SAMPLE_RATE_WB = 16000;
    private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
    private static final byte[] amrSignatureNb = null;
    private static final byte[] amrSignatureWb = null;
    private static final int[] frameSizeBytesByTypeNb = null;
    private static final int[] frameSizeBytesByTypeWb = null;
    private int currentSampleBytesRemaining;
    private int currentSampleSize;
    private long currentSampleTimeUs;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private int firstSampleSize;
    private final int flags;
    private boolean hasOutputFormat;
    private boolean hasOutputSeekMap;
    private boolean isWideBand;
    private int numSamplesWithSameSize;
    private final byte[] scratch;
    private SeekMap seekMap;
    private long timeOffsetUs;
    private TrackOutput trackOutput;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AmrExtractor() {
    }

    static byte[] amrSignatureNb() {
    }

    static byte[] amrSignatureWb() {
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
    }

    public static /* synthetic */ Extractor[] dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    static int frameSizeBytesByTypeNb(int i) {
    }

    static int frameSizeBytesByTypeWb(int i) {
    }

    private static int getBitrateFromFrameSize(int i, long j) {
    }

    private SeekMap getConstantBitrateSeekMap(long j, boolean z) {
    }

    private int getFrameSizeInBytes(int i) throws ParserException {
    }

    private boolean isNarrowBandValidFrameType(int i) {
    }

    private boolean isValidFrameType(int i) {
    }

    private boolean isWideBandValidFrameType(int i) {
    }

    private static /* synthetic */ Extractor[] lambda$static$0() {
    }

    @RequiresNonNull({"trackOutput"})
    private void maybeOutputFormat() {
    }

    @RequiresNonNull({"extractorOutput"})
    private void maybeOutputSeekMap(long j, int i) {
    }

    private static boolean peekAmrSignature(ExtractorInput extractorInput, byte[] bArr) throws IOException {
    }

    private int peekNextSampleSize(ExtractorInput extractorInput) throws IOException {
    }

    private boolean readAmrHeader(ExtractorInput extractorInput) throws IOException {
    }

    @RequiresNonNull({"trackOutput"})
    private int readSample(ExtractorInput extractorInput) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
    }

    public AmrExtractor(int i) {
    }
}
