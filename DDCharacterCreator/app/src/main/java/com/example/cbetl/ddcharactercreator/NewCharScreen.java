package com.example.cbetl.ddcharactercreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewCharScreen extends AppCompatActivity {

    private String charName = "";
    private String charClass = "";
    private String charRace = "";
    private String charStr = "";
    private String charDex = "";
    private String charCon = "";
    private String charInt = "";
    private String charWis = "";
    private String charCha = "";

    private Toast toastError = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_char_screen);

        Bundle extras = getIntent().getExtras();
        if (extras!=null){
            charName = extras.getString("Name");
            charClass = extras.getString("Class");
            charRace = extras.getString("Race");
            charStr = extras.getString("Strength");
            charDex = extras.getString("Dexterity");
            charCon = extras.getString("Constitution");
            charInt = extras.getString("Intelligence");
            charWis = extras.getString("Wisdom");
            charCha = extras.getString("Charisma");
        }

        Button btnSave = (Button)findViewById(R.id.btnSaveChar);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkData()){
                    Intent nextScreen = new Intent(NewCharScreen.this, LoadCharScreen.class);
                    nextScreen.putExtra("Name", charName);
                    nextScreen.putExtra("Class", charClass);
                    nextScreen.putExtra("Race", charRace);
                    nextScreen.putExtra("Strength", charStr);
                    nextScreen.putExtra("Dexterity", charDex);
                    nextScreen.putExtra("Constitution", charCon);
                    nextScreen.putExtra("Intelligence", charInt);
                    nextScreen.putExtra("Wisdom", charWis);
                    nextScreen.putExtra("Charisma", charCha);

                    startActivity(nextScreen);
                } else {
                    toastError.makeText(getApplicationContext(), "Enter character name", toastError.LENGTH_SHORT).show();
                }
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
