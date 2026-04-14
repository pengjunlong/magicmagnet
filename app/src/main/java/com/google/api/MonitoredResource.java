package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MonitoredResource extends GeneratedMessageLite<MonitoredResource, Builder> implements MonitoredResourceOrBuilder {
    private static final MonitoredResource DEFAULT_INSTANCE = null;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser<MonitoredResource> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> labels_;
    private String type_;

    /* renamed from: com.google.api.MonitoredResource$1 */
    static /* synthetic */ class C05791 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f75xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MonitoredResource, Builder> implements MonitoredResourceOrBuilder {
        /* synthetic */ Builder(C05791 c05791) {
        }

        public Builder clearLabels() {
        }

        public Builder clearType() {
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public boolean containsLabels(String str) {
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        @Deprecated
        public Map<String, String> getLabels() {
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public int getLabelsCount() {
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public Map<String, String> getLabelsMap() {
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public String getLabelsOrDefault(String str, String str2) {
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public String getLabelsOrThrow(String str) {
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public String getType() {
        }

        @Override // com.google.api.MonitoredResourceOrBuilder
        public ByteString getTypeBytes() {
        }

        public Builder putAllLabels(Map<String, String> map) {
        }

        public Builder putLabels(String str, String str2) {
        }

        public Builder removeLabels(String str) {
        }

        public Builder setType(String str) {
        }

        public Builder setTypeBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private static final class LabelsDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry = null;

        private LabelsDefaultEntryHolder() {
        }
    }

    private MonitoredResource() {
    }

    static /* synthetic */ MonitoredResource access$000() {
    }

    static /* synthetic */ void access$100(MonitoredResource monitoredResource, String str) {
    }

    static /* synthetic */ void access$200(MonitoredResource monitoredResource) {
    }

    static /* synthetic */ void access$300(MonitoredResource monitoredResource, ByteString byteString) {
    }

    static /* synthetic */ Map access$400(MonitoredResource monitoredResource) {
    }

    private void clearType() {
    }

    public static MonitoredResource getDefaultInstance() {
    }

    private Map<String, String> getMutableLabelsMap() {
    }

    private MapFieldLite<String, String> internalGetLabels() {
    }

    private MapFieldLite<String, String> internalGetMutableLabels() {
    }

    public static Builder newBuilder() {
    }

    public static MonitoredResource parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static MonitoredResource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<MonitoredResource> parser() {
    }

    private void setType(String str) {
    }

    private void setTypeBytes(ByteString byteString) {
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public boolean containsLabels(String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    @Deprecated
    public Map<String, String> getLabels() {
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public int getLabelsCount() {
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public Map<String, String> getLabelsMap() {
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public String getLabelsOrDefault(String str, String str2) {
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public String getLabelsOrThrow(String str) {
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public String getType() {
    }

    @Override // com.google.api.MonitoredResourceOrBuilder
    public ByteString getTypeBytes() {
    }

    public static Builder newBuilder(MonitoredResource monitoredResource) {
    }

    public static MonitoredResource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static MonitoredResource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MonitoredResource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static MonitoredResource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MonitoredResource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static MonitoredResource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MonitoredResource parseFrom(InputStream inputStream) throws IOException {
    }

    public static MonitoredResource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static MonitoredResource parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static MonitoredResource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
