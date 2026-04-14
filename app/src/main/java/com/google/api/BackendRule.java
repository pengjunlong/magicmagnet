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

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class BackendRule extends GeneratedMessageLite<BackendRule, Builder> implements BackendRuleOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final BackendRule DEFAULT_INSTANCE = null;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile Parser<BackendRule> PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String address_;
    private int authenticationCase_;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private String protocol_;
    private String selector_;

    /* renamed from: com.google.api.BackendRule$1 */
    static /* synthetic */ class C05511 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f54xa1df5c61 = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class AuthenticationCase {
        private static final /* synthetic */ AuthenticationCase[] $VALUES = null;
        public static final AuthenticationCase AUTHENTICATION_NOT_SET = null;
        public static final AuthenticationCase DISABLE_AUTH = null;
        public static final AuthenticationCase JWT_AUDIENCE = null;
        private final int value;

        private AuthenticationCase(String str, int i, int i2) {
        }

        public static AuthenticationCase forNumber(int i) {
        }

        public static AuthenticationCase valueOf(String str) {
        }

        public static AuthenticationCase[] values() {
        }

        public int getNumber() {
        }

        @Deprecated
        public static AuthenticationCase valueOf(int i) {
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BackendRule, Builder> implements BackendRuleOrBuilder {
        /* synthetic */ Builder(C05511 c05511) {
        }

        public Builder clearAddress() {
        }

        public Builder clearAuthentication() {
        }

        public Builder clearDeadline() {
        }

        public Builder clearDisableAuth() {
        }

        public Builder clearJwtAudience() {
        }

        public Builder clearMinDeadline() {
        }

        public Builder clearOperationDeadline() {
        }

        public Builder clearPathTranslation() {
        }

        public Builder clearProtocol() {
        }

        public Builder clearSelector() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public String getAddress() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public ByteString getAddressBytes() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public AuthenticationCase getAuthenticationCase() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public double getDeadline() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public boolean getDisableAuth() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public String getJwtAudience() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public ByteString getJwtAudienceBytes() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public double getMinDeadline() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public double getOperationDeadline() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public PathTranslation getPathTranslation() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public int getPathTranslationValue() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public String getProtocol() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public ByteString getProtocolBytes() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public String getSelector() {
        }

        @Override // com.google.api.BackendRuleOrBuilder
        public ByteString getSelectorBytes() {
        }

        public Builder setAddress(String str) {
        }

        public Builder setAddressBytes(ByteString byteString) {
        }

        public Builder setDeadline(double d) {
        }

        public Builder setDisableAuth(boolean z) {
        }

        public Builder setJwtAudience(String str) {
        }

        public Builder setJwtAudienceBytes(ByteString byteString) {
        }

        public Builder setMinDeadline(double d) {
        }

        public Builder setOperationDeadline(double d) {
        }

        public Builder setPathTranslation(PathTranslation pathTranslation) {
        }

        public Builder setPathTranslationValue(int i) {
        }

        public Builder setProtocol(String str) {
        }

        public Builder setProtocolBytes(ByteString byteString) {
        }

        public Builder setSelector(String str) {
        }

        public Builder setSelectorBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class PathTranslation implements Internal.EnumLite {
        private static final /* synthetic */ PathTranslation[] $VALUES = null;
        public static final PathTranslation APPEND_PATH_TO_ADDRESS = null;
        public static final int APPEND_PATH_TO_ADDRESS_VALUE = 2;
        public static final PathTranslation CONSTANT_ADDRESS = null;
        public static final int CONSTANT_ADDRESS_VALUE = 1;
        public static final PathTranslation PATH_TRANSLATION_UNSPECIFIED = null;
        public static final int PATH_TRANSLATION_UNSPECIFIED_VALUE = 0;
        public static final PathTranslation UNRECOGNIZED = null;
        private static final Internal.EnumLiteMap<PathTranslation> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.api.BackendRule$PathTranslation$1 */
        class C05521 implements Internal.EnumLiteMap<PathTranslation> {
            C05521() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ PathTranslation findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public PathTranslation findValueByNumber(int i) {
            }
        }

        private static final class PathTranslationVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private PathTranslationVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private PathTranslation(String str, int i, int i2) {
        }

        public static PathTranslation forNumber(int i) {
        }

        public static Internal.EnumLiteMap<PathTranslation> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static PathTranslation valueOf(String str) {
        }

        public static PathTranslation[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static PathTranslation valueOf(int i) {
        }
    }

    private BackendRule() {
    }

    static /* synthetic */ BackendRule access$000() {
    }

    static /* synthetic */ void access$100(BackendRule backendRule) {
    }

    static /* synthetic */ void access$1000(BackendRule backendRule, double d) {
    }

    static /* synthetic */ void access$1100(BackendRule backendRule) {
    }

    static /* synthetic */ void access$1200(BackendRule backendRule, double d) {
    }

    static /* synthetic */ void access$1300(BackendRule backendRule) {
    }

    static /* synthetic */ void access$1400(BackendRule backendRule, int i) {
    }

    static /* synthetic */ void access$1500(BackendRule backendRule, PathTranslation pathTranslation) {
    }

    static /* synthetic */ void access$1600(BackendRule backendRule) {
    }

    static /* synthetic */ void access$1700(BackendRule backendRule, String str) {
    }

    static /* synthetic */ void access$1800(BackendRule backendRule) {
    }

    static /* synthetic */ void access$1900(BackendRule backendRule, ByteString byteString) {
    }

    static /* synthetic */ void access$200(BackendRule backendRule, String str) {
    }

    static /* synthetic */ void access$2000(BackendRule backendRule, boolean z) {
    }

    static /* synthetic */ void access$2100(BackendRule backendRule) {
    }

    static /* synthetic */ void access$2200(BackendRule backendRule, String str) {
    }

    static /* synthetic */ void access$2300(BackendRule backendRule) {
    }

    static /* synthetic */ void access$2400(BackendRule backendRule, ByteString byteString) {
    }

    static /* synthetic */ void access$300(BackendRule backendRule) {
    }

    static /* synthetic */ void access$400(BackendRule backendRule, ByteString byteString) {
    }

    static /* synthetic */ void access$500(BackendRule backendRule, String str) {
    }

    static /* synthetic */ void access$600(BackendRule backendRule) {
    }

    static /* synthetic */ void access$700(BackendRule backendRule, ByteString byteString) {
    }

    static /* synthetic */ void access$800(BackendRule backendRule, double d) {
    }

    static /* synthetic */ void access$900(BackendRule backendRule) {
    }

    private void clearAddress() {
    }

    private void clearAuthentication() {
    }

    private void clearDeadline() {
    }

    private void clearDisableAuth() {
    }

    private void clearJwtAudience() {
    }

    private void clearMinDeadline() {
    }

    private void clearOperationDeadline() {
    }

    private void clearPathTranslation() {
    }

    private void clearProtocol() {
    }

    private void clearSelector() {
    }

    public static BackendRule getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<BackendRule> parser() {
    }

    private void setAddress(String str) {
    }

    private void setAddressBytes(ByteString byteString) {
    }

    private void setDeadline(double d) {
    }

    private void setDisableAuth(boolean z) {
    }

    private void setJwtAudience(String str) {
    }

    private void setJwtAudienceBytes(ByteString byteString) {
    }

    private void setMinDeadline(double d) {
    }

    private void setOperationDeadline(double d) {
    }

    private void setPathTranslation(PathTranslation pathTranslation) {
    }

    private void setPathTranslationValue(int i) {
    }

    private void setProtocol(String str) {
    }

    private void setProtocolBytes(ByteString byteString) {
    }

    private void setSelector(String str) {
    }

    private void setSelectorBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public String getAddress() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public ByteString getAddressBytes() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public AuthenticationCase getAuthenticationCase() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public double getDeadline() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public boolean getDisableAuth() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public String getJwtAudience() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public ByteString getJwtAudienceBytes() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public double getMinDeadline() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public double getOperationDeadline() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public PathTranslation getPathTranslation() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public int getPathTranslationValue() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public String getProtocol() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public ByteString getProtocolBytes() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public String getSelector() {
    }

    @Override // com.google.api.BackendRuleOrBuilder
    public ByteString getSelectorBytes() {
    }

    public static Builder newBuilder(BackendRule backendRule) {
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BackendRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static BackendRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BackendRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static BackendRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static BackendRule parseFrom(InputStream inputStream) throws IOException {
    }

    public static BackendRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static BackendRule parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static BackendRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
