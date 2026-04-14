package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class JsonPrimitive extends JsonElement {
    private static final Class<?>[] PRIMITIVE_TYPES = null;
    private Object value;

    public JsonPrimitive(Boolean bool) {
    }

    private static boolean isIntegral(JsonPrimitive jsonPrimitive) {
    }

    private static boolean isPrimitiveOrString(Object obj) {
    }

    @Override // com.google.gson.JsonElement
    public /* bridge */ /* synthetic */ JsonElement deepCopy() {
    }

    @Override // com.google.gson.JsonElement
    public JsonPrimitive deepCopy() {
    }

    public boolean equals(Object obj) {
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
    }

    @Override // com.google.gson.JsonElement
    Boolean getAsBooleanWrapper() {
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
    }

    @Override // com.google.gson.JsonElement
    public char getAsCharacter() {
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
    }

    public int hashCode() {
    }

    public boolean isBoolean() {
    }

    public boolean isNumber() {
    }

    public boolean isString() {
    }

    void setValue(Object obj) {
    }

    public JsonPrimitive(Number number) {
    }

    public JsonPrimitive(String str) {
    }

    public JsonPrimitive(Character ch) {
    }

    JsonPrimitive(Object obj) {
    }
}
