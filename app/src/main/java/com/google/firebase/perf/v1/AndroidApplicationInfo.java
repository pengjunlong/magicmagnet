package com.google.firebase.perf.v1;

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
public final class AndroidApplicationInfo extends GeneratedMessageLite<AndroidApplicationInfo, Builder> implements AndroidApplicationInfoOrBuilder {
    private static final AndroidApplicationInfo DEFAULT_INSTANCE = null;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<AndroidApplicationInfo> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_;
    private String sdkVersion_;
    private String versionName_;

    /* renamed from: com.google.firebase.perf.v1.AndroidApplicationInfo$1 */
    static /* synthetic */ class C11811 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f116xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AndroidApplicationInfo, Builder> implements AndroidApplicationInfoOrBuilder {
        /* synthetic */ Builder(C11811 c11811) {
        }

        public Builder clearPackageName() {
        }

        public Builder clearSdkVersion() {
        }

        public Builder clearVersionName() {
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public String getPackageName() {
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public ByteString getPackageNameBytes() {
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public String getSdkVersion() {
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public ByteString getSdkVersionBytes() {
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public String getVersionName() {
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public ByteString getVersionNameBytes() {
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public boolean hasPackageName() {
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public boolean hasSdkVersion() {
        }

        @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
        public boolean hasVersionName() {
        }

        public Builder setPackageName(String str) {
        }

        public Builder setPackageNameBytes(ByteString byteString) {
        }

        public Builder setSdkVersion(String str) {
        }

        public Builder setSdkVersionBytes(ByteString byteString) {
        }

        public Builder setVersionName(String str) {
        }

        public Builder setVersionNameBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    private AndroidApplicationInfo() {
    }

    static /* synthetic */ AndroidApplicationInfo access$000() {
    }

    static /* synthetic */ void access$100(AndroidApplicationInfo androidApplicationInfo, String str) {
    }

    static /* synthetic */ void access$200(AndroidApplicationInfo androidApplicationInfo) {
    }

    static /* synthetic */ void access$300(AndroidApplicationInfo androidApplicationInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$400(AndroidApplicationInfo androidApplicationInfo, String str) {
    }

    static /* synthetic */ void access$500(AndroidApplicationInfo androidApplicationInfo) {
    }

    static /* synthetic */ void access$600(AndroidApplicationInfo androidApplicationInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$700(AndroidApplicationInfo androidApplicationInfo, String str) {
    }

    static /* synthetic */ void access$800(AndroidApplicationInfo androidApplicationInfo) {
    }

    static /* synthetic */ void access$900(AndroidApplicationInfo androidApplicationInfo, ByteString byteString) {
    }

    private void clearPackageName() {
    }

    private void clearSdkVersion() {
    }

    private void clearVersionName() {
    }

    public static AndroidApplicationInfo getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<AndroidApplicationInfo> parser() {
    }

    private void setPackageName(String str) {
    }

    private void setPackageNameBytes(ByteString byteString) {
    }

    private void setSdkVersion(String str) {
    }

    private void setSdkVersionBytes(ByteString byteString) {
    }

    private void setVersionName(String str) {
    }

    private void setVersionNameBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public String getPackageName() {
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public ByteString getPackageNameBytes() {
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public String getSdkVersion() {
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public ByteString getSdkVersionBytes() {
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public String getVersionName() {
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public ByteString getVersionNameBytes() {
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public boolean hasPackageName() {
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public boolean hasSdkVersion() {
    }

    @Override // com.google.firebase.perf.v1.AndroidApplicationInfoOrBuilder
    public boolean hasVersionName() {
    }

    public static Builder newBuilder(AndroidApplicationInfo androidApplicationInfo) {
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AndroidApplicationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static AndroidApplicationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static AndroidApplicationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static AndroidApplicationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
