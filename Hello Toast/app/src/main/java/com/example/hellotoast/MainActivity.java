package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
View view;
int counter=0;        TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (TextView) findViewById(R.id.show_count);//what if we had many textview?

    }

    public void showToast(View view) {
        Toast toast=Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);//setting toast value
        toast.show();//showing the setted value
    }

    @SuppressLint("SuspiciousIndentation")
    public void Increment(View view) {
        counter++;
        if(display!=null)
        display.setText(Integer.toString(counter));
    }
}