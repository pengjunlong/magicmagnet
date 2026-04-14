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
public final class ResourceDescriptor extends GeneratedMessageLite<ResourceDescriptor, Builder> implements ResourceDescriptorOrBuilder {
    private static final ResourceDescriptor DEFAULT_INSTANCE = null;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile Parser<ResourceDescriptor> PARSER = null;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String nameField_;
    private Internal.ProtobufList<String> pattern_;
    private String plural_;
    private String singular_;
    private String type_;

    /* renamed from: com.google.api.ResourceDescriptor$1 */
    static /* synthetic */ class C05901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f85xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ResourceDescriptor, Builder> implements ResourceDescriptorOrBuilder {
        /* synthetic */ Builder(C05901 c05901) {
        }

        public Builder addAllPattern(Iterable<String> iterable) {
        }

        public Builder addPattern(String str) {
        }

        public Builder addPatternBytes(ByteString byteString) {
        }

        public Builder clearHistory() {
        }

        public Builder clearNameField() {
        }

        public Builder clearPattern() {
        }

        public Builder clearPlural() {
        }

        public Builder clearSingular() {
        }

        public Builder clearType() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public History getHistory() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public int getHistoryValue() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getNameField() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public ByteString getNameFieldBytes() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getPattern(int i) {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public ByteString getPatternBytes(int i) {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public int getPatternCount() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public List<String> getPatternList() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getPlural() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public ByteString getPluralBytes() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getSingular() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public ByteString getSingularBytes() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public String getType() {
        }

        @Override // com.google.api.ResourceDescriptorOrBuilder
        public ByteString getTypeBytes() {
        }

        public Builder setHistory(History history) {
        }

        public Builder setHistoryValue(int i) {
        }

        public Builder setNameField(String str) {
        }

        public Builder setNameFieldBytes(ByteString byteString) {
        }

        public Builder setPattern(int i, String str) {
        }

        public Builder setPlural(String str) {
        }

        public Builder setPluralBytes(ByteString byteString) {
        }

        public Builder setSingular(String str) {
        }

        public Builder setSingularBytes(ByteString byteString) {
        }

        public Builder setType(String str) {
        }

        public Builder setTypeBytes(ByteString byteString) {
        }

        private Builder() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class History implements Internal.EnumLite {
        private static final /* synthetic */ History[] $VALUES = null;
        public static final History FUTURE_MULTI_PATTERN = null;
        public static final int FUTURE_MULTI_PATTERN_VALUE = 2;
        public static final History HISTORY_UNSPECIFIED = null;
        public static final int HISTORY_UNSPECIFIED_VALUE = 0;
        public static final History ORIGINALLY_SINGLE_PATTERN = null;
        public static final int ORIGINALLY_SINGLE_PATTERN_VALUE = 1;
        public static final History UNRECOGNIZED = null;
        private static final Internal.EnumLiteMap<History> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.api.ResourceDescriptor$History$1 */
        class C05911 implements Internal.EnumLiteMap<History> {
            C05911() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ History findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public History findValueByNumber(int i) {
            }
        }

        private static final class HistoryVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private HistoryVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private History(String str, int i, int i2) {
        }

        public static History forNumber(int i) {
        }

        public static Internal.EnumLiteMap<History> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static History valueOf(String str) {
        }

        public static History[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static History valueOf(int i) {
        }
    }

    private ResourceDescriptor() {
    }

    static /* synthetic */ ResourceDescriptor access$000() {
    }

    static /* synthetic */ void access$100(ResourceDescriptor resourceDescriptor, String str) {
    }

    static /* synthetic */ void access$1000(ResourceDescriptor resourceDescriptor) {
    }

    static /* synthetic */ void access$1100(ResourceDescriptor resourceDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$1200(ResourceDescriptor resourceDescriptor, int i) {
    }

    static /* synthetic */ void access$1300(ResourceDescriptor resourceDescriptor, History history) {
    }

    static /* synthetic */ void access$1400(ResourceDescriptor resourceDescriptor) {
    }

    static /* synthetic */ void access$1500(ResourceDescriptor resourceDescriptor, String str) {
    }

    static /* synthetic */ void access$1600(ResourceDescriptor resourceDescriptor) {
    }

    static /* synthetic */ void access$1700(ResourceDescriptor resourceDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$1800(ResourceDescriptor resourceDescriptor, String str) {
    }

    static /* synthetic */ void access$1900(ResourceDescriptor resourceDescriptor) {
    }

    static /* synthetic */ void access$200(ResourceDescriptor resourceDescriptor) {
    }

    static /* synthetic */ void access$2000(ResourceDescriptor resourceDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$300(ResourceDescriptor resourceDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$400(ResourceDescriptor resourceDescriptor, int i, String str) {
    }

    static /* synthetic */ void access$500(ResourceDescriptor resourceDescriptor, String str) {
    }

    static /* synthetic */ void access$600(ResourceDescriptor resourceDescriptor, Iterable iterable) {
    }

    static /* synthetic */ void access$700(ResourceDescriptor resourceDescriptor) {
    }

    static /* synthetic */ void access$800(ResourceDescriptor resourceDescriptor, ByteString byteString) {
    }

    static /* synthetic */ void access$900(ResourceDescriptor resourceDescriptor, String str) {
    }

    private void addAllPattern(Iterable<String> iterable) {
    }

    private void addPattern(String str) {
    }

    private void addPatternBytes(ByteString byteString) {
    }

    private void clearHistory() {
    }

    private void clearNameField() {
    }

    private void clearPattern() {
    }

    private void clearPlural() {
    }

    private void clearSingular() {
    }

    private void clearType() {
    }

    private void ensurePatternIsMutable() {
    }

    public static ResourceDescriptor getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ResourceDescriptor> parser() {
    }

    private void setHistory(History history) {
    }

    private void setHistoryValue(int i) {
    }

    private void setNameField(String str) {
    }

    private void setNameFieldBytes(ByteString byteString) {
    }

    private void setPattern(int i, String str) {
    }

    private void setPlural(String str) {
    }

    private void setPluralBytes(ByteString byteString) {
    }

    private void setSingular(String str) {
    }

    private void setSingularBytes(ByteString byteString) {
    }

    private void setType(String str) {
    }

    private void setTypeBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public History getHistory() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public int getHistoryValue() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getNameField() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ByteString getNameFieldBytes() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getPattern(int i) {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ByteString getPatternBytes(int i) {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public int getPatternCount() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public List<String> getPatternList() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getPlural() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ByteString getPluralBytes() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getSingular() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ByteString getSingularBytes() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public String getType() {
    }

    @Override // com.google.api.ResourceDescriptorOrBuilder
    public ByteString getTypeBytes() {
    }

    public static Builder newBuilder(ResourceDescriptor resourceDescriptor) {
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ResourceDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static ResourceDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ResourceDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ResourceDescriptor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream) throws IOException {
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ResourceDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ResourceDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
