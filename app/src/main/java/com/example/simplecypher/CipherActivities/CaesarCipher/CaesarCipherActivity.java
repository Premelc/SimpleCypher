package com.example.simplecypher.CipherActivities.CaesarCipher;

import static com.example.simplecypher.cyphers.CaesarCipher.CaesarCypher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.simplecypher.R;

public class CaesarCipherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cypher_screen);
    }
    public void cypher(View view){
        //Get msg to cypher
        EditText editText = findViewById(R.id.messageToCypher);
        String message = editText.getText().toString();

        //get rotViewNum
        TextView rotText = findViewById(R.id.rotNumView);
        int rot =  Integer.parseInt(rotText.getText().toString());

        TextView cypheredMsgTextView = findViewById(R.id.CypheredMessage);
        cypheredMsgTextView.setText(CaesarCypher(message , rot));
    }
    public void IncRotNum(View view){
        TextView rotText = findViewById(R.id.rotNumView);
        Integer rot =  Integer.parseInt(rotText.getText().toString());
        if(rot == 25){
            rot = 1;
        }else rot++;
        rotText.setText(rot.toString());
    }
    public void DecRotNum(View view){
        TextView rotText = findViewById(R.id.rotNumView);
        Integer rot =  Integer.parseInt(rotText.getText().toString());
        if(rot == 1){
            rot = 25;
        }else rot--;
        rotText.setText(rot.toString());
        }


}