package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class IOUtils {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final char DIR_SEPARATOR = 0;
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    private static final int EOF = -1;
    public static final String LINE_SEPARATOR = null;
    public static final String LINE_SEPARATOR_UNIX = "\n";
    public static final String LINE_SEPARATOR_WINDOWS = "\r\n";
    private static final int SKIP_BUFFER_SIZE = 2048;
    private static byte[] SKIP_BYTE_BUFFER;
    private static char[] SKIP_CHAR_BUFFER;

    public static void close(URLConnection uRLConnection) {
    }

    public static void closeQuietly(Reader reader) {
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) throws IOException {
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader2) throws IOException {
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public static LineIterator lineIterator(Reader reader) {
    }

    public static int read(Reader reader, char[] cArr, int i, int i2) throws IOException {
    }

    public static void readFully(Reader reader, char[] cArr, int i, int i2) throws IOException {
    }

    public static List<String> readLines(InputStream inputStream) throws IOException {
    }

    public static long skip(InputStream inputStream, long j) throws IOException {
    }

    public static void skipFully(InputStream inputStream, long j) throws IOException {
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) throws IOException {
    }

    public static BufferedReader toBufferedReader(Reader reader) {
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
    }

    public static char[] toCharArray(InputStream inputStream) throws IOException {
    }

    public static InputStream toInputStream(CharSequence charSequence) {
    }

    public static String toString(InputStream inputStream) throws IOException {
    }

    public static void write(byte[] bArr, OutputStream outputStream) throws IOException {
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream) throws IOException {
    }

    public static void closeQuietly(Writer writer) {
    }

    public static void copy(InputStream inputStream, Writer writer) throws IOException {
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
    }

    public static LineIterator lineIterator(InputStream inputStream, Charset charset) throws IOException {
    }

    public static List<String> readLines(InputStream inputStream, Charset charset) throws IOException {
    }

    public static char[] toCharArray(InputStream inputStream, Charset charset) throws IOException {
    }

    public static InputStream toInputStream(CharSequence charSequence, Charset charset) {
    }

    public static String toString(InputStream inputStream, Charset charset) throws IOException {
    }

    public static void write(byte[] bArr, Writer writer) throws IOException {
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, Charset charset) throws IOException {
    }

    public static void closeQuietly(InputStream inputStream) {
    }

    public static void copy(InputStream inputStream, Writer writer, Charset charset) throws IOException {
    }

    public static LineIterator lineIterator(InputStream inputStream, String str) throws IOException {
    }

    public static int read(Reader reader, char[] cArr) throws IOException {
    }

    public static void readFully(Reader reader, char[] cArr) throws IOException {
    }

    public static InputStream toInputStream(CharSequence charSequence, String str) throws IOException {
    }

    public static void write(byte[] bArr, Writer writer, Charset charset) throws IOException {
    }

    public static void closeQuietly(OutputStream outputStream) {
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j, long j2) throws IOException {
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
    }

    public static List<String> readLines(InputStream inputStream, String str) throws IOException {
    }

    public static void skipFully(Reader reader, long j) throws IOException {
    }

    public static byte[] toByteArray(InputStream inputStream, long j) throws IOException {
    }

    public static InputStream toInputStream(String str) {
    }

    public static void write(byte[] bArr, Writer writer, String str) throws IOException {
    }

    public static void closeQuietly(Closeable closeable) {
    }

    public static void copy(InputStream inputStream, Writer writer, String str) throws IOException {
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j, long j2, byte[] bArr) throws IOException {
    }

    public static List<String> readLines(Reader reader) throws IOException {
    }

    public static long skip(Reader reader, long j) throws IOException {
    }

    public static char[] toCharArray(InputStream inputStream, String str) throws IOException {
    }

    public static InputStream toInputStream(String str, Charset charset) {
    }

    public static String toString(InputStream inputStream, String str) throws IOException {
    }

    public static void write(char[] cArr, Writer writer) throws IOException {
    }

    public static void closeQuietly(Socket socket) {
    }

    public static int copy(Reader reader, Writer writer) throws IOException {
    }

    public static int read(InputStream inputStream, byte[] bArr) throws IOException {
    }

    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
    }

    public static byte[] toByteArray(InputStream inputStream, int i) throws IOException {
    }

    public static char[] toCharArray(Reader reader) throws IOException {
    }

    public static InputStream toInputStream(String str, String str2) throws IOException {
    }

    public static String toString(Reader reader) throws IOException {
    }

    public static void write(char[] cArr, OutputStream outputStream) throws IOException {
    }

    public static void closeQuietly(Selector selector) {
    }

    public static void copy(Reader reader, OutputStream outputStream) throws IOException {
    }

    public static void write(char[] cArr, OutputStream outputStream, Charset charset) throws IOException {
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, String str2) throws IOException {
    }

    public static void closeQuietly(ServerSocket serverSocket) {
    }

    public static void copy(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
    }

    public static void write(char[] cArr, OutputStream outputStream, String str) throws IOException {
    }

    public static void writeLines(Collection<?> collection, String str, Writer writer) throws IOException {
    }

    public static boolean contentEquals(Reader reader, Reader reader2) throws IOException {
    }

    public static String toString(URI uri) throws IOException {
    }

    public static void write(CharSequence charSequence, Writer writer) throws IOException {
    }

    public static long copyLarge(Reader reader, Writer writer) throws IOException {
    }

    public static byte[] toByteArray(Reader reader) throws IOException {
    }

    public static String toString(URI uri, Charset charset) throws IOException {
    }

    public static void write(CharSequence charSequence, OutputStream outputStream) throws IOException {
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) throws IOException {
    }

    public static long copyLarge(Reader reader, Writer writer, char[] cArr) throws IOException {
    }

    public static byte[] toByteArray(Reader reader, Charset charset) throws IOException {
    }

    public static String toString(URI uri, String str) throws IOException {
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
    }

    public static String toString(URL url) throws IOException {
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
    }

    public static long copyLarge(Reader reader, Writer writer, long j, long j2) throws IOException {
    }

    public static String toString(URL url, Charset charset) throws IOException {
    }

    public static void write(String str, Writer writer) throws IOException {
    }

    public static long copyLarge(Reader reader, Writer writer, long j, long j2, char[] cArr) throws IOException {
    }

    public static byte[] toByteArray(Reader reader, String str) throws IOException {
    }

    public static void write(String str, OutputStream outputStream) throws IOException {
    }

    @Deprecated
    public static byte[] toByteArray(String str) throws IOException {
    }

    public static void write(String str, OutputStream outputStream, Charset charset) throws IOException {
    }

    public static byte[] toByteArray(URI uri) throws IOException {
    }

    public static String toString(URL url, String str) throws IOException {
    }

    public static void write(String str, OutputStream outputStream, String str2) throws IOException {
    }

    public static byte[] toByteArray(URL url) throws IOException {
    }

    @Deprecated
    public static String toString(byte[] bArr) throws IOException {
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, Writer writer) throws IOException {
    }

    public static String toString(byte[] bArr, String str) throws IOException {
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
    }

    public static byte[] toByteArray(URLConnection uRLConnection) throws IOException {
    }
}
