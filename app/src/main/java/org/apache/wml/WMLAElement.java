package org.apache.wml;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface WMLAElement extends WMLElement {
    String getHref();

    @Override // org.apache.wml.WMLElement
    String getId();

    String getTitle();

    String getXmlLang();

    void setHref(String str);

    @Override // org.apache.wml.WMLElement
    void setId(String str);

    void setTitle(String str);

    void setXmlLang(String str);
}
