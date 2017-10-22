package joseph.roundmelon.com.zendrivetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zendrive.sdk.Zendrive;
import com.zendrive.sdk.ZendriveConfiguration;
import com.zendrive.sdk.ZendriveDriverAttributes;
import com.zendrive.sdk.ZendriveOperationCallback;
import com.zendrive.sdk.ZendriveOperationResult;

public class MainActivity extends AppCompatActivity {

    EditText firstName,lastName,emailId,mobile,driverId;
    Button setUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstName = (EditText)findViewById(R.id.firstName);
        lastName = (EditText)findViewById(R.id.lastName);
        mobile = (EditText)findViewById(R.id.mobile);
        emailId = (EditText)findViewById(R.id.emailId);
        driverId = (EditText)findViewById(R.id.driverId);


        setUp = (Button)findViewById(R.id.setUp);


        final String zendriveApplicationKey = "ZENDRIVE_SDK_KEY";


        setUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ZendriveDriverAttributes driverAttributes = new ZendriveDriverAttributes();
                driverAttributes.setFirstName(firstName.getText().toString());
                driverAttributes.setLastName(lastName.getText().toString());
                driverAttributes.setEmail(emailId.getText().toString());
                driverAttributes.setPhoneNumber(mobile.getText().toString());




                ZendriveConfiguration zendriveConfiguration = new ZendriveConfiguration(
                        zendriveApplicationKey,driverId.getText().toString());   // an unique id of the driver specific to your application
                zendriveConfiguration.setDriverAttributes(driverAttributes);


                Zendrive.setup(
                        MainActivity.this,
                        zendriveConfiguration,
                        MyZendriveBroadcastReceiver.class,        // can be null.
                        MyZendriveNotificationProvider.class,     // must be non-null.
                        new ZendriveOperationCallback() {
                            @Override
                            public void onCompletion(ZendriveOperationResult result) {
                                if (result.isSuccess()) {
                                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                                }
                                else {
                                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                );


            }
        });


    }
}
