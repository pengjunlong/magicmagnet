package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.type.TimeZone;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class DateTime extends GeneratedMessageLite<DateTime, Builder> implements DateTimeOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final DateTime DEFAULT_INSTANCE = null;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile Parser<DateTime> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_;
    private Object timeOffset_;
    private int year_;

    /* renamed from: com.google.type.DateTime$1 */
    static /* synthetic */ class C13681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f179xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DateTime, Builder> implements DateTimeOrBuilder {
        /* synthetic */ Builder(C13681 c13681) {
        }

        public Builder clearDay() {
        }

        public Builder clearHours() {
        }

        public Builder clearMinutes() {
        }

        public Builder clearMonth() {
        }

        public Builder clearNanos() {
        }

        public Builder clearSeconds() {
        }

        public Builder clearTimeOffset() {
        }

        public Builder clearTimeZone() {
        }

        public Builder clearUtcOffset() {
        }

        public Builder clearYear() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getDay() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getHours() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getMinutes() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getMonth() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getNanos() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getSeconds() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public TimeOffsetCase getTimeOffsetCase() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public TimeZone getTimeZone() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public Duration getUtcOffset() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public int getYear() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public boolean hasTimeZone() {
        }

        @Override // com.google.type.DateTimeOrBuilder
        public boolean hasUtcOffset() {
        }

        public Builder mergeTimeZone(TimeZone timeZone) {
        }

        public Builder mergeUtcOffset(Duration duration) {
        }

        public Builder setDay(int i) {
        }

        public Builder setHours(int i) {
        }

        public Builder setMinutes(int i) {
        }

        public Builder setMonth(int i) {
        }

        public Builder setNanos(int i) {
        }

        public Builder setSeconds(int i) {
        }

        public Builder setTimeZone(TimeZone timeZone) {
        }

        public Builder setUtcOffset(Duration duration) {
        }

        public Builder setYear(int i) {
        }

        private Builder() {
        }

        public Builder setTimeZone(TimeZone.Builder builder) {
        }

        public Builder setUtcOffset(Duration.Builder builder) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class TimeOffsetCase {
        private static final /* synthetic */ TimeOffsetCase[] $VALUES = null;
        public static final TimeOffsetCase TIMEOFFSET_NOT_SET = null;
        public static final TimeOffsetCase TIME_ZONE = null;
        public static final TimeOffsetCase UTC_OFFSET = null;
        private final int value;

        private TimeOffsetCase(String str, int i, int i2) {
        }

        public static TimeOffsetCase forNumber(int i) {
        }

        public static TimeOffsetCase valueOf(String str) {
        }

        public static TimeOffsetCase[] values() {
        }

        public int getNumber() {
        }

        @Deprecated
        public static TimeOffsetCase valueOf(int i) {
        }
    }

    private DateTime() {
    }

    static /* synthetic */ DateTime access$000() {
    }

    static /* synthetic */ void access$100(DateTime dateTime) {
    }

    static /* synthetic */ void access$1000(DateTime dateTime, int i) {
    }

    static /* synthetic */ void access$1100(DateTime dateTime) {
    }

    static /* synthetic */ void access$1200(DateTime dateTime, int i) {
    }

    static /* synthetic */ void access$1300(DateTime dateTime) {
    }

    static /* synthetic */ void access$1400(DateTime dateTime, int i) {
    }

    static /* synthetic */ void access$1500(DateTime dateTime) {
    }

    static /* synthetic */ void access$1600(DateTime dateTime, Duration duration) {
    }

    static /* synthetic */ void access$1700(DateTime dateTime, Duration duration) {
    }

    static /* synthetic */ void access$1800(DateTime dateTime) {
    }

    static /* synthetic */ void access$1900(DateTime dateTime, TimeZone timeZone) {
    }

    static /* synthetic */ void access$200(DateTime dateTime, int i) {
    }

    static /* synthetic */ void access$2000(DateTime dateTime, TimeZone timeZone) {
    }

    static /* synthetic */ void access$2100(DateTime dateTime) {
    }

    static /* synthetic */ void access$300(DateTime dateTime) {
    }

    static /* synthetic */ void access$400(DateTime dateTime, int i) {
    }

    static /* synthetic */ void access$500(DateTime dateTime) {
    }

    static /* synthetic */ void access$600(DateTime dateTime, int i) {
    }

    static /* synthetic */ void access$700(DateTime dateTime) {
    }

    static /* synthetic */ void access$800(DateTime dateTime, int i) {
    }

    static /* synthetic */ void access$900(DateTime dateTime) {
    }

    private void clearDay() {
    }

    private void clearHours() {
    }

    private void clearMinutes() {
    }

    private void clearMonth() {
    }

    private void clearNanos() {
    }

    private void clearSeconds() {
    }

    private void clearTimeOffset() {
    }

    private void clearTimeZone() {
    }

    private void clearUtcOffset() {
    }

    private void clearYear() {
    }

    public static DateTime getDefaultInstance() {
    }

    private void mergeTimeZone(TimeZone timeZone) {
    }

    private void mergeUtcOffset(Duration duration) {
    }

    public static Builder newBuilder() {
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<DateTime> parser() {
    }

    private void setDay(int i) {
    }

    private void setHours(int i) {
    }

    private void setMinutes(int i) {
    }

    private void setMonth(int i) {
    }

    private void setNanos(int i) {
    }

    private void setSeconds(int i) {
    }

    private void setTimeZone(TimeZone timeZone) {
    }

    private void setUtcOffset(Duration duration) {
    }

    private void setYear(int i) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getDay() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getHours() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getMinutes() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getMonth() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getNanos() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getSeconds() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public TimeOffsetCase getTimeOffsetCase() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public TimeZone getTimeZone() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public Duration getUtcOffset() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public int getYear() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public boolean hasTimeZone() {
    }

    @Override // com.google.type.DateTimeOrBuilder
    public boolean hasUtcOffset() {
    }

    public static Builder newBuilder(DateTime dateTime) {
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DateTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    public static DateTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DateTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static DateTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static DateTime parseFrom(InputStream inputStream) throws IOException {
    }

    public static DateTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static DateTime parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static DateTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
