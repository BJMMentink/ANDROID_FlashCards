package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    State[] states = {
            new State("Wisconsin", "Madison"),
            new State("Minnesota", "St. Paul"),
            new State("Ohio", "Columbus"),
    };
    int[] imgs = {
            R.drawable.wisconsin,
            R.drawable.minnesota,
            R.drawable.ohio,
    };
    int cardNo = 2;
    boolean isFront = true;
    ImageView imgCard;
    TextView tvCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgCard = findViewById(R.id.imageView);
        tvCard = findViewById(R.id.tvInfo);

        imgCard.setVisibility(View.VISIBLE);
        imgCard.setImageResource(imgs[cardNo]);

        tvCard.setText(states[cardNo].getName());
    }
}