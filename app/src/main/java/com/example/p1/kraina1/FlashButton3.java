package com.example.p1.kraina1;

import android.content.Context;
import android.util.AttributeSet;

import static com.example.p1.kraina1.Menu.kon; public class FlashButton3 extends android.support.v7.widget.AppCompatImageButton {



    public enum FlashEnum3 {
         ON3, OFF3, ON3p, ON3z, ON3m;

        public static FlashEnum3 toMyEnum (String myEnumString) {
            try {
                return valueOf(myEnumString);
            } catch (Exception ex) {
                // For error cases
                return ON3;
            }
        }
    }
    public void setState(FlashEnum3 state) {
        if(state == null)return;
        this.mState = state;
        createDrawableState();

    }
    public interface FlashListener {
        void onOn();
        void onOff();
    }

    public FlashEnum3 mState;
    private FlashListener mFlashListener;

    public FlashButton3(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Sets initial state
        setState(FlashEnum3.ON3);
    }


    @Override
    public boolean performClick() {
        super.performClick();
        int next = ((mState.ordinal() + 1) % FlashEnum3.values().length);
        if (getState()!= FlashEnum3.OFF3){
        setState(FlashEnum3.OFF3);
        performFlashClick();}
        return true;
    }


    public void performFlashClick() {
        if(mFlashListener == null)return;
        switch (mState) {
            case ON3:
                mFlashListener.onOn();
                break;
            case OFF3:
                mFlashListener.onOff();
                break;
        }
    }

    void createDrawableState() {
        switch (mState) {
            case ON3:
                setImageResource(R.drawable.ic_flash_on3);
                break;
            case ON3m:
                setImageResource(R.drawable.ic_flash_on3m);
                break;
            case ON3p:
                setImageResource(R.drawable.ic_flash_on3p);
                break;
            case ON3z:
                setImageResource(R.drawable.ic_flash_on3z);
                break;
            case OFF3:
                setVisibility(INVISIBLE);
                break;

        }
    }


    public FlashEnum3 getState() {
        return mState;
    }




    public FlashListener getFlashListener() {
        return mFlashListener;
    }

    public void setFlashListener(FlashListener flashListener) {
        this.mFlashListener = flashListener;
    }

}