package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText inputFirstNumber, inputSecondNumber;
    Button buttonPlus, buttonMinus, buttonMultiply, buttonDivide;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputFirstNumber = findViewById(R.id.inputFirstNumber);
        inputSecondNumber = findViewById(R.id.inputSecondNumber);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);

        textResult = findViewById(R.id.textResult);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = getFirstNumber();
                double num2 = getSecondNumber();
                double result = num1 + num2;
                textResult.setText("Result: " + result);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = getFirstNumber();
                double num2 = getSecondNumber();
                double result = num1 - num2;
                textResult.setText("Result: " + result);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = getFirstNumber();
                double num2 = getSecondNumber();
                double result = num1 * num2;
                textResult.setText("Result: " + result);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = getFirstNumber();
                double num2 = getSecondNumber();

                if (num2 == 0) {
                    textResult.setText("Result: Cannot divide by zero");
                } else {
                    double result = num1 / num2;
                    textResult.setText("Result: " + result);
                }
            }
        });
    }

    public double getFirstNumber() {
        String first = inputFirstNumber.getText().toString();

        if (first.isEmpty()) {
            return 0;
        }

        return Double.parseDouble(first);
    }

    public double getSecondNumber() {
        String second = inputSecondNumber.getText().toString();

        if (second.isEmpty()) {
            return 0;
        }

        return Double.parseDouble(second);
    }
}