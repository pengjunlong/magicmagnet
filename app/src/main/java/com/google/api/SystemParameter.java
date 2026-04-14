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
public final class SystemParameter extends GeneratedMessageLite<SystemParameter, Builder> implements SystemParameterOrBuilder {
    private static final SystemParameter DEFAULT_INSTANCE = null;
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<SystemParameter> PARSER = null;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String httpHeader_;
    private String name_;
    private String urlQueryParameter_;

    /* renamed from: com.google.api.SystemParameter$1 */
    static /* synthetic */ class C05951 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f89xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<SystemParameter, Builder> implements SystemParameterOrBuilder {
        /* synthetic */ Builder(C05951 c05951) {
        }

        public Builder clearHttpHeader() {
        }

        public Builder clearName() {
        }

        public Builder clearUrlQueryParameter() {
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public String getHttpHeader() {
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public ByteString getHttpHeaderBytes() {
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public String getName() {
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public String getUrlQueryParameter() {
        }

        @Override // com.google.api.SystemParameterOrBuilder
        public ByteString getUrlQueryParameterBytes() {
        }

        public Builder setHttpHeader(String str) {
        }

        public Builder setHttpHeaderBytes(ByteString byteString) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setUrlQueryParameter(String str) {
        }

        public Builder setUrlQueryParameterBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private SystemParameter() {
    }

    static /* synthetic */ SystemParameter access$000() {
    }

    static /* synthetic */ void access$100(SystemParameter systemParameter, String str) {
    }

    static /* synthetic */ void access$200(SystemParameter systemParameter) {
    }

    static /* synthetic */ void access$300(SystemParameter systemParameter, ByteString byteString) {
    }

    static /* synthetic */ void access$400(SystemParameter systemParameter, String str) {
    }

    static /* synthetic */ void access$500(SystemParameter systemParameter) {
    }

    static /* synthetic */ void access$600(SystemParameter systemParameter, ByteString byteString) {
    }

    static /* synthetic */ void access$700(SystemParameter systemParameter, String str) {
    }

    static /* synthetic */ void access$800(SystemParameter systemParameter) {
    }

    static /* synthetic */ void access$900(SystemParameter systemParameter, ByteString byteString) {
    }

    private void clearHttpHeader() {
    }

    private void clearName() {
    }

    private void clearUrlQueryParameter() {
    }

    public static SystemParameter getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static SystemParameter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<SystemParameter> parser() {
    }

    private void setHttpHeader(String str) {
    }

    private void setHttpHeaderBytes(ByteString byteString) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setUrlQueryParameter(String str) {
    }

    private void setUrlQueryParameterBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public String getHttpHeader() {
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public ByteString getHttpHeaderBytes() {
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public String getName() {
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public String getUrlQueryParameter() {
    }

    @Override // com.google.api.SystemParameterOrBuilder
    public ByteString getUrlQueryParameterBytes() {
    }

    public static Builder newBuilder(SystemParameter systemParameter) {
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static SystemParameter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SystemParameter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static SystemParameter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SystemParameter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static SystemParameter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static SystemParameter parseFrom(InputStream inputStream) throws IOException {
    }

    public static SystemParameter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static SystemParameter parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static SystemParameter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
