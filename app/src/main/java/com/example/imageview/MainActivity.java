package com.example.imageview;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {


    private Button themeButton,button1, button2;


    SharedPreferences.Editor editor;
    SharedPreferences app_preferences;
    boolean appTheme1,appTheme2;

    View view;
    int x;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        themeButton = (Button) findViewById(R.id.ThemeButtonId);
        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);
        view = this.getWindow().getDecorView();





        themeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnotheActivity.class);
                Bundle extras = new Bundle();
                if(appTheme2==true){
                extras.putInt("colorHex",R.color.colorAccent);
                intent.putExtras(extras);
                startActivity(intent);}

                if(appTheme1==true){
                    extras.putInt("colorHex",R.color.colorPrimary);
                    intent.putExtras(extras);
                    startActivity(intent);}




            }
        });

    }
    public void goRed(View v){
        view.setBackgroundResource(R.color.colorPrimary);
        appTheme1=true;
    }
    public void goPink(View v){
        view.setBackgroundResource(R.color.colorAccent);
        appTheme2=true;
    }






}
