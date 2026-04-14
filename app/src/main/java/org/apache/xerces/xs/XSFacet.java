package org.apache.xerces.xs;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSFacet extends XSObject {
    Object getActualFacetValue();

    XSAnnotation getAnnotation();

    XSObjectList getAnnotations();

    short getFacetKind();

    boolean getFixed();

    int getIntFacetValue();

    String getLexicalFacetValue();
}
