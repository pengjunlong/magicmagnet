package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class ColorResourcesTableCreator {
    private static final byte ANDROID_PACKAGE_ID = 1;
    private static final PackageInfo ANDROID_PACKAGE_INFO = null;
    private static final byte APPLICATION_PACKAGE_ID = Byte.MAX_VALUE;
    private static final Comparator<ColorResource> COLOR_RESOURCE_COMPARATOR = null;
    private static final short HEADER_TYPE_PACKAGE = 512;
    private static final short HEADER_TYPE_RES_TABLE = 2;
    private static final short HEADER_TYPE_STRING_POOL = 1;
    private static final short HEADER_TYPE_TYPE = 513;
    private static final short HEADER_TYPE_TYPE_SPEC = 514;
    private static final String RESOURCE_TYPE_NAME_COLOR = "color";
    private static byte typeIdColor;

    /* renamed from: com.google.android.material.color.ColorResourcesTableCreator$1 */
    class C03101 implements Comparator<ColorResource> {
        C03101() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ColorResource colorResource, ColorResource colorResource2) {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(ColorResource colorResource, ColorResource colorResource2) {
        }
    }

    static class ColorResource {
        private final short entryId;
        private final String name;
        private final byte packageId;
        private final byte typeId;
        private final int value;

        ColorResource(int i, String str, int i2) {
        }

        static /* synthetic */ short access$000(ColorResource colorResource) {
        }

        static /* synthetic */ String access$100(ColorResource colorResource) {
        }

        static /* synthetic */ int access$1400(ColorResource colorResource) {
        }

        static /* synthetic */ byte access$200(ColorResource colorResource) {
        }

        static /* synthetic */ byte access$300(ColorResource colorResource) {
        }
    }

    private static class PackageChunk {
        private static final short HEADER_SIZE = 288;
        private static final int PACKAGE_NAME_MAX_LENGTH = 128;
        private final ResChunkHeader header;
        private final StringPoolChunk keyStrings;
        private final PackageInfo packageInfo;
        private final TypeSpecChunk typeSpecChunk;
        private final StringPoolChunk typeStrings;

        PackageChunk(PackageInfo packageInfo, List<ColorResource> list) {
        }

        int getChunkSize() {
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        }
    }

    static class PackageInfo {
        private final int id;
        private final String name;

        PackageInfo(int i, String str) {
        }

        static /* synthetic */ int access$1000(PackageInfo packageInfo) {
        }

        static /* synthetic */ String access$1100(PackageInfo packageInfo) {
        }
    }

    private static class ResChunkHeader {
        private final int chunkSize;
        private final short headerSize;
        private final short type;

        ResChunkHeader(short s, short s2, int i) {
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        }
    }

    private static class ResEntry {
        private static final byte DATA_TYPE_AARRGGBB = 28;
        private static final short ENTRY_SIZE = 8;
        private static final short FLAG_PUBLIC = 2;
        private static final int SIZE = 16;
        private static final short VALUE_SIZE = 8;
        private final int data;
        private final int keyStringIndex;

        ResEntry(int i, int i2) {
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        }
    }

    private static class ResTable {
        private static final short HEADER_SIZE = 12;
        private final ResChunkHeader header;
        private final List<PackageChunk> packageChunks;
        private final int packageCount;
        private final StringPoolChunk stringPool;

        ResTable(Map<PackageInfo, List<ColorResource>> map) {
        }

        private int getOverallSize() {
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        }
    }

    private static class StringPoolChunk {
        private static final int FLAG_UTF8 = 256;
        private static final short HEADER_SIZE = 28;
        private static final int STYLED_SPAN_LIST_END = -1;
        private final int chunkSize;
        private final ResChunkHeader header;
        private final int stringCount;
        private final List<Integer> stringIndex;
        private final List<byte[]> strings;
        private final int stringsPaddingSize;
        private final int stringsStart;
        private final int styledSpanCount;
        private final List<Integer> styledSpanIndex;
        private final List<List<StringStyledSpan>> styledSpans;
        private final int styledSpansStart;
        private final boolean utf8Encode;

        StringPoolChunk(String... strArr) {
        }

        private Pair<byte[], List<StringStyledSpan>> processString(String str) {
        }

        int getChunkSize() {
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        }

        StringPoolChunk(boolean z, String... strArr) {
        }
    }

    private static class StringStyledSpan {
        private int firstCharacterIndex;
        private int lastCharacterIndex;
        private int nameReference;
        private byte[] styleString;

        private StringStyledSpan() {
        }

        static /* synthetic */ byte[] access$700(StringStyledSpan stringStyledSpan) {
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        }
    }

    private static class TypeChunk {
        private static final byte CONFIG_SIZE = 64;
        private static final short HEADER_SIZE = 84;
        private static final int OFFSET_NO_ENTRY = -1;
        private final byte[] config;
        private final int entryCount;
        private final ResChunkHeader header;
        private final int[] offsetTable;
        private final ResEntry[] resEntries;

        TypeChunk(List<ColorResource> list, Set<Short> set, int i) {
        }

        private int getEntryStart() {
        }

        private int getOffsetTableSize() {
        }

        int getChunkSize() {
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        }
    }

    private static class TypeSpecChunk {
        private static final short HEADER_SIZE = 16;
        private static final int SPEC_PUBLIC = 1073741824;
        private final int entryCount;
        private final int[] entryFlags;
        private final ResChunkHeader header;
        private final TypeChunk typeChunk;

        TypeSpecChunk(List<ColorResource> list) {
        }

        private int getChunkSize() {
        }

        int getChunkSizeWithTypeChunk() {
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        }
    }

    private ColorResourcesTableCreator() {
    }

    static /* synthetic */ byte[] access$1200(char c) {
    }

    static /* synthetic */ byte access$1300() {
    }

    static /* synthetic */ Comparator access$400() {
    }

    static /* synthetic */ byte[] access$500(int i) {
    }

    static /* synthetic */ byte[] access$600(short s) {
    }

    static /* synthetic */ byte[] access$800(String str) {
    }

    static /* synthetic */ byte[] access$900(String str) {
    }

    private static byte[] charToByteArray(char c) {
    }

    static byte[] create(Context context, Map<Integer, Integer> map) throws IOException {
    }

    private static byte[] intToByteArray(int i) {
    }

    private static byte[] shortToByteArray(short s) {
    }

    private static byte[] stringToByteArray(String str) {
    }

    private static byte[] stringToByteArrayUtf8(String str) {
    }
}
