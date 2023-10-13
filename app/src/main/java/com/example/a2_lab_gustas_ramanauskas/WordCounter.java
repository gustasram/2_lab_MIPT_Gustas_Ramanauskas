package com.example.a2_lab_gustas_ramanauskas;


import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WordCounter {

    //static TextView tvMain;
    // EditText edUserInput;
    public static int countWords(String phrase) {
        String text = phrase.replace("\n", " ");
        String[] textArray = text.split(" ");
        return textArray.length;
    }
}
