package com.example.offloadingandstreaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonsVeiw extends AppCompatActivity {

    Button vedio_one;
    Button vedio_tow;
    Button vedio_three;
    Button vedio_four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_veiw);

        vedio_one = findViewById(R.id.vedio_one);
        vedio_tow = findViewById(R.id.vedio_tow);
        vedio_three = findViewById(R.id.vedio_three);
        vedio_four = findViewById(R.id.vedio_foure);

        vedio_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        vedio_tow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vedioTow.class);
                startActivity(intent);
            }
        });

        vedio_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vedioThree.class);
                startActivity(intent);
            }
        });

        vedio_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), vedioFour.class);
                startActivity(intent);
            }
        });


    }
}