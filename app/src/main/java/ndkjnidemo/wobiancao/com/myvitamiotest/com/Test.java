package ndkjnidemo.wobiancao.com.myvitamiotest.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;
import ndkjnidemo.wobiancao.com.myvitamiotest.R;

/**
 * Created by yuchunrong on 2017-10-02.
 */

public class Test extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Vitamio.isInitialized(Test.this);
        setContentView(R.layout.testactivity);

        playfunction();
    }
    void playfunction(){
        String path = "";
        //path="http://gslb.miaopai.com/stream/3D~8BM-7CZqjZscVBEYr5g__.mp4";
        path ="/storage/emulated/0/Movies/yeespec/0009-2016-09-30-13-49-30.mp4";
        VideoView mVideoView;

        mVideoView = (VideoView) findViewById(R.id.surface_view);
        if (path == "") {

            Toast.makeText(Test.this, "Please edit VideoViewDemo Activity, and set path" + " variable to your media file URL/path", Toast.LENGTH_LONG).show();
            return;
        } else {
			/*
			 * Alternatively,for streaming media you can use
			 * mVideoView.setVideoURI(Uri.parse(URLstring));
			 */
            mVideoView.setVideoPath(path);
            mVideoView.setMediaController(new MediaController(this));
            mVideoView.requestFocus();

           /* mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();
                    mediaPlayer.stop();
                    // optional need Vitamio 4.0
                    mediaPlayer.setPlaybackSpeed(1.0f);
                }
            });*/
        }
    }
}
