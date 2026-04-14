package org.apache.xerces.util;

import java.util.ArrayList;
import java.util.HashMap;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ParserConfigurationSettings implements XMLComponentManager {
    protected static final String PARSER_SETTINGS = "http://apache.org/xml/features/internal/parser-settings";
    protected HashMap fFeatures;
    protected XMLComponentManager fParentSettings;
    protected HashMap fProperties;
    protected ArrayList fRecognizedFeatures;
    protected ArrayList fRecognizedProperties;

    public ParserConfigurationSettings() {
    }

    public void addRecognizedFeatures(String[] strArr) {
    }

    public void addRecognizedProperties(String[] strArr) {
    }

    protected void checkFeature(String str) throws XMLConfigurationException {
    }

    protected void checkProperty(String str) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponentManager, org.apache.xerces.xni.parser.XMLParserConfiguration
    public boolean getFeature(String str) throws XMLConfigurationException {
    }

    @Override // org.apache.xerces.xni.parser.XMLComponentManager, org.apache.xerces.xni.parser.XMLParserConfiguration
    public Object getProperty(String str) throws XMLConfigurationException {
    }

    public void setFeature(String str, boolean z) throws XMLConfigurationException {
    }

    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    public ParserConfigurationSettings(XMLComponentManager xMLComponentManager) {
    }
}
