package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class ve0 implements Closeable {
    private final long bpdqqiQNVROMLC1ll1l1l11;
    private final FileChannel ddbbbeXHXx111ll;
    private final File dpbdpqRKAscW1lll1l;
    private final FileLock dqpdbEevAufTOvPphbjykClll1l11;
    private final RandomAccessFile dqpqqqbqQyjyB11111l1;
    private final File ppbdpwWWljzmXXdHNabfWhgjl111l11;

    class dbpqdHhmDSIHIJiwc1ll1l1 implements FileFilter {
        final /* synthetic */ ve0 dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(ve0 ve0Var) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
        }
    }

    private static class dpbdbdpbLwkLpObyKsq1lll1 extends File {
        public long dpbdpqRKAscW1lll1l;

        public dpbdbdpbLwkLpObyKsq1lll1(File file, String str) {
        }
    }

    ve0(File file, File file2) throws IOException {
    }

    private static boolean bdddqmITkkeGpsxVXHR1l1llll(Context context, File file, long j, String str) {
    }

    private List<dpbdbdpbLwkLpObyKsq1lll1> dbbpdqqpdVUhpQ1ll11(Context context, String str) throws IOException {
    }

    private static long dbppbdqpeLmcbs11l11(File file) {
    }

    private static long ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(File file) throws IOException {
    }

    private void dpbdbdpbLwkLpObyKsq1lll1() {
    }

    private static void dpbdpqRKAscW1lll1l(Closeable closeable) {
    }

    private static SharedPreferences dqpqqqbqQyjyB11111l1(Context context) {
    }

    private static void ppbdpwWWljzmXXdHNabfWhgjl111l11(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
    }

    private List<dpbdbdpbLwkLpObyKsq1lll1> qbdqqpbqpCWRpIKEKtzoceYOll1ll1l() throws IOException {
    }

    private static void qdqdpyALEmZFGGaahRTIU1ll11(Context context, String str, long j, long j2, List<dpbdbdpbLwkLpObyKsq1lll1> list) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    List<? extends File> dqdqbpQposEBDyDxIyyz1ll11(Context context, String str, boolean z) throws IOException {
    }
}
