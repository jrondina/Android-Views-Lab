package com.example.jamesrondina.activitylab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button mJailButton;
    EditText mEditText1;
    EditText mEditText2;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJailButton = (Button) findViewById(R.id.jailButton);
        View.OnClickListener JailButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), JailActivity.class);
                intent.putExtra("First Name", 123);
                intent.putExtra("Last Name", "Gibbons");
                startActivity(intent);
            }
        };
        mJailButton.setOnClickListener(JailButtonListener);

    }

}
