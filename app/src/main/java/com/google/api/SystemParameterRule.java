package com.google.api;

import com.google.api.SystemParameter;
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
public final class SystemParameterRule extends GeneratedMessageLite<SystemParameterRule, Builder> implements SystemParameterRuleOrBuilder {
    private static final SystemParameterRule DEFAULT_INSTANCE = null;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile Parser<SystemParameterRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal.ProtobufList<SystemParameter> parameters_;
    private String selector_;

    /* renamed from: com.google.api.SystemParameterRule$1 */
    static /* synthetic */ class C05961 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f90xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SystemParameterRule, Builder> implements SystemParameterRuleOrBuilder {
        /* synthetic */ Builder(C05961 c05961) {
        }

        public Builder addAllParameters(Iterable<? extends SystemParameter> iterable) {
        }

        public Builder addParameters(SystemParameter systemParameter) {
        }

        public Builder clearParameters() {
        }

        public Builder clearSelector() {
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public SystemParameter getParameters(int i) {
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public int getParametersCount() {
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public List<SystemParameter> getParametersList() {
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public String getSelector() {
        }

        @Override // com.google.api.SystemParameterRuleOrBuilder
        public ByteString getSelectorBytes() {
        }

        public Builder removeParameters(int i) {
        }

        public Builder setParameters(int i, SystemParameter systemParameter) {
        }

        public Builder setSelector(String str) {
        }

        public Builder setSelectorBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addParameters(int i, SystemParameter systemParameter) {
        }

        public Builder setParameters(int i, SystemParameter.Builder builder) {
        }

        public Builder addParameters(SystemParameter.Builder builder) {
        }

        public Builder addParameters(int i, SystemParameter.Builder builder) {
        }
    }

    private SystemParameterRule() {
    }

    static /* synthetic */ SystemParameterRule access$000() {
    }

    static /* synthetic */ void access$100(SystemParameterRule systemParameterRule, String str) {
    }

    static /* synthetic */ void access$200(SystemParameterRule systemParameterRule) {
    }

    static /* synthetic */ void access$300(SystemParameterRule systemParameterRule, ByteString byteString) {
    }

    static /* synthetic */ void access$400(SystemParameterRule systemParameterRule, int i, SystemParameter systemParameter) {
    }

    static /* synthetic */ void access$500(SystemParameterRule systemParameterRule, SystemParameter systemParameter) {
    }

    static /* synthetic */ void access$600(SystemParameterRule systemParameterRule, int i, SystemParameter systemParameter) {
    }

    static /* synthetic */ void access$700(SystemParameterRule systemParameterRule, Iterable iterable) {
    }

    static /* synthetic */ void access$800(SystemParameterRule systemParameterRule) {
    }

    static /* synthetic */ void access$900(SystemParameterRule systemParameterRule, int i) {
    }

    private void addAllParameters(Iterable<? extends SystemParameter> iterable) {
    }

    private void addParameters(SystemParameter systemParameter) {
    }

    private void clearParameters() {
    }

    private void clearSelector() {
    }

    private void ensureParametersIsMutable() {
    }

    public static SystemParameterRule getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<SystemParameterRule> parser() {
    }

    private void removeParameters(int i) {
    }

    private void setParameters(int i, SystemParameter systemParameter) {
    }

    private void setSelector(String str) {
    }

    private void setSelectorBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public SystemParameter getParameters(int i) {
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public int getParametersCount() {
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public List<SystemParameter> getParametersList() {
    }

    public SystemParameterOrBuilder getParametersOrBuilder(int i) {
    }

    public List<? extends SystemParameterOrBuilder> getParametersOrBuilderList() {
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public String getSelector() {
    }

    @Override // com.google.api.SystemParameterRuleOrBuilder
    public ByteString getSelectorBytes() {
    }

    public static Builder newBuilder(SystemParameterRule systemParameterRule) {
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SystemParameterRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addParameters(int i, SystemParameter systemParameter) {
    }

    public static SystemParameterRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SystemParameterRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static SystemParameterRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SystemParameterRule parseFrom(InputStream inputStream) throws IOException {
    }

    public static SystemParameterRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static SystemParameterRule parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static SystemParameterRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
