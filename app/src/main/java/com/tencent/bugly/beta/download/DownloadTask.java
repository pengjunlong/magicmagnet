package com.tencent.bugly.beta.download;

import java.io.File;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class DownloadTask {
    public static final int COMPLETE = 1;
    public static final int DELETED = 4;
    public static final int DOWNLOADING = 2;
    public static final int FAILED = 5;
    public static final int INIT = 0;
    public static final int PAUSED = 3;
    public static final int TYPE_HOTFIX = 2;
    public static final int TYPE_UPGRADE = 1;

    /* renamed from: a */
    protected String f242a;

    /* renamed from: b */
    protected String f243b;

    /* renamed from: c */
    protected String f244c;

    /* renamed from: d */
    protected List<DownloadListener> f245d;

    /* renamed from: e */
    protected long f246e;

    /* renamed from: f */
    protected long f247f;

    /* renamed from: g */
    protected boolean f248g;

    /* renamed from: h */
    protected String f249h;

    /* renamed from: i */
    protected int f250i;

    /* renamed from: j */
    protected int f251j;

    protected DownloadTask(String str, String str2, String str3, String str4) {
    }

    public void addListener(DownloadListener downloadListener) {
    }

    public abstract void delete(boolean z);

    public abstract void download();

    public abstract long getCostTime();

    public int getDownloadType() {
    }

    public String getDownloadUrl() {
    }

    public String getMD5() {
    }

    public abstract File getSaveFile();

    public long getSavedLength() {
    }

    public abstract int getStatus();

    public long getTotalLength() {
    }

    public boolean isNeededNotify() {
    }

    public boolean removeListener(DownloadListener downloadListener) {
    }

    public void setDownloadType(int i) {
    }

    public void setNeededNotify(boolean z) {
    }

    public void setSavedLength(long j) {
    }

    public void setTotalLength(long j) {
    }

    public abstract void stop();
}
