package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    private TextView headingText,detailsText;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        headingText = findViewById(R.id.headingTextId);
        detailsText = findViewById(R.id.detailsTextId);
        imageView = findViewById(R.id.detailsImageId);
        String value = getIntent().getStringExtra("socialName");
        if(value.equals("Facebook"))
        {
            imageView.setImageResource(R.drawable.facebook);
            headingText.setText("Facebook Details");
            setTitle("Facebook");
            detailsText.setText(R.string.facebook);
        } else if(value.equals("Twitter"))
        {
            setTitle("Twitter");
            headingText.setText("Twitter Details");
            imageView.setImageResource(R.drawable.twitter);
            detailsText.setText(R.string.twitter);

        }
        else if(value.equals("Snapchat"))
        {
            headingText.setText("Snapchat Details");
            setTitle("Snapchat");
            imageView.setImageResource(R.drawable.snapchat);
            detailsText.setText(R.string.snapchat);
        }
        else if(value.equals("WhatsApp"))
        {
            headingText.setText("WhatsApp Details");
            setTitle("WhatsApp");
            imageView.setImageResource(R.drawable.whatsapp);
            detailsText.setText(R.string.whatsapp);
        }
        else if(value.equals("Instagram"))
        {
            headingText.setText("Instagram Details");
            setTitle("Instagram");
            imageView.setImageResource(R.drawable.instagram);
            detailsText.setText(R.string.instagram);

        }
        else if(value.equals("Tinder"))
        {
            headingText.setText("Tinder Details");
            setTitle("Tinder");
            imageView.setImageResource(R.drawable.tinder);
            detailsText.setText(R.string.tinder);
        }
        else if(value.equals("Telegram"))
        {
            headingText.setText("Telegram Details");
            setTitle("Telegram");
            imageView.setImageResource(R.drawable.telegram);
            detailsText.setText(R.string.telegram);
        }

    }
}