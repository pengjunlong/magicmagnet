package org.apache.xerces.impl.xs.models;

import org.apache.xerces.impl.XMLErrorReporter;
import org.apache.xerces.impl.dtd.models.CMNode;
import org.apache.xerces.util.SecurityManager;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLConfigurationException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class CMNodeFactory {
    private static final boolean DEBUG = false;
    private static final String ERROR_REPORTER = "http://apache.org/xml/properties/internal/error-reporter";
    private static final int MULTIPLICITY = 1;
    private static final String SECURITY_MANAGER = "http://apache.org/xml/properties/security-manager";
    private XMLErrorReporter fErrorReporter;
    private SecurityManager fSecurityManager;
    private int maxNodeLimit;
    private int nodeCount;

    public CMNode getCMBinOpNode(int i, CMNode cMNode, CMNode cMNode2) {
    }

    public CMNode getCMLeafNode(int i, Object obj, int i2, int i3) {
    }

    public CMNode getCMRepeatingLeafNode(int i, Object obj, int i2, int i3, int i4, int i5) {
    }

    public CMNode getCMUniOpNode(int i, CMNode cMNode) {
    }

    public void nodeCountCheck() {
    }

    public void reset(XMLComponentManager xMLComponentManager) {
    }

    public void resetNodeCount() {
    }

    public void setProperty(String str, Object obj) throws XMLConfigurationException {
    }

    public void reset() {
    }
}
