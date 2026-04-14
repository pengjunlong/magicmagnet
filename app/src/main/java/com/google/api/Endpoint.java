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
public final class Endpoint extends GeneratedMessageLite<Endpoint, Builder> implements EndpointOrBuilder {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    private static final Endpoint DEFAULT_INSTANCE = null;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Endpoint> PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 101;
    private Internal.ProtobufList<String> aliases_;
    private boolean allowCors_;
    private Internal.ProtobufList<String> features_;
    private String name_;
    private String target_;

    /* renamed from: com.google.api.Endpoint$1 */
    static /* synthetic */ class C05631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f64xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Endpoint, Builder> implements EndpointOrBuilder {
        /* synthetic */ Builder(C05631 c05631) {
        }

        @Deprecated
        public Builder addAliases(String str) {
        }

        @Deprecated
        public Builder addAliasesBytes(ByteString byteString) {
        }

        @Deprecated
        public Builder addAllAliases(Iterable<String> iterable) {
        }

        public Builder addAllFeatures(Iterable<String> iterable) {
        }

        public Builder addFeatures(String str) {
        }

        public Builder addFeaturesBytes(ByteString byteString) {
        }

        @Deprecated
        public Builder clearAliases() {
        }

        public Builder clearAllowCors() {
        }

        public Builder clearFeatures() {
        }

        public Builder clearName() {
        }

        public Builder clearTarget() {
        }

        @Override // com.google.api.EndpointOrBuilder
        @Deprecated
        public String getAliases(int i) {
        }

        @Override // com.google.api.EndpointOrBuilder
        @Deprecated
        public ByteString getAliasesBytes(int i) {
        }

        @Override // com.google.api.EndpointOrBuilder
        @Deprecated
        public int getAliasesCount() {
        }

        @Override // com.google.api.EndpointOrBuilder
        @Deprecated
        public List<String> getAliasesList() {
        }

        @Override // com.google.api.EndpointOrBuilder
        public boolean getAllowCors() {
        }

        @Override // com.google.api.EndpointOrBuilder
        public String getFeatures(int i) {
        }

        @Override // com.google.api.EndpointOrBuilder
        public ByteString getFeaturesBytes(int i) {
        }

        @Override // com.google.api.EndpointOrBuilder
        public int getFeaturesCount() {
        }

        @Override // com.google.api.EndpointOrBuilder
        public List<String> getFeaturesList() {
        }

        @Override // com.google.api.EndpointOrBuilder
        public String getName() {
        }

        @Override // com.google.api.EndpointOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.api.EndpointOrBuilder
        public String getTarget() {
        }

        @Override // com.google.api.EndpointOrBuilder
        public ByteString getTargetBytes() {
        }

        @Deprecated
        public Builder setAliases(int i, String str) {
        }

        public Builder setAllowCors(boolean z) {
        }

        public Builder setFeatures(int i, String str) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setTarget(String str) {
        }

        public Builder setTargetBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private Endpoint() {
    }

    static /* synthetic */ Endpoint access$000() {
    }

    static /* synthetic */ void access$100(Endpoint endpoint, String str) {
    }

    static /* synthetic */ void access$1000(Endpoint endpoint, String str) {
    }

    static /* synthetic */ void access$1100(Endpoint endpoint, Iterable iterable) {
    }

    static /* synthetic */ void access$1200(Endpoint endpoint) {
    }

    static /* synthetic */ void access$1300(Endpoint endpoint, ByteString byteString) {
    }

    static /* synthetic */ void access$1400(Endpoint endpoint, String str) {
    }

    static /* synthetic */ void access$1500(Endpoint endpoint) {
    }

    static /* synthetic */ void access$1600(Endpoint endpoint, ByteString byteString) {
    }

    static /* synthetic */ void access$1700(Endpoint endpoint, boolean z) {
    }

    static /* synthetic */ void access$1800(Endpoint endpoint) {
    }

    static /* synthetic */ void access$200(Endpoint endpoint) {
    }

    static /* synthetic */ void access$300(Endpoint endpoint, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Endpoint endpoint, int i, String str) {
    }

    static /* synthetic */ void access$500(Endpoint endpoint, String str) {
    }

    static /* synthetic */ void access$600(Endpoint endpoint, Iterable iterable) {
    }

    static /* synthetic */ void access$700(Endpoint endpoint) {
    }

    static /* synthetic */ void access$800(Endpoint endpoint, ByteString byteString) {
    }

    static /* synthetic */ void access$900(Endpoint endpoint, int i, String str) {
    }

    private void addAliases(String str) {
    }

    private void addAliasesBytes(ByteString byteString) {
    }

    private void addAllAliases(Iterable<String> iterable) {
    }

    private void addAllFeatures(Iterable<String> iterable) {
    }

    private void addFeatures(String str) {
    }

    private void addFeaturesBytes(ByteString byteString) {
    }

    private void clearAliases() {
    }

    private void clearAllowCors() {
    }

    private void clearFeatures() {
    }

    private void clearName() {
    }

    private void clearTarget() {
    }

    private void ensureAliasesIsMutable() {
    }

    private void ensureFeaturesIsMutable() {
    }

    public static Endpoint getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Endpoint> parser() {
    }

    private void setAliases(int i, String str) {
    }

    private void setAllowCors(boolean z) {
    }

    private void setFeatures(int i, String str) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setTarget(String str) {
    }

    private void setTargetBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.EndpointOrBuilder
    @Deprecated
    public String getAliases(int i) {
    }

    @Override // com.google.api.EndpointOrBuilder
    @Deprecated
    public ByteString getAliasesBytes(int i) {
    }

    @Override // com.google.api.EndpointOrBuilder
    @Deprecated
    public int getAliasesCount() {
    }

    @Override // com.google.api.EndpointOrBuilder
    @Deprecated
    public List<String> getAliasesList() {
    }

    @Override // com.google.api.EndpointOrBuilder
    public boolean getAllowCors() {
    }

    @Override // com.google.api.EndpointOrBuilder
    public String getFeatures(int i) {
    }

    @Override // com.google.api.EndpointOrBuilder
    public ByteString getFeaturesBytes(int i) {
    }

    @Override // com.google.api.EndpointOrBuilder
    public int getFeaturesCount() {
    }

    @Override // com.google.api.EndpointOrBuilder
    public List<String> getFeaturesList() {
    }

    @Override // com.google.api.EndpointOrBuilder
    public String getName() {
    }

    @Override // com.google.api.EndpointOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.api.EndpointOrBuilder
    public String getTarget() {
    }

    @Override // com.google.api.EndpointOrBuilder
    public ByteString getTargetBytes() {
    }

    public static Builder newBuilder(Endpoint endpoint) {
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Endpoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Endpoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Endpoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Endpoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Endpoint parseFrom(InputStream inputStream) throws IOException {
    }

    public static Endpoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Endpoint parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Endpoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
