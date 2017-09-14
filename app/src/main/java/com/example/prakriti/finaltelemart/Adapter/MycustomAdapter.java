package com.example.prakriti.finaltelemart.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prakriti.finaltelemart.Food_Activity;
import com.example.prakriti.finaltelemart.Pojo.MyData;
import com.example.prakriti.finaltelemart.Pojo.ProductObject;
import com.example.prakriti.finaltelemart.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Prakriti on 9/1/2017.
 */

public class MycustomAdapter extends RecyclerView.Adapter<MycustomAdapter.ViewHolder> {

    private Context context;
    private List<MyData> my_data;
    private List<ProductObject> productList;

    public MycustomAdapter(Context context, List<MyData> my_data) {
        this.context = context;
        this.my_data = my_data;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);


        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        MyData productObject = my_data.get(position);
        //  int imageRes = getResourceId(context, productObject.getImage(), "drawable", context.getPackageName());
        // holder.imageview.setImageResource(imageRes);
        holder.name1.setText(productObject.getName());
        holder.description1.setText(productObject.getDescription());
     /*   Picasso.with(context).load(productObject.getImage()).into(holder.imageview1);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ProductObject one = productList.get(position);
                Intent intent = new Intent(context, Food_Activity.class);
         //       intent.putExtra("yellow", one);
                context.startActivity(intent);
                Log.e("donkey", "monkey");
            }
        });*/

    }

    @Override
    public int getItemCount() {
        return my_data.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name1, description1;
        ImageView imageview1;


        public ViewHolder(View itemV) {
            super(itemV);
            name1 = (TextView) itemV.findViewById(R.id.name);
            description1 = (TextView) itemV.findViewById(R.id.description);
          //  imageview1 = (ImageView)itemV.findViewById(R.id.imageview);

        }
    }}

  /*  public static int getResourceId(Context context, String pVariableName, String pResourcename, String pPackageName) throws RuntimeException {
        try {
            return context.getResources().getIdentifier(pVariableName, pResourcename, pPackageName);
        } catch (Exception e) {
            throw new RuntimeException("Error getting Resource ID.", e);
        }
    }


}*/
