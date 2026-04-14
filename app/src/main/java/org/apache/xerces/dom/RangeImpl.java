package org.apache.xerces.dom;

import org.w3c.dom.CharacterData;
import org.w3c.dom.DOMException;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Node;
import org.w3c.dom.ranges.Range;
import org.w3c.dom.ranges.RangeException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class RangeImpl implements Range {
    static final int CLONE_CONTENTS = 2;
    static final int DELETE_CONTENTS = 3;
    static final int EXTRACT_CONTENTS = 1;
    private Node fDeleteNode;
    private boolean fDetach;
    private DocumentImpl fDocument;
    private Node fEndContainer;
    private int fEndOffset;
    private Node fInsertNode;
    private boolean fInsertedFromRange;
    private Node fRemoveChild;
    private Node fSplitNode;
    private Node fStartContainer;
    private int fStartOffset;

    public RangeImpl(DocumentImpl documentImpl) {
    }

    private Node getRootContainer(Node node) {
    }

    private Node getSelectedNode(Node node, int i) {
    }

    private boolean hasLegalRootContainer(Node node) {
    }

    private boolean isLegalContainedNode(Node node) {
    }

    private boolean isLegalContainer(Node node) {
    }

    private Node traverseCharacterDataNode(Node node, boolean z, int i) {
    }

    private DocumentFragment traverseCommonAncestors(Node node, Node node2, int i) {
    }

    private DocumentFragment traverseCommonEndContainer(Node node, int i) {
    }

    private DocumentFragment traverseCommonStartContainer(Node node, int i) {
    }

    private DocumentFragment traverseContents(int i) throws DOMException {
    }

    private Node traverseFullySelected(Node node, int i) {
    }

    private Node traverseLeftBoundary(Node node, int i) {
    }

    private Node traverseNode(Node node, boolean z, boolean z2, int i) {
    }

    private Node traversePartiallySelected(Node node, int i) {
    }

    private Node traverseRightBoundary(Node node, int i) {
    }

    private DocumentFragment traverseSameContainer(int i) {
    }

    void checkIndex(Node node, int i) throws DOMException {
    }

    public DocumentFragment cloneContents() throws DOMException {
    }

    public Range cloneRange() {
    }

    public void collapse(boolean z) {
    }

    public short compareBoundaryPoints(short s, Range range) throws DOMException {
    }

    public void deleteContents() throws DOMException {
    }

    void deleteData(CharacterData characterData, int i, int i2) {
    }

    public void detach() {
    }

    public DocumentFragment extractContents() throws DOMException {
    }

    public boolean getCollapsed() {
    }

    public Node getCommonAncestorContainer() {
    }

    public Node getEndContainer() {
    }

    public int getEndOffset() {
    }

    public Node getStartContainer() {
    }

    public int getStartOffset() {
    }

    int indexOf(Node node, Node node2) {
    }

    void insertData(CharacterData characterData, int i, String str) {
    }

    public void insertNode(Node node) throws DOMException, RangeException {
    }

    public void insertedNodeFromDOM(Node node) {
    }

    boolean isAncestorOf(Node node, Node node2) {
    }

    Node nextNode(Node node, boolean z) {
    }

    void receiveDeletedText(CharacterDataImpl characterDataImpl, int i, int i2) {
    }

    void receiveInsertedText(CharacterDataImpl characterDataImpl, int i, int i2) {
    }

    void receiveReplacedText(CharacterDataImpl characterDataImpl) {
    }

    void receiveSplitData(Node node, Node node2, int i) {
    }

    Node removeChild(Node node, Node node2) {
    }

    void removeNode(Node node) {
    }

    public void selectNode(Node node) throws RangeException {
    }

    public void selectNodeContents(Node node) throws RangeException {
    }

    public void setEnd(Node node, int i) throws RangeException, DOMException {
    }

    public void setEndAfter(Node node) throws RangeException {
    }

    public void setEndBefore(Node node) throws RangeException {
    }

    public void setStart(Node node, int i) throws RangeException, DOMException {
    }

    public void setStartAfter(Node node) throws RangeException {
    }

    public void setStartBefore(Node node) throws RangeException {
    }

    void signalSplitData(Node node, Node node2, int i) {
    }

    public void surroundContents(Node node) throws DOMException, RangeException {
    }

    public String toString() {
    }
}
