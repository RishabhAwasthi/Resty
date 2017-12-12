package com.example.awasthis.resty;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by awasthi's on 12/12/2017.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private String[] dish = {"Italian", "Indian", "Australian", "South Indian", "Deccani ", "Central Indian", "Continental "
    };


    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_card, parent, false);
        MenuAdapter.MenuViewHolder viewHolder;
        viewHolder = new MenuAdapter.MenuViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(MenuAdapter.MenuViewHolder holder, int i) {
        holder.Dish.setText(dish[i]);
        holder.No.setText(String.valueOf(i+1)+".");

    }

    @Override
    public int getItemCount() {
        return dish.length;
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        private TextView Dish,No;

        public MenuViewHolder(View itemView) {
            super(itemView);
            Dish =(TextView) itemView.findViewById(R.id.dish);
            No =(TextView) itemView.findViewById(R.id.num);
        }
    }
}
