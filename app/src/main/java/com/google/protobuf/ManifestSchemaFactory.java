package com.google.protobuf;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class ManifestSchemaFactory implements SchemaFactory {
    private static final MessageInfoFactory EMPTY_FACTORY = null;
    private final MessageInfoFactory messageInfoFactory;

    /* renamed from: com.google.protobuf.ManifestSchemaFactory$1 */
    static class C13171 implements MessageInfoFactory {
        C13171() {
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> cls) {
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> cls) {
        }
    }

    private static class CompositeMessageInfoFactory implements MessageInfoFactory {
        private MessageInfoFactory[] factories;

        CompositeMessageInfoFactory(MessageInfoFactory... messageInfoFactoryArr) {
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public boolean isSupported(Class<?> cls) {
        }

        @Override // com.google.protobuf.MessageInfoFactory
        public MessageInfo messageInfoFor(Class<?> cls) {
        }
    }

    public ManifestSchemaFactory() {
    }

    private static MessageInfoFactory getDefaultMessageInfoFactory() {
    }

    private static MessageInfoFactory getDescriptorMessageInfoFactory() {
    }

    private static boolean isProto2(MessageInfo messageInfo) {
    }

    private static <T> Schema<T> newSchema(Class<T> cls, MessageInfo messageInfo) {
    }

    @Override // com.google.protobuf.SchemaFactory
    public <T> Schema<T> createSchema(Class<T> cls) {
    }

    private ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
    }
}
