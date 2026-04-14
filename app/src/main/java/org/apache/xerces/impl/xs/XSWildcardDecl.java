package org.apache.xerces.impl.xs;

import org.apache.xerces.xs.StringList;
import org.apache.xerces.xs.XSAnnotation;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSWildcard;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSWildcardDecl implements XSWildcard {
    public static final String ABSENT = null;
    public XSObjectList fAnnotations;
    private String fDescription;
    public String[] fNamespaceList;
    public short fProcessContents;
    public short fType;

    private boolean areSame(XSWildcardDecl xSWildcardDecl) {
    }

    public boolean allowNamespace(String str) {
    }

    boolean elementInSet(String str, String[] strArr) {
    }

    @Override // org.apache.xerces.xs.XSWildcard
    public XSAnnotation getAnnotation() {
    }

    @Override // org.apache.xerces.xs.XSWildcard
    public XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSWildcard
    public short getConstraintType() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public String getName() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public String getNamespace() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public XSNamespaceItem getNamespaceItem() {
    }

    @Override // org.apache.xerces.xs.XSWildcard
    public StringList getNsConstraintList() {
    }

    @Override // org.apache.xerces.xs.XSWildcard
    public short getProcessContents() {
    }

    public String getProcessContentsAsString() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public short getType() {
    }

    String[] intersect2sets(String[] strArr, String[] strArr2) {
    }

    public boolean isSubsetOf(XSWildcardDecl xSWildcardDecl) {
    }

    public XSWildcardDecl performIntersectionWith(XSWildcardDecl xSWildcardDecl, short s) {
    }

    public XSWildcardDecl performUnionWith(XSWildcardDecl xSWildcardDecl, short s) {
    }

    boolean subset2sets(String[] strArr, String[] strArr2) {
    }

    public String toString() {
    }

    String[] union2sets(String[] strArr, String[] strArr2) {
    }

    public boolean weakerProcessContents(XSWildcardDecl xSWildcardDecl) {
    }
}
