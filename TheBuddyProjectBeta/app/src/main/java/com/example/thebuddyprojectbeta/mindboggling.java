package com.example.thebuddyprojectbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class mindboggling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindboggling);
    }

    public void mindbogglingSongbtn1 (View view){
        Intent mindbogglingSong1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/37i9dQZF1DX2GLDd1vYI4k?si=O2zz0mhHR6C3xH_BzvsbEA"));
        startActivity(mindbogglingSong1Intent);
    }

    public void mindbogglingSongbtn2 (View view){
        Intent mindbogglingSong2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/3L8XOYZWfMvbyLfHICT3u7?si=GDkRmVzUTwq5oOvCMmzlRw\n"));
        startActivity(mindbogglingSong2Intent);
    }

    public void mindbogglingPodcast1 (View view){
        Intent mindbogglingPodcast1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/2BLdPSFfzWaYKiXYV0Nqvo?si=JGkMlzHvS4a-Ba9MK8360Q"));
        startActivity(mindbogglingPodcast1Intent);
    }
    public void mindbogglingPodcast2 (View view){
        Intent mindbogglingPodcast2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(mindbogglingPodcast2Intent);
    }

    public void mindbogglingYtBtn1 (View view){
        Intent mindbogglingYtBtn1Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(mindbogglingYtBtn1Intent);
    }

    public void mindbogglingYtBtn2(View view){
        Intent mindbogglingYtBtn2Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(mindbogglingYtBtn2Intent);
    }

    public void mindbogglingYtBtn3 (View view){
        Intent mindbogglingYtBtn3Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(mindbogglingYtBtn3Intent);
    }

    public void mindbogglingYtBtn4 (View view){
        Intent mindbogglingYtBtn4Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(mindbogglingYtBtn4Intent);
    }

    public void mindbogglingYtBtn5(View view){
        Intent mindbogglingYtBtn5Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(mindbogglingYtBtn5Intent);
    }

    public void mindbogglingYtBtn6 (View view){
        Intent mindbogglingYtBtn6Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(mindbogglingYtBtn6Intent);
    }

    public void mindbogglingYtBtn7(View view){
        Intent mindbogglingYtBtn7Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(mindbogglingYtBtn7Intent);
    }

    public void mindbogglingYtBtn8 (View view){
        Intent mindbogglingYtBtn8Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(mindbogglingYtBtn8Intent);
    }

    public void mindbogglingYtBtn9 (View view){
        Intent mindbogglingYtBtn9Intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/show/6R6KA5U9J9AC09DOFvNQpf?si=TORLXSB3Qzq67te7jAvfxw"));
        startActivity(mindbogglingYtBtn9Intent);
    }
}
