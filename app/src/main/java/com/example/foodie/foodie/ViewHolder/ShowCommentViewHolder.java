package com.example.foodie.foodie.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.foodie.foodie.R;

public class ShowCommentViewHolder extends RecyclerView.ViewHolder{
    public TextView txtUserPhone,txtComment;
    public RatingBar ratingBar;
    public ShowCommentViewHolder(View itemView) {
        super(itemView);
        txtComment = (TextView)itemView.findViewById(R.id.txtComment);
        txtUserPhone = (TextView)itemView.findViewById(R.id.txtUserPhone);
        ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
    }
}
