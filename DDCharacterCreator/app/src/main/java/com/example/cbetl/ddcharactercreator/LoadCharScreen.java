package com.example.cbetl.ddcharactercreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        final TextView Name = (TextView) findViewById(R.id.Name);
        final TextView Class = (TextView) findViewById(R.id.Class);
        final TextView Race = (TextView) findViewById(R.id.Race);
        final TextView Str = (TextView) findViewById(R.id.Str);
        final TextView Dex = (TextView) findViewById(R.id.Dex);
        final TextView Con = (TextView) findViewById(R.id.Con);
        final TextView Int = (TextView) findViewById(R.id.Int);
        final TextView Wis = (TextView) findViewById(R.id.Wis);
        final TextView Cha = (TextView) findViewById(R.id.Cha);

        Name.setText(charName);
        Class.setText(charClass);
        Race.setText(charRace);
        Str.setText(charStr);
        Dex.setText(charDex);
        Con.setText(charCon);
        Int.setText(charInt);
        Wis.setText(charWis);
        Cha.setText(charCha);

    }
}
