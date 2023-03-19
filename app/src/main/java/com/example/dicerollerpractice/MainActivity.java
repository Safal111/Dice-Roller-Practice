package com.example.dicerollerpractice;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button roll;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = findViewById(R.id.button);
        result = findViewById(R.id.textView);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int resultView1 = random.nextInt(6) + 1;
                int resultView2 = random.nextInt(6) + 1;
                String resultText = "Dice 1: " + resultView1 + "\n" + "Dice 2: " + resultView2;
                result.setText(resultText);
            }
        });
    }
}
