package com.example.conversionfreddysarwatv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.Start);
        start.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
    });
    }
}