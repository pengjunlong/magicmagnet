package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = 0;
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = 0;
    private int attemptCount;
    private long nextRequestTime;
    private final Utils utils;

    RequestLimiter(Utils utils) {
    }

    private synchronized long getBackoffDuration(int i) {
    }

    private static boolean isRetryableError(int i) {
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i) {
    }

    private synchronized void resetBackoffStrategy() {
    }

    public synchronized boolean isRequestAllowed() {
    }

    public synchronized void setNextRequestTime(int i) {
    }

    RequestLimiter() {
    }
}
