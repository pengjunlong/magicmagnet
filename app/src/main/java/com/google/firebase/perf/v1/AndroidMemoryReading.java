package com.google.firebase.perf.v1;

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
public final class AndroidMemoryReading extends GeneratedMessageLite<AndroidMemoryReading, Builder> implements AndroidMemoryReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final AndroidMemoryReading DEFAULT_INSTANCE = null;
    private static volatile Parser<AndroidMemoryReading> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* renamed from: com.google.firebase.perf.v1.AndroidMemoryReading$1 */
    static /* synthetic */ class C11821 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f117xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AndroidMemoryReading, Builder> implements AndroidMemoryReadingOrBuilder {
        /* synthetic */ Builder(C11821 c11821) {
        }

        public Builder clearClientTimeUs() {
        }

        public Builder clearUsedAppJavaHeapMemoryKb() {
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public long getClientTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public int getUsedAppJavaHeapMemoryKb() {
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public boolean hasClientTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
        public boolean hasUsedAppJavaHeapMemoryKb() {
        }

        public Builder setClientTimeUs(long j) {
        }

        public Builder setUsedAppJavaHeapMemoryKb(int i) {
        }

        private Builder() {
        }
    }

    private AndroidMemoryReading() {
    }

    static /* synthetic */ AndroidMemoryReading access$000() {
    }

    static /* synthetic */ void access$100(AndroidMemoryReading androidMemoryReading, long j) {
    }

    static /* synthetic */ void access$200(AndroidMemoryReading androidMemoryReading) {
    }

    static /* synthetic */ void access$300(AndroidMemoryReading androidMemoryReading, int i) {
    }

    static /* synthetic */ void access$400(AndroidMemoryReading androidMemoryReading) {
    }

    private void clearClientTimeUs() {
    }

    private void clearUsedAppJavaHeapMemoryKb() {
    }

    public static AndroidMemoryReading getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<AndroidMemoryReading> parser() {
    }

    private void setClientTimeUs(long j) {
    }

    private void setUsedAppJavaHeapMemoryKb(int i) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public long getClientTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public int getUsedAppJavaHeapMemoryKb() {
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public boolean hasClientTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder
    public boolean hasUsedAppJavaHeapMemoryKb() {
    }

    public static Builder newBuilder(AndroidMemoryReading androidMemoryReading) {
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AndroidMemoryReading parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static AndroidMemoryReading parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AndroidMemoryReading parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static AndroidMemoryReading parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream) throws IOException {
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AndroidMemoryReading parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static AndroidMemoryReading parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
