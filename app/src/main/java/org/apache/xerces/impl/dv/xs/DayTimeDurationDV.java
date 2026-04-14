package org.apache.xerces.impl.dv.xs;

import org.apache.xerces.impl.dv.InvalidDatatypeValueException;
import org.apache.xerces.impl.dv.ValidationContext;
import org.apache.xerces.impl.dv.xs.AbstractDateTimeDV;
import org.javax.xml.datatype.Duration;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class DayTimeDurationDV extends DurationDV {
    DayTimeDurationDV() {
    }

    @Override // org.apache.xerces.impl.dv.xs.DurationDV, org.apache.xerces.impl.dv.xs.TypeValidator
    public Object getActualValue(String str, ValidationContext validationContext) throws InvalidDatatypeValueException {
    }

    @Override // org.apache.xerces.impl.dv.xs.DurationDV, org.apache.xerces.impl.dv.xs.AbstractDateTimeDV
    protected Duration getDuration(AbstractDateTimeDV.DateTimeData dateTimeData) {
    }
}
