package com.example.worldclock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
public TextClock textClock;
public ImageView photo;
public TextView name;
public Button twentyFourButton;
public Button twelveButton;


public ConstraintLayout sydney;
public ConstraintLayout hongkong;
public ConstraintLayout tokyo;
public ConstraintLayout mumbai;
public ConstraintLayout istanbul;
public ConstraintLayout moscow;
public ConstraintLayout london;
public ConstraintLayout newyork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sydney = findViewById(R.id.cityone);
        photo = sydney.findViewById(R.id.cityphoto);
        photo.setImageResource(R.drawable.sydney);
        name = sydney.findViewById(R.id.cityname);
        name.setText(getString(R.string.sydney));
        textClock = sydney.findViewById(R.id.citytime);
        textClock.setTimeZone("Australia/Sydney");



        hongkong = findViewById(R.id.citytwo);
        photo = hongkong.findViewById(R.id.cityphoto);
        photo.setImageResource(R.drawable.hongkong);
        name = hongkong.findViewById(R.id.cityname);
        name.setText(getString(R.string.hongkong));
        textClock = hongkong.findViewById(R.id.citytime);
        textClock.setTimeZone("Hongkong");


        tokyo = findViewById(R.id.citythree);
        photo = tokyo.findViewById(R.id.cityphoto);
        photo.setImageResource(R.drawable.tokyo);
        name = tokyo.findViewById(R.id.cityname);
        name.setText(getString(R.string.tokyo));
        textClock = tokyo.findViewById(R.id.citytime);
        textClock.setTimeZone("Asia/Tokyo");

        mumbai = findViewById(R.id.cityfour);
        photo = mumbai.findViewById(R.id.cityphoto);
        photo.setImageResource(R.drawable.mumbai);
        name = mumbai.findViewById(R.id.cityname);
        name.setText(getString(R.string.mumbai));
        textClock = mumbai.findViewById(R.id.citytime);
        textClock.setTimeZone("Asia/Calcutta");


        istanbul = findViewById(R.id.cityfive);
        photo = istanbul.findViewById(R.id.cityphoto);
        photo.setImageResource(R.drawable.istanbul);
        name = istanbul.findViewById(R.id.cityname);
        name.setText(getString(R.string.istanbul));
        textClock = istanbul.findViewById(R.id.citytime);
        textClock.setTimeZone("Asia/Istanbul");

        moscow = findViewById(R.id.citysix);
        photo = moscow.findViewById(R.id.cityphoto);
        photo.setImageResource(R.drawable.moscow);
        name = moscow.findViewById(R.id.cityname);
        name.setText(getString(R.string.moscow));
        textClock = moscow.findViewById(R.id.citytime);
        textClock.setTimeZone("Europe/Moscow");


        london = findViewById(R.id.cityseven);
        photo = london.findViewById(R.id.cityphoto);
        photo.setImageResource(R.drawable.london);
        name = london.findViewById(R.id.cityname);
        name.setText(getString(R.string.london));
        textClock = london.findViewById(R.id.citytime);
        textClock.setTimeZone("Europe/London");

        newyork = findViewById(R.id.cityeight);
        photo = newyork.findViewById(R.id.cityphoto);
        photo.setImageResource(R.drawable.newyork);
        name = newyork.findViewById(R.id.cityname);
        name.setText(getString(R.string.newyork));
        textClock = newyork.findViewById(R.id.citytime);
        textClock.setTimeZone("America/New_York");



        twentyFourButton = findViewById(R.id.twentyfourtoggle);
        twentyFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textClock = sydney.findViewById(R.id.citytime);
                textClock.setFormat12Hour("kk:mm");
                textClock = hongkong.findViewById(R.id.citytime);
                textClock.setFormat12Hour("kk:mm");
                textClock = tokyo.findViewById(R.id.citytime);
                textClock.setFormat12Hour("kk:mm");
                textClock = mumbai.findViewById(R.id.citytime);
                textClock.setFormat12Hour("kk:mm");
                textClock = istanbul.findViewById(R.id.citytime);
                textClock.setFormat12Hour("kk:mm");
                textClock = moscow.findViewById(R.id.citytime);
                textClock.setFormat12Hour("kk:mm");
                textClock = london.findViewById(R.id.citytime);
                textClock.setFormat12Hour("kk:mm");
                textClock = newyork.findViewById(R.id.citytime);
                textClock.setFormat12Hour("kk:mm");

                twentyFourButton.setBackgroundColor(getColor(R.color.darkorange));
                twelveButton.setBackgroundColor(getColor(R.color.lightorange));
            }
        }

        );

        twelveButton = findViewById(R.id.twelvetoggle);

        twelveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textClock = sydney.findViewById(R.id.citytime);
                textClock.setFormat12Hour("h:mm a");
                textClock = hongkong.findViewById(R.id.citytime);
                textClock.setFormat12Hour("h:mm a");
                textClock = tokyo.findViewById(R.id.citytime);
                textClock.setFormat12Hour("h:mm a");
                textClock = mumbai.findViewById(R.id.citytime);
                textClock.setFormat12Hour("h:mm a");
                textClock = istanbul.findViewById(R.id.citytime);
                textClock.setFormat12Hour("h:mm a");
                textClock = moscow.findViewById(R.id.citytime);
                textClock.setFormat12Hour("h:mm a");
                textClock = london.findViewById(R.id.citytime);
                textClock.setFormat12Hour("h:mm a");
                textClock = newyork.findViewById(R.id.citytime);
                textClock.setFormat12Hour("h:mm a");

                twentyFourButton.setBackgroundColor(getColor(R.color.lightorange));
                twelveButton.setBackgroundColor(getColor(R.color.darkorange));
            }
        });


    }
}
