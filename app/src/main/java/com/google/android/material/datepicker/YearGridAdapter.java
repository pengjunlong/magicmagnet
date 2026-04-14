package com.google.android.material.datepicker;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
class YearGridAdapter extends RecyclerView.ddbbbeXHXx111ll<ViewHolder> {
    private final MaterialCalendar<?> materialCalendar;

    /* renamed from: com.google.android.material.datepicker.YearGridAdapter$1 */
    class ViewOnClickListenerC03491 implements View.OnClickListener {
        final /* synthetic */ YearGridAdapter this$0;
        final /* synthetic */ int val$year;

        ViewOnClickListenerC03491(YearGridAdapter yearGridAdapter, int i) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static class ViewHolder extends RecyclerView.bpqbbqTOKdRXac1ll1l1lll {
        final TextView textView;

        ViewHolder(TextView textView) {
        }
    }

    YearGridAdapter(MaterialCalendar<?> materialCalendar) {
    }

    static /* synthetic */ MaterialCalendar access$000(YearGridAdapter yearGridAdapter) {
    }

    private View.OnClickListener createYearClickListener(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ddbbbeXHXx111ll
    public int getItemCount() {
    }

    int getPositionForYear(int i) {
    }

    int getYearForPosition(int i) {
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
