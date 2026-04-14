package com.google.api;

import com.google.api.JwtLocation;
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
public final class AuthProvider extends GeneratedMessageLite<AuthProvider, Builder> implements AuthProviderOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final AuthProvider DEFAULT_INSTANCE = null;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile Parser<AuthProvider> PARSER;
    private String audiences_;
    private String authorizationUrl_;
    private String id_;
    private String issuer_;
    private String jwksUri_;
    private Internal.ProtobufList<JwtLocation> jwtLocations_;

    /* renamed from: com.google.api.AuthProvider$1 */
    static /* synthetic */ class C05461 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f49xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AuthProvider, Builder> implements AuthProviderOrBuilder {
        /* synthetic */ Builder(C05461 c05461) {
        }

        public Builder addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
        }

        public Builder addJwtLocations(JwtLocation jwtLocation) {
        }

        public Builder clearAudiences() {
        }

        public Builder clearAuthorizationUrl() {
        }

        public Builder clearId() {
        }

        public Builder clearIssuer() {
        }

        public Builder clearJwksUri() {
        }

        public Builder clearJwtLocations() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getAudiences() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getAudiencesBytes() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getAuthorizationUrl() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getAuthorizationUrlBytes() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getId() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getIdBytes() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getIssuer() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getIssuerBytes() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public String getJwksUri() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public ByteString getJwksUriBytes() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public JwtLocation getJwtLocations(int i) {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public int getJwtLocationsCount() {
        }

        @Override // com.google.api.AuthProviderOrBuilder
        public List<JwtLocation> getJwtLocationsList() {
        }

        public Builder removeJwtLocations(int i) {
        }

        public Builder setAudiences(String str) {
        }

        public Builder setAudiencesBytes(ByteString byteString) {
        }

        public Builder setAuthorizationUrl(String str) {
        }

        public Builder setAuthorizationUrlBytes(ByteString byteString) {
        }

        public Builder setId(String str) {
        }

        public Builder setIdBytes(ByteString byteString) {
        }

        public Builder setIssuer(String str) {
        }

        public Builder setIssuerBytes(ByteString byteString) {
        }

        public Builder setJwksUri(String str) {
        }

        public Builder setJwksUriBytes(ByteString byteString) {
        }

        public Builder setJwtLocations(int i, JwtLocation jwtLocation) {
        }

        private Builder() {
        }

        public Builder addJwtLocations(int i, JwtLocation jwtLocation) {
        }

        public Builder setJwtLocations(int i, JwtLocation.Builder builder) {
        }

        public Builder addJwtLocations(JwtLocation.Builder builder) {
        }

        public Builder addJwtLocations(int i, JwtLocation.Builder builder) {
        }
    }

    private AuthProvider() {
    }

    static /* synthetic */ AuthProvider access$000() {
    }

    static /* synthetic */ void access$100(AuthProvider authProvider, String str) {
    }

    static /* synthetic */ void access$1000(AuthProvider authProvider, String str) {
    }

    static /* synthetic */ void access$1100(AuthProvider authProvider) {
    }

    static /* synthetic */ void access$1200(AuthProvider authProvider, ByteString byteString) {
    }

    static /* synthetic */ void access$1300(AuthProvider authProvider, String str) {
    }

    static /* synthetic */ void access$1400(AuthProvider authProvider) {
    }

    static /* synthetic */ void access$1500(AuthProvider authProvider, ByteString byteString) {
    }

    static /* synthetic */ void access$1600(AuthProvider authProvider, int i, JwtLocation jwtLocation) {
    }

    static /* synthetic */ void access$1700(AuthProvider authProvider, JwtLocation jwtLocation) {
    }

    static /* synthetic */ void access$1800(AuthProvider authProvider, int i, JwtLocation jwtLocation) {
    }

    static /* synthetic */ void access$1900(AuthProvider authProvider, Iterable iterable) {
    }

    static /* synthetic */ void access$200(AuthProvider authProvider) {
    }

    static /* synthetic */ void access$2000(AuthProvider authProvider) {
    }

    static /* synthetic */ void access$2100(AuthProvider authProvider, int i) {
    }

    static /* synthetic */ void access$300(AuthProvider authProvider, ByteString byteString) {
    }

    static /* synthetic */ void access$400(AuthProvider authProvider, String str) {
    }

    static /* synthetic */ void access$500(AuthProvider authProvider) {
    }

    static /* synthetic */ void access$600(AuthProvider authProvider, ByteString byteString) {
    }

    static /* synthetic */ void access$700(AuthProvider authProvider, String str) {
    }

    static /* synthetic */ void access$800(AuthProvider authProvider) {
    }

    static /* synthetic */ void access$900(AuthProvider authProvider, ByteString byteString) {
    }

    private void addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
    }

    private void addJwtLocations(JwtLocation jwtLocation) {
    }

    private void clearAudiences() {
    }

    private void clearAuthorizationUrl() {
    }

    private void clearId() {
    }

    private void clearIssuer() {
    }

    private void clearJwksUri() {
    }

    private void clearJwtLocations() {
    }

    private void ensureJwtLocationsIsMutable() {
    }

    public static AuthProvider getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<AuthProvider> parser() {
    }

    private void removeJwtLocations(int i) {
    }

    private void setAudiences(String str) {
    }

    private void setAudiencesBytes(ByteString byteString) {
    }

    private void setAuthorizationUrl(String str) {
    }

    private void setAuthorizationUrlBytes(ByteString byteString) {
    }

    private void setId(String str) {
    }

    private void setIdBytes(ByteString byteString) {
    }

    private void setIssuer(String str) {
    }

    private void setIssuerBytes(ByteString byteString) {
    }

    private void setJwksUri(String str) {
    }

    private void setJwksUriBytes(ByteString byteString) {
    }

    private void setJwtLocations(int i, JwtLocation jwtLocation) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getAudiences() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getAudiencesBytes() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getAuthorizationUrl() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getAuthorizationUrlBytes() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getId() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getIdBytes() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getIssuer() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getIssuerBytes() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public String getJwksUri() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public ByteString getJwksUriBytes() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public JwtLocation getJwtLocations(int i) {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public int getJwtLocationsCount() {
    }

    @Override // com.google.api.AuthProviderOrBuilder
    public List<JwtLocation> getJwtLocationsList() {
    }

    public JwtLocationOrBuilder getJwtLocationsOrBuilder(int i) {
    }

    public List<? extends JwtLocationOrBuilder> getJwtLocationsOrBuilderList() {
    }

    public static Builder newBuilder(AuthProvider authProvider) {
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthProvider parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addJwtLocations(int i, JwtLocation jwtLocation) {
    }

    public static AuthProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthProvider parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static AuthProvider parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AuthProvider parseFrom(InputStream inputStream) throws IOException {
    }

    public static AuthProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
