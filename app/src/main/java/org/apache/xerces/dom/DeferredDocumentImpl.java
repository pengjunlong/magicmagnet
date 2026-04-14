package org.apache.xerces.dom;

import java.util.ArrayList;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DeferredDocumentImpl extends DocumentImpl implements DeferredNode {
    protected static final int CHUNK_MASK = 2047;
    protected static final int CHUNK_SHIFT = 11;
    protected static final int CHUNK_SIZE = 2048;
    private static final boolean DEBUG_IDS = false;
    private static final boolean DEBUG_PRINT_REF_COUNTS = false;
    private static final boolean DEBUG_PRINT_TABLES = false;
    protected static final int INITIAL_CHUNK_COUNT = 32;
    private static final int[] INIT_ARRAY = null;
    static final long serialVersionUID = 5186323580749626857L;
    private final transient StringBuffer fBufferStr;
    protected transient int fIdCount;
    protected transient int[] fIdElement;
    protected transient String[] fIdName;
    protected boolean fNamespacesEnabled;
    protected transient int fNodeCount;
    protected transient int[][] fNodeExtra;
    protected transient int[][] fNodeLastChild;
    protected transient Object[][] fNodeName;
    protected transient int[][] fNodeParent;
    protected transient int[][] fNodePrevSib;
    protected transient int[][] fNodeType;
    protected transient Object[][] fNodeURI;
    protected transient Object[][] fNodeValue;
    private final transient ArrayList fStrChunks;

    static final class IntVector {
        private int[] data;
        private int size;

        IntVector() {
        }

        private void ensureCapacity(int i) {
        }

        public void addElement(int i) {
        }

        public int elementAt(int i) {
        }

        public void removeAllElements() {
        }

        public int size() {
        }
    }

    static final class RefCount {
        int fCount;

        RefCount() {
        }
    }

    public DeferredDocumentImpl() {
    }

    protected static int binarySearch(int[] iArr, int i, int i2, int i3) {
    }

    private final int clearChunkIndex(int[][] iArr, int i, int i2) {
    }

    private final String clearChunkValue(Object[][] objArr, int i, int i2) {
    }

    private final void createChunk(int[][] iArr, int i) {
    }

    private final int getChunkIndex(int[][] iArr, int i, int i2) {
    }

    private final String getChunkValue(Object[][] objArr, int i, int i2) {
    }

    private static void print(int[] iArr, int i, int i2, int i3, int i4) {
    }

    private final void putIdentifier0(String str, Element element) {
    }

    private final int setChunkIndex(int[][] iArr, int i, int i2, int i3) {
    }

    private final String setChunkValue(Object[][] objArr, Object obj, int i, int i2) {
    }

    public void appendChild(int i, int i2) {
    }

    public int cloneNode(int i, boolean z) {
    }

    public int createDeferredAttribute(String str, String str2, boolean z) {
    }

    public int createDeferredCDATASection(String str) {
    }

    public int createDeferredComment(String str) {
    }

    public int createDeferredDocument() {
    }

    public int createDeferredDocumentType(String str, String str2, String str3) {
    }

    public int createDeferredElement(String str, String str2, Object obj) {
    }

    public int createDeferredElementDefinition(String str) {
    }

    public int createDeferredEntity(String str, String str2, String str3, String str4, String str5) {
    }

    public int createDeferredEntityReference(String str, String str2) {
    }

    public int createDeferredNotation(String str, String str2, String str3, String str4) {
    }

    public int createDeferredProcessingInstruction(String str, String str2) {
    }

    public int createDeferredTextNode(String str, boolean z) {
    }

    protected int createNode(short s) {
    }

    protected void ensureCapacity(int i) {
    }

    public String getAttribute(int i, String str) {
    }

    public String getDeferredEntityBaseURI(int i) {
    }

    @Override // org.apache.xerces.dom.DocumentImpl, org.apache.xerces.dom.CoreDocumentImpl, org.w3c.dom.Document
    public DOMImplementation getImplementation() {
    }

    public int getLastChild(int i) {
    }

    boolean getNamespacesEnabled() {
    }

    public int getNodeExtra(int i) {
    }

    @Override // org.apache.xerces.dom.DeferredNode
    public int getNodeIndex() {
    }

    public String getNodeName(int i) {
    }

    public DeferredNode getNodeObject(int i) {
    }

    public short getNodeType(int i) {
    }

    public String getNodeURI(int i) {
    }

    public String getNodeValue(int i) {
    }

    public String getNodeValueString(int i) {
    }

    public int getParentNode(int i) {
    }

    public int getPrevSibling(int i) {
    }

    public int getRealPrevSibling(int i) {
    }

    public Object getTypeInfo(int i) {
    }

    public int insertBefore(int i, int i2, int i3) {
    }

    public int lookupElementDefinition(String str) {
    }

    public void print() {
    }

    public void putIdentifier(String str, int i) {
    }

    public void setAsLastChild(int i, int i2) {
    }

    public int setAttributeNode(int i, int i2) {
    }

    public int setDeferredAttribute(int i, String str, String str2, String str3, boolean z, boolean z2, Object obj) {
    }

    public void setEntityInfo(int i, String str, String str2) {
    }

    public void setIdAttribute(int i) {
    }

    public void setIdAttributeNode(int i, int i2) {
    }

    public void setInputEncoding(int i, String str) {
    }

    public void setInternalSubset(int i, String str) {
    }

    void setNamespacesEnabled(boolean z) {
    }

    public void setTypeInfo(int i, Object obj) {
    }

    @Override // org.apache.xerces.dom.ParentNode
    protected void synchronizeChildren() {
    }

    @Override // org.apache.xerces.dom.NodeImpl
    protected void synchronizeData() {
    }

    public DeferredDocumentImpl(boolean z) {
    }

    public int createDeferredAttribute(String str, String str2, String str3, boolean z) {
    }

    public int getLastChild(int i, boolean z) {
    }

    public int getNodeExtra(int i, boolean z) {
    }

    public String getNodeName(int i, boolean z) {
    }

    public short getNodeType(int i, boolean z) {
    }

    public String getNodeURI(int i, boolean z) {
    }

    public String getNodeValue(int i, boolean z) {
    }

    public String getNodeValueString(int i, boolean z) {
    }

    public int getParentNode(int i, boolean z) {
    }

    public int getPrevSibling(int i, boolean z) {
    }

    public int getRealPrevSibling(int i, boolean z) {
    }

    public DeferredDocumentImpl(boolean z, boolean z2) {
    }

    private final void createChunk(Object[][] objArr, int i) {
    }

    private final String getNodeValue(int i, int i2) {
    }

    public int createDeferredElement(String str) {
    }

    public int createDeferredElement(String str, String str2) {
    }

    public int setDeferredAttribute(int i, String str, String str2, String str3, boolean z) {
    }

    protected final void synchronizeChildren(AttrImpl attrImpl, int i) {
    }

    protected final void synchronizeChildren(ParentNode parentNode, int i) {
    }
}
