package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = null;
    private static final UnknownFieldSchema<?, ?> PROTO2_UNKNOWN_FIELD_SET_SCHEMA = null;
    private static final UnknownFieldSchema<?, ?> PROTO3_UNKNOWN_FIELD_SET_SCHEMA = null;
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = null;

    private SchemaUtil() {
    }

    static int computeSizeBoolList(int i, List<?> list, boolean z) {
    }

    static int computeSizeBoolListNoTag(List<?> list) {
    }

    static int computeSizeByteStringList(int i, List<ByteString> list) {
    }

    static int computeSizeEnumList(int i, List<Integer> list, boolean z) {
    }

    static int computeSizeEnumListNoTag(List<Integer> list) {
    }

    static int computeSizeFixed32List(int i, List<?> list, boolean z) {
    }

    static int computeSizeFixed32ListNoTag(List<?> list) {
    }

    static int computeSizeFixed64List(int i, List<?> list, boolean z) {
    }

    static int computeSizeFixed64ListNoTag(List<?> list) {
    }

    static int computeSizeGroupList(int i, List<MessageLite> list) {
    }

    static int computeSizeInt32List(int i, List<Integer> list, boolean z) {
    }

    static int computeSizeInt32ListNoTag(List<Integer> list) {
    }

    static int computeSizeInt64List(int i, List<Long> list, boolean z) {
    }

    static int computeSizeInt64ListNoTag(List<Long> list) {
    }

    static int computeSizeMessage(int i, Object obj, Schema schema) {
    }

    static int computeSizeMessageList(int i, List<?> list) {
    }

    static int computeSizeSInt32List(int i, List<Integer> list, boolean z) {
    }

    static int computeSizeSInt32ListNoTag(List<Integer> list) {
    }

    static int computeSizeSInt64List(int i, List<Long> list, boolean z) {
    }

    static int computeSizeSInt64ListNoTag(List<Long> list) {
    }

    static int computeSizeStringList(int i, List<?> list) {
    }

    static int computeSizeUInt32List(int i, List<Integer> list, boolean z) {
    }

    static int computeSizeUInt32ListNoTag(List<Integer> list) {
    }

    static int computeSizeUInt64List(int i, List<Long> list, boolean z) {
    }

    static int computeSizeUInt64ListNoTag(List<Long> list) {
    }

    static <UT, UB> UB filterUnknownEnumList(int i, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
    }

    private static Class<?> getGeneratedMessageClass() {
    }

    static Object getMapDefaultEntry(Class<?> cls, String str) {
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema(boolean z) {
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
    }

    static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t, T t2) {
    }

    static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t, T t2, long j) {
    }

    static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, T t2) {
    }

    public static UnknownFieldSchema<?, ?> proto2UnknownFieldSetSchema() {
    }

    public static UnknownFieldSchema<?, ?> proto3UnknownFieldSetSchema() {
    }

    public static void requireGeneratedMessage(Class<?> cls) {
    }

    static boolean safeEquals(Object obj, Object obj2) {
    }

    public static boolean shouldUseTableSwitch(int i, int i2, int i3) {
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
    }

    static <UT, UB> UB storeUnknownEnum(int i, int i2, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
    }

    static String toCamelCase(String str, boolean z) {
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
    }

    public static void writeBool(int i, boolean z, Writer writer) throws IOException {
    }

    public static void writeBoolList(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeBytes(int i, ByteString byteString, Writer writer) throws IOException {
    }

    public static void writeBytesList(int i, List<ByteString> list, Writer writer) throws IOException {
    }

    public static void writeDouble(int i, double d, Writer writer) throws IOException {
    }

    public static void writeDoubleList(int i, List<Double> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeEnum(int i, int i2, Writer writer) throws IOException {
    }

    public static void writeEnumList(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeFixed32(int i, int i2, Writer writer) throws IOException {
    }

    public static void writeFixed32List(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeFixed64(int i, long j, Writer writer) throws IOException {
    }

    public static void writeFixed64List(int i, List<Long> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeFloat(int i, float f, Writer writer) throws IOException {
    }

    public static void writeFloatList(int i, List<Float> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeGroupList(int i, List<?> list, Writer writer) throws IOException {
    }

    public static void writeInt32(int i, int i2, Writer writer) throws IOException {
    }

    public static void writeInt32List(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeInt64(int i, long j, Writer writer) throws IOException {
    }

    public static void writeInt64List(int i, List<Long> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeLazyFieldList(int i, List<?> list, Writer writer) throws IOException {
    }

    public static void writeMessage(int i, Object obj, Writer writer) throws IOException {
    }

    public static void writeMessageList(int i, List<?> list, Writer writer) throws IOException {
    }

    public static void writeSFixed32(int i, int i2, Writer writer) throws IOException {
    }

    public static void writeSFixed32List(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeSFixed64(int i, long j, Writer writer) throws IOException {
    }

    public static void writeSFixed64List(int i, List<Long> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeSInt32(int i, int i2, Writer writer) throws IOException {
    }

    public static void writeSInt32List(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeSInt64(int i, long j, Writer writer) throws IOException {
    }

    public static void writeSInt64List(int i, List<Long> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeString(int i, Object obj, Writer writer) throws IOException {
    }

    private static void writeStringInternal(int i, String str, Writer writer) throws IOException {
    }

    public static void writeStringList(int i, List<String> list, Writer writer) throws IOException {
    }

    public static void writeUInt32(int i, int i2, Writer writer) throws IOException {
    }

    public static void writeUInt32List(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
    }

    public static void writeUInt64(int i, long j, Writer writer) throws IOException {
    }

    public static void writeUInt64List(int i, List<Long> list, Writer writer, boolean z) throws IOException {
    }

    static int computeSizeGroupList(int i, List<MessageLite> list, Schema schema) {
    }

    public static void writeGroupList(int i, List<?> list, Writer writer, Schema schema) throws IOException {
    }

    public static void writeMessageList(int i, List<?> list, Writer writer, Schema schema) throws IOException {
    }

    static int computeSizeMessageList(int i, List<?> list, Schema schema) {
    }

    static <UT, UB> UB filterUnknownEnumList(int i, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
    }
}
