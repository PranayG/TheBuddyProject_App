package com.example.thebuddyprojectbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class breakup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakup);
    }

    public void breakupSongbtn1 (View view){
        Intent breakupSong1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/37i9dQZF1DX2GLDd1vYI4k?si=O2zz0mhHR6C3xH_BzvsbEA"));
        startActivity(breakupSong1Intent);
    }

    public void breakupSongbtn2 (View view){
        Intent breakupSong2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/3L8XOYZWfMvbyLfHICT3u7?si=GDkRmVzUTwq5oOvCMmzlRw\n"));
        startActivity(breakupSong2Intent);
    }

    public void breakupPodcast1 (View view){
        Intent breakupPodcast1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/2BLdPSFfzWaYKiXYV0Nqvo?si=JGkMlzHvS4a-Ba9MK8360Q"));
        startActivity(breakupPodcast1Intent);
    }
    public void breakupPodcast2 (View view){
        Intent breakupPodcast2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(breakupPodcast2Intent);
    }

    public void breakupYtBtn1 (View view){
        Intent breakupYtBtn1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(breakupYtBtn1Intent);
    }

    public void breakupYtBtn2(View view){
        Intent breakupYtBtn2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(breakupYtBtn2Intent);
    }

    public void breakupYtBtn3 (View view){
        Intent breakupYtBtn3Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(breakupYtBtn3Intent);
    }

    public void breakupYtBtn4 (View view){
        Intent breakupYtBtn4Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(breakupYtBtn4Intent);
    }

    public void breakupYtBtn5(View view){
        Intent breakupYtBtn5Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(breakupYtBtn5Intent);
    }

    public void breakupYtBtn6 (View view){
        Intent breakupYtBtn6Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(breakupYtBtn6Intent);
    }

    public void breakupYtBtn7(View view){
        Intent breakupYtBtn7Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(breakupYtBtn7Intent);
    }

    public void breakupYtBtn8 (View view){
        Intent breakupYtBtn8Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(breakupYtBtn8Intent);
    }

    public void breakupYtBtn9 (View view){
        Intent breakupYtBtn9Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(breakupYtBtn9Intent);
    }
}
