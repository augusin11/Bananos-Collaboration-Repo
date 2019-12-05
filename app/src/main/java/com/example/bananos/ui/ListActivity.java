package com.example.bananos.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bananos.R;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void clickVoicePage(View view) {
        Intent intent = new Intent(this, VoiceActivity.class);
        startActivity(intent);
    }
}
