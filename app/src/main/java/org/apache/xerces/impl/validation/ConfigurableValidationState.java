package org.apache.xerces.impl.validation;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ConfigurableValidationState extends ValidationState {
    private boolean fIdIdrefChecking;
    private boolean fUnparsedEntityChecking;

    @Override // org.apache.xerces.impl.validation.ValidationState, org.apache.xerces.impl.dv.ValidationContext
    public void addId(String str) {
    }

    @Override // org.apache.xerces.impl.validation.ValidationState, org.apache.xerces.impl.dv.ValidationContext
    public void addIdRef(String str) {
    }

    @Override // org.apache.xerces.impl.validation.ValidationState
    public String checkIDRefID() {
    }

    @Override // org.apache.xerces.impl.validation.ValidationState, org.apache.xerces.impl.dv.ValidationContext
    public boolean isEntityDeclared(String str) {
    }

    @Override // org.apache.xerces.impl.validation.ValidationState, org.apache.xerces.impl.dv.ValidationContext
    public boolean isEntityUnparsed(String str) {
    }

    @Override // org.apache.xerces.impl.validation.ValidationState, org.apache.xerces.impl.dv.ValidationContext
    public boolean isIdDeclared(String str) {
    }

    public void setIdIdrefChecking(boolean z) {
    }

    public void setUnparsedEntityChecking(boolean z) {
    }
}
