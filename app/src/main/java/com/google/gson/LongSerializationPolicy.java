package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class LongSerializationPolicy {
    private static final /* synthetic */ LongSerializationPolicy[] $VALUES = null;
    public static final LongSerializationPolicy DEFAULT = null;
    public static final LongSerializationPolicy STRING = null;

    /* renamed from: com.google.gson.LongSerializationPolicy$1 */
    enum C12181 extends LongSerializationPolicy {
        C12181(String str, int i) {
        }

        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
        }
    }

    /* renamed from: com.google.gson.LongSerializationPolicy$2 */
    enum C12192 extends LongSerializationPolicy {
        C12192(String str, int i) {
        }

        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
        }
    }

    private LongSerializationPolicy(String str, int i) {
    }

    public static LongSerializationPolicy valueOf(String str) {
    }

    public static LongSerializationPolicy[] values() {
    }

    public abstract JsonElement serialize(Long l);

    /* synthetic */ LongSerializationPolicy(String str, int i, C12181 c12181) {
    }
}
