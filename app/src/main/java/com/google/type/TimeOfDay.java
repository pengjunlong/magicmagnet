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
public final class TimeOfDay extends GeneratedMessageLite<TimeOfDay, Builder> implements TimeOfDayOrBuilder {
    private static final TimeOfDay DEFAULT_INSTANCE = null;
    public static final int HOURS_FIELD_NUMBER = 1;
    public static final int MINUTES_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 4;
    private static volatile Parser<TimeOfDay> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 3;
    private int hours_;
    private int minutes_;
    private int nanos_;
    private int seconds_;

    /* renamed from: com.google.type.TimeOfDay$1 */
    static /* synthetic */ class C13761 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f186xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<TimeOfDay, Builder> implements TimeOfDayOrBuilder {
        /* synthetic */ Builder(C13761 c13761) {
        }

        public Builder clearHours() {
        }

        public Builder clearMinutes() {
        }

        public Builder clearNanos() {
        }

        public Builder clearSeconds() {
        }

        @Override // com.google.type.TimeOfDayOrBuilder
        public int getHours() {
        }

        @Override // com.google.type.TimeOfDayOrBuilder
        public int getMinutes() {
        }

        @Override // com.google.type.TimeOfDayOrBuilder
        public int getNanos() {
        }

        @Override // com.google.type.TimeOfDayOrBuilder
        public int getSeconds() {
        }

        public Builder setHours(int i) {
        }

        public Builder setMinutes(int i) {
        }

        public Builder setNanos(int i) {
        }

        public Builder setSeconds(int i) {
        }

        private Builder() {
        }
    }

    private TimeOfDay() {
    }

    static /* synthetic */ TimeOfDay access$000() {
    }

    static /* synthetic */ void access$100(TimeOfDay timeOfDay, int i) {
    }

    static /* synthetic */ void access$200(TimeOfDay timeOfDay) {
    }

    static /* synthetic */ void access$300(TimeOfDay timeOfDay, int i) {
    }

    static /* synthetic */ void access$400(TimeOfDay timeOfDay) {
    }

    static /* synthetic */ void access$500(TimeOfDay timeOfDay, int i) {
    }

    static /* synthetic */ void access$600(TimeOfDay timeOfDay) {
    }

    static /* synthetic */ void access$700(TimeOfDay timeOfDay, int i) {
    }

    static /* synthetic */ void access$800(TimeOfDay timeOfDay) {
    }

    private void clearHours() {
    }

    private void clearMinutes() {
    }

    private void clearNanos() {
    }

    private void clearSeconds() {
    }

    public static TimeOfDay getDefaultInstance() {
    }

    public static Builder newBuilder() {
    }

    public static TimeOfDay parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static TimeOfDay parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<TimeOfDay> parser() {
    }

    private void setHours(int i) {
    }

    private void setMinutes(int i) {
    }

    private void setNanos(int i) {
    }

    private void setSeconds(int i) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.TimeOfDayOrBuilder
    public int getHours() {
    }

    @Override // com.google.type.TimeOfDayOrBuilder
    public int getMinutes() {
    }

    @Override // com.google.type.TimeOfDayOrBuilder
    public int getNanos() {
    }

    @Override // com.google.type.TimeOfDayOrBuilder
    public int getSeconds() {
    }

    public static Builder newBuilder(TimeOfDay timeOfDay) {
    }

    public static TimeOfDay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static TimeOfDay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TimeOfDay parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static TimeOfDay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TimeOfDay parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static TimeOfDay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static TimeOfDay parseFrom(InputStream inputStream) throws IOException {
    }

    public static TimeOfDay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static TimeOfDay parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static TimeOfDay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
