package com.example.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView lengthIV, angleIV, currencyIV, dataIV, energyIV, forceIV, fuelIV, speedIV, tempIV, timeIV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lengthIV = findViewById(R.id.lengthIV);
        angleIV = findViewById(R.id.angleIV);
        currencyIV = findViewById(R.id.currencyIV);
        dataIV = findViewById(R.id.dataIV);
        energyIV = findViewById(R.id.energyIV);
        forceIV = findViewById(R.id.forceIV);
        fuelIV = findViewById(R.id.fuelIV);
        speedIV = findViewById(R.id.speedIV);
        tempIV = findViewById(R.id.temperatureIV);
        timeIV = findViewById(R.id.timeIV);


        lengthIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LengthActivity.class));
            }
        });

    }

    public void NotImplementedYet(View view) {
        ToastManager.shortToast(MainActivity.this,"This section is under maintenance!!!");
    }
}
