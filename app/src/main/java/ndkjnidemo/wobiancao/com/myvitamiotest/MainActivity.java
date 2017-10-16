package ndkjnidemo.wobiancao.com.myvitamiotest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ndkjnidemo.wobiancao.com.myvitamiotest.com.MediaPlayerDemo_Video;
import ndkjnidemo.wobiancao.com.myvitamiotest.com.Test;
import ndkjnidemo.wobiancao.com.myvitamiotest.com.VideoViewSubtitle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, VideoViewSubtitle.class);
        startActivity(intent);
    }
}
