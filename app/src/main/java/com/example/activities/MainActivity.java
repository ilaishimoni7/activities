package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText display;
    Button plus_button;
    String st;
    String st2;
    int x;
    int y;
    char kolet;
    int z;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (EditText) findViewById(R.id.display);
        plus_button = (Button) findViewById(R.id.plus_button);

    }

    public void plus(View view) {
     st = display.getText().toString();
     x = x + Integer.parseInt(st);
     display.setText("");
     kolet = '+';
    }

    public void minus(View view) {
        st = display.getText().toString();
        x = x - Integer.parseInt(st);
        display.setText("");
        kolet = '-';
    }

    public void devide(View view) {
        st = display.getText().toString();
        x = x /  Integer.parseInt(st);
        display.setText("");
        kolet = '/';
    }

    public void multiply(View view) {
        st = display.getText().toString();
        x = x * Integer.parseInt(st);
        display.setText("");
        kolet = '*';
    }


    public void equals(View view) {

        if (kolet=='+'){

            st2 = display.getText().toString();
            y = Integer.parseInt(st2);
            display.setText(Integer.toString(x+y));
            z=x+y;
        }
        if (kolet=='-'){
            st2 = display.getText().toString();
            y = Integer.parseInt(st2);
            display.setText(Integer.toString(x-y));
            z=x-y;

        }
        if (kolet=='/'){
            st2 = display.getText().toString();
            y = Integer.parseInt(st2);
            display.setText(Integer.toString(x/y));
            z=x/y;

        }
        if (kolet=='*'){
            st2 = display.getText().toString();
            y = Integer.parseInt(st2);
            display.setText(Integer.toString(x*y));
            z=x*y;

        }



    }



    public void reset(View view) {
        display.setText("");
        x=0;
        y=0;
        z=0;
    }

    public void send_info(View view) {
        Intent si = new Intent(this,credits.class);
        si.putExtra("last",z);
        startActivity(si);
    }
}