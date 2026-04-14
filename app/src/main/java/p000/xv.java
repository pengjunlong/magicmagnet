package p000;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Comparator;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class xv extends FrameLayout {
    protected final Intent bpdqqiQNVROMLC1ll1l1l11;
    protected dqqppqiKzJi1l1lll1l dbppbdqpeLmcbs11l11;
    protected final List<dpbdbdpbLwkLpObyKsq1lll1> ddbbbeXHXx111ll;
    protected Comparator<dpbdbdpbLwkLpObyKsq1lll1> ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    private int dpbdpqRKAscW1lll1l;
    protected final List<dpbdbdpbLwkLpObyKsq1lll1> dqpdbEevAufTOvPphbjykClll1l11;
    protected final TextView dqpqqqbqQyjyB11111l1;
    protected dpbdpqRKAscW1lll1l pbppbpqbamJRy11l1l1;
    protected final GridView ppbdpwWWljzmXXdHNabfWhgjl111l11;

    private class bpdqqiQNVROMLC1ll1l1l11 implements dpbdpqRKAscW1lll1l {
        final /* synthetic */ xv dbpqdHhmDSIHIJiwc1ll1l1;

        private bpdqqiQNVROMLC1ll1l1l11(xv xvVar) {
        }

        @Override // xv.dpbdpqRKAscW1lll1l
        public boolean dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        /* synthetic */ bpdqqiQNVROMLC1ll1l1l11(xv xvVar, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements AdapterView.OnItemClickListener {
        final /* synthetic */ xv bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(xv xvVar, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    public interface dpbdpqRKAscW1lll1l {
        boolean dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1);
    }

    private class dqpqqqbqQyjyB11111l1 implements Comparator<dpbdbdpbLwkLpObyKsq1lll1> {
        final /* synthetic */ xv dpbdpqRKAscW1lll1l;

        private dqpqqqbqQyjyB11111l1(xv xvVar) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll12) {
        }

        public int dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll12) {
        }

        /* synthetic */ dqpqqqbqQyjyB11111l1(xv xvVar, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1) {
        }
    }

    public interface ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        void dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1);
    }

    public xv(Context context, Intent intent, String str, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11) {
    }

    public List<dpbdbdpbLwkLpObyKsq1lll1> getMixins() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    public void setColumnWidthDp(int i) {
    }

    public void setFilter(dpbdpqRKAscW1lll1l dpbdpqrkascw1lll1l) {
    }

    public void setMixins(List<dpbdbdpbLwkLpObyKsq1lll1> list) {
    }

    public void setSortMethod(Comparator<dpbdbdpbLwkLpObyKsq1lll1> comparator) {
    }

    public static class dpbdbdpbLwkLpObyKsq1lll1 {
        private AsyncTask<Void, Void, Drawable> bpdqqiQNVROMLC1ll1l1l11;
        public Drawable dbpqdHhmDSIHIJiwc1ll1l1;
        public final String dpbdbdpbLwkLpObyKsq1lll1;
        public final ResolveInfo dpbdpqRKAscW1lll1l;
        public final ComponentName dqqppqiKzJi1l1lll1l;
        public Object ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dpbdbdpbLwkLpObyKsq1lll1(Drawable drawable, String str) {
        }

        static /* synthetic */ AsyncTask dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1) {
        }

        static /* synthetic */ AsyncTask dpbdbdpbLwkLpObyKsq1lll1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, AsyncTask asyncTask) {
        }

        public Intent dqqppqiKzJi1l1lll1l(Intent intent) {
        }

        public dpbdbdpbLwkLpObyKsq1lll1(ResolveInfo resolveInfo, CharSequence charSequence, ComponentName componentName) {
        }
    }

    private class dqqppqiKzJi1l1lll1l extends BaseAdapter {
        final LayoutInflater bpdqqiQNVROMLC1ll1l1l11;
        final List<dpbdbdpbLwkLpObyKsq1lll1> dpbdpqRKAscW1lll1l;
        final /* synthetic */ xv dqpqqqbqQyjyB11111l1;
        private PackageManager ppbdpwWWljzmXXdHNabfWhgjl111l11;

        class dbpqdHhmDSIHIJiwc1ll1l1 extends AsyncTask<Void, Void, Drawable> {
            final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 dbpqdHhmDSIHIJiwc1ll1l1;
            final /* synthetic */ dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpbLwkLpObyKsq1lll1;
            final /* synthetic */ dqqppqiKzJi1l1lll1l dqqppqiKzJi1l1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll12) {
            }

            protected Drawable dbpqdHhmDSIHIJiwc1ll1l1(Void... voidArr) {
            }

            @Override // android.os.AsyncTask
            protected /* bridge */ /* synthetic */ Drawable doInBackground(Void[] voidArr) {
            }

            protected void dpbdbdpbLwkLpObyKsq1lll1(Drawable drawable) {
            }

            @Override // android.os.AsyncTask
            protected /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
            }
        }

        class dpbdbdpbLwkLpObyKsq1lll1 {
            final ImageView dbpqdHhmDSIHIJiwc1ll1l1;
            final TextView dpbdbdpbLwkLpObyKsq1lll1;
            final /* synthetic */ dqqppqiKzJi1l1lll1l dqqppqiKzJi1l1lll1l;

            dpbdbdpbLwkLpObyKsq1lll1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l, View view) {
            }
        }

        public dqqppqiKzJi1l1lll1l(xv xvVar, Context context, Intent intent, List<dpbdbdpbLwkLpObyKsq1lll1> list) {
        }

        static /* synthetic */ PackageManager dbpqdHhmDSIHIJiwc1ll1l1(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
        }

        public dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpbLwkLpObyKsq1lll1(int i) {
        }

        @Override // android.widget.Adapter
        public int getCount() {
        }

        @Override // android.widget.Adapter
        public /* bridge */ /* synthetic */ Object getItem(int i) {
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
        }

        public dqqppqiKzJi1l1lll1l(xv xvVar, Context context, List<dpbdbdpbLwkLpObyKsq1lll1> list) {
        }
    }

    public xv(Context context, String str, ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, List<dpbdbdpbLwkLpObyKsq1lll1> list) {
    }
}
