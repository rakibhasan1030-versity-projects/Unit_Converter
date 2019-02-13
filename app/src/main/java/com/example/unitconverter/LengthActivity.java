package com.example.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LengthActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText userInputET;
    private TextView mainResultTV, resultHintTV;
    private Spinner lengthFromSpinner;
    private Spinner lengthToSpinner;
    private Button convertButton;

    //meter bool variable
    boolean mToCm = false;
    boolean mToMm = false;
    boolean mToKm = false;
    boolean mToInch = false;
    boolean mToMile = false;
    boolean mToFeet = false;

    //Centimeter bool variable
    boolean cmTom = false;
    boolean cmToMm = false;
    boolean cmToKm = false;
    boolean cmToInch = false;
    boolean cmToMile = false;
    boolean cmToFeet = false;

    //Millimeter...
    boolean mmToM = false;
    boolean mmToCm = false;
    boolean mmToKm = false;
    boolean mmToInch = false;
    boolean mmToMile = false;
    boolean mmToFeet = false;

    //meter bool variable
    boolean kmToCm = false;
    boolean kmToMm = false;
    boolean kmToM = false;
    boolean kmToInch = false;
    boolean kmToMile = false;
    boolean kmToFeet = false;

    //Centimeter bool variable
    boolean inchToM = false;
    boolean inchToMm = false;
    boolean inchToKm = false;
    boolean inchToCm = false;
    boolean inchToMile = false;
    boolean inchToFeet = false;

    //Millimeter...
    boolean mileToM = false;
    boolean mileToCm = false;
    boolean mileToKm = false;
    boolean mileToInch = false;
    boolean mileToMm = false;
    boolean mileToFeet = false;

    //Millimeter...
    boolean feetToM = false;
    boolean feetToCm = false;
    boolean feetToKm = false;
    boolean feetToInch = false;
    boolean feetToMm = false;
    boolean feetToMile = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        lengthFromSpinner = findViewById(R.id.length_from_spinner);
        lengthToSpinner = findViewById(R.id.length_to_spinner);
        convertButton = findViewById(R.id.calculateButton);
        mainResultTV = findViewById(R.id.mainResultTV);
        resultHintTV = findViewById(R.id.resultHintBellowMainResultTV);
        userInputET = findViewById(R.id.userInput);

        ArrayAdapter<CharSequence> adapterFrom = ArrayAdapter.createFromResource(this, R.array.lengthUnits,R.layout.spinner_text);
        adapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lengthFromSpinner.setAdapter(adapterFrom);

        ArrayAdapter<CharSequence> adapterTo = ArrayAdapter.createFromResource(this, R.array.lengthUnits,R.layout.spinner_text);
        adapterTo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lengthToSpinner.setAdapter(adapterTo);

        lengthFromSpinner.setOnItemSelectedListener(this);
        lengthToSpinner.setOnItemSelectedListener(this);

        lengthFromSpinner.setSelection(0);
        lengthToSpinner.setSelection(0);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        lengthFromSpinner = findViewById(R.id.length_from_spinner);
        lengthToSpinner = findViewById(R.id.length_to_spinner);
        String spinnerFrom = lengthFromSpinner.getSelectedItem().toString();
        String spinnerTo =  lengthToSpinner.getSelectedItem().toString();

        //meter to...
        if(spinnerFrom.equals("Meter") && spinnerTo.equals("Centimeter") ){ mToCm = true; }
        else if(spinnerFrom.equals("Meter") && spinnerTo.equals("Millimeter") ){ mToMm = true; }
        else if(spinnerFrom.equals("Meter") && spinnerTo.equals("KiloMeter") ){ mToKm = true; }
        else if(spinnerFrom.equals("Meter") && spinnerTo.equals("Feet") ){ mToFeet= true; }
        else if(spinnerFrom.equals("Meter") && spinnerTo.equals("Mile") ){ mToMile = true; }
        else if(spinnerFrom.equals("Meter") && spinnerTo.equals("Inch") ){ mToInch = true; }

        //Centimeter to...
        else if(spinnerFrom.equals("Centimeter") && spinnerTo.equals("Meter") ){ mToMm = true; }
        else if(spinnerFrom.equals("Centimeter") && spinnerTo.equals("Millimeter") ){ mToMm = true; }
        else if(spinnerFrom.equals("Centimeter") && spinnerTo.equals("KiloMeter") ){ mToKm = true; }
        else if(spinnerFrom.equals("Centimeter") && spinnerTo.equals("Feet") ){ mToFeet= true; }
        else if(spinnerFrom.equals("Centimeter") && spinnerTo.equals("Mile") ){ mToMile = true; }
        else if(spinnerFrom.equals("Centimeter") && spinnerTo.equals("Inch") ){ mToInch = true; }

        //Millimeter to...
        else if(spinnerFrom.equals("Millimeter") && spinnerTo.equals("Meter") ){ mmToM = true; }
        else if(spinnerFrom.equals("Millimeter") && spinnerTo.equals("Centimeter") ){ mmToCm = true; }
        else if(spinnerFrom.equals("Millimeter") && spinnerTo.equals("KiloMeter") ){ mmToKm = true; }
        else if(spinnerFrom.equals("Millimeter") && spinnerTo.equals("Feet") ){ mmToFeet= true; }
        else if(spinnerFrom.equals("Millimeter") && spinnerTo.equals("Mile") ){ mmToMile = true; }
        else if(spinnerFrom.equals("Millimeter") && spinnerTo.equals("Inch") ){ mmToInch = true; }

        //Kilometer to...
        else if(spinnerFrom.equals("KiloMeter") && spinnerTo.equals("Meter") ){ kmToM = true; }
        else if(spinnerFrom.equals("KiloMeter") && spinnerTo.equals("Centimeter") ){ kmToCm = true; }
        else if(spinnerFrom.equals("KiloMeter") && spinnerTo.equals("Millimeter") ){ kmToMm = true; }
        else if(spinnerFrom.equals("KiloMeter") && spinnerTo.equals("Feet") ){ kmToFeet= true; }
        else if(spinnerFrom.equals("KiloMeter") && spinnerTo.equals("Mile") ){ kmToMile = true; }
        else if(spinnerFrom.equals("KiloMeter") && spinnerTo.equals("Inch") ){ kmToInch = true; }

        //Feet to...
        else if(spinnerFrom.equals("Feet") && spinnerTo.equals("Meter") ){ feetToM = true; }
        else if(spinnerFrom.equals("Feet") && spinnerTo.equals("Centimeter") ){ feetToCm = true; }
        else if(spinnerFrom.equals("Feet") && spinnerTo.equals("KiloMeter") ){ feetToKm = true; }
        else if(spinnerFrom.equals("Feet") && spinnerTo.equals("Millimeter") ){ feetToMm= true; }
        else if(spinnerFrom.equals("Feet") && spinnerTo.equals("Mile") ){ feetToMile = true; }
        else if(spinnerFrom.equals("Feet") && spinnerTo.equals("Inch") ){ feetToInch = true; }

        //Mile to...
        else if(spinnerFrom.equals("Mile") && spinnerTo.equals("Meter") ){ mileToM = true; }
        else if(spinnerFrom.equals("Mile") && spinnerTo.equals("Centimeter") ){ mileToCm = true; }
        else if(spinnerFrom.equals("Mile") && spinnerTo.equals("KiloMeter") ){ mileToKm = true; }
        else if(spinnerFrom.equals("Mile") && spinnerTo.equals("Feet") ){ mileToFeet= true; }
        else if(spinnerFrom.equals("Mile") && spinnerTo.equals("Millimeter") ){ mileToMm = true; }
        else if(spinnerFrom.equals("Mile") && spinnerTo.equals("Inch") ){ mileToInch = true; }

        //Inch to...
        else if(spinnerFrom.equals("Inch") && spinnerTo.equals("Meter") ){ inchToM = true; }
        else if(spinnerFrom.equals("Inch") && spinnerTo.equals("Centimeter") ){ inchToCm = true; }
        else if(spinnerFrom.equals("Inch") && spinnerTo.equals("KiloMeter") ){ inchToKm = true; }
        else if(spinnerFrom.equals("Inch") && spinnerTo.equals("Feet") ){ inchToFeet= true; }
        else if(spinnerFrom.equals("Inch") && spinnerTo.equals("Mile") ){ inchToMile = true; }
        else if(spinnerFrom.equals("Inch") && spinnerTo.equals("Millimeter") ){ inchToMm = true; }

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public void onConvertButtonClicked(View view) {
        double _inputValue = Double.parseDouble(userInputET.getText().toString());

        //meter to...
        if (mToCm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mToCm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Meter = "+_userValue+" Centimeter");
            userInputET.setText("");
            mToCm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mToMm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mToMm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Meter = "+_userValue+" Millimeter");
            userInputET.setText("");
            mToMm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mToKm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mToKm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Meter = "+_userValue+" Kilometer");
            userInputET.setText("");
            mToKm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mToFeet == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mToFeet(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Meter = "+_userValue+" Feet");
            userInputET.setText("");
            mToFeet = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mToMile == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mToMile(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Meter = "+_userValue+" Mile");
            userInputET.setText("");
            mToMile = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mToInch == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mToInch(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Meter = "+_userValue+" Inch");
            userInputET.setText("");
            mToInch = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }

        //Centimeter to...
        else if (cmTom == true){
            String _userValue =String.valueOf( LengthCalculationProvider.cmToM(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Centimeter = "+_userValue+" Meter");
            userInputET.setText("");
            cmTom = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (cmToFeet == true){
            String _userValue =String.valueOf( LengthCalculationProvider.cmToFeet(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Centimeter = "+_userValue+" Feet");
            userInputET.setText("");
            cmToFeet = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (cmToInch == true){
            String _userValue =String.valueOf( LengthCalculationProvider.cmToInch(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Centimeter = "+_userValue+" Inch");
            userInputET.setText("");
            cmToInch = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (cmToKm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.cmToKm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Centimeter = "+_userValue+" Kilometer");
            userInputET.setText("");
            cmToKm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (cmToMile == true){
            String _userValue =String.valueOf( LengthCalculationProvider.cmToMile(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Centimeter = "+_userValue+" Mile");
            userInputET.setText("");
            cmToMile = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (cmToMm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.cmToMm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Centimeter = "+_userValue+" Millimeter");
            userInputET.setText("");
            cmToMm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }


        //Millimeter to...
        else if (mmToM == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mmToM(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Millimeter = "+_userValue+" Meter");
            userInputET.setText("");
            mmToM = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mmToInch == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mmToInch(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Millimeter = "+_userValue+" Inch");
            userInputET.setText("");
            mmToInch = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mmToMile == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mmToMile(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Millimeter = "+_userValue+" Mile");
            userInputET.setText("");
            mmToMile = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mmToFeet == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mmToFeet(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Millimeter = "+_userValue+" Feet");
            userInputET.setText("");
            mmToFeet = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mmToKm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mmToKm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Millimeter = "+_userValue+" Kilometer");
            userInputET.setText("");
            mmToKm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mmToCm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mmToCm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Millimeter = "+_userValue+" Centimeter");
            userInputET.setText("");
            mmToCm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }



        //KiloMeter to...
        else if (kmToM == true){
            String _userValue =String.valueOf( LengthCalculationProvider.kmToM(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Kilometer = "+_userValue+" Meter");
            userInputET.setText("");
            kmToM = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (kmToCm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.kmToCm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Kilometer = "+_userValue+" Centimeter");
            userInputET.setText("");
            kmToCm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (kmToMm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.kmToMm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Kilometer = "+_userValue+" Millimeter");
            userInputET.setText("");
            kmToMm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (kmToInch == true){
            String _userValue =String.valueOf( LengthCalculationProvider.kmToInch(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Kilometer = "+_userValue+" Inch");
            userInputET.setText("");
            kmToInch = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (kmToFeet == true){
            String _userValue =String.valueOf( LengthCalculationProvider.kmToFeet(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Kilometer = "+_userValue+" Feet");
            userInputET.setText("");
            kmToFeet = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (kmToMile == true){
            String _userValue =String.valueOf( LengthCalculationProvider.kmToMile(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Kilometer = "+_userValue+" Mile");
            userInputET.setText("");
            kmToMile = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }


        //Inch to...
        else if (inchToM == true){
            String _userValue =String.valueOf( LengthCalculationProvider.inchToM(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Inch = "+_userValue+" Meter");
            userInputET.setText("");
            inchToM = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (inchToCm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.inchToCm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Inch = "+_userValue+" Centimeter");
            userInputET.setText("");
            inchToCm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (inchToMm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.inchToMm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Inch = "+_userValue+" Millimeter");
            userInputET.setText("");
            inchToMm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (inchToKm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.inchToKm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Inch = "+_userValue+" Kilometer");
            userInputET.setText("");
            inchToKm= false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (inchToMile == true){
            String _userValue =String.valueOf( LengthCalculationProvider.inchToMile(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Inch = "+_userValue+" Mile");
            userInputET.setText("");
            inchToMile = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (inchToFeet == true){
            String _userValue =String.valueOf( LengthCalculationProvider.inchToFeet(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Inch = "+_userValue+" Feet");
            userInputET.setText("");
            mmToCm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }


        //Feet to...
        else if (feetToM == true){
            String _userValue =String.valueOf( LengthCalculationProvider.feetToM(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Feet = "+_userValue+" Meter");
            userInputET.setText("");
            feetToM = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (feetToCm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.feetToCm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Feet = "+_userValue+" Centimeter");
            userInputET.setText("");
            feetToCm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (feetToMm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.feetToMm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Feet = "+_userValue+" Millimeter");
            userInputET.setText("");
            feetToMm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (feetToInch == true){
            String _userValue =String.valueOf( LengthCalculationProvider.feetToInch(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Feet = "+_userValue+" Inch");
            userInputET.setText("");
            feetToInch= false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (feetToKm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.feetToKm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Feet = "+_userValue+" Kilometer");
            userInputET.setText("");
            feetToKm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (feetToMile == true){
            String _userValue =String.valueOf( LengthCalculationProvider.feetToMile(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Feet = "+_userValue+" Mile");
            userInputET.setText("");
            feetToMile = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }


        //Feet to...
        else if (mileToM == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mileToM(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Mile = "+_userValue+" Meter");
            userInputET.setText("");
            mileToM = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mileToCm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mileToCm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Mile = "+_userValue+" Centimeter");
            userInputET.setText("");
            mileToCm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mileToKm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mileToKm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Mile = "+_userValue+" Kilometer");
            userInputET.setText("");
            mileToKm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mileToInch == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mileToInch(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Mile = "+_userValue+" Inch");
            userInputET.setText("");
            mileToInch= false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mileToFeet == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mileToFeet(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Mile = "+_userValue+" Feet");
            userInputET.setText("");
            mileToFeet = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }else if (mileToMm == true){
            String _userValue =String.valueOf( LengthCalculationProvider.mileToMm(_inputValue));
            mainResultTV.setText(_userValue);
            resultHintTV.setText(_inputValue+" Mile = "+_userValue+" Millimeter");
            userInputET.setText("");
            mileToMm = false;
            lengthFromSpinner.setSelection(0);
            lengthToSpinner.setSelection(0);
        }

    }

    public void goToMainActivity(View view) {
        startActivity(new Intent(LengthActivity.this,MainActivity.class));

    }
}
