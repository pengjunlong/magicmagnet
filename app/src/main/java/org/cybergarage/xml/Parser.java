package org.cybergarage.xml;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class Parser {
    public abstract Node parse(InputStream inputStream) throws ParserException;

    public Node parse(URL url) throws ParserException {
    }

    public Node parse(File file) throws ParserException {
    }

    public Node parse(String str) throws ParserException {
    }
}
