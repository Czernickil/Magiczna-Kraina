package com.example.p1.kraina1;

import android.content.Context;
import android.util.AttributeSet;

import static com.example.p1.kraina1.Menu.kon;
public class PrzyciskWyboruOdpowiedzi extends android.support.v7.widget.AppCompatImageButton {



    public enum FlashEnum5 {
        ON5,
        OFF5;

        public static FlashEnum5 toMyEnum(String myEnumString) {
            try {
                return valueOf(myEnumString);
            } catch (Exception ex) {
                // For error cases
                return ON5;
            }
        }
    }
    public void setState(FlashEnum5 state) {
        if (state == null) return;
        this.mState = state;
        createDrawableState();

    }
    public interface FlashListener {
        void onOn();
        void onOff();
    }

    public FlashEnum5 mState;
    private FlashListener mFlashListener;

    public PrzyciskWyboruOdpowiedzi(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Sets initial state
        setState(FlashEnum5.ON5);
    }

    @Override
    public boolean performClick() {
        super.performClick();
        int next = ((mState.ordinal() + 1) % FlashEnum5.values().length);
        if (getState() != FlashEnum5.OFF5) {
            setState(FlashEnum5.values()[next]);
            performFlashClick();
        }
        return true;
    }


    public void performFlashClick() {
        if (mFlashListener == null) return;
        switch (mState) {
            case ON5:
                mFlashListener.onOn();
                break;
            case OFF5:
                mFlashListener.onOff();
                break;
        }
    }

    void createDrawableState() {
        switch (mState) {
            case ON5:
                setImageResource(R.drawable.ic_flash_on5);
                break;
            case OFF5:
                setImageResource(R.drawable.ic_flash_on5);
                break;
        }
    }


    public FlashEnum5 getState() {
        return mState;
    }

    public FlashListener getFlashListener() {
        return mFlashListener;
    }

    public void setFlashListener(FlashListener flashListener) {
        this.mFlashListener = flashListener;
    }

}