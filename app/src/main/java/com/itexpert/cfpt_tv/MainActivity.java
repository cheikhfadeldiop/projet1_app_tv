package com.itexpert.cfpt_tv;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    TextView t;
    Button b;
    Button b2;
    ImageView image;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fadel);

        t = findViewById(R.id.myText);
        b = findViewById(R.id.myButtom);
        b2 = findViewById(R.id.myButtom2);
        image = findViewById(R.id.myImage);

        t.setText("Image Afficher");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image.getVisibility() == View.VISIBLE) {
                    image.setVisibility(View.GONE);
                    t.setText("Image Cacher");
                    Toast.makeText(getApplicationContext(),
                            "Image Cacher", Toast.LENGTH_LONG).show();
                } else {
                    image.setVisibility(View.VISIBLE);
                    t.setText("Image Afficher");
                    Toast.makeText(getApplicationContext(),
                            "Image afficher", Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
            }
        });


    }
}