package org.apache.xerces.xinclude;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SecuritySupport {

    /* renamed from: org.apache.xerces.xinclude.SecuritySupport$1 */
    static class C18201 implements PrivilegedAction {
        C18201() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.xinclude.SecuritySupport$2 */
    static class C18212 implements PrivilegedAction {
        C18212() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.xinclude.SecuritySupport$3 */
    static class C18223 implements PrivilegedAction {
        final /* synthetic */ ClassLoader val$cl;

        C18223(ClassLoader classLoader) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.xinclude.SecuritySupport$4 */
    static class C18234 implements PrivilegedAction {
        final /* synthetic */ String val$propName;

        C18234(String str) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.xinclude.SecuritySupport$5 */
    static class C18245 implements PrivilegedExceptionAction {
        final /* synthetic */ File val$file;

        C18245(File file) {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Object run() throws FileNotFoundException {
        }
    }

    /* renamed from: org.apache.xerces.xinclude.SecuritySupport$6 */
    static class C18256 implements PrivilegedAction {
        final /* synthetic */ ClassLoader val$cl;
        final /* synthetic */ String val$name;

        C18256(ClassLoader classLoader, String str) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.xinclude.SecuritySupport$7 */
    static class C18267 implements PrivilegedAction {
        final /* synthetic */ File val$f;

        C18267(File file) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.xinclude.SecuritySupport$8 */
    static class C18278 implements PrivilegedAction {
        final /* synthetic */ File val$f;

        C18278(File file) {
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
