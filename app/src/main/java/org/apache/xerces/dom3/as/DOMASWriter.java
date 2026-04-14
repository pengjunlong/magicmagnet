package org.apache.xerces.dom3.as;

import java.io.OutputStream;
import org.w3c.dom.ls.LSSerializer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface DOMASWriter extends LSSerializer {
    void writeASModel(OutputStream outputStream, ASModel aSModel) throws Exception;
}
