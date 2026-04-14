package com.google.api;

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
public final class DocumentationRule extends GeneratedMessageLite<DocumentationRule, Builder> implements DocumentationRuleOrBuilder {
    private static final DocumentationRule DEFAULT_INSTANCE = null;
    public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser<DocumentationRule> PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String deprecationDescription_;
    private String description_;
    private String selector_;

    /* renamed from: com.google.api.DocumentationRule$1 */
    static /* synthetic */ class C05621 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f63xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DocumentationRule, Builder> implements DocumentationRuleOrBuilder {
        /* synthetic */ Builder(C05621 c05621) {
        }

        public Builder clearDeprecationDescription() {
        }

        public Builder clearDescription() {
        }

        public Builder clearSelector() {
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public String getDeprecationDescription() {
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public ByteString getDeprecationDescriptionBytes() {
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public String getDescription() {
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public String getSelector() {
        }

        @Override // com.google.api.DocumentationRuleOrBuilder
        public ByteString getSelectorBytes() {
        }

        public Builder setDeprecationDescription(String str) {
        }

        public Builder setDeprecationDescriptionBytes(ByteString byteString) {
        }

        public Builder setDescription(String str) {
        }

        public Builder setDescriptionBytes(ByteString byteString) {
        }

        public Builder setSelector(String str) {
        }

        public Builder setSelectorBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private DocumentationRule() {
    }

    static /* synthetic */ DocumentationRule access$000() {
    }

    static /* synthetic */ void access$100(DocumentationRule documentationRule, String str) {
    }

    static /* synthetic */ void access$200(DocumentationRule documentationRule) {
    }

    static /* synthetic */ void access$300(DocumentationRule documentationRule, ByteString byteString) {
    }

    static /* synthetic */ void access$400(DocumentationRule documentationRule, String str) {
    }

    static /* synthetic */ void access$500(DocumentationRule documentationRule) {
    }

    static /* synthetic */ void access$600(DocumentationRule documentationRule, ByteString byteString) {
    }

    static /* synthetic */ void access$700(DocumentationRule documentationRule, String str) {
    }

    static /* synthetic */ void access$800(DocumentationRule documentationRule) {
    }

    static /* synthetic */ void access$900(DocumentationRule documentationRule, ByteString byteString) {
    }

    private void clearDeprecationDescription() {
    }

    private void clearDescription() {
    }

    private void clearSelector() {
    }

    public static DocumentationRule getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<DocumentationRule> parser() {
    }

    private void setDeprecationDescription(String str) {
    }

    private void setDeprecationDescriptionBytes(ByteString byteString) {
    }

    private void setDescription(String str) {
    }

    private void setDescriptionBytes(ByteString byteString) {
    }

    private void setSelector(String str) {
    }

    private void setSelectorBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public String getDeprecationDescription() {
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public ByteString getDeprecationDescriptionBytes() {
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public String getDescription() {
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public ByteString getDescriptionBytes() {
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public String getSelector() {
    }

    @Override // com.google.api.DocumentationRuleOrBuilder
    public ByteString getSelectorBytes() {
    }

    public static Builder newBuilder(DocumentationRule documentationRule) {
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DocumentationRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static DocumentationRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DocumentationRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static DocumentationRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DocumentationRule parseFrom(InputStream inputStream) throws IOException {
    }

    public static DocumentationRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static DocumentationRule parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static DocumentationRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
