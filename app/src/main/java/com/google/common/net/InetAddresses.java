package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.CharMatcher;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class InetAddresses {
    private static final Inet4Address ANY4 = null;
    private static final char IPV4_DELIMITER = '.';
    private static final CharMatcher IPV4_DELIMITER_MATCHER = null;
    private static final int IPV4_PART_COUNT = 4;
    private static final char IPV6_DELIMITER = ':';
    private static final CharMatcher IPV6_DELIMITER_MATCHER = null;
    private static final int IPV6_PART_COUNT = 8;
    private static final Inet4Address LOOPBACK4 = null;

    @Beta
    public static final class TeredoInfo {
        private final Inet4Address client;
        private final int flags;
        private final int port;
        private final Inet4Address server;

        public TeredoInfo(Inet4Address inet4Address, Inet4Address inet4Address2, int i, int i2) {
        }

        public Inet4Address getClient() {
        }

        public int getFlags() {
        }

        public int getPort() {
        }

        public Inet4Address getServer() {
        }
    }

    private InetAddresses() {
    }

    static /* synthetic */ Inet4Address access$000() {
    }

    private static InetAddress bytesToInetAddress(byte[] bArr) {
    }

    public static int coerceToInteger(InetAddress inetAddress) {
    }

    private static void compressLongestRunOfZeroes(int[] iArr) {
    }

    private static String convertDottedQuadToHex(String str) {
    }

    public static InetAddress decrement(InetAddress inetAddress) {
    }

    public static InetAddress forString(String str) {
    }

    public static InetAddress forUriString(String str) {
    }

    private static InetAddress forUriStringNoThrow(String str) {
    }

    private static IllegalArgumentException formatIllegalArgumentException(String str, Object... objArr) {
    }

    private static InetAddress fromBigInteger(BigInteger bigInteger, boolean z) {
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger bigInteger) {
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger bigInteger) {
    }

    public static Inet4Address fromInteger(int i) {
    }

    public static InetAddress fromLittleEndianByteArray(byte[] bArr) throws UnknownHostException {
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address inet6Address) {
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress inetAddress) {
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address inet6Address) {
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
    }

    private static Inet4Address getInet4Address(byte[] bArr) {
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address inet6Address) {
    }

    public static TeredoInfo getTeredoInfo(Inet6Address inet6Address) {
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
    }

    private static String hextetsToIPv6String(int[] iArr) {
    }

    public static InetAddress increment(InetAddress inetAddress) {
    }

    private static byte[] ipStringToBytes(String str) {
    }

    public static boolean is6to4Address(Inet6Address inet6Address) {
    }

    public static boolean isCompatIPv4Address(Inet6Address inet6Address) {
    }

    public static boolean isInetAddress(String str) {
    }

    public static boolean isIsatapAddress(Inet6Address inet6Address) {
    }

    public static boolean isMappedIPv4Address(String str) {
    }

    public static boolean isMaximum(InetAddress inetAddress) {
    }

    public static boolean isTeredoAddress(Inet6Address inet6Address) {
    }

    public static boolean isUriInetAddress(String str) {
    }

    private static short parseHextet(String str, int i, int i2) {
    }

    private static byte parseOctet(String str, int i, int i2) {
    }

    private static byte[] textToNumericFormatV4(String str) {
    }

    private static byte[] textToNumericFormatV6(String str) {
    }

    public static String toAddrString(InetAddress inetAddress) {
    }

    public static BigInteger toBigInteger(InetAddress inetAddress) {
    }

    public static String toUriString(InetAddress inetAddress) {
    }
}
