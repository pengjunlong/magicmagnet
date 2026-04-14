package org.apache.xerces.util;

import org.apache.xerces.xni.Augmentations;
import org.apache.xerces.xni.QName;
import org.apache.xerces.xni.XMLAttributes;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XMLAttributesImpl implements XMLAttributes {
    protected static final int SIZE_LIMIT = 20;
    protected static final int TABLE_SIZE = 101;
    protected Attribute[] fAttributeTableView;
    protected int[] fAttributeTableViewChainState;
    protected Attribute[] fAttributes;
    protected boolean fIsTableViewConsistent;
    protected int fLargeCount;
    protected int fLength;
    protected boolean fNamespaces;
    protected int fTableViewBuckets;

    static class Attribute {
        public Augmentations augs;
        public final QName name;
        public Attribute next;
        public String nonNormalizedValue;
        public boolean specified;
        public String type;
        public String value;

        Attribute() {
        }
    }

    public XMLAttributesImpl() {
    }

    private String getReportableType(String str) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public int addAttribute(QName qName, String str, String str2) {
    }

    public void addAttributeNS(QName qName, String str, String str2) {
    }

    public QName checkDuplicatesNS() {
    }

    protected void cleanTableView() {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public Augmentations getAugmentations(String str, String str2) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public int getIndex(String str) {
    }

    public int getIndexFast(String str) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public int getLength() {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getLocalName(int i) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public void getName(int i, QName qName) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getNonNormalizedValue(int i) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getPrefix(int i) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getQName(int i) {
    }

    protected int getTableViewBucket(String str) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getType(int i) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getURI(int i) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getValue(int i) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public boolean isSpecified(int i) {
    }

    protected void prepareAndPopulateTableView() {
    }

    protected void prepareTableView() {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public void removeAllAttributes() {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public void removeAttributeAt(int i) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public void setAugmentations(int i, Augmentations augmentations) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public void setName(int i, QName qName) {
    }

    public void setNamespaces(boolean z) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public void setNonNormalizedValue(int i, String str) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public void setSpecified(int i, boolean z) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public void setType(int i, String str) {
    }

    public void setURI(int i, String str) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public void setValue(int i, String str) {
    }

    public XMLAttributesImpl(int i) {
    }

    public String getName(int i) {
    }

    protected int getTableViewBucket(String str, String str2) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public Augmentations getAugmentations(String str) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getType(String str) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getValue(String str) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public int getIndex(String str, String str2) {
    }

    public int getIndexFast(String str, String str2) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public Augmentations getAugmentations(int i) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getType(String str, String str2) {
    }

    @Override // org.apache.xerces.xni.XMLAttributes
    public String getValue(String str, String str2) {
    }
}
