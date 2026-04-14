package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p000.cg1;
import p000.ls1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class dbbpdqqpdVUhpQ1ll11 extends Spinner implements ls1 {

    @SuppressLint({"ResourceType"})
    private static final int[] ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll = null;
    private final Context bpdqqiQNVROMLC1ll1l1l11;
    int dbppbdqpeLmcbs11l11;
    private final boolean ddbbbeXHXx111ll;
    private final androidx.appcompat.widget.bpdqqiQNVROMLC1ll1l1l11 dpbdpqRKAscW1lll1l;
    private dbppbdqpeLmcbs11l11 dqpdbEevAufTOvPphbjykClll1l11;
    private SpinnerAdapter dqpqqqbqQyjyB11111l1;
    final Rect pbppbpqbamJRy11l1l1;
    private bpqdqbqpviKiORjqgp1l111l11 ppbdpwWWljzmXXdHNabfWhgjl111l11;

    private static final class bpdqqiQNVROMLC1ll1l1l11 {
        static void dbpqdHhmDSIHIJiwc1ll1l1(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        }
    }

    interface dbppbdqpeLmcbs11l11 {
        CharSequence bpdqqiQNVROMLC1ll1l1l11();

        void dbppbdqpeLmcbs11l11(int i, int i2);

        boolean dbpqdHhmDSIHIJiwc1ll1l1();

        void ddbbbeXHXx111ll(int i);

        void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(ListAdapter listAdapter);

        void dismiss();

        int dpbdbdpbLwkLpObyKsq1lll1();

        void dpbdpqRKAscW1lll1l(int i);

        void dqpdbEevAufTOvPphbjykClll1l11(int i);

        void dqpqqqbqQyjyB11111l1(CharSequence charSequence);

        int pbppbpqbamJRy11l1l1();

        Drawable ppbdpwWWljzmXXdHNabfWhgjl111l11();

        void setBackgroundDrawable(Drawable drawable);
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 extends bpqdqbqpviKiORjqgp1l111l11 {
        final /* synthetic */ dbbpdqqpdVUhpQ1ll11 bdddqmITkkeGpsxVXHR1l1llll;
        final /* synthetic */ ddbbbeXHXx111ll qbdpqpstJKhhKkXrsOGvbWw1l1llll;

        dbpqdHhmDSIHIJiwc1ll1l1(dbbpdqqpdVUhpQ1ll11 dbbpdqqpdvuhpq1ll11, View view, ddbbbeXHXx111ll ddbbbexhxx111ll) {
        }

        @Override // androidx.appcompat.widget.bpqdqbqpviKiORjqgp1l111l11
        public cg1 dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // androidx.appcompat.widget.bpqdqbqpviKiORjqgp1l111l11
        @SuppressLint({"SyntheticAccessor"})
        public boolean dqqppqiKzJi1l1lll1l() {
        }
    }

    class ddbbbeXHXx111ll extends dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1 implements dbppbdqpeLmcbs11l11 {
        private final Rect bpdddqbpEtpkwNYukGjjNs1l111;
        private int bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
        ListAdapter dpbdqAKWNZAIXLyehU1lll1lll1;
        final /* synthetic */ dbbpdqqpdVUhpQ1ll11 dqbbdddqpLERmaRLiHiDpL1l1l1l;
        private CharSequence qqdbbfmUWwoYYpfYHJZdaUO1111llll;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements AdapterView.OnItemClickListener {
            final /* synthetic */ ddbbbeXHXx111ll bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ dbbpdqqpdVUhpQ1ll11 dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(ddbbbeXHXx111ll ddbbbexhxx111ll, dbbpdqqpdVUhpQ1ll11 dbbpdqqpdvuhpq1ll11) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            }
        }

        class dpbdbdpbLwkLpObyKsq1lll1 implements ViewTreeObserver.OnGlobalLayoutListener {
            final /* synthetic */ ddbbbeXHXx111ll dpbdpqRKAscW1lll1l;

            dpbdbdpbLwkLpObyKsq1lll1(ddbbbeXHXx111ll ddbbbexhxx111ll) {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
            }
        }

        class dqqppqiKzJi1l1lll1l implements PopupWindow.OnDismissListener {
            final /* synthetic */ ddbbbeXHXx111ll bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener dpbdpqRKAscW1lll1l;

            dqqppqiKzJi1l1lll1l(ddbbbeXHXx111ll ddbbbexhxx111ll, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
            }
        }

        public ddbbbeXHXx111ll(dbbpdqqpdVUhpQ1ll11 dbbpdqqpdvuhpq1ll11, Context context, AttributeSet attributeSet, int i) {
        }

        static /* synthetic */ void dqbbdddqpLERmaRLiHiDpL1l1l1l(ddbbbeXHXx111ll ddbbbexhxx111ll) {
        }

        void bdqbblVddTYAmqrWwacZmi111ll1() {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public CharSequence bpdqqiQNVROMLC1ll1l1l11() {
        }

        public int bpqpbicsQtfVpOtr11l1l() {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void dbppbdqpeLmcbs11l11(int i, int i2) {
        }

        @Override // androidx.appcompat.widget.dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1, androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(ListAdapter listAdapter) {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void dqpdbEevAufTOvPphbjykClll1l11(int i) {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void dqpqqqbqQyjyB11111l1(CharSequence charSequence) {
        }

        boolean qbpbbZWTnlDkwOgZlllll(View view) {
        }
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ dbbpdqqpdVUhpQ1ll11 dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(dbbpdqqpdVUhpQ1ll11 dbbpdqqpdvuhpq1ll11) {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    private static final class dpbdpqRKAscW1lll1l {
        static int dbpqdHhmDSIHIJiwc1ll1l1(View view) {
        }

        static int dpbdbdpbLwkLpObyKsq1lll1(View view) {
        }

        static void dpbdpqRKAscW1lll1l(View view, int i) {
        }

        static void dqqppqiKzJi1l1lll1l(View view, int i) {
        }
    }

    static class dqpdbEevAufTOvPphbjykClll1l11 extends View.BaseSavedState {
        public static final Parcelable.Creator<dqpdbEevAufTOvPphbjykClll1l11> CREATOR = null;
        boolean dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.Creator<dqpdbEevAufTOvPphbjykClll1l11> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dqpdbEevAufTOvPphbjykClll1l11 createFromParcel(Parcel parcel) {
            }

            public dqpdbEevAufTOvPphbjykClll1l11 dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public dqpdbEevAufTOvPphbjykClll1l11[] dpbdbdpbLwkLpObyKsq1lll1(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ dqpdbEevAufTOvPphbjykClll1l11[] newArray(int i) {
            }
        }

        dqpdbEevAufTOvPphbjykClll1l11(Parcelable parcelable) {
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        dqpdbEevAufTOvPphbjykClll1l11(Parcel parcel) {
        }
    }

    private static class dqpqqqbqQyjyB11111l1 implements ListAdapter, SpinnerAdapter {
        private ListAdapter bpdqqiQNVROMLC1ll1l1l11;
        private SpinnerAdapter dpbdpqRKAscW1lll1l;

        public dqpqqqbqQyjyB11111l1(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        }
    }

    private static final class dqqppqiKzJi1l1lll1l {
        static void dbpqdHhmDSIHIJiwc1ll1l1(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        }
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements dbppbdqpeLmcbs11l11, DialogInterface.OnClickListener {
        private ListAdapter bpdqqiQNVROMLC1ll1l1l11;
        androidx.appcompat.app.dpbdbdpbLwkLpObyKsq1lll1 dpbdpqRKAscW1lll1l;
        final /* synthetic */ dbbpdqqpdVUhpQ1ll11 dqpqqqbqQyjyB11111l1;
        private CharSequence ppbdpwWWljzmXXdHNabfWhgjl111l11;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(dbbpdqqpdVUhpQ1ll11 dbbpdqqpdvuhpq1ll11) {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public CharSequence bpdqqiQNVROMLC1ll1l1l11() {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void dbppbdqpeLmcbs11l11(int i, int i2) {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public boolean dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void ddbbbeXHXx111ll(int i) {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(ListAdapter listAdapter) {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void dismiss() {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public int dpbdbdpbLwkLpObyKsq1lll1() {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void dpbdpqRKAscW1lll1l(int i) {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void dqpdbEevAufTOvPphbjykClll1l11(int i) {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void dqpqqqbqQyjyB11111l1(CharSequence charSequence) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public int pbppbpqbamJRy11l1l1() {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public Drawable ppbdpwWWljzmXXdHNabfWhgjl111l11() {
        }

        @Override // androidx.appcompat.widget.dbbpdqqpdVUhpQ1ll11.dbppbdqpeLmcbs11l11
        public void setBackgroundDrawable(Drawable drawable) {
        }
    }

    public dbbpdqqpdVUhpQ1ll11(Context context, AttributeSet attributeSet) {
    }

    int dbpqdHhmDSIHIJiwc1ll1l1(SpinnerAdapter spinnerAdapter, Drawable drawable) {
    }

    void dpbdbdpbLwkLpObyKsq1lll1() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
    }

    final dbppbdqpeLmcbs11l11 getInternalPopup() {
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
    }

    @Override // p000.ls1
    public ColorStateList getSupportBackgroundTintList() {
    }

    @Override // p000.ls1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(SpinnerAdapter spinnerAdapter) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
    }

    @Override // p000.ls1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // p000.ls1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public dbbpdqqpdVUhpQ1ll11(Context context, AttributeSet attributeSet, int i) {
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public void setAdapter2(SpinnerAdapter spinnerAdapter) {
    }

    public dbbpdqqpdVUhpQ1ll11(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    public dbbpdqqpdVUhpQ1ll11(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
    }
}
