package com.example.zzong.Retrofit_practice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zzong.Retrofit_practice.retro.ApiObject;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    private Context context;
    private List<ApiObject> apiObjectList;

    public NewAdapter(Context context, List<ApiObject> apiObjects){
        this.context = context;
        this.apiObjectList = apiObjects;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {
        ApiObject apiObject = apiObjectList.get(i);
        newsViewHolder.title.setText(apiObject.getTitle());
        newsViewHolder.pubDate.setText(apiObject.getPubDate());
        newsViewHolder.director.setText(apiObject.getDirector());
        newsViewHolder.actor.setText(apiObject.getActor());
        newsViewHolder.UserRating.setText(apiObject.getUserRating());
    }

    @Override
    public int getItemCount() {
        return apiObjectList.size();
    }
}

