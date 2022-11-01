package com.example.myfit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FitnessDataAdapter extends RecyclerView.Adapter<FitnessDataAdapter.ViewHolder> {
    ArrayList<FitnessData> mFitnessList;
    Context mContext;

    @NonNull
    @Override
    public FitnessDataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewHolder = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fitness, parent, false);
        return new ViewHolder(viewHolder);
    }

    @Override
    public void onBindViewHolder(@NonNull FitnessDataAdapter.ViewHolder holder, int position) {
        FitnessType type = (FitnessType) mFitnessList.get(position).getType();;
        switch (type) {
            case Run :
                holder.ivType.setImageResource(R.drawable.ic_baseline_directions_run_24);
                holder.tvType.setText("Running");
                break;
            case Walk :
                holder.ivType.setImageResource(R.drawable.ic_baseline_directions_walk_24);
                holder.tvType.setText("Walking");
                break;
            case Bicycle :
                holder.ivType.setImageResource(R.drawable.ic_baseline_directions_bike_24);
                holder.tvType.setText("Cycling");
                break;
        }

        String fitnessDate = mFitnessList.get(position).getDate();
        holder.tvDate.setText(fitnessDate);

        String fitnessPeriod = Integer.toString(mFitnessList.get(position).getMin());
        holder.tvPeriod.setText(fitnessPeriod + " min");
    }

    @Override
    public int getItemCount() {
        return mFitnessList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivType;
        TextView tvType, tvPeriod, tvDate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivType = itemView.findViewById(R.id.iv_fitness_type);
            tvType = itemView.findViewById(R.id.tv_fitness_type);
            tvDate = itemView.findViewById(R.id.tv_fitness_date);
            tvPeriod = itemView.findViewById(R.id.tv_fitness_period);
        }
    }

    public void setDummyList(ArrayList<FitnessData> fitnessList) {
        mFitnessList = fitnessList;
    }
}