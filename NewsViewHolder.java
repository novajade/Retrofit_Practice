package com.example.zzong.Retrofit_practice;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView pubDate;
    public TextView director;
    public TextView actor;
    public TextView UserRating;

    public NewsViewHolder(@NonNull View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.post_title);
        pubDate = (TextView) itemView.findViewById(R.id.pubDate);
        director = (TextView) itemView.findViewById(R.id.director);
        actor = (TextView) itemView.findViewById(R.id.actor);
        UserRating = (TextView) itemView.findViewById(R.id.userRating);
    }
}
