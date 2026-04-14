package org.apache.xerces.impl.xs;

import java.util.Hashtable;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xs.XSTypeDefinition;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SubstitutionGroupHandler {
    private static final XSElementDecl[] EMPTY_GROUP = null;
    private static final OneSubGroup[] EMPTY_VECTOR = null;
    Hashtable fSubGroups;
    Hashtable fSubGroupsB;
    private final XSElementDeclHelper fXSElementDeclHelper;

    private static final class OneSubGroup {
        short bMethod;
        short dMethod;
        XSElementDecl sub;

        OneSubGroup() {
        }

        OneSubGroup(XSElementDecl xSElementDecl, short s, short s2) {
        }
    }

    public SubstitutionGroupHandler(XSElementDeclHelper xSElementDeclHelper) {
    }

    private boolean getDBMethods(XSTypeDefinition xSTypeDefinition, XSTypeDefinition xSTypeDefinition2, OneSubGroup oneSubGroup) {
    }

    private OneSubGroup[] getSubGroupB(XSElementDecl xSElementDecl, OneSubGroup oneSubGroup) {
    }

    private boolean typeDerivationOK(XSTypeDefinition xSTypeDefinition, XSTypeDefinition xSTypeDefinition2, short s) {
    }

    public void addSubstitutionGroup(XSElementDecl[] xSElementDeclArr) {
    }

    public XSElementDecl getMatchingElemDecl(QName qName, XSElementDecl xSElementDecl) {
    }

    public XSElementDecl[] getSubstitutionGroup(XSElementDecl xSElementDecl) {
    }

    public boolean inSubstitutionGroup(XSElementDecl xSElementDecl, XSElementDecl xSElementDecl2) {
    }

    public void reset() {
    }

    protected boolean substitutionGroupOK(XSElementDecl xSElementDecl, XSElementDecl xSElementDecl2, short s) {
    }
}
