package org.apache.xerces.xni.parser;

import java.io.IOException;
import org.apache.xerces.xni.XNIException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XMLDTDScanner extends XMLDTDSource, XMLDTDContentModelSource {
    boolean scanDTDExternalSubset(boolean z) throws IOException, XNIException;

    boolean scanDTDInternalSubset(boolean z, boolean z2, boolean z3) throws IOException, XNIException;

    void setInputSource(XMLInputSource xMLInputSource) throws IOException;
}
