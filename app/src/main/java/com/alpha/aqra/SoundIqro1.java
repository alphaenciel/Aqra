package com.alpha.aqra;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by alphaenciel on 6/20/2016.
 */
public class SoundIqro1 {
    public static void play(final Context context, int resource) {
        MediaPlayer mp = MediaPlayer.create(context, resource);
        if (null != mp) {
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });
            mp.start();
        }
    }
}