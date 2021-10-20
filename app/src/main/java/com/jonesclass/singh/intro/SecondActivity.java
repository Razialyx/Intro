package com.jonesclass.singh.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView messageTextView = findViewById(R.id.textView_message);
        Intent newIntent = getIntent();
        String message = newIntent.getStringExtra("com.jonesclass.singh.intro.MESSAGE");
        messageTextView.setText(message);

    }
}