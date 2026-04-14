package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class CompositeException extends RuntimeException {
    private final String bpdqqiQNVROMLC1ll1l1l11;
    private final List<Throwable> dpbdpqRKAscW1lll1l;
    private Throwable ppbdpwWWljzmXXdHNabfWhgjl111l11;

    static final class dbpqdHhmDSIHIJiwc1ll1l1 extends RuntimeException {
        dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
        }
    }

    static abstract class dpbdbdpbLwkLpObyKsq1lll1 {
        dpbdbdpbLwkLpObyKsq1lll1() {
        }

        abstract void dbpqdHhmDSIHIJiwc1ll1l1(Object obj);
    }

    static final class dpbdpqRKAscW1lll1l extends dpbdbdpbLwkLpObyKsq1lll1 {
        private final PrintWriter dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdpqRKAscW1lll1l(PrintWriter printWriter) {
        }

        @Override // io.reactivex.exceptions.CompositeException.dpbdbdpbLwkLpObyKsq1lll1
        void dbpqdHhmDSIHIJiwc1ll1l1(Object obj) {
        }
    }

    static final class dqqppqiKzJi1l1lll1l extends dpbdbdpbLwkLpObyKsq1lll1 {
        private final PrintStream dbpqdHhmDSIHIJiwc1ll1l1;

        dqqppqiKzJi1l1lll1l(PrintStream printStream) {
        }

        @Override // io.reactivex.exceptions.CompositeException.dpbdbdpbLwkLpObyKsq1lll1
        void dbpqdHhmDSIHIJiwc1ll1l1(Object obj) {
        }
    }

    private void bpdqqiQNVROMLC1ll1l1l11(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    private void dbpqdHhmDSIHIJiwc1ll1l1(StringBuilder sb, Throwable th, String str) {
    }

    private List<Throwable> dqqppqiKzJi1l1lll1l(Throwable th) {
    }

    Throwable dpbdpqRKAscW1lll1l(Throwable th) {
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
    }
}
