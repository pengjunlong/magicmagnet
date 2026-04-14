package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class AttributeContext extends GeneratedMessageLite<AttributeContext, Builder> implements AttributeContextOrBuilder {
    public static final int API_FIELD_NUMBER = 6;
    private static final AttributeContext DEFAULT_INSTANCE = null;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile Parser<AttributeContext> PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private Api api_;
    private Peer destination_;
    private Peer origin_;
    private Request request_;
    private Resource resource_;
    private Response response_;
    private Peer source_;

    /* renamed from: com.google.rpc.context.AttributeContext$1 */
    static /* synthetic */ class C13641 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f176xa1df5c61 = null;
    }

    public static final class Api extends GeneratedMessageLite<Api, Builder> implements ApiOrBuilder {
        private static final Api DEFAULT_INSTANCE = null;
        public static final int OPERATION_FIELD_NUMBER = 2;
        private static volatile Parser<Api> PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private String operation_;
        private String protocol_;
        private String service_;
        private String version_;

        public static final class Builder extends GeneratedMessageLite.Builder<Api, Builder> implements ApiOrBuilder {
            /* synthetic */ Builder(C13641 c13641) {
            }

            public Builder clearOperation() {
            }

            public Builder clearProtocol() {
            }

            public Builder clearService() {
            }

            public Builder clearVersion() {
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getOperation() {
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getOperationBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getProtocol() {
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getProtocolBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getService() {
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getServiceBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public String getVersion() {
            }

            @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
            public ByteString getVersionBytes() {
            }

            public Builder setOperation(String str) {
            }

            public Builder setOperationBytes(ByteString byteString) {
            }

            public Builder setProtocol(String str) {
            }

            public Builder setProtocolBytes(ByteString byteString) {
            }

            public Builder setService(String str) {
            }

            public Builder setServiceBytes(ByteString byteString) {
            }

            public Builder setVersion(String str) {
            }

            public Builder setVersionBytes(ByteString byteString) {
            }

            private Builder() {
            }
        }

        private Api() {
        }

        static /* synthetic */ Api access$1400() {
        }

        static /* synthetic */ void access$1500(Api api, String str) {
        }

        static /* synthetic */ void access$1600(Api api) {
        }

        static /* synthetic */ void access$1700(Api api, ByteString byteString) {
        }

        static /* synthetic */ void access$1800(Api api, String str) {
        }

        static /* synthetic */ void access$1900(Api api) {
        }

        static /* synthetic */ void access$2000(Api api, ByteString byteString) {
        }

        static /* synthetic */ void access$2100(Api api, String str) {
        }

        static /* synthetic */ void access$2200(Api api) {
        }

        static /* synthetic */ void access$2300(Api api, ByteString byteString) {
        }

        static /* synthetic */ void access$2400(Api api, String str) {
        }

        static /* synthetic */ void access$2500(Api api) {
        }

        static /* synthetic */ void access$2600(Api api, ByteString byteString) {
        }

        private void clearOperation() {
        }

        private void clearProtocol() {
        }

        private void clearService() {
        }

        private void clearVersion() {
        }

        public static Api getDefaultInstance() {
        }

        public static Builder newBuilder() {
        }

        public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<Api> parser() {
        }

        private void setOperation(String str) {
        }

        private void setOperationBytes(ByteString byteString) {
        }

        private void setProtocol(String str) {
        }

        private void setProtocolBytes(ByteString byteString) {
        }

        private void setService(String str) {
        }

        private void setServiceBytes(ByteString byteString) {
        }

        private void setVersion(String str) {
        }

        private void setVersionBytes(ByteString byteString) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getOperation() {
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getOperationBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getProtocol() {
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getProtocolBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getService() {
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getServiceBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public String getVersion() {
        }

        @Override // com.google.rpc.context.AttributeContext.ApiOrBuilder
        public ByteString getVersionBytes() {
        }

        public static Builder newBuilder(Api api) {
        }

        public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static Api parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Api parseFrom(InputStream inputStream) throws IOException {
        }

        public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Api parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface ApiOrBuilder extends MessageLiteOrBuilder {
        String getOperation();

        ByteString getOperationBytes();

        String getProtocol();

        ByteString getProtocolBytes();

        String getService();

        ByteString getServiceBytes();

        String getVersion();

        ByteString getVersionBytes();
    }

    public static final class Auth extends GeneratedMessageLite<Auth, Builder> implements AuthOrBuilder {
        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        private static final Auth DEFAULT_INSTANCE = null;
        private static volatile Parser<Auth> PARSER = null;
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> accessLevels_;
        private Internal.ProtobufList<String> audiences_;
        private Struct claims_;
        private String presenter_;
        private String principal_;

        public static final class Builder extends GeneratedMessageLite.Builder<Auth, Builder> implements AuthOrBuilder {
            /* synthetic */ Builder(C13641 c13641) {
            }

            public Builder addAccessLevels(String str) {
            }

            public Builder addAccessLevelsBytes(ByteString byteString) {
            }

            public Builder addAllAccessLevels(Iterable<String> iterable) {
            }

            public Builder addAllAudiences(Iterable<String> iterable) {
            }

            public Builder addAudiences(String str) {
            }

            public Builder addAudiencesBytes(ByteString byteString) {
            }

            public Builder clearAccessLevels() {
            }

            public Builder clearAudiences() {
            }

            public Builder clearClaims() {
            }

            public Builder clearPresenter() {
            }

            public Builder clearPrincipal() {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getAccessLevels(int i) {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getAccessLevelsBytes(int i) {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public int getAccessLevelsCount() {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public List<String> getAccessLevelsList() {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getAudiences(int i) {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getAudiencesBytes(int i) {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public int getAudiencesCount() {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public List<String> getAudiencesList() {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public Struct getClaims() {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getPresenter() {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getPresenterBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public String getPrincipal() {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public ByteString getPrincipalBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
            public boolean hasClaims() {
            }

            public Builder mergeClaims(Struct struct) {
            }

            public Builder setAccessLevels(int i, String str) {
            }

            public Builder setAudiences(int i, String str) {
            }

            public Builder setClaims(Struct struct) {
            }

            public Builder setPresenter(String str) {
            }

            public Builder setPresenterBytes(ByteString byteString) {
            }

            public Builder setPrincipal(String str) {
            }

            public Builder setPrincipalBytes(ByteString byteString) {
            }

            private Builder() {
            }

            public Builder setClaims(Struct.Builder builder) {
            }
        }

        private Auth() {
        }

        static /* synthetic */ Auth access$2800() {
        }

        static /* synthetic */ void access$2900(Auth auth, String str) {
        }

        static /* synthetic */ void access$3000(Auth auth) {
        }

        static /* synthetic */ void access$3100(Auth auth, ByteString byteString) {
        }

        static /* synthetic */ void access$3200(Auth auth, int i, String str) {
        }

        static /* synthetic */ void access$3300(Auth auth, String str) {
        }

        static /* synthetic */ void access$3400(Auth auth, Iterable iterable) {
        }

        static /* synthetic */ void access$3500(Auth auth) {
        }

        static /* synthetic */ void access$3600(Auth auth, ByteString byteString) {
        }

        static /* synthetic */ void access$3700(Auth auth, String str) {
        }

        static /* synthetic */ void access$3800(Auth auth) {
        }

        static /* synthetic */ void access$3900(Auth auth, ByteString byteString) {
        }

        static /* synthetic */ void access$4000(Auth auth, Struct struct) {
        }

        static /* synthetic */ void access$4100(Auth auth, Struct struct) {
        }

        static /* synthetic */ void access$4200(Auth auth) {
        }

        static /* synthetic */ void access$4300(Auth auth, int i, String str) {
        }

        static /* synthetic */ void access$4400(Auth auth, String str) {
        }

        static /* synthetic */ void access$4500(Auth auth, Iterable iterable) {
        }

        static /* synthetic */ void access$4600(Auth auth) {
        }

        static /* synthetic */ void access$4700(Auth auth, ByteString byteString) {
        }

        private void addAccessLevels(String str) {
        }

        private void addAccessLevelsBytes(ByteString byteString) {
        }

        private void addAllAccessLevels(Iterable<String> iterable) {
        }

        private void addAllAudiences(Iterable<String> iterable) {
        }

        private void addAudiences(String str) {
        }

        private void addAudiencesBytes(ByteString byteString) {
        }

        private void clearAccessLevels() {
        }

        private void clearAudiences() {
        }

        private void clearClaims() {
        }

        private void clearPresenter() {
        }

        private void clearPrincipal() {
        }

        private void ensureAccessLevelsIsMutable() {
        }

        private void ensureAudiencesIsMutable() {
        }

        public static Auth getDefaultInstance() {
        }

        private void mergeClaims(Struct struct) {
        }

        public static Builder newBuilder() {
        }

        public static Auth parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static Auth parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<Auth> parser() {
        }

        private void setAccessLevels(int i, String str) {
        }

        private void setAudiences(int i, String str) {
        }

        private void setClaims(Struct struct) {
        }

        private void setPresenter(String str) {
        }

        private void setPresenterBytes(ByteString byteString) {
        }

        private void setPrincipal(String str) {
        }

        private void setPrincipalBytes(ByteString byteString) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getAccessLevels(int i) {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getAccessLevelsBytes(int i) {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public int getAccessLevelsCount() {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public List<String> getAccessLevelsList() {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getAudiences(int i) {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getAudiencesBytes(int i) {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public int getAudiencesCount() {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public List<String> getAudiencesList() {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public Struct getClaims() {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getPresenter() {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getPresenterBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public String getPrincipal() {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public ByteString getPrincipalBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.AuthOrBuilder
        public boolean hasClaims() {
        }

        public static Builder newBuilder(Auth auth) {
        }

        public static Auth parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Auth parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Auth parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static Auth parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Auth parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static Auth parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Auth parseFrom(InputStream inputStream) throws IOException {
        }

        public static Auth parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Auth parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static Auth parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface AuthOrBuilder extends MessageLiteOrBuilder {
        String getAccessLevels(int i);

        ByteString getAccessLevelsBytes(int i);

        int getAccessLevelsCount();

        List<String> getAccessLevelsList();

        String getAudiences(int i);

        ByteString getAudiencesBytes(int i);

        int getAudiencesCount();

        List<String> getAudiencesList();

        Struct getClaims();

        String getPresenter();

        ByteString getPresenterBytes();

        String getPrincipal();

        ByteString getPrincipalBytes();

        boolean hasClaims();
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AttributeContext, Builder> implements AttributeContextOrBuilder {
        /* synthetic */ Builder(C13641 c13641) {
        }

        public Builder clearApi() {
        }

        public Builder clearDestination() {
        }

        public Builder clearOrigin() {
        }

        public Builder clearRequest() {
        }

        public Builder clearResource() {
        }

        public Builder clearResponse() {
        }

        public Builder clearSource() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Api getApi() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Peer getDestination() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Peer getOrigin() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Request getRequest() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Resource getResource() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Response getResponse() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public Peer getSource() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasApi() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasDestination() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasOrigin() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasRequest() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasResource() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasResponse() {
        }

        @Override // com.google.rpc.context.AttributeContextOrBuilder
        public boolean hasSource() {
        }

        public Builder mergeApi(Api api) {
        }

        public Builder mergeDestination(Peer peer) {
        }

        public Builder mergeOrigin(Peer peer) {
        }

        public Builder mergeRequest(Request request) {
        }

        public Builder mergeResource(Resource resource) {
        }

        public Builder mergeResponse(Response response) {
        }

        public Builder mergeSource(Peer peer) {
        }

        public Builder setApi(Api api) {
        }

        public Builder setDestination(Peer peer) {
        }

        public Builder setOrigin(Peer peer) {
        }

        public Builder setRequest(Request request) {
        }

        public Builder setResource(Resource resource) {
        }

        public Builder setResponse(Response response) {
        }

        public Builder setSource(Peer peer) {
        }

        private Builder() {
        }

        public Builder setApi(Api.Builder builder) {
        }

        public Builder setDestination(Peer.Builder builder) {
        }

        public Builder setOrigin(Peer.Builder builder) {
        }

        public Builder setRequest(Request.Builder builder) {
        }

        public Builder setResource(Resource.Builder builder) {
        }

        public Builder setResponse(Response.Builder builder) {
        }

        public Builder setSource(Peer.Builder builder) {
        }
    }

    public static final class Peer extends GeneratedMessageLite<Peer, Builder> implements PeerOrBuilder {
        private static final Peer DEFAULT_INSTANCE = null;
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        private static volatile Parser<Peer> PARSER = null;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private String ip_;
        private MapFieldLite<String, String> labels_;
        private long port_;
        private String principal_;
        private String regionCode_;

        public static final class Builder extends GeneratedMessageLite.Builder<Peer, Builder> implements PeerOrBuilder {
            /* synthetic */ Builder(C13641 c13641) {
            }

            public Builder clearIp() {
            }

            public Builder clearLabels() {
            }

            public Builder clearPort() {
            }

            public Builder clearPrincipal() {
            }

            public Builder clearRegionCode() {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public boolean containsLabels(String str) {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getIp() {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public ByteString getIpBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            @Deprecated
            public Map<String, String> getLabels() {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public int getLabelsCount() {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public Map<String, String> getLabelsMap() {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getLabelsOrDefault(String str, String str2) {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getLabelsOrThrow(String str) {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public long getPort() {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getPrincipal() {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public ByteString getPrincipalBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public String getRegionCode() {
            }

            @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
            public ByteString getRegionCodeBytes() {
            }

            public Builder putAllLabels(Map<String, String> map) {
            }

            public Builder putLabels(String str, String str2) {
            }

            public Builder removeLabels(String str) {
            }

            public Builder setIp(String str) {
            }

            public Builder setIpBytes(ByteString byteString) {
            }

            public Builder setPort(long j) {
            }

            public Builder setPrincipal(String str) {
            }

            public Builder setPrincipalBytes(ByteString byteString) {
            }

            public Builder setRegionCode(String str) {
            }

            public Builder setRegionCodeBytes(ByteString byteString) {
            }

            private Builder() {
            }
        }

        private static final class LabelsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry = null;

            private LabelsDefaultEntryHolder() {
            }
        }

        private Peer() {
        }

        static /* synthetic */ Peer access$000() {
        }

        static /* synthetic */ void access$100(Peer peer, String str) {
        }

        static /* synthetic */ void access$1000(Peer peer, String str) {
        }

        static /* synthetic */ void access$1100(Peer peer) {
        }

        static /* synthetic */ void access$1200(Peer peer, ByteString byteString) {
        }

        static /* synthetic */ void access$200(Peer peer) {
        }

        static /* synthetic */ void access$300(Peer peer, ByteString byteString) {
        }

        static /* synthetic */ void access$400(Peer peer, long j) {
        }

        static /* synthetic */ void access$500(Peer peer) {
        }

        static /* synthetic */ Map access$600(Peer peer) {
        }

        static /* synthetic */ void access$700(Peer peer, String str) {
        }

        static /* synthetic */ void access$800(Peer peer) {
        }

        static /* synthetic */ void access$900(Peer peer, ByteString byteString) {
        }

        private void clearIp() {
        }

        private void clearPort() {
        }

        private void clearPrincipal() {
        }

        private void clearRegionCode() {
        }

        public static Peer getDefaultInstance() {
        }

        private Map<String, String> getMutableLabelsMap() {
        }

        private MapFieldLite<String, String> internalGetLabels() {
        }

        private MapFieldLite<String, String> internalGetMutableLabels() {
        }

        public static Builder newBuilder() {
        }

        public static Peer parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static Peer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<Peer> parser() {
        }

        private void setIp(String str) {
        }

        private void setIpBytes(ByteString byteString) {
        }

        private void setPort(long j) {
        }

        private void setPrincipal(String str) {
        }

        private void setPrincipalBytes(ByteString byteString) {
        }

        private void setRegionCode(String str) {
        }

        private void setRegionCodeBytes(ByteString byteString) {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public boolean containsLabels(String str) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getIp() {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public ByteString getIpBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        @Deprecated
        public Map<String, String> getLabels() {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public int getLabelsCount() {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public Map<String, String> getLabelsMap() {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getLabelsOrDefault(String str, String str2) {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getLabelsOrThrow(String str) {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public long getPort() {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getPrincipal() {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public ByteString getPrincipalBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public String getRegionCode() {
        }

        @Override // com.google.rpc.context.AttributeContext.PeerOrBuilder
        public ByteString getRegionCodeBytes() {
        }

        public static Builder newBuilder(Peer peer) {
        }

        public static Peer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Peer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Peer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static Peer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Peer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static Peer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Peer parseFrom(InputStream inputStream) throws IOException {
        }

        public static Peer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Peer parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static Peer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface PeerOrBuilder extends MessageLiteOrBuilder {
        boolean containsLabels(String str);

        String getIp();

        ByteString getIpBytes();

        @Deprecated
        Map<String, String> getLabels();

        int getLabelsCount();

        Map<String, String> getLabelsMap();

        String getLabelsOrDefault(String str, String str2);

        String getLabelsOrThrow(String str);

        long getPort();

        String getPrincipal();

        ByteString getPrincipalBytes();

        String getRegionCode();

        ByteString getRegionCodeBytes();
    }

    public static final class Request extends GeneratedMessageLite<Request, Builder> implements RequestOrBuilder {
        public static final int AUTH_FIELD_NUMBER = 13;
        private static final Request DEFAULT_INSTANCE = null;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile Parser<Request> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private Auth auth_;
        private MapFieldLite<String, String> headers_;
        private String host_;
        private String id_;
        private String method_;
        private String path_;
        private String protocol_;
        private String query_;
        private String reason_;
        private String scheme_;
        private long size_;
        private Timestamp time_;

        public static final class Builder extends GeneratedMessageLite.Builder<Request, Builder> implements RequestOrBuilder {
            /* synthetic */ Builder(C13641 c13641) {
            }

            public Builder clearAuth() {
            }

            public Builder clearHeaders() {
            }

            public Builder clearHost() {
            }

            public Builder clearId() {
            }

            public Builder clearMethod() {
            }

            public Builder clearPath() {
            }

            public Builder clearProtocol() {
            }

            public Builder clearQuery() {
            }

            public Builder clearReason() {
            }

            public Builder clearScheme() {
            }

            public Builder clearSize() {
            }

            public Builder clearTime() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public boolean containsHeaders(String str) {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public Auth getAuth() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            @Deprecated
            public Map<String, String> getHeaders() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public int getHeadersCount() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public Map<String, String> getHeadersMap() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getHeadersOrDefault(String str, String str2) {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getHeadersOrThrow(String str) {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getHost() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getHostBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getId() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getIdBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getMethod() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getMethodBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getPath() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getPathBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getProtocol() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getProtocolBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getQuery() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getQueryBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getReason() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getReasonBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public String getScheme() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public ByteString getSchemeBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public long getSize() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public Timestamp getTime() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public boolean hasAuth() {
            }

            @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
            public boolean hasTime() {
            }

            public Builder mergeAuth(Auth auth) {
            }

            public Builder mergeTime(Timestamp timestamp) {
            }

            public Builder putAllHeaders(Map<String, String> map) {
            }

            public Builder putHeaders(String str, String str2) {
            }

            public Builder removeHeaders(String str) {
            }

            public Builder setAuth(Auth auth) {
            }

            public Builder setHost(String str) {
            }

            public Builder setHostBytes(ByteString byteString) {
            }

            public Builder setId(String str) {
            }

            public Builder setIdBytes(ByteString byteString) {
            }

            public Builder setMethod(String str) {
            }

            public Builder setMethodBytes(ByteString byteString) {
            }

            public Builder setPath(String str) {
            }

            public Builder setPathBytes(ByteString byteString) {
            }

            public Builder setProtocol(String str) {
            }

            public Builder setProtocolBytes(ByteString byteString) {
            }

            public Builder setQuery(String str) {
            }

            public Builder setQueryBytes(ByteString byteString) {
            }

            public Builder setReason(String str) {
            }

            public Builder setReasonBytes(ByteString byteString) {
            }

            public Builder setScheme(String str) {
            }

            public Builder setSchemeBytes(ByteString byteString) {
            }

            public Builder setSize(long j) {
            }

            public Builder setTime(Timestamp timestamp) {
            }

            private Builder() {
            }

            public Builder setAuth(Auth.Builder builder) {
            }

            public Builder setTime(Timestamp.Builder builder) {
            }
        }

        private static final class HeadersDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry = null;

            private HeadersDefaultEntryHolder() {
            }
        }

        private Request() {
        }

        static /* synthetic */ Request access$4900() {
        }

        static /* synthetic */ void access$5000(Request request, String str) {
        }

        static /* synthetic */ void access$5100(Request request) {
        }

        static /* synthetic */ void access$5200(Request request, ByteString byteString) {
        }

        static /* synthetic */ void access$5300(Request request, String str) {
        }

        static /* synthetic */ void access$5400(Request request) {
        }

        static /* synthetic */ void access$5500(Request request, ByteString byteString) {
        }

        static /* synthetic */ Map access$5600(Request request) {
        }

        static /* synthetic */ void access$5700(Request request, String str) {
        }

        static /* synthetic */ void access$5800(Request request) {
        }

        static /* synthetic */ void access$5900(Request request, ByteString byteString) {
        }

        static /* synthetic */ void access$6000(Request request, String str) {
        }

        static /* synthetic */ void access$6100(Request request) {
        }

        static /* synthetic */ void access$6200(Request request, ByteString byteString) {
        }

        static /* synthetic */ void access$6300(Request request, String str) {
        }

        static /* synthetic */ void access$6400(Request request) {
        }

        static /* synthetic */ void access$6500(Request request, ByteString byteString) {
        }

        static /* synthetic */ void access$6600(Request request, String str) {
        }

        static /* synthetic */ void access$6700(Request request) {
        }

        static /* synthetic */ void access$6800(Request request, ByteString byteString) {
        }

        static /* synthetic */ void access$6900(Request request, Timestamp timestamp) {
        }

        static /* synthetic */ void access$7000(Request request, Timestamp timestamp) {
        }

        static /* synthetic */ void access$7100(Request request) {
        }

        static /* synthetic */ void access$7200(Request request, long j) {
        }

        static /* synthetic */ void access$7300(Request request) {
        }

        static /* synthetic */ void access$7400(Request request, String str) {
        }

        static /* synthetic */ void access$7500(Request request) {
        }

        static /* synthetic */ void access$7600(Request request, ByteString byteString) {
        }

        static /* synthetic */ void access$7700(Request request, String str) {
        }

        static /* synthetic */ void access$7800(Request request) {
        }

        static /* synthetic */ void access$7900(Request request, ByteString byteString) {
        }

        static /* synthetic */ void access$8000(Request request, Auth auth) {
        }

        static /* synthetic */ void access$8100(Request request, Auth auth) {
        }

        static /* synthetic */ void access$8200(Request request) {
        }

        private void clearAuth() {
        }

        private void clearHost() {
        }

        private void clearId() {
        }

        private void clearMethod() {
        }

        private void clearPath() {
        }

        private void clearProtocol() {
        }

        private void clearQuery() {
        }

        private void clearReason() {
        }

        private void clearScheme() {
        }

        private void clearSize() {
        }

        private void clearTime() {
        }

        public static Request getDefaultInstance() {
        }

        private Map<String, String> getMutableHeadersMap() {
        }

        private MapFieldLite<String, String> internalGetHeaders() {
        }

        private MapFieldLite<String, String> internalGetMutableHeaders() {
        }

        private void mergeAuth(Auth auth) {
        }

        private void mergeTime(Timestamp timestamp) {
        }

        public static Builder newBuilder() {
        }

        public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<Request> parser() {
        }

        private void setAuth(Auth auth) {
        }

        private void setHost(String str) {
        }

        private void setHostBytes(ByteString byteString) {
        }

        private void setId(String str) {
        }

        private void setIdBytes(ByteString byteString) {
        }

        private void setMethod(String str) {
        }

        private void setMethodBytes(ByteString byteString) {
        }

        private void setPath(String str) {
        }

        private void setPathBytes(ByteString byteString) {
        }

        private void setProtocol(String str) {
        }

        private void setProtocolBytes(ByteString byteString) {
        }

        private void setQuery(String str) {
        }

        private void setQueryBytes(ByteString byteString) {
        }

        private void setReason(String str) {
        }

        private void setReasonBytes(ByteString byteString) {
        }

        private void setScheme(String str) {
        }

        private void setSchemeBytes(ByteString byteString) {
        }

        private void setSize(long j) {
        }

        private void setTime(Timestamp timestamp) {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public boolean containsHeaders(String str) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public Auth getAuth() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        @Deprecated
        public Map<String, String> getHeaders() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public int getHeadersCount() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public Map<String, String> getHeadersMap() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getHeadersOrDefault(String str, String str2) {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getHeadersOrThrow(String str) {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getHost() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getHostBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getId() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getIdBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getMethod() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getMethodBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getPath() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getPathBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getProtocol() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getProtocolBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getQuery() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getQueryBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getReason() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getReasonBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public String getScheme() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public ByteString getSchemeBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public long getSize() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public Timestamp getTime() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public boolean hasAuth() {
        }

        @Override // com.google.rpc.context.AttributeContext.RequestOrBuilder
        public boolean hasTime() {
        }

        public static Builder newBuilder(Request request) {
        }

        public static Request parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Request parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static Request parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static Request parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Request parseFrom(InputStream inputStream) throws IOException {
        }

        public static Request parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Request parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static Request parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface RequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsHeaders(String str);

        Auth getAuth();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        String getHost();

        ByteString getHostBytes();

        String getId();

        ByteString getIdBytes();

        String getMethod();

        ByteString getMethodBytes();

        String getPath();

        ByteString getPathBytes();

        String getProtocol();

        ByteString getProtocolBytes();

        String getQuery();

        ByteString getQueryBytes();

        String getReason();

        ByteString getReasonBytes();

        String getScheme();

        ByteString getSchemeBytes();

        long getSize();

        Timestamp getTime();

        boolean hasAuth();

        boolean hasTime();
    }

    public static final class Resource extends GeneratedMessageLite<Resource, Builder> implements ResourceOrBuilder {
        private static final Resource DEFAULT_INSTANCE = null;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<Resource> PARSER = null;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private MapFieldLite<String, String> labels_;
        private String name_;
        private String service_;
        private String type_;

        public static final class Builder extends GeneratedMessageLite.Builder<Resource, Builder> implements ResourceOrBuilder {
            /* synthetic */ Builder(C13641 c13641) {
            }

            public Builder clearLabels() {
            }

            public Builder clearName() {
            }

            public Builder clearService() {
            }

            public Builder clearType() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public boolean containsLabels(String str) {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            @Deprecated
            public Map<String, String> getLabels() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public int getLabelsCount() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public Map<String, String> getLabelsMap() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getLabelsOrDefault(String str, String str2) {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getLabelsOrThrow(String str) {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getName() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getNameBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getService() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getServiceBytes() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public String getType() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
            public ByteString getTypeBytes() {
            }

            public Builder putAllLabels(Map<String, String> map) {
            }

            public Builder putLabels(String str, String str2) {
            }

            public Builder removeLabels(String str) {
            }

            public Builder setName(String str) {
            }

            public Builder setNameBytes(ByteString byteString) {
            }

            public Builder setService(String str) {
            }

            public Builder setServiceBytes(ByteString byteString) {
            }

            public Builder setType(String str) {
            }

            public Builder setTypeBytes(ByteString byteString) {
            }

            private Builder() {
            }
        }

        private static final class LabelsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry = null;

            private LabelsDefaultEntryHolder() {
            }
        }

        private Resource() {
        }

        static /* synthetic */ void access$10000(Resource resource, ByteString byteString) {
        }

        static /* synthetic */ void access$10100(Resource resource, String str) {
        }

        static /* synthetic */ void access$10200(Resource resource) {
        }

        static /* synthetic */ void access$10300(Resource resource, ByteString byteString) {
        }

        static /* synthetic */ Map access$10400(Resource resource) {
        }

        static /* synthetic */ Resource access$9400() {
        }

        static /* synthetic */ void access$9500(Resource resource, String str) {
        }

        static /* synthetic */ void access$9600(Resource resource) {
        }

        static /* synthetic */ void access$9700(Resource resource, ByteString byteString) {
        }

        static /* synthetic */ void access$9800(Resource resource, String str) {
        }

        static /* synthetic */ void access$9900(Resource resource) {
        }

        private void clearName() {
        }

        private void clearService() {
        }

        private void clearType() {
        }

        public static Resource getDefaultInstance() {
        }

        private Map<String, String> getMutableLabelsMap() {
        }

        private MapFieldLite<String, String> internalGetLabels() {
        }

        private MapFieldLite<String, String> internalGetMutableLabels() {
        }

        public static Builder newBuilder() {
        }

        public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static Resource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<Resource> parser() {
        }

        private void setName(String str) {
        }

        private void setNameBytes(ByteString byteString) {
        }

        private void setService(String str) {
        }

        private void setServiceBytes(ByteString byteString) {
        }

        private void setType(String str) {
        }

        private void setTypeBytes(ByteString byteString) {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public boolean containsLabels(String str) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        @Deprecated
        public Map<String, String> getLabels() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public int getLabelsCount() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public Map<String, String> getLabelsMap() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getLabelsOrDefault(String str, String str2) {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getLabelsOrThrow(String str) {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getName() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getService() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getServiceBytes() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public String getType() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResourceOrBuilder
        public ByteString getTypeBytes() {
        }

        public static Builder newBuilder(Resource resource) {
        }

        public static Resource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Resource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Resource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static Resource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Resource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static Resource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Resource parseFrom(InputStream inputStream) throws IOException {
        }

        public static Resource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Resource parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static Resource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface ResourceOrBuilder extends MessageLiteOrBuilder {
        boolean containsLabels(String str);

        @Deprecated
        Map<String, String> getLabels();

        int getLabelsCount();

        Map<String, String> getLabelsMap();

        String getLabelsOrDefault(String str, String str2);

        String getLabelsOrThrow(String str);

        String getName();

        ByteString getNameBytes();

        String getService();

        ByteString getServiceBytes();

        String getType();

        ByteString getTypeBytes();
    }

    public static final class Response extends GeneratedMessageLite<Response, Builder> implements ResponseOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Response DEFAULT_INSTANCE = null;
        public static final int HEADERS_FIELD_NUMBER = 3;
        private static volatile Parser<Response> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private long code_;
        private MapFieldLite<String, String> headers_;
        private long size_;
        private Timestamp time_;

        public static final class Builder extends GeneratedMessageLite.Builder<Response, Builder> implements ResponseOrBuilder {
            /* synthetic */ Builder(C13641 c13641) {
            }

            public Builder clearCode() {
            }

            public Builder clearHeaders() {
            }

            public Builder clearSize() {
            }

            public Builder clearTime() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public boolean containsHeaders(String str) {
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public long getCode() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            @Deprecated
            public Map<String, String> getHeaders() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public int getHeadersCount() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public Map<String, String> getHeadersMap() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public String getHeadersOrDefault(String str, String str2) {
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public String getHeadersOrThrow(String str) {
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public long getSize() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public Timestamp getTime() {
            }

            @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
            public boolean hasTime() {
            }

            public Builder mergeTime(Timestamp timestamp) {
            }

            public Builder putAllHeaders(Map<String, String> map) {
            }

            public Builder putHeaders(String str, String str2) {
            }

            public Builder removeHeaders(String str) {
            }

            public Builder setCode(long j) {
            }

            public Builder setSize(long j) {
            }

            public Builder setTime(Timestamp timestamp) {
            }

            private Builder() {
            }

            public Builder setTime(Timestamp.Builder builder) {
            }
        }

        private static final class HeadersDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry = null;

            private HeadersDefaultEntryHolder() {
            }
        }

        private Response() {
        }

        static /* synthetic */ Response access$8400() {
        }

        static /* synthetic */ void access$8500(Response response, long j) {
        }

        static /* synthetic */ void access$8600(Response response) {
        }

        static /* synthetic */ void access$8700(Response response, long j) {
        }

        static /* synthetic */ void access$8800(Response response) {
        }

        static /* synthetic */ Map access$8900(Response response) {
        }

        static /* synthetic */ void access$9000(Response response, Timestamp timestamp) {
        }

        static /* synthetic */ void access$9100(Response response, Timestamp timestamp) {
        }

        static /* synthetic */ void access$9200(Response response) {
        }

        private void clearCode() {
        }

        private void clearSize() {
        }

        private void clearTime() {
        }

        public static Response getDefaultInstance() {
        }

        private Map<String, String> getMutableHeadersMap() {
        }

        private MapFieldLite<String, String> internalGetHeaders() {
        }

        private MapFieldLite<String, String> internalGetMutableHeaders() {
        }

        private void mergeTime(Timestamp timestamp) {
        }

        public static Builder newBuilder() {
        }

        public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
        }

        public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        }

        public static Parser<Response> parser() {
        }

        private void setCode(long j) {
        }

        private void setSize(long j) {
        }

        private void setTime(Timestamp timestamp) {
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public boolean containsHeaders(String str) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public long getCode() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        @Deprecated
        public Map<String, String> getHeaders() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public int getHeadersCount() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public Map<String, String> getHeadersMap() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public String getHeadersOrDefault(String str, String str2) {
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public String getHeadersOrThrow(String str) {
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public long getSize() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public Timestamp getTime() {
        }

        @Override // com.google.rpc.context.AttributeContext.ResponseOrBuilder
        public boolean hasTime() {
        }

        public static Builder newBuilder(Response response) {
        }

        public static Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        }

        public static Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        }

        public static Response parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        }

        public static Response parseFrom(InputStream inputStream) throws IOException {
        }

        public static Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }

        public static Response parseFrom(CodedInputStream codedInputStream) throws IOException {
        }

        public static Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        }
    }

    public interface ResponseOrBuilder extends MessageLiteOrBuilder {
        boolean containsHeaders(String str);

        long getCode();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        long getSize();

        Timestamp getTime();

        boolean hasTime();
    }

    private AttributeContext() {
    }

    static /* synthetic */ AttributeContext access$10600() {
    }

    static /* synthetic */ void access$10700(AttributeContext attributeContext, Peer peer) {
    }

    static /* synthetic */ void access$10800(AttributeContext attributeContext, Peer peer) {
    }

    static /* synthetic */ void access$10900(AttributeContext attributeContext) {
    }

    static /* synthetic */ void access$11000(AttributeContext attributeContext, Peer peer) {
    }

    static /* synthetic */ void access$11100(AttributeContext attributeContext, Peer peer) {
    }

    static /* synthetic */ void access$11200(AttributeContext attributeContext) {
    }

    static /* synthetic */ void access$11300(AttributeContext attributeContext, Peer peer) {
    }

    static /* synthetic */ void access$11400(AttributeContext attributeContext, Peer peer) {
    }

    static /* synthetic */ void access$11500(AttributeContext attributeContext) {
    }

    static /* synthetic */ void access$11600(AttributeContext attributeContext, Request request) {
    }

    static /* synthetic */ void access$11700(AttributeContext attributeContext, Request request) {
    }

    static /* synthetic */ void access$11800(AttributeContext attributeContext) {
    }

    static /* synthetic */ void access$11900(AttributeContext attributeContext, Response response) {
    }

    static /* synthetic */ void access$12000(AttributeContext attributeContext, Response response) {
    }

    static /* synthetic */ void access$12100(AttributeContext attributeContext) {
    }

    static /* synthetic */ void access$12200(AttributeContext attributeContext, Resource resource) {
    }

    static /* synthetic */ void access$12300(AttributeContext attributeContext, Resource resource) {
    }

    static /* synthetic */ void access$12400(AttributeContext attributeContext) {
    }

    static /* synthetic */ void access$12500(AttributeContext attributeContext, Api api) {
    }

    static /* synthetic */ void access$12600(AttributeContext attributeContext, Api api) {
    }

    static /* synthetic */ void access$12700(AttributeContext attributeContext) {
    }

    private void clearApi() {
    }

    private void clearDestination() {
    }

    private void clearOrigin() {
    }

    private void clearRequest() {
    }

    private void clearResource() {
    }

    private void clearResponse() {
    }

    private void clearSource() {
    }

    public static AttributeContext getDefaultInstance() {
    }

    private void mergeApi(Api api) {
    }

    private void mergeDestination(Peer peer) {
    }

    private void mergeOrigin(Peer peer) {
    }

    private void mergeRequest(Request request) {
    }

    private void mergeResource(Resource resource) {
    }

    private void mergeResponse(Response response) {
    }

    private void mergeSource(Peer peer) {
    }

    public static Builder newBuilder() {
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<AttributeContext> parser() {
    }

    private void setApi(Api api) {
    }

    private void setDestination(Peer peer) {
    }

    private void setOrigin(Peer peer) {
    }

    private void setRequest(Request request) {
    }

    private void setResource(Resource resource) {
    }

    private void setResponse(Response response) {
    }

    private void setSource(Peer peer) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Api getApi() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Peer getDestination() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Peer getOrigin() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Request getRequest() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Resource getResource() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Response getResponse() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public Peer getSource() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasApi() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasDestination() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasOrigin() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasRequest() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasResource() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasResponse() {
    }

    @Override // com.google.rpc.context.AttributeContextOrBuilder
    public boolean hasSource() {
    }

    public static Builder newBuilder(AttributeContext attributeContext) {
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AttributeContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static AttributeContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AttributeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static AttributeContext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AttributeContext parseFrom(InputStream inputStream) throws IOException {
    }

    public static AttributeContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AttributeContext parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static AttributeContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
