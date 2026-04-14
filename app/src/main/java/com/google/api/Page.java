package com.google.api;

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
public final class Page extends GeneratedMessageLite<Page, Builder> implements PageOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Page DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Page> PARSER = null;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String content_;
    private String name_;
    private Internal.ProtobufList<Page> subpages_;

    /* renamed from: com.google.api.Page$1 */
    static /* synthetic */ class C05841 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f80xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Page, Builder> implements PageOrBuilder {
        /* synthetic */ Builder(C05841 c05841) {
        }

        public Builder addAllSubpages(Iterable<? extends Page> iterable) {
        }

        public Builder addSubpages(Page page) {
        }

        public Builder clearContent() {
        }

        public Builder clearName() {
        }

        public Builder clearSubpages() {
        }

        @Override // com.google.api.PageOrBuilder
        public String getContent() {
        }

        @Override // com.google.api.PageOrBuilder
        public ByteString getContentBytes() {
        }

        @Override // com.google.api.PageOrBuilder
        public String getName() {
        }

        @Override // com.google.api.PageOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.api.PageOrBuilder
        public Page getSubpages(int i) {
        }

        @Override // com.google.api.PageOrBuilder
        public int getSubpagesCount() {
        }

        @Override // com.google.api.PageOrBuilder
        public List<Page> getSubpagesList() {
        }

        public Builder removeSubpages(int i) {
        }

        public Builder setContent(String str) {
        }

        public Builder setContentBytes(ByteString byteString) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setSubpages(int i, Page page) {
        }

        private Builder() {
        }

        public Builder addSubpages(int i, Page page) {
        }

        public Builder setSubpages(int i, Builder builder) {
        }

        public Builder addSubpages(Builder builder) {
        }

        public Builder addSubpages(int i, Builder builder) {
        }
    }

    private Page() {
    }

    static /* synthetic */ Page access$000() {
    }

    static /* synthetic */ void access$100(Page page, String str) {
    }

    static /* synthetic */ void access$1000(Page page, Iterable iterable) {
    }

    static /* synthetic */ void access$1100(Page page) {
    }

    static /* synthetic */ void access$1200(Page page, int i) {
    }

    static /* synthetic */ void access$200(Page page) {
    }

    static /* synthetic */ void access$300(Page page, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Page page, String str) {
    }

    static /* synthetic */ void access$500(Page page) {
    }

    static /* synthetic */ void access$600(Page page, ByteString byteString) {
    }

    static /* synthetic */ void access$700(Page page, int i, Page page2) {
    }

    static /* synthetic */ void access$800(Page page, Page page2) {
    }

    static /* synthetic */ void access$900(Page page, int i, Page page2) {
    }

    private void addAllSubpages(Iterable<? extends Page> iterable) {
    }

    private void addSubpages(Page page) {
    }

    private void clearContent() {
    }

    private void clearName() {
    }

    private void clearSubpages() {
    }

    private void ensureSubpagesIsMutable() {
    }

    public static Page getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Page parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Page parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Page> parser() {
    }

    private void removeSubpages(int i) {
    }

    private void setContent(String str) {
    }

    private void setContentBytes(ByteString byteString) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setSubpages(int i, Page page) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.PageOrBuilder
    public String getContent() {
    }

    @Override // com.google.api.PageOrBuilder
    public ByteString getContentBytes() {
    }

    @Override // com.google.api.PageOrBuilder
    public String getName() {
    }

    @Override // com.google.api.PageOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.api.PageOrBuilder
    public Page getSubpages(int i) {
    }

    @Override // com.google.api.PageOrBuilder
    public int getSubpagesCount() {
    }

    @Override // com.google.api.PageOrBuilder
    public List<Page> getSubpagesList() {
    }

    public PageOrBuilder getSubpagesOrBuilder(int i) {
    }

    public List<? extends PageOrBuilder> getSubpagesOrBuilderList() {
    }

    public static Builder newBuilder(Page page) {
    }

    public static Page parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Page parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Page parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addSubpages(int i, Page page) {
    }

    public static Page parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Page parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Page parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Page parseFrom(InputStream inputStream) throws IOException {
    }

    public static Page parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Page parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Page parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
