package tmc.BukkitTestUtilities.Services;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;

public class TimeFreezeService {

    public static void freeze(DateTime time) {
        DateTimeUtils.setCurrentMillisFixed(time.getMillis());
    }

    public static void freeze() {
        DateTimeUtils.setCurrentMillisFixed(DateTimeUtils.getInstantMillis(null));
    }
    public static void unfreeze() {
        DateTimeUtils.setCurrentMillisSystem();
    }
}
