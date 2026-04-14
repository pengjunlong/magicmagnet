package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class JobIntentService extends Service {
    static final HashMap<ComponentName, ddbbbeXHXx111ll> ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll = null;
    static final Object pbppbpqbamJRy11l1l1 = null;
    ddbbbeXHXx111ll bpdqqiQNVROMLC1ll1l1l11;
    final ArrayList<dpbdpqRKAscW1lll1l> dbppbdqpeLmcbs11l11;
    boolean ddbbbeXHXx111ll;
    dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l;
    boolean dqpdbEevAufTOvPphbjykClll1l11;
    boolean dqpqqqbqQyjyB11111l1;
    dbpqdHhmDSIHIJiwc1ll1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11;

    interface bpdqqiQNVROMLC1ll1l1l11 {
        void dpbdbdpbLwkLpObyKsq1lll1();

        Intent getIntent();
    }

    final class dbpqdHhmDSIHIJiwc1ll1l1 extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ JobIntentService dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(JobIntentService jobIntentService) {
        }

        protected Void dbpqdHhmDSIHIJiwc1ll1l1(Void... voidArr) {
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        }

        protected void dpbdbdpbLwkLpObyKsq1lll1(Void r1) {
        }

        protected void dqqppqiKzJi1l1lll1l(Void r1) {
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onCancelled(Void r1) {
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(Void r1) {
        }
    }

    static abstract class ddbbbeXHXx111ll {
        final ComponentName dbpqdHhmDSIHIJiwc1ll1l1;
        boolean dpbdbdpbLwkLpObyKsq1lll1;
        int dqqppqiKzJi1l1lll1l;

        ddbbbeXHXx111ll(ComponentName componentName) {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1(int i) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        public void dpbdpqRKAscW1lll1l() {
        }

        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    interface dpbdbdpbLwkLpObyKsq1lll1 {
        IBinder dbpqdHhmDSIHIJiwc1ll1l1();

        bpdqqiQNVROMLC1ll1l1l11 dpbdbdpbLwkLpObyKsq1lll1();
    }

    final class dpbdpqRKAscW1lll1l implements bpdqqiQNVROMLC1ll1l1l11 {
        final Intent dbpqdHhmDSIHIJiwc1ll1l1;
        final int dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ JobIntentService dqqppqiKzJi1l1lll1l;

        dpbdpqRKAscW1lll1l(JobIntentService jobIntentService, Intent intent, int i) {
        }

        @Override // androidx.core.app.JobIntentService.bpdqqiQNVROMLC1ll1l1l11
        public void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // androidx.core.app.JobIntentService.bpdqqiQNVROMLC1ll1l1l11
        public Intent getIntent() {
        }
    }

    static final class dqpqqqbqQyjyB11111l1 extends ddbbbeXHXx111ll {
        private final JobScheduler bpdqqiQNVROMLC1ll1l1l11;
        private final JobInfo dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(Context context, ComponentName componentName, int i) {
        }
    }

    static final class dqqppqiKzJi1l1lll1l extends ddbbbeXHXx111ll {
        private final PowerManager.WakeLock bpdqqiQNVROMLC1ll1l1l11;
        boolean ddbbbeXHXx111ll;
        private final Context dpbdpqRKAscW1lll1l;
        boolean dqpqqqbqQyjyB11111l1;
        private final PowerManager.WakeLock ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dqqppqiKzJi1l1lll1l(Context context, ComponentName componentName) {
        }

        @Override // androidx.core.app.JobIntentService.ddbbbeXHXx111ll
        public void dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // androidx.core.app.JobIntentService.ddbbbeXHXx111ll
        public void dpbdpqRKAscW1lll1l() {
        }

        @Override // androidx.core.app.JobIntentService.ddbbbeXHXx111ll
        public void dqqppqiKzJi1l1lll1l() {
        }
    }

    static final class ppbdpwWWljzmXXdHNabfWhgjl111l11 extends JobServiceEngine implements dpbdbdpbLwkLpObyKsq1lll1 {
        final JobIntentService dbpqdHhmDSIHIJiwc1ll1l1;
        final Object dpbdbdpbLwkLpObyKsq1lll1;
        JobParameters dqqppqiKzJi1l1lll1l;

        final class dbpqdHhmDSIHIJiwc1ll1l1 implements bpdqqiQNVROMLC1ll1l1l11 {
            final JobWorkItem dbpqdHhmDSIHIJiwc1ll1l1;
            final /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 dpbdbdpbLwkLpObyKsq1lll1;

            dbpqdHhmDSIHIJiwc1ll1l1(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, JobWorkItem jobWorkItem) {
            }

            @Override // androidx.core.app.JobIntentService.bpdqqiQNVROMLC1ll1l1l11
            public void dpbdbdpbLwkLpObyKsq1lll1() {
            }

            @Override // androidx.core.app.JobIntentService.bpdqqiQNVROMLC1ll1l1l11
            public Intent getIntent() {
            }
        }

        ppbdpwWWljzmXXdHNabfWhgjl111l11(JobIntentService jobIntentService) {
        }

        @Override // androidx.core.app.JobIntentService.dpbdbdpbLwkLpObyKsq1lll1
        public IBinder dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // androidx.core.app.JobIntentService.dpbdbdpbLwkLpObyKsq1lll1
        public bpdqqiQNVROMLC1ll1l1l11 dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
        }
    }

    static ddbbbeXHXx111ll dpbdpqRKAscW1lll1l(Context context, ComponentName componentName, boolean z, int i) {
    }

    protected abstract void bpdqqiQNVROMLC1ll1l1l11(Intent intent);

    bpdqqiQNVROMLC1ll1l1l11 dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    boolean dpbdbdpbLwkLpObyKsq1lll1() {
    }

    void dqpqqqbqQyjyB11111l1() {
    }

    void dqqppqiKzJi1l1lll1l(boolean z) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public void onDestroy() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
    }

    public boolean ppbdpwWWljzmXXdHNabfWhgjl111l11() {
    }
}
