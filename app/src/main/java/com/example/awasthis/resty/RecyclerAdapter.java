package com.example.awasthis.resty;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {



   static Context context;


    private static String[] ratings = {"4", "3.5", "4.5", "3", "3.5", "4.7", "5"
    };

    private static int[] images = {R.drawable.dominos,
            R.drawable.chutney,
            R.drawable.kfc,
            R.drawable.swagat,
            R.drawable.paradise,
            R.drawable.bawarchi,
            R.drawable.taj


    };

    private static String[] names = {"Dominos", "Chutneys", "KFC", "Swagat", "Paradise ", "Bawarchi", "Taj Banjara "
    };
    private static String[] cuisine = {"Italian", "Indian", "Australian", "South Indian", "Deccani ", "Central Indian", "Continental "
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

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public int currentItem;
        public ImageView itemImage;

        public TextView itemRating;
        public TextView itemName,itemCuisine;

        public ViewHolder(View itemView) {
            super(itemView);


            itemImage = (ImageView) itemView.findViewById(R.id.item_image);

            itemRating = (TextView) itemView.findViewById(R.id.rating);
            itemName = (TextView) itemView.findViewById(R.id.name);
            itemCuisine = (TextView) itemView.findViewById(R.id.cuisine);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    context = v.getContext();
                   // Intent i = new Intent(context, IssuesActivity.class);
                    // i.putExtra("Issue",names[position]);
                   // Bundle extras = new Bundle();
                    Toast.makeText(context,names[position],Toast.LENGTH_SHORT).show();



                   // extras.putString("Issue", names[position]);
                   // extras.putString("Price", details[position]);
                   // i.putExtras(extras);
                   // context.startActivity(i);

                }
            });

        }
    }
}