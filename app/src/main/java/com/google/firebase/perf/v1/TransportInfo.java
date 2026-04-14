package com.google.firebase.perf.v1;

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
public final class TransportInfo extends GeneratedMessageLite<TransportInfo, Builder> implements TransportInfoOrBuilder {
    private static final TransportInfo DEFAULT_INSTANCE = null;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile Parser<TransportInfo> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* renamed from: com.google.firebase.perf.v1.TransportInfo$1 */
    static /* synthetic */ class C11991 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f127xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TransportInfo, Builder> implements TransportInfoOrBuilder {
        /* synthetic */ Builder(C11991 c11991) {
        }

        public Builder clearDispatchDestination() {
        }

        @Override // com.google.firebase.perf.v1.TransportInfoOrBuilder
        public DispatchDestination getDispatchDestination() {
        }

        @Override // com.google.firebase.perf.v1.TransportInfoOrBuilder
        public boolean hasDispatchDestination() {
        }

        public Builder setDispatchDestination(DispatchDestination dispatchDestination) {
        }

        private Builder() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class DispatchDestination implements Internal.EnumLite {
        private static final /* synthetic */ DispatchDestination[] $VALUES = null;
        public static final DispatchDestination FL_LEGACY_V1 = null;
        public static final int FL_LEGACY_V1_VALUE = 1;
        public static final DispatchDestination SOURCE_UNKNOWN = null;
        public static final int SOURCE_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<DispatchDestination> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.TransportInfo$DispatchDestination$1 */
        class C12001 implements Internal.EnumLiteMap<DispatchDestination> {
            C12001() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public /* bridge */ /* synthetic */ DispatchDestination findValueByNumber(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DispatchDestination findValueByNumber(int i) {
            }
        }

        private static final class DispatchDestinationVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = null;

            private DispatchDestinationVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
            }
        }

        private DispatchDestination(String str, int i, int i2) {
        }

        public static DispatchDestination forNumber(int i) {
        }

        public static Internal.EnumLiteMap<DispatchDestination> internalGetValueMap() {
        }

        public static Internal.EnumVerifier internalGetVerifier() {
        }

        public static DispatchDestination valueOf(String str) {
        }

        public static DispatchDestination[] values() {
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
        }

        @Deprecated
        public static DispatchDestination valueOf(int i) {
        }
    }

    private TransportInfo() {
    }

    static /* synthetic */ TransportInfo access$000() {
    }

    static /* synthetic */ void access$100(TransportInfo transportInfo, DispatchDestination dispatchDestination) {
    }

    static /* synthetic */ void access$200(TransportInfo transportInfo) {
    }

    private void clearDispatchDestination() {
    }

    public static TransportInfo getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<TransportInfo> parser() {
    }

    private void setDispatchDestination(DispatchDestination dispatchDestination) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.firebase.perf.v1.TransportInfoOrBuilder
    public DispatchDestination getDispatchDestination() {
    }

    @Override // com.google.firebase.perf.v1.TransportInfoOrBuilder
    public boolean hasDispatchDestination() {
    }

    public static Builder newBuilder(TransportInfo transportInfo) {
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TransportInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static TransportInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TransportInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static TransportInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TransportInfo parseFrom(InputStream inputStream) throws IOException {
    }

    public static TransportInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static TransportInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static TransportInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
