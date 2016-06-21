package com.alpha.aqra;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

/**
 * Created by alphaenciel on 6/20/2016.
 */
public class BackSound {
    public static MediaPlayer player;
    public static void SoundPlayer(Context ctx,int raw_id){
        player = MediaPlayer.create(ctx, raw_id);
        player.setLooping(true); // Set looping
        player.setVolume(100, 100);

        //player.release();
        //player.start();
    }
}

