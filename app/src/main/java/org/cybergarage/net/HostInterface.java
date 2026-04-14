package org.cybergarage.net;

import java.net.InetAddress;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class HostInterface {
    public static final int IPV4_BITMASK = 1;
    public static final int IPV6_BITMASK = 16;
    public static final int LOCAL_BITMASK = 256;
    public static boolean USE_LOOPBACK_ADDR = false;
    public static boolean USE_ONLY_IPV4_ADDR = false;
    public static boolean USE_ONLY_IPV6_ADDR = false;
    private static String ifAddress = "";

    public static final String getHostAddress(int i) {
    }

    public static final String getHostURL(String str, int i, String str2) {
    }

    public static final String getIPv4Address() {
    }

    public static final String getIPv6Address() {
    }

    public static final InetAddress[] getInetAddress(int i, String[] strArr) {
    }

    public static final String getInterface() {
    }

    public static final int getNHostAddresses() {
    }

    private static final boolean hasAssignedInterface() {
    }

    public static final boolean hasIPv4Addresses() {
    }

    public static final boolean hasIPv6Addresses() {
    }

    public static final boolean isIPv4Address(String str) {
    }

    public static final boolean isIPv6Address(String str) {
    }

    private static final boolean isUsableAddress(InetAddress inetAddress) {
    }

    public static final void setInterface(String str) {
    }
}
