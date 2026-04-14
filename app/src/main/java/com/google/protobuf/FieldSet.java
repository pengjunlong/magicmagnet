package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final FieldSet DEFAULT_INSTANCE = null;
    private final SmallSortedMap<T, Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* renamed from: com.google.protobuf.FieldSet$1 */
    static /* synthetic */ class C13071 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType = null;
    }

    static final class Builder<T extends FieldDescriptorLite<T>> {
        private SmallSortedMap<T, Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        /* synthetic */ Builder(C13071 c13071) {
        }

        private void ensureIsMutable() {
        }

        public static <T extends FieldDescriptorLite<T>> Builder<T> fromFieldSet(FieldSet<T> fieldSet) {
        }

        private void mergeFromField(Map.Entry<T, Object> entry) {
        }

        private static Object replaceBuilder(Object obj) {
        }

        private static <T extends FieldDescriptorLite<T>> void replaceBuilders(SmallSortedMap<T, Object> smallSortedMap) {
        }

        private static void verifyType(WireFormat.FieldType fieldType, Object obj) {
        }

        public void addRepeatedField(T t, Object obj) {
        }

        public FieldSet<T> build() {
        }

        public void clearField(T t) {
        }

        public Map<T, Object> getAllFields() {
        }

        public Object getField(T t) {
        }

        Object getFieldAllowBuilders(T t) {
        }

        public Object getRepeatedField(T t, int i) {
        }

        Object getRepeatedFieldAllowBuilders(T t, int i) {
        }

        public int getRepeatedFieldCount(T t) {
        }

        public boolean hasField(T t) {
        }

        public boolean isInitialized() {
        }

        public void mergeFrom(FieldSet<T> fieldSet) {
        }

        public void setField(T t, Object obj) {
        }

        public void setRepeatedField(T t, int i, Object obj) {
        }

        private Builder() {
        }

        private Builder(SmallSortedMap<T, Object> smallSortedMap) {
        }

        private static <T extends FieldDescriptorLite<T>> void replaceBuilders(Map.Entry<T, Object> entry) {
        }

        private static <T extends FieldDescriptorLite<T>> Object replaceBuilders(T t, Object obj) {
        }
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ FieldSet(SmallSortedMap smallSortedMap, C13071 c13071) {
    }

    static /* synthetic */ SmallSortedMap access$100(SmallSortedMap smallSortedMap, boolean z) {
    }

    static /* synthetic */ boolean access$300(FieldSet fieldSet) {
    }

    static /* synthetic */ boolean access$302(FieldSet fieldSet, boolean z) {
    }

    static /* synthetic */ SmallSortedMap access$400(FieldSet fieldSet) {
    }

    static /* synthetic */ boolean access$500(WireFormat.FieldType fieldType, Object obj) {
    }

    static /* synthetic */ boolean access$600(Map.Entry entry) {
    }

    static /* synthetic */ Object access$700(Object obj) {
    }

    private static <T extends FieldDescriptorLite<T>> SmallSortedMap<T, Object> cloneAllFieldsMap(SmallSortedMap<T, Object> smallSortedMap, boolean z) {
    }

    private static <T extends FieldDescriptorLite<T>> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z) {
    }

    private static Object cloneIfMutable(Object obj) {
    }

    static int computeElementSize(WireFormat.FieldType fieldType, int i, Object obj) {
    }

    static int computeElementSizeNoTag(WireFormat.FieldType fieldType, Object obj) {
    }

    public static int computeFieldSize(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> emptySet() {
    }

    static int getWireFormatForFieldType(WireFormat.FieldType fieldType, boolean z) {
    }

    private static boolean isValidType(WireFormat.FieldType fieldType, Object obj) {
    }

    private void mergeFromField(Map.Entry<T, Object> entry) {
    }

    public static <T extends FieldDescriptorLite<T>> Builder<T> newBuilder() {
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) throws IOException {
    }

    private void verifyType(WireFormat.FieldType fieldType, Object obj) {
    }

    static void writeElement(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
    }

    static void writeElementNoTag(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
    }

    public static void writeField(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
    }

    public void addRepeatedField(T t, Object obj) {
    }

    public void clear() {
    }

    public void clearField(T t) {
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m875clone() throws CloneNotSupportedException {
    }

    Iterator<Map.Entry<T, Object>> descendingIterator() {
    }

    public boolean equals(Object obj) {
    }

    public Map<T, Object> getAllFields() {
    }

    public Object getField(T t) {
    }

    public int getMessageSetSerializedSize() {
    }

    public Object getRepeatedField(T t, int i) {
    }

    public int getRepeatedFieldCount(T t) {
    }

    public int getSerializedSize() {
    }

    public boolean hasField(T t) {
    }

    public int hashCode() {
    }

    boolean isEmpty() {
    }

    public boolean isImmutable() {
    }

    public boolean isInitialized() {
    }

    public Iterator<Map.Entry<T, Object>> iterator() {
    }

    public void makeImmutable() {
    }

    public void mergeFrom(FieldSet<T> fieldSet) {
    }

    public void setField(T t, Object obj) {
    }

    public void setRepeatedField(T t, int i, Object obj) {
    }

    public void writeMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
    }

    private FieldSet() {
    }

    public FieldSet<T> clone() {
    }

    private FieldSet(boolean z) {
    }

    private int getMessageSetSerializedSize(Map.Entry<T, Object> entry) {
    }

    private static <T extends FieldDescriptorLite<T>> boolean isInitialized(Map.Entry<T, Object> entry) {
    }

    private void writeMessageSetTo(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
    }

    private FieldSet(SmallSortedMap<T, Object> smallSortedMap) {
    }
}
