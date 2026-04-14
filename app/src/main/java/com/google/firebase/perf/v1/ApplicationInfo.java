package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ApplicationInfo extends GeneratedMessageLite<ApplicationInfo, Builder> implements ApplicationInfoOrBuilder {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final ApplicationInfo DEFAULT_INSTANCE = null;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Parser<ApplicationInfo> PARSER;
    private AndroidApplicationInfo androidAppInfo_;
    private String appInstanceId_;
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_;
    private String googleAppId_;

    /* renamed from: com.google.firebase.perf.v1.ApplicationInfo$1 */
    static /* synthetic */ class C11831 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f118xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ApplicationInfo, Builder> implements ApplicationInfoOrBuilder {
        /* synthetic */ Builder(C11831 c11831) {
        }

        public Builder clearAndroidAppInfo() {
        }

        public Builder clearAppInstanceId() {
        }

        public Builder clearApplicationProcessState() {
        }

        public Builder clearCustomAttributes() {
        }

        public Builder clearGoogleAppId() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public boolean containsCustomAttributes(String str) {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public AndroidApplicationInfo getAndroidAppInfo() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public String getAppInstanceId() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public ByteString getAppInstanceIdBytes() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public ApplicationProcessState getApplicationProcessState() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        @Deprecated
        public Map<String, String> getCustomAttributes() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public int getCustomAttributesCount() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public Map<String, String> getCustomAttributesMap() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public String getCustomAttributesOrDefault(String str, String str2) {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public String getCustomAttributesOrThrow(String str) {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public String getGoogleAppId() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public ByteString getGoogleAppIdBytes() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public boolean hasAndroidAppInfo() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public boolean hasAppInstanceId() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public boolean hasApplicationProcessState() {
        }

        @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
        public boolean hasGoogleAppId() {
        }

        public Builder mergeAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        }

        public Builder putAllCustomAttributes(Map<String, String> map) {
        }

        public Builder putCustomAttributes(String str, String str2) {
        }

        public Builder removeCustomAttributes(String str) {
        }

        public Builder setAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        }

        public Builder setAppInstanceId(String str) {
        }

        public Builder setAppInstanceIdBytes(ByteString byteString) {
        }

        public Builder setApplicationProcessState(ApplicationProcessState applicationProcessState) {
        }

        public Builder setGoogleAppId(String str) {
        }

        public Builder setGoogleAppIdBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder setAndroidAppInfo(AndroidApplicationInfo.Builder builder) {
        }
    }

    private static final class CustomAttributesDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry = null;

        private CustomAttributesDefaultEntryHolder() {
        }
    }

    private ApplicationInfo() {
    }

    static /* synthetic */ ApplicationInfo access$000() {
    }

    static /* synthetic */ void access$100(ApplicationInfo applicationInfo, String str) {
    }

    static /* synthetic */ void access$1000(ApplicationInfo applicationInfo, ApplicationProcessState applicationProcessState) {
    }

    static /* synthetic */ void access$1100(ApplicationInfo applicationInfo) {
    }

    static /* synthetic */ Map access$1200(ApplicationInfo applicationInfo) {
    }

    static /* synthetic */ void access$200(ApplicationInfo applicationInfo) {
    }

    static /* synthetic */ void access$300(ApplicationInfo applicationInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$400(ApplicationInfo applicationInfo, String str) {
    }

    static /* synthetic */ void access$500(ApplicationInfo applicationInfo) {
    }

    static /* synthetic */ void access$600(ApplicationInfo applicationInfo, ByteString byteString) {
    }

    static /* synthetic */ void access$700(ApplicationInfo applicationInfo, AndroidApplicationInfo androidApplicationInfo) {
    }

    static /* synthetic */ void access$800(ApplicationInfo applicationInfo, AndroidApplicationInfo androidApplicationInfo) {
    }

    static /* synthetic */ void access$900(ApplicationInfo applicationInfo) {
    }

    private void clearAndroidAppInfo() {
    }

    private void clearAppInstanceId() {
    }

    private void clearApplicationProcessState() {
    }

    private void clearGoogleAppId() {
    }

    public static ApplicationInfo getDefaultInstance() {
    }

    private Map<String, String> getMutableCustomAttributesMap() {
    }

    private MapFieldLite<String, String> internalGetCustomAttributes() {
    }

    private MapFieldLite<String, String> internalGetMutableCustomAttributes() {
    }

    private void mergeAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
    }

    public static Builder newBuilder() {
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ApplicationInfo> parser() {
    }

    private void setAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
    }

    private void setAppInstanceId(String str) {
    }

    private void setAppInstanceIdBytes(ByteString byteString) {
    }

    private void setApplicationProcessState(ApplicationProcessState applicationProcessState) {
    }

    private void setGoogleAppId(String str) {
    }

    private void setGoogleAppIdBytes(ByteString byteString) {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public boolean containsCustomAttributes(String str) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public AndroidApplicationInfo getAndroidAppInfo() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public String getAppInstanceId() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public ByteString getAppInstanceIdBytes() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public ApplicationProcessState getApplicationProcessState() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    @Deprecated
    public Map<String, String> getCustomAttributes() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public int getCustomAttributesCount() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public Map<String, String> getCustomAttributesMap() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public String getCustomAttributesOrDefault(String str, String str2) {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public String getCustomAttributesOrThrow(String str) {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public String getGoogleAppId() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public ByteString getGoogleAppIdBytes() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public boolean hasAndroidAppInfo() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public boolean hasAppInstanceId() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public boolean hasApplicationProcessState() {
    }

    @Override // com.google.firebase.perf.v1.ApplicationInfoOrBuilder
    public boolean hasGoogleAppId() {
    }

    public static Builder newBuilder(ApplicationInfo applicationInfo) {
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ApplicationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static ApplicationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ApplicationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ApplicationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ApplicationInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static ApplicationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ApplicationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ApplicationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
