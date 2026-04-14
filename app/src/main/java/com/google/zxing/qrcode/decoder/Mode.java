package com.google.zxing.qrcode.decoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Mode {
    private static final /* synthetic */ Mode[] $VALUES = null;
    public static final Mode ALPHANUMERIC = null;
    public static final Mode BYTE = null;
    public static final Mode ECI = null;
    public static final Mode FNC1_FIRST_POSITION = null;
    public static final Mode FNC1_SECOND_POSITION = null;
    public static final Mode HANZI = null;
    public static final Mode KANJI = null;
    public static final Mode NUMERIC = null;
    public static final Mode STRUCTURED_APPEND = null;
    public static final Mode TERMINATOR = null;
    private final int bits;
    private final int[] characterCountBitsForVersions;

    private Mode(String str, int i, int[] iArr, int i2) {
    }

    public static Mode forBits(int i) {
    }

    public static Mode valueOf(String str) {
    }

    public static Mode[] values() {
    }

    public int getBits() {
    }

    public int getCharacterCountBits(Version version) {
    }
}
