package com.example.user.database;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 11/1/2015.
 */
public class Welcome extends Activity{
    DatabaseHelper help = new DatabaseHelper(this);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
       // Typeface mytypeface = Typeface.createFromAsset(getAssets(), "textt.ttf");
       // TextView mTextview = (TextView)findViewById(R.id.texty);
       // mTextview.setTypeface(mytypeface);
        long id = help.insertRole("1", "Patient");
        id = help.insertRole("2", "Guardian");
         id = help.insertRole("3", "Doctor");

        Button btn = (Button)findViewById(R.id.Loginfirst);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  help.insertRole();
                Intent i = new Intent(Welcome.this, MainActivity.class);
                startActivity(i);

            }
        });

        Button btn2 = (Button) findViewById(R.id.signupfirst);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Welcome.this, Signup.class);
                startActivity(i);
            }
        });
    }


}
