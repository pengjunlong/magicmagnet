package com.tencent.bugly.beta.ui;

import android.view.ViewTreeObserver;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class BetaOnPreDraw implements ViewTreeObserver.OnPreDrawListener {
    public static final int TYPE_BASE_BTN = 2;
    public static final int TYPE_CONTENT_SCROLL = 3;
    public static final int TYPE_UPGRADE_TITLE = 1;
    final Object[] args;
    long lastTime;
    StringBuilder loadText;
    final int type;

    public BetaOnPreDraw(int i, Object... objArr) {
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
    }
}
