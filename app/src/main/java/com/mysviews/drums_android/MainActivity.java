package com.mysviews.drums_android;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final int num_of_sounds = 6;
    private final float lv = 1.0f;
    private final float rv = 1.0f;
    private final int loop = 0;
    private final int priority = 0;
    private final float play_rate = 1.0f;

    private SoundPool mSoundPool;
    private int mk1SoundId;
    private int mk2SoundId;
    private int mk3SoundId;
    private int mk4SoundId;
    private int mk5SoundId;
    private int mk6SoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSoundPool = new SoundPool(num_of_sounds, AudioManager.STREAM_MUSIC, 0);
        mk1SoundId = mSoundPool.load(getApplicationContext(), R.raw.kicks01, 1);
        mk2SoundId = mSoundPool.load(getApplicationContext(), R.raw.kicks02, 1);
        mk3SoundId = mSoundPool.load(getApplicationContext(), R.raw.kicks03, 1);
        mk4SoundId = mSoundPool.load(getApplicationContext(), R.raw.kicks04, 1);
        mk5SoundId = mSoundPool.load(getApplicationContext(), R.raw.kicks05, 1);
        mk6SoundId = mSoundPool.load(getApplicationContext(), R.raw.kicks06, 1);
    }

        public void kick1(View v){
        mSoundPool.play(mk1SoundId,lv,rv,priority,loop,play_rate);
        }
        public void kick2(View v){
            mSoundPool.play(mk2SoundId,lv,rv,priority,loop,play_rate);
        }
        public void kick3(View v){
            mSoundPool.play(mk3SoundId,lv,rv,priority,loop,play_rate);
        }
        public void kick4(View v){
            mSoundPool.play(mk4SoundId,lv,rv,priority,loop,play_rate);
        }
        public void kick5(View v){
            mSoundPool.play(mk5SoundId,lv,rv,priority,loop,play_rate);
        }
        public void kick6(View v){
            mSoundPool.play(mk6SoundId,lv,rv,priority,loop,play_rate);
        }
}