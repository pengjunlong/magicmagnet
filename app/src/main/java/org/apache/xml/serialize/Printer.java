package org.apache.xml.serialize;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Printer {
    private static final int BufferSize = 4096;
    private final char[] _buffer;
    protected Writer _docWriter;
    protected StringWriter _dtdWriter;
    protected IOException _exception;
    protected final OutputFormat _format;
    private int _pos;
    protected Writer _writer;

    public Printer(Writer writer, OutputFormat outputFormat) {
    }

    public void breakLine() throws IOException {
    }

    public void enterDTD() throws IOException {
    }

    public void flush() throws IOException {
    }

    public void flushLine(boolean z) throws IOException {
    }

    public IOException getException() {
    }

    public int getNextIndent() {
    }

    public void indent() {
    }

    public String leaveDTD() throws IOException {
    }

    public void printSpace() throws IOException {
    }

    public void printText(String str) throws IOException {
    }

    public void setNextIndent(int i) {
    }

    public void setThisIndent(int i) {
    }

    public void unindent() {
    }

    public void breakLine(boolean z) throws IOException {
    }

    public void printText(StringBuffer stringBuffer) throws IOException {
    }

    public void printText(char[] cArr, int i, int i2) throws IOException {
    }

    public void printText(char c) throws IOException {
    }
}
