package org.apache.commons.io;

import java.io.IOException;
import java.util.Collection;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FilenameUtils {
    public static final char EXTENSION_SEPARATOR = '.';
    public static final String EXTENSION_SEPARATOR_STR = null;
    private static final char OTHER_SEPARATOR = 0;
    private static final char SYSTEM_SEPARATOR = 0;
    private static final char UNIX_SEPARATOR = '/';
    private static final char WINDOWS_SEPARATOR = '\\';

    public static String concat(String str, String str2) {
    }

    public static boolean directoryContains(String str, String str2) throws IOException {
    }

    private static String doGetFullPath(String str, boolean z) {
    }

    private static String doGetPath(String str, int i) {
    }

    private static String doNormalize(String str, char c, boolean z) {
    }

    public static boolean equals(String str, String str2) {
    }

    public static boolean equalsNormalized(String str, String str2) {
    }

    public static boolean equalsNormalizedOnSystem(String str, String str2) {
    }

    public static boolean equalsOnSystem(String str, String str2) {
    }

    public static String getBaseName(String str) {
    }

    public static String getExtension(String str) {
    }

    public static String getFullPath(String str) {
    }

    public static String getFullPathNoEndSeparator(String str) {
    }

    public static String getName(String str) {
    }

    public static String getPath(String str) {
    }

    public static String getPathNoEndSeparator(String str) {
    }

    public static String getPrefix(String str) {
    }

    public static int getPrefixLength(String str) {
    }

    public static int indexOfExtension(String str) {
    }

    public static int indexOfLastSeparator(String str) {
    }

    public static boolean isExtension(String str, String str2) {
    }

    private static boolean isSeparator(char c) {
    }

    static boolean isSystemWindows() {
    }

    public static String normalize(String str) {
    }

    public static String normalizeNoEndSeparator(String str) {
    }

    public static String removeExtension(String str) {
    }

    public static String separatorsToSystem(String str) {
    }

    public static String separatorsToUnix(String str) {
    }

    public static String separatorsToWindows(String str) {
    }

    static String[] splitOnTokens(String str) {
    }

    public static boolean wildcardMatch(String str, String str2) {
    }

    public static boolean wildcardMatchOnSystem(String str, String str2) {
    }

    public static boolean equals(String str, String str2, boolean z, IOCase iOCase) {
    }

    public static String normalize(String str, boolean z) {
    }

    public static String normalizeNoEndSeparator(String str, boolean z) {
    }

    public static boolean wildcardMatch(String str, String str2, IOCase iOCase) {
    }

    public static boolean isExtension(String str, String[] strArr) {
    }

    public static boolean isExtension(String str, Collection<String> collection) {
    }
}
