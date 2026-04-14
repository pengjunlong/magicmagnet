package org.apache.xerces.xni;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XNIException extends RuntimeException {
    static final long serialVersionUID = 9019819772686063775L;
    private Exception fException;

    public XNIException(String str) {
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
    }

    public Exception getException() {
    }

    @Override // java.lang.Throwable
    public synchronized Throwable initCause(Throwable th) {
    }

    public XNIException(Exception exc) {
    }

    public XNIException(String str, Exception exc) {
    }
}
