package com.google.android.exoplayer2.text.cea;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Cea608Decoder extends CeaDecoder {
    private static final int[] BASIC_CHARACTER_SET = null;
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_FLAG = 4;
    private static final int[] COLUMN_INDICES = null;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final byte CTRL_TEXT_RESTART = 42;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    private static final int NTSC_CC_CHANNEL_1 = 0;
    private static final int NTSC_CC_CHANNEL_2 = 1;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final boolean[] ODD_PARITY_BYTE_TABLE = null;
    private static final int[] ROW_INDICES = null;
    private static final int[] SPECIAL_CHARACTER_SET = null;
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = null;
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = null;
    private static final int[] STYLE_COLORS = null;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private static final String TAG = "Cea608Decoder";
    private int captionMode;
    private int captionRowCount;
    private final ParsableByteArray ccData;
    private final ArrayList<CueBuilder> cueBuilders;
    private List<Cue> cues;
    private int currentChannel;
    private CueBuilder currentCueBuilder;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private long lastCueUpdateUs;
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private final long validDataChannelTimeoutUs;

    private static final class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private final StringBuilder captionStringBuilder;
        private final List<CueStyle> cueStyles;
        private int indent;
        private final List<SpannableString> rolledUpCaptions;
        private int row;
        private int tabOffset;

        private static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i, boolean z, int i2) {
            }
        }

        public CueBuilder(int i, int i2) {
        }

        static /* synthetic */ int access$002(CueBuilder cueBuilder, int i) {
        }

        static /* synthetic */ int access$100(CueBuilder cueBuilder) {
        }

        static /* synthetic */ int access$102(CueBuilder cueBuilder, int i) {
        }

        static /* synthetic */ int access$202(CueBuilder cueBuilder, int i) {
        }

        private SpannableString buildCurrentLine() {
        }

        private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        }

        private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        }

        private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        }

        public void append(char c) {
        }

        public void backspace() {
        }

        public Cue build(int i) {
        }

        public boolean isEmpty() {
        }

        public void reset(int i) {
        }

        public void rollUp() {
        }

        public void setCaptionMode(int i) {
        }

        public void setCaptionRowCount(int i) {
        }

        public void setStyle(int i, boolean z) {
        }
    }

    public Cea608Decoder(String str, int i, long j) {
    }

    static /* synthetic */ int[] access$300() {
    }

    private static char getBasicChar(byte b) {
    }

    private static int getChannel(byte b) {
    }

    private List<Cue> getDisplayCues() {
    }

    private static char getExtendedEsFrChar(byte b) {
    }

    private static char getExtendedPtDeChar(byte b) {
    }

    private static char getExtendedWestEuropeanChar(byte b, byte b2) {
    }

    private static char getSpecialNorthAmericanChar(byte b) {
    }

    private void handleMidrowCtrl(byte b) {
    }

    private void handleMiscCode(byte b) {
    }

    private void handlePreambleAddressCode(byte b, byte b2) {
    }

    private static boolean isCtrlCode(byte b) {
    }

    private static boolean isExtendedWestEuropeanChar(byte b, byte b2) {
    }

    private static boolean isMidrowCtrlCode(byte b, byte b2) {
    }

    private static boolean isMiscCode(byte b, byte b2) {
    }

    private static boolean isPreambleAddressCode(byte b, byte b2) {
    }

    private static boolean isRepeatable(byte b) {
    }

    private boolean isRepeatedCommand(boolean z, byte b, byte b2) {
    }

    private static boolean isServiceSwitchCommand(byte b) {
    }

    private static boolean isSpecialNorthAmericanChar(byte b, byte b2) {
    }

    private static boolean isTabCtrlCode(byte b, byte b2) {
    }

    private static boolean isXdsControlCode(byte b) {
    }

    private void maybeUpdateIsInCaptionService(byte b, byte b2) {
    }

    private void resetCueBuilders() {
    }

    private void setCaptionMode(int i) {
    }

    private void setCaptionRowCount(int i) {
    }

    private boolean shouldClearStuckCaptions() {
    }

    private boolean updateAndVerifyCurrentChannel(byte b) {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    protected Subtitle createSubtitle() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    protected void decode(SubtitleInputBuffer subtitleInputBuffer) {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws DecoderException {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    protected boolean isNewSubtitleDataAvailable() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
    }
}
