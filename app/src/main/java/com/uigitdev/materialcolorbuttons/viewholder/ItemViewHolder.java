package com.uigitdev.materialcolorbuttons.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.materialcolorbuttons.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public CardView card_view_parent, item_color_1, item_color_2;
    public RelativeLayout item_button;
    public ImageView item_icon;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        card_view_parent = itemView.findViewById(R.id.card_view_parent);
        item_color_1 = itemView.findViewById(R.id.item_color_1);
        item_color_2 = itemView.findViewById(R.id.item_color_2);
        item_button = itemView.findViewById(R.id.item_button);
        item_icon = itemView.findViewById(R.id.item_icon);
    }
}
