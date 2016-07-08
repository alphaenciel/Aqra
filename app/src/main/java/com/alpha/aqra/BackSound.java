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
    private final static int maxVolume = 100;
    public static int currVolume;

    public static int getCurrVolume() {
        return currVolume;
    }

    public static void setCurrVolume(int currVolume) {
        BackSound.currVolume = currVolume;
    }

    public static void SoundPlayer(Context ctx, int raw_id){
        player = MediaPlayer.create(ctx, raw_id);
        player.setLooping(true); // Set looping

        float log1=(float)(Math.log(maxVolume-currVolume)/Math.log(maxVolume));
        player.setVolume(1-log1,1-log1);

        //player.release();
        //player.start();
    }
}

