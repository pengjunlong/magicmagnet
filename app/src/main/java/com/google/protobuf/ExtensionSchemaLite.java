package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {

    /* renamed from: com.google.protobuf.ExtensionSchemaLite$1 */
    static /* synthetic */ class C13011 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
    }

    ExtensionSchemaLite() {
    }

    @Override // com.google.protobuf.ExtensionSchema
    int extensionNumber(Map.Entry<?, ?> entry) {
    }

    @Override // com.google.protobuf.ExtensionSchema
    Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
    }

    @Override // com.google.protobuf.ExtensionSchema
    FieldSet<GeneratedMessageLite.ExtensionDescriptor> getExtensions(Object obj) {
    }

    @Override // com.google.protobuf.ExtensionSchema
    FieldSet<GeneratedMessageLite.ExtensionDescriptor> getMutableExtensions(Object obj) {
    }

    @Override // com.google.protobuf.ExtensionSchema
    boolean hasExtensions(MessageLite messageLite) {
    }

    @Override // com.google.protobuf.ExtensionSchema
    void makeImmutable(Object obj) {
    }

    @Override // com.google.protobuf.ExtensionSchema
    <UT, UB> UB parseExtension(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException {
    }

    @Override // com.google.protobuf.ExtensionSchema
    void parseLengthPrefixedMessageSetItem(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws IOException {
    }

    @Override // com.google.protobuf.ExtensionSchema
    void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws IOException {
    }

    @Override // com.google.protobuf.ExtensionSchema
    void serializeExtension(Writer writer, Map.Entry<?, ?> entry) throws IOException {
    }

    @Override // com.google.protobuf.ExtensionSchema
    void setExtensions(Object obj, FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet) {
    }
}
