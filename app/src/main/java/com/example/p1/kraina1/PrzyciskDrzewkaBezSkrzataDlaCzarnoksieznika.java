package com.example.p1.kraina1;

import android.content.Context;
import android.util.AttributeSet;



public class PrzyciskDrzewkaBezSkrzataDlaCzarnoksieznika extends android.support.v7.widget.AppCompatImageButton {
// Przycisk ktory jest drzewem za ktorym nie ma skrzata dla czarnoksieznika

    public enum FlashEnum2 {
        ON2, //drzewo
        OFF2; //trawa

        public static FlashEnum2 toMyEnum(String myEnumString) {
            try {
                return valueOf(myEnumString);
            } catch (Exception ex) {
                // For error cases
                return ON2;
            }
        }
    }

    public void setState(FlashEnum2 state) {
        if (state == null) return;
        this.mState = state;
        createDrawableState();

    }

    public interface FlashListener {
        void onOn();
        void onOff();
    }

    public FlashEnum2 mState;
    private FlashListener mFlashListener;

    public PrzyciskDrzewkaBezSkrzataDlaCzarnoksieznika(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Sets initial state
        setState(FlashEnum2.ON2);
    }

    @Override
    public boolean performClick() {
        super.performClick();
        int next = ((mState.ordinal() + 1) % FlashEnum2.values().length);
        if (getState() != FlashEnum2.OFF2) {
            setState(FlashEnum2.values()[next]);
            performFlashClick();
        }
        return true;
    }

    public void performFlashClick() {
        if (mFlashListener == null) return;
        switch (mState) {
            case ON2:
                mFlashListener.onOn();
                break;
            case OFF2:
                mFlashListener.onOff();
                break;
        }
    }

    void createDrawableState() {
        switch (mState) {
            case ON2:
                setImageResource(R.drawable.ic_flash_autoc);
                break;
            case OFF2:
                setImageResource(R.drawable.ic_flash_off);
                break;
        }
    }

    public FlashEnum2 getState() {
        return mState;
    }

    public FlashListener getFlashListener() {
        return mFlashListener;
    }

    public void setFlashListener(FlashListener flashListener) {
        this.mFlashListener = flashListener;
    }

}