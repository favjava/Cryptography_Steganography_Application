package com.ridwan.steganography;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button encode = findViewById(R.id.encode_button);
        Button decode = findViewById(R.id.decode_button);

        encode.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Encode.class)));

        decode.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Decode.class)));

    }

}
