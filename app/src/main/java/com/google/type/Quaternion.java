package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Quaternion extends GeneratedMessageLite<Quaternion, Builder> implements QuaternionOrBuilder {
    private static final Quaternion DEFAULT_INSTANCE = null;
    private static volatile Parser<Quaternion> PARSER = null;
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;
    private double w_;
    private double x_;
    private double y_;
    private double z_;

    /* renamed from: com.google.type.Quaternion$1 */
    static /* synthetic */ class C13751 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f185xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Quaternion, Builder> implements QuaternionOrBuilder {
        /* synthetic */ Builder(C13751 c13751) {
        }

        public Builder clearW() {
        }

        public Builder clearX() {
        }

        public Builder clearY() {
        }

        public Builder clearZ() {
        }

        @Override // com.google.type.QuaternionOrBuilder
        public double getW() {
        }

        @Override // com.google.type.QuaternionOrBuilder
        public double getX() {
        }

        @Override // com.google.type.QuaternionOrBuilder
        public double getY() {
        }

        @Override // com.google.type.QuaternionOrBuilder
        public double getZ() {
        }

        public Builder setW(double d) {
        }

        public Builder setX(double d) {
        }

        public Builder setY(double d) {
        }

        public Builder setZ(double d) {
        }

        private Builder() {
        }
    }

    private Quaternion() {
    }

    static /* synthetic */ Quaternion access$000() {
    }

    static /* synthetic */ void access$100(Quaternion quaternion, double d) {
    }

    static /* synthetic */ void access$200(Quaternion quaternion) {
    }

    static /* synthetic */ void access$300(Quaternion quaternion, double d) {
    }

    static /* synthetic */ void access$400(Quaternion quaternion) {
    }

    static /* synthetic */ void access$500(Quaternion quaternion, double d) {
    }

    static /* synthetic */ void access$600(Quaternion quaternion) {
    }

    static /* synthetic */ void access$700(Quaternion quaternion, double d) {
    }

    static /* synthetic */ void access$800(Quaternion quaternion) {
    }

    private void clearW() {
    }

    private void clearX() {
    }

    private void clearY() {
    }

    private void clearZ() {
    }

    public static Quaternion getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Quaternion> parser() {
    }

    private void setW(double d) {
    }

    private void setX(double d) {
    }

    private void setY(double d) {
    }

    private void setZ(double d) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.QuaternionOrBuilder
    public double getW() {
    }

    @Override // com.google.type.QuaternionOrBuilder
    public double getX() {
    }

    @Override // com.google.type.QuaternionOrBuilder
    public double getY() {
    }

    @Override // com.google.type.QuaternionOrBuilder
    public double getZ() {
    }

    public static Builder newBuilder(Quaternion quaternion) {
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Quaternion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Quaternion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Quaternion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Quaternion parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Quaternion parseFrom(InputStream inputStream) throws IOException {
    }

    public static Quaternion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Quaternion parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Quaternion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
