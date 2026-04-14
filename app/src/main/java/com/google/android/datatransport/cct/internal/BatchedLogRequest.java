package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

@AutoValue
@Encodable
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BatchedLogRequest {
    public static BatchedLogRequest create(List<LogRequest> list) {
    }

    public static DataEncoder createDataEncoder() {
    }

    @Encodable.Field(name = "logRequest")
    public abstract List<LogRequest> getLogRequests();
}
