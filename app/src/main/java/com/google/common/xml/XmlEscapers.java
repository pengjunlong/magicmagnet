package com.google.common.xml;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;

@ElementTypesAreNonnullByDefault
@Beta
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class XmlEscapers {
    private static final char MAX_ASCII_CONTROL_CHAR = 31;
    private static final char MIN_ASCII_CONTROL_CHAR = 0;
    private static final Escaper XML_ATTRIBUTE_ESCAPER = null;
    private static final Escaper XML_CONTENT_ESCAPER = null;
    private static final Escaper XML_ESCAPER = null;

    private XmlEscapers() {
    }

    public static Escaper xmlAttributeEscaper() {
    }

    public static Escaper xmlContentEscaper() {
    }
}
