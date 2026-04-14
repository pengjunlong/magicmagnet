package com.google.firebase.heartbeatinfo;

import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface HeartBeatInfo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class HeartBeat {
        private static final /* synthetic */ HeartBeat[] $VALUES = null;
        public static final HeartBeat COMBINED = null;
        public static final HeartBeat GLOBAL = null;
        public static final HeartBeat NONE = null;
        public static final HeartBeat SDK = null;
        private final int code;

        private HeartBeat(String str, int i, int i2) {
        }

        public static HeartBeat valueOf(String str) {
        }

        public static HeartBeat[] values() {
        }

        public int getCode() {
        }
    }

    Task<List<HeartBeatResult>> getAndClearStoredHeartBeatInfo();

    HeartBeat getHeartBeatCode(String str);

    Task<Void> storeHeartBeatInfo(String str);
}
