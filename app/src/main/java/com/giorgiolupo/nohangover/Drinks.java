package com.giorgiolupo.nohangover;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Drinks extends AppCompatActivity {

    TextToSpeech tts;
    ImageButton beerLine, wineLine, alcoholLine, waterLine, foodLine;
    TextView beerTxt, wineTxt, waterTxt, alcoholTxt, foodTxt;
    ImageView beerImg, wineImg, alcoholImg, waterImg;
    Button reset;

    //oop
    DrinksOOp beer;
    DrinksOOp wine;
    DrinksOOp alcohol;
    Water water;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drinks);

        //set get variables
        beerLine = (ImageButton) findViewById(R.id.beer);
        wineLine = (ImageButton) findViewById(R.id.wine);
        alcoholLine = (ImageButton) findViewById(R.id.alcohol);
        waterLine = (ImageButton) findViewById(R.id.water);
        beerTxt = findViewById(R.id.beerTxt);
        wineTxt = findViewById(R.id.wineTxt);
        alcoholTxt = findViewById(R.id.alcoholTxt);
        waterTxt = findViewById(R.id.waterTxt);
        beerImg = findViewById(R.id.beerImg);
        wineImg = findViewById(R.id.wineImg);
        alcoholImg = findViewById(R.id.alcoholImg);
        waterImg= findViewById(R.id.waterImg);
        reset = findViewById(R.id.reset);

        //oop
        beer = new DrinksOOp("beer", beerTxt, beerLine);
        wine = new DrinksOOp("wine", wineTxt, wineLine);
        alcohol = new DrinksOOp("alcohol", alcoholTxt, alcoholLine);
        water = new Water(waterLine, waterTxt);

        //tts
        // tts = new TextToSpeech(this, this);

        //click
        beerImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beer.drinkIncrease();
                water.setUpWater(10);
            }
        });
        wineImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wine.drinkIncrease();
                water.setUpWater(20);
            }
        });
        alcoholImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alcohol.drinkIncrease();
                water.setUpWater(30);
            }
        });
        waterImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                water.diminishWater();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent refresh= new Intent(getApplicationContext(), Drinks.class);
                startActivity(refresh);
            }
        });




    }










   /* //reset
    public void reset(View v, int drinkNo, ImageButton imageButton) {
        drinkNo = 0;
        resetLine(imageButton);

    }

    //tts
    private void speech(){
        if(alcoholNo>=10) speakOut();
    }
*//*
    @Override
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS) {
            int result = tts.setLanguage(Locale.US);
            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            }

        } else {
            Log.e("TTS", "Initilization Failed!");
        }

    }

    @Override
    public void onDestroy() {
// Don't forget to shutdown tts!
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }


    private void speakOut() {
        tts.speak("Stop Drinking You Idiot", TextToSpeech.QUEUE_FLUSH, null);
    }
*/

}

