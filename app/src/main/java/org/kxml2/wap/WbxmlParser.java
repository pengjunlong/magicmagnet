package org.kxml2.wap;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Hashtable;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class WbxmlParser implements XmlPullParser {
    static final String HEX_DIGITS = "0123456789abcdef";
    private static final String ILLEGAL_TYPE = "Wrong event type";
    private static final String UNEXPECTED_EOF = "Unexpected EOF";
    public static final int WAP_EXTENSION = 64;
    private int ATTR_START_TABLE;
    private int ATTR_VALUE_TABLE;
    private int TAG_TABLE;
    private String[] attrStartTable;
    private String[] attrValueTable;
    private int attributeCount;
    private String[] attributes;
    private Hashtable cacheStringTable;
    private boolean degenerated;
    private int depth;
    private String[] elementStack;
    private String encoding;
    private InputStream in;
    private boolean isWhitespace;
    private String name;
    private String namespace;
    private int nextId;
    private int[] nspCounts;
    private String[] nspStack;
    private String prefix;
    private boolean processNsp;
    private int publicIdentifierId;
    private byte[] stringTable;
    private Vector tables;
    private String[] tagTable;
    private String text;
    private int type;
    private int version;
    private int wapCode;
    private Object wapExtensionData;

    private final boolean adjustNsp() throws XmlPullParserException {
    }

    private final String[] ensureCapacity(String[] strArr, int i) {
    }

    private final void exception(String str) throws XmlPullParserException {
    }

    private final void nextImpl() throws IOException, XmlPullParserException {
    }

    private int peekId() throws IOException {
    }

    private void selectPage(int i, boolean z) throws XmlPullParserException {
    }

    private final void setTable(int i, int i2, String[] strArr) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getAttributeCount() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeName(int i) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeNamespace(int i) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributePrefix(int i) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeType(int i) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeValue(int i) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeValue(String str, String str2) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getColumnNumber() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getDepth() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getEventType() throws XmlPullParserException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean getFeature(String str) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getInputEncoding() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getLineNumber() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getName() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace(String str) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getNamespaceCount(int i) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespacePrefix(int i) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespaceUri(int i) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPositionDescription() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPrefix() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public Object getProperty(String str) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getText() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public char[] getTextCharacters(int[] iArr) {
    }

    public int getWapCode() {
    }

    public Object getWapExtensionData() {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isAttributeDefault(int i) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isEmptyElementTag() throws XmlPullParserException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isWhitespace() throws XmlPullParserException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int next() throws XmlPullParserException, IOException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextTag() throws XmlPullParserException, IOException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String nextText() throws XmlPullParserException, IOException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextToken() throws XmlPullParserException, IOException {
    }

    void parseElement(int i) throws IOException, XmlPullParserException {
    }

    public Object parseWapExtension(int i) throws IOException, XmlPullParserException {
    }

    public void readAttr() throws IOException, XmlPullParserException {
    }

    int readByte() throws IOException {
    }

    int readInt() throws IOException {
    }

    String readStrI() throws IOException {
    }

    String readStrT() throws IOException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void require(int i, String str, String str2) throws XmlPullParserException, IOException {
    }

    String resolveId(String[] strArr, int i) throws IOException {
    }

    protected String resolveWapExtension(int i, Object obj) {
    }

    public void setAttrStartTable(int i, String[] strArr) {
    }

    public void setAttrValueTable(int i, String[] strArr) {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setFeature(String str, boolean z) throws XmlPullParserException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(InputStream inputStream, String str) throws XmlPullParserException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(Reader reader) throws XmlPullParserException {
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setProperty(String str, Object obj) throws XmlPullParserException {
    }

    public void setTagTable(int i, String[] strArr) {
    }
}
