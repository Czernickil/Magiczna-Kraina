package lukasz.p1.kraina1;

import android.app.Activity;

/**
 * Created by p1 on 2017-10-23.
 */

public class GlobalActivityManager {

    private static boolean isActivityStarting = true;

    public static boolean isActivityStarting() {
        return isActivityStarting;
    }

    public static void setIsActivityStarting(boolean newValue) {
        isActivityStarting = newValue;
    }

    public static void startActivity(Activity previous, Class activityClass) {
        isActivityStarting = true;
        // Do stuff to start your activity
        isActivityStarting = false;
    }
}