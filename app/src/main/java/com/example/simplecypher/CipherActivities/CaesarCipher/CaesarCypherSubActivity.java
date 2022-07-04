package com.example.simplecypher.CipherActivities.CaesarCipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.simplecypher.R;

public class CaesarCypherSubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caesar_cypher_sub);
    }

    public void CaesarCipherMainActivity(View view){
        Intent intent = new Intent(this , CaesarCipherActivity.class);
        startActivity(intent);
    }
}