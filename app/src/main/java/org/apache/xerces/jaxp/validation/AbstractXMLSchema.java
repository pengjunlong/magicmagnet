package org.apache.xerces.jaxp.validation;

import java.util.HashMap;
import org.javax.xml.validation.Schema;
import org.javax.xml.validation.Validator;
import org.javax.xml.validation.ValidatorHandler;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
abstract class AbstractXMLSchema extends Schema implements XSGrammarPoolContainer {
    private final HashMap fFeatures;

    @Override // org.apache.xerces.jaxp.validation.XSGrammarPoolContainer
    public final Boolean getFeature(String str) {
    }

    public final Validator newValidator() {
    }

    public final ValidatorHandler newValidatorHandler() {
    }

    final void setFeature(String str, boolean z) {
    }
}
