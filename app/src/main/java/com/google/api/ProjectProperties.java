package com.google.api;

import com.google.api.Property;
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
public final class ProjectProperties extends GeneratedMessageLite<ProjectProperties, Builder> implements ProjectPropertiesOrBuilder {
    private static final ProjectProperties DEFAULT_INSTANCE = null;
    private static volatile Parser<ProjectProperties> PARSER = null;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Property> properties_;

    /* renamed from: com.google.api.ProjectProperties$1 */
    static /* synthetic */ class C05851 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f81xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ProjectProperties, Builder> implements ProjectPropertiesOrBuilder {
        /* synthetic */ Builder(C05851 c05851) {
        }

        public Builder addAllProperties(Iterable<? extends Property> iterable) {
        }

        public Builder addProperties(Property property) {
        }

        public Builder clearProperties() {
        }

        @Override // com.google.api.ProjectPropertiesOrBuilder
        public Property getProperties(int i) {
        }

        @Override // com.google.api.ProjectPropertiesOrBuilder
        public int getPropertiesCount() {
        }

        @Override // com.google.api.ProjectPropertiesOrBuilder
        public List<Property> getPropertiesList() {
        }

        public Builder removeProperties(int i) {
        }

        public Builder setProperties(int i, Property property) {
        }

        private Builder() {
        }

        public Builder addProperties(int i, Property property) {
        }

        public Builder setProperties(int i, Property.Builder builder) {
        }

        public Builder addProperties(Property.Builder builder) {
        }

        public Builder addProperties(int i, Property.Builder builder) {
        }
    }

    private ProjectProperties() {
    }

    static /* synthetic */ ProjectProperties access$000() {
    }

    static /* synthetic */ void access$100(ProjectProperties projectProperties, int i, Property property) {
    }

    static /* synthetic */ void access$200(ProjectProperties projectProperties, Property property) {
    }

    static /* synthetic */ void access$300(ProjectProperties projectProperties, int i, Property property) {
    }

    static /* synthetic */ void access$400(ProjectProperties projectProperties, Iterable iterable) {
    }

    static /* synthetic */ void access$500(ProjectProperties projectProperties) {
    }

    static /* synthetic */ void access$600(ProjectProperties projectProperties, int i) {
    }

    private void addAllProperties(Iterable<? extends Property> iterable) {
    }

    private void addProperties(Property property) {
    }

    private void clearProperties() {
    }

    private void ensurePropertiesIsMutable() {
    }

    public static ProjectProperties getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<ProjectProperties> parser() {
    }

    private void removeProperties(int i) {
    }

    private void setProperties(int i, Property property) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.ProjectPropertiesOrBuilder
    public Property getProperties(int i) {
    }

    @Override // com.google.api.ProjectPropertiesOrBuilder
    public int getPropertiesCount() {
    }

    @Override // com.google.api.ProjectPropertiesOrBuilder
    public List<Property> getPropertiesList() {
    }

    public PropertyOrBuilder getPropertiesOrBuilder(int i) {
    }

    public List<? extends PropertyOrBuilder> getPropertiesOrBuilderList() {
    }

    public static Builder newBuilder(ProjectProperties projectProperties) {
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ProjectProperties parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addProperties(int i, Property property) {
    }

    public static ProjectProperties parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ProjectProperties parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static ProjectProperties parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static ProjectProperties parseFrom(InputStream inputStream) throws IOException {
    }

    public static ProjectProperties parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static ProjectProperties parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static ProjectProperties parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
