package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Timestamp extends GeneratedMessageLite<Timestamp, Builder> implements TimestampOrBuilder {
    private static final Timestamp DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Timestamp> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: com.google.protobuf.Timestamp$1 */
    static /* synthetic */ class C13361 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f160xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Timestamp, Builder> implements TimestampOrBuilder {
        /* synthetic */ Builder(C13361 c13361) {
        }

        public Builder clearNanos() {
        }

        public Builder clearSeconds() {
        }

        @Override // com.google.protobuf.TimestampOrBuilder
        public int getNanos() {
        }

        @Override // com.google.protobuf.TimestampOrBuilder
        public long getSeconds() {
        }

        public Builder setNanos(int i) {
        }

        public Builder setSeconds(long j) {
        }

        private Builder() {
        }
    }

    private Timestamp() {
    }

    static /* synthetic */ Timestamp access$000() {
    }

    static /* synthetic */ void access$100(Timestamp timestamp, long j) {
    }

    static /* synthetic */ void access$200(Timestamp timestamp) {
    }

    static /* synthetic */ void access$300(Timestamp timestamp, int i) {
    }

    static /* synthetic */ void access$400(Timestamp timestamp) {
    }

    private void clearNanos() {
    }

    private void clearSeconds() {
    }

    public static Timestamp getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Timestamp> parser() {
    }

    private void setNanos(int i) {
    }

    private void setSeconds(long j) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.TimestampOrBuilder
    public int getNanos() {
    }

    @Override // com.google.protobuf.TimestampOrBuilder
    public long getSeconds() {
    }

    public static Builder newBuilder(Timestamp timestamp) {
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Timestamp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Timestamp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Timestamp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Timestamp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Timestamp parseFrom(InputStream inputStream) throws IOException {
    }

    public static Timestamp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Timestamp parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Timestamp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
