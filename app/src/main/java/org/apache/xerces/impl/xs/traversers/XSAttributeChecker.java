package org.apache.xerces.impl.xs.traversers;

import java.util.Hashtable;
import java.util.Vector;
import org.apache.xerces.impl.dv.InvalidDatatypeValueException;
import org.apache.xerces.impl.dv.XSSimpleType;
import org.apache.xerces.impl.xs.SchemaNamespaceSupport;
import org.apache.xerces.impl.xs.XSGrammarBucket;
import org.apache.xerces.impl.xs.util.XInt;
import org.apache.xerces.impl.xs.util.XIntPool;
import org.apache.xerces.util.SymbolTable;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSAttributeChecker {
    public static final int ATTIDX_ABSTRACT = 0;
    public static final int ATTIDX_AFORMDEFAULT = 0;
    public static final int ATTIDX_BASE = 0;
    public static final int ATTIDX_BLOCK = 0;
    public static final int ATTIDX_BLOCKDEFAULT = 0;
    private static int ATTIDX_COUNT = 0;
    public static final int ATTIDX_DEFAULT = 0;
    public static final int ATTIDX_EFORMDEFAULT = 0;
    public static final int ATTIDX_ENUMNSDECLS = 0;
    public static final int ATTIDX_FINAL = 0;
    public static final int ATTIDX_FINALDEFAULT = 0;
    public static final int ATTIDX_FIXED = 0;
    public static final int ATTIDX_FORM = 0;
    public static final int ATTIDX_FROMDEFAULT = 0;
    public static final int ATTIDX_ID = 0;
    public static final int ATTIDX_ISRETURNED = 0;
    public static final int ATTIDX_ITEMTYPE = 0;
    public static final int ATTIDX_MAXOCCURS = 0;
    public static final int ATTIDX_MEMBERTYPES = 0;
    public static final int ATTIDX_MINOCCURS = 0;
    public static final int ATTIDX_MIXED = 0;
    public static final int ATTIDX_NAME = 0;
    public static final int ATTIDX_NAMESPACE = 0;
    public static final int ATTIDX_NAMESPACE_LIST = 0;
    public static final int ATTIDX_NILLABLE = 0;
    public static final int ATTIDX_NONSCHEMA = 0;
    public static final int ATTIDX_PROCESSCONTENTS = 0;
    public static final int ATTIDX_PUBLIC = 0;
    public static final int ATTIDX_REF = 0;
    public static final int ATTIDX_REFER = 0;
    public static final int ATTIDX_SCHEMALOCATION = 0;
    public static final int ATTIDX_SOURCE = 0;
    public static final int ATTIDX_SUBSGROUP = 0;
    public static final int ATTIDX_SYSTEM = 0;
    public static final int ATTIDX_TARGETNAMESPACE = 0;
    public static final int ATTIDX_TYPE = 0;
    public static final int ATTIDX_USE = 0;
    public static final int ATTIDX_VALUE = 0;
    public static final int ATTIDX_VERSION = 0;
    public static final int ATTIDX_XML_LANG = 0;
    public static final int ATTIDX_XPATH = 0;
    private static final String ATTRIBUTE_N = "attribute_n";
    private static final String ATTRIBUTE_R = "attribute_r";
    protected static final int DT_ANYURI = 0;
    protected static final int DT_BLOCK = -1;
    protected static final int DT_BLOCK1 = -2;
    protected static final int DT_BOOLEAN = -15;
    protected static final int DT_COUNT = 9;
    protected static final int DT_FINAL = -3;
    protected static final int DT_FINAL1 = -4;
    protected static final int DT_FINAL2 = -5;
    protected static final int DT_FORM = -6;
    protected static final int DT_ID = 1;
    protected static final int DT_LANGUAGE = 8;
    protected static final int DT_MAXOCCURS = -7;
    protected static final int DT_MAXOCCURS1 = -8;
    protected static final int DT_MEMBERTYPES = -9;
    protected static final int DT_MINOCCURS1 = -10;
    protected static final int DT_NAMESPACE = -11;
    protected static final int DT_NCNAME = 5;
    protected static final int DT_NONNEGINT = -16;
    protected static final int DT_POSINT = -17;
    protected static final int DT_PROCESSCONTENTS = -12;
    protected static final int DT_QNAME = 2;
    protected static final int DT_STRING = 3;
    protected static final int DT_TOKEN = 4;
    protected static final int DT_USE = -13;
    protected static final int DT_WHITESPACE = -14;
    protected static final int DT_XPATH = 6;
    protected static final int DT_XPATH1 = 7;
    private static final String ELEMENT_N = "element_n";
    private static final String ELEMENT_R = "element_r";
    static final int INC_POOL_SIZE = 10;
    static final int INIT_POOL_SIZE = 10;
    private static final XInt INT_ANY_ANY = null;
    private static final XInt INT_ANY_LAX = null;
    private static final XInt INT_ANY_LIST = null;
    private static final XInt INT_ANY_NOT = null;
    private static final XInt INT_ANY_SKIP = null;
    private static final XInt INT_ANY_STRICT = null;
    private static final XInt INT_EMPTY_SET = null;
    private static final XInt INT_QUALIFIED = null;
    private static final XInt INT_UNBOUNDED = null;
    private static final XInt INT_UNQUALIFIED = null;
    private static final XInt INT_USE_OPTIONAL = null;
    private static final XInt INT_USE_PROHIBITED = null;
    private static final XInt INT_USE_REQUIRED = null;
    private static final XInt INT_WS_COLLAPSE = null;
    private static final XInt INT_WS_PRESERVE = null;
    private static final XInt INT_WS_REPLACE = null;
    private static final Hashtable fEleAttrsMapG = null;
    private static final Hashtable fEleAttrsMapL = null;
    private static final XSSimpleType[] fExtraDVs = null;
    private static boolean[] fSeenTemp;
    private static Object[] fTempArray;
    private static final XIntPool fXIntPool = null;
    Object[][] fArrayPool;
    protected Vector fNamespaceList;
    protected Hashtable fNonSchemaAttrs;
    int fPoolPos;
    protected XSDHandler fSchemaHandler;
    protected boolean[] fSeen;
    protected SymbolTable fSymbolTable;

    public XSAttributeChecker(XSDHandler xSDHandler) {
    }

    public static String normalize(String str, short s) {
    }

    private Object validate(Object[] objArr, String str, String str2, int i, XSDocumentInfo xSDocumentInfo) throws InvalidDatatypeValueException {
    }

    public Object[] checkAttributes(Element element, boolean z, XSDocumentInfo xSDocumentInfo) {
    }

    public void checkNonSchemaAttributes(XSGrammarBucket xSGrammarBucket) {
    }

    protected Object[] getAvailableArray() {
    }

    void reportSchemaError(String str, Object[] objArr, Element element) {
    }

    public void reset(SymbolTable symbolTable) {
    }

    public void resolveNamespace(Element element, Attr[] attrArr, SchemaNamespaceSupport schemaNamespaceSupport) {
    }

    public void returnAttrArray(Object[] objArr, XSDocumentInfo xSDocumentInfo) {
    }

    public Object[] checkAttributes(Element element, boolean z, XSDocumentInfo xSDocumentInfo, boolean z2) {
    }
}
