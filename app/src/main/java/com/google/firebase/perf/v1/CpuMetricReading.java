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
public final class CpuMetricReading extends GeneratedMessageLite<CpuMetricReading, Builder> implements CpuMetricReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final CpuMetricReading DEFAULT_INSTANCE = null;
    private static volatile Parser<CpuMetricReading> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* renamed from: com.google.firebase.perf.v1.CpuMetricReading$1 */
    static /* synthetic */ class C11851 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f119xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CpuMetricReading, Builder> implements CpuMetricReadingOrBuilder {
        /* synthetic */ Builder(C11851 c11851) {
        }

        public Builder clearClientTimeUs() {
        }

        public Builder clearSystemTimeUs() {
        }

        public Builder clearUserTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public long getClientTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public long getSystemTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public long getUserTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public boolean hasClientTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public boolean hasSystemTimeUs() {
        }

        @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
        public boolean hasUserTimeUs() {
        }

        public Builder setClientTimeUs(long j) {
        }

        public Builder setSystemTimeUs(long j) {
        }

        public Builder setUserTimeUs(long j) {
        }

        private Builder() {
        }
    }

    private CpuMetricReading() {
    }

    static /* synthetic */ CpuMetricReading access$000() {
    }

    static /* synthetic */ void access$100(CpuMetricReading cpuMetricReading, long j) {
    }

    static /* synthetic */ void access$200(CpuMetricReading cpuMetricReading) {
    }

    static /* synthetic */ void access$300(CpuMetricReading cpuMetricReading, long j) {
    }

    static /* synthetic */ void access$400(CpuMetricReading cpuMetricReading) {
    }

    static /* synthetic */ void access$500(CpuMetricReading cpuMetricReading, long j) {
    }

    static /* synthetic */ void access$600(CpuMetricReading cpuMetricReading) {
    }

    private void clearClientTimeUs() {
    }

    private void clearSystemTimeUs() {
    }

    private void clearUserTimeUs() {
    }

    public static CpuMetricReading getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<CpuMetricReading> parser() {
    }

    private void setClientTimeUs(long j) {
    }

    private void setSystemTimeUs(long j) {
    }

    private void setUserTimeUs(long j) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public long getClientTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public long getSystemTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public long getUserTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public boolean hasClientTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public boolean hasSystemTimeUs() {
    }

    @Override // com.google.firebase.perf.v1.CpuMetricReadingOrBuilder
    public boolean hasUserTimeUs() {
    }

    public static Builder newBuilder(CpuMetricReading cpuMetricReading) {
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static CpuMetricReading parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static CpuMetricReading parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static CpuMetricReading parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static CpuMetricReading parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static CpuMetricReading parseFrom(InputStream inputStream) throws IOException {
    }

    public static CpuMetricReading parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static CpuMetricReading parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static CpuMetricReading parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
