package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Duration extends GeneratedMessageLite<Duration, Builder> implements DurationOrBuilder {
    private static final Duration DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Duration> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* renamed from: com.google.protobuf.Duration$1 */
    static /* synthetic */ class C12971 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f144xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Duration, Builder> implements DurationOrBuilder {
        /* synthetic */ Builder(C12971 c12971) {
        }

        public Builder clearNanos() {
        }

        public Builder clearSeconds() {
        }

        @Override // com.google.protobuf.DurationOrBuilder
        public int getNanos() {
        }

        @Override // com.google.protobuf.DurationOrBuilder
        public long getSeconds() {
        }

        public Builder setNanos(int i) {
        }

        public Builder setSeconds(long j) {
        }

        private Builder() {
        }
    }

    private Duration() {
    }

    static /* synthetic */ Duration access$000() {
    }

    static /* synthetic */ void access$100(Duration duration, long j) {
    }

    static /* synthetic */ void access$200(Duration duration) {
    }

    static /* synthetic */ void access$300(Duration duration, int i) {
    }

    static /* synthetic */ void access$400(Duration duration) {
    }

    private void clearNanos() {
    }

    private void clearSeconds() {
    }

    public static Duration getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Duration parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Duration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Duration> parser() {
    }

    private void setNanos(int i) {
    }

    private void setSeconds(long j) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.DurationOrBuilder
    public int getNanos() {
    }

    @Override // com.google.protobuf.DurationOrBuilder
    public long getSeconds() {
    }

    public static Builder newBuilder(Duration duration) {
    }

    public static Duration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Duration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Duration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Duration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Duration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Duration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Duration parseFrom(InputStream inputStream) throws IOException {
    }

    public static Duration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Duration parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Duration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
