package org.apache.xerces.impl.xs;

import org.apache.xerces.xs.XSNamespaceItem;
import org.apache.xerces.xs.XSObjectList;
import org.apache.xerces.xs.XSParticle;
import org.apache.xerces.xs.XSTerm;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XSParticleDecl implements XSParticle {
    public static final short PARTICLE_ELEMENT = 1;
    public static final short PARTICLE_EMPTY = 0;
    public static final short PARTICLE_MODELGROUP = 3;
    public static final short PARTICLE_ONE_OR_MORE = 6;
    public static final short PARTICLE_WILDCARD = 2;
    public static final short PARTICLE_ZERO_OR_MORE = 4;
    public static final short PARTICLE_ZERO_OR_ONE = 5;
    public XSObjectList fAnnotations;
    private String fDescription;
    public int fMaxOccurs;
    public int fMinOccurs;
    public short fType;
    public XSTerm fValue;

    void appendParticle(StringBuffer stringBuffer) {
    }

    public boolean emptiable() {
    }

    @Override // org.apache.xerces.xs.XSParticle
    public XSObjectList getAnnotations() {
    }

    @Override // org.apache.xerces.xs.XSParticle
    public int getMaxOccurs() {
    }

    @Override // org.apache.xerces.xs.XSParticle
    public boolean getMaxOccursUnbounded() {
    }

    @Override // org.apache.xerces.xs.XSParticle
    public int getMinOccurs() {
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

    @Override // org.apache.xerces.xs.XSParticle
    public XSTerm getTerm() {
    }

    @Override // org.apache.xerces.xs.XSObject
    public short getType() {
    }

    public boolean isEmpty() {
    }

    public XSParticleDecl makeClone() {
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
