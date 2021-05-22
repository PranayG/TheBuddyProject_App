package com.example.thebuddyprojectbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class motivation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);
    }

    public void motivationSongbtn1 (View view){
        Intent motivationSong1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/37i9dQZF1DX2GLDd1vYI4k?si=O2zz0mhHR6C3xH_BzvsbEA"));
        startActivity(motivationSong1Intent);
    }

    public void motivationSongbtn2 (View view){
        Intent motivationSong2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/3L8XOYZWfMvbyLfHICT3u7?si=GDkRmVzUTwq5oOvCMmzlRw\n"));
        startActivity(motivationSong2Intent);
    }

    public void motivationPodcast1 (View view){
        Intent motivationPodcast1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/2BLdPSFfzWaYKiXYV0Nqvo?si=JGkMlzHvS4a-Ba9MK8360Q"));
        startActivity(motivationPodcast1Intent);
    }
    public void motivationPodcast2 (View view){
        Intent motivationPodcast2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(motivationPodcast2Intent);
    }

    public void motivationYtBtn1 (View view){
        Intent motivationYtBtn1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(motivationYtBtn1Intent);
    }

    public void motivationYtBtn2(View view){
        Intent motivationYtBtn2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(motivationYtBtn2Intent);
    }

    public void motivationYtBtn3 (View view){
        Intent motivationYtBtn3Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(motivationYtBtn3Intent);
    }

    public void motivationYtBtn4 (View view){
        Intent motivationYtBtn4Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(motivationYtBtn4Intent);
    }

    public void motivationYtBtn5(View view){
        Intent motivationYtBtn5Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(motivationYtBtn5Intent);
    }

    public void motivationYtBtn6 (View view){
        Intent motivationYtBtn6Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(motivationYtBtn6Intent);
    }

    public void motivationYtBtn7(View view){
        Intent motivationYtBtn7Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(motivationYtBtn7Intent);
    }

    public void motivationYtBtn8 (View view){
        Intent motivationYtBtn8Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(motivationYtBtn8Intent);
    }

    public void motivationYtBtn9 (View view){
        Intent motivationYtBtn9Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(motivationYtBtn9Intent);
    }
}
