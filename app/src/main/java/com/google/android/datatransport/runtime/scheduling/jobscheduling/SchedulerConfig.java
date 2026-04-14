package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class SchedulerConfig {
    private static final long BACKOFF_LOG_BASE = 10000;
    private static final long ONE_SECOND = 1000;
    private static final long THIRTY_SECONDS = 30000;
    private static final long TWENTY_FOUR_HOURS = 86400000;

    public static class Builder {
        private Clock clock;
        private Map<Priority, ConfigValue> values;

        public Builder addConfig(Priority priority, ConfigValue configValue) {
        }

        public SchedulerConfig build() {
        }

        public Builder setClock(Clock clock) {
        }
    }

    @AutoValue
    public static abstract class ConfigValue {

        @AutoValue.Builder
        public static abstract class Builder {
            public abstract ConfigValue build();

            public abstract Builder setDelta(long j);

            public abstract Builder setFlags(Set<Flag> set);

            public abstract Builder setMaxAllowedDelay(long j);
        }

        public static Builder builder() {
        }

        abstract long getDelta();

        abstract Set<Flag> getFlags();

        abstract long getMaxAllowedDelay();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class Flag {
        private static final /* synthetic */ Flag[] $VALUES = null;
        public static final Flag DEVICE_CHARGING = null;
        public static final Flag DEVICE_IDLE = null;
        public static final Flag NETWORK_UNMETERED = null;

        private Flag(String str, int i) {
        }

        public static Flag valueOf(String str) {
        }

        public static Flag[] values() {
        }
    }

    private long adjustedExponentialBackoff(int i, long j) {
    }

    public static Builder builder() {
    }

    static SchedulerConfig create(Clock clock, Map<Priority, ConfigValue> map) {
    }

    public static SchedulerConfig getDefault(Clock clock) {
    }

    private static <T> Set<T> immutableSetOf(T... tArr) {
    }

    private void populateFlags(JobInfo.Builder builder, Set<Flag> set) {
    }

    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority priority, long j, int i) {
    }

    abstract Clock getClock();

    public Set<Flag> getFlags(Priority priority) {
    }

    public long getScheduleDelay(Priority priority, long j, int i) {
    }

    abstract Map<Priority, ConfigValue> getValues();
}
