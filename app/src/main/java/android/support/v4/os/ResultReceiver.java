package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = null;
    final Handler mHandler;
    final boolean mLocal;
    IResultReceiver mReceiver;

    /* renamed from: android.support.v4.os.ResultReceiver$1 */
    class C00301 implements Parcelable.Creator<ResultReceiver> {
        C00301() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ResultReceiver createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ResultReceiver[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i) {
        }
    }

    class MyResultReceiver extends IResultReceiver.Stub {
        final /* synthetic */ ResultReceiver this$0;

        MyResultReceiver(ResultReceiver resultReceiver) {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int i, Bundle bundle) {
        }
    }

    class MyRunnable implements Runnable {
        final int mResultCode;
        final Bundle mResultData;
        final /* synthetic */ ResultReceiver this$0;

        MyRunnable(ResultReceiver resultReceiver, int i, Bundle bundle) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ResultReceiver(Handler handler) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    protected void onReceiveResult(int i, Bundle bundle) {
    }

    public void send(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    ResultReceiver(Parcel parcel) {
    }
}
