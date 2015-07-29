package com.moringaschool.alienske.appintroexample;

import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by USER on 29/07/2015.
 */
public class MyIntro extends AppIntro {

    @Override
    public void init(Bundle savedInstanceState){

        addSlide(AppIntroFragment.newInstance("Title here", "Description here...\nYeah, I've added this fragment programmatically",
                R.drawable.img1, R.color.material_blue_grey_800));
        addSlide(AppIntroFragment.newInstance("Title here", "Description here...\nYeah, I've added this fragment programmatically",
                R.drawable.img2, R.color.material_blue_grey_800));
        addSlide(AppIntroFragment.newInstance("Title here", "Description here...\nYeah, I've added this fragment programmatically",
                R.drawable.img3, R.color.material_blue_grey_800));

        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        showSkipButton(true);
        showDoneButton(true);

        // Turn vibration on and set intensity
        // NOTE: you will probably need to ask VIBRATE permesssion in Manifest
        setVibrate(true);
        setVibrateIntensity(30);

    }

    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
    }
}
