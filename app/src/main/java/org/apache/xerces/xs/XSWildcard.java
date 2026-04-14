package org.apache.xerces.xs;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSWildcard extends XSTerm {
    public static final short NSCONSTRAINT_ANY = 1;
    public static final short NSCONSTRAINT_LIST = 3;
    public static final short NSCONSTRAINT_NOT = 2;
    public static final short PC_LAX = 3;
    public static final short PC_SKIP = 2;
    public static final short PC_STRICT = 1;

    XSAnnotation getAnnotation();

    XSObjectList getAnnotations();

    short getConstraintType();

    StringList getNsConstraintList();

    short getProcessContents();
}
