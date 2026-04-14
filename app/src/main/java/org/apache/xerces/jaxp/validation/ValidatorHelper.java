package org.apache.xerces.jaxp.validation;

import java.io.IOException;
import org.javax.xml.transform.Result;
import org.javax.xml.transform.Source;
import org.xml.sax.SAXException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
interface ValidatorHelper {
    void validate(Source source, Result result) throws SAXException, IOException;
}
