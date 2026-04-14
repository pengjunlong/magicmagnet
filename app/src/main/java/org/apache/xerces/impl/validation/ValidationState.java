package org.apache.xerces.impl.validation;

import java.util.HashMap;
import java.util.Locale;
import org.apache.xerces.impl.dv.ValidationContext;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.NamespaceContext;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ValidationState implements ValidationContext {
    private static final Object fNullValue = null;
    private EntityState fEntityState;
    private boolean fExtraChecking;
    private boolean fFacetChecking;
    private final HashMap fIdRefTable;
    private final HashMap fIdTable;
    private Locale fLocale;
    private NamespaceContext fNamespaceContext;
    private boolean fNamespaces;
    private boolean fNormalize;
    private SymbolTable fSymbolTable;

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public void addId(String str) {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public void addIdRef(String str) {
    }

    public String checkIDRefID() {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public Locale getLocale() {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public String getSymbol(String str) {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public String getURI(String str) {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public boolean isEntityDeclared(String str) {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public boolean isEntityUnparsed(String str) {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public boolean isIdDeclared(String str) {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public boolean needExtraChecking() {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public boolean needFacetChecking() {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public boolean needToNormalize() {
    }

    public void reset() {
    }

    public void resetIDTables() {
    }

    public void setEntityState(EntityState entityState) {
    }

    public void setExtraChecking(boolean z) {
    }

    public void setFacetChecking(boolean z) {
    }

    public void setLocale(Locale locale) {
    }

    public void setNamespaceSupport(NamespaceContext namespaceContext) {
    }

    public void setNormalizationRequired(boolean z) {
    }

    public void setSymbolTable(SymbolTable symbolTable) {
    }

    public void setUsingNamespaces(boolean z) {
    }

    @Override // org.apache.xerces.impl.dv.ValidationContext
    public boolean useNamespaces() {
    }
}
