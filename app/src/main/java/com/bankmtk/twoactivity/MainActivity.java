package com.bankmtk.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private String shape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shape = getString(R.string.ball);
        final ImageView imageView = findViewById(R.id.imageView);
        RadioButton radioBall = findViewById(R.id.radioBall);
        radioBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.ball);
                shape = getString(R.string.ball);
            }
        });
        final RadioButton radioStar = findViewById(R.id.radioStar);
        radioStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.star);
                shape = getString(R.string.star);
            }
        });
        Button button = findViewById(R.id.button);
        final Activity that = this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(that,SecondActivity.class);
                intent.putExtra("shape", shape);
                startActivity(intent);
            }
        });
    }
}
