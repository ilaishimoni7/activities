package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class credits extends AppCompatActivity {
    TextView tv;
    int last_known;
    Intent gi;
    Intent si;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        gi=getIntent();
        tv = findViewById(R.id.tv);
        last_known = gi.getIntExtra("last",1);


        tv.setText(Integer.toString(last_known));


    }


    public void go_back(View view) {
        si = new Intent(this,MainActivity.class);
        startActivity(si);
    }
}