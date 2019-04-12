package com.example.imageview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class AnotheActivity extends AppCompatActivity  {
    MainActivity activity;
    ImageView imageView;
    View view;
    TextView textView;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anothe);

        Bundle bundle= getIntent().getExtras();
        view = this.getWindow().getDecorView();
        int colorhex = bundle.getInt("colorHex");
        view.setBackgroundResource(colorhex);








    }




}
