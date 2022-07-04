package com.example.simplecypher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.simplecypher.CipherActivities.CaesarCipher.CaesarCypherSubActivity;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    //calls caesarCypher activity
    public void CaesarCipher(View view){
        Intent intent = new Intent(this , CaesarCypherSubActivity.class);
        startActivity(intent);
    }
}