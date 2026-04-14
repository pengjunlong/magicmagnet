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
public final class Metric extends GeneratedMessageLite<Metric, Builder> implements MetricOrBuilder {
    private static final Metric DEFAULT_INSTANCE = null;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser<Metric> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private MapFieldLite<String, String> labels_;
    private String type_;

    /* renamed from: com.google.api.Metric$1 */
    static /* synthetic */ class C05741 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f72xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Metric, Builder> implements MetricOrBuilder {
        /* synthetic */ Builder(C05741 c05741) {
        }

        public Builder clearLabels() {
        }

        public Builder clearType() {
        }

        @Override // com.google.api.MetricOrBuilder
        public boolean containsLabels(String str) {
        }

        @Override // com.google.api.MetricOrBuilder
        @Deprecated
        public Map<String, String> getLabels() {
        }

        @Override // com.google.api.MetricOrBuilder
        public int getLabelsCount() {
        }

        @Override // com.google.api.MetricOrBuilder
        public Map<String, String> getLabelsMap() {
        }

        @Override // com.google.api.MetricOrBuilder
        public String getLabelsOrDefault(String str, String str2) {
        }

        @Override // com.google.api.MetricOrBuilder
        public String getLabelsOrThrow(String str) {
        }

        @Override // com.google.api.MetricOrBuilder
        public String getType() {
        }

        @Override // com.google.api.MetricOrBuilder
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

    private Metric() {
    }

    static /* synthetic */ Metric access$000() {
    }

    static /* synthetic */ void access$100(Metric metric, String str) {
    }

    static /* synthetic */ void access$200(Metric metric) {
    }

    static /* synthetic */ void access$300(Metric metric, ByteString byteString) {
    }

    static /* synthetic */ Map access$400(Metric metric) {
    }

    private void clearType() {
    }

    public static Metric getDefaultInstance() {
    }

    private Map<String, String> getMutableLabelsMap() {
    }

    private MapFieldLite<String, String> internalGetLabels() {
    }

    private MapFieldLite<String, String> internalGetMutableLabels() {
    }

    public static Builder newBuilder() {
    }

    public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Metric> parser() {
    }

    private void setType(String str) {
    }

    private void setTypeBytes(ByteString byteString) {
    }

    @Override // com.google.api.MetricOrBuilder
    public boolean containsLabels(String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.MetricOrBuilder
    @Deprecated
    public Map<String, String> getLabels() {
    }

    @Override // com.google.api.MetricOrBuilder
    public int getLabelsCount() {
    }

    @Override // com.google.api.MetricOrBuilder
    public Map<String, String> getLabelsMap() {
    }

    @Override // com.google.api.MetricOrBuilder
    public String getLabelsOrDefault(String str, String str2) {
    }

    @Override // com.google.api.MetricOrBuilder
    public String getLabelsOrThrow(String str) {
    }

    @Override // com.google.api.MetricOrBuilder
    public String getType() {
    }

    @Override // com.google.api.MetricOrBuilder
    public ByteString getTypeBytes() {
    }

    public static Builder newBuilder(Metric metric) {
    }

    public static Metric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Metric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Metric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Metric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Metric parseFrom(InputStream inputStream) throws IOException {
    }

    public static Metric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Metric parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Metric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
