package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class AlertController {
    private Drawable bbdbbpdOJSuInlll111l;
    private boolean bdddqmITkkeGpsxVXHR1l1llll;
    private int bdpdqYMMfHmzHyUIbllllll1;
    Handler bdqbblVddTYAmqrWwacZmi111ll1;
    Message bpbbpOxqjGWQAsycX11ll1l1;
    int bpdddqbpEtpkwNYukGjjNs1l111;
    private CharSequence bpdqqiQNVROMLC1ll1l1l11;
    private CharSequence bppbpdbCeZVhQNTixBml1lll11l;
    private Drawable bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    private TextView bpppqdQjfPiCT111111111;
    private boolean bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
    private TextView bpqbbqTOKdRXac1ll1l1lll;
    NestedScrollView bpqdqbqpviKiORjqgp1l111l11;
    private final View.OnClickListener bpqpbicsQtfVpOtr11l1l;
    Message dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    Button dbbpdqqpdVUhpQ1ll11;
    private int dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    private int dbppbdqpeLmcbs11l11;
    private final Context dbpqdHhmDSIHIJiwc1ll1l1;
    private View ddbbbeXHXx111ll;
    private Drawable dddbpbpNqzZZJmSG1111l;
    private Drawable ddddbbdqIccDnEitQc1l1l1l;
    private int ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    final androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11 dpbdbdpbLwkLpObyKsq1lll1;
    private final int dpbdpqRKAscW1lll1l;
    int dpbdqAKWNZAIXLyehU1lll1lll1;
    private int dqbbdddqpLERmaRLiHiDpL1l1l1l;
    Button dqdqbpQposEBDyDxIyyz1ll11;
    private int dqpdbEevAufTOvPphbjykClll1l11;
    ListView dqpqqqbqQyjyB11111l1;
    ListAdapter dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private final Window dqqppqiKzJi1l1lll1l;
    private int pbppbpqbamJRy11l1l1;
    private ImageView pdpqbmApOBCmNMwnn1ll111;
    private CharSequence ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private int ppdqqzXJzQiU11ll11;
    private CharSequence qbddqbdJBkudFfhX1ll1l111;
    private int qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    Message qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private View qbpbddbpyaPAbpThgWCvm11l11l1;
    Button qdqdpyALEmZFGGaahRTIU1ll11;
    private CharSequence qppqdpppIauLKaAtRkB11111l;
    int qqbqbddiRRgLpniPxlUfQzP1l1l1l;
    int qqdbbfmUWwoYYpfYHJZdaUO1111llll;
    int qqpbppebHUxqEmlGoAJWl1lll;

    public static class RecycleListView extends ListView {
        private final int bpdqqiQNVROMLC1ll1l1l11;
        private final int dpbdpqRKAscW1lll1l;

        public RecycleListView(Context context, AttributeSet attributeSet) {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1(boolean z, boolean z2) {
        }
    }

    class bpdqqiQNVROMLC1ll1l1l11 implements Runnable {
        final /* synthetic */ View bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ View dpbdpqRKAscW1lll1l;
        final /* synthetic */ AlertController ppbdpwWWljzmXXdHNabfWhgjl111l11;

        bpdqqiQNVROMLC1ll1l1l11(AlertController alertController, View view, View view2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements View.OnClickListener {
        final /* synthetic */ AlertController dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(AlertController alertController) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    private static class ddbbbeXHXx111ll extends ArrayAdapter<CharSequence> {
        public ddbbbeXHXx111ll(Context context, int i, int i2, CharSequence[] charSequenceArr) {
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements NestedScrollView.dqqppqiKzJi1l1lll1l {
        final /* synthetic */ View dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ View dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ AlertController dqqppqiKzJi1l1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(AlertController alertController, View view, View view2) {
        }

        @Override // androidx.core.widget.NestedScrollView.dqqppqiKzJi1l1lll1l
        public void dbpqdHhmDSIHIJiwc1ll1l1(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    class dpbdpqRKAscW1lll1l implements AbsListView.OnScrollListener {
        final /* synthetic */ View dbpqdHhmDSIHIJiwc1ll1l1;
        final /* synthetic */ View dpbdbdpbLwkLpObyKsq1lll1;
        final /* synthetic */ AlertController dqqppqiKzJi1l1lll1l;

        dpbdpqRKAscW1lll1l(AlertController alertController, View view, View view2) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    private static final class dqpqqqbqQyjyB11111l1 extends Handler {
        private WeakReference<DialogInterface> dbpqdHhmDSIHIJiwc1ll1l1;

        public dqpqqqbqQyjyB11111l1(DialogInterface dialogInterface) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    class dqqppqiKzJi1l1lll1l implements Runnable {
        final /* synthetic */ View bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ View dpbdpqRKAscW1lll1l;
        final /* synthetic */ AlertController ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dqqppqiKzJi1l1lll1l(AlertController alertController, View view, View view2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static class ppbdpwWWljzmXXdHNabfWhgjl111l11 {
        public boolean bbdbbpdOJSuInlll111l;
        public DialogInterface.OnClickListener bdddqmITkkeGpsxVXHR1l1llll;
        public DialogInterface.OnMultiChoiceClickListener bdpdqYMMfHmzHyUIbllllll1;
        public int bpbbpOxqjGWQAsycX11ll1l1;
        public AdapterView.OnItemSelectedListener bpdddqbpEtpkwNYukGjjNs1l111;
        public int bpdqqiQNVROMLC1ll1l1l11;
        public DialogInterface.OnDismissListener bppbpdbCeZVhQNTixBml1lll11l;
        public CharSequence[] bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
        public boolean[] bpppqdQjfPiCT111111111;
        public bpdqqiQNVROMLC1ll1l1l11 bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
        public boolean bpqbbqTOKdRXac1ll1l1lll;
        public int bpqdqbqpviKiORjqgp1l111l11;
        public DialogInterface.OnClickListener dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
        public DialogInterface.OnCancelListener dbbpdqqpdVUhpQ1ll11;
        public int dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
        public Drawable dbppbdqpeLmcbs11l11;
        public final Context dbpqdHhmDSIHIJiwc1ll1l1;
        public CharSequence ddbbbeXHXx111ll;
        public View dddbpbpNqzZZJmSG1111l;
        public int ddddbbdqIccDnEitQc1l1l1l;
        public CharSequence ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
        public final LayoutInflater dpbdbdpbLwkLpObyKsq1lll1;
        public Drawable dpbdpqRKAscW1lll1l;
        public boolean dpbdqAKWNZAIXLyehU1lll1lll1;
        public boolean dqbbdddqpLERmaRLiHiDpL1l1l1l;
        public CharSequence dqdqbpQposEBDyDxIyyz1ll11;
        public CharSequence dqpdbEevAufTOvPphbjykClll1l11;
        public View dqpqqqbqQyjyB11111l1;
        public boolean dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
        public int dqqppqiKzJi1l1lll1l;
        public DialogInterface.OnClickListener pbppbpqbamJRy11l1l1;
        public int pdpqbmApOBCmNMwnn1ll111;
        public CharSequence ppbdpwWWljzmXXdHNabfWhgjl111l11;
        public Cursor ppdqqzXJzQiU11ll11;
        public Drawable qbddqbdJBkudFfhX1ll1l111;
        public Drawable qbdpqpstJKhhKkXrsOGvbWw1l1llll;
        public DialogInterface.OnKeyListener qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
        public boolean qbpbddbpyaPAbpThgWCvm11l11l1;
        public ListAdapter qdqdpyALEmZFGGaahRTIU1ll11;
        public DialogInterface.OnClickListener qppqdpppIauLKaAtRkB11111l;
        public String qqbqbddiRRgLpniPxlUfQzP1l1l1l;
        public String qqdbbfmUWwoYYpfYHJZdaUO1111llll;
        public int qqpbppebHUxqEmlGoAJWl1lll;

        public interface bpdqqiQNVROMLC1ll1l1l11 {
            void dbpqdHhmDSIHIJiwc1ll1l1(ListView listView);
        }

        class dbpqdHhmDSIHIJiwc1ll1l1 extends ArrayAdapter<CharSequence> {
            final /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ RecycleListView dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
            }
        }

        class dpbdbdpbLwkLpObyKsq1lll1 extends CursorAdapter {
            private final int bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 ddbbbeXHXx111ll;
            private final int dpbdpqRKAscW1lll1l;
            final /* synthetic */ AlertController dqpqqqbqQyjyB11111l1;
            final /* synthetic */ RecycleListView ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dpbdbdpbLwkLpObyKsq1lll1(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
            }
        }

        class dpbdpqRKAscW1lll1l implements AdapterView.OnItemClickListener {
            final /* synthetic */ AlertController bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ RecycleListView dpbdpqRKAscW1lll1l;
            final /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwWWljzmXXdHNabfWhgjl111l11;

            dpbdpqRKAscW1lll1l(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, RecycleListView recycleListView, AlertController alertController) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            }
        }

        class dqqppqiKzJi1l1lll1l implements AdapterView.OnItemClickListener {
            final /* synthetic */ ppbdpwWWljzmXXdHNabfWhgjl111l11 bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ AlertController dpbdpqRKAscW1lll1l;

            dqqppqiKzJi1l1lll1l(ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, AlertController alertController) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            }
        }

        public ppbdpwWWljzmXXdHNabfWhgjl111l11(Context context) {
        }

        private void dpbdbdpbLwkLpObyKsq1lll1(AlertController alertController) {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1(AlertController alertController) {
        }
    }

    public AlertController(Context context, androidx.appcompat.app.ppbdpwWWljzmXXdHNabfWhgjl111l11 ppbdpwwwljzmxxdhnabfwhgjl111l11, Window window) {
    }

    private void bpbbpOxqjGWQAsycX11ll1l1(ViewGroup viewGroup) {
    }

    private void bpppdpppqFAXRSTHUAmVJLvH11lllll1l(ViewGroup viewGroup) {
    }

    private static boolean bpqdqbqpviKiORjqgp1l111l11(Context context) {
    }

    private void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(ViewGroup viewGroup, View view, int i, int i2) {
    }

    private ViewGroup dbppbdqpeLmcbs11l11(View view, View view2) {
    }

    static boolean dbpqdHhmDSIHIJiwc1ll1l1(View view) {
    }

    private void dddbpbpNqzZZJmSG1111l() {
    }

    private void dpbdbdpbLwkLpObyKsq1lll1(Button button) {
    }

    static void dqpqqqbqQyjyB11111l1(View view, View view2, View view3) {
    }

    private int pbppbpqbamJRy11l1l1() {
    }

    private void qdqdpyALEmZFGGaahRTIU1ll11(ViewGroup viewGroup) {
    }

    private void qppqdpppIauLKaAtRkB11111l(ViewGroup viewGroup) {
    }

    public void bbdbbpdOJSuInlll111l(CharSequence charSequence) {
    }

    public void bdddqmITkkeGpsxVXHR1l1llll(int i) {
    }

    public ListView bpdqqiQNVROMLC1ll1l1l11() {
    }

    public void bppbpdbCeZVhQNTixBml1lll11l(View view) {
    }

    public void dbbpdqqpdVUhpQ1ll11(int i) {
    }

    public boolean ddbbbeXHXx111ll(int i, KeyEvent keyEvent) {
    }

    public void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
    }

    public int dpbdpqRKAscW1lll1l(int i) {
    }

    public void dqdqbpQposEBDyDxIyyz1ll11(Drawable drawable) {
    }

    public boolean dqpdbEevAufTOvPphbjykClll1l11(int i, KeyEvent keyEvent) {
    }

    public Button dqqppqiKzJi1l1lll1l(int i) {
    }

    public void ppbdpwWWljzmXXdHNabfWhgjl111l11() {
    }

    public void qbddqbdJBkudFfhX1ll1l111(CharSequence charSequence) {
    }

    public void qbdpqpstJKhhKkXrsOGvbWw1l1llll(View view) {
    }

    public void qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(View view, int i, int i2, int i3, int i4) {
    }
}
