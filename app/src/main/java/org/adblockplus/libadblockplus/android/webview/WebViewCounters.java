package org.adblockplus.libadblockplus.android.webview;

import android.os.Handler;
import java.lang.ref.WeakReference;
import org.adblockplus.libadblockplus.android.webview.AdblockWebView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class WebViewCounters {
    private int allowlistedCounter;
    private final Runnable allowlistedIncrementRunnable;
    private final Runnable allowlistedResetRunnable;
    private int blockedCounter;
    private final Runnable blockedIncrementRunnable;
    private final Runnable blockedResetRunnable;
    private EventsListener eventsListener;
    private final Handler handler;

    /* renamed from: org.adblockplus.libadblockplus.android.webview.WebViewCounters$1 */
    class C17681 implements AdblockWebView.EventsListener {
        final /* synthetic */ WebViewCounters val$counters;

        C17681(WebViewCounters webViewCounters) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.AdblockWebView.EventsListener
        public void onNavigation() {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.AdblockWebView.EventsListener
        public void onResourceLoadingAllowlisted(AdblockWebView.EventsListener.AllowlistedResourceInfo allowlistedResourceInfo) {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.AdblockWebView.EventsListener
        public void onResourceLoadingBlocked(AdblockWebView.EventsListener.BlockedResourceInfo blockedResourceInfo) {
        }
    }

    public interface EventsListener {
        void onAllowlistedChanged(int i);

        void onBlockedChanged(int i);
    }

    private static class IncrementAllowlistedOperation implements WeakRunnable.Operation {
        private IncrementAllowlistedOperation() {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.WebViewCounters.WeakRunnable.Operation
        public void run(WebViewCounters webViewCounters) {
        }

        /* synthetic */ IncrementAllowlistedOperation(C17681 c17681) {
        }
    }

    private static class IncrementBlockedOperation implements WeakRunnable.Operation {
        private IncrementBlockedOperation() {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.WebViewCounters.WeakRunnable.Operation
        public void run(WebViewCounters webViewCounters) {
        }

        /* synthetic */ IncrementBlockedOperation(C17681 c17681) {
        }
    }

    private static class ResetAllowlistedOperation implements WeakRunnable.Operation {
        private ResetAllowlistedOperation() {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.WebViewCounters.WeakRunnable.Operation
        public void run(WebViewCounters webViewCounters) {
        }

        /* synthetic */ ResetAllowlistedOperation(C17681 c17681) {
        }
    }

    private static class ResetBlockedOperation implements WeakRunnable.Operation {
        private ResetBlockedOperation() {
        }

        @Override // org.adblockplus.libadblockplus.android.webview.WebViewCounters.WeakRunnable.Operation
        public void run(WebViewCounters webViewCounters) {
        }

        /* synthetic */ ResetBlockedOperation(C17681 c17681) {
        }
    }

    private static final class WeakRunnable implements Runnable {
        private Operation operation;
        private WeakReference<WebViewCounters> weakCounters;

        interface Operation {
            void run(WebViewCounters webViewCounters);
        }

        WeakRunnable(WebViewCounters webViewCounters, Operation operation) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public WebViewCounters(EventsListener eventsListener) {
    }

    static /* synthetic */ int access$402(WebViewCounters webViewCounters, int i) {
    }

    static /* synthetic */ int access$404(WebViewCounters webViewCounters) {
    }

    static /* synthetic */ void access$500(WebViewCounters webViewCounters) {
    }

    static /* synthetic */ int access$602(WebViewCounters webViewCounters, int i) {
    }

    static /* synthetic */ int access$604(WebViewCounters webViewCounters) {
    }

    static /* synthetic */ void access$700(WebViewCounters webViewCounters) {
    }

    public static AdblockWebView.EventsListener bindAdblockWebView(EventsListener eventsListener) {
    }

    private void notifyAllowlistedChanged() {
    }

    private void notifyBlockedChanged() {
    }

    public void incrementAllowlisted() {
    }

    public void incrementBlocked() {
    }

    public void resetAllowlisted() {
    }

    public void resetBlocked() {
    }
}
