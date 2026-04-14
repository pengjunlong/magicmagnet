package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DoubleValue extends GeneratedMessageLite<DoubleValue, Builder> implements DoubleValueOrBuilder {
    private static final DoubleValue DEFAULT_INSTANCE = null;
    private static volatile Parser<DoubleValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    /* renamed from: com.google.protobuf.DoubleValue$1 */
    static /* synthetic */ class C12961 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f143xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DoubleValue, Builder> implements DoubleValueOrBuilder {
        /* synthetic */ Builder(C12961 c12961) {
        }

        public Builder clearValue() {
        }

        @Override // com.google.protobuf.DoubleValueOrBuilder
        public double getValue() {
        }

        public Builder setValue(double d) {
        }

        private Builder() {
        }
    }

    private DoubleValue() {
    }

    static /* synthetic */ DoubleValue access$000() {
    }

    static /* synthetic */ void access$100(DoubleValue doubleValue, double d) {
    }

    static /* synthetic */ void access$200(DoubleValue doubleValue) {
    }

    private void clearValue() {
    }

    public static DoubleValue getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static DoubleValue of(double d) {
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<DoubleValue> parser() {
    }

    private void setValue(double d) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.DoubleValueOrBuilder
    public double getValue() {
    }

    public static Builder newBuilder(DoubleValue doubleValue) {
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DoubleValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static DoubleValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DoubleValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static DoubleValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DoubleValue parseFrom(InputStream inputStream) throws IOException {
    }

    public static DoubleValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static DoubleValue parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static DoubleValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
