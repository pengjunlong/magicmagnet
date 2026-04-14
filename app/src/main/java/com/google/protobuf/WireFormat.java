package com.google.protobuf;

import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class WireFormat {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_ITEM_END_TAG = 0;
    static final int MESSAGE_SET_ITEM_TAG = 0;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_MESSAGE_TAG = 0;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int MESSAGE_SET_TYPE_ID_TAG = 0;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;

    /* renamed from: com.google.protobuf.WireFormat$1 */
    static /* synthetic */ class C13441 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static class FieldType {
        private static final /* synthetic */ FieldType[] $VALUES = null;
        public static final FieldType BOOL = null;
        public static final FieldType BYTES = null;
        public static final FieldType DOUBLE = null;
        public static final FieldType ENUM = null;
        public static final FieldType FIXED32 = null;
        public static final FieldType FIXED64 = null;
        public static final FieldType FLOAT = null;
        public static final FieldType GROUP = null;
        public static final FieldType INT32 = null;
        public static final FieldType INT64 = null;
        public static final FieldType MESSAGE = null;
        public static final FieldType SFIXED32 = null;
        public static final FieldType SFIXED64 = null;
        public static final FieldType SINT32 = null;
        public static final FieldType SINT64 = null;
        public static final FieldType STRING = null;
        public static final FieldType UINT32 = null;
        public static final FieldType UINT64 = null;
        private final JavaType javaType;
        private final int wireType;

        /* renamed from: com.google.protobuf.WireFormat$FieldType$1 */
        enum C13451 extends FieldType {
            C13451(String str, int i, JavaType javaType, int i2) {
            }

            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
            }
        }

        /* renamed from: com.google.protobuf.WireFormat$FieldType$2 */
        enum C13462 extends FieldType {
            C13462(String str, int i, JavaType javaType, int i2) {
            }

            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
            }
        }

        /* renamed from: com.google.protobuf.WireFormat$FieldType$3 */
        enum C13473 extends FieldType {
            C13473(String str, int i, JavaType javaType, int i2) {
            }

            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
            }
        }

        /* renamed from: com.google.protobuf.WireFormat$FieldType$4 */
        enum C13484 extends FieldType {
            C13484(String str, int i, JavaType javaType, int i2) {
            }

            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
            }
        }

        /* synthetic */ FieldType(String str, int i, JavaType javaType, int i2, C13441 c13441) {
        }

        public static FieldType valueOf(String str) {
        }

        public static FieldType[] values() {
        }

        public JavaType getJavaType() {
        }

        public int getWireType() {
        }

        public boolean isPackable() {
        }

        private FieldType(String str, int i, JavaType javaType, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class JavaType {
        private static final /* synthetic */ JavaType[] $VALUES = null;
        public static final JavaType BOOLEAN = null;
        public static final JavaType BYTE_STRING = null;
        public static final JavaType DOUBLE = null;
        public static final JavaType ENUM = null;
        public static final JavaType FLOAT = null;
        public static final JavaType INT = null;
        public static final JavaType LONG = null;
        public static final JavaType MESSAGE = null;
        public static final JavaType STRING = null;
        private final Object defaultDefault;

        private JavaType(String str, int i, Object obj) {
        }

        public static JavaType valueOf(String str) {
        }

        public static JavaType[] values() {
        }

        Object getDefaultDefault() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static abstract class Utf8Validation {
        private static final /* synthetic */ Utf8Validation[] $VALUES = null;
        public static final Utf8Validation LAZY = null;
        public static final Utf8Validation LOOSE = null;
        public static final Utf8Validation STRICT = null;

        /* renamed from: com.google.protobuf.WireFormat$Utf8Validation$1 */
        enum C13491 extends Utf8Validation {
            C13491(String str, int i) {
            }

            @Override // com.google.protobuf.WireFormat.Utf8Validation
            Object readString(CodedInputStream codedInputStream) throws IOException {
            }
        }

        /* renamed from: com.google.protobuf.WireFormat$Utf8Validation$2 */
        enum C13502 extends Utf8Validation {
            C13502(String str, int i) {
            }

            @Override // com.google.protobuf.WireFormat.Utf8Validation
            Object readString(CodedInputStream codedInputStream) throws IOException {
            }
        }

        /* renamed from: com.google.protobuf.WireFormat$Utf8Validation$3 */
        enum C13513 extends Utf8Validation {
            C13513(String str, int i) {
            }

            @Override // com.google.protobuf.WireFormat.Utf8Validation
            Object readString(CodedInputStream codedInputStream) throws IOException {
            }
        }

        private Utf8Validation(String str, int i) {
        }

        public static Utf8Validation valueOf(String str) {
        }

        public static Utf8Validation[] values() {
        }

        abstract Object readString(CodedInputStream codedInputStream) throws IOException;

        /* synthetic */ Utf8Validation(String str, int i, C13441 c13441) {
        }
    }

    private WireFormat() {
    }

    public static int getTagFieldNumber(int i) {
    }

    public static int getTagWireType(int i) {
    }

    static int makeTag(int i, int i2) {
    }

    static Object readPrimitiveField(CodedInputStream codedInputStream, FieldType fieldType, Utf8Validation utf8Validation) throws IOException {
    }
}
