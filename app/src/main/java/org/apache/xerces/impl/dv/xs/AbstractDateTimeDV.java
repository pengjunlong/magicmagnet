package org.apache.xerces.impl.dv.xs;

import java.math.BigDecimal;
import org.apache.xerces.xs.datatypes.XSDateTime;
import org.javax.xml.datatype.DatatypeFactory;
import org.javax.xml.datatype.Duration;
import org.javax.xml.datatype.XMLGregorianCalendar;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class AbstractDateTimeDV extends TypeValidator {
    protected static final int DAY = 1;
    private static final boolean DEBUG = false;
    protected static final int MONTH = 1;
    protected static final int YEAR = 2000;
    protected static final DatatypeFactory datatypeFactory = null;

    private void append3(StringBuffer stringBuffer, double d) {
    }

    private void cloneDate(DateTimeData dateTimeData, DateTimeData dateTimeData2) {
    }

    private boolean isLeapYear(int i) {
    }

    protected final void append(StringBuffer stringBuffer, int i, int i2) {
    }

    protected final void append2(StringBuffer stringBuffer, double d) {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public int compare(Object obj, Object obj2) {
    }

    protected short compareDates(DateTimeData dateTimeData, DateTimeData dateTimeData2, boolean z) {
    }

    protected short compareOrder(DateTimeData dateTimeData, DateTimeData dateTimeData2) {
    }

    protected String dateToString(DateTimeData dateTimeData) {
    }

    protected int fQuotient(int i, int i2) {
    }

    protected int findUTCSign(String str, int i, int i2) {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public short getAllowedFacets() {
    }

    protected int getDate(String str, int i, int i2, DateTimeData dateTimeData) throws RuntimeException {
    }

    protected Duration getDuration(DateTimeData dateTimeData) {
    }

    protected final BigDecimal getFractionalSecondsAsBigDecimal(DateTimeData dateTimeData) {
    }

    protected void getTime(String str, int i, int i2, DateTimeData dateTimeData) throws RuntimeException {
    }

    protected void getTimeZone(String str, DateTimeData dateTimeData, int i, int i2) throws RuntimeException {
    }

    protected XMLGregorianCalendar getXMLGregorianCalendar(DateTimeData dateTimeData) {
    }

    protected int getYearMonth(String str, int i, int i2, DateTimeData dateTimeData) throws RuntimeException {
    }

    protected int indexOf(String str, int i, int i2, char c) {
    }

    @Override // org.apache.xerces.impl.dv.xs.TypeValidator
    public boolean isIdentical(Object obj, Object obj2) {
    }

    protected final boolean isNextCharUTCSign(String str, int i, int i2) {
    }

    protected int maxDayInMonthFor(int i, int i2) {
    }

    protected int mod(int i, int i2, int i3) {
    }

    protected int modulo(int i, int i2, int i3) {
    }

    protected void normalize(DateTimeData dateTimeData) {
    }

    protected int parseInt(String str, int i, int i2) throws NumberFormatException {
    }

    protected int parseIntYear(String str, int i) {
    }

    protected double parseSecond(String str, int i, int i2) throws NumberFormatException {
    }

    protected void parseTimeZone(String str, int i, int i2, DateTimeData dateTimeData) throws RuntimeException {
    }

    protected void resetDateObj(DateTimeData dateTimeData) {
    }

    protected void saveUnnormalized(DateTimeData dateTimeData) {
    }

    protected void validateDateTime(DateTimeData dateTimeData) {
    }

    protected int fQuotient(int i, int i2, int i3) {
    }

    static final class DateTimeData implements XSDateTime {
        private String canonical;
        int day;
        int hour;
        int minute;
        int month;
        boolean normalized;
        private String originalValue;
        int position;
        double second;
        int timezoneHr;
        int timezoneMin;
        final AbstractDateTimeDV type;
        int unNormDay;
        int unNormHour;
        int unNormMinute;
        int unNormMonth;
        double unNormSecond;
        int unNormYear;
        int utc;
        int year;

        public DateTimeData(String str, AbstractDateTimeDV abstractDateTimeDV) {
        }

        public Object clone() {
        }

        public boolean equals(Object obj) {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public int getDays() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public Duration getDuration() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public int getHours() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public String getLexicalValue() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public int getMinutes() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public int getMonths() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public double getSeconds() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public int getTimeZoneHours() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public int getTimeZoneMinutes() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public XMLGregorianCalendar getXMLGregorianCalendar() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public int getYears() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public boolean hasTimeZone() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public boolean isNormalized() {
        }

        @Override // org.apache.xerces.xs.datatypes.XSDateTime
        public XSDateTime normalize() {
        }

        public synchronized String toString() {
        }

        public DateTimeData(int i, int i2, int i3, int i4, int i5, double d, int i6, String str, boolean z, AbstractDateTimeDV abstractDateTimeDV) {
        }
    }

    protected final void append(StringBuffer stringBuffer, double d) {
    }
}
