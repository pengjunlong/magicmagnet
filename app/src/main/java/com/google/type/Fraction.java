package com.google.type;

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
public final class Fraction extends GeneratedMessageLite<Fraction, Builder> implements FractionOrBuilder {
    private static final Fraction DEFAULT_INSTANCE = null;
    public static final int DENOMINATOR_FIELD_NUMBER = 2;
    public static final int NUMERATOR_FIELD_NUMBER = 1;
    private static volatile Parser<Fraction> PARSER;
    private long denominator_;
    private long numerator_;

    /* renamed from: com.google.type.Fraction$1 */
    static /* synthetic */ class C13711 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f181xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Fraction, Builder> implements FractionOrBuilder {
        /* synthetic */ Builder(C13711 c13711) {
        }

        public Builder clearDenominator() {
        }

        public Builder clearNumerator() {
        }

        @Override // com.google.type.FractionOrBuilder
        public long getDenominator() {
        }

        @Override // com.google.type.FractionOrBuilder
        public long getNumerator() {
        }

        public Builder setDenominator(long j) {
        }

        public Builder setNumerator(long j) {
        }

        private Builder() {
        }
    }

    private Fraction() {
    }

    static /* synthetic */ Fraction access$000() {
    }

    static /* synthetic */ void access$100(Fraction fraction, long j) {
    }

    static /* synthetic */ void access$200(Fraction fraction) {
    }

    static /* synthetic */ void access$300(Fraction fraction, long j) {
    }

    static /* synthetic */ void access$400(Fraction fraction) {
    }

    private void clearDenominator() {
    }

    private void clearNumerator() {
    }

    public static Fraction getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Fraction parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Fraction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Fraction> parser() {
    }

    private void setDenominator(long j) {
    }

    private void setNumerator(long j) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.FractionOrBuilder
    public long getDenominator() {
    }

    @Override // com.google.type.FractionOrBuilder
    public long getNumerator() {
    }

    public static Builder newBuilder(Fraction fraction) {
    }

    public static Fraction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Fraction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Fraction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Fraction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Fraction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Fraction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Fraction parseFrom(InputStream inputStream) throws IOException {
    }

    public static Fraction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Fraction parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Fraction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
