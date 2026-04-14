package com.tencent.bugly.beta.ui;

import android.view.KeyEvent;
import androidx.fragment.app.Fragment;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class BaseFrag extends Fragment {
    protected boolean mIsShowing;

    public synchronized void close() {
    }

    public synchronized boolean isShowing() {
    }

    public abstract boolean onKeyDown(int i, KeyEvent keyEvent);

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
    }
}
