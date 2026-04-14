package com.google.rpc;

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
public final class ResourceInfo extends GeneratedMessageLite<ResourceInfo, Builder> implements ResourceInfoOrBuilder {
    private static final ResourceInfo DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile Parser<ResourceInfo> PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String description_;
    private String owner_;
    private String resourceName_;
    private String resourceType_;

    /* renamed from: com.google.rpc.ResourceInfo$1 */
    static /* synthetic */ class C13611 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f173xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ResourceInfo, Builder> implements ResourceInfoOrBuilder {
        /* synthetic */ Builder(C13611 c13611) {
        }

        public Builder clearDescription() {
        }

        public Builder clearOwner() {
        }

        public Builder clearResourceName() {
        }

        public Builder clearResourceType() {
        }

        @Override // com.google.rpc.ResourceInfoOrBuilder
        public String getDescription() {
        }

        @Override // com.google.rpc.ResourceInfoOrBuilder
        public ByteString getDescriptionBytes() {
        }

        @Override // com.google.rpc.ResourceInfoOrBuilder
        public String getOwner() {
        }

        @Override // com.google.rpc.ResourceInfoOrBuilder
        public ByteString getOwnerBytes() {
        }

        @Override // com.google.rpc.ResourceInfoOrBuilder
        public String getResourceName() {
        }

        @Override // com.google.rpc.ResourceInfoOrBuilder
        public ByteString getResourceNameBytes() {
        }

        @Override // com.google.rpc.ResourceInfoOrBuilder
        public String getResourceType() {
        }

        @Override // com.google.rpc.ResourceInfoOrBuilder
        public ByteString getResourceTypeBytes() {
        }

        public Builder setDescription(String str) {
        }

        public Builder setDescriptionBytes(ByteString byteString) {
        }

        public Builder setOwner(String str) {
        }

        public Builder setOwnerBytes(ByteString byteString) {
        }

        public Builder setResourceName(String str) {
        }

        public Builder setResourceNameBytes(ByteString byteString) {
        }

        public Builder setResourceType(String str) {
        }

        public Builder setResourceTypeBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private ResourceInfo() {
    }

    static /* synthetic */ ResourceInfo access$000() {
    }

    static /* synthetic */ void access$100(ResourceInfo resourceInfo, String str) {
    }

    static /* synthetic */ void access$1000(ResourceInfo resourceInfo, String str) {
    }

    static /* synthetic */ void access$1100(ResourceInfo resourceInfo) {
    }

    static /* synthetic */ void access$1200(ResourceInfo resourceInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$200(ResourceInfo resourceInfo) {
    }

    static /* synthetic */ void access$300(ResourceInfo resourceInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$400(ResourceInfo resourceInfo, String str) {
    }

    static /* synthetic */ void access$500(ResourceInfo resourceInfo) {
    }

    static /* synthetic */ void access$600(ResourceInfo resourceInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$700(ResourceInfo resourceInfo, String str) {
    }

    static /* synthetic */ void access$800(ResourceInfo resourceInfo) {
    }

    static /* synthetic */ void access$900(ResourceInfo resourceInfo, ByteString byteString) {
    }

    private void clearDescription() {
    }

    private void clearOwner() {
    }

    private void clearResourceName() {
    }

    private void clearResourceType() {
    }

    public static ResourceInfo getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ResourceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ResourceInfo> parser() {
    }

    private void setDescription(String str) {
    }

    private void setDescriptionBytes(ByteString byteString) {
    }

    private void setOwner(String str) {
    }

    private void setOwnerBytes(ByteString byteString) {
    }

    private void setResourceName(String str) {
    }

    private void setResourceNameBytes(ByteString byteString) {
    }

    private void setResourceType(String str) {
    }

    private void setResourceTypeBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.rpc.ResourceInfoOrBuilder
    public String getDescription() {
    }

    @Override // com.google.rpc.ResourceInfoOrBuilder
    public ByteString getDescriptionBytes() {
    }

    @Override // com.google.rpc.ResourceInfoOrBuilder
    public String getOwner() {
    }

    @Override // com.google.rpc.ResourceInfoOrBuilder
    public ByteString getOwnerBytes() {
    }

    @Override // com.google.rpc.ResourceInfoOrBuilder
    public String getResourceName() {
    }

    @Override // com.google.rpc.ResourceInfoOrBuilder
    public ByteString getResourceNameBytes() {
    }

    @Override // com.google.rpc.ResourceInfoOrBuilder
    public String getResourceType() {
    }

    @Override // com.google.rpc.ResourceInfoOrBuilder
    public ByteString getResourceTypeBytes() {
    }

    public static Builder newBuilder(ResourceInfo resourceInfo) {
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ResourceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ResourceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static ResourceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ResourceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ResourceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ResourceInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static ResourceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ResourceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ResourceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
