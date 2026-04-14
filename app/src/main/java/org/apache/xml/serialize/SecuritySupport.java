package org.apache.xml.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.PrivilegedAction;
import java.security.PrivilegedExceptionAction;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class SecuritySupport {

    /* renamed from: org.apache.xml.serialize.SecuritySupport$1 */
    static class C18301 implements PrivilegedAction {
        C18301() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xml.serialize.SecuritySupport$2 */
    static class C18312 implements PrivilegedAction {
        C18312() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xml.serialize.SecuritySupport$3 */
    static class C18323 implements PrivilegedAction {
        final /* synthetic */ ClassLoader val$cl;

        C18323(ClassLoader classLoader) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xml.serialize.SecuritySupport$4 */
    static class C18334 implements PrivilegedAction {
        final /* synthetic */ String val$propName;

        C18334(String str) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xml.serialize.SecuritySupport$5 */
    static class C18345 implements PrivilegedExceptionAction {
        final /* synthetic */ File val$file;

        C18345(File file) {
        }

        @Override // java.security.PrivilegedExceptionAction
        public Object run() throws FileNotFoundException {
        }
    }

    /* renamed from: org.apache.xml.serialize.SecuritySupport$6 */
    static class C18356 implements PrivilegedAction {
        final /* synthetic */ ClassLoader val$cl;
        final /* synthetic */ String val$name;

        C18356(ClassLoader classLoader, String str) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xml.serialize.SecuritySupport$7 */
    static class C18367 implements PrivilegedAction {
        final /* synthetic */ File val$f;

        C18367(File file) {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
        }
    }

    /* renamed from: org.apache.xml.serialize.SecuritySupport$8 */
    static class C18378 implements PrivilegedAction {
        final /* synthetic */ File val$f;

        C18378(File file) {
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
