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
public final class GaugeMetadata extends GeneratedMessageLite<GaugeMetadata, Builder> implements GaugeMetadataOrBuilder {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final GaugeMetadata DEFAULT_INSTANCE = null;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile Parser<GaugeMetadata> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_;

    /* renamed from: com.google.firebase.perf.v1.GaugeMetadata$1 */
    static /* synthetic */ class C11861 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f120xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<GaugeMetadata, Builder> implements GaugeMetadataOrBuilder {
        /* synthetic */ Builder(C11861 c11861) {
        }

        public Builder clearCpuClockRateKhz() {
        }

        public Builder clearCpuProcessorCount() {
        }

        public Builder clearDeviceRamSizeKb() {
        }

        public Builder clearMaxAppJavaHeapMemoryKb() {
        }

        public Builder clearMaxEncouragedAppJavaHeapMemoryKb() {
        }

        public Builder clearProcessName() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getCpuClockRateKhz() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getCpuProcessorCount() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getDeviceRamSizeKb() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getMaxAppJavaHeapMemoryKb() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getMaxEncouragedAppJavaHeapMemoryKb() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public String getProcessName() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public ByteString getProcessNameBytes() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasCpuClockRateKhz() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasCpuProcessorCount() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasDeviceRamSizeKb() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasMaxAppJavaHeapMemoryKb() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasMaxEncouragedAppJavaHeapMemoryKb() {
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasProcessName() {
        }

        public Builder setCpuClockRateKhz(int i) {
        }

        public Builder setCpuProcessorCount(int i) {
        }

        public Builder setDeviceRamSizeKb(int i) {
        }

        public Builder setMaxAppJavaHeapMemoryKb(int i) {
        }

        public Builder setMaxEncouragedAppJavaHeapMemoryKb(int i) {
        }

        public Builder setProcessName(String str) {
        }

        public Builder setProcessNameBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private GaugeMetadata() {
    }

    static /* synthetic */ GaugeMetadata access$000() {
    }

    static /* synthetic */ void access$100(GaugeMetadata gaugeMetadata, String str) {
    }

    static /* synthetic */ void access$1000(GaugeMetadata gaugeMetadata, int i) {
    }

    static /* synthetic */ void access$1100(GaugeMetadata gaugeMetadata) {
    }

    static /* synthetic */ void access$1200(GaugeMetadata gaugeMetadata, int i) {
    }

    static /* synthetic */ void access$1300(GaugeMetadata gaugeMetadata) {
    }

    static /* synthetic */ void access$200(GaugeMetadata gaugeMetadata) {
    }

    static /* synthetic */ void access$300(GaugeMetadata gaugeMetadata, ByteString byteString) {
    }

    static /* synthetic */ void access$400(GaugeMetadata gaugeMetadata, int i) {
    }

    static /* synthetic */ void access$500(GaugeMetadata gaugeMetadata) {
    }

    static /* synthetic */ void access$600(GaugeMetadata gaugeMetadata, int i) {
    }

    static /* synthetic */ void access$700(GaugeMetadata gaugeMetadata) {
    }

    static /* synthetic */ void access$800(GaugeMetadata gaugeMetadata, int i) {
    }

    static /* synthetic */ void access$900(GaugeMetadata gaugeMetadata) {
    }

    private void clearCpuClockRateKhz() {
    }

    private void clearCpuProcessorCount() {
    }

    private void clearDeviceRamSizeKb() {
    }

    private void clearMaxAppJavaHeapMemoryKb() {
    }

    private void clearMaxEncouragedAppJavaHeapMemoryKb() {
    }

    private void clearProcessName() {
    }

    public static GaugeMetadata getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static GaugeMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static GaugeMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<GaugeMetadata> parser() {
    }

    private void setCpuClockRateKhz(int i) {
    }

    private void setCpuProcessorCount(int i) {
    }

    private void setDeviceRamSizeKb(int i) {
    }

    private void setMaxAppJavaHeapMemoryKb(int i) {
    }

    private void setMaxEncouragedAppJavaHeapMemoryKb(int i) {
    }

    private void setProcessName(String str) {
    }

    private void setProcessNameBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getCpuClockRateKhz() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getCpuProcessorCount() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getDeviceRamSizeKb() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getMaxAppJavaHeapMemoryKb() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getMaxEncouragedAppJavaHeapMemoryKb() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public String getProcessName() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public ByteString getProcessNameBytes() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasCpuClockRateKhz() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasCpuProcessorCount() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasDeviceRamSizeKb() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasMaxAppJavaHeapMemoryKb() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasMaxEncouragedAppJavaHeapMemoryKb() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasProcessName() {
    }

    public static Builder newBuilder(GaugeMetadata gaugeMetadata) {
    }

    public static GaugeMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static GaugeMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static GaugeMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static GaugeMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static GaugeMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static GaugeMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static GaugeMetadata parseFrom(InputStream inputStream) throws IOException {
    }

    public static GaugeMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static GaugeMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static GaugeMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
