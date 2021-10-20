package com.jonesclass.singh.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button windowButton = findViewById(R.id.button_window);

        windowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("com.jonesclass.singh.intro.MESSAGE", "Goodbye World.");
                startActivity(startIntent);
            }
        });

        Button mapButton = findViewById(R.id.button_map);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geo = "geo:37.422, -122.084?z=23";
                Uri geoURI = Uri.parse(geo);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoURI);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }

            }
        });

        Button websiteButton = findViewById(R.id.button_website);
        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String website = "http://www.sylvaniaschools.org";
                Uri websiteURI = Uri.parse(website);
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, websiteURI);
                if (websiteIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(websiteIntent);
                }

            }
        });
    }
}