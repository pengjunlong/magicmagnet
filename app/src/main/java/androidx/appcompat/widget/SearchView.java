package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000.qdqdppbKBMfJAoTCZNsokLMll11l11;
import p000.qqddpcfdNhICqJAqiJ1ll1llll;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class SearchView extends LinearLayoutCompat implements qqddpcfdNhICqJAqiJ1ll1llll {
    static final dqdqbpQposEBDyDxIyyz1ll11 bqdbpBvxFUC1lll11 = null;
    private final ImageView bbdbbpdOJSuInlll111l;
    private final TextView.OnEditorActionListener bddbppbdHQMVgPvQSDhmnXZYkDh1ll111;
    private Rect bdddqmITkkeGpsxVXHR1l1llll;
    private boolean bdpdqYMMfHmzHyUIbllllll1;
    private Bundle bdqbblVddTYAmqrWwacZmi111ll1;
    private qbdpqpstJKhhKkXrsOGvbWw1l1llll bpbbpOxqjGWQAsycX11ll1l1;
    private TextWatcher bpbbpbppqsLrtEPjeDMEnOv1l1l1;
    private final WeakHashMap<String, Drawable.ConstantState> bpbqbqdqqjASPQfJSXuVkkgll1lll1ll;
    private boolean bpdddqbpEtpkwNYukGjjNs1l111;
    private final View bpdqqiQNVROMLC1ll1l1l11;
    private final int bppbpdbCeZVhQNTixBml1lll11l;
    private final Intent bpppdpppqFAXRSTHUAmVJLvH11lllll1l;
    qdqdppbKBMfJAoTCZNsokLMll11l11 bpppqdQjfPiCT111111111;
    private int bpqbbpqpqkDmeOUxxUylkHyYgWv11111;
    private boolean bpqbbqTOKdRXac1ll1l1lll;
    View.OnFocusChangeListener bpqdqbqpviKiORjqgp1l111l11;
    private final Runnable bpqpbicsQtfVpOtr11l1l;
    private int[] dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1;
    private final Drawable dbbpdqqpdVUhpQ1ll11;
    private bdddqmITkkeGpsxVXHR1l1llll dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1;
    final ImageView dbppbdqpeLmcbs11l11;
    final ImageView ddbbbeXHXx111ll;
    private ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll dddbpbpNqzZZJmSG1111l;
    private View.OnClickListener ddddbbdqIccDnEitQc1l1l1l;
    private final View ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll;
    final SearchAutoComplete dpbdpqRKAscW1lll1l;
    private CharSequence dpbdqAKWNZAIXLyehU1lll1lll1;
    SearchableInfo dqbbdddqpLERmaRLiHiDpL1l1l1l;
    private Rect dqdqbpQposEBDyDxIyyz1ll11;
    final ImageView dqpdbEevAufTOvPphbjykClll1l11;
    private final View dqpqqqbqQyjyB11111l1;
    private CharSequence dqqpbqaYiRPLeqRCYteXfDW1l111l11l;
    private final AdapterView.OnItemSelectedListener pbdbqZLBIrMLYk1l11l1ll1;
    View.OnKeyListener pbddqdbpoVvTyZPOoYl1111;
    final ImageView pbppbpqbamJRy11l1l1;
    private boolean pdpqbmApOBCmNMwnn1ll111;
    private final View ppbdpwWWljzmXXdHNabfWhgjl111l11;
    private int ppdqqzXJzQiU11ll11;
    private final View.OnClickListener ppppqdfPOyVswFHMTylxLClll1l1111;
    private int[] qbddqbdJBkudFfhX1ll1l111;
    private dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 qbdpqpstJKhhKkXrsOGvbWw1l1llll;
    private final int qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
    private Runnable qbpbbZWTnlDkwOgZlllll;
    private boolean qbpbddbpyaPAbpThgWCvm11l11l1;
    private final AdapterView.OnItemClickListener qddbbpxsbNjqxvn111ll;
    private final Intent qdqdpyALEmZFGGaahRTIU1ll11;
    private final CharSequence qppqdpppIauLKaAtRkB11111l;
    private boolean qqbqbddiRRgLpniPxlUfQzP1l1l1l;
    private CharSequence qqdbbfmUWwoYYpfYHJZdaUO1111llll;
    private boolean qqpbppebHUxqEmlGoAJWl1lll;

    public static class SearchAutoComplete extends androidx.appcompat.widget.dpbdpqRKAscW1lll1l {
        private SearchView bpdqqiQNVROMLC1ll1l1l11;
        private int dpbdpqRKAscW1lll1l;
        final Runnable dqpqqqbqQyjyB11111l1;
        private boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Runnable {
            final /* synthetic */ SearchAutoComplete dpbdpqRKAscW1lll1l;

            dbpqdHhmDSIHIJiwc1ll1l1(SearchAutoComplete searchAutoComplete) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
        }

        private int getSearchViewTextMinWidthDp() {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1() {
        }

        boolean dpbdbdpbLwkLpObyKsq1lll1() {
        }

        void dqqppqiKzJi1l1lll1l() {
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
        }

        @Override // androidx.appcompat.widget.dpbdpqRKAscW1lll1l, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        }

        @Override // android.view.View
        protected void onFinishInflate() {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
        }

        void setSearchView(SearchView searchView) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
        }
    }

    public interface bdddqmITkkeGpsxVXHR1l1llll {
        boolean dbpqdHhmDSIHIJiwc1ll1l1(int i);

        boolean dpbdbdpbLwkLpObyKsq1lll1(int i);
    }

    class bpdqqiQNVROMLC1ll1l1l11 implements View.OnLayoutChangeListener {
        final /* synthetic */ SearchView dpbdpqRKAscW1lll1l;

        bpdqqiQNVROMLC1ll1l1l11(SearchView searchView) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        }
    }

    private static class dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1 extends TouchDelegate {
        private final int bpdqqiQNVROMLC1ll1l1l11;
        private final View dbpqdHhmDSIHIJiwc1ll1l1;
        private final Rect dpbdbdpbLwkLpObyKsq1lll1;
        private final Rect dpbdpqRKAscW1lll1l;
        private final Rect dqqppqiKzJi1l1lll1l;
        private boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

        public dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(Rect rect, Rect rect2, View view) {
        }

        public void dbpqdHhmDSIHIJiwc1ll1l1(Rect rect, Rect rect2) {
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
        }
    }

    class dbppbdqpeLmcbs11l11 implements AdapterView.OnItemSelectedListener {
        final /* synthetic */ SearchView dpbdpqRKAscW1lll1l;

        dbppbdqpeLmcbs11l11(SearchView searchView) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class dbpqdHhmDSIHIJiwc1ll1l1 implements TextWatcher {
        final /* synthetic */ SearchView dpbdpqRKAscW1lll1l;

        dbpqdHhmDSIHIJiwc1ll1l1(SearchView searchView) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class ddbbbeXHXx111ll implements TextView.OnEditorActionListener {
        final /* synthetic */ SearchView dpbdpqRKAscW1lll1l;

        ddbbbeXHXx111ll(SearchView searchView) {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        }
    }

    public interface ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll {
        boolean dpbdbdpbLwkLpObyKsq1lll1();
    }

    class dpbdbdpbLwkLpObyKsq1lll1 implements Runnable {
        final /* synthetic */ SearchView dpbdpqRKAscW1lll1l;

        dpbdbdpbLwkLpObyKsq1lll1(SearchView searchView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    class dpbdpqRKAscW1lll1l implements View.OnFocusChangeListener {
        final /* synthetic */ SearchView dbpqdHhmDSIHIJiwc1ll1l1;

        dpbdpqRKAscW1lll1l(SearchView searchView) {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    private static class dqdqbpQposEBDyDxIyyz1ll11 {
        private Method dbpqdHhmDSIHIJiwc1ll1l1;
        private Method dpbdbdpbLwkLpObyKsq1lll1;
        private Method dqqppqiKzJi1l1lll1l;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        dqdqbpQposEBDyDxIyyz1ll11() {
        }

        private static void dpbdpqRKAscW1lll1l() {
        }

        void dbpqdHhmDSIHIJiwc1ll1l1(AutoCompleteTextView autoCompleteTextView) {
        }

        void dpbdbdpbLwkLpObyKsq1lll1(AutoCompleteTextView autoCompleteTextView) {
        }

        void dqqppqiKzJi1l1lll1l(AutoCompleteTextView autoCompleteTextView) {
        }
    }

    class dqpdbEevAufTOvPphbjykClll1l11 implements AdapterView.OnItemClickListener {
        final /* synthetic */ SearchView dpbdpqRKAscW1lll1l;

        dqpdbEevAufTOvPphbjykClll1l11(SearchView searchView) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    class dqpqqqbqQyjyB11111l1 implements View.OnKeyListener {
        final /* synthetic */ SearchView dpbdpqRKAscW1lll1l;

        dqpqqqbqQyjyB11111l1(SearchView searchView) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
        }
    }

    class dqqppqiKzJi1l1lll1l implements Runnable {
        final /* synthetic */ SearchView dpbdpqRKAscW1lll1l;

        dqqppqiKzJi1l1lll1l(SearchView searchView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static class pbppbpqbamJRy11l1l1 {
        static void dbpqdHhmDSIHIJiwc1ll1l1(AutoCompleteTextView autoCompleteTextView) {
        }

        static void dpbdbdpbLwkLpObyKsq1lll1(SearchAutoComplete searchAutoComplete, int i) {
        }
    }

    class ppbdpwWWljzmXXdHNabfWhgjl111l11 implements View.OnClickListener {
        final /* synthetic */ SearchView dpbdpqRKAscW1lll1l;

        ppbdpwWWljzmXXdHNabfWhgjl111l11(SearchView searchView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    static class qbddqbdJBkudFfhX1ll1l111 extends androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final Parcelable.Creator<qbddqbdJBkudFfhX1ll1l111> CREATOR = null;
        boolean dpbdpqRKAscW1lll1l;

        class dbpqdHhmDSIHIJiwc1ll1l1 implements Parcelable.ClassLoaderCreator<qbddqbdJBkudFfhX1ll1l111> {
            dbpqdHhmDSIHIJiwc1ll1l1() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            }

            public qbddqbdJBkudFfhX1ll1l111 dbpqdHhmDSIHIJiwc1ll1l1(Parcel parcel) {
            }

            public qbddqbdJBkudFfhX1ll1l111 dpbdbdpbLwkLpObyKsq1lll1(Parcel parcel, ClassLoader classLoader) {
            }

            public qbddqbdJBkudFfhX1ll1l111[] dqqppqiKzJi1l1lll1l(int i) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ qbddqbdJBkudFfhX1ll1l111 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            }
        }

        qbddqbdJBkudFfhX1ll1l111(Parcelable parcelable) {
        }

        public String toString() {
        }

        @Override // androidx.customview.view.dbpqdHhmDSIHIJiwc1ll1l1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        public qbddqbdJBkudFfhX1ll1l111(Parcel parcel, ClassLoader classLoader) {
        }
    }

    public interface qbdpqpstJKhhKkXrsOGvbWw1l1llll {
        boolean dbpqdHhmDSIHIJiwc1ll1l1(String str);

        boolean dpbdbdpbLwkLpObyKsq1lll1(String str);
    }

    public SearchView(Context context) {
    }

    private void bdpdqYMMfHmzHyUIbllllll1() {
    }

    private Intent bpdqqiQNVROMLC1ll1l1l11(String str, Uri uri, String str2, String str3, int i, String str4) {
    }

    private void bpqbbqTOKdRXac1ll1l1lll(int i) {
    }

    private void dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(Intent intent) {
    }

    private boolean dbbpdqqpdVUhpQ1ll11(int i, int i2, String str) {
    }

    private Intent ddbbbeXHXx111ll(Intent intent, SearchableInfo searchableInfo) {
    }

    private CharSequence ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(CharSequence charSequence) {
    }

    private void dpbdqAKWNZAIXLyehU1lll1lll1(boolean z) {
    }

    static boolean dqdqbpQposEBDyDxIyyz1ll11(Context context) {
    }

    private void dqpdbEevAufTOvPphbjykClll1l11() {
    }

    private Intent dqpqqqbqQyjyB11111l1(Intent intent, SearchableInfo searchableInfo) {
    }

    private int getPreferredHeight() {
    }

    private int getPreferredWidth() {
    }

    private void pbppbpqbamJRy11l1l1(View view, Rect rect) {
    }

    private void pdpqbmApOBCmNMwnn1ll111() {
    }

    private Intent ppbdpwWWljzmXXdHNabfWhgjl111l11(Cursor cursor, int i, String str) {
    }

    private void ppdqqzXJzQiU11ll11() {
    }

    private boolean qbddqbdJBkudFfhX1ll1l111() {
    }

    private boolean qbdpqpstJKhhKkXrsOGvbWw1l1llll() {
    }

    private void qbpbddbpyaPAbpThgWCvm11l11l1() {
    }

    private void qqbqbddiRRgLpniPxlUfQzP1l1l1l(boolean z) {
    }

    private void qqdbbfmUWwoYYpfYHJZdaUO1111llll(boolean z) {
    }

    private void qqpbppebHUxqEmlGoAJWl1lll() {
    }

    private void setQuery(CharSequence charSequence) {
    }

    void bbdbbpdOJSuInlll111l(int i, String str, String str2) {
    }

    public boolean bdddqmITkkeGpsxVXHR1l1llll() {
    }

    void bpbbpOxqjGWQAsycX11ll1l1() {
    }

    void bppbpdbCeZVhQNTixBml1lll11l() {
    }

    boolean bpppdpppqFAXRSTHUAmVJLvH11lllll1l(int i) {
    }

    public void bpppqdQjfPiCT111111111(CharSequence charSequence, boolean z) {
    }

    void bpqdqbqpviKiORjqgp1l111l11(CharSequence charSequence) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
    }

    void dbdqqqdddPgRkOYkEyFgiiFSohyll11ll1l1() {
    }

    void dbppbdqpeLmcbs11l11() {
    }

    @Override // p000.qqddpcfdNhICqJAqiJ1ll1llll
    public void dbpqdHhmDSIHIJiwc1ll1l1() {
    }

    boolean dddbpbpNqzZZJmSG1111l(View view, int i, KeyEvent keyEvent) {
    }

    void ddddbbdqIccDnEitQc1l1l1l() {
    }

    void dpbdpqRKAscW1lll1l() {
    }

    void dqqpbqaYiRPLeqRCYteXfDW1l111l11l() {
    }

    @Override // p000.qqddpcfdNhICqJAqiJ1ll1llll
    public void dqqppqiKzJi1l1lll1l() {
    }

    public int getImeOptions() {
    }

    public int getInputType() {
    }

    public int getMaxWidth() {
    }

    public CharSequence getQuery() {
    }

    public CharSequence getQueryHint() {
    }

    int getSuggestionCommitIconResId() {
    }

    int getSuggestionRowLayout() {
    }

    public qdqdppbKBMfJAoTCZNsokLMll11l11 getSuggestionsAdapter() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    boolean qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(int i, int i2, String str) {
    }

    protected void qdqdpyALEmZFGGaahRTIU1ll11(CharSequence charSequence) {
    }

    void qppqdpppIauLKaAtRkB11111l() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
    }

    public void setAppSearchData(Bundle bundle) {
    }

    public void setIconified(boolean z) {
    }

    public void setIconifiedByDefault(boolean z) {
    }

    public void setImeOptions(int i) {
    }

    public void setInputType(int i) {
    }

    public void setMaxWidth(int i) {
    }

    public void setOnCloseListener(ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll ddqqbqdbbwarxdgieospflbfekx1l1lll) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setOnQueryTextListener(qbdpqpstJKhhKkXrsOGvbWw1l1llll qbdpqpstjkhhkkxrsogvbww1l1llll) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnSuggestionListener(bdddqmITkkeGpsxVXHR1l1llll bdddqmitkkegpsxvxhr1l1llll) {
    }

    public void setQueryHint(CharSequence charSequence) {
    }

    public void setQueryRefinementEnabled(boolean z) {
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
    }

    public void setSubmitButtonEnabled(boolean z) {
    }

    public void setSuggestionsAdapter(qdqdppbKBMfJAoTCZNsokLMll11l11 qdqdppbkbmfjaotcznsoklmll11l11) {
    }

    public SearchView(Context context, AttributeSet attributeSet) {
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
    }
}
