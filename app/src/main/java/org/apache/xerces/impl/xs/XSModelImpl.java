package org.apache.xerces.impl.xs;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.ListIterator;
import org.apache.xerces.impl.xs.util.XSObjectListImpl;
import org.apache.xerces.util.SymbolHash;
import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSAttributeDeclaration;
import org.apache.xerces.xs.XSAttributeGroupDefinition;
import org.apache.xerces.xs.XSElementDeclaration;
import org.apache.xerces.xs.XSIDCDefinition;
import org.apache.xerces.xs.XSModel;
import org.apache.xerces.xs.XSModelGroupDefinition;
import org.apache.xerces.xs.XSNamedMap;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSNamespaceItemList;
import org.apache.xerces.xs.XSNotationDeclaration;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSTypeDefinition;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class XSModelImpl extends AbstractList implements XSModel, XSNamespaceItemList {
    private static final boolean[] GLOBAL_COMP = null;
    private static final short MAX_COMP_IDX = 16;
    private XSObjectList fAnnotations;
    private final XSNamedMap[] fGlobalComponents;
    private final int fGrammarCount;
    private final SchemaGrammar[] fGrammarList;
    private final SymbolHash fGrammarMap;
    private final boolean fHasIDC;
    private final XSNamedMap[][] fNSComponents;
    private final String[] fNamespaces;
    private final StringList fNamespacesList;
    private final SymbolHash fSubGroupMap;

    private final class XSNamespaceItemListIterator implements ListIterator {
        private int index;
        final /* synthetic */ XSModelImpl this$0;

        public XSNamespaceItemListIterator(XSModelImpl xSModelImpl, int i) {
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
        }

        @Override // java.util.ListIterator
        public Object previous() {
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
        }
    }

    public XSModelImpl(SchemaGrammar[] schemaGrammarArr) {
    }

    static /* synthetic */ int access$000(XSModelImpl xSModelImpl) {
    }

    static /* synthetic */ SchemaGrammar[] access$100(XSModelImpl xSModelImpl) {
    }

    private SymbolHash buildSubGroups() {
    }

    private SymbolHash buildSubGroups_Org() {
    }

    private XSObjectListImpl getGlobalElements() {
    }

    private ListIterator listIterator0(int i) {
    }

    private static final String null2EmptyString(String str) {
    }

    private void toArray0(Object[] objArr) {
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
    }

    @Override // org.apache.xerces.xs.XSModel
    public synchronized XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSModel
    public XSAttributeDeclaration getAttributeDeclaration(String str, String str2) {
    }

    @Override // org.apache.xerces.xs.XSModel
    public XSAttributeGroupDefinition getAttributeGroup(String str, String str2) {
    }

    @Override // org.apache.xerces.xs.XSModel
    public synchronized XSNamedMap getComponents(short s) {
    }

    @Override // org.apache.xerces.xs.XSModel
    public synchronized XSNamedMap getComponentsByNamespace(short s, String str) {
    }

    @Override // org.apache.xerces.xs.XSModel
    public XSElementDeclaration getElementDeclaration(String str, String str2) {
    }

    @Override // org.apache.xerces.xs.XSModel
    public XSIDCDefinition getIDCDefinition(String str, String str2) {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItemList
    public int getLength() {
    }

    @Override // org.apache.xerces.xs.XSModel
    public XSModelGroupDefinition getModelGroupDefinition(String str, String str2) {
    }

    @Override // org.apache.xerces.xs.XSModel
    public XSNamespaceItemList getNamespaceItems() {
    }

    @Override // org.apache.xerces.xs.XSModel
    public StringList getNamespaces() {
    }

    @Override // org.apache.xerces.xs.XSModel
    public XSNotationDeclaration getNotationDeclaration(String str, String str2) {
    }

    @Override // org.apache.xerces.xs.XSModel
    public XSObjectList getSubstitutionGroup(XSElementDeclaration xSElementDeclaration) {
    }

    @Override // org.apache.xerces.xs.XSModel
    public XSTypeDefinition getTypeDefinition(String str, String str2) {
    }

    public boolean hasIDConstraints() {
    }

    @Override // org.apache.xerces.xs.XSNamespaceItemList
    public XSNamespaceItem item(int i) {
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
    }

    public XSModelImpl(SchemaGrammar[] schemaGrammarArr, short s) {
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
    }

    public XSAttributeDeclaration getAttributeDeclaration(String str, String str2, String str3) {
    }

    public XSAttributeGroupDefinition getAttributeGroup(String str, String str2, String str3) {
    }

    public XSElementDeclaration getElementDeclaration(String str, String str2, String str3) {
    }

    public XSIDCDefinition getIDCDefinition(String str, String str2, String str3) {
    }

    public XSModelGroupDefinition getModelGroupDefinition(String str, String str2, String str3) {
    }

    public XSNotationDeclaration getNotationDeclaration(String str, String str2, String str3) {
    }

    public XSTypeDefinition getTypeDefinition(String str, String str2, String str3) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
    }
}
