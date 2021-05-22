package com.example.thebuddyprojectbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class focus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus);
    }

    public void focusSongbtn1 (View view){
        Intent focusSong1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/37i9dQZF1DX2GLDd1vYI4k?si=O2zz0mhHR6C3xH_BzvsbEA"));
        startActivity(focusSong1Intent);
    }

    public void focusSongbtn2 (View view){
        Intent focusSong2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/3L8XOYZWfMvbyLfHICT3u7?si=GDkRmVzUTwq5oOvCMmzlRw\n"));
        startActivity(focusSong2Intent);
    }

    public void focusPodcast1 (View view){
        Intent focusPodcast1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/2BLdPSFfzWaYKiXYV0Nqvo?si=JGkMlzHvS4a-Ba9MK8360Q"));
        startActivity(focusPodcast1Intent);
    }
    public void focusPodcast2 (View view){
        Intent focusPodcast2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(focusPodcast2Intent);
    }

    public void focusYtBtn1 (View view){
        Intent focusYtBtn1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(focusYtBtn1Intent);
    }

    public void focusYtBtn2(View view){
        Intent focusYtBtn2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(focusYtBtn2Intent);
    }

    public void focusYtBtn3 (View view){
        Intent focusYtBtn3Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(focusYtBtn3Intent);
    }

    public void focusYtBtn4 (View view){
        Intent focusYtBtn4Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(focusYtBtn4Intent);
    }

    public void focusYtBtn5(View view){
        Intent focusYtBtn5Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(focusYtBtn5Intent);
    }

    public void focusYtBtn6 (View view){
        Intent focusYtBtn6Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(focusYtBtn6Intent);
    }

    public void focusYtBtn7(View view){
        Intent focusYtBtn7Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(focusYtBtn7Intent);
    }

    public void focusYtBtn8 (View view){
        Intent focusYtBtn8Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(focusYtBtn8Intent);
    }

    public void focusYtBtn9 (View view){
        Intent focusYtBtn9Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(focusYtBtn9Intent);
    }
}
