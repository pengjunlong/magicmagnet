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
public final class ResourceReference extends GeneratedMessageLite<ResourceReference, Builder> implements ResourceReferenceOrBuilder {
    public static final int CHILD_TYPE_FIELD_NUMBER = 2;
    private static final ResourceReference DEFAULT_INSTANCE = null;
    private static volatile Parser<ResourceReference> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String childType_;
    private String type_;

    /* renamed from: com.google.api.ResourceReference$1 */
    static /* synthetic */ class C05921 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f86xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ResourceReference, Builder> implements ResourceReferenceOrBuilder {
        /* synthetic */ Builder(C05921 c05921) {
        }

        public Builder clearChildType() {
        }

        public Builder clearType() {
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public String getChildType() {
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public ByteString getChildTypeBytes() {
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public String getType() {
        }

        @Override // com.google.api.ResourceReferenceOrBuilder
        public ByteString getTypeBytes() {
        }

        public Builder setChildType(String str) {
        }

        public Builder setChildTypeBytes(ByteString byteString) {
        }

        public Builder setType(String str) {
        }

        public Builder setTypeBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private ResourceReference() {
    }

    static /* synthetic */ ResourceReference access$000() {
    }

    static /* synthetic */ void access$100(ResourceReference resourceReference, String str) {
    }

    static /* synthetic */ void access$200(ResourceReference resourceReference) {
    }

    static /* synthetic */ void access$300(ResourceReference resourceReference, ByteString byteString) {
    }

    static /* synthetic */ void access$400(ResourceReference resourceReference, String str) {
    }

    static /* synthetic */ void access$500(ResourceReference resourceReference) {
    }

    static /* synthetic */ void access$600(ResourceReference resourceReference, ByteString byteString) {
    }

    private void clearChildType() {
    }

    private void clearType() {
    }

    public static ResourceReference getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ResourceReference> parser() {
    }

    private void setChildType(String str) {
    }

    private void setChildTypeBytes(ByteString byteString) {
    }

    private void setType(String str) {
    }

    private void setTypeBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.ResourceReferenceOrBuilder
    public String getChildType() {
    }

    @Override // com.google.api.ResourceReferenceOrBuilder
    public ByteString getChildTypeBytes() {
    }

    @Override // com.google.api.ResourceReferenceOrBuilder
    public String getType() {
    }

    @Override // com.google.api.ResourceReferenceOrBuilder
    public ByteString getTypeBytes() {
    }

    public static Builder newBuilder(ResourceReference resourceReference) {
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ResourceReference parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static ResourceReference parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ResourceReference parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ResourceReference parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ResourceReference parseFrom(InputStream inputStream) throws IOException {
    }

    public static ResourceReference parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ResourceReference parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ResourceReference parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
