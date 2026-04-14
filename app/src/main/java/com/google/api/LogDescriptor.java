package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class LogDescriptor extends GeneratedMessageLite<LogDescriptor, Builder> implements LogDescriptorOrBuilder {
    private static final LogDescriptor DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<LogDescriptor> PARSER;
    private String description_;
    private String displayName_;
    private Internal.ProtobufList<LabelDescriptor> labels_;
    private String name_;

    /* renamed from: com.google.api.LogDescriptor$1 */
    static /* synthetic */ class C05721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f70xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LogDescriptor, Builder> implements LogDescriptorOrBuilder {
        /* synthetic */ Builder(C05721 c05721) {
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
        }

        public Builder clearDescription() {
        }

        public Builder clearDisplayName() {
        }

        public Builder clearLabels() {
        }

        public Builder clearName() {
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public String getDescription() {
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public String getDisplayName() {
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public ByteString getDisplayNameBytes() {
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public LabelDescriptor getLabels(int i) {
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public int getLabelsCount() {
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public List<LabelDescriptor> getLabelsList() {
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public String getName() {
        }

        @Override // com.google.api.LogDescriptorOrBuilder
        public ByteString getNameBytes() {
        }

        public Builder removeLabels(int i) {
        }

        public Builder setDescription(String str) {
        }

        public Builder setDescriptionBytes(ByteString byteString) {
        }

        public Builder setDisplayName(String str) {
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
        }

        public Builder setLabels(int i, LabelDescriptor labelDescriptor) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addLabels(int i, LabelDescriptor labelDescriptor) {
        }

        public Builder setLabels(int i, LabelDescriptor.Builder builder) {
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
        }

        public Builder addLabels(int i, LabelDescriptor.Builder builder) {
        }
    }

    private LogDescriptor() {
    }

    static /* synthetic */ LogDescriptor access$000() {
    }

    static /* synthetic */ void access$100(LogDescriptor logDescriptor, String str) {
    }

    static /* synthetic */ void access$1000(LogDescriptor logDescriptor, String str) {
    }

    static /* synthetic */ void access$1100(LogDescriptor logDescriptor) {
    }

    static /* synthetic */ void access$1200(LogDescriptor logDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$1300(LogDescriptor logDescriptor, String str) {
    }

    static /* synthetic */ void access$1400(LogDescriptor logDescriptor) {
    }

    static /* synthetic */ void access$1500(LogDescriptor logDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$200(LogDescriptor logDescriptor) {
    }

    static /* synthetic */ void access$300(LogDescriptor logDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$400(LogDescriptor logDescriptor, int i, LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$500(LogDescriptor logDescriptor, LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$600(LogDescriptor logDescriptor, int i, LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$700(LogDescriptor logDescriptor, Iterable iterable) {
    }

    static /* synthetic */ void access$800(LogDescriptor logDescriptor) {
    }

    static /* synthetic */ void access$900(LogDescriptor logDescriptor, int i) {
    }

    private void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
    }

    private void addLabels(LabelDescriptor labelDescriptor) {
    }

    private void clearDescription() {
    }

    private void clearDisplayName() {
    }

    private void clearLabels() {
    }

    private void clearName() {
    }

    private void ensureLabelsIsMutable() {
    }

    public static LogDescriptor getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<LogDescriptor> parser() {
    }

    private void removeLabels(int i) {
    }

    private void setDescription(String str) {
    }

    private void setDescriptionBytes(ByteString byteString) {
    }

    private void setDisplayName(String str) {
    }

    private void setDisplayNameBytes(ByteString byteString) {
    }

    private void setLabels(int i, LabelDescriptor labelDescriptor) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public String getDescription() {
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public ByteString getDescriptionBytes() {
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public String getDisplayName() {
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public ByteString getDisplayNameBytes() {
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public LabelDescriptor getLabels(int i) {
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public int getLabelsCount() {
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public List<LabelDescriptor> getLabelsList() {
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
    }

    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public String getName() {
    }

    @Override // com.google.api.LogDescriptorOrBuilder
    public ByteString getNameBytes() {
    }

    public static Builder newBuilder(LogDescriptor logDescriptor) {
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static LogDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LogDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addLabels(int i, LabelDescriptor labelDescriptor) {
    }

    public static LogDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LogDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static LogDescriptor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static LogDescriptor parseFrom(InputStream inputStream) throws IOException {
    }

    public static LogDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static LogDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static LogDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
