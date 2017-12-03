package com.example.awasthis.resty;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by awasthi's on 12/3/2017.
 */

public class CuisineRecyclerAdapter extends RecyclerView.Adapter<CuisineRecyclerAdapter.CuisineViewHolder> {



       private Context context;


private int[] images = {R.drawable.dominos,
        R.drawable.chutney,
        R.drawable.kfc,
        R.drawable.swagat,
        R.drawable.paradise,
        R.drawable.bawarchi,
        R.drawable.taj


        };

private String[] cuisine = {"Italian", "Indian", "Australian", "South Indian", "Deccani ", "Central Indian", "Continental "
        };





    @Override
public CuisineRecyclerAdapter.CuisineViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
        .inflate(R.layout.cuisine_card, viewGroup, false);
        CuisineRecyclerAdapter.CuisineViewHolder viewHolder;
        viewHolder = new CuisineViewHolder(v);
        return viewHolder;
        }

    @Override
    public void onBindViewHolder(CuisineRecyclerAdapter.CuisineViewHolder holder, int i) {
        holder.itemImage.setImageResource(images[i]);
          holder.itemCuisine.setText(cuisine[i]);

    }





@Override
public int getItemCount() {
        return cuisine.length;
        }

class CuisineViewHolder extends RecyclerView.ViewHolder {

    public int currentItem;
    public ImageView itemImage;

    public TextView itemRating;
    public TextView itemName,itemCuisine;

    public CuisineViewHolder(View itemView) {
        super(itemView);


        itemImage = (ImageView) itemView.findViewById(R.id.cuisine_bg);

        itemCuisine = (TextView) itemView.findViewById(R.id.cuisine_name);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                context = v.getContext();
                // Intent i = new Intent(context, IssuesActivity.class);
                // i.putExtra("Issue",names[position]);
                // Bundle extras = new Bundle();
                Toast.makeText(context,cuisine[position],Toast.LENGTH_SHORT).show();
               IndianCuisineFragment indiancuisineFragment = new IndianCuisineFragment();
                FragmentManager manager = ((MainActivity)context).getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.mainframe, indiancuisineFragment).commit();


                // extras.putString("Issue", names[position]);
                // extras.putString("Price", details[position]);
                // i.putExtras(extras);
                // context.startActivity(i);

            }
        });

    }
}
}
