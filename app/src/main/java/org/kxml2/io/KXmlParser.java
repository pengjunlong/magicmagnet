package org.kxml2.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Hashtable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class KXmlParser implements XmlPullParser {
    private static final String ILLEGAL_TYPE = "Wrong event type";
    private static final int LEGACY = 999;
    private static final String UNEXPECTED_EOF = "Unexpected EOF";
    private static final int XML_DECL = 998;
    private int attributeCount;
    private String[] attributes;
    private int column;
    private boolean degenerated;
    private int depth;
    private String[] elementStack;
    private String encoding;
    private Hashtable entityMap;
    private String error;
    private boolean isWhitespace;
    private int line;
    private Object location;
    private String name;
    private String namespace;
    private int[] nspCounts;
    private String[] nspStack;
    private int[] peek;
    private int peekCount;
    private String prefix;
    private boolean processNsp;
    private Reader reader;
    private boolean relaxed;
    private char[] srcBuf;
    private int srcCount;
    private int srcPos;
    private int stackMismatch;
    private Boolean standalone;
    private boolean token;
    private char[] txtBuf;
    private int txtPos;
    private int type;
    private boolean unresolved;
    private String version;
    private boolean wasCR;

    private final boolean adjustNsp() throws XmlPullParserException {
    }

    private final String[] ensureCapacity(String[] strArr, int i) {
    }

    private final void error(String str) throws XmlPullParserException {
    }

    private final void exception(String str) throws XmlPullParserException {
    }

    private final String get(int i) {
    }

    private final boolean isProp(String str, boolean z, String str2) {
    }

    private final void nextImpl() throws IOException, XmlPullParserException {
    }

    private final void parseDoctype(boolean z) throws IOException, XmlPullParserException {
    }

    private final void parseEndTag() throws IOException, XmlPullParserException {
    }

    private final int parseLegacy(boolean z) throws IOException, XmlPullParserException {
    }

    private final void parseStartTag(boolean z) throws IOException, XmlPullParserException {
    }

    private final int peek(int i) throws IOException {
    }

    private final int peekType() throws IOException {
    }

    private final void push(int i) {
    }

    private final void pushEntity() throws IOException, XmlPullParserException {
    }

    private final void pushText(int i, boolean z) throws IOException, XmlPullParserException {
    }

    private final int read() throws IOException {
    }

    private final void read(char c) throws IOException, XmlPullParserException {
    }

    private final String readName() throws IOException, XmlPullParserException {
    }

    private final void skip() throws IOException {
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

    @Override // org.xmlpull.v1.XmlPullParser
    public void require(int i, String str, String str2) throws XmlPullParserException, IOException {
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

    public void skipSubTree() throws XmlPullParserException, IOException {
    }
}
