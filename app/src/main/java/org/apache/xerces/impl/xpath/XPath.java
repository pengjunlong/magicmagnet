package org.apache.xerces.impl.xpath;

import java.util.Hashtable;
import java.util.Vector;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.NamespaceContext;
import org.apache.xerces.xni.QName;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XPath {
    private static final boolean DEBUG_ALL = false;
    private static final boolean DEBUG_ANY = false;
    private static final boolean DEBUG_XPATH_PARSE = false;
    protected final String fExpression;
    protected final LocationPath[] fLocationPaths;
    protected final SymbolTable fSymbolTable;

    /* renamed from: org.apache.xerces.impl.xpath.XPath$1 */
    class C17961 extends Scanner {
        final /* synthetic */ XPath this$0;

        C17961(XPath xPath, SymbolTable symbolTable) {
        }

        @Override // org.apache.xerces.impl.xpath.XPath.Scanner
        protected void addToken(Tokens tokens, int i) throws XPathException {
        }
    }

    private static class Scanner {
        private static final byte CHARTYPE_ATSIGN = 19;
        private static final byte CHARTYPE_CLOSE_BRACKET = 22;
        private static final byte CHARTYPE_CLOSE_PAREN = 7;
        private static final byte CHARTYPE_COLON = 15;
        private static final byte CHARTYPE_COMMA = 10;
        private static final byte CHARTYPE_DIGIT = 14;
        private static final byte CHARTYPE_DOLLAR = 5;
        private static final byte CHARTYPE_EQUAL = 17;
        private static final byte CHARTYPE_EXCLAMATION = 3;
        private static final byte CHARTYPE_GREATER = 18;
        private static final byte CHARTYPE_INVALID = 0;
        private static final byte CHARTYPE_LESS = 16;
        private static final byte CHARTYPE_LETTER = 20;
        private static final byte CHARTYPE_MINUS = 11;
        private static final byte CHARTYPE_NONASCII = 25;
        private static final byte CHARTYPE_OPEN_BRACKET = 21;
        private static final byte CHARTYPE_OPEN_PAREN = 6;
        private static final byte CHARTYPE_OTHER = 1;
        private static final byte CHARTYPE_PERIOD = 12;
        private static final byte CHARTYPE_PLUS = 9;
        private static final byte CHARTYPE_QUOTE = 4;
        private static final byte CHARTYPE_SLASH = 13;
        private static final byte CHARTYPE_STAR = 8;
        private static final byte CHARTYPE_UNDERSCORE = 23;
        private static final byte CHARTYPE_UNION = 24;
        private static final byte CHARTYPE_WHITESPACE = 2;
        private static final byte[] fASCIICharMap = null;
        private static final String fAncestorOrSelfSymbol = null;
        private static final String fAncestorSymbol = null;
        private static final String fAndSymbol = null;
        private static final String fAttributeSymbol = null;
        private static final String fChildSymbol = null;
        private static final String fCommentSymbol = null;
        private static final String fDescendantOrSelfSymbol = null;
        private static final String fDescendantSymbol = null;
        private static final String fDivSymbol = null;
        private static final String fFollowingSiblingSymbol = null;
        private static final String fFollowingSymbol = null;
        private static final String fModSymbol = null;
        private static final String fNamespaceSymbol = null;
        private static final String fNodeSymbol = null;
        private static final String fOrSymbol = null;
        private static final String fPISymbol = null;
        private static final String fParentSymbol = null;
        private static final String fPrecedingSiblingSymbol = null;
        private static final String fPrecedingSymbol = null;
        private static final String fSelfSymbol = null;
        private static final String fTextSymbol = null;
        private SymbolTable fSymbolTable;

        public Scanner(SymbolTable symbolTable) {
        }

        private int scanNumber(Tokens tokens, String str, int i, int i2) {
        }

        protected void addToken(Tokens tokens, int i) throws XPathException {
        }

        public boolean scanExpr(SymbolTable symbolTable, Tokens tokens, String str, int i, int i2) throws XPathException {
        }

        int scanNCName(String str, int i, int i2) {
        }
    }

    public XPath(String str, SymbolTable symbolTable, NamespaceContext namespaceContext) throws XPathException {
    }

    private LocationPath buildLocationPath(Vector vector) throws XPathException {
    }

    private static void check(boolean z) throws XPathException {
    }

    public static void main(String[] strArr) throws Exception {
    }

    private LocationPath[] parseExpression(NamespaceContext namespaceContext) throws XPathException {
    }

    private NodeTest parseNodeTest(int i, Tokens tokens, NamespaceContext namespaceContext) throws XPathException {
    }

    public LocationPath getLocationPath() {
    }

    public LocationPath[] getLocationPaths() {
    }

    public String toString() {
    }

    public static class Axis implements Cloneable {
        public static final short ATTRIBUTE = 2;
        public static final short CHILD = 1;
        public static final short DESCENDANT = 4;
        public static final short SELF = 3;
        public final short type;

        public Axis(short s) {
        }

        public Object clone() {
        }

        public String toString() {
        }

        protected Axis(Axis axis) {
        }
    }

    public static class LocationPath implements Cloneable {
        public final Step[] steps;

        public LocationPath(Step[] stepArr) {
        }

        public Object clone() {
        }

        public String toString() {
        }

        protected LocationPath(LocationPath locationPath) {
        }
    }

    public static class NodeTest implements Cloneable {
        public static final short NAMESPACE = 4;
        public static final short NODE = 3;
        public static final short QNAME = 1;
        public static final short WILDCARD = 2;
        public final QName name;
        public final short type;

        public NodeTest(short s) {
        }

        public Object clone() {
        }

        public String toString() {
        }

        public NodeTest(QName qName) {
        }

        public NodeTest(String str, String str2) {
        }

        public NodeTest(NodeTest nodeTest) {
        }
    }

    public static class Step implements Cloneable {
        public final Axis axis;
        public final NodeTest nodeTest;

        public Step(Axis axis, NodeTest nodeTest) {
        }

        public Object clone() {
        }

        public String toString() {
        }

        protected Step(Step step) {
        }
    }

    private static final class Tokens {
        static final boolean DUMP_TOKENS = false;
        public static final int EXPRTOKEN_ATSIGN = 6;
        public static final int EXPRTOKEN_AXISNAME_ANCESTOR = 33;
        public static final int EXPRTOKEN_AXISNAME_ANCESTOR_OR_SELF = 34;
        public static final int EXPRTOKEN_AXISNAME_ATTRIBUTE = 35;
        public static final int EXPRTOKEN_AXISNAME_CHILD = 36;
        public static final int EXPRTOKEN_AXISNAME_DESCENDANT = 37;
        public static final int EXPRTOKEN_AXISNAME_DESCENDANT_OR_SELF = 38;
        public static final int EXPRTOKEN_AXISNAME_FOLLOWING = 39;
        public static final int EXPRTOKEN_AXISNAME_FOLLOWING_SIBLING = 40;
        public static final int EXPRTOKEN_AXISNAME_NAMESPACE = 41;
        public static final int EXPRTOKEN_AXISNAME_PARENT = 42;
        public static final int EXPRTOKEN_AXISNAME_PRECEDING = 43;
        public static final int EXPRTOKEN_AXISNAME_PRECEDING_SIBLING = 44;
        public static final int EXPRTOKEN_AXISNAME_SELF = 45;
        public static final int EXPRTOKEN_CLOSE_BRACKET = 3;
        public static final int EXPRTOKEN_CLOSE_PAREN = 1;
        public static final int EXPRTOKEN_COMMA = 7;
        public static final int EXPRTOKEN_DOUBLE_COLON = 8;
        public static final int EXPRTOKEN_DOUBLE_PERIOD = 5;
        public static final int EXPRTOKEN_FUNCTION_NAME = 32;
        public static final int EXPRTOKEN_LITERAL = 46;
        public static final int EXPRTOKEN_NAMETEST_ANY = 9;
        public static final int EXPRTOKEN_NAMETEST_NAMESPACE = 10;
        public static final int EXPRTOKEN_NAMETEST_QNAME = 11;
        public static final int EXPRTOKEN_NODETYPE_COMMENT = 12;
        public static final int EXPRTOKEN_NODETYPE_NODE = 15;
        public static final int EXPRTOKEN_NODETYPE_PI = 14;
        public static final int EXPRTOKEN_NODETYPE_TEXT = 13;
        public static final int EXPRTOKEN_NUMBER = 47;
        public static final int EXPRTOKEN_OPEN_BRACKET = 2;
        public static final int EXPRTOKEN_OPEN_PAREN = 0;
        public static final int EXPRTOKEN_OPERATOR_AND = 16;
        public static final int EXPRTOKEN_OPERATOR_DIV = 19;
        public static final int EXPRTOKEN_OPERATOR_DOUBLE_SLASH = 22;
        public static final int EXPRTOKEN_OPERATOR_EQUAL = 26;
        public static final int EXPRTOKEN_OPERATOR_GREATER = 30;
        public static final int EXPRTOKEN_OPERATOR_GREATER_EQUAL = 31;
        public static final int EXPRTOKEN_OPERATOR_LESS = 28;
        public static final int EXPRTOKEN_OPERATOR_LESS_EQUAL = 29;
        public static final int EXPRTOKEN_OPERATOR_MINUS = 25;
        public static final int EXPRTOKEN_OPERATOR_MOD = 18;
        public static final int EXPRTOKEN_OPERATOR_MULT = 20;
        public static final int EXPRTOKEN_OPERATOR_NOT_EQUAL = 27;
        public static final int EXPRTOKEN_OPERATOR_OR = 17;
        public static final int EXPRTOKEN_OPERATOR_PLUS = 24;
        public static final int EXPRTOKEN_OPERATOR_SLASH = 21;
        public static final int EXPRTOKEN_OPERATOR_UNION = 23;
        public static final int EXPRTOKEN_PERIOD = 4;
        public static final int EXPRTOKEN_VARIABLE_REFERENCE = 48;
        private static final int INITIAL_TOKEN_COUNT = 256;
        private static final String[] fgTokenNames = null;
        private int fCurrentTokenIndex;
        private Hashtable fSymbolMapping;
        private SymbolTable fSymbolTable;
        private int fTokenCount;
        private Hashtable fTokenNames;
        private int[] fTokens;

        public Tokens(SymbolTable symbolTable) {
        }

        public void addToken(String str) {
        }

        public void dumpTokens() {
        }

        public String getTokenString(int i) {
        }

        public boolean hasMore() {
        }

        public int nextToken() throws XPathException {
        }

        public String nextTokenAsString() throws XPathException {
        }

        public int peekToken() throws XPathException {
        }

        public void rewind() {
        }

        public void addToken(int i) {
        }
    }
}
