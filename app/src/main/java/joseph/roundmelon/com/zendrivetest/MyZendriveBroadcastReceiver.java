package joseph.roundmelon.com.zendrivetest;

import android.content.Context;
import android.widget.Toast;

import com.zendrive.sdk.AccidentInfo;
import com.zendrive.sdk.AnalyzedDriveInfo;
import com.zendrive.sdk.DriveResumeInfo;
import com.zendrive.sdk.DriveStartInfo;
import com.zendrive.sdk.EstimatedDriveInfo;
import com.zendrive.sdk.ZendriveBroadcastReceiver;
import com.zendrive.sdk.ZendriveLocationSettingsResult;

/**
 * Created by Joseph on 22/10/17.
 */

public class MyZendriveBroadcastReceiver extends ZendriveBroadcastReceiver {

    @Override
    public void onDriveStart(Context context, DriveStartInfo startInfo) {
        Toast.makeText(context, "started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDriveResume(Context context, DriveResumeInfo resumeInfo) {  }

    @Override
    public void onDriveEnd(Context context, EstimatedDriveInfo estimatedDriveInfo) {  }

    @Override
    public void onDriveAnalyzed(Context context, AnalyzedDriveInfo analyzedDriveInfo) {  }

    @Override
    public void onAccident(Context context, AccidentInfo accidentInfo) {
        Toast.makeText(context, "accident", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLocationSettingsChange(Context context, ZendriveLocationSettingsResult locationSettingsResult) {  }

    @Override
    public void onLocationPermissionsChange(Context context, boolean granted) {  }

}