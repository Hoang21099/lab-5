package com.example.lab5_bt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Second extends AppCompatActivity {
    Button btnBack;

    private void findViewsByIds() {
        btnBack = (Button) findViewById(R.id.button2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewsByIds();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                overridePendingTransition(R.anim.anim_left_to_right_out, R.anim.anim_right_to_left_out);
            }
        });
    }
}