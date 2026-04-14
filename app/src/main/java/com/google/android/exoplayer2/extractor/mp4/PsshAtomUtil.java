package com.google.android.exoplayer2.extractor.mp4;

import java.util.UUID;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class PsshAtomUtil {
    private static final String TAG = "PsshAtomUtil";

    private static class PsshAtom {
        private final byte[] schemeData;
        private final UUID uuid;
        private final int version;

        public PsshAtom(UUID uuid, int i, byte[] bArr) {
        }

        static /* synthetic */ UUID access$000(PsshAtom psshAtom) {
        }

        static /* synthetic */ int access$100(PsshAtom psshAtom) {
        }

        static /* synthetic */ byte[] access$200(PsshAtom psshAtom) {
        }
    }

    private PsshAtomUtil() {
    }

    public static byte[] buildPsshAtom(UUID uuid, byte[] bArr) {
    }

    public static boolean isPsshAtom(byte[] bArr) {
    }

    private static PsshAtom parsePsshAtom(byte[] bArr) {
    }

    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
    }

    public static UUID parseUuid(byte[] bArr) {
    }

    public static int parseVersion(byte[] bArr) {
    }

    public static byte[] buildPsshAtom(UUID uuid, UUID[] uuidArr, byte[] bArr) {
    }
}
