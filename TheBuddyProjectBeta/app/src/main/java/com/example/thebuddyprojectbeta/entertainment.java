package com.example.thebuddyprojectbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class entertainment extends AppCompatActivity {
    private WebView myWebView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment2);

    }
     public void secretbtn (View view){
        Intent secretIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lobaks.com/#"));
        startActivity(secretIntent);
}
    public void brainbtn (View view){
        Intent brainIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lumosity.com/en/"));
        startActivity(brainIntent); }

    public void moviebtn (View view){
        Intent movieIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(" https://pickamovieforme.com"));
        startActivity(movieIntent);
    }
    public void bookbtn (View view){
        Intent bookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.whichbook.net/"));
        startActivity(bookIntent);
    }
    public void debatebtn (View view){
        Intent debateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(" https://www.kialo.com/tour"));
        startActivity(debateIntent);
    }
    public void diybtn (View view){
        Intent diyIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("//www.apartmenttherapy.com/"));
        startActivity(diyIntent);
    }
    public void potterbtn (View view){
        Intent potterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(" https://www.wizardingworld.com/ "));
        startActivity(potterIntent);
    }
    public void magicbtn (View view){
        Intent magicIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.goodtricks.net/?url=https%3A%2F%2Fwww.goodtricks.net%2F&utm_referrer=#2958 "));
        startActivity(magicIntent);
    }
    public void classicbtn (View view){
        Intent classicIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://90kids.com/games/ "));
        startActivity(classicIntent);
    }



}