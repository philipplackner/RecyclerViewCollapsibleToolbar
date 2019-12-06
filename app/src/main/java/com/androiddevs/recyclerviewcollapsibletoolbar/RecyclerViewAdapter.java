package com.androiddevs.recyclerviewcollapsibletoolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends
        RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) { }

    @Override
    public int getItemCount() {
        // add 20 items just for demonstration purpose
        return 20;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        public RecyclerViewHolder(@NonNull View itemView) { super(itemView); }
    }
}
