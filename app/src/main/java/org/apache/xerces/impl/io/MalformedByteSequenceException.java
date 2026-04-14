package org.apache.xerces.impl.io;

import java.io.CharConversionException;
import java.util.Locale;
import org.apache.xerces.util.MessageFormatter;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class MalformedByteSequenceException extends CharConversionException {
    static final long serialVersionUID = 8436382245048328739L;
    private Object[] fArguments;
    private String fDomain;
    private MessageFormatter fFormatter;
    private String fKey;
    private Locale fLocale;
    private String fMessage;

    public MalformedByteSequenceException(MessageFormatter messageFormatter, Locale locale, String str, String str2, Object[] objArr) {
    }

    public Object[] getArguments() {
    }

    public String getDomain() {
    }

    public String getKey() {
    }

    @Override // java.lang.Throwable
    public synchronized String getMessage() {
    }
}
