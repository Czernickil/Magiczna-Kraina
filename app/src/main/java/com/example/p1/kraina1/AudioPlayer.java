package lukasz.p1.kraina1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.ContextMenu;

import com.example.Kraina1;

import java.io.File;

import static lukasz.p1.kraina1.R.*;

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
        Intro.v = 1;
        if (waiter != null)
            waiter.interrupt();
    }

    public void run() {
        if (Intro.v == 0) {
            MediaPlayer ap = MediaPlayer.create(Kraina1.getAppContext(), R.raw.cascades);
            ap.setLooping(true);
            int duration = ap.getDuration();
            long startTime = System.currentTimeMillis();
            ap.start();
            try {
                Thread thisThread = Thread.currentThread();
                while (this.blinker == thisThread && System.currentTimeMillis() - startTime < duration * 1000) {
                    if (Intro.z == 0) {
                        ap.setVolume(0, 0);
                    } else
                    if (Intro.z == 1)
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
        } else if (Intro.v == 1) {
            ap.setVolume(0, 100);
        } else if (Intro.v == 2) {
            ap.setVolume(100, 100);
        }
    }

}