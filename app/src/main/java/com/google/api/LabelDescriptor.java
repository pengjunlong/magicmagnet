package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class LabelDescriptor extends GeneratedMessageLite<LabelDescriptor, Builder> implements LabelDescriptorOrBuilder {
    private static final LabelDescriptor DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<LabelDescriptor> PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private String description_;
    private String key_;
    private int valueType_;

    /* renamed from: com.google.api.LabelDescriptor$1 */
    static /* synthetic */ class C05691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f69xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LabelDescriptor, Builder> implements LabelDescriptorOrBuilder {
        /* synthetic */ Builder(C05691 c05691) {
        }

        public Builder clearDescription() {
        }

        public Builder clearKey() {
        }

        public Builder clearValueType() {
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public String getDescription() {
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public String getKey() {
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public ByteString getKeyBytes() {
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public ValueType getValueType() {
        }

        @Override // com.google.api.LabelDescriptorOrBuilder
        public int getValueTypeValue() {
        }

        public Builder setDescription(String str) {
        }

        public Builder setDescriptionBytes(ByteString byteString) {
        }

        public Builder setKey(String str) {
        }

        public Builder setKeyBytes(ByteString byteString) {
        }

        public Builder setValueType(ValueType valueType) {
        }

        public Builder setValueTypeValue(int i) {
        }

        private Builder() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class ValueType implements Internal.EnumLite {
        private static final /* synthetic */ ValueType[] $VALUES = null;
        public static final ValueType BOOL = null;
        public static final int BOOL_VALUE = 1;
        public static final ValueType INT64 = null;
        public static final int INT64_VALUE = 2;
        public static final ValueType STRING = null;
        public static final int STRING_VALUE = 0;
        public static final ValueType UNRECOGNIZED = null;
        private static final Internal.EnumLiteMap<ValueType> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.api.LabelDescriptor$ValueType$1 */
        class C05701 implements Internal.EnumLiteMap<ValueType> {
            C05701() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ ValueType findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ValueType findValueByNumber(int i) {
            }
        }

        private static final class ValueTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private ValueTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private ValueType(String str, int i, int i2) {
        }

        public static ValueType forNumber(int i) {
        }

        public static Internal.EnumLiteMap<ValueType> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static ValueType valueOf(String str) {
        }

        public static ValueType[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static ValueType valueOf(int i) {
        }
    }

    private LabelDescriptor() {
    }

    static /* synthetic */ LabelDescriptor access$000() {
    }

    static /* synthetic */ void access$100(LabelDescriptor labelDescriptor, String str) {
    }

    static /* synthetic */ void access$200(LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$300(LabelDescriptor labelDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$400(LabelDescriptor labelDescriptor, int i) {
    }

    static /* synthetic */ void access$500(LabelDescriptor labelDescriptor, ValueType valueType) {
    }

    static /* synthetic */ void access$600(LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$700(LabelDescriptor labelDescriptor, String str) {
    }

    static /* synthetic */ void access$800(LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$900(LabelDescriptor labelDescriptor, ByteString byteString) {
    }

    private void clearDescription() {
    }

    private void clearKey() {
    }

    private void clearValueType() {
    }

    public static LabelDescriptor getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<LabelDescriptor> parser() {
    }

    private void setDescription(String str) {
    }

    private void setDescriptionBytes(ByteString byteString) {
    }

    private void setKey(String str) {
    }

    private void setKeyBytes(ByteString byteString) {
    }

    private void setValueType(ValueType valueType) {
    }

    private void setValueTypeValue(int i) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public String getDescription() {
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public ByteString getDescriptionBytes() {
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public String getKey() {
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public ByteString getKeyBytes() {
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public ValueType getValueType() {
    }

    @Override // com.google.api.LabelDescriptorOrBuilder
    public int getValueTypeValue() {
    }

    public static Builder newBuilder(LabelDescriptor labelDescriptor) {
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LabelDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static LabelDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LabelDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static LabelDescriptor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LabelDescriptor parseFrom(InputStream inputStream) throws IOException {
    }

    public static LabelDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static LabelDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static LabelDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
