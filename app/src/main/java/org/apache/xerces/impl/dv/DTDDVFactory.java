package org.apache.xerces.impl.dv;

import java.util.Hashtable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class DTDDVFactory {
    private static final String DEFAULT_FACTORY_CLASS = "org.apache.xerces.impl.dv.dtd.DTDDVFactoryImpl";

    protected DTDDVFactory() {
    }

    public static final DTDDVFactory getInstance() throws DVFactoryException {
    }

    public abstract DatatypeValidator getBuiltInDV(String str);

    public abstract Hashtable getBuiltInTypes();

    public static final DTDDVFactory getInstance(String str) throws DVFactoryException {
    }
}
