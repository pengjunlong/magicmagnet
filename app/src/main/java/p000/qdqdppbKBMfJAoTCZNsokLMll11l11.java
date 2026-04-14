package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p000.pbdbqpkFXvwhtHaKWiQlll1l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class qdqdppbKBMfJAoTCZNsokLMll11l11 extends BaseAdapter implements Filterable, pbdbqpkFXvwhtHaKWiQlll1l.dbpqdHhmDSIHIJiwc1ll1l1 {
    protected boolean bpdqqiQNVROMLC1ll1l1l11;
    protected DataSetObserver dbppbdqpeLmcbs11l11;
    protected int ddbbbeXHXx111ll;
    protected boolean dpbdpqRKAscW1lll1l;
    protected dbpqdHhmDSIHIJiwc1ll1l1 dqpdbEevAufTOvPphbjykClll1l11;
    protected Context dqpqqqbqQyjyB11111l1;
    protected pbdbqpkFXvwhtHaKWiQlll1l pbppbpqbamJRy11l1l1;
    protected Cursor ppbdpwWWljzmXXdHNabfWhgjl111l11;

    private class dbpqdHhmDSIHIJiwc1ll1l1 extends ContentObserver {
        final /* synthetic */ qdqdppbKBMfJAoTCZNsokLMll11l11 dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(qdqdppbKBMfJAoTCZNsokLMll11l11 qdqdppbkbmfjaotcznsoklmll11l11) {
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
        }
    }

    private class dpbdbdpbLwkLpObyKsq1lll1 extends DataSetObserver {
        final /* synthetic */ qdqdppbKBMfJAoTCZNsokLMll11l11 dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdbdpbLwkLpObyKsq1lll1(qdqdppbKBMfJAoTCZNsokLMll11l11 qdqdppbkbmfjaotcznsoklmll11l11) {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    public qdqdppbKBMfJAoTCZNsokLMll11l11(Context context, Cursor cursor, boolean z) {
    }

    public abstract void bpdqqiQNVROMLC1ll1l1l11(View view, Context context, Cursor cursor);

    public Cursor dbppbdqpeLmcbs11l11(Cursor cursor) {
    }

    public void dbpqdHhmDSIHIJiwc1ll1l1(Cursor cursor) {
    }

    public abstract View ddbbbeXHXx111ll(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract CharSequence dpbdbdpbLwkLpObyKsq1lll1(Cursor cursor);

    @Override // pbdbqpkFXvwhtHaKWiQlll1l.dbpqdHhmDSIHIJiwc1ll1l1
    public Cursor dpbdpqRKAscW1lll1l() {
    }

    protected void dqpdbEevAufTOvPphbjykClll1l11() {
    }

    public abstract View dqpqqqbqQyjyB11111l1(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
    }

    void ppbdpwWWljzmXXdHNabfWhgjl111l11(Context context, Cursor cursor, int i) {
    }
}
