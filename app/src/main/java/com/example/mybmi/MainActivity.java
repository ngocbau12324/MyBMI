package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView name, weigh, heigh, bmi, result;
    private Button btnBMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.etName);
        weigh = (EditText) findViewById(R.id.etWeigh);
        heigh = (EditText) findViewById(R.id.etHeigh);
        bmi = (EditText) findViewById(R.id.etBMI);
        result = (EditText) findViewById(R.id.etResult);
        btnBMI = (Button) findViewById(R.id.btnBMI);

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinh();
            }
        });
    }
    private void tinh(){
        double h = Double.parseDouble(heigh.getText().toString());
        double w = Double.parseDouble(weigh.getText().toString());
        bmiclass BMI = new bmiclass(h,w);
        bmi.setText(String.valueOf(BMI.getBMI()));
        result.setText(BMI.getChuanDoan());
    }
}