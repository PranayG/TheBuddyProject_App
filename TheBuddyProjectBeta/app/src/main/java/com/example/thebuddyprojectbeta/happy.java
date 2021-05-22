package com.example.thebuddyprojectbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class happy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);
    }

    public void happySongbtn1 (View view){
        Intent happySong1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/37i9dQZF1DX2GLDd1vYI4k?si=O2zz0mhHR6C3xH_BzvsbEA"));
        startActivity(happySong1Intent);
    }

    public void happySongbtn2 (View view){
        Intent happySong2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/3L8XOYZWfMvbyLfHICT3u7?si=GDkRmVzUTwq5oOvCMmzlRw\n"));
        startActivity(happySong2Intent);
    }

    public void happyPodcast1 (View view){
        Intent happyPodcast1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/2BLdPSFfzWaYKiXYV0Nqvo?si=JGkMlzHvS4a-Ba9MK8360Q"));
        startActivity(happyPodcast1Intent);
    }
    public void happyPodcast2 (View view){
        Intent happyPodcast2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(happyPodcast2Intent);
    }

    public void happyYtBtn1 (View view){
        Intent happyYtBtn1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(happyYtBtn1Intent);
    }

    public void happyYtBtn2(View view){
        Intent happyYtBtn2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(happyYtBtn2Intent);
    }

    public void happyYtBtn3 (View view){
        Intent happyYtBtn3Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(happyYtBtn3Intent);
    }

    public void happyYtBtn4 (View view){
        Intent happyYtBtn4Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(happyYtBtn4Intent);
    }

    public void happyYtBtn5(View view){
        Intent happyYtBtn5Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(happyYtBtn5Intent);
    }

    public void happyYtBtn6 (View view){
        Intent happyYtBtn6Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(happyYtBtn6Intent);
    }

    public void happyYtBtn7(View view){
        Intent happyYtBtn7Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(happyYtBtn7Intent);
    }

    public void happyYtBtn8 (View view){
        Intent happyYtBtn8Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(happyYtBtn8Intent);
    }

    public void happyYtBtn9 (View view){
        Intent happyYtBtn9Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(happyYtBtn9Intent);
    }
}
