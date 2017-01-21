package com.example.nancy.xbike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class profileView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_view);
    }

    public void clickButton(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
