package com.google.cloud.audit;

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
public final class AuthorizationInfo extends GeneratedMessageLite<AuthorizationInfo, Builder> implements AuthorizationInfoOrBuilder {
    private static final AuthorizationInfo DEFAULT_INSTANCE = null;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile Parser<AuthorizationInfo> PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String permission_;
    private String resource_;

    /* renamed from: com.google.cloud.audit.AuthorizationInfo$1 */
    static /* synthetic */ class C06021 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f96xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthorizationInfo, Builder> implements AuthorizationInfoOrBuilder {
        /* synthetic */ Builder(C06021 c06021) {
        }

        public Builder clearGranted() {
        }

        public Builder clearPermission() {
        }

        public Builder clearResource() {
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public boolean getGranted() {
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public String getPermission() {
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public ByteString getPermissionBytes() {
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public String getResource() {
        }

        @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
        public ByteString getResourceBytes() {
        }

        public Builder setGranted(boolean z) {
        }

        public Builder setPermission(String str) {
        }

        public Builder setPermissionBytes(ByteString byteString) {
        }

        public Builder setResource(String str) {
        }

        public Builder setResourceBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private AuthorizationInfo() {
    }

    static /* synthetic */ AuthorizationInfo access$000() {
    }

    static /* synthetic */ void access$100(AuthorizationInfo authorizationInfo, String str) {
    }

    static /* synthetic */ void access$200(AuthorizationInfo authorizationInfo) {
    }

    static /* synthetic */ void access$300(AuthorizationInfo authorizationInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$400(AuthorizationInfo authorizationInfo, String str) {
    }

    static /* synthetic */ void access$500(AuthorizationInfo authorizationInfo) {
    }

    static /* synthetic */ void access$600(AuthorizationInfo authorizationInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$700(AuthorizationInfo authorizationInfo, boolean z) {
    }

    static /* synthetic */ void access$800(AuthorizationInfo authorizationInfo) {
    }

    private void clearGranted() {
    }

    private void clearPermission() {
    }

    private void clearResource() {
    }

    public static AuthorizationInfo getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<AuthorizationInfo> parser() {
    }

    private void setGranted(boolean z) {
    }

    private void setPermission(String str) {
    }

    private void setPermissionBytes(ByteString byteString) {
    }

    private void setResource(String str) {
    }

    private void setResourceBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public boolean getGranted() {
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public String getPermission() {
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public ByteString getPermissionBytes() {
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public String getResource() {
    }

    @Override // com.google.cloud.audit.AuthorizationInfoOrBuilder
    public ByteString getResourceBytes() {
    }

    public static Builder newBuilder(AuthorizationInfo authorizationInfo) {
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthorizationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static AuthorizationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthorizationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static AuthorizationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
