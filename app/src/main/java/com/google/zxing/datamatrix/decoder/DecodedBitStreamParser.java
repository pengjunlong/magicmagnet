package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import java.util.Collection;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS = null;
    private static final char[] C40_SHIFT2_SET_CHARS = null;
    private static final char[] TEXT_BASIC_SET_CHARS = null;
    private static final char[] TEXT_SHIFT2_SET_CHARS = null;
    private static final char[] TEXT_SHIFT3_SET_CHARS = null;

    /* renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1 */
    static /* synthetic */ class C13831 {

        /* renamed from: $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode */
        static final /* synthetic */ int[] f192xb73eb560 = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class Mode {
        private static final /* synthetic */ Mode[] $VALUES = null;
        public static final Mode ANSIX12_ENCODE = null;
        public static final Mode ASCII_ENCODE = null;
        public static final Mode BASE256_ENCODE = null;
        public static final Mode C40_ENCODE = null;
        public static final Mode EDIFACT_ENCODE = null;
        public static final Mode PAD_ENCODE = null;
        public static final Mode TEXT_ENCODE = null;

        private Mode(String str, int i) {
        }

        public static Mode valueOf(String str) {
        }

        public static Mode[] values() {
        }
    }

    private DecodedBitStreamParser() {
    }

    static DecoderResult decode(byte[] bArr) throws FormatException {
    }

    private static void decodeAnsiX12Segment(BitSource bitSource, StringBuilder sb) throws FormatException {
    }

    private static Mode decodeAsciiSegment(BitSource bitSource, StringBuilder sb, StringBuilder sb2) throws FormatException {
    }

    private static void decodeBase256Segment(BitSource bitSource, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
    }

    private static void decodeC40Segment(BitSource bitSource, StringBuilder sb) throws FormatException {
    }

    private static void decodeEdifactSegment(BitSource bitSource, StringBuilder sb) {
    }

    private static void decodeTextSegment(BitSource bitSource, StringBuilder sb) throws FormatException {
    }

    private static void parseTwoBytes(int i, int i2, int[] iArr) {
    }

    private static int unrandomize255State(int i, int i2) {
    }
}
