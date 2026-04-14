package com.google.firebase.encoders.json;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {
    private static final ValueEncoder<Boolean> BOOLEAN_ENCODER = null;
    private static final ObjectEncoder<Object> DEFAULT_FALLBACK_ENCODER = null;
    private static final ValueEncoder<String> STRING_ENCODER = null;
    private static final TimestampEncoder TIMESTAMP_ENCODER = null;
    private ObjectEncoder<Object> fallbackEncoder;
    private boolean ignoreNullValues;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;

    private static final class TimestampEncoder implements ValueEncoder<Date> {
        private static final DateFormat rfc339 = null;

        private TimestampEncoder() {
        }

        @Override // com.google.firebase.encoders.ValueEncoder, com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ValueEncoderContext valueEncoderContext) throws IOException {
        }

        /* synthetic */ TimestampEncoder(C11491 c11491) {
        }

        public void encode(Date date, ValueEncoderContext valueEncoderContext) throws IOException {
        }
    }

    static /* synthetic */ Map access$100(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
    }

    static /* synthetic */ Map access$200(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
    }

    static /* synthetic */ ObjectEncoder access$300(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
    }

    static /* synthetic */ boolean access$400(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(Object obj, ObjectEncoderContext objectEncoderContext) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(String str, ValueEncoderContext valueEncoderContext) {
    }

    public static /* synthetic */ void dqqppqiKzJi1l1lll1l(Boolean bool, ValueEncoderContext valueEncoderContext) {
    }

    private static /* synthetic */ void lambda$static$0(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
    }

    private static /* synthetic */ void lambda$static$1(String str, ValueEncoderContext valueEncoderContext) throws IOException {
    }

    private static /* synthetic */ void lambda$static$2(Boolean bool, ValueEncoderContext valueEncoderContext) throws IOException {
    }

    public DataEncoder build() {
    }

    public JsonDataEncoderBuilder configureWith(Configurator configurator) {
    }

    public JsonDataEncoderBuilder ignoreNullValues(boolean z) {
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public /* bridge */ /* synthetic */ JsonDataEncoderBuilder registerEncoder(Class cls, ObjectEncoder objectEncoder) {
    }

    public JsonDataEncoderBuilder registerFallbackEncoder(ObjectEncoder<Object> objectEncoder) {
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public /* bridge */ /* synthetic */ JsonDataEncoderBuilder registerEncoder(Class cls, ValueEncoder valueEncoder) {
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    /* renamed from: registerEncoder, reason: avoid collision after fix types in other method */
    public <T> JsonDataEncoderBuilder registerEncoder2(Class<T> cls, ObjectEncoder<? super T> objectEncoder) {
    }

    /* renamed from: com.google.firebase.encoders.json.JsonDataEncoderBuilder$1 */
    class C11491 implements DataEncoder {
        final /* synthetic */ JsonDataEncoderBuilder this$0;

        C11491(JsonDataEncoderBuilder jsonDataEncoderBuilder) {
        }

        @Override // com.google.firebase.encoders.DataEncoder
        public void encode(Object obj, Writer writer) throws IOException {
        }

        @Override // com.google.firebase.encoders.DataEncoder
        public String encode(Object obj) {
        }
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    /* renamed from: registerEncoder, reason: avoid collision after fix types in other method */
    public <T> JsonDataEncoderBuilder registerEncoder2(Class<T> cls, ValueEncoder<? super T> valueEncoder) {
    }
}
