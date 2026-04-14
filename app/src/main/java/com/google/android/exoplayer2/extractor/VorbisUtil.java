package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class VorbisUtil {
    private static final String TAG = "VorbisUtil";

    private static final class CodeBook {
        public final int dimensions;
        public final int entries;
        public final boolean isOrdered;
        public final long[] lengthMap;
        public final int lookupType;

        public CodeBook(int i, int i2, long[] jArr, int i3, boolean z) {
        }
    }

    public static final class CommentHeader {
        public final String[] comments;
        public final int length;
        public final String vendor;

        public CommentHeader(String str, String[] strArr, int i) {
        }
    }

    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean z, int i, int i2, int i3) {
        }
    }

    public static final class VorbisIdHeader {
        public final int bitrateMaximum;
        public final int bitrateMinimum;
        public final int bitrateNominal;
        public final int blockSize0;
        public final int blockSize1;
        public final int channels;
        public final byte[] data;
        public final boolean framingFlag;
        public final int sampleRate;
        public final int version;

        public VorbisIdHeader(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
        }
    }

    private VorbisUtil() {
    }

    public static int iLog(int i) {
    }

    private static long mapType1QuantValues(long j, long j2) {
    }

    public static Metadata parseVorbisComments(List<String> list) {
    }

    private static CodeBook readBook(VorbisBitArray vorbisBitArray) throws ParserException {
    }

    private static void readFloors(VorbisBitArray vorbisBitArray) throws ParserException {
    }

    private static void readMappings(int i, VorbisBitArray vorbisBitArray) throws ParserException {
    }

    private static Mode[] readModes(VorbisBitArray vorbisBitArray) {
    }

    private static void readResidues(VorbisBitArray vorbisBitArray) throws ParserException {
    }

    public static CommentHeader readVorbisCommentHeader(ParsableByteArray parsableByteArray) throws ParserException {
    }

    public static VorbisIdHeader readVorbisIdentificationHeader(ParsableByteArray parsableByteArray) throws ParserException {
    }

    public static Mode[] readVorbisModes(ParsableByteArray parsableByteArray, int i) throws ParserException {
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i, ParsableByteArray parsableByteArray, boolean z) throws ParserException {
    }

    public static CommentHeader readVorbisCommentHeader(ParsableByteArray parsableByteArray, boolean z, boolean z2) throws ParserException {
    }
}
