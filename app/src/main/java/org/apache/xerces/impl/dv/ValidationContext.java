package org.apache.xerces.impl.dv;

import java.util.Locale;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface ValidationContext {
    void addId(String str);

    void addIdRef(String str);

    Locale getLocale();

    String getSymbol(String str);

    String getURI(String str);

    boolean isEntityDeclared(String str);

    boolean isEntityUnparsed(String str);

    boolean isIdDeclared(String str);

    boolean needExtraChecking();

    boolean needFacetChecking();

    boolean needToNormalize();

    boolean useNamespaces();
}
