package com.giorgiolupo.nohangover;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class Water {
    String drinkType;
    ConstraintLayout.LayoutParams layoutparams;
    TextView text;
    ImageButton imageButton;
    int waterNo=0;
    ImageButton waterLine;
    TextView waterText;

    public Water(ImageButton waterLine, TextView waterText){
        this.waterLine = waterLine;
        this.waterText = waterText;
    }

    public String getDrinkType(){
        return this.drinkType;
    }

    public int getWaterNo(){
        return this.waterNo;
    }

    public ImageButton getImageButton() {
        return imageButton;
    }

    public TextView getText() {
        return text;
    }

    //increase water
    public void setUpWater(Integer waterIncrease) {
        waterNo++;
        waterText.setText(String.valueOf(waterNo));
        layoutparams = (ConstraintLayout.LayoutParams) this.waterLine.getLayoutParams();
        layoutparams.width = 20*(waterNo);
        this.waterLine.setLayoutParams(layoutparams);
        this.waterLine.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public void diminishWater(){
        waterNo--;
        waterText.setText(String.valueOf(waterNo));
        layoutparams = (ConstraintLayout.LayoutParams) this.waterLine.getLayoutParams();
        layoutparams.width = 20*(waterNo);
        this.waterLine.setLayoutParams(layoutparams);
        this.waterLine.setScaleType(ImageView.ScaleType.FIT_XY);
    }


}
