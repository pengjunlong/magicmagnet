package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int[] EMPTY_INT_ARRAY = null;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private static final Unsafe UNSAFE = null;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;

    /* renamed from: com.google.protobuf.MessageSchema$1 */
    static /* synthetic */ class C13191 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
    }

    private boolean arePresentForEquals(T t, T t2, int i) {
    }

    private static <T> boolean booleanAt(T t, long j) {
    }

    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
    }

    private static <T> double doubleAt(T t, long j) {
    }

    private final <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
    }

    private final <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
    }

    private static <T> float floatAt(T t, long j) {
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
    }

    private Object getMapFieldDefaultEntry(int i) {
    }

    private Schema getMessageFieldSchema(int i) {
    }

    static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
    }

    private int getSerializedSizeProto2(T t) {
    }

    private int getSerializedSizeProto3(T t) {
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
    }

    private static <T> int intAt(T t, long j) {
    }

    private static boolean isEnforceUtf8(int i) {
    }

    private boolean isFieldPresent(T t, int i, int i2, int i3, int i4) {
    }

    private <N> boolean isListInitialized(Object obj, int i, int i2) {
    }

    private boolean isMapInitialized(T t, int i, int i2) {
    }

    private boolean isOneofCaseEqual(T t, T t2, int i) {
    }

    private boolean isOneofPresent(T t, int i, int i2) {
    }

    private static boolean isRequired(int i) {
    }

    private static List<?> listAt(Object obj, long j) {
    }

    private static <T> long longAt(T t, long j) {
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
    }

    private void mergeMessage(T t, T t2, int i) {
    }

    private void mergeOneofMessage(T t, T t2, int i) {
    }

    private void mergeSingleField(T t, T t2, int i) {
    }

    static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
    }

    static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
    }

    static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
    }

    private int numberAt(int i) {
    }

    private static long offset(int i) {
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
    }

    private static <T> double oneofDoubleAt(T t, long j) {
    }

    private static <T> float oneofFloatAt(T t, long j) {
    }

    private static <T> int oneofIntAt(T t, long j) {
    }

    private static <T> long oneofLongAt(T t, long j) {
    }

    private <K, V> int parseMapField(T t, byte[] bArr, int i, int i2, int i3, long j, ArrayDecoders.Registers registers) throws IOException {
    }

    private int parseOneofField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ArrayDecoders.Registers registers) throws IOException {
    }

    private int parseProto3Message(T t, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) throws IOException {
    }

    private int parseRepeatedField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ArrayDecoders.Registers registers) throws IOException {
    }

    private int positionForFieldNumber(int i) {
    }

    private int presenceMaskAndOffsetAt(int i) {
    }

    private <E> void readGroupList(Object obj, long j, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private <E> void readMessageList(Object obj, int i, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    private void readString(Object obj, int i, Reader reader) throws IOException {
    }

    private void readStringList(Object obj, int i, Reader reader) throws IOException {
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
    }

    private void setFieldPresent(T t, int i) {
    }

    private void setOneofPresent(T t, int i, int i2) {
    }

    private int slowPositionForFieldNumber(int i, int i2) {
    }

    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i, Object[] objArr) {
    }

    private static int type(int i) {
    }

    private int typeAndOffsetAt(int i) {
    }

    private void writeFieldsInAscendingOrderProto2(T t, Writer writer) throws IOException {
    }

    private void writeFieldsInAscendingOrderProto3(T t, Writer writer) throws IOException {
    }

    private void writeFieldsInDescendingOrder(T t, Writer writer) throws IOException {
    }

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj, int i2) throws IOException {
    }

    private void writeString(int i, Object obj, Writer writer) throws IOException {
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) throws IOException {
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t, T t2) {
    }

    int getSchemaSize() {
    }

    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t) {
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t) {
    }

    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t) {
    }

    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t) {
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, T t2) {
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
    }

    int parseProto2Message(T t, byte[] bArr, int i, int i2, int i3, ArrayDecoders.Registers registers) throws IOException {
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t, Writer writer) throws IOException {
    }

    private boolean isFieldPresent(T t, int i) {
    }

    private int positionForFieldNumber(int i, int i2) {
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) throws IOException {
    }

    private boolean equals(T t, T t2, int i) {
    }

    private static boolean isInitialized(Object obj, int i, Schema schema) {
    }
}
