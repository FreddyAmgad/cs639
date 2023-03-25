package com.example.conversionfreddysarwatv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.math.BigDecimal;

public class ThirdActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent=getIntent();
        double euro = intent.getDoubleExtra(SecondActivity.NULL_STRING,0);
        Float dollars= new Float(euro*1.13);
        txt =findViewById(R.id.textViewDollar);
        txt.setText( euro +" Euros are equivalent to "+"\n"+ dollars+" Dollars");
    }
}