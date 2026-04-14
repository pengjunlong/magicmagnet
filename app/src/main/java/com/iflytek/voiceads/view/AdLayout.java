package com.iflytek.voiceads.view;

import android.app.Activity;
import android.content.Context;
import android.widget.RelativeLayout;
import com.iflytek.voiceads.listener.InternalListener;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class AdLayout extends RelativeLayout {
    private boolean hasDestroyed;
    protected Activity mAdActivity;
    protected InternalListener mInternalListener;

    /* renamed from: com.iflytek.voiceads.view.AdLayout$1 */
    class C14011 implements InternalListener {
        final /* synthetic */ AdLayout this$0;

        /* renamed from: com.iflytek.voiceads.view.AdLayout$1$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            final /* synthetic */ C14011 this$1;

            AnonymousClass1(C14011 c14011) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        C14011(AdLayout adLayout) {
        }

        @Override // com.iflytek.voiceads.listener.InternalListener
        public boolean onAdDestroy() {
        }
    }

    public AdLayout(Context context) {
    }

    static /* synthetic */ boolean access$000(AdLayout adLayout) {
    }

    static /* synthetic */ boolean access$002(AdLayout adLayout, boolean z) {
    }

    protected synchronized void destroy() {
    }
}
