package org.apache.xml.serialize;

import java.io.UnsupportedEncodingException;
import org.w3c.dom.Document;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OutputFormat {
    private boolean _allowJavaNames;
    private String[] _cdataElements;
    private String _doctypePublic;
    private String _doctypeSystem;
    private String _encoding;
    private EncodingInfo _encodingInfo;
    private int _indent;
    private String _lineSeparator;
    private int _lineWidth;
    private String _mediaType;
    private String _method;
    private String[] _nonEscapingElements;
    private boolean _omitComments;
    private boolean _omitDoctype;
    private boolean _omitXmlDeclaration;
    private boolean _preserve;
    private boolean _preserveEmptyAttributes;
    private boolean _standalone;
    private String _version;

    public static class DTD {
        public static final String HTMLPublicId = "-//W3C//DTD HTML 4.01//EN";
        public static final String HTMLSystemId = "http://www.w3.org/TR/html4/strict.dtd";
        public static final String XHTMLPublicId = "-//W3C//DTD XHTML 1.0 Strict//EN";
        public static final String XHTMLSystemId = "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd";
    }

    public static class Defaults {
        public static final String Encoding = "UTF-8";
        public static final int Indent = 4;
        public static final int LineWidth = 72;
    }

    public OutputFormat() {
    }

    public static String whichDoctypePublic(Document document) {
    }

    public static String whichDoctypeSystem(Document document) {
    }

    public static String whichMediaType(String str) {
    }

    public static String whichMethod(Document document) {
    }

    public String[] getCDataElements() {
    }

    public String getDoctypePublic() {
    }

    public String getDoctypeSystem() {
    }

    public String getEncoding() {
    }

    public EncodingInfo getEncodingInfo() throws UnsupportedEncodingException {
    }

    public int getIndent() {
    }

    public boolean getIndenting() {
    }

    public char getLastPrintable() {
    }

    public String getLineSeparator() {
    }

    public int getLineWidth() {
    }

    public String getMediaType() {
    }

    public String getMethod() {
    }

    public String[] getNonEscapingElements() {
    }

    public boolean getOmitComments() {
    }

    public boolean getOmitDocumentType() {
    }

    public boolean getOmitXMLDeclaration() {
    }

    public boolean getPreserveEmptyAttributes() {
    }

    public boolean getPreserveSpace() {
    }

    public boolean getStandalone() {
    }

    public String getVersion() {
    }

    public boolean isCDataElement(String str) {
    }

    public boolean isNonEscapingElement(String str) {
    }

    public void setAllowJavaNames(boolean z) {
    }

    public void setCDataElements(String[] strArr) {
    }

    public void setDoctype(String str, String str2) {
    }

    public void setEncoding(String str) {
    }

    public void setIndent(int i) {
    }

    public void setIndenting(boolean z) {
    }

    public void setLineSeparator(String str) {
    }

    public void setLineWidth(int i) {
    }

    public void setMediaType(String str) {
    }

    public void setMethod(String str) {
    }

    public void setNonEscapingElements(String[] strArr) {
    }

    public void setOmitComments(boolean z) {
    }

    public void setOmitDocumentType(boolean z) {
    }

    public void setOmitXMLDeclaration(boolean z) {
    }

    public void setPreserveEmptyAttributes(boolean z) {
    }

    public void setPreserveSpace(boolean z) {
    }

    public void setStandalone(boolean z) {
    }

    public void setVersion(String str) {
    }

    public boolean setAllowJavaNames() {
    }

    public void setEncoding(EncodingInfo encodingInfo) {
    }

    public OutputFormat(String str, String str2, boolean z) {
    }

    public OutputFormat(Document document) {
    }

    public OutputFormat(Document document, String str, boolean z) {
    }
}
