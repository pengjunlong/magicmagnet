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
public final class Money extends GeneratedMessageLite<Money, Builder> implements MoneyOrBuilder {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private static final Money DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 3;
    private static volatile Parser<Money> PARSER = null;
    public static final int UNITS_FIELD_NUMBER = 2;
    private String currencyCode_;
    private int nanos_;
    private long units_;

    /* renamed from: com.google.type.Money$1 */
    static /* synthetic */ class C13731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f183xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Money, Builder> implements MoneyOrBuilder {
        /* synthetic */ Builder(C13731 c13731) {
        }

        public Builder clearCurrencyCode() {
        }

        public Builder clearNanos() {
        }

        public Builder clearUnits() {
        }

        @Override // com.google.type.MoneyOrBuilder
        public String getCurrencyCode() {
        }

        @Override // com.google.type.MoneyOrBuilder
        public ByteString getCurrencyCodeBytes() {
        }

        @Override // com.google.type.MoneyOrBuilder
        public int getNanos() {
        }

        @Override // com.google.type.MoneyOrBuilder
        public long getUnits() {
        }

        public Builder setCurrencyCode(String str) {
        }

        public Builder setCurrencyCodeBytes(ByteString byteString) {
        }

        public Builder setNanos(int i) {
        }

        public Builder setUnits(long j) {
        }

        private Builder() {
        }
    }

    private Money() {
    }

    static /* synthetic */ Money access$000() {
    }

    static /* synthetic */ void access$100(Money money, String str) {
    }

    static /* synthetic */ void access$200(Money money) {
    }

    static /* synthetic */ void access$300(Money money, ByteString byteString) {
    }

    static /* synthetic */ void access$400(Money money, long j) {
    }

    static /* synthetic */ void access$500(Money money) {
    }

    static /* synthetic */ void access$600(Money money, int i) {
    }

    static /* synthetic */ void access$700(Money money) {
    }

    private void clearCurrencyCode() {
    }

    private void clearNanos() {
    }

    private void clearUnits() {
    }

    public static Money getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Money parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Money parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Money> parser() {
    }

    private void setCurrencyCode(String str) {
    }

    private void setCurrencyCodeBytes(ByteString byteString) {
    }

    private void setNanos(int i) {
    }

    private void setUnits(long j) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.MoneyOrBuilder
    public String getCurrencyCode() {
    }

    @Override // com.google.type.MoneyOrBuilder
    public ByteString getCurrencyCodeBytes() {
    }

    @Override // com.google.type.MoneyOrBuilder
    public int getNanos() {
    }

    @Override // com.google.type.MoneyOrBuilder
    public long getUnits() {
    }

    public static Builder newBuilder(Money money) {
    }

    public static Money parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Money parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Money parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Money parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Money parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Money parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Money parseFrom(InputStream inputStream) throws IOException {
    }

    public static Money parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Money parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Money parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
