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
public final class JwtLocation extends GeneratedMessageLite<JwtLocation, Builder> implements JwtLocationOrBuilder {
    private static final JwtLocation DEFAULT_INSTANCE = null;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile Parser<JwtLocation> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private int inCase_;
    private Object in_;
    private String valuePrefix_;

    /* renamed from: com.google.api.JwtLocation$1 */
    static /* synthetic */ class C05681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f68xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<JwtLocation, Builder> implements JwtLocationOrBuilder {
        /* synthetic */ Builder(C05681 c05681) {
        }

        public Builder clearHeader() {
        }

        public Builder clearIn() {
        }

        public Builder clearQuery() {
        }

        public Builder clearValuePrefix() {
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public String getHeader() {
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public ByteString getHeaderBytes() {
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public InCase getInCase() {
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public String getQuery() {
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public ByteString getQueryBytes() {
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public String getValuePrefix() {
        }

        @Override // com.google.api.JwtLocationOrBuilder
        public ByteString getValuePrefixBytes() {
        }

        public Builder setHeader(String str) {
        }

        public Builder setHeaderBytes(ByteString byteString) {
        }

        public Builder setQuery(String str) {
        }

        public Builder setQueryBytes(ByteString byteString) {
        }

        public Builder setValuePrefix(String str) {
        }

        public Builder setValuePrefixBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class InCase {
        private static final /* synthetic */ InCase[] $VALUES = null;
        public static final InCase HEADER = null;
        public static final InCase IN_NOT_SET = null;
        public static final InCase QUERY = null;
        private final int value;

        private InCase(String str, int i, int i2) {
        }

        public static InCase forNumber(int i) {
        }

        public static InCase valueOf(String str) {
        }

        public static InCase[] values() {
        }

        public int getNumber() {
        }

        @Deprecated
        public static InCase valueOf(int i) {
        }
    }

    private JwtLocation() {
    }

    static /* synthetic */ JwtLocation access$000() {
    }

    static /* synthetic */ void access$100(JwtLocation jwtLocation) {
    }

    static /* synthetic */ void access$1000(JwtLocation jwtLocation, ByteString byteString) {
    }

    static /* synthetic */ void access$200(JwtLocation jwtLocation, String str) {
    }

    static /* synthetic */ void access$300(JwtLocation jwtLocation) {
    }

    static /* synthetic */ void access$400(JwtLocation jwtLocation, ByteString byteString) {
    }

    static /* synthetic */ void access$500(JwtLocation jwtLocation, String str) {
    }

    static /* synthetic */ void access$600(JwtLocation jwtLocation) {
    }

    static /* synthetic */ void access$700(JwtLocation jwtLocation, ByteString byteString) {
    }

    static /* synthetic */ void access$800(JwtLocation jwtLocation, String str) {
    }

    static /* synthetic */ void access$900(JwtLocation jwtLocation) {
    }

    private void clearHeader() {
    }

    private void clearIn() {
    }

    private void clearQuery() {
    }

    private void clearValuePrefix() {
    }

    public static JwtLocation getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<JwtLocation> parser() {
    }

    private void setHeader(String str) {
    }

    private void setHeaderBytes(ByteString byteString) {
    }

    private void setQuery(String str) {
    }

    private void setQueryBytes(ByteString byteString) {
    }

    private void setValuePrefix(String str) {
    }

    private void setValuePrefixBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public String getHeader() {
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public ByteString getHeaderBytes() {
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public InCase getInCase() {
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public String getQuery() {
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public ByteString getQueryBytes() {
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public String getValuePrefix() {
    }

    @Override // com.google.api.JwtLocationOrBuilder
    public ByteString getValuePrefixBytes() {
    }

    public static Builder newBuilder(JwtLocation jwtLocation) {
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static JwtLocation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static JwtLocation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static JwtLocation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static JwtLocation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static JwtLocation parseFrom(InputStream inputStream) throws IOException {
    }

    public static JwtLocation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static JwtLocation parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static JwtLocation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
