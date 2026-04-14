package com.google.protobuf;

import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class StructuralMessageInfo implements MessageInfo {
    private final int[] checkInitialized;
    private final MessageLite defaultInstance;
    private final FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final ProtoSyntax syntax;

    StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
    }

    public static Builder newBuilder() {
    }

    public int[] getCheckInitialized() {
    }

    @Override // com.google.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
    }

    public FieldInfo[] getFields() {
    }

    @Override // com.google.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
    }

    @Override // com.google.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
    }

    public static Builder newBuilder(int i) {
    }

    public static final class Builder {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<FieldInfo> fields;
        private boolean messageSetWireFormat;
        private ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
        }

        public StructuralMessageInfo build() {
        }

        public void withCheckInitialized(int[] iArr) {
        }

        public void withDefaultInstance(Object obj) {
        }

        public void withField(FieldInfo fieldInfo) {
        }

        public void withMessageSetWireFormat(boolean z) {
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
        }

        public Builder(int i) {
        }
    }
}
