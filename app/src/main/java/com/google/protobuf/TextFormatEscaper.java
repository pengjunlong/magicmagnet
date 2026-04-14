package com.google.protobuf;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class TextFormatEscaper {

    /* renamed from: com.google.protobuf.TextFormatEscaper$1 */
    static class C13341 implements ByteSequence {
        final /* synthetic */ ByteString val$input;

        C13341(ByteString byteString) {
        }

        @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
        public byte byteAt(int i) {
        }

        @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
        public int size() {
        }
    }

    /* renamed from: com.google.protobuf.TextFormatEscaper$2 */
    static class C13352 implements ByteSequence {
        final /* synthetic */ byte[] val$input;

        C13352(byte[] bArr) {
        }

        @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
        public byte byteAt(int i) {
        }

        @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
        public int size() {
        }
    }

    private interface ByteSequence {
        byte byteAt(int i);

        int size();
    }

    private TextFormatEscaper() {
    }

    static String escapeBytes(ByteSequence byteSequence) {
    }

    static String escapeDoubleQuotesAndBackslashes(String str) {
    }

    static String escapeText(String str) {
    }

    static String escapeBytes(ByteString byteString) {
    }

    static String escapeBytes(byte[] bArr) {
    }
}
