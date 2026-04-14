package com.google.api;

import com.google.api.DocumentationRule;
import com.google.api.Page;
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
public final class Documentation extends GeneratedMessageLite<Documentation, Builder> implements DocumentationOrBuilder {
    private static final Documentation DEFAULT_INSTANCE = null;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile Parser<Documentation> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String documentationRootUrl_;
    private String overview_;
    private Internal.ProtobufList<Page> pages_;
    private Internal.ProtobufList<DocumentationRule> rules_;
    private String summary_;

    /* renamed from: com.google.api.Documentation$1 */
    static /* synthetic */ class C05611 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f62xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Documentation, Builder> implements DocumentationOrBuilder {
        /* synthetic */ Builder(C05611 c05611) {
        }

        public Builder addAllPages(Iterable<? extends Page> iterable) {
        }

        public Builder addAllRules(Iterable<? extends DocumentationRule> iterable) {
        }

        public Builder addPages(Page page) {
        }

        public Builder addRules(DocumentationRule documentationRule) {
        }

        public Builder clearDocumentationRootUrl() {
        }

        public Builder clearOverview() {
        }

        public Builder clearPages() {
        }

        public Builder clearRules() {
        }

        public Builder clearSummary() {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public String getDocumentationRootUrl() {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public ByteString getDocumentationRootUrlBytes() {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public String getOverview() {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public ByteString getOverviewBytes() {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public Page getPages(int i) {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public int getPagesCount() {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public List<Page> getPagesList() {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public DocumentationRule getRules(int i) {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public int getRulesCount() {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public List<DocumentationRule> getRulesList() {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public String getSummary() {
        }

        @Override // com.google.api.DocumentationOrBuilder
        public ByteString getSummaryBytes() {
        }

        public Builder removePages(int i) {
        }

        public Builder removeRules(int i) {
        }

        public Builder setDocumentationRootUrl(String str) {
        }

        public Builder setDocumentationRootUrlBytes(ByteString byteString) {
        }

        public Builder setOverview(String str) {
        }

        public Builder setOverviewBytes(ByteString byteString) {
        }

        public Builder setPages(int i, Page page) {
        }

        public Builder setRules(int i, DocumentationRule documentationRule) {
        }

        public Builder setSummary(String str) {
        }

        public Builder setSummaryBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addPages(int i, Page page) {
        }

        public Builder addRules(int i, DocumentationRule documentationRule) {
        }

        public Builder setPages(int i, Page.Builder builder) {
        }

        public Builder setRules(int i, DocumentationRule.Builder builder) {
        }

        public Builder addPages(Page.Builder builder) {
        }

        public Builder addRules(DocumentationRule.Builder builder) {
        }

        public Builder addPages(int i, Page.Builder builder) {
        }

        public Builder addRules(int i, DocumentationRule.Builder builder) {
        }
    }

    private Documentation() {
    }

    static /* synthetic */ Documentation access$000() {
    }

    static /* synthetic */ void access$100(Documentation documentation, String str) {
    }

    static /* synthetic */ void access$1000(Documentation documentation, int i, DocumentationRule documentationRule) {
    }

    static /* synthetic */ void access$1100(Documentation documentation, DocumentationRule documentationRule) {
    }

    static /* synthetic */ void access$1200(Documentation documentation, int i, DocumentationRule documentationRule) {
    }

    static /* synthetic */ void access$1300(Documentation documentation, Iterable iterable) {
    }

    static /* synthetic */ void access$1400(Documentation documentation) {
    }

    static /* synthetic */ void access$1500(Documentation documentation, int i) {
    }

    static /* synthetic */ void access$1600(Documentation documentation, String str) {
    }

    static /* synthetic */ void access$1700(Documentation documentation) {
    }

    static /* synthetic */ void access$1800(Documentation documentation, ByteString byteString) {
    }

    static /* synthetic */ void access$1900(Documentation documentation, String str) {
    }

    static /* synthetic */ void access$200(Documentation documentation) {
    }

    static /* synthetic */ void access$2000(Documentation documentation) {
    }

    static /* synthetic */ void access$2100(Documentation documentation, ByteString byteString) {
    }

    static /* synthetic */ void access$300(Documentation documentation, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Documentation documentation, int i, Page page) {
    }

    static /* synthetic */ void access$500(Documentation documentation, Page page) {
    }

    static /* synthetic */ void access$600(Documentation documentation, int i, Page page) {
    }

    static /* synthetic */ void access$700(Documentation documentation, Iterable iterable) {
    }

    static /* synthetic */ void access$800(Documentation documentation) {
    }

    static /* synthetic */ void access$900(Documentation documentation, int i) {
    }

    private void addAllPages(Iterable<? extends Page> iterable) {
    }

    private void addAllRules(Iterable<? extends DocumentationRule> iterable) {
    }

    private void addPages(Page page) {
    }

    private void addRules(DocumentationRule documentationRule) {
    }

    private void clearDocumentationRootUrl() {
    }

    private void clearOverview() {
    }

    private void clearPages() {
    }

    private void clearRules() {
    }

    private void clearSummary() {
    }

    private void ensurePagesIsMutable() {
    }

    private void ensureRulesIsMutable() {
    }

    public static Documentation getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Documentation> parser() {
    }

    private void removePages(int i) {
    }

    private void removeRules(int i) {
    }

    private void setDocumentationRootUrl(String str) {
    }

    private void setDocumentationRootUrlBytes(ByteString byteString) {
    }

    private void setOverview(String str) {
    }

    private void setOverviewBytes(ByteString byteString) {
    }

    private void setPages(int i, Page page) {
    }

    private void setRules(int i, DocumentationRule documentationRule) {
    }

    private void setSummary(String str) {
    }

    private void setSummaryBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public String getDocumentationRootUrl() {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public ByteString getDocumentationRootUrlBytes() {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public String getOverview() {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public ByteString getOverviewBytes() {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public Page getPages(int i) {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public int getPagesCount() {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public List<Page> getPagesList() {
    }

    public PageOrBuilder getPagesOrBuilder(int i) {
    }

    public List<? extends PageOrBuilder> getPagesOrBuilderList() {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public DocumentationRule getRules(int i) {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public int getRulesCount() {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public List<DocumentationRule> getRulesList() {
    }

    public DocumentationRuleOrBuilder getRulesOrBuilder(int i) {
    }

    public List<? extends DocumentationRuleOrBuilder> getRulesOrBuilderList() {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public String getSummary() {
    }

    @Override // com.google.api.DocumentationOrBuilder
    public ByteString getSummaryBytes() {
    }

    public static Builder newBuilder(Documentation documentation) {
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Documentation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addPages(int i, Page page) {
    }

    private void addRules(int i, DocumentationRule documentationRule) {
    }

    public static Documentation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Documentation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Documentation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Documentation parseFrom(InputStream inputStream) throws IOException {
    }

    public static Documentation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Documentation parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Documentation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
