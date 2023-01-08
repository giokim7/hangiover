package com.giorgiolupo.nohangover;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView drinkImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinkImg = findViewById(R.id.drink);

    }


    public void goToDrinkPage(View v){
        Intent intent = new Intent(getApplicationContext(), Drinks.class);
        startActivity(intent);
    }


}