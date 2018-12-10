package com.example.cbetl.ddcharactercreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class NewCharScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_char_screen);

        final EditText charName = (EditText) findViewById(R.id.txtNameInput);

        final Spinner charClass = (Spinner) findViewById(R.id.spnClass);
        final Spinner charRace = (Spinner) findViewById(R.id.spnRace);
        final Spinner charStr = (Spinner) findViewById(R.id.spnStr);
        final Spinner charDex = (Spinner) findViewById(R.id.spnDex);
        final Spinner charCon = (Spinner) findViewById(R.id.spnCon);
        final Spinner charInt = (Spinner) findViewById(R.id.spnInt);
        final Spinner charWis = (Spinner) findViewById(R.id.spnWis);
        final Spinner charCha = (Spinner) findViewById(R.id.spnCha);

        final Button btnSave = (Button)findViewById(R.id.btnSaveChar);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent((new Intent(NewCharScreen.this, LoadCharScreen.class)));
                nextScreen.putExtra("Name", charName.getText().toString());
                nextScreen.putExtra("Class", charClass.getSelectedItem().toString());
                nextScreen.putExtra("Race", charRace.getSelectedItem().toString());
                nextScreen.putExtra("Strength", charStr.getSelectedItem().toString());
                nextScreen.putExtra("Dexterity", charDex.getSelectedItem().toString());
                nextScreen.putExtra("Constitution", charCon.getSelectedItem().toString());
                nextScreen.putExtra("Intelligence", charInt.getSelectedItem().toString());
                nextScreen.putExtra("Wisdom", charWis.getSelectedItem().toString());
                nextScreen.putExtra("Charisma", charCha.getSelectedItem().toString());
                startActivity(nextScreen);
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
