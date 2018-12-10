package com.example.cbetl.ddcharactercreator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoadCharScreen extends AppCompatActivity {

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
        setContentView(R.layout.activity_load_char_screen);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
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

        final TextView txtCharacter = (TextView) findViewById(R.id.txtCharacter);

    }
}
