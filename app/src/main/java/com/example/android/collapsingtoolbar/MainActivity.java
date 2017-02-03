package com.example.android.collapsingtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv = (CardView) findViewById(R.id.cardView);
    }

    void cambiar(View view){
        startActivity(new Intent(getApplicationContext(),ScrollingActivity.class));
    }
}
