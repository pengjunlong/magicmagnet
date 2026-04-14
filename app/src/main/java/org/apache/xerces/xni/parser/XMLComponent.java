package org.apache.xerces.xni.parser;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XMLComponent {
    Boolean getFeatureDefault(String str);

    Object getPropertyDefault(String str);

    String[] getRecognizedFeatures();

    String[] getRecognizedProperties();

    void reset(XMLComponentManager xMLComponentManager) throws XMLConfigurationException;

    void setFeature(String str, boolean z) throws XMLConfigurationException;

    void setProperty(String str, Object obj) throws XMLConfigurationException;
}
