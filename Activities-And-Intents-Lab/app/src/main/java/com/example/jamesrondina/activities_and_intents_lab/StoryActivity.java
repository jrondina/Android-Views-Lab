package com.example.jamesrondina.activities_and_intents_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    TextView mStory;
    Button mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mStory = (TextView) findViewById(R.id.story);
        mBack = (Button) findViewById(R.id.back);

        Intent getStory = getIntent();

        String adj1 = getStory.getStringExtra("adj1");
        String adj2 = getStory.getStringExtra("adj2");
        String noun1 = getStory.getStringExtra("noun1");
        String noun2 = getStory.getStringExtra("noun2");
        String animals = getStory.getStringExtra("animals");
        String game = getStory.getStringExtra("game");

        mStory.setText("Once upon a time, there was a " + adj1 + " old man in the woods. He lived in a "
        + adj2 + " old cabin with a " + noun1 + " and a " + noun2 + ". The old man loved to eat " +
        animals + " while playing a game of " + game + ".");

        View.OnClickListener back = (new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back = new Intent(view.getContext(), EntryActivity.class);
                startActivity(back);
            }
        });
    mBack.setOnClickListener(back);
    }
}
