package com.example.thebuddyprojectbeta;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity<SPLASH_TIME_OUT> extends AppCompatActivity {
        Button entertainment;
        Button globallibraryhp;
        Button successparchment;
        Button budcommunity;

    private static int SPLASH_TIME_OUT = 3000;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entertainment = (Button) findViewById(R.id.ent);
        globallibraryhp = (Button) findViewById(R.id.gl);
        budcommunity = (Button) findViewById(R.id.bc);


        budcommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBudcommunity();
            }

            private void openBudcommunity() {
                Intent intent = new Intent(MainActivity.this, budcommunity.class);
                startActivity(intent);
            }
        });





        globallibraryhp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGloballibrary();
            }

            private void openGloballibrary() {
                Intent intent = new Intent(MainActivity.this, globallibrary.class);
                startActivity(intent);
            }
        });




        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEntertainment();
            }

            private void openEntertainment() {
                Intent intent = new Intent(MainActivity.this, entertainment.class);
                startActivity(intent);
            }
        });

        new Handler() .postDelayed(new Runnable () {
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this, MainActivity.class);
            }

        },SPLASH_TIME_OUT);



    }



            }




