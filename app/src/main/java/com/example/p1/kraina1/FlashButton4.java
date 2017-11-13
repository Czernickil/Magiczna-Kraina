package lukasz.p1.kraina1;

import android.content.Context;
import android.util.AttributeSet;

import static lukasz.p1.kraina1.Menu.kon; public class FlashButton4 extends android.support.v7.widget.AppCompatImageButton {



    public enum FlashEnum4 {
         ON4, OFF4;

        public static FlashEnum4 toMyEnum (String myEnumString) {
            try {
                return valueOf(myEnumString);
            } catch (Exception ex) {
                // For error cases
                return ON4;
            }
        }
    }
    public void setState(FlashEnum4 state) {
        if(state == null)return;
        this.mState = state;
        createDrawableState();

    }
    public interface FlashListener {
        void onOn();
        void onOff();
    }

    public FlashEnum4 mState;
    private FlashListener mFlashListener;

    public FlashButton4(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Sets initial state
        setState(FlashEnum4.ON4);
    }


    @Override
    public boolean performClick() {
        super.performClick();
        int next = ((mState.ordinal() + 1) % FlashEnum4.values().length);
        if (getState()!= FlashEnum4.OFF4){
        setState(FlashEnum4.values()[next]);
        performFlashClick();}
        return true;
    }


    public void performFlashClick() {
        if(mFlashListener == null)return;
        switch (mState) {
            case ON4:
                mFlashListener.onOn();
                break;
            case OFF4:
                mFlashListener.onOff();
                break;
        }
    }

    void createDrawableState() {
        switch (mState) {
            case ON4:
                setImageResource(R.drawable.ic_flash_on4);
                break;
            case OFF4:
                setImageResource(R.drawable.ic_flash_on4);
                break;
        }
    }


    public FlashEnum4 getState() {
        return mState;
    }




    public FlashListener getFlashListener() {
        return mFlashListener;
    }

    public void setFlashListener(FlashListener flashListener) {
        this.mFlashListener = flashListener;
    }

}