package com.example.thebuddyprojectbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
public class scary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scary);
    }

    public void scarySongbtn1 (View view){
        Intent scarySong1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/37i9dQZF1DX2GLDd1vYI4k?si=O2zz0mhHR6C3xH_BzvsbEA"));
        startActivity(scarySong1Intent);
    }

    public void scarySongbtn2 (View view){
        Intent scarySong2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/3L8XOYZWfMvbyLfHICT3u7?si=GDkRmVzUTwq5oOvCMmzlRw\n"));
        startActivity(scarySong2Intent);
    }

    public void scaryPodcast1 (View view){
        Intent scaryPodcast1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/2BLdPSFfzWaYKiXYV0Nqvo?si=JGkMlzHvS4a-Ba9MK8360Q"));
        startActivity(scaryPodcast1Intent);
    }
    public void scaryPodcast2 (View view){
        Intent scaryPodcast2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(scaryPodcast2Intent);
    }

    public void scaryYtBtn1 (View view){
        Intent scaryYtBtn1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(scaryYtBtn1Intent);
    }

    public void scaryYtBtn2(View view){
        Intent scaryYtBtn2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(scaryYtBtn2Intent);
    }

    public void scaryYtBtn3 (View view){
        Intent scaryYtBtn3Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(scaryYtBtn3Intent);
    }

    public void scaryYtBtn4 (View view){
        Intent scaryYtBtn4Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(scaryYtBtn4Intent);
    }

    public void scaryYtBtn5(View view){
        Intent scaryYtBtn5Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(scaryYtBtn5Intent);
    }

    public void scaryYtBtn6 (View view){
        Intent scaryYtBtn6Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(scaryYtBtn6Intent);
    }

    public void scaryYtBtn7(View view){
        Intent scaryYtBtn7Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(scaryYtBtn7Intent);
    }

    public void scaryYtBtn8 (View view){
        Intent scaryYtBtn8Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(scaryYtBtn8Intent);
    }

    public void scaryYtBtn9 (View view){
        Intent scaryYtBtn9Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(scaryYtBtn9Intent);
    }
}
