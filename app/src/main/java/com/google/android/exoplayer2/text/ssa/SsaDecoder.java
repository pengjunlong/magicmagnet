package com.google.android.exoplayer2.text.ssa;

import android.text.Layout;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.ssa.SsaStyle;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue:";
    static final String FORMAT_LINE_PREFIX = "Format:";
    private static final Pattern SSA_TIMECODE_PATTERN = null;
    static final String STYLE_LINE_PREFIX = "Style:";
    private static final String TAG = "SsaDecoder";
    private final SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private float screenHeight;
    private float screenWidth;
    private Map<String, SsaStyle> styles;

    public SsaDecoder() {
    }

    private static int addCuePlacerholderByTime(long j, List<Long> list, List<List<Cue>> list2) {
    }

    private static float computeDefaultLineOrPosition(int i) {
    }

    private static Cue createCue(String str, SsaStyle ssaStyle, SsaStyle.Overrides overrides, float f, float f2) {
    }

    private void parseDialogueLine(String str, SsaDialogueFormat ssaDialogueFormat, List<List<Cue>> list, List<Long> list2) {
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<List<Cue>> list, List<Long> list2) {
    }

    private void parseHeader(ParsableByteArray parsableByteArray) {
    }

    private void parseScriptInfo(ParsableByteArray parsableByteArray) {
    }

    private static Map<String, SsaStyle> parseStyles(ParsableByteArray parsableByteArray) {
    }

    private static long parseTimecodeUs(String str) {
    }

    private static int toLineAnchor(int i) {
    }

    private static int toPositionAnchor(int i) {
    }

    private static Layout.Alignment toTextAlignment(int i) {
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected Subtitle decode(byte[] bArr, int i, boolean z) {
    }

    public SsaDecoder(List<byte[]> list) {
    }
}
