package com.example.myapplication;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, ConstraintActivity.class));
            }


        });
    }



}
