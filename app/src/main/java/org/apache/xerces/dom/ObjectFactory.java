package org.apache.xerces.dom;

import java.util.Properties;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
final class ObjectFactory {
    private static final boolean DEBUG = false;
    private static final int DEFAULT_LINE_LENGTH = 80;
    private static final String DEFAULT_PROPERTIES_FILENAME = "xerces.properties";
    private static long fLastModified;
    private static Properties fXercesProperties;

    static final class ConfigurationError extends Error {
        static final long serialVersionUID = 1914065341994951202L;
        private Exception exception;

        ConfigurationError(String str, Exception exc) {
        }

        Exception getException() {
        }
    }

    ObjectFactory() {
    }

    static Object createObject(String str, String str2) throws ConfigurationError {
    }

    private static void debugPrintln(String str) {
    }

    static ClassLoader findClassLoader() throws ConfigurationError {
    }

    private static Object findJarServiceProvider(String str) throws ConfigurationError {
    }

    static Class findProviderClass(String str, ClassLoader classLoader, boolean z) throws ClassNotFoundException, ConfigurationError {
    }

    private static boolean isDebugEnabled() {
    }

    static Object newInstance(String str, ClassLoader classLoader, boolean z) throws ConfigurationError {
    }

    static Object createObject(String str, String str2, String str3) throws ConfigurationError {
    }
}
