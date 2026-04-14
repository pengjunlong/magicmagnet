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
public final class Date extends GeneratedMessageLite<Date, Builder> implements DateOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final Date DEFAULT_INSTANCE = null;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile Parser<Date> PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int month_;
    private int year_;

    /* renamed from: com.google.type.Date$1 */
    static /* synthetic */ class C13671 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f178xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Date, Builder> implements DateOrBuilder {
        /* synthetic */ Builder(C13671 c13671) {
        }

        public Builder clearDay() {
        }

        public Builder clearMonth() {
        }

        public Builder clearYear() {
        }

        @Override // com.google.type.DateOrBuilder
        public int getDay() {
        }

        @Override // com.google.type.DateOrBuilder
        public int getMonth() {
        }

        @Override // com.google.type.DateOrBuilder
        public int getYear() {
        }

        public Builder setDay(int i) {
        }

        public Builder setMonth(int i) {
        }

        public Builder setYear(int i) {
        }

        private Builder() {
        }
    }

    private Date() {
    }

    static /* synthetic */ Date access$000() {
    }

    static /* synthetic */ void access$100(Date date, int i) {
    }

    static /* synthetic */ void access$200(Date date) {
    }

    static /* synthetic */ void access$300(Date date, int i) {
    }

    static /* synthetic */ void access$400(Date date) {
    }

    static /* synthetic */ void access$500(Date date, int i) {
    }

    static /* synthetic */ void access$600(Date date) {
    }

    private void clearDay() {
    }

    private void clearMonth() {
    }

    private void clearYear() {
    }

    public static Date getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static Date parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Date parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Date> parser() {
    }

    private void setDay(int i) {
    }

    private void setMonth(int i) {
    }

    private void setYear(int i) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.DateOrBuilder
    public int getDay() {
    }

    @Override // com.google.type.DateOrBuilder
    public int getMonth() {
    }

    @Override // com.google.type.DateOrBuilder
    public int getYear() {
    }

    public static Builder newBuilder(Date date) {
    }

    public static Date parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Date parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Date parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static Date parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Date parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Date parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Date parseFrom(InputStream inputStream) throws IOException {
    }

    public static Date parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Date parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Date parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
