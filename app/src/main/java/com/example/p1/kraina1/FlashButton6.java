package lukasz.p1.kraina1;

import android.content.Context;
import android.util.AttributeSet;

public class FlashButton6 extends android.support.v7.widget.AppCompatImageButton {



    public enum FlashEnum6 {
        ON6,
        OFF6;

        public static FlashEnum6 toMyEnum(String myEnumString) {
            try {
                return valueOf(myEnumString);
            } catch (Exception ex) {
                // For error cases
                return ON6;
            }
        }
    }
    public void setState(FlashEnum6 state) {
        if (state == null) return;
        this.mState = state;
        createDrawableState();

    }
    public interface FlashListener {
        void onOn();
        void onOff();
    }

    public FlashEnum6 mState;
    private FlashListener mFlashListener;

    public FlashButton6(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Sets initial state
        setState(FlashEnum6.ON6);
    }

    @Override
    public boolean performClick() {
        super.performClick();
        int next = ((mState.ordinal() + 1) % FlashEnum6.values().length);
        setState(FlashEnum6.values()[next]);
        performFlashClick();
        return true;
    }

    public void performFlashClick() {
        if (mFlashListener == null) return;
        switch (mState) {
            case ON6:
                mFlashListener.onOn();
                break;
            case OFF6:
                mFlashListener.onOff();
                break;
        }
    }

    void createDrawableState() {
        switch (mState) {
            case ON6:
                setImageResource(R.drawable.voiceon);
                break;
            case OFF6:
                setImageResource(R.drawable.voiceoff);
                break;
        }
    }

    public FlashEnum6 getState() {
        return mState;
    }

    public FlashListener getFlashListener() {
        return mFlashListener;
    }

    public void setFlashListener(FlashListener flashListener) {
        this.mFlashListener = flashListener;
    }

}