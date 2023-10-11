package com.example.a2_lab_gustas_ramanauskas;


import android.widget.EditText;
import android.widget.TextView;

public class WordCounter {

    static TextView tvMain;
    static EditText edUserInput;
    public static int countWords(String phrase) {
        String text = edUserInput.getText().toString();
        text = text.replace("\n", " ");
        String[] textArray = text.split(" ");
        return tvMain.setText("Words: " + textArray.length);
    }
}
