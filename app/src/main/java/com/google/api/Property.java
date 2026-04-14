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
public final class Property extends GeneratedMessageLite<Property, Builder> implements PropertyOrBuilder {
    private static final Property DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Property> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String description_;
    private String name_;
    private int type_;

    /* renamed from: com.google.api.Property$1 */
    static /* synthetic */ class C05861 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f82xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Property, Builder> implements PropertyOrBuilder {
        /* synthetic */ Builder(C05861 c05861) {
        }

        public Builder clearDescription() {
        }

        public Builder clearName() {
        }

        public Builder clearType() {
        }

        @Override // com.google.api.PropertyOrBuilder
        public String getDescription() {
        }

        @Override // com.google.api.PropertyOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.api.PropertyOrBuilder
        public String getName() {
        }

        @Override // com.google.api.PropertyOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.api.PropertyOrBuilder
        public PropertyType getType() {
        }

        @Override // com.google.api.PropertyOrBuilder
        public int getTypeValue() {
        }

        public Builder setDescription(String str) {
        }

        public Builder setDescriptionBytes(ByteString byteString) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setType(PropertyType propertyType) {
        }

        public Builder setTypeValue(int i) {
        }

        private Builder() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class PropertyType implements Internal.EnumLite {
        private static final /* synthetic */ PropertyType[] $VALUES = null;
        public static final PropertyType BOOL = null;
        public static final int BOOL_VALUE = 2;
        public static final PropertyType DOUBLE = null;
        public static final int DOUBLE_VALUE = 4;
        public static final PropertyType INT64 = null;
        public static final int INT64_VALUE = 1;
        public static final PropertyType STRING = null;
        public static final int STRING_VALUE = 3;
        public static final PropertyType UNRECOGNIZED = null;
        public static final PropertyType UNSPECIFIED = null;
        public static final int UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<PropertyType> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.api.Property$PropertyType$1 */
        class C05871 implements Internal.EnumLiteMap<PropertyType> {
            C05871() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ PropertyType findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public PropertyType findValueByNumber(int i) {
            }
        }

        private static final class PropertyTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private PropertyTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private PropertyType(String str, int i, int i2) {
        }

        public static PropertyType forNumber(int i) {
        }

        public static Internal.EnumLiteMap<PropertyType> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static PropertyType valueOf(String str) {
        }

        public static PropertyType[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static PropertyType valueOf(int i) {
        }
    }

    private Property() {
    }

    static /* synthetic */ Property access$000() {
    }

    static /* synthetic */ void access$100(Property property, String str) {
    }

    static /* synthetic */ void access$200(Property property) {
    }

    static /* synthetic */ void access$300(Property property, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Property property, int i) {
    }

    static /* synthetic */ void access$500(Property property, PropertyType propertyType) {
    }

    static /* synthetic */ void access$600(Property property) {
    }

    static /* synthetic */ void access$700(Property property, String str) {
    }

    static /* synthetic */ void access$800(Property property) {
    }

    static /* synthetic */ void access$900(Property property, ByteString byteString) {
    }

    private void clearDescription() {
    }

    private void clearName() {
    }

    private void clearType() {
    }

    public static Property getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Property parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Property parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Property> parser() {
    }

    private void setDescription(String str) {
    }

    private void setDescriptionBytes(ByteString byteString) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setType(PropertyType propertyType) {
    }

    private void setTypeValue(int i) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.PropertyOrBuilder
    public String getDescription() {
    }

    @Override // com.google.api.PropertyOrBuilder
    public ByteString getDescriptionBytes() {
    }

    @Override // com.google.api.PropertyOrBuilder
    public String getName() {
    }

    @Override // com.google.api.PropertyOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.api.PropertyOrBuilder
    public PropertyType getType() {
    }

    @Override // com.google.api.PropertyOrBuilder
    public int getTypeValue() {
    }

    public static Builder newBuilder(Property property) {
    }

    public static Property parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Property parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Property parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Property parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Property parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Property parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Property parseFrom(InputStream inputStream) throws IOException {
    }

    public static Property parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Property parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Property parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
