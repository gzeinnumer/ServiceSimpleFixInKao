package com.gzeinnumer.servicesimplefixinkao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gzeinnumer.servicesimplefixinkao.service.MyService;

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