package com.google.api;

import com.google.api.Advice;
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
public final class ConfigChange extends GeneratedMessageLite<ConfigChange, Builder> implements ConfigChangeOrBuilder {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final ConfigChange DEFAULT_INSTANCE = null;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<ConfigChange> PARSER;
    private Internal.ProtobufList<Advice> advices_;
    private int changeType_;
    private String element_;
    private String newValue_;
    private String oldValue_;

    /* renamed from: com.google.api.ConfigChange$1 */
    static /* synthetic */ class C05551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f56xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ConfigChange, Builder> implements ConfigChangeOrBuilder {
        /* synthetic */ Builder(C05551 c05551) {
        }

        public Builder addAdvices(Advice advice) {
        }

        public Builder addAllAdvices(Iterable<? extends Advice> iterable) {
        }

        public Builder clearAdvices() {
        }

        public Builder clearChangeType() {
        }

        public Builder clearElement() {
        }

        public Builder clearNewValue() {
        }

        public Builder clearOldValue() {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public Advice getAdvices(int i) {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public int getAdvicesCount() {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public List<Advice> getAdvicesList() {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public ChangeType getChangeType() {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public int getChangeTypeValue() {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public String getElement() {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public ByteString getElementBytes() {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public String getNewValue() {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public ByteString getNewValueBytes() {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public String getOldValue() {
        }

        @Override // com.google.api.ConfigChangeOrBuilder
        public ByteString getOldValueBytes() {
        }

        public Builder removeAdvices(int i) {
        }

        public Builder setAdvices(int i, Advice advice) {
        }

        public Builder setChangeType(ChangeType changeType) {
        }

        public Builder setChangeTypeValue(int i) {
        }

        public Builder setElement(String str) {
        }

        public Builder setElementBytes(ByteString byteString) {
        }

        public Builder setNewValue(String str) {
        }

        public Builder setNewValueBytes(ByteString byteString) {
        }

        public Builder setOldValue(String str) {
        }

        public Builder setOldValueBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addAdvices(int i, Advice advice) {
        }

        public Builder setAdvices(int i, Advice.Builder builder) {
        }

        public Builder addAdvices(Advice.Builder builder) {
        }

        public Builder addAdvices(int i, Advice.Builder builder) {
        }
    }

    private ConfigChange() {
    }

    static /* synthetic */ ConfigChange access$000() {
    }

    static /* synthetic */ void access$100(ConfigChange configChange, String str) {
    }

    static /* synthetic */ void access$1000(ConfigChange configChange, int i) {
    }

    static /* synthetic */ void access$1100(ConfigChange configChange, ChangeType changeType) {
    }

    static /* synthetic */ void access$1200(ConfigChange configChange) {
    }

    static /* synthetic */ void access$1300(ConfigChange configChange, int i, Advice advice) {
    }

    static /* synthetic */ void access$1400(ConfigChange configChange, Advice advice) {
    }

    static /* synthetic */ void access$1500(ConfigChange configChange, int i, Advice advice) {
    }

    static /* synthetic */ void access$1600(ConfigChange configChange, Iterable iterable) {
    }

    static /* synthetic */ void access$1700(ConfigChange configChange) {
    }

    static /* synthetic */ void access$1800(ConfigChange configChange, int i) {
    }

    static /* synthetic */ void access$200(ConfigChange configChange) {
    }

    static /* synthetic */ void access$300(ConfigChange configChange, ByteString byteString) {
    }

    static /* synthetic */ void access$400(ConfigChange configChange, String str) {
    }

    static /* synthetic */ void access$500(ConfigChange configChange) {
    }

    static /* synthetic */ void access$600(ConfigChange configChange, ByteString byteString) {
    }

    static /* synthetic */ void access$700(ConfigChange configChange, String str) {
    }

    static /* synthetic */ void access$800(ConfigChange configChange) {
    }

    static /* synthetic */ void access$900(ConfigChange configChange, ByteString byteString) {
    }

    private void addAdvices(Advice advice) {
    }

    private void addAllAdvices(Iterable<? extends Advice> iterable) {
    }

    private void clearAdvices() {
    }

    private void clearChangeType() {
    }

    private void clearElement() {
    }

    private void clearNewValue() {
    }

    private void clearOldValue() {
    }

    private void ensureAdvicesIsMutable() {
    }

    public static ConfigChange getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ConfigChange> parser() {
    }

    private void removeAdvices(int i) {
    }

    private void setAdvices(int i, Advice advice) {
    }

    private void setChangeType(ChangeType changeType) {
    }

    private void setChangeTypeValue(int i) {
    }

    private void setElement(String str) {
    }

    private void setElementBytes(ByteString byteString) {
    }

    private void setNewValue(String str) {
    }

    private void setNewValueBytes(ByteString byteString) {
    }

    private void setOldValue(String str) {
    }

    private void setOldValueBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public Advice getAdvices(int i) {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public int getAdvicesCount() {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public List<Advice> getAdvicesList() {
    }

    public AdviceOrBuilder getAdvicesOrBuilder(int i) {
    }

    public List<? extends AdviceOrBuilder> getAdvicesOrBuilderList() {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public ChangeType getChangeType() {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public int getChangeTypeValue() {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public String getElement() {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public ByteString getElementBytes() {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public String getNewValue() {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public ByteString getNewValueBytes() {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public String getOldValue() {
    }

    @Override // com.google.api.ConfigChangeOrBuilder
    public ByteString getOldValueBytes() {
    }

    public static Builder newBuilder(ConfigChange configChange) {
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ConfigChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addAdvices(int i, Advice advice) {
    }

    public static ConfigChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ConfigChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ConfigChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ConfigChange parseFrom(InputStream inputStream) throws IOException {
    }

    public static ConfigChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ConfigChange parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ConfigChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
