package org.adblockplus.libadblockplus.util;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface Base64Processor {
    byte[] decode(byte[] bArr) throws Base64Exception;

    byte[] encode(byte[] bArr) throws Base64Exception;

    String encodeToString(byte[] bArr) throws Base64Exception;
}
