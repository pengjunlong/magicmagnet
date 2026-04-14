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
public final class MonitoredResourceDescriptor extends GeneratedMessageLite<MonitoredResourceDescriptor, Builder> implements MonitoredResourceDescriptorOrBuilder {
    private static final MonitoredResourceDescriptor DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile Parser<MonitoredResourceDescriptor> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String description_;
    private String displayName_;
    private Internal.ProtobufList<LabelDescriptor> labels_;
    private int launchStage_;
    private String name_;
    private String type_;

    /* renamed from: com.google.api.MonitoredResourceDescriptor$1 */
    static /* synthetic */ class C05801 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f76xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<MonitoredResourceDescriptor, Builder> implements MonitoredResourceDescriptorOrBuilder {
        /* synthetic */ Builder(C05801 c05801) {
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

        public Builder clearLaunchStage() {
        }

        public Builder clearName() {
        }

        public Builder clearType() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public String getDescription() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public String getDisplayName() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public ByteString getDisplayNameBytes() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public LabelDescriptor getLabels(int i) {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public int getLabelsCount() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public List<LabelDescriptor> getLabelsList() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public LaunchStage getLaunchStage() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public int getLaunchStageValue() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public String getName() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public String getType() {
        }

        @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
        public ByteString getTypeBytes() {
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

        public Builder setLaunchStage(LaunchStage launchStage) {
        }

        public Builder setLaunchStageValue(int i) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setType(String str) {
        }

        public Builder setTypeBytes(ByteString byteString) {
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

    private MonitoredResourceDescriptor() {
    }

    static /* synthetic */ MonitoredResourceDescriptor access$000() {
    }

    static /* synthetic */ void access$100(MonitoredResourceDescriptor monitoredResourceDescriptor, String str) {
    }

    static /* synthetic */ void access$1000(MonitoredResourceDescriptor monitoredResourceDescriptor, String str) {
    }

    static /* synthetic */ void access$1100(MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    static /* synthetic */ void access$1200(MonitoredResourceDescriptor monitoredResourceDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$1300(MonitoredResourceDescriptor monitoredResourceDescriptor, int i, LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$1400(MonitoredResourceDescriptor monitoredResourceDescriptor, LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$1500(MonitoredResourceDescriptor monitoredResourceDescriptor, int i, LabelDescriptor labelDescriptor) {
    }

    static /* synthetic */ void access$1600(MonitoredResourceDescriptor monitoredResourceDescriptor, Iterable iterable) {
    }

    static /* synthetic */ void access$1700(MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    static /* synthetic */ void access$1800(MonitoredResourceDescriptor monitoredResourceDescriptor, int i) {
    }

    static /* synthetic */ void access$1900(MonitoredResourceDescriptor monitoredResourceDescriptor, int i) {
    }

    static /* synthetic */ void access$200(MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    static /* synthetic */ void access$2000(MonitoredResourceDescriptor monitoredResourceDescriptor, LaunchStage launchStage) {
    }

    static /* synthetic */ void access$2100(MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    static /* synthetic */ void access$300(MonitoredResourceDescriptor monitoredResourceDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$400(MonitoredResourceDescriptor monitoredResourceDescriptor, String str) {
    }

    static /* synthetic */ void access$500(MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    static /* synthetic */ void access$600(MonitoredResourceDescriptor monitoredResourceDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$700(MonitoredResourceDescriptor monitoredResourceDescriptor, String str) {
    }

    static /* synthetic */ void access$800(MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    static /* synthetic */ void access$900(MonitoredResourceDescriptor monitoredResourceDescriptor, ByteString byteString) {
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

    private void clearLaunchStage() {
    }

    private void clearName() {
    }

    private void clearType() {
    }

    private void ensureLabelsIsMutable() {
    }

    public static MonitoredResourceDescriptor getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<MonitoredResourceDescriptor> parser() {
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

    private void setLaunchStage(LaunchStage launchStage) {
    }

    private void setLaunchStageValue(int i) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setType(String str) {
    }

    private void setTypeBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public String getDescription() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public ByteString getDescriptionBytes() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public String getDisplayName() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public ByteString getDisplayNameBytes() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public LabelDescriptor getLabels(int i) {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public int getLabelsCount() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public List<LabelDescriptor> getLabelsList() {
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
    }

    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public LaunchStage getLaunchStage() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public int getLaunchStageValue() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public String getName() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public String getType() {
    }

    @Override // com.google.api.MonitoredResourceDescriptorOrBuilder
    public ByteString getTypeBytes() {
    }

    public static Builder newBuilder(MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MonitoredResourceDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addLabels(int i, LabelDescriptor labelDescriptor) {
    }

    public static MonitoredResourceDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream) throws IOException {
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static MonitoredResourceDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static MonitoredResourceDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
