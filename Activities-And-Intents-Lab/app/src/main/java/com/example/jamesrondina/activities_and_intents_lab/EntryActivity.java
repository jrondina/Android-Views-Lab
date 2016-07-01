package com.example.jamesrondina.activities_and_intents_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class EntryActivity extends AppCompatActivity {

    EditText mAdjective1;
    EditText mAdjective2;
    EditText mNoun1;
    EditText mNoun2;
    EditText mAnimals;
    EditText mGame;
    Button mSubmit;

    //private ArrayList<String> words = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        mAdjective1 = (EditText) findViewById(R.id.adjective1);
        mAdjective2 = (EditText) findViewById(R.id.adjective2);
        mNoun1= (EditText) findViewById(R.id.noun1);
        mNoun2 = (EditText) findViewById(R.id.noun2);
        mAnimals = (EditText) findViewById(R.id.animals);
        mGame = (EditText) findViewById(R.id.nameOfGame);
        mSubmit = (Button) findViewById(R.id.submit);

        View.OnClickListener submitListen = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(checkText()) {

                    Intent story = new Intent(EntryActivity.this, StoryActivity.class);
                    story.putExtra("adj1", mAdjective1.getText().toString());
                    story.putExtra("adj2", mAdjective2.getText().toString());
                    story.putExtra("noun1", mNoun1.getText().toString());
                    story.putExtra("noun2", mNoun2.getText().toString());
                    story.putExtra("animals", mAnimals.getText().toString());
                    story.putExtra("game", mGame.getText().toString());


                    startActivity(story);
                }
            }

        };

        mSubmit.setOnClickListener(submitListen);

    }

    private boolean checkText() {

        if (mAdjective1.getText().toString().length() == 0) {
            mAdjective1.setError("Enter a word!");
            return false;
        }

        if (mAdjective2.getText().toString().length() == 0) {
            mAdjective2.setError("Enter a word!");
            return false;
        }

        if (mNoun1.getText().toString().length() == 0) {
            mNoun1.setError("Enter a word!");
            return false;
        }

        if (mNoun2.getText().toString().length() == 0) {
            mNoun2.setError("Enter a word!");
            return false;
        }

        if (mAnimals.getText().toString().length() == 0) {
            mAnimals.setError("Enter a word!");
            return false;
        }

        if (mGame.getText().toString().length() == 0) {
            mGame.setError("Enter a word!");
            return false;
        }

        return true;
    }
}
