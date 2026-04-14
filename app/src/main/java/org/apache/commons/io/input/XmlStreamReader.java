package org.apache.commons.io.input;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Pattern;
import org.apache.commons.io.ByteOrderMark;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XmlStreamReader extends Reader {
    private static final ByteOrderMark[] BOMS = null;
    private static final int BUFFER_SIZE = 4096;
    private static final Pattern CHARSET_PATTERN = null;
    private static final String EBCDIC = "CP1047";
    public static final Pattern ENCODING_PATTERN = null;
    private static final String HTTP_EX_1 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";
    private static final String HTTP_EX_2 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final String HTTP_EX_3 = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";
    private static final String RAW_EX_1 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    private static final String RAW_EX_2 = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    private static final String US_ASCII = "US-ASCII";
    private static final String UTF_16 = "UTF-16";
    private static final String UTF_16BE = "UTF-16BE";
    private static final String UTF_16LE = "UTF-16LE";
    private static final String UTF_32 = "UTF-32";
    private static final String UTF_32BE = "UTF-32BE";
    private static final String UTF_32LE = "UTF-32LE";
    private static final String UTF_8 = "UTF-8";
    private static final ByteOrderMark[] XML_GUESS_BYTES = null;
    private final String defaultEncoding;
    private final String encoding;
    private final Reader reader;

    public XmlStreamReader(File file) throws IOException {
    }

    private String doHttpStream(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, String str, boolean z) throws IOException {
    }

    private String doLenientDetection(String str, XmlStreamReaderException xmlStreamReaderException) throws IOException {
    }

    private String doRawStream(BOMInputStream bOMInputStream, BOMInputStream bOMInputStream2, boolean z) throws IOException {
    }

    static String getContentTypeEncoding(String str) {
    }

    static String getContentTypeMime(String str) {
    }

    private static String getXmlProlog(InputStream inputStream, String str) throws IOException {
    }

    static boolean isAppXml(String str) {
    }

    static boolean isTextXml(String str) {
    }

    String calculateHttpEncoding(String str, String str2, String str3, String str4, boolean z) throws IOException {
    }

    String calculateRawEncoding(String str, String str2, String str3) throws IOException {
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public String getDefaultEncoding() {
    }

    public String getEncoding() {
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
    }

    public XmlStreamReader(InputStream inputStream) throws IOException {
    }

    public XmlStreamReader(InputStream inputStream, boolean z) throws IOException {
    }

    public XmlStreamReader(InputStream inputStream, boolean z, String str) throws IOException {
    }

    public XmlStreamReader(URL url) throws IOException {
    }

    public XmlStreamReader(URLConnection uRLConnection, String str) throws IOException {
    }

    public XmlStreamReader(InputStream inputStream, String str) throws IOException {
    }

    public XmlStreamReader(InputStream inputStream, String str, boolean z, String str2) throws IOException {
    }

    public XmlStreamReader(InputStream inputStream, String str, boolean z) throws IOException {
    }
}
