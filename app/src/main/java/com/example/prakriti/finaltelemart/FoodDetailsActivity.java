package com.example.prakriti.finaltelemart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.prakriti.finaltelemart.Pojo.ProductObject;


public class FoodDetailsActivity extends AppCompatActivity {

    ImageView imageViewdetails;
    ImageView imageView;

    TextView textView_name, textView_desc, textView_price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_food_details);
        Log.e("donkey", "bhaxa");
        final ProductObject productObject = (ProductObject) getIntent().getSerializableExtra("yellow");

        imageViewdetails = (ImageView) findViewById(R.id.imagedetails);




        imageView = (ImageView) findViewById(R.id.image);

        textView_name = (TextView) findViewById(R.id.tv_name);
        textView_desc = (TextView) findViewById(R.id.tv_desc);
        textView_price = (TextView) findViewById(R.id.tv_price);


        Glide.with(FoodDetailsActivity.this).load(productObject.getImage()).into(imageViewdetails);

        textView_desc.setText(productObject.getDescription());
        textView_price.setText(productObject.getPrice());
        textView_name.setText(productObject.getName());
    }
}
