package com.giorgiolupo.nohangover;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class DrinksOOp {
    int beerNo, wineNo, alcoholNo, waterNo;
    String drinkType;
    TextView text;
    ImageButton imgBtn;
    ConstraintLayout.LayoutParams layoutparams;


    public DrinksOOp(String drinkType, TextView textView, ImageButton imageButton){
        this.drinkType = drinkType;
        this.text = textView;
        this.imgBtn = imageButton;
    }

    public String getDrinkType(){
        return this.drinkType;
    }


    //choose button
    public void drinkIncrease(){
        switch (drinkType) {
            case "beer": {
                beerNo++;
                text.setText(String.valueOf(beerNo));
                plusLine();
            }
            case "wine": {
                wineNo++;
                text.setText(String.valueOf(wineNo));
                plusLine();
            }
            case "alcohol": {
                alcoholNo++;
                text.setText(String.valueOf(alcoholNo));
                plusLine();
            }
        }


    }

    //increase line
    public void plusLine() {
        layoutparams = (ConstraintLayout.LayoutParams) imgBtn.getLayoutParams();
        layoutparams.width += 20;
        imgBtn.setLayoutParams(layoutparams);
        imgBtn.setScaleType(ImageView.ScaleType.FIT_XY);

    }




}

