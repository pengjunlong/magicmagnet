package fi.iki.elonen;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class NanoHTTPD {
    protected static Map<String, String> bdddqmITkkeGpsxVXHR1l1llll;
    private static final Pattern dbppbdqpeLmcbs11l11 = null;
    private static final Pattern ddbbbeXHXx111ll = null;
    private static final Pattern ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll = null;
    private static final Pattern dqpdbEevAufTOvPphbjykClll1l11 = null;
    private static final Pattern pbppbpqbamJRy11l1l1 = null;
    private static final Logger qbdpqpstJKhhKkXrsOGvbWw1l1llll = null;
    private Thread bpdqqiQNVROMLC1ll1l1l11;
    private final String dbpqdHhmDSIHIJiwc1ll1l1;
    private final int dpbdbdpbLwkLpObyKsq1lll1;
    private qbddqbdJBkudFfhX1ll1l111 dpbdpqRKAscW1lll1l;
    private dbbpdqqpdVUhpQ1ll11 dqpqqqbqQyjyB11111l1;
    private volatile ServerSocket dqqppqiKzJi1l1lll1l;
    protected dpbdbdpbLwkLpObyKsq1lll1 ppbdpwWWljzmXXdHNabfWhgjl111l11;

    public interface bbdbbpdOJSuInlll111l {
        void clear();

        dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1(String str) throws Exception;
    }

    public static class bdddqmITkkeGpsxVXHR1l1llll implements Closeable {
        private String bpdqqiQNVROMLC1ll1l1l11;
        private boolean dbppbdqpeLmcbs11l11;
        private final Map<String, String> ddbbbeXHXx111ll;
        private boolean ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        private dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l;
        private qbdpqpstJKhhKkXrsOGvbWw1l1llll dqpdbEevAufTOvPphbjykClll1l11;
        private long dqpqqqbqQyjyB11111l1;
        private boolean pbppbpqbamJRy11l1l1;
        private InputStream ppbdpwWWljzmXXdHNabfWhgjl111l11;

        private static class dbpqdHhmDSIHIJiwc1ll1l1 extends FilterOutputStream {
            public dbpqdHhmDSIHIJiwc1ll1l1(OutputStream outputStream) {
            }

            public void dpbdbdpbLwkLpObyKsq1lll1() throws IOException {
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) throws IOException {
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr) throws IOException {
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
            }
        }

        public interface dpbdbdpbLwkLpObyKsq1lll1 {
            String getDescription();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        public static final class dqqppqiKzJi1l1lll1l implements dpbdbdpbLwkLpObyKsq1lll1 {
            public static final dqqppqiKzJi1l1lll1l bbdbbpdOJSuInlll111l = null;
            public static final dqqppqiKzJi1l1lll1l bdddqmITkkeGpsxVXHR1l1llll = null;
            public static final dqqppqiKzJi1l1lll1l bpbbpOxqjGWQAsycX11ll1l1 = null;
            public static final dqqppqiKzJi1l1lll1l bppbpdbCeZVhQNTixBml1lll11l = null;
            public static final dqqppqiKzJi1l1lll1l bpppdpppqFAXRSTHUAmVJLvH11lllll1l = null;
            public static final dqqppqiKzJi1l1lll1l dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 = null;
            public static final dqqppqiKzJi1l1lll1l dbbpdqqpdVUhpQ1ll11 = null;
            public static final dqqppqiKzJi1l1lll1l dbppbdqpeLmcbs11l11 = null;
            public static final dqqppqiKzJi1l1lll1l ddbbbeXHXx111ll = null;
            private static final /* synthetic */ dqqppqiKzJi1l1lll1l[] dddbpbpNqzZZJmSG1111l = null;
            public static final dqqppqiKzJi1l1lll1l ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll = null;
            public static final dqqppqiKzJi1l1lll1l dqdqbpQposEBDyDxIyyz1ll11 = null;
            public static final dqqppqiKzJi1l1lll1l dqpdbEevAufTOvPphbjykClll1l11 = null;
            public static final dqqppqiKzJi1l1lll1l dqpqqqbqQyjyB11111l1 = null;
            public static final dqqppqiKzJi1l1lll1l pbppbpqbamJRy11l1l1 = null;
            public static final dqqppqiKzJi1l1lll1l ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;
            public static final dqqppqiKzJi1l1lll1l qbddqbdJBkudFfhX1ll1l111 = null;
            public static final dqqppqiKzJi1l1lll1l qbdpqpstJKhhKkXrsOGvbWw1l1llll = null;
            public static final dqqppqiKzJi1l1lll1l qbdqqpbqpCWRpIKEKtzoceYOll1ll1l = null;
            public static final dqqppqiKzJi1l1lll1l qdqdpyALEmZFGGaahRTIU1ll11 = null;
            public static final dqqppqiKzJi1l1lll1l qppqdpppIauLKaAtRkB11111l = null;
            private final String bpdqqiQNVROMLC1ll1l1l11;
            private final int dpbdpqRKAscW1lll1l;

            private dqqppqiKzJi1l1lll1l(String str, int i, int i2, String str2) {
            }

            public static dqqppqiKzJi1l1lll1l valueOf(String str) {
            }

            public static dqqppqiKzJi1l1lll1l[] values() {
            }

            public int dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // fi.iki.elonen.NanoHTTPD.bdddqmITkkeGpsxVXHR1l1llll.dpbdbdpbLwkLpObyKsq1lll1
            public String getDescription() {
            }
        }

        protected bdddqmITkkeGpsxVXHR1l1llll(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, String str, InputStream inputStream, long j) {
        }

        private void bdddqmITkkeGpsxVXHR1l1llll(OutputStream outputStream, long j) throws IOException {
        }

        protected static long dbbpdqqpdVUhpQ1ll11(PrintWriter printWriter, Map<String, String> map, long j) {
        }

        private void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(OutputStream outputStream, long j) throws IOException {
        }

        private void dqdqbpQposEBDyDxIyyz1ll11(OutputStream outputStream, long j) throws IOException {
        }

        private static boolean dqpqqqbqQyjyB11111l1(Map<String, String> map, String str) {
        }

        public void bpbbpOxqjGWQAsycX11ll1l1(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        protected void dbppbdqpeLmcbs11l11(OutputStream outputStream) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(String str, String str2) {
        }

        public String dpbdpqRKAscW1lll1l(String str) {
        }

        public String ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }

        public void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(boolean z) {
        }

        public void qdqdpyALEmZFGGaahRTIU1ll11(boolean z) {
        }

        public void qppqdpppIauLKaAtRkB11111l(boolean z) {
        }
    }

    public class bpdqqiQNVROMLC1ll1l1l11 implements Iterable<String> {
        private final ArrayList<dpbdpqRKAscW1lll1l> bpdqqiQNVROMLC1ll1l1l11;
        private final HashMap<String, String> dpbdpqRKAscW1lll1l;
        final /* synthetic */ NanoHTTPD ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public bpdqqiQNVROMLC1ll1l1l11(NanoHTTPD nanoHTTPD, Map<String, String> map) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
        }
    }

    public interface dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 {
        void delete() throws Exception;

        String getName();
    }

    public interface dbbpdqqpdVUhpQ1ll11 {
        bbdbbpdOJSuInlll111l dbpqdHhmDSIHIJiwc1ll1l1();
    }

    private class dbppbdqpeLmcbs11l11 implements dbbpdqqpdVUhpQ1ll11 {
        final /* synthetic */ NanoHTTPD dbpqdHhmDSIHIJiwc1ll1l1;

        private dbppbdqpeLmcbs11l11(NanoHTTPD nanoHTTPD) {
        }

        @Override // fi.iki.elonen.NanoHTTPD.dbbpdqqpdVUhpQ1ll11
        public bbdbbpdOJSuInlll111l dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        /* synthetic */ dbppbdqpeLmcbs11l11(NanoHTTPD nanoHTTPD, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    public static class ddbbbeXHXx111ll implements dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 {
        private final File dbpqdHhmDSIHIJiwc1ll1l1;
        private final OutputStream dpbdbdpbLwkLpObyKsq1lll1;

        public ddbbbeXHXx111ll(File file) throws IOException {
        }

        @Override // fi.iki.elonen.NanoHTTPD.dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1
        public void delete() throws Exception {
        }

        @Override // fi.iki.elonen.NanoHTTPD.dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1
        public String getName() {
        }
    }

    public interface ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        Map<String, String> dbpqdHhmDSIHIJiwc1ll1l1();

        void dpbdbdpbLwkLpObyKsq1lll1(Map<String, String> map) throws IOException, ResponseException;

        String dqqppqiKzJi1l1lll1l();

        Map<String, String> getHeaders();

        qbdpqpstJKhhKkXrsOGvbWw1l1llll getMethod();

        String getUri();
    }

    public interface dpbdbdpbLwkLpObyKsq1lll1 {
        void dbpqdHhmDSIHIJiwc1ll1l1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l);

        void dpbdbdpbLwkLpObyKsq1lll1();

        void dqqppqiKzJi1l1lll1l(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l);
    }

    public static class dpbdpqRKAscW1lll1l {
        private final String dbpqdHhmDSIHIJiwc1ll1l1;
        private final String dpbdbdpbLwkLpObyKsq1lll1;
        private final String dqqppqiKzJi1l1lll1l;

        public String dbpqdHhmDSIHIJiwc1ll1l1() {
        }
    }

    public class dqdqbpQposEBDyDxIyyz1ll11 implements Runnable {
        private IOException bpdqqiQNVROMLC1ll1l1l11;
        private final int dpbdpqRKAscW1lll1l;
        final /* synthetic */ NanoHTTPD dqpqqqbqQyjyB11111l1;
        private boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

        /* synthetic */ dqdqbpQposEBDyDxIyyz1ll11(NanoHTTPD nanoHTTPD, int i, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        static /* synthetic */ boolean dbpqdHhmDSIHIJiwc1ll1l1(dqdqbpQposEBDyDxIyyz1ll11 dqdqbpqposebdydxiyyz1ll11) {
        }

        static /* synthetic */ IOException dpbdbdpbLwkLpObyKsq1lll1(dqdqbpQposEBDyDxIyyz1ll11 dqdqbpqposebdydxiyyz1ll11) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        private dqdqbpQposEBDyDxIyyz1ll11(NanoHTTPD nanoHTTPD, int i) {
        }
    }

    public static class dqpdbEevAufTOvPphbjykClll1l11 implements bbdbbpdOJSuInlll111l {
        private final File dbpqdHhmDSIHIJiwc1ll1l1;
        private final List<dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1> dpbdbdpbLwkLpObyKsq1lll1;

        @Override // fi.iki.elonen.NanoHTTPD.bbdbbpdOJSuInlll111l
        public void clear() {
        }

        @Override // fi.iki.elonen.NanoHTTPD.bbdbbpdOJSuInlll111l
        public dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 dbpqdHhmDSIHIJiwc1ll1l1(String str) throws Exception {
        }
    }

    public static class dqpqqqbqQyjyB11111l1 implements qbddqbdJBkudFfhX1ll1l111 {
        @Override // fi.iki.elonen.NanoHTTPD.qbddqbdJBkudFfhX1ll1l111
        public ServerSocket dbpqdHhmDSIHIJiwc1ll1l1() throws IOException {
        }
    }

    public class dqqppqiKzJi1l1lll1l implements Runnable {
        private final Socket bpdqqiQNVROMLC1ll1l1l11;
        private final InputStream dpbdpqRKAscW1lll1l;
        final /* synthetic */ NanoHTTPD ppbdpwWWljzmXXdHNabfWhgjl111l11;

        /* synthetic */ dqqppqiKzJi1l1lll1l(NanoHTTPD nanoHTTPD, InputStream inputStream, Socket socket, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        private dqqppqiKzJi1l1lll1l(NanoHTTPD nanoHTTPD, InputStream inputStream, Socket socket) {
        }
    }

    protected class pbppbpqbamJRy11l1l1 implements ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        final /* synthetic */ NanoHTTPD bdddqmITkkeGpsxVXHR1l1llll;
        private int bpdqqiQNVROMLC1ll1l1l11;
        private bpdqqiQNVROMLC1ll1l1l11 dbppbdqpeLmcbs11l11;
        private final bbdbbpdOJSuInlll111l dbpqdHhmDSIHIJiwc1ll1l1;
        private Map<String, String> ddbbbeXHXx111ll;
        private String ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        private final OutputStream dpbdbdpbLwkLpObyKsq1lll1;
        private int dpbdpqRKAscW1lll1l;
        private Map<String, String> dqpdbEevAufTOvPphbjykClll1l11;
        private qbdpqpstJKhhKkXrsOGvbWw1l1llll dqpqqqbqQyjyB11111l1;
        private final BufferedInputStream dqqppqiKzJi1l1lll1l;
        private String pbppbpqbamJRy11l1l1;
        private String ppbdpwWWljzmXXdHNabfWhgjl111l11;
        private String qbdpqpstJKhhKkXrsOGvbWw1l1llll;

        public pbppbpqbamJRy11l1l1(NanoHTTPD nanoHTTPD, bbdbbpdOJSuInlll111l bbdbbpdojsuinlll111l, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        }

        private int bdddqmITkkeGpsxVXHR1l1llll(byte[] bArr, int i) {
        }

        private void bpdqqiQNVROMLC1ll1l1l11(String str, String str2, ByteBuffer byteBuffer, Map<String, String> map, Map<String, String> map2) throws ResponseException {
        }

        private int ddbbbeXHXx111ll(byte[] bArr, int i) {
        }

        private RandomAccessFile ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll() {
        }

        private void dpbdpqRKAscW1lll1l(BufferedReader bufferedReader, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws ResponseException {
        }

        private String dqpdbEevAufTOvPphbjykClll1l11(String str, Pattern pattern, String str2) {
        }

        private int[] pbppbpqbamJRy11l1l1(ByteBuffer byteBuffer, byte[] bArr) {
        }

        private void ppbdpwWWljzmXXdHNabfWhgjl111l11(String str, Map<String, String> map) {
        }

        private String qbdpqpstJKhhKkXrsOGvbWw1l1llll(ByteBuffer byteBuffer, int i, int i2, String str) {
        }

        public long dbppbdqpeLmcbs11l11() {
        }

        @Override // fi.iki.elonen.NanoHTTPD.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll
        public final Map<String, String> dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // fi.iki.elonen.NanoHTTPD.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll
        public void dpbdbdpbLwkLpObyKsq1lll1(Map<String, String> map) throws IOException, ResponseException {
        }

        public void dqpqqqbqQyjyB11111l1() throws IOException {
        }

        @Override // fi.iki.elonen.NanoHTTPD.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll
        public String dqqppqiKzJi1l1lll1l() {
        }

        @Override // fi.iki.elonen.NanoHTTPD.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll
        public final Map<String, String> getHeaders() {
        }

        @Override // fi.iki.elonen.NanoHTTPD.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll
        public final qbdpqpstJKhhKkXrsOGvbWw1l1llll getMethod() {
        }

        @Override // fi.iki.elonen.NanoHTTPD.ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll
        public final String getUri() {
        }
    }

    public static class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements dpbdbdpbLwkLpObyKsq1lll1 {
        private long dbpqdHhmDSIHIJiwc1ll1l1;
        private final List<dqqppqiKzJi1l1lll1l> dpbdbdpbLwkLpObyKsq1lll1;

        @Override // fi.iki.elonen.NanoHTTPD.dpbdbdpbLwkLpObyKsq1lll1
        public void dbpqdHhmDSIHIJiwc1ll1l1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
        }

        @Override // fi.iki.elonen.NanoHTTPD.dpbdbdpbLwkLpObyKsq1lll1
        public void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // fi.iki.elonen.NanoHTTPD.dpbdbdpbLwkLpObyKsq1lll1
        public void dqqppqiKzJi1l1lll1l(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
        }
    }

    public interface qbddqbdJBkudFfhX1ll1l111 {
        ServerSocket dbpqdHhmDSIHIJiwc1ll1l1() throws IOException;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class qbdpqpstJKhhKkXrsOGvbWw1l1llll {
        public static final qbdpqpstJKhhKkXrsOGvbWw1l1llll bpdqqiQNVROMLC1ll1l1l11 = null;
        public static final qbdpqpstJKhhKkXrsOGvbWw1l1llll dbppbdqpeLmcbs11l11 = null;
        public static final qbdpqpstJKhhKkXrsOGvbWw1l1llll ddbbbeXHXx111ll = null;
        public static final qbdpqpstJKhhKkXrsOGvbWw1l1llll ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll = null;
        public static final qbdpqpstJKhhKkXrsOGvbWw1l1llll dpbdpqRKAscW1lll1l = null;
        public static final qbdpqpstJKhhKkXrsOGvbWw1l1llll dqpdbEevAufTOvPphbjykClll1l11 = null;
        public static final qbdpqpstJKhhKkXrsOGvbWw1l1llll dqpqqqbqQyjyB11111l1 = null;
        public static final qbdpqpstJKhhKkXrsOGvbWw1l1llll pbppbpqbamJRy11l1l1 = null;
        public static final qbdpqpstJKhhKkXrsOGvbWw1l1llll ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;
        private static final /* synthetic */ qbdpqpstJKhhKkXrsOGvbWw1l1llll[] qbdpqpstJKhhKkXrsOGvbWw1l1llll = null;

        private qbdpqpstJKhhKkXrsOGvbWw1l1llll(String str, int i) {
        }

        static qbdpqpstJKhhKkXrsOGvbWw1l1llll dbpqdHhmDSIHIJiwc1ll1l1(String str) {
        }

        public static qbdpqpstJKhhKkXrsOGvbWw1l1llll valueOf(String str) {
        }

        public static qbdpqpstJKhhKkXrsOGvbWw1l1llll[] values() {
        }
    }

    public NanoHTTPD(String str, int i) {
    }

    public static Map<String, String> bbdbbpdOJSuInlll111l() {
    }

    protected static String bdddqmITkkeGpsxVXHR1l1llll(String str) {
    }

    static /* synthetic */ Pattern bpdqqiQNVROMLC1ll1l1l11() {
    }

    public static bdddqmITkkeGpsxVXHR1l1llll bppbpdbCeZVhQNTixBml1lll11l(bdddqmITkkeGpsxVXHR1l1llll.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, String str, InputStream inputStream, long j) {
    }

    private static final void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(Object obj) {
    }

    private static void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(Map<String, String> map, String str) {
    }

    public static bdddqmITkkeGpsxVXHR1l1llll dbbpdqqpdVUhpQ1ll11(bdddqmITkkeGpsxVXHR1l1llll.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, String str, InputStream inputStream) {
    }

    static /* synthetic */ String dbppbdqpeLmcbs11l11(NanoHTTPD nanoHTTPD) {
    }

    static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(Object obj) {
    }

    static /* synthetic */ Pattern ddbbbeXHXx111ll() {
    }

    static /* synthetic */ dbbpdqqpdVUhpQ1ll11 dpbdbdpbLwkLpObyKsq1lll1(NanoHTTPD nanoHTTPD) {
    }

    static /* synthetic */ Logger dpbdpqRKAscW1lll1l() {
    }

    public static String dqdqbpQposEBDyDxIyyz1ll11(String str) {
    }

    static /* synthetic */ Pattern dqpdbEevAufTOvPphbjykClll1l11() {
    }

    static /* synthetic */ Pattern dqpqqqbqQyjyB11111l1() {
    }

    static /* synthetic */ ServerSocket dqqppqiKzJi1l1lll1l(NanoHTTPD nanoHTTPD) {
    }

    static /* synthetic */ int pbppbpqbamJRy11l1l1(NanoHTTPD nanoHTTPD) {
    }

    static /* synthetic */ Pattern ppbdpwWWljzmXXdHNabfWhgjl111l11() {
    }

    public static bdddqmITkkeGpsxVXHR1l1llll qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(bdddqmITkkeGpsxVXHR1l1llll.dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, String str, String str2) {
    }

    public void bpbbpOxqjGWQAsycX11ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
    }

    protected boolean bpqbbqTOKdRXac1ll1l1lll(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    public void bpqdqbqpviKiORjqgp1l111l11() throws IOException {
    }

    public void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1(int i) throws IOException {
    }

    public void dddbpbpNqzZZJmSG1111l(dbbpdqqpdVUhpQ1ll11 dbbpdqqpdvuhpq1ll11) {
    }

    public void ddddbbdqIccDnEitQc1l1l1l(int i, boolean z) throws IOException {
    }

    protected dqqppqiKzJi1l1lll1l ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(Socket socket, InputStream inputStream) {
    }

    public void pdpqbmApOBCmNMwnn1ll111() {
    }

    public qbddqbdJBkudFfhX1ll1l111 qbddqbdJBkudFfhX1ll1l111() {
    }

    protected dqdqbpQposEBDyDxIyyz1ll11 qbdpqpstJKhhKkXrsOGvbWw1l1llll(int i) {
    }

    public bdddqmITkkeGpsxVXHR1l1llll qdqdpyALEmZFGGaahRTIU1ll11(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll) {
    }

    @Deprecated
    public bdddqmITkkeGpsxVXHR1l1llll qppqdpppIauLKaAtRkB11111l(String str, qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
    }

    public static final class ResponseException extends Exception {
        private final bdddqmITkkeGpsxVXHR1l1llll.dqqppqiKzJi1l1lll1l dpbdpqRKAscW1lll1l;

        public ResponseException(bdddqmITkkeGpsxVXHR1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, String str) {
        }

        public bdddqmITkkeGpsxVXHR1l1llll.dqqppqiKzJi1l1lll1l dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public ResponseException(bdddqmITkkeGpsxVXHR1l1llll.dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, String str, Exception exc) {
        }
    }
}
