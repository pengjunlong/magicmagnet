package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class RetryInfo extends GeneratedMessageLite<RetryInfo, Builder> implements RetryInfoOrBuilder {
    private static final RetryInfo DEFAULT_INSTANCE = null;
    private static volatile Parser<RetryInfo> PARSER = null;
    public static final int RETRY_DELAY_FIELD_NUMBER = 1;
    private Duration retryDelay_;

    /* renamed from: com.google.rpc.RetryInfo$1 */
    static /* synthetic */ class C13621 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f174xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RetryInfo, Builder> implements RetryInfoOrBuilder {
        /* synthetic */ Builder(C13621 c13621) {
        }

        public Builder clearRetryDelay() {
        }

        @Override // com.google.rpc.RetryInfoOrBuilder
        public Duration getRetryDelay() {
        }

        @Override // com.google.rpc.RetryInfoOrBuilder
        public boolean hasRetryDelay() {
        }

        public Builder mergeRetryDelay(Duration duration) {
        }

        public Builder setRetryDelay(Duration duration) {
        }

        private Builder() {
        }

        public Builder setRetryDelay(Duration.Builder builder) {
        }
    }

    private RetryInfo() {
    }

    static /* synthetic */ RetryInfo access$000() {
    }

    static /* synthetic */ void access$100(RetryInfo retryInfo, Duration duration) {
    }

    static /* synthetic */ void access$200(RetryInfo retryInfo, Duration duration) {
    }

    static /* synthetic */ void access$300(RetryInfo retryInfo) {
    }

    private void clearRetryDelay() {
    }

    public static RetryInfo getDefaultInstance() {
    }

    private void mergeRetryDelay(Duration duration) {
    }

    public static Builder newBuilder() {
    }

    public static RetryInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static RetryInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<RetryInfo> parser() {
    }

    private void setRetryDelay(Duration duration) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.RetryInfoOrBuilder
    public Duration getRetryDelay() {
    }

    @Override // com.google.rpc.RetryInfoOrBuilder
    public boolean hasRetryDelay() {
    }

    public static Builder newBuilder(RetryInfo retryInfo) {
    }

    public static RetryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static RetryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static RetryInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static RetryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static RetryInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static RetryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static RetryInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static RetryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static RetryInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static RetryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
