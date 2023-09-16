package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    TextView result;
    Button plus, minus, multiply, divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        result=findViewById(R.id.result);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=num1.getText().toString();
                String n2=num2.getText().toString();

                double d1=Double.parseDouble(n1);
                double d2=Double.parseDouble(n2);

                double answer=d1+d2;

                result.setText(Double.toString(answer));

            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=num1.getText().toString();
                String n2=num2.getText().toString();

                double d1=Double.parseDouble(n1);
                double d2=Double.parseDouble(n2);

                double answer=d1-d2;

                result.setText(Double.toString(answer));

            }
        });





    }
}