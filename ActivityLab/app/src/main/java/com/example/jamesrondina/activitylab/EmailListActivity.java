package com.example.jamesrondina.activitylab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailListActivity extends AppCompatActivity {
    Button mNewEmailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_list);

        mNewEmailButton = (Button) findViewById(R.id.button_new_email);
        View.OnClickListener emailButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),WriteEmailActivity.class);
                startActivity(intent);

            }
        };
        mNewEmailButton.setOnClickListener(emailButtonListener);
    }
}
