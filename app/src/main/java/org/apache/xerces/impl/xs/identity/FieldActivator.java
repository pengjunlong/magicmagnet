package org.apache.xerces.impl.xs.identity;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface FieldActivator {
    XPathMatcher activateField(Field field, int i);

    void endValueScopeFor(IdentityConstraint identityConstraint, int i);

    void startValueScopeFor(IdentityConstraint identityConstraint, int i);
}
