package com.example.awasthis.resty;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {



    Context context;
    private String[] waitTime={"1 hr","1.5 hr","2 hr","1.25 hr","1 hr","1.5 hr","2 hr"};


    private  String[] ratings = {"4", "3.5", "4.5", "3", "3.5", "4.7", "5"
    };

    private  int[] images = {R.drawable.dominos,
            R.drawable.chutney,
            R.drawable.kfc,
            R.drawable.swagat,
            R.drawable.paradise,
            R.drawable.bawarchi,
            R.drawable.taj


    };

    private  String[] names = {"Dominos", "Chutneys", "KFC", "Swagat", "Paradise ", "Bawarchi", "Taj Banjara "
    };
    private  String[] cuisine = {"Italian", "Indian", "Australian", "South Indian", "Deccani ", "Central Indian", "Continental "
    };


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.home_card, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.itemRating.setText(ratings[i]);
        viewHolder.itemImage.setImageResource(images[i]);
        viewHolder.itemName.setText(names[i]);
        viewHolder.itemCuisine.setText(cuisine[i]);
        viewHolder.itemWait.setText(waitTime[i]);



    }

    @Override
    public int getItemCount() {
        return names.length;
    }

     class ViewHolder extends RecyclerView.ViewHolder {

        public int currentItem;
        public ImageView itemImage;

        public TextView itemRating;
        public TextView itemName,itemCuisine;
         public TextView itemWait;

        public ViewHolder(View itemView) {
            super(itemView);


            itemImage = (ImageView) itemView.findViewById(R.id.item_image);

            itemRating = (TextView) itemView.findViewById(R.id.rating);
            itemName = (TextView) itemView.findViewById(R.id.name);
            itemCuisine = (TextView) itemView.findViewById(R.id.cuisine);
            itemWait = (TextView) itemView.findViewById(R.id.wait_time);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    context = v.getContext();
                    Intent i = new Intent(context, DetailsActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("Name", names[position]);
                    extras.putString("Image",String.valueOf(images[position]));
                    i.putExtras(extras);
                    context.startActivity(i);
                    //Toast.makeText(context,names[position],Toast.LENGTH_SHORT).show();


                }
            });

        }
    }
}