package com.example.bananos.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bananos.R;

import java.util.ArrayList;


public class ListActivity extends AppCompatActivity {
    Intent intent;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        textView = findViewById(R.id.viewList);

        intent = getIntent();
        ArrayList<String> itemList = intent.getStringArrayListExtra("key");
        assert itemList != null;
        if (!itemList.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder("");
            for (String string : itemList) {
                stringBuilder = stringBuilder.append(string).append("\n");
            }
            textView.setText(stringBuilder.toString());
        }
    }

    public void clickVoicePage(View view) {
        Intent intent = new Intent(this, VoiceActivity.class);
        startActivity(intent);
    }
}
