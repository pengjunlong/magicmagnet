package com.tencent.tinker.android.dex;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class DexFormat {
    public static final int API_CURRENT = 14;
    public static final int API_NO_EXTENDED_OPCODES = 13;
    public static final String DEX_IN_JAR_NAME = "classes.dex";
    public static final int ENDIAN_TAG = 305419896;
    public static final String MAGIC_PREFIX = "dex\n";
    public static final String MAGIC_SUFFIX = "\u0000";
    public static final int MAX_MEMBER_IDX = 65535;
    public static final int MAX_TYPE_IDX = 65535;
    public static final String VERSION_CURRENT = "036";
    public static final String VERSION_FOR_API_13 = "035";

    private DexFormat() {
    }

    public static String apiToMagic(int i) {
    }

    public static int magicToApi(byte[] bArr) {
    }
}
