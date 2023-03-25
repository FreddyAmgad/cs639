package com.example.conversionfreddysarwatv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
public static final String NULL_STRING="@/NULLSTRING";
Button convert;
EditText editText;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        convert= findViewById(R.id.Convert);
    editText=findViewById(R.id.editTextEuro);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                Double euro = Double.parseDouble(editText.getText().toString());
                intent.putExtra(NULL_STRING,euro);
                startActivity(intent);
            }
        });
    }
}