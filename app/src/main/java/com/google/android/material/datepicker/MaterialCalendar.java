package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import p000.dqqpbqaYiRPLeqRCYteXfDW1l111l11l;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    static final Object MONTHS_VIEW_GROUP_TAG = null;
    static final Object NAVIGATION_NEXT_TAG = null;
    static final Object NAVIGATION_PREV_TAG = null;
    static final Object SELECTOR_TOGGLE_TAG = null;
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private CalendarConstraints calendarConstraints;
    private CalendarSelector calendarSelector;
    private CalendarStyle calendarStyle;
    private Month current;
    private DateSelector<S> dateSelector;
    private View dayFrame;
    private DayViewDecorator dayViewDecorator;
    private View monthNext;
    private View monthPrev;
    private RecyclerView recyclerView;
    private int themeResId;
    private View yearFrame;
    private RecyclerView yearSelector;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$1 */
    class C03241 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ MaterialCalendar this$0;

        C03241(MaterialCalendar materialCalendar) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$10, reason: invalid class name */
    class AnonymousClass10 implements View.OnClickListener {
        final /* synthetic */ MaterialCalendar this$0;
        final /* synthetic */ MonthsPagerAdapter val$monthsPagerAdapter;

        AnonymousClass10(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$11, reason: invalid class name */
    class AnonymousClass11 implements Runnable {
        final /* synthetic */ MaterialCalendar this$0;
        final /* synthetic */ int val$position;

        AnonymousClass11(MaterialCalendar materialCalendar, int i) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$2 */
    class C03252 extends SmoothCalendarLayoutManager {
        final /* synthetic */ MaterialCalendar this$0;
        final /* synthetic */ int val$orientation;

        C03252(MaterialCalendar materialCalendar, Context context, int i, boolean z, int i2) {
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11, int[] iArr) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$3 */
    class C03263 implements OnDayClickListener {
        final /* synthetic */ MaterialCalendar this$0;

        C03263(MaterialCalendar materialCalendar) {
        }

        @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
        public void onDayClick(long j) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$4 */
    class C03274 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ MaterialCalendar this$0;

        C03274(MaterialCalendar materialCalendar) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$5 */
    class C03285 extends RecyclerView.dqdqbpQposEBDyDxIyyz1ll11 {
        private final Calendar endItem;
        private final Calendar startItem;
        final /* synthetic */ MaterialCalendar this$0;

        C03285(MaterialCalendar materialCalendar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.dqdqbpQposEBDyDxIyyz1ll11
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.bpqdqbqpviKiORjqgp1l111l11 bpqdqbqpvikiorjqgp1l111l11) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$6 */
    class C03296 extends androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1 {
        final /* synthetic */ MaterialCalendar this$0;

        C03296(MaterialCalendar materialCalendar) {
        }

        @Override // androidx.core.view.dbpqdHhmDSIHIJiwc1ll1l1
        public void onInitializeAccessibilityNodeInfo(View view, dqqpbqaYiRPLeqRCYteXfDW1l111l11l dqqpbqayirpleqrcytexfdw1l111l11l) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$7 */
    class C03307 extends RecyclerView.bppbpdbCeZVhQNTixBml1lll11l {
        final /* synthetic */ MaterialCalendar this$0;
        final /* synthetic */ MaterialButton val$monthDropSelect;
        final /* synthetic */ MonthsPagerAdapter val$monthsPagerAdapter;

        C03307(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter, MaterialButton materialButton) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.bppbpdbCeZVhQNTixBml1lll11l
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.bppbpdbCeZVhQNTixBml1lll11l
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$8 */
    class ViewOnClickListenerC03318 implements View.OnClickListener {
        final /* synthetic */ MaterialCalendar this$0;

        ViewOnClickListenerC03318(MaterialCalendar materialCalendar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$9 */
    class ViewOnClickListenerC03329 implements View.OnClickListener {
        final /* synthetic */ MaterialCalendar this$0;
        final /* synthetic */ MonthsPagerAdapter val$monthsPagerAdapter;

        ViewOnClickListenerC03329(MaterialCalendar materialCalendar, MonthsPagerAdapter monthsPagerAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    static final class CalendarSelector {
        private static final /* synthetic */ CalendarSelector[] $VALUES = null;
        public static final CalendarSelector DAY = null;
        public static final CalendarSelector YEAR = null;

        private CalendarSelector(String str, int i) {
        }

        public static CalendarSelector valueOf(String str) {
        }

        public static CalendarSelector[] values() {
        }
    }

    interface OnDayClickListener {
        void onDayClick(long j);
    }

    static /* synthetic */ RecyclerView access$000(MaterialCalendar materialCalendar) {
    }

    static /* synthetic */ CalendarConstraints access$100(MaterialCalendar materialCalendar) {
    }

    static /* synthetic */ DateSelector access$200(MaterialCalendar materialCalendar) {
    }

    static /* synthetic */ RecyclerView access$300(MaterialCalendar materialCalendar) {
    }

    static /* synthetic */ CalendarStyle access$400(MaterialCalendar materialCalendar) {
    }

    static /* synthetic */ View access$500(MaterialCalendar materialCalendar) {
    }

    static /* synthetic */ Month access$602(MaterialCalendar materialCalendar, Month month) {
    }

    private void addActionsToMonthNavigation(View view, MonthsPagerAdapter monthsPagerAdapter) {
    }

    private RecyclerView.dqdqbpQposEBDyDxIyyz1ll11 createItemDecoration() {
    }

    static int getDayHeight(Context context) {
    }

    private static int getDialogPickerHeight(Context context) {
    }

    public static <T> MaterialCalendar<T> newInstance(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
    }

    private void postSmoothRecyclerViewScroll(int i) {
    }

    private void setUpForAccessibility() {
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(OnSelectionChangedListener<S> onSelectionChangedListener) {
    }

    CalendarConstraints getCalendarConstraints() {
    }

    CalendarStyle getCalendarStyle() {
    }

    Month getCurrentMonth() {
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public DateSelector<S> getDateSelector() {
    }

    LinearLayoutManager getLayoutManager() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    void setCurrentMonth(Month month) {
    }

    void setSelector(CalendarSelector calendarSelector) {
    }

    void toggleVisibleSelector() {
    }

    public static <T> MaterialCalendar<T> newInstance(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
    }
}
