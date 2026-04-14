package org.apache.xerces.impl.dv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SecuritySupport {

    /* renamed from: org.apache.xerces.impl.dv.SecuritySupport$1 */
    static class C17841 implements PrivilegedAction {
        C17841() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.impl.dv.SecuritySupport$2 */
    static class C17852 implements PrivilegedAction {
        C17852() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.impl.dv.SecuritySupport$3 */
    static class C17863 implements PrivilegedAction {
        final /* synthetic */ ClassLoader val$cl;

        C17863(ClassLoader classLoader) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.impl.dv.SecuritySupport$4 */
    static class C17874 implements PrivilegedAction {
        final /* synthetic */ String val$propName;

        C17874(String str) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.impl.dv.SecuritySupport$5 */
    static class C17885 implements PrivilegedExceptionAction {
        final /* synthetic */ File val$file;

        C17885(File file) {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Object run() throws FileNotFoundException {
        }
    }

    /* renamed from: org.apache.xerces.impl.dv.SecuritySupport$6 */
    static class C17896 implements PrivilegedAction {
        final /* synthetic */ ClassLoader val$cl;
        final /* synthetic */ String val$name;

        C17896(ClassLoader classLoader, String str) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.impl.dv.SecuritySupport$7 */
    static class C17907 implements PrivilegedAction {
        final /* synthetic */ File val$f;

        C17907(File file) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xerces.impl.dv.SecuritySupport$8 */
    static class C17918 implements PrivilegedAction {
        final /* synthetic */ File val$f;

        C17918(File file) {
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
