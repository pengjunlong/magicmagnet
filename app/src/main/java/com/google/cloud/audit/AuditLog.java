package com.google.cloud.audit;

import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.RequestMetadata;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class AuditLog extends GeneratedMessageLite<AuditLog, Builder> implements AuditLogOrBuilder {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    private static final AuditLog DEFAULT_INSTANCE = null;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile Parser<AuditLog> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private AuthenticationInfo authenticationInfo_;
    private Internal.ProtobufList<AuthorizationInfo> authorizationInfo_;
    private String methodName_;
    private long numResponseItems_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private String resourceName_;
    private Struct response_;
    private Any serviceData_;
    private String serviceName_;
    private Status status_;

    /* renamed from: com.google.cloud.audit.AuditLog$1 */
    static /* synthetic */ class C06001 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f94xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuditLog, Builder> implements AuditLogOrBuilder {
        /* synthetic */ Builder(C06001 c06001) {
        }

        public Builder addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
        }

        public Builder addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
        }

        public Builder clearAuthenticationInfo() {
        }

        public Builder clearAuthorizationInfo() {
        }

        public Builder clearMethodName() {
        }

        public Builder clearNumResponseItems() {
        }

        public Builder clearRequest() {
        }

        public Builder clearRequestMetadata() {
        }

        public Builder clearResourceName() {
        }

        public Builder clearResponse() {
        }

        public Builder clearServiceData() {
        }

        public Builder clearServiceName() {
        }

        public Builder clearStatus() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public AuthenticationInfo getAuthenticationInfo() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public AuthorizationInfo getAuthorizationInfo(int i) {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public int getAuthorizationInfoCount() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public List<AuthorizationInfo> getAuthorizationInfoList() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public String getMethodName() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public ByteString getMethodNameBytes() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public long getNumResponseItems() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public Struct getRequest() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public RequestMetadata getRequestMetadata() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public String getResourceName() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public ByteString getResourceNameBytes() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public Struct getResponse() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public Any getServiceData() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public String getServiceName() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public ByteString getServiceNameBytes() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public Status getStatus() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasAuthenticationInfo() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasRequest() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasRequestMetadata() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasResponse() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasServiceData() {
        }

        @Override // com.google.cloud.audit.AuditLogOrBuilder
        public boolean hasStatus() {
        }

        public Builder mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        }

        public Builder mergeRequest(Struct struct) {
        }

        public Builder mergeRequestMetadata(RequestMetadata requestMetadata) {
        }

        public Builder mergeResponse(Struct struct) {
        }

        public Builder mergeServiceData(Any any) {
        }

        public Builder mergeStatus(Status status) {
        }

        public Builder removeAuthorizationInfo(int i) {
        }

        public Builder setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        }

        public Builder setAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
        }

        public Builder setMethodName(String str) {
        }

        public Builder setMethodNameBytes(ByteString byteString) {
        }

        public Builder setNumResponseItems(long j) {
        }

        public Builder setRequest(Struct struct) {
        }

        public Builder setRequestMetadata(RequestMetadata requestMetadata) {
        }

        public Builder setResourceName(String str) {
        }

        public Builder setResourceNameBytes(ByteString byteString) {
        }

        public Builder setResponse(Struct struct) {
        }

        public Builder setServiceData(Any any) {
        }

        public Builder setServiceName(String str) {
        }

        public Builder setServiceNameBytes(ByteString byteString) {
        }

        public Builder setStatus(Status status) {
        }

        private Builder() {
        }

        public Builder addAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
        }

        public Builder setAuthenticationInfo(AuthenticationInfo.Builder builder) {
        }

        public Builder setAuthorizationInfo(int i, AuthorizationInfo.Builder builder) {
        }

        public Builder setRequest(Struct.Builder builder) {
        }

        public Builder setRequestMetadata(RequestMetadata.Builder builder) {
        }

        public Builder setResponse(Struct.Builder builder) {
        }

        public Builder setServiceData(Any.Builder builder) {
        }

        public Builder setStatus(Status.Builder builder) {
        }

        public Builder addAuthorizationInfo(AuthorizationInfo.Builder builder) {
        }

        public Builder addAuthorizationInfo(int i, AuthorizationInfo.Builder builder) {
        }
    }

    private AuditLog() {
    }

    static /* synthetic */ AuditLog access$000() {
    }

    static /* synthetic */ void access$100(AuditLog auditLog, String str) {
    }

    static /* synthetic */ void access$1000(AuditLog auditLog, long j) {
    }

    static /* synthetic */ void access$1100(AuditLog auditLog) {
    }

    static /* synthetic */ void access$1200(AuditLog auditLog, Status status) {
    }

    static /* synthetic */ void access$1300(AuditLog auditLog, Status status) {
    }

    static /* synthetic */ void access$1400(AuditLog auditLog) {
    }

    static /* synthetic */ void access$1500(AuditLog auditLog, AuthenticationInfo authenticationInfo) {
    }

    static /* synthetic */ void access$1600(AuditLog auditLog, AuthenticationInfo authenticationInfo) {
    }

    static /* synthetic */ void access$1700(AuditLog auditLog) {
    }

    static /* synthetic */ void access$1800(AuditLog auditLog, int i, AuthorizationInfo authorizationInfo) {
    }

    static /* synthetic */ void access$1900(AuditLog auditLog, AuthorizationInfo authorizationInfo) {
    }

    static /* synthetic */ void access$200(AuditLog auditLog) {
    }

    static /* synthetic */ void access$2000(AuditLog auditLog, int i, AuthorizationInfo authorizationInfo) {
    }

    static /* synthetic */ void access$2100(AuditLog auditLog, Iterable iterable) {
    }

    static /* synthetic */ void access$2200(AuditLog auditLog) {
    }

    static /* synthetic */ void access$2300(AuditLog auditLog, int i) {
    }

    static /* synthetic */ void access$2400(AuditLog auditLog, RequestMetadata requestMetadata) {
    }

    static /* synthetic */ void access$2500(AuditLog auditLog, RequestMetadata requestMetadata) {
    }

    static /* synthetic */ void access$2600(AuditLog auditLog) {
    }

    static /* synthetic */ void access$2700(AuditLog auditLog, Struct struct) {
    }

    static /* synthetic */ void access$2800(AuditLog auditLog, Struct struct) {
    }

    static /* synthetic */ void access$2900(AuditLog auditLog) {
    }

    static /* synthetic */ void access$300(AuditLog auditLog, ByteString byteString) {
    }

    static /* synthetic */ void access$3000(AuditLog auditLog, Struct struct) {
    }

    static /* synthetic */ void access$3100(AuditLog auditLog, Struct struct) {
    }

    static /* synthetic */ void access$3200(AuditLog auditLog) {
    }

    static /* synthetic */ void access$3300(AuditLog auditLog, Any any) {
    }

    static /* synthetic */ void access$3400(AuditLog auditLog, Any any) {
    }

    static /* synthetic */ void access$3500(AuditLog auditLog) {
    }

    static /* synthetic */ void access$400(AuditLog auditLog, String str) {
    }

    static /* synthetic */ void access$500(AuditLog auditLog) {
    }

    static /* synthetic */ void access$600(AuditLog auditLog, ByteString byteString) {
    }

    static /* synthetic */ void access$700(AuditLog auditLog, String str) {
    }

    static /* synthetic */ void access$800(AuditLog auditLog) {
    }

    static /* synthetic */ void access$900(AuditLog auditLog, ByteString byteString) {
    }

    private void addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
    }

    private void addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
    }

    private void clearAuthenticationInfo() {
    }

    private void clearAuthorizationInfo() {
    }

    private void clearMethodName() {
    }

    private void clearNumResponseItems() {
    }

    private void clearRequest() {
    }

    private void clearRequestMetadata() {
    }

    private void clearResourceName() {
    }

    private void clearResponse() {
    }

    private void clearServiceData() {
    }

    private void clearServiceName() {
    }

    private void clearStatus() {
    }

    private void ensureAuthorizationInfoIsMutable() {
    }

    public static AuditLog getDefaultInstance() {
    }

    private void mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
    }

    private void mergeRequest(Struct struct) {
    }

    private void mergeRequestMetadata(RequestMetadata requestMetadata) {
    }

    private void mergeResponse(Struct struct) {
    }

    private void mergeServiceData(Any any) {
    }

    private void mergeStatus(Status status) {
    }

    public static Builder newBuilder() {
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<AuditLog> parser() {
    }

    private void removeAuthorizationInfo(int i) {
    }

    private void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
    }

    private void setAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
    }

    private void setMethodName(String str) {
    }

    private void setMethodNameBytes(ByteString byteString) {
    }

    private void setNumResponseItems(long j) {
    }

    private void setRequest(Struct struct) {
    }

    private void setRequestMetadata(RequestMetadata requestMetadata) {
    }

    private void setResourceName(String str) {
    }

    private void setResourceNameBytes(ByteString byteString) {
    }

    private void setResponse(Struct struct) {
    }

    private void setServiceData(Any any) {
    }

    private void setServiceName(String str) {
    }

    private void setServiceNameBytes(ByteString byteString) {
    }

    private void setStatus(Status status) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public AuthenticationInfo getAuthenticationInfo() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public AuthorizationInfo getAuthorizationInfo(int i) {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public int getAuthorizationInfoCount() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public List<AuthorizationInfo> getAuthorizationInfoList() {
    }

    public AuthorizationInfoOrBuilder getAuthorizationInfoOrBuilder(int i) {
    }

    public List<? extends AuthorizationInfoOrBuilder> getAuthorizationInfoOrBuilderList() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public String getMethodName() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public ByteString getMethodNameBytes() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public long getNumResponseItems() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public Struct getRequest() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public RequestMetadata getRequestMetadata() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public String getResourceName() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public ByteString getResourceNameBytes() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public Struct getResponse() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public Any getServiceData() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public String getServiceName() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public ByteString getServiceNameBytes() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public Status getStatus() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasAuthenticationInfo() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasRequest() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasRequestMetadata() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasResponse() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasServiceData() {
    }

    @Override // com.google.cloud.audit.AuditLogOrBuilder
    public boolean hasStatus() {
    }

    public static Builder newBuilder(AuditLog auditLog) {
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuditLog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addAuthorizationInfo(int i, AuthorizationInfo authorizationInfo) {
    }

    public static AuditLog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuditLog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static AuditLog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuditLog parseFrom(InputStream inputStream) throws IOException {
    }

    public static AuditLog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuditLog parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static AuditLog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
