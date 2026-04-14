package org.cybergarage.upnp.std.av.server.object;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SearchCriteria {
    public static final String AND = "and";
    public static final String CLASS = "upnp:class";
    public static final String CONTAINS = "contains";
    public static final String CREATOR = "dc:creator";
    public static final String DATE = "dc:date";
    public static final String DERIVEDFROM = "derivedfrom";
    public static final String DOESNOTCONTAIN = "doesNotContain";
    public static final String EQ = "=";
    public static final String EXISTS = "exists";
    public static final String FALSE = "false";
    public static final String GE = ">=";
    public static final String GT = ">";
    public static final String ID = "@id";
    public static final String LE = "<=";
    public static final String LT = "<";
    public static final String NEQ = "!=";
    public static final String OR = "or";
    public static final String PARENT_ID = "@parentID";
    public static final String TITLE = "dc:title";
    public static final String TRUE = "true";
    public static final String WCHARS = " \t\n\f\r";
    private String logic;
    private String operation;
    private String property;
    private boolean result;
    private String value;

    public SearchCriteria() {
    }

    public String getLogic() {
    }

    public String getOperation() {
    }

    public String getProperty() {
    }

    public boolean getResult() {
    }

    public String getValue() {
    }

    public boolean isContains() {
    }

    public boolean isDerivedFrom() {
    }

    public boolean isDoesNotContain() {
    }

    public boolean isEQ() {
    }

    public boolean isExists() {
    }

    boolean isFalseValue() {
    }

    public boolean isGE() {
    }

    public boolean isGT() {
    }

    public boolean isLE() {
    }

    public boolean isLT() {
    }

    public boolean isLogicalAND() {
    }

    public boolean isLogicalOR() {
    }

    public boolean isNEQ() {
    }

    boolean isTrueValue() {
    }

    public void setLogic(String str) {
    }

    public void setOperation(String str) {
    }

    public void setProperty(String str) {
    }

    public void setResult(boolean z) {
    }

    public void setValue(String str) {
    }

    public SearchCriteria(SearchCriteria searchCriteria) {
    }
}
