package com.uigitdev.materialcolorbuttons.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.uigitdev.materialcolorbuttons.R;
import com.uigitdev.materialcolorbuttons.model.Item;
import com.uigitdev.materialcolorbuttons.viewholder.ItemViewHolder;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<Item> arrayList;

    public ItemAdapter(Context context, ArrayList<Item> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        setBackgroundColor(((ItemViewHolder) holder).card_view_parent, arrayList.get(position).getColor2());
        setIcon(((ItemViewHolder) holder).item_icon, arrayList.get(position).getIconId());
        setColor1(((ItemViewHolder) holder).item_color_1, arrayList.get(position).getColor1());
        setColor2(((ItemViewHolder) holder).item_color_2, arrayList.get(position).getColor2());
        setOnClick(((ItemViewHolder) holder).item_button, position);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    private void setBackgroundColor(CardView cardView, String color) {
        cardView.setCardBackgroundColor(Color.parseColor(color));
    }

    private void setIcon(ImageView imageView, int iconId) {
        imageView.setBackgroundResource(iconId);
    }

    private void setColor1(CardView cardView, String color) {
        cardView.setCardBackgroundColor(Color.parseColor(color));
    }

    private void setColor2(CardView cardView, String color) {
        cardView.setCardBackgroundColor(Color.parseColor(color));
    }

    private void setOnClick(RelativeLayout relativeLayout, final int position) {
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Item position: " + position, Toast.LENGTH_LONG).show();
            }
        });
    }
}
