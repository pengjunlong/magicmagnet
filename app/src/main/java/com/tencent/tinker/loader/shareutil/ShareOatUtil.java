package com.tencent.tinker.loader.shareutil;

import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ShareOatUtil {
    private static final String TAG = "Tinker.OatUtil";

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareOatUtil$1 */
    static /* synthetic */ class C16561 {

        /* renamed from: $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet */
        static final /* synthetic */ int[] f1150x5351f0c2 = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class InstructionSet {
        private static final /* synthetic */ InstructionSet[] $VALUES = null;
        public static final InstructionSet kArm = null;
        public static final InstructionSet kArm64 = null;
        public static final InstructionSet kMips = null;
        public static final InstructionSet kMips64 = null;
        public static final InstructionSet kNone = null;
        public static final InstructionSet kThumb2 = null;
        public static final InstructionSet kX86 = null;
        public static final InstructionSet kX86_64 = null;

        private InstructionSet(String str, int i) {
        }

        public static InstructionSet valueOf(String str) {
        }

        public static InstructionSet[] values() {
        }
    }

    private ShareOatUtil() {
    }

    public static String getOatFileInstructionSet(File file) throws Throwable {
    }
}
