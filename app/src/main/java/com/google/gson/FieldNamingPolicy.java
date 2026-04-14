package com.google.gson;

import java.lang.reflect.Field;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class FieldNamingPolicy implements FieldNamingStrategy {
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES = null;
    public static final FieldNamingPolicy IDENTITY = null;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES = null;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DOTS = null;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES = null;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE = null;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES = null;

    /* renamed from: com.google.gson.FieldNamingPolicy$1 */
    enum C12071 extends FieldNamingPolicy {
        C12071(String str, int i) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    /* renamed from: com.google.gson.FieldNamingPolicy$2 */
    enum C12082 extends FieldNamingPolicy {
        C12082(String str, int i) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    /* renamed from: com.google.gson.FieldNamingPolicy$3 */
    enum C12093 extends FieldNamingPolicy {
        C12093(String str, int i) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    /* renamed from: com.google.gson.FieldNamingPolicy$4 */
    enum C12104 extends FieldNamingPolicy {
        C12104(String str, int i) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    /* renamed from: com.google.gson.FieldNamingPolicy$5 */
    enum C12115 extends FieldNamingPolicy {
        C12115(String str, int i) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    /* renamed from: com.google.gson.FieldNamingPolicy$6 */
    enum C12126 extends FieldNamingPolicy {
        C12126(String str, int i) {
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
        }
    }

    private FieldNamingPolicy(String str, int i) {
    }

    private static String modifyString(char c, String str, int i) {
    }

    static String separateCamelCase(String str, String str2) {
    }

    static String upperCaseFirstLetter(String str) {
    }

    public static FieldNamingPolicy valueOf(String str) {
    }

    public static FieldNamingPolicy[] values() {
    }

    /* synthetic */ FieldNamingPolicy(String str, int i, C12071 c12071) {
    }
}
