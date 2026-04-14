package org.apache.xerces.parsers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SecuritySupport {

    /* renamed from: org.apache.xerces.parsers.SecuritySupport$1 */
    static class C18081 implements PrivilegedAction {
        C18081() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.parsers.SecuritySupport$2 */
    static class C18092 implements PrivilegedAction {
        C18092() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.parsers.SecuritySupport$3 */
    static class C18103 implements PrivilegedAction {
        final /* synthetic */ ClassLoader val$cl;

        C18103(ClassLoader classLoader) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.parsers.SecuritySupport$4 */
    static class C18114 implements PrivilegedAction {
        final /* synthetic */ String val$propName;

        C18114(String str) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.parsers.SecuritySupport$5 */
    static class C18125 implements PrivilegedExceptionAction {
        final /* synthetic */ File val$file;

        C18125(File file) {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Object run() throws FileNotFoundException {
        }
    }

    /* renamed from: org.apache.xerces.parsers.SecuritySupport$6 */
    static class C18136 implements PrivilegedAction {
        final /* synthetic */ ClassLoader val$cl;
        final /* synthetic */ String val$name;

        C18136(ClassLoader classLoader, String str) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.parsers.SecuritySupport$7 */
    static class C18147 implements PrivilegedAction {
        final /* synthetic */ File val$f;

        C18147(File file) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.parsers.SecuritySupport$8 */
    static class C18158 implements PrivilegedAction {
        final /* synthetic */ File val$f;

        C18158(File file) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    private SecuritySupport() {
    }

    static ClassLoader getContextClassLoader() {
    }

    static boolean getFileExists(File file) {
    }

    static FileInputStream getFileInputStream(File file) throws FileNotFoundException {
    }

    static long getLastModified(File file) {
    }

    static ClassLoader getParentClassLoader(ClassLoader classLoader) {
    }

    static InputStream getResourceAsStream(ClassLoader classLoader, String str) {
    }

    static ClassLoader getSystemClassLoader() {
    }

    static String getSystemProperty(String str) {
    }
}
