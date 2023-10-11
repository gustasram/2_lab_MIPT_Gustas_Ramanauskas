package com.example.a2_lab_gustas_ramanauskas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edUserInput;
    Button btnCount;
    TextView tvMain;
    Spinner spSelectOptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edUserInput = findViewById(R.id.edUserInput);
        this.btnCount = findViewById(R.id.btnCount);
        this.tvMain = findViewById(R.id.tvMain);
        this.spSelectOptions = (Spinner) findViewById(R.id.spSelectOptions);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.choices_array,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSelectOptions.setAdapter(adapter);
    }


    public void onBtnCountClick(View view){
        String selectedItem = this.spSelectOptions.getSelectedItem().toString();
        if(selectedItem.equalsIgnoreCase("Symbols")) {
            int result = TextCounter.countSymbols(this.edUserInput.getText().toString());
            Log.i("CountResult", String.valueOf(result));
            this.tvMain.setText(String.valueOf(result));
        }
        else if(selectedItem.equalsIgnoreCase("Words")){
            int result = WordCounter.countWords(this.edUserInput.getText().toString());
            Log.i("CountResult", String.valueOf(result));
            this.tvMain.setText(String.valueOf(result));
        }
        else{
            Toast.makeText(this, "Not implemented", Toast.LENGTH_LONG).show();
        }
    }
}