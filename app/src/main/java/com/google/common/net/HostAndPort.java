package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

@Immutable
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class HostAndPort implements Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private HostAndPort(String str, int i, boolean z) {
    }

    public static HostAndPort fromHost(String str) {
    }

    public static HostAndPort fromParts(String str, int i) {
    }

    public static HostAndPort fromString(String str) {
    }

    private static String[] getHostAndPortFromBracketedHost(String str) {
    }

    private static boolean isValidPort(int i) {
    }

    public boolean equals(Object obj) {
    }

    public String getHost() {
    }

    public int getPort() {
    }

    public int getPortOrDefault(int i) {
    }

    public boolean hasPort() {
    }

    public int hashCode() {
    }

    public HostAndPort requireBracketsForIPv6() {
    }

    public String toString() {
    }

    public HostAndPort withDefaultPort(int i) {
    }
}
