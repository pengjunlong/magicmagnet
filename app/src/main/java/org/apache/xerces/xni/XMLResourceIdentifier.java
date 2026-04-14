package org.apache.xerces.xni;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XMLResourceIdentifier {
    String getBaseSystemId();

    String getExpandedSystemId();

    String getLiteralSystemId();

    String getNamespace();

    String getPublicId();

    void setBaseSystemId(String str);

    void setExpandedSystemId(String str);

    void setLiteralSystemId(String str);

    void setNamespace(String str);

    void setPublicId(String str);
}
