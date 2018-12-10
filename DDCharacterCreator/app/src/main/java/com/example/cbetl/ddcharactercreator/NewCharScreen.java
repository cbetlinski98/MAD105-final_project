package com.example.cbetl.ddcharactercreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewCharScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_char_screen);

        Button btnSave = (Button)findViewById(R.id.btnSaveChar);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(NewCharScreen.this, HomeScreen.class));
                }
        });

        Button btnEx = (Button)findViewById(R.id.btnExplanation);
        btnEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewCharScreen.this, ExplanationScreen.class));
            }
        });
    }

    private boolean checkData(){
        final EditText charName = (EditText) findViewById(R.id.txtNameInput);

        if (charName.getText().toString().isEmpty()){
            charName.setError("Enter character name");
            charName.requestFocus();
            return false;
        }

        return true;
    }
}
