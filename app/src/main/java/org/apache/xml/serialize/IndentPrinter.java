package org.apache.xml.serialize;

import java.io.Writer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class IndentPrinter extends Printer {
    private StringBuffer _line;
    private int _nextIndent;
    private int _spaces;
    private StringBuffer _text;
    private int _thisIndent;

    public IndentPrinter(Writer writer, OutputFormat outputFormat) {
    }

    @Override // org.apache.xml.serialize.Printer
    public void breakLine() {
    }

    @Override // org.apache.xml.serialize.Printer
    public void enterDTD() {
    }

    @Override // org.apache.xml.serialize.Printer
    public void flush() {
    }

    @Override // org.apache.xml.serialize.Printer
    public void flushLine(boolean z) {
    }

    @Override // org.apache.xml.serialize.Printer
    public int getNextIndent() {
    }

    @Override // org.apache.xml.serialize.Printer
    public void indent() {
    }

    @Override // org.apache.xml.serialize.Printer
    public String leaveDTD() {
    }

    @Override // org.apache.xml.serialize.Printer
    public void printSpace() {
    }

    @Override // org.apache.xml.serialize.Printer
    public void printText(String str) {
    }

    @Override // org.apache.xml.serialize.Printer
    public void setNextIndent(int i) {
    }

    @Override // org.apache.xml.serialize.Printer
    public void setThisIndent(int i) {
    }

    @Override // org.apache.xml.serialize.Printer
    public void unindent() {
    }

    @Override // org.apache.xml.serialize.Printer
    public void breakLine(boolean z) {
    }

    @Override // org.apache.xml.serialize.Printer
    public void printText(StringBuffer stringBuffer) {
    }

    @Override // org.apache.xml.serialize.Printer
    public void printText(char c) {
    }

    @Override // org.apache.xml.serialize.Printer
    public void printText(char[] cArr, int i, int i2) {
    }
}
