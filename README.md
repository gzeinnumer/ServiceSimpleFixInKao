# ServiceSimpleFixInKao
 
- MyService.java
```java
public class MyService extends Service {

    private static final String TAG = "MyService_";

    private Timer timer;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                //ambil data dan kirim ke function
                sendData();
            }
        }, 1, 30000);
    }

    private void sendData() {
        Log.d(TAG, "sendData: terpanggil");
        //letakan aksi kirim disini
    }
}
```

- MainActivity.java
```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initService();
    }

    private void initService() {
        startService(new Intent(this, MyService.class));//done
    }
}
```

- Manifest.
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.gzeinnumer.servicesimplefixinkao">

    <uses-permission android:name="android.permission.FOREGROUND_SERVICE" />

    ...
 
    <application >

        <service
            android:name=".service.MyService"
            android:enabled="true"
            android:exported="true" />
     
     ...
     
     <activity android:name=".MainActivity">
         
         ...
      
     </activity>

    </application>

</manifest>
```

---

```
Copyright 2020 M. Fadli Zein
```
