package com.example.user.database;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by user on 11/1/2015.
 */
public class Welcome extends Activity{
    DatabaseHelper help = new DatabaseHelper(this);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        long id = help.insertRole("1", "Patient");
        id = help.insertRole("2", "Guardian");
         id = help.insertRole("3", "Doctor");

        ImageView imagev2 = (ImageView) findViewById(R.id.Loginfirst2);
        imagev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Welcome.this, MainActivity.class);
                startActivity(i);
            }
        });


        ImageView imagev = (ImageView)findViewById(R.id.signupfirst2);

        imagev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Welcome.this, Signup.class);
                startActivity(i);
            }
        });



    }


}
