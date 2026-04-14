package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class ScriptTagPayloadReader extends TagPayloadReader {
    private static final int AMF_TYPE_BOOLEAN = 1;
    private static final int AMF_TYPE_DATE = 11;
    private static final int AMF_TYPE_ECMA_ARRAY = 8;
    private static final int AMF_TYPE_END_MARKER = 9;
    private static final int AMF_TYPE_NUMBER = 0;
    private static final int AMF_TYPE_OBJECT = 3;
    private static final int AMF_TYPE_STRICT_ARRAY = 10;
    private static final int AMF_TYPE_STRING = 2;
    private static final String KEY_DURATION = "duration";
    private static final String KEY_FILE_POSITIONS = "filepositions";
    private static final String KEY_KEY_FRAMES = "keyframes";
    private static final String KEY_TIMES = "times";
    private static final String NAME_METADATA = "onMetaData";
    private long durationUs;
    private long[] keyFrameTagPositions;
    private long[] keyFrameTimesUs;

    private static Boolean readAmfBoolean(ParsableByteArray parsableByteArray) {
    }

    private static Object readAmfData(ParsableByteArray parsableByteArray, int i) {
    }

    private static Date readAmfDate(ParsableByteArray parsableByteArray) {
    }

    private static Double readAmfDouble(ParsableByteArray parsableByteArray) {
    }

    private static HashMap<String, Object> readAmfEcmaArray(ParsableByteArray parsableByteArray) {
    }

    private static HashMap<String, Object> readAmfObject(ParsableByteArray parsableByteArray) {
    }

    private static ArrayList<Object> readAmfStrictArray(ParsableByteArray parsableByteArray) {
    }

    private static String readAmfString(ParsableByteArray parsableByteArray) {
    }

    private static int readAmfType(ParsableByteArray parsableByteArray) {
    }

    public long getDurationUs() {
    }

    public long[] getKeyFrameTagPositions() {
    }

    public long[] getKeyFrameTimesUs() {
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean parseHeader(ParsableByteArray parsableByteArray) {
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean parsePayload(ParsableByteArray parsableByteArray, long j) {
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
    }
}
