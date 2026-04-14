package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final FramePredicate NO_FRAMES_PREDICATE = null;
    private static final String TAG = "Id3Decoder";
    private final FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    private static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i, boolean z, int i2) {
        }

        static /* synthetic */ int access$000(Id3Header id3Header) {
        }

        static /* synthetic */ int access$100(Id3Header id3Header) {
        }

        static /* synthetic */ boolean access$200(Id3Header id3Header) {
        }
    }

    public Id3Decoder() {
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
    }

    public static /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(int i, int i2, int i3, int i4, int i5) {
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i, int i2) {
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i, String str) {
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) {
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, FramePredicate framePredicate) {
    }

    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i) {
    }

    private static Id3Frame decodeFrame(int i, ParsableByteArray parsableByteArray, boolean z, int i2, FramePredicate framePredicate) {
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i) {
    }

    private static Id3Header decodeHeader(ParsableByteArray parsableByteArray) {
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i) {
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i) {
    }

    private static String decodeStringIfValid(byte[] bArr, int i, int i2, Charset charset) {
    }

    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i, String str) {
    }

    private static ImmutableList<String> decodeTextInformationFrameValues(byte[] bArr, int i, int i2) {
    }

    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i) {
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i, String str) {
    }

    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i) {
    }

    private static int delimiterLength(int i) {
    }

    private static Charset getCharset(int i) {
    }

    private static String getFrameId(int i, int i2, int i3, int i4, int i5) {
    }

    private static int indexOfTerminator(byte[] bArr, int i, int i2) {
    }

    private static int indexOfZeroByte(byte[] bArr, int i) {
    }

    private static /* synthetic */ boolean lambda$static$0(int i, int i2, int i3, int i4, int i5) {
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i) {
    }

    private static boolean validateFrames(ParsableByteArray parsableByteArray, int i, int i2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    protected Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
    }

    public Id3Decoder(FramePredicate framePredicate) {
    }

    public Metadata decode(byte[] bArr, int i) {
    }
}
