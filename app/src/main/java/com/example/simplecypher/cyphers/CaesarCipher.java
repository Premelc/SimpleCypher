package com.example.simplecypher.cyphers;

import java.util.Locale;

public class CaesarCipher {

    public static String CaesarCypher(String s , int rot){

        char[] charr = s.toCharArray();
        String newString = "";
        for(char c : charr){
            if(Character.isLetter(c))
                if(c + rot > 122) newString += (char)(c + rot - 26);
                else newString += (char)(c + rot);
            else newString += c;
        }
       return newString;
    }
}
