package com.firstapp.tutorial_03_intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textView;

    String number1;
    String number2;

    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText1 = findViewById(R.id.editTxt1);
        editText2 = findViewById(R.id.editTxt2);
        textView = findViewById(R.id.viewAnswer);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("num1");
        number2 = intent.getStringExtra("num2");

        editText1.setText(number1);
        editText2.setText(number2);

        num1 = Integer.parseInt(number1);
        num2 = Integer.parseInt(number2);

    }

    public void add(View view){
        textView.setText(number1 + " + " + number2 + " = " + (num1 + num2) );
    }

    public void subtract(View view){
        textView.setText(number1 + " + " + number2 + " = " + (num1 - num2) );
    }

    public void multiply(View view){
        textView.setText(number1 + " + " + number2 + " = " + (num1 * num2) );
    }

    public void divide(View view){
        textView.setText(number1 + " + " + number2 + " = " + (num1 / num2) );
    }

    public void openMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}