package com.firstapp.tutorial_03_intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTxt1);
        editText2 = findViewById(R.id.editTxt2);
    }

    //navigation
    public void openSecondActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);

        String num1 = editText1.getText().toString();
        String num2 = editText2.getText().toString();

        intent.putExtra("num1", num1);
        intent.putExtra("num2", num2);

        startActivity(intent);
    }


}