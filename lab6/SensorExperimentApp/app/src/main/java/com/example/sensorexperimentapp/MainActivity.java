package com.example.sensorexperimentapp;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    private TextView sensorListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button detectSensorsButton = findViewById(R.id.detectSensorsButton);
        sensorListTextView =findViewById(R.id.sensorListTextView);

        sensorManager =(SensorManager) getSystemService(SENSOR_SERVICE);
        detectSensorsButton.setOnClickListener(v-> listAvailableSensors());
    }

    private void listAvailableSensors(){
        List<Sensor>sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuilder sensorInfo =new StringBuilder("Available sensor: \n");
        for (Sensor sensor :sensorList){
            sensorInfo.append(sensor.getName()).append("(").append(sensor.getType()).append(")\n");
        }
        sensorListTextView.setText(sensorInfo.toString());
    }


}