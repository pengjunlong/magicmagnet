package org.apache.xerces.jaxp.datatype;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import org.javax.xml.datatype.DatatypeConstants;
import org.javax.xml.datatype.Duration;
import org.javax.xml.datatype.XMLGregorianCalendar;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class DurationImpl extends Duration implements Serializable {
    private static final BigDecimal[] FACTORS = null;
    private static final DatatypeConstants.Field[] FIELDS = null;
    private static final XMLGregorianCalendar[] TEST_POINTS = null;
    private static final BigDecimal ZERO = null;
    private static final long serialVersionUID = -2650025807136350131L;
    private final BigInteger days;
    private final BigInteger hours;
    private final BigInteger minutes;
    private final BigInteger months;
    private final BigDecimal seconds;
    private final int signum;
    private final BigInteger years;

    protected DurationImpl(boolean z, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigDecimal bigDecimal) {
    }

    private static void alignSigns(BigDecimal[] bigDecimalArr, int i, int i2) {
    }

    private int calcSignum(boolean z) {
    }

    private int compareDates(Duration duration, Duration duration2) {
    }

    private int compareResults(int i, int i2) {
    }

    private static long getCalendarTimeInMillis(Calendar calendar) {
    }

    private BigDecimal getFieldAsBigDecimal(DatatypeConstants.Field field) {
    }

    private int getInt(DatatypeConstants.Field field) {
    }

    private static boolean isDigit(char c) {
    }

    private static boolean isDigitOrPeriod(char c) {
    }

    private static void organizeParts(String str, String[] strArr, int[] iArr, int i, String str2) throws IllegalArgumentException {
    }

    private static BigDecimal parseBigDecimal(String str, String str2, int i) throws IllegalArgumentException {
    }

    private static BigInteger parseBigInteger(String str, String str2, int i) throws IllegalArgumentException {
    }

    private static String parsePiece(String str, int[] iArr) throws IllegalArgumentException {
    }

    private static BigDecimal sanitize(BigInteger bigInteger, int i) {
    }

    private static void testNonNegative(BigInteger bigInteger, DatatypeConstants.Field field) {
    }

    private static BigInteger toBigInteger(BigDecimal bigDecimal, boolean z) {
    }

    private static BigInteger wrap(int i) {
    }

    private Object writeReplace() throws IOException {
    }

    public Duration add(Duration duration) {
    }

    public void addTo(Calendar calendar) {
    }

    public int compare(Duration duration) {
    }

    public int getDays() {
    }

    public Number getField(DatatypeConstants.Field field) {
    }

    public int getHours() {
    }

    public int getMinutes() {
    }

    public int getMonths() {
    }

    public int getSeconds() {
    }

    public int getSign() {
    }

    public long getTimeInMillis(Calendar calendar) {
    }

    public int getYears() {
    }

    public int hashCode() {
    }

    public boolean isSet(DatatypeConstants.Field field) {
    }

    public Duration multiply(int i) {
    }

    public Duration negate() {
    }

    public Duration normalizeWith(Calendar calendar) {
    }

    public int signum() {
    }

    public Duration subtract(Duration duration) {
    }

    public String toString() {
    }

    public Duration multiply(BigDecimal bigDecimal) {
    }

    private static void testNonNegative(BigDecimal bigDecimal, DatatypeConstants.Field field) {
    }

    static BigDecimal sanitize(BigDecimal bigDecimal, int i) {
    }

    public long getTimeInMillis(Date date) {
    }

    public void addTo(Date date) {
    }

    protected DurationImpl(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
    }

    protected DurationImpl(long j) {
    }

    private String toString(BigDecimal bigDecimal) {
    }

    protected DurationImpl(String str) throws IllegalArgumentException {
    }
}
