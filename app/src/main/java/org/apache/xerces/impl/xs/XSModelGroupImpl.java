package org.apache.xerces.impl.xs;

import org.apache.xerces.xs.XSAnnotation;
import org.apache.xerces.xs.XSModelGroup;
import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObjectList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSModelGroupImpl implements XSModelGroup {
    public static final short MODELGROUP_ALL = 103;
    public static final short MODELGROUP_CHOICE = 101;
    public static final short MODELGROUP_SEQUENCE = 102;
    public XSObjectList fAnnotations;
    public short fCompositor;
    private String fDescription;
    public int fParticleCount;
    public XSParticleDecl[] fParticles;

    private int maxEffectiveTotalRangeAllSeq() {
    }

    private int maxEffectiveTotalRangeChoice() {
    }

    private int minEffectiveTotalRangeAllSeq() {
    }

    private int minEffectiveTotalRangeChoice() {
    }

    @Override // org.apache.xerces.xs.XSModelGroup
    public XSAnnotation getAnnotation() {
    }

    @Override // org.apache.xerces.xs.XSModelGroup
    public XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSModelGroup
    public short getCompositor() {
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

    @Override // org.apache.xerces.xs.XSModelGroup
    public XSObjectList getParticles() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public short getType() {
    }

    public boolean isEmpty() {
    }

    public int maxEffectiveTotalRange() {
    }

    public int minEffectiveTotalRange() {
    }

    public void reset() {
    }

    public String toString() {
    }
}
