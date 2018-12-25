package com.example.p1.kraina1; import android.media.MediaPlayer;
import android.util.Log;

import com.example.Kraina1;

/**
 * Created by p1 on 2017-10-23.
 */

public class AudioPlayer extends Thread {
    public MediaPlayer ap = MediaPlayer.create(Kraina1.getAppContext(), R.raw.cascades);
    private Thread blinker;
    private int file;

    public AudioPlayer() {}

    public void go() {
        blinker = this;
        if (blinker.getState() == Thread.State.NEW) {

            blinker.start();

        }
    }

    public void end() {
        Thread waiter = blinker;
        blinker = null;
        Intro.poprawneWylaczenieTrzy = 1;
        if (waiter != null)
            waiter.interrupt();
    }

    public void run() {
        if (Intro.poprawneWylaczenieTrzy == 0) {
            MediaPlayer ap = MediaPlayer.create(Kraina1.getAppContext(), R.raw.cascades);
            ap.setLooping(true);
            int duration = ap.getDuration();
            long startTime = System.currentTimeMillis();
            ap.start();
            try {
                Thread thisThread = Thread.currentThread();
                while (this.blinker == thisThread && System.currentTimeMillis() - startTime < duration * 1000) {
                    if (Intro.poprawneWylaczenieDwa == 0) {
                        ap.setVolume(0, 0);
                    } else
                    if (Intro.poprawneWylaczenieDwa == 1)
                        ap.setVolume(1, 1);
                    Thread.sleep(500); // interval between checks (in ms)
                }
                ap.stop();
                ap.release();
                ap = null;
            } catch (InterruptedException e) {
                Log.d("AUDIO-PLAYER", "INTERRUPTED EXCEPTION");
                ap.stop();
                ap.release();
                ap = null;
            }
        } else if (Intro.poprawneWylaczenieTrzy == 1) {
            ap.setVolume(0, 100);
        } else if (Intro.poprawneWylaczenieTrzy == 2) {
            ap.setVolume(100, 100);
        }
    }

}