package org.apache.xerces.util;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class URI implements Serializable {
    private static final int ASCII_ALPHA_CHARACTERS = 16;
    private static final int ASCII_DIGIT_CHARACTERS = 32;
    private static final int ASCII_HEX_CHARACTERS = 64;
    private static boolean DEBUG = false;
    private static final int MARK_CHARACTERS = 2;
    private static final int MASK_ALPHA_NUMERIC = 48;
    private static final int MASK_PATH_CHARACTER = 178;
    private static final int MASK_SCHEME_CHARACTER = 52;
    private static final int MASK_UNRESERVED_MASK = 50;
    private static final int MASK_URI_CHARACTER = 51;
    private static final int MASK_USERINFO_CHARACTER = 58;
    private static final int PATH_CHARACTERS = 128;
    private static final int RESERVED_CHARACTERS = 1;
    private static final int SCHEME_CHARACTERS = 4;
    private static final int USERINFO_CHARACTERS = 8;
    private static final byte[] fgLookupTable = null;
    static final long serialVersionUID = 1601921774685357214L;
    private String m_fragment;
    private String m_host;
    private String m_path;
    private int m_port;
    private String m_queryString;
    private String m_regAuthority;
    private String m_scheme;
    private String m_userinfo;

    public static class MalformedURIException extends IOException {
        static final long serialVersionUID = -6695054834342951930L;

        public MalformedURIException() {
        }

        public MalformedURIException(String str) {
        }
    }

    public URI() {
    }

    private void initialize(URI uri) {
    }

    private boolean initializeAuthority(String str) {
    }

    private void initializePath(String str, int i) throws MalformedURIException {
    }

    private void initializeScheme(String str) throws MalformedURIException {
    }

    private static boolean isAlpha(char c) {
    }

    private static boolean isAlphanum(char c) {
    }

    public static boolean isConformantSchemeName(String str) {
    }

    private static boolean isDigit(char c) {
    }

    private static boolean isHex(char c) {
    }

    private static boolean isPathCharacter(char c) {
    }

    private static boolean isReservedCharacter(char c) {
    }

    private static boolean isSchemeCharacter(char c) {
    }

    private static boolean isURICharacter(char c) {
    }

    private static boolean isURIString(String str) {
    }

    private static boolean isUnreservedCharacter(char c) {
    }

    private static boolean isUserinfoCharacter(char c) {
    }

    private boolean isValidRegistryBasedAuthority(String str) {
    }

    private boolean isValidServerBasedAuthority(String str, int i, String str2) {
    }

    public static boolean isWellFormedAddress(String str) {
    }

    public static boolean isWellFormedIPv4Address(String str) {
    }

    public static boolean isWellFormedIPv6Reference(String str) {
    }

    private static int scanHexSequence(String str, int i, int i2, int[] iArr) {
    }

    public void absolutize(URI uri) {
    }

    public void appendPath(String str) throws MalformedURIException {
    }

    public boolean equals(Object obj) {
    }

    public String getAuthority() {
    }

    public String getFragment() {
    }

    public String getHost() {
    }

    public String getPath(boolean z, boolean z2) {
    }

    public int getPort() {
    }

    public String getQueryString() {
    }

    public String getRegBasedAuthority() {
    }

    public String getScheme() {
    }

    public String getSchemeSpecificPart() {
    }

    public String getUserinfo() {
    }

    public boolean isAbsoluteURI() {
    }

    public boolean isGenericURI() {
    }

    public void setFragment(String str) throws MalformedURIException {
    }

    public void setHost(String str) throws MalformedURIException {
    }

    public void setPath(String str) throws MalformedURIException {
    }

    public void setPort(int i) throws MalformedURIException {
    }

    public void setQueryString(String str) throws MalformedURIException {
    }

    public void setRegBasedAuthority(String str) throws MalformedURIException {
    }

    public void setScheme(String str) throws MalformedURIException {
    }

    public void setUserinfo(String str) throws MalformedURIException {
    }

    public String toString() {
    }

    private void initialize(URI uri, String str, boolean z) throws MalformedURIException {
    }

    public String getPath() {
    }

    public URI(URI uri) {
    }

    public URI(String str) throws MalformedURIException {
    }

    public URI(String str, boolean z) throws MalformedURIException {
    }

    public URI(URI uri, String str) throws MalformedURIException {
    }

    private void initialize(URI uri, String str) throws MalformedURIException {
    }

    public URI(URI uri, String str, boolean z) throws MalformedURIException {
    }

    public URI(String str, String str2) throws MalformedURIException {
    }

    public URI(String str, String str2, String str3, String str4, String str5) throws MalformedURIException {
    }

    public URI(String str, String str2, String str3, int i, String str4, String str5, String str6) throws MalformedURIException {
    }
}
