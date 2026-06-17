package com.example.myapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);
        textView = findViewById(R.id.tv);
        SensorManager mSensorMenager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor mSensor = mSensorMenager.getDefaultSensor(Sensor.TYPE_LIGHT);
        mSensorMenager.registerListener(this,mSensor, SensorManager. SENSOR_DELAY_NORMAL);
        }

    @Override
    public void onSensorChanged(SensorEvent event) {
        // como vc faz para pegar o dado do evento e mostrar no textView
        textView.setText("Valor do sensore de luz:    "+ event.values[0]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
