package org.apache.xerces.impl.dtd.models;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class CMNode {
    private boolean fCompactedForUPA;
    private CMStateSet fFirstPos;
    private CMStateSet fFollowPos;
    private CMStateSet fLastPos;
    private int fMaxStates;
    private final int fType;

    public CMNode(int i) {
    }

    protected abstract void calcFirstPos(CMStateSet cMStateSet);

    protected abstract void calcLastPos(CMStateSet cMStateSet);

    public final CMStateSet firstPos() {
    }

    public boolean isCompactedForUPA() {
    }

    public abstract boolean isNullable();

    public final CMStateSet lastPos() {
    }

    final void setFollowPos(CMStateSet cMStateSet) {
    }

    public void setIsCompactUPAModel(boolean z) {
    }

    public final void setMaxStates(int i) {
    }

    public final int type() {
    }
}
