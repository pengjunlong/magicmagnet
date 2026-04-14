package com.tencent.tinker.lib.patch;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BasePatchInternal {
    protected static final String ARKHOT_META_FILE = "assets/arkHot_meta.txt";
    protected static final String DEX_META_FILE = "assets/dex_meta.txt";
    protected static final String DEX_OPTIMIZE_PATH = "odex";
    protected static final String DEX_PATH = "dex";
    protected static final int MAX_EXTRACT_ATTEMPTS = 2;
    protected static final String RES_META_FILE = "assets/res_meta.txt";
    protected static final String SO_META_FILE = "assets/so_meta.txt";
    protected static final String SO_PATH = "lib";
    protected static final String TAG = "Tinker.BasePatchInternal";
    protected static final int TYPE_ARKHOT_SO = 8;
    protected static final int TYPE_CLASS_N_DEX = 7;
    protected static final int TYPE_DEX = 3;
    protected static final int TYPE_LIBRARY = 5;
    protected static final int TYPE_RESOURCE = 6;

    public static boolean extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str, boolean z) throws IOException {
    }

    public static int getMetaCorruptedCode(int i) {
    }
}
