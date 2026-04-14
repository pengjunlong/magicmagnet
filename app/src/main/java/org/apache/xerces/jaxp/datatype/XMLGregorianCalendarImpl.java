package org.apache.xerces.jaxp.datatype;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.javax.xml.datatype.Duration;
import org.javax.xml.datatype.XMLGregorianCalendar;
import org.javax.xml.namespace.QName;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class XMLGregorianCalendarImpl extends XMLGregorianCalendar implements Serializable, Cloneable {
    private static final BigInteger BILLION_B = null;
    private static final int BILLION_I = 1000000000;
    private static final int DAY = 2;
    private static final BigDecimal DECIMAL_ONE = null;
    private static final BigDecimal DECIMAL_SIXTY = null;
    private static final BigDecimal DECIMAL_ZERO = null;
    private static final String[] FIELD_NAME = null;
    private static final BigInteger FOUR = null;
    private static final BigInteger FOUR_HUNDRED = null;
    private static final int HOUR = 3;
    private static final BigInteger HUNDRED = null;
    public static final XMLGregorianCalendar LEAP_YEAR_DEFAULT = null;
    private static final int[] MAX_FIELD_VALUE = null;
    private static final int MILLISECOND = 6;
    private static final int MINUTE = 4;
    private static final int[] MIN_FIELD_VALUE = null;
    private static final int MONTH = 1;
    private static final Date PURE_GREGORIAN_CHANGE = null;
    private static final int SECOND = 5;
    private static final BigInteger SIXTY = null;
    private static final int TIMEZONE = 7;
    private static final BigInteger TWELVE = null;
    private static final BigInteger TWENTY_FOUR = null;
    private static final int YEAR = 0;
    private static final long serialVersionUID = 3905403108073447394L;
    private int day;
    private BigInteger eon;
    private BigDecimal fractionalSecond;
    private int hour;
    private int minute;
    private int month;
    private int orig_day;
    private BigInteger orig_eon;
    private BigDecimal orig_fracSeconds;
    private int orig_hour;
    private int orig_minute;
    private int orig_month;
    private int orig_second;
    private int orig_timezone;
    private int orig_year;
    private int second;
    private int timezone;
    private int year;

    private static class DaysInMonth {
        private static final int[] table = null;

        private DaysInMonth() {
        }

        static /* synthetic */ int[] access$100() {
        }
    }

    private final class Parser {
        private int fidx;
        private final int flen;
        private final String format;
        final /* synthetic */ XMLGregorianCalendarImpl this$0;
        private final String value;
        private int vidx;
        private final int vlen;

        /* synthetic */ Parser(XMLGregorianCalendarImpl xMLGregorianCalendarImpl, String str, String str2, C18041 c18041) {
        }

        private BigDecimal parseBigDecimal() throws IllegalArgumentException {
        }

        private int parseInt(int i, int i2) throws IllegalArgumentException {
        }

        private void parseYear() throws IllegalArgumentException {
        }

        private char peek() throws IllegalArgumentException {
        }

        private char read() throws IllegalArgumentException {
        }

        private void skip(char c) throws IllegalArgumentException {
        }

        public void parse() throws IllegalArgumentException {
        }

        private Parser(XMLGregorianCalendarImpl xMLGregorianCalendarImpl, String str, String str2) {
        }
    }

    protected XMLGregorianCalendarImpl(String str) throws IllegalArgumentException {
    }

    static /* synthetic */ boolean access$200(char c) {
    }

    private void checkFieldValueConstraint(int i, int i2) throws IllegalArgumentException {
    }

    private static int compareField(int i, int i2) {
    }

    private static int compareField(BigInteger bigInteger, BigInteger bigInteger2) {
    }

    public static XMLGregorianCalendar createDate(int i, int i2, int i3, int i4) {
    }

    public static XMLGregorianCalendar createDateTime(BigInteger bigInteger, int i, int i2, int i3, int i4, int i5, BigDecimal bigDecimal, int i6) {
    }

    public static XMLGregorianCalendar createTime(int i, int i2, int i3, int i4) {
    }

    private String format(String str) {
    }

    private BigDecimal getSeconds() {
    }

    private static int internalCompare(XMLGregorianCalendar xMLGregorianCalendar, XMLGregorianCalendar xMLGregorianCalendar2) {
    }

    private static boolean isDigit(char c) {
    }

    private static int maximumDayInMonthFor(BigInteger bigInteger, int i) {
    }

    private XMLGregorianCalendar normalizeToTimezone(XMLGregorianCalendar xMLGregorianCalendar, int i) {
    }

    public static XMLGregorianCalendar parse(String str) {
    }

    private void printNumber(StringBuffer stringBuffer, int i, int i2) {
    }

    static BigInteger sanitize(Number number, int i) {
    }

    private void save() {
    }

    private void setEon(BigInteger bigInteger) {
    }

    private String toString(BigDecimal bigDecimal) {
    }

    private Object writeReplace() throws IOException {
    }

    public void add(Duration duration) {
    }

    public void clear() {
    }

    public Object clone() {
    }

    public int compare(XMLGregorianCalendar xMLGregorianCalendar) {
    }

    public boolean equals(Object obj) {
    }

    public int getDay() {
    }

    public BigInteger getEon() {
    }

    public BigInteger getEonAndYear() {
    }

    public BigDecimal getFractionalSecond() {
    }

    public int getHour() {
    }

    public int getMillisecond() {
    }

    public int getMinute() {
    }

    public int getMonth() {
    }

    public int getSecond() {
    }

    public TimeZone getTimeZone(int i) {
    }

    public int getTimezone() {
    }

    public QName getXMLSchemaType() {
    }

    public int getYear() {
    }

    public int hashCode() {
    }

    public boolean isValid() {
    }

    public XMLGregorianCalendar normalize() {
    }

    public void reset() {
    }

    public void setDay(int i) {
    }

    public void setFractionalSecond(BigDecimal bigDecimal) {
    }

    public void setHour(int i) {
    }

    public void setMillisecond(int i) {
    }

    public void setMinute(int i) {
    }

    public void setMonth(int i) {
    }

    public void setSecond(int i) {
    }

    public void setTime(int i, int i2, int i3) {
    }

    public void setTimezone(int i) {
    }

    public void setYear(BigInteger bigInteger) {
    }

    public GregorianCalendar toGregorianCalendar() {
    }

    public String toXMLFormat() {
    }

    private static int compareField(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
    }

    public static XMLGregorianCalendar createDateTime(int i, int i2, int i3, int i4, int i5, int i6) {
    }

    public static XMLGregorianCalendar createTime(int i, int i2, int i3, BigDecimal bigDecimal, int i4) {
    }

    public void setTime(int i, int i2, int i3, BigDecimal bigDecimal) {
    }

    public static XMLGregorianCalendar createDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public static XMLGregorianCalendar createTime(int i, int i2, int i3, int i4, int i5) {
    }

    private static int maximumDayInMonthFor(int i, int i2) {
    }

    private void printNumber(StringBuffer stringBuffer, BigInteger bigInteger, int i) {
    }

    public void setTime(int i, int i2, int i3, int i4) {
    }

    public void setYear(int i) {
    }

    public GregorianCalendar toGregorianCalendar(TimeZone timeZone, Locale locale, XMLGregorianCalendar xMLGregorianCalendar) {
    }

    public XMLGregorianCalendarImpl() {
    }

    protected XMLGregorianCalendarImpl(BigInteger bigInteger, int i, int i2, int i3, int i4, int i5, BigDecimal bigDecimal, int i6) {
    }

    private XMLGregorianCalendarImpl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public XMLGregorianCalendarImpl(GregorianCalendar gregorianCalendar) {
    }
}
