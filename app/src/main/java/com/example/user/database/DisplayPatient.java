package com.example.user.database;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 11/26/2015.
 */
public class DisplayPatient extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaypatient);
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView) findViewById(R.id.patientuname);
        tv.setText(username);
        Button btn = (Button) findViewById(R.id.aa);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DisplayPatient.this, Flippy.class);
                startActivity(i);
            }
        });
    }
}
