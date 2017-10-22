package joseph.roundmelon.com.zendrivetest;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;

import com.zendrive.sdk.ZendriveNotificationContainer;
import com.zendrive.sdk.ZendriveNotificationProvider;

/**
 * Created by Joseph on 22/10/17.
 */

public class MyZendriveNotificationProvider extends ZendriveNotificationProvider {

    // Must have a default constructor

    @Override
    @RequiresApi(Build.VERSION_CODES.O)
    @NonNull
    public ZendriveNotificationContainer getMaybeInDriveNotificationContainer(@NonNull Context context) {


return null;
    }

    @Override
    @NonNull
    public ZendriveNotificationContainer getInDriveNotificationContainer(@NonNull Context context) {


        return null;
    }

}
