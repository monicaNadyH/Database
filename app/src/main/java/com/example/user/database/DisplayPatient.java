package com.example.user.database;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by user on 11/26/2015.
 */
public class DisplayPatient extends Activity {
    private Toolbar my_toolbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaypatient);
        Typeface my_typeface = Typeface.createFromAsset(getAssets(),"textt.ttf");
        TextView text = (TextView) findViewById(R.id.textone);
        text.setTypeface(my_typeface);
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView) findViewById(R.id.patientuname);
        tv.setText(username);
        tv.setTypeface(my_typeface);
        ImageButton btn = (ImageButton) findViewById(R.id.aa);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DisplayPatient.this, Flippy.class);
                startActivity(i);
            }
        });
    }
}
