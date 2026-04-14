package com.google.firebase.encoders.json;

import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {
    private boolean active;
    private JsonValueObjectEncoderContext childContext;
    private final ObjectEncoder<Object> fallbackEncoder;
    private final boolean ignoreNullValues;
    private final JsonWriter jsonWriter;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;

    JsonValueObjectEncoderContext(Writer writer, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder, boolean z) {
    }

    private boolean cannotBeInline(Object obj) {
    }

    private JsonValueObjectEncoderContext internalAdd(String str, Object obj) throws IOException, EncodingException {
    }

    private JsonValueObjectEncoderContext internalAddIgnoreNullValues(String str, Object obj) throws IOException, EncodingException {
    }

    private void maybeUnNest() throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public /* bridge */ /* synthetic */ ObjectEncoderContext add(String str, double d) throws IOException {
    }

    void close() throws IOException {
    }

    JsonValueObjectEncoderContext doEncode(ObjectEncoder<Object> objectEncoder, Object obj, boolean z) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext inline(Object obj) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext nested(String str) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public /* bridge */ /* synthetic */ ObjectEncoderContext add(String str, int i) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public /* bridge */ /* synthetic */ ObjectEncoderContext add(String str, long j) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public /* bridge */ /* synthetic */ ObjectEncoderContext add(String str, Object obj) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public /* bridge */ /* synthetic */ ObjectEncoderContext add(String str, boolean z) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public /* bridge */ /* synthetic */ ValueEncoderContext add(double d) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public /* bridge */ /* synthetic */ ValueEncoderContext add(float f) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public /* bridge */ /* synthetic */ ValueEncoderContext add(int i) throws IOException {
    }

    private JsonValueObjectEncoderContext(JsonValueObjectEncoderContext jsonValueObjectEncoderContext) {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public /* bridge */ /* synthetic */ ValueEncoderContext add(long j) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public /* bridge */ /* synthetic */ ValueEncoderContext add(String str) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public /* bridge */ /* synthetic */ ValueEncoderContext add(boolean z) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public /* bridge */ /* synthetic */ ValueEncoderContext add(byte[] bArr) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public JsonValueObjectEncoderContext add(String str, Object obj) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public JsonValueObjectEncoderContext add(String str, double d) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public JsonValueObjectEncoderContext add(String str, int i) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public JsonValueObjectEncoderContext add(String str, long j) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public JsonValueObjectEncoderContext add(String str, boolean z) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) throws IOException {
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public JsonValueObjectEncoderContext add(String str) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public JsonValueObjectEncoderContext add(float f) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public JsonValueObjectEncoderContext add(double d) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public JsonValueObjectEncoderContext add(int i) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public JsonValueObjectEncoderContext add(long j) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public JsonValueObjectEncoderContext add(boolean z) throws IOException {
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public JsonValueObjectEncoderContext add(byte[] bArr) throws IOException {
    }

    JsonValueObjectEncoderContext add(Object obj, boolean z) throws IOException {
    }
}
