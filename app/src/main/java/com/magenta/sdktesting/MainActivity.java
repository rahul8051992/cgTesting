package com.magenta.sdktesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;

import com.magenta.chargegridsdk.Calculation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int add = Calculation.add(10,20);

        Toast.makeText(getApplicationContext(), ""+add, Toast.LENGTH_SHORT).show();
    }
}