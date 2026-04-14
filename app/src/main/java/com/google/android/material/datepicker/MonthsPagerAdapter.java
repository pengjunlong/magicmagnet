package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class MonthsPagerAdapter extends RecyclerView.ddbbbeXHXx111ll<ViewHolder> {
    private final CalendarConstraints calendarConstraints;
    private final DateSelector<?> dateSelector;
    private final DayViewDecorator dayViewDecorator;
    private final int itemHeight;
    private final MaterialCalendar.OnDayClickListener onDayClickListener;

    /* renamed from: com.google.android.material.datepicker.MonthsPagerAdapter$1 */
    class C03421 implements AdapterView.OnItemClickListener {
        final /* synthetic */ MonthsPagerAdapter this$0;
        final /* synthetic */ MaterialCalendarGridView val$monthGrid;

        C03421(MonthsPagerAdapter monthsPagerAdapter, MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    public static class ViewHolder extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
        final MaterialCalendarGridView monthGrid;
        final TextView monthTitle;

        ViewHolder(LinearLayout linearLayout, boolean z) {
        }
    }

    MonthsPagerAdapter(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.OnDayClickListener onDayClickListener) {
    }

    static /* synthetic */ MaterialCalendar.OnDayClickListener access$000(MonthsPagerAdapter monthsPagerAdapter) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
    public int getItemCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
    public long getItemId(int i) {
    }

    Month getPageMonth(int i) {
    }

    CharSequence getPageTitle(int i) {
    }

    int getPosition(Month month) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
    /* renamed from: onCreateViewHolder, reason: avoid collision after fix types in other method */
    public ViewHolder onCreateViewHolder2(ViewGroup viewGroup, int i) {
    }
}
