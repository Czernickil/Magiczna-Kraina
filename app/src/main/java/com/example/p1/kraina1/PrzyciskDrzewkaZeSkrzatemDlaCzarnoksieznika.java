package com.example.p1.kraina1;

import android.content.Context;
import android.util.AttributeSet;



import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.skrzatyCzarnoksieznika;
public class PrzyciskDrzewkaZeSkrzatemDlaCzarnoksieznika extends android.support.v7.widget.AppCompatImageButton {
// Przycisk drzewka dla czarnoksieznka

    public enum FlashEnum {
        AUTOMATIC, //drzewo
        ON, //skrzat dobry
        OFF; // skrzat zly

        public static FlashEnum toMyEnum (String myEnumString) {
            try {
                return valueOf(myEnumString);
            } catch (Exception ex) {
                // For error cases
                return AUTOMATIC;
            }
        }
    }

    public void setState(FlashEnum state) {
        if(state == null)return;
        this.mState = state;
        createDrawableState();

    }

    public interface FlashListener {
        void onAutomatic();
        void onOn();
        void onOff();
    }

    private FlashEnum mState;
    private FlashListener mFlashListener;

    public PrzyciskDrzewkaZeSkrzatemDlaCzarnoksieznika(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Sets initial state
        setState(FlashEnum.AUTOMATIC);
    }

    @Override
    public boolean performClick() {
        super.performClick();

        int next = ((mState.ordinal() + 1) % FlashEnum.values().length);
        if (getState()== FlashEnum.AUTOMATIC){
            skrzatyCzarnoksieznika++;
            if(GlownyWidokCzarnoksieznika.czyTuraCzarnoksieznika ==1)
        setState(FlashEnum.ON);
            if(GlownyWidokCzarnoksieznika.czyTuraCzarnoksieznika ==0)
                setState(FlashEnum.OFF);
        performFlashClick();
        return true;}
        return false;
    }


    void performFlashClick() {
        if(mFlashListener == null)return;
        switch (mState) {
            case AUTOMATIC:
                mFlashListener.onAutomatic();
                break;
            case ON:
                mFlashListener.onOn();
                break;
            case OFF:
                mFlashListener.onOff();
                break;
        }
    }

    void createDrawableState() {
        switch (mState) {
            case AUTOMATIC:
                setImageResource(R.drawable.ic_flash_autoc);
                break;
            case ON:
                setImageResource(R.drawable.ic_flash_on);
                break;
            case OFF:
                setImageResource(R.drawable.ic_flash_offz);
                break;
        }
    }

    public FlashEnum getState() {
        return mState;
    }

    public FlashListener getFlashListener() {
        return mFlashListener;
    }

    public void setFlashListener(FlashListener flashListener) {
        this.mFlashListener = flashListener;
    }

}