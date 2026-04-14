package org.apache.xerces.dom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SecuritySupport {

    /* renamed from: org.apache.xerces.dom.SecuritySupport$1 */
    static class C17731 implements PrivilegedAction {
        C17731() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.dom.SecuritySupport$2 */
    static class C17742 implements PrivilegedAction {
        C17742() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.dom.SecuritySupport$3 */
    static class C17753 implements PrivilegedAction {
        final /* synthetic */ ClassLoader val$cl;

        C17753(ClassLoader classLoader) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.dom.SecuritySupport$4 */
    static class C17764 implements PrivilegedAction {
        final /* synthetic */ String val$propName;

        C17764(String str) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.dom.SecuritySupport$5 */
    static class C17775 implements PrivilegedExceptionAction {
        final /* synthetic */ File val$file;

        C17775(File file) {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Object run() throws FileNotFoundException {
        }
    }

    /* renamed from: org.apache.xerces.dom.SecuritySupport$6 */
    static class C17786 implements PrivilegedAction {
        final /* synthetic */ ClassLoader val$cl;
        final /* synthetic */ String val$name;

        C17786(ClassLoader classLoader, String str) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.dom.SecuritySupport$7 */
    static class C17797 implements PrivilegedAction {
        final /* synthetic */ File val$f;

        C17797(File file) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.dom.SecuritySupport$8 */
    static class C17808 implements PrivilegedAction {
        final /* synthetic */ File val$f;

        C17808(File file) {
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
