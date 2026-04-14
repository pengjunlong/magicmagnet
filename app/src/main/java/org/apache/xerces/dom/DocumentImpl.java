package org.apache.xerces.dom;

import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.events.DocumentEvent;
import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;
import org.w3c.dom.ranges.DocumentRange;
import org.w3c.dom.ranges.Range;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;
import org.w3c.dom.traversal.TreeWalker;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DocumentImpl extends CoreDocumentImpl implements DocumentTraversal, DocumentEvent, DocumentRange {
    static final long serialVersionUID = 515687835542616694L;
    protected Hashtable eventListeners;
    protected transient ReferenceQueue iteratorReferenceQueue;
    protected transient List iterators;
    protected boolean mutationEvents;
    protected transient ReferenceQueue rangeReferenceQueue;
    protected transient List ranges;
    EnclosingAttr savedEnclosingAttr;

    class EnclosingAttr implements Serializable {
        private static final long serialVersionUID = 5208387723391647216L;
        AttrImpl node;
        String oldvalue;
        final /* synthetic */ DocumentImpl this$0;

        EnclosingAttr(DocumentImpl documentImpl) {
        }
    }

    class LEntry implements Serializable {
        private static final long serialVersionUID = -8426757059492421631L;
        EventListener listener;
        final /* synthetic */ DocumentImpl this$0;
        String type;
        boolean useCapture;

        LEntry(DocumentImpl documentImpl, String str, EventListener eventListener, boolean z) {
        }
    }

    public DocumentImpl() {
    }

    private void mutationEventsInsertedNode(NodeImpl nodeImpl, NodeImpl nodeImpl2, boolean z) {
    }

    private void mutationEventsModifiedCharacterData(NodeImpl nodeImpl, String str, String str2, boolean z) {
    }

    private void mutationEventsRemovedAttrNode(AttrImpl attrImpl, NodeImpl nodeImpl, String str) {
    }

    private void mutationEventsRemovingNode(NodeImpl nodeImpl, NodeImpl nodeImpl2, boolean z) {
    }

    private void notifyIteratorsRemovingNode(NodeImpl nodeImpl) {
    }

    private void notifyRangesDeletedText(CharacterDataImpl characterDataImpl, int i, int i2) {
    }

    private void notifyRangesInsertedNode(NodeImpl nodeImpl) {
    }

    private void notifyRangesInsertedText(CharacterDataImpl characterDataImpl, int i, int i2) {
    }

    private void notifyRangesRemovingNode(NodeImpl nodeImpl) {
    }

    private void notifyRangesReplacedText(CharacterDataImpl characterDataImpl) {
    }

    private void notifyRangesSplitData(Node node, Node node2, int i) {
    }

    private void removeStaleIteratorReferences() {
    }

    private void removeStaleRangeReferences() {
    }

    private void removeStaleReferences(ReferenceQueue referenceQueue, List list) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    protected void addEventListener(NodeImpl nodeImpl, String str, EventListener eventListener, boolean z) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl, org.apache.xerces.dom.ParentNode, org.apache.xerces.dom.ChildNode, org.apache.xerces.dom.NodeImpl, org.w3c.dom.Node
    public Node cloneNode(boolean z) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    protected void copyEventListeners(NodeImpl nodeImpl, NodeImpl nodeImpl2) {
    }

    public Event createEvent(String str) throws DOMException {
    }

    public NodeIterator createNodeIterator(Node node, short s, NodeFilter nodeFilter) {
    }

    public Range createRange() {
    }

    public TreeWalker createTreeWalker(Node node, short s, NodeFilter nodeFilter) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void deletedText(CharacterDataImpl characterDataImpl, int i, int i2) {
    }

    protected void dispatchAggregateEvents(NodeImpl nodeImpl, EnclosingAttr enclosingAttr) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    protected boolean dispatchEvent(NodeImpl nodeImpl, Event event) {
    }

    protected void dispatchEventToSubtree(Node node, Event event) {
    }

    protected void dispatchingEventToSubtree(Node node, Event event) {
    }

    protected Vector getEventListeners(NodeImpl nodeImpl) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl, org.w3c.dom.Document
    public DOMImplementation getImplementation() {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    boolean getMutationEvents() {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void insertedNode(NodeImpl nodeImpl, NodeImpl nodeImpl2, boolean z) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void insertedText(CharacterDataImpl characterDataImpl, int i, int i2) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void insertingNode(NodeImpl nodeImpl, boolean z) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void modifiedAttrValue(AttrImpl attrImpl, String str) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void modifiedCharacterData(NodeImpl nodeImpl, String str, String str2, boolean z) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void modifyingCharacterData(NodeImpl nodeImpl, boolean z) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    protected void removeEventListener(NodeImpl nodeImpl, String str, EventListener eventListener, boolean z) {
    }

    void removeNodeIterator(NodeIterator nodeIterator) {
    }

    void removeRange(Range range) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void removedAttrNode(AttrImpl attrImpl, NodeImpl nodeImpl, String str) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void removedNode(NodeImpl nodeImpl, boolean z) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void removingNode(NodeImpl nodeImpl, NodeImpl nodeImpl2, boolean z) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void renamedAttrNode(Attr attr, Attr attr2) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void renamedElement(Element element, Element element2) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void replacedCharacterData(NodeImpl nodeImpl, String str, String str2) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void replacedNode(NodeImpl nodeImpl) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void replacedText(CharacterDataImpl characterDataImpl) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void replacingData(NodeImpl nodeImpl) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void replacingNode(NodeImpl nodeImpl) {
    }

    protected void saveEnclosingAttr(NodeImpl nodeImpl) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void setAttrNode(AttrImpl attrImpl, AttrImpl attrImpl2) {
    }

    protected void setEventListeners(NodeImpl nodeImpl, Vector vector) {
    }

    @Override // org.apache.xerces.dom.CoreDocumentImpl
    void setMutationEvents(boolean z) {
    }

    void splitData(Node node, Node node2, int i) {
    }

    public NodeIterator createNodeIterator(Node node, int i, NodeFilter nodeFilter, boolean z) {
    }

    public TreeWalker createTreeWalker(Node node, int i, NodeFilter nodeFilter, boolean z) {
    }

    public DocumentImpl(boolean z) {
    }

    protected void dispatchAggregateEvents(NodeImpl nodeImpl, AttrImpl attrImpl, String str, short s) {
    }

    public DocumentImpl(DocumentType documentType) {
    }

    public DocumentImpl(DocumentType documentType, boolean z) {
    }
}
