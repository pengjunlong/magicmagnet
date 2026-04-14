package com.magicmagnet.common.util;

import android.content.Context;
import android.os.storage.StorageVolume;
import com.magicmagnet.common.NoProguard;
import java.util.List;
import kotlin.Metadata;
import p000.fe1;
import p000.pqbqbpqbKbRsVQllll1;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class StorageUtil {
    public static final StorageUtil dbpqdHhmDSIHIJiwc1ll1l1 = null;

    @pqbqbpqbKbRsVQllll1("android.os.storage.StorageManager")
    @Metadata
    public interface StorageManagerProxy extends NoProguard {
        StorageVolume[] getVolumeList();

        String[] getVolumePaths();

        @fe1
        void setInstance(Object obj);
    }

    @pqbqbpqbKbRsVQllll1("android.os.storage.StorageVolume")
    @Metadata
    public interface StorageVolumeProxy extends NoProguard {
        String getDescription(Context context);

        String getPath();

        String getState();

        boolean isRemovable();

        @fe1
        void setInstance(Object obj);
    }

    @Metadata
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        private final String bpdqqiQNVROMLC1ll1l1l11;
        private final String dbpqdHhmDSIHIJiwc1ll1l1;
        private final boolean dpbdbdpbLwkLpObyKsq1lll1;
        private final boolean dpbdpqRKAscW1lll1l;
        private final boolean dqqppqiKzJi1l1lll1l;
        private final boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dbpqdHhmDSIHIJiwc1ll1l1(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        }

        public final boolean bpdqqiQNVROMLC1ll1l1l11() {
        }

        public final String dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        public final boolean dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public final boolean dpbdpqRKAscW1lll1l() {
        }

        public final String dqqppqiKzJi1l1lll1l() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    private StorageUtil() {
    }

    public final List<dbpqdHhmDSIHIJiwc1ll1l1> dbpqdHhmDSIHIJiwc1ll1l1(Context context) {
    }
}
