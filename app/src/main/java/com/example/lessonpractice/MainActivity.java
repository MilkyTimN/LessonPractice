package com.example.lessonpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView = findViewById(R.id.card);

        cardView.setBackgroundResource(R.drawable.bg_card_view);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);

        EditText editText = findViewById(R.id.et);

        button2.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_LONG).show();
        });

        button1.setOnClickListener(view -> {
            if (cardView.getVisibility() == View.VISIBLE) {
                cardView.setVisibility(View.GONE);
            } else {
                cardView.setVisibility(View.VISIBLE);
            }
        });

    }
}