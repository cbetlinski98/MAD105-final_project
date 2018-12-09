package com.example.cbetl.ddcharactercreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_char_screen);

        Bundle extras = getIntent().getExtras();
        if (extras!=null){
            charName = extras.getString("CharacterName");
            charClass = extras.getString("CharacterClass");
            charRace = extras.getString("CharacterRace");
            charStr = extras.getString("CharacterStrength");
            charDex = extras.getString("CharacterDexterity");
            charCon = extras.getString("CharacterConstitution");
            charInt = extras.getString("CharacterIntelligence");
            charWis = extras.getString("CharacterWisdom");
            charCha = extras.getString("CharacterCharisma");
        }

        Button btnSave = (Button)findViewById(R.id.btnSaveChar);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkData())
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
