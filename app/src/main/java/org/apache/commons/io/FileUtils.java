package org.apache.commons.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Checksum;
import org.apache.commons.io.filefilter.IOFileFilter;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FileUtils {
    public static final File[] EMPTY_FILE_ARRAY = null;
    private static final long FILE_COPY_BUFFER_SIZE = 31457280;
    public static final long ONE_EB = 1152921504606846976L;
    public static final BigInteger ONE_EB_BI = null;
    public static final long ONE_GB = 1073741824;
    public static final BigInteger ONE_GB_BI = null;
    public static final long ONE_KB = 1024;
    public static final BigInteger ONE_KB_BI = null;
    public static final long ONE_MB = 1048576;
    public static final BigInteger ONE_MB_BI = null;
    public static final long ONE_PB = 1125899906842624L;
    public static final BigInteger ONE_PB_BI = null;
    public static final long ONE_TB = 1099511627776L;
    public static final BigInteger ONE_TB_BI = null;
    public static final BigInteger ONE_YB = null;
    public static final BigInteger ONE_ZB = null;
    private static final Charset UTF8 = null;

    public static String byteCountToDisplaySize(BigInteger bigInteger) {
    }

    private static void checkDirectory(File file) {
    }

    public static Checksum checksum(File file, Checksum checksum) throws IOException {
    }

    public static long checksumCRC32(File file) throws IOException {
    }

    public static void cleanDirectory(File file) throws IOException {
    }

    private static void cleanDirectoryOnExit(File file) throws IOException {
    }

    public static boolean contentEquals(File file, File file2) throws IOException {
    }

    public static boolean contentEqualsIgnoreEOL(File file, File file2, String str) throws IOException {
    }

    public static File[] convertFileCollectionToFileArray(Collection<File> collection) {
    }

    public static void copyDirectory(File file, File file2) throws IOException {
    }

    public static void copyDirectoryToDirectory(File file, File file2) throws IOException {
    }

    public static void copyFile(File file, File file2) throws IOException {
    }

    public static void copyFileToDirectory(File file, File file2) throws IOException {
    }

    public static void copyInputStreamToFile(InputStream inputStream, File file) throws IOException {
    }

    public static void copyURLToFile(URL url, File file) throws IOException {
    }

    static String decodeUrl(String str) {
    }

    public static void deleteDirectory(File file) throws IOException {
    }

    private static void deleteDirectoryOnExit(File file) throws IOException {
    }

    public static boolean deleteQuietly(File file) {
    }

    public static boolean directoryContains(File file, File file2) throws IOException {
    }

    private static void doCopyDirectory(File file, File file2, FileFilter fileFilter, boolean z, List<String> list) throws IOException {
    }

    private static void doCopyFile(File file, File file2, boolean z) throws IOException {
    }

    public static void forceDelete(File file) throws IOException {
    }

    public static void forceDeleteOnExit(File file) throws IOException {
    }

    public static void forceMkdir(File file) throws IOException {
    }

    public static File getFile(File file, String... strArr) {
    }

    public static File getTempDirectory() {
    }

    public static String getTempDirectoryPath() {
    }

    public static File getUserDirectory() {
    }

    public static String getUserDirectoryPath() {
    }

    private static void innerListFiles(Collection<File> collection, File file, IOFileFilter iOFileFilter, boolean z) {
    }

    public static boolean isFileNewer(File file, File file2) {
    }

    public static boolean isFileOlder(File file, File file2) {
    }

    public static boolean isSymlink(File file) throws IOException {
    }

    public static Iterator<File> iterateFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
    }

    public static Iterator<File> iterateFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
    }

    public static LineIterator lineIterator(File file, String str) throws IOException {
    }

    public static Collection<File> listFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
    }

    public static Collection<File> listFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
    }

    public static void moveDirectory(File file, File file2) throws IOException {
    }

    public static void moveDirectoryToDirectory(File file, File file2, boolean z) throws IOException {
    }

    public static void moveFile(File file, File file2) throws IOException {
    }

    public static void moveFileToDirectory(File file, File file2, boolean z) throws IOException {
    }

    public static void moveToDirectory(File file, File file2, boolean z) throws IOException {
    }

    public static FileInputStream openInputStream(File file) throws IOException {
    }

    public static FileOutputStream openOutputStream(File file) throws IOException {
    }

    public static byte[] readFileToByteArray(File file) throws IOException {
    }

    public static String readFileToString(File file, Charset charset) throws IOException {
    }

    public static List<String> readLines(File file, Charset charset) throws IOException {
    }

    private static IOFileFilter setUpEffectiveDirFilter(IOFileFilter iOFileFilter) {
    }

    private static IOFileFilter setUpEffectiveFileFilter(IOFileFilter iOFileFilter) {
    }

    public static long sizeOf(File file) {
    }

    public static BigInteger sizeOfAsBigInteger(File file) {
    }

    public static long sizeOfDirectory(File file) {
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(File file) {
    }

    public static File toFile(URL url) {
    }

    public static File[] toFiles(URL[] urlArr) {
    }

    private static String[] toSuffixes(String[] strArr) {
    }

    public static URL[] toURLs(File[] fileArr) throws IOException {
    }

    public static void touch(File file) throws IOException {
    }

    private static void validateListFilesParameters(File file, IOFileFilter iOFileFilter) {
    }

    public static boolean waitFor(File file, int i) {
    }

    public static void write(File file, CharSequence charSequence) throws IOException {
    }

    public static void writeByteArrayToFile(File file, byte[] bArr) throws IOException {
    }

    public static void writeLines(File file, String str, Collection<?> collection) throws IOException {
    }

    public static void writeStringToFile(File file, String str, Charset charset) throws IOException {
    }

    public static void copyDirectory(File file, File file2, boolean z) throws IOException {
    }

    public static void copyFile(File file, File file2, boolean z) throws IOException {
    }

    public static void copyFileToDirectory(File file, File file2, boolean z) throws IOException {
    }

    public static Iterator<File> iterateFiles(File file, String[] strArr, boolean z) {
    }

    public static FileOutputStream openOutputStream(File file, boolean z) throws IOException {
    }

    public static void write(File file, CharSequence charSequence, boolean z) throws IOException {
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, boolean z) throws IOException {
    }

    public static void writeLines(File file, String str, Collection<?> collection, boolean z) throws IOException {
    }

    public static void writeStringToFile(File file, String str, String str2) throws IOException {
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter) throws IOException {
    }

    public static void copyURLToFile(URL url, File file, int i, int i2) throws IOException {
    }

    public static void write(File file, CharSequence charSequence, Charset charset) throws IOException {
    }

    public static void writeLines(File file, Collection<?> collection) throws IOException {
    }

    public static void writeStringToFile(File file, String str, Charset charset, boolean z) throws IOException {
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter, boolean z) throws IOException {
    }

    public static String readFileToString(File file, String str) throws IOException {
    }

    public static List<String> readLines(File file, String str) throws IOException {
    }

    public static void write(File file, CharSequence charSequence, String str) throws IOException {
    }

    public static void writeLines(File file, Collection<?> collection, boolean z) throws IOException {
    }

    public static File getFile(String... strArr) {
    }

    public static boolean isFileNewer(File file, Date date) {
    }

    public static boolean isFileOlder(File file, Date date) {
    }

    public static String readFileToString(File file) throws IOException {
    }

    public static List<String> readLines(File file) throws IOException {
    }

    public static void write(File file, CharSequence charSequence, Charset charset, boolean z) throws IOException {
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2) throws IOException {
    }

    public static Collection<File> listFiles(File file, String[] strArr, boolean z) {
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2, boolean z) throws IOException {
    }

    public static boolean isFileNewer(File file, long j) {
    }

    public static boolean isFileOlder(File file, long j) {
    }

    public static LineIterator lineIterator(File file) throws IOException {
    }

    public static void write(File file, CharSequence charSequence, String str, boolean z) throws IOException {
    }

    public static void writeStringToFile(File file, String str, String str2, boolean z) throws IOException {
    }

    public static void writeStringToFile(File file, String str) throws IOException {
    }

    public static void writeStringToFile(File file, String str, boolean z) throws IOException {
    }

    public static void writeLines(File file, Collection<?> collection, String str) throws IOException {
    }

    public static void writeLines(File file, Collection<?> collection, String str, boolean z) throws IOException {
    }

    public static String byteCountToDisplaySize(long j) {
    }

    public static long copyFile(File file, OutputStream outputStream) throws IOException {
    }
}
