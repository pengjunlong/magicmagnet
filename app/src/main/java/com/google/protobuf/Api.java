package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Method;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Api extends GeneratedMessageLite<Api, Builder> implements ApiOrBuilder {
    private static final Api DEFAULT_INSTANCE = null;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser<Api> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private Internal.ProtobufList<Method> methods_;
    private Internal.ProtobufList<Mixin> mixins_;
    private String name_;
    private Internal.ProtobufList<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private String version_;

    /* renamed from: com.google.protobuf.Api$1 */
    static /* synthetic */ class C12761 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f139xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Api, Builder> implements ApiOrBuilder {
        /* synthetic */ Builder(C12761 c12761) {
        }

        public Builder addAllMethods(Iterable<? extends Method> iterable) {
        }

        public Builder addAllMixins(Iterable<? extends Mixin> iterable) {
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
        }

        public Builder addMethods(Method method) {
        }

        public Builder addMixins(Mixin mixin) {
        }

        public Builder addOptions(Option option) {
        }

        public Builder clearMethods() {
        }

        public Builder clearMixins() {
        }

        public Builder clearName() {
        }

        public Builder clearOptions() {
        }

        public Builder clearSourceContext() {
        }

        public Builder clearSyntax() {
        }

        public Builder clearVersion() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Method getMethods(int i) {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getMethodsCount() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<Method> getMethodsList() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Mixin getMixins(int i) {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getMixinsCount() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<Mixin> getMixinsList() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public String getName() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Option getOptions(int i) {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getOptionsCount() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<Option> getOptionsList() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public SourceContext getSourceContext() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Syntax getSyntax() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public String getVersion() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public ByteString getVersionBytes() {
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
        }

        public Builder removeMethods(int i) {
        }

        public Builder removeMixins(int i) {
        }

        public Builder removeOptions(int i) {
        }

        public Builder setMethods(int i, Method method) {
        }

        public Builder setMixins(int i, Mixin mixin) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setOptions(int i, Option option) {
        }

        public Builder setSourceContext(SourceContext sourceContext) {
        }

        public Builder setSyntax(Syntax syntax) {
        }

        public Builder setSyntaxValue(int i) {
        }

        public Builder setVersion(String str) {
        }

        public Builder setVersionBytes(ByteString byteString) {
        }

        private Builder() {
        }

        public Builder addMethods(int i, Method method) {
        }

        public Builder addMixins(int i, Mixin mixin) {
        }

        public Builder addOptions(int i, Option option) {
        }

        public Builder setMethods(int i, Method.Builder builder) {
        }

        public Builder setMixins(int i, Mixin.Builder builder) {
        }

        public Builder setOptions(int i, Option.Builder builder) {
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
        }

        public Builder addMethods(Method.Builder builder) {
        }

        public Builder addMixins(Mixin.Builder builder) {
        }

        public Builder addOptions(Option.Builder builder) {
        }

        public Builder addMethods(int i, Method.Builder builder) {
        }

        public Builder addMixins(int i, Mixin.Builder builder) {
        }

        public Builder addOptions(int i, Option.Builder builder) {
        }
    }

    private Api() {
    }

    static /* synthetic */ Api access$000() {
    }

    static /* synthetic */ void access$100(Api api, String str) {
    }

    static /* synthetic */ void access$1000(Api api, int i, Option option) {
    }

    static /* synthetic */ void access$1100(Api api, Option option) {
    }

    static /* synthetic */ void access$1200(Api api, int i, Option option) {
    }

    static /* synthetic */ void access$1300(Api api, Iterable iterable) {
    }

    static /* synthetic */ void access$1400(Api api) {
    }

    static /* synthetic */ void access$1500(Api api, int i) {
    }

    static /* synthetic */ void access$1600(Api api, String str) {
    }

    static /* synthetic */ void access$1700(Api api) {
    }

    static /* synthetic */ void access$1800(Api api, ByteString byteString) {
    }

    static /* synthetic */ void access$1900(Api api, SourceContext sourceContext) {
    }

    static /* synthetic */ void access$200(Api api) {
    }

    static /* synthetic */ void access$2000(Api api, SourceContext sourceContext) {
    }

    static /* synthetic */ void access$2100(Api api) {
    }

    static /* synthetic */ void access$2200(Api api, int i, Mixin mixin) {
    }

    static /* synthetic */ void access$2300(Api api, Mixin mixin) {
    }

    static /* synthetic */ void access$2400(Api api, int i, Mixin mixin) {
    }

    static /* synthetic */ void access$2500(Api api, Iterable iterable) {
    }

    static /* synthetic */ void access$2600(Api api) {
    }

    static /* synthetic */ void access$2700(Api api, int i) {
    }

    static /* synthetic */ void access$2800(Api api, int i) {
    }

    static /* synthetic */ void access$2900(Api api, Syntax syntax) {
    }

    static /* synthetic */ void access$300(Api api, ByteString byteString) {
    }

    static /* synthetic */ void access$3000(Api api) {
    }

    static /* synthetic */ void access$400(Api api, int i, Method method) {
    }

    static /* synthetic */ void access$500(Api api, Method method) {
    }

    static /* synthetic */ void access$600(Api api, int i, Method method) {
    }

    static /* synthetic */ void access$700(Api api, Iterable iterable) {
    }

    static /* synthetic */ void access$800(Api api) {
    }

    static /* synthetic */ void access$900(Api api, int i) {
    }

    private void addAllMethods(Iterable<? extends Method> iterable) {
    }

    private void addAllMixins(Iterable<? extends Mixin> iterable) {
    }

    private void addAllOptions(Iterable<? extends Option> iterable) {
    }

    private void addMethods(Method method) {
    }

    private void addMixins(Mixin mixin) {
    }

    private void addOptions(Option option) {
    }

    private void clearMethods() {
    }

    private void clearMixins() {
    }

    private void clearName() {
    }

    private void clearOptions() {
    }

    private void clearSourceContext() {
    }

    private void clearSyntax() {
    }

    private void clearVersion() {
    }

    private void ensureMethodsIsMutable() {
    }

    private void ensureMixinsIsMutable() {
    }

    private void ensureOptionsIsMutable() {
    }

    public static Api getDefaultInstance() {
    }

    private void mergeSourceContext(SourceContext sourceContext) {
    }

    public static Builder newBuilder() {
    }

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Api> parser() {
    }

    private void removeMethods(int i) {
    }

    private void removeMixins(int i) {
    }

    private void removeOptions(int i) {
    }

    private void setMethods(int i, Method method) {
    }

    private void setMixins(int i, Mixin mixin) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setOptions(int i, Option option) {
    }

    private void setSourceContext(SourceContext sourceContext) {
    }

    private void setSyntax(Syntax syntax) {
    }

    private void setSyntaxValue(int i) {
    }

    private void setVersion(String str) {
    }

    private void setVersionBytes(ByteString byteString) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Method getMethods(int i) {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getMethodsCount() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<Method> getMethodsList() {
    }

    public MethodOrBuilder getMethodsOrBuilder(int i) {
    }

    public List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Mixin getMixins(int i) {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getMixinsCount() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<Mixin> getMixinsList() {
    }

    public MixinOrBuilder getMixinsOrBuilder(int i) {
    }

    public List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public String getName() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Option getOptions(int i) {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getOptionsCount() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<Option> getOptionsList() {
    }

    public OptionOrBuilder getOptionsOrBuilder(int i) {
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public SourceContext getSourceContext() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Syntax getSyntax() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public String getVersion() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public ByteString getVersionBytes() {
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public boolean hasSourceContext() {
    }

    public static Builder newBuilder(Api api) {
    }

    public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addMethods(int i, Method method) {
    }

    private void addMixins(int i, Mixin mixin) {
    }

    private void addOptions(int i, Option option) {
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
