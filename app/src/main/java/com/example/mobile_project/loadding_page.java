package com.example.mobile_project;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class loadding_page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loadding_page);
        ImageView gomduri = (ImageView)findViewById(R.id.iv1);
        Glide.with(this).load(R.raw.asd).into(gomduri);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);

        ProgressBar progress = (ProgressBar) findViewById(R.id.progress);
        progress.setMax(1000);


//        int value =0;
//        while(true) {
//            value += 5;
//            if(progress.getMax() <= value) { break; }
//            progress.incrementProgressBy(value);
//            try { Thread.sleep(10); }
//            catch (InterruptedException e) { e.printStackTrace(); }
//        }
    }



    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}