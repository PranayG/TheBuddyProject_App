package com.example.thebuddyprojectbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class globallibrary extends AppCompatActivity {
    Button happy, sad,lonely, angry, confused, anxious, bored, scary, selflove, relaxation, focus, breakup,mindboggling, motivation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_globallibrary);
        happy = (Button) findViewById(R.id.happybtn);
        anxious=(Button) findViewById(R.id.anxiousbtn);
        bored = (Button) findViewById(R.id.boredbtn);
        scary = (Button) findViewById(R.id.scary);
        selflove = (Button) findViewById(R.id.selflovebtn);
        relaxation= (Button) findViewById(R.id.relaxbtn);
        focus= (Button) findViewById(R.id.focusbtn);
        breakup = (Button) findViewById(R.id.breakupbtn);
        mindboggling= (Button) findViewById(R.id.mindbgbtn);
        motivation = (Button) findViewById(R.id.motivationbtn);

        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHappy();
            }

            private void openHappy() {
                Intent intent = new Intent(globallibrary.this, happy.class);
                startActivity(intent);
            }
        });


        anxious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAnxious();
            }

            private void openAnxious() {
                Intent intent = new Intent(globallibrary.this, anxious.class);
                startActivity(intent);
            }
        });


        bored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBored();
            }

            private void openBored() {
                Intent intent = new Intent(globallibrary.this, bored.class);
                startActivity(intent);
            }
        });


        breakup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBreakup();
            }

            private void openBreakup() {
                Intent intent = new Intent(globallibrary.this, breakup.class);
                startActivity(intent);
            }
        });


        focus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFocus();
            }

            private void openFocus() {
                Intent intent = new Intent(globallibrary.this, focus.class);
                startActivity(intent);
            }
        });


        mindboggling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMb();
            }

            private void openMb() {
                Intent intent = new Intent(globallibrary.this, mindboggling.class);
                startActivity(intent);
            }
        });


        motivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMotivation();
            }

            private void openMotivation() {
                Intent intent = new Intent(globallibrary.this, motivation.class);
                startActivity(intent);
            }
        });


        relaxation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openrelx();
            }

            private void openrelx() {
                Intent intent = new Intent(globallibrary.this, relaxation.class);
                startActivity(intent);
            }
        });


        scary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openscary();
            }

            private void openscary() {
                Intent intent = new Intent(globallibrary.this, scary.class);
                startActivity(intent);
            }
        });


        selflove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensl();
            }

            private void opensl() {
                Intent intent = new Intent(globallibrary.this, selflove.class);
                startActivity(intent);
            }
        });




    }
}