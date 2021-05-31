package com.example.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.shoppingcart.views.MainActivity;

public class Splashh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashh);

        getSupportActionBar().hide();

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent geserLayar = new Intent(Splashh.this, MainActivity.class);
                    startActivity(geserLayar);
                    finish();
                }
            }
        };thread.start();
    }
}