package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Help extends GeneratedMessageLite<Help, Builder> implements HelpOrBuilder {
    private static final Help DEFAULT_INSTANCE = null;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile Parser<Help> PARSER;
    private Internal.ProtobufList<Link> links_;

    /* renamed from: com.google.rpc.Help$1 */
    static /* synthetic */ class C13561 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f168xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Help, Builder> implements HelpOrBuilder {
        /* synthetic */ Builder(C13561 c13561) {
        }

        public Builder addAllLinks(Iterable<? extends Link> iterable) {
        }

        public Builder addLinks(Link link) {
        }

        public Builder clearLinks() {
        }

        @Override // com.google.rpc.HelpOrBuilder
        public Link getLinks(int i) {
        }

        @Override // com.google.rpc.HelpOrBuilder
        public int getLinksCount() {
        }

        @Override // com.google.rpc.HelpOrBuilder
        public List<Link> getLinksList() {
        }

        public Builder removeLinks(int i) {
        }

        public Builder setLinks(int i, Link link) {
        }

        private Builder() {
        }

        public Builder addLinks(int i, Link link) {
        }

        public Builder setLinks(int i, Link.Builder builder) {
        }

        public Builder addLinks(Link.Builder builder) {
        }

        public Builder addLinks(int i, Link.Builder builder) {
        }
    }

    public static final class Link extends GeneratedMessageLite<Link, Builder> implements LinkOrBuilder {
        private static final Link DEFAULT_INSTANCE = null;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile Parser<Link> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_;
        private String url_;

        public static final class Builder extends GeneratedMessageLite.Builder<Link, Builder> implements LinkOrBuilder {
            /* synthetic */ Builder(C13561 c13561) {
            }

            public Builder clearDescription() {
            }

            public Builder clearUrl() {
            }

            @Override // com.google.rpc.Help.LinkOrBuilder
            public String getDescription() {
            }

            @Override // com.google.rpc.Help.LinkOrBuilder
            public ByteString getDescriptionBytes() {
            }

            @Override // com.google.rpc.Help.LinkOrBuilder
            public String getUrl() {
            }

            @Override // com.google.rpc.Help.LinkOrBuilder
            public ByteString getUrlBytes() {
            }

            public Builder setDescription(String str) {
            }

            public Builder setDescriptionBytes(ByteString byteString) {
            }

            public Builder setUrl(String str) {
            }

            public Builder setUrlBytes(ByteString byteString) {
            }

            private Builder() {
            }
        }

        private Link() {
        }

        static /* synthetic */ Link access$000() {
        }

        static /* synthetic */ void access$100(Link link, String str) {
        }

        static /* synthetic */ void access$200(Link link) {
        }

        static /* synthetic */ void access$300(Link link, ByteString byteString) {
        }

        static /* synthetic */ void access$400(Link link, String str) {
        }

        static /* synthetic */ void access$500(Link link) {
        }

        static /* synthetic */ void access$600(Link link, ByteString byteString) {
        }

        private void clearDescription() {
        }

        private void clearUrl() {
        }

        public static Link getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static Link parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static Link parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<Link> parser() {
        }

        private void setDescription(String str) {
        }

        private void setDescriptionBytes(ByteString byteString) {
        }

        private void setUrl(String str) {
        }

        private void setUrlBytes(ByteString byteString) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.rpc.Help.LinkOrBuilder
        public String getDescription() {
        }

        @Override // com.google.rpc.Help.LinkOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.rpc.Help.LinkOrBuilder
        public String getUrl() {
        }

        @Override // com.google.rpc.Help.LinkOrBuilder
        public ByteString getUrlBytes() {
        }

        public static Builder newBuilder(Link link) {
        }

        public static Link parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Link parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Link parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static Link parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Link parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static Link parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Link parseFrom(InputStream inputStream) throws IOException {
        }

        public static Link parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Link parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static Link parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface LinkOrBuilder extends MessageLiteOrBuilder {
        String getDescription();

        ByteString getDescriptionBytes();

        String getUrl();

        ByteString getUrlBytes();
    }

    private Help() {
    }

    static /* synthetic */ void access$1000(Help help, Link link) {
    }

    static /* synthetic */ void access$1100(Help help, int i, Link link) {
    }

    static /* synthetic */ void access$1200(Help help, Iterable iterable) {
    }

    static /* synthetic */ void access$1300(Help help) {
    }

    static /* synthetic */ void access$1400(Help help, int i) {
    }

    static /* synthetic */ Help access$800() {
    }

    static /* synthetic */ void access$900(Help help, int i, Link link) {
    }

    private void addAllLinks(Iterable<? extends Link> iterable) {
    }

    private void addLinks(Link link) {
    }

    private void clearLinks() {
    }

    private void ensureLinksIsMutable() {
    }

    public static Help getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Help parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Help parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Help> parser() {
    }

    private void removeLinks(int i) {
    }

    private void setLinks(int i, Link link) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.HelpOrBuilder
    public Link getLinks(int i) {
    }

    @Override // com.google.rpc.HelpOrBuilder
    public int getLinksCount() {
    }

    @Override // com.google.rpc.HelpOrBuilder
    public List<Link> getLinksList() {
    }

    public LinkOrBuilder getLinksOrBuilder(int i) {
    }

    public List<? extends LinkOrBuilder> getLinksOrBuilderList() {
    }

    public static Builder newBuilder(Help help) {
    }

    public static Help parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Help parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Help parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addLinks(int i, Link link) {
    }

    public static Help parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Help parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Help parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Help parseFrom(InputStream inputStream) throws IOException {
    }

    public static Help parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Help parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Help parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
