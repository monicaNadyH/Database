package com.example.user.database;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    public static String password;
    public static  String username;
    public static String urole;
DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void onButtonClick(View v)
    {

        if(v.getId() == R.id.loginbtn)
        {
            EditText a = (EditText) findViewById(R.id.usernametxt);
            String str = a.getText().toString();

            EditText b = (EditText) findViewById(R.id.passwordtxt);
            String pass = b.getText().toString();

              password= helper.searchpass(str);
              username= helper.searchuname(pass);
                urole = helper.searchrole(str, pass);

            System.out.println("this role is: "+ urole);

                System.out.println("again this role is: "+ urole);




              if (pass.equals(password) && str.equals(username)) {
                  if (urole.equals("1")) {
                      Intent i = new Intent(MainActivity.this, DisplayPatient.class);
                      i.putExtra("Username", str);
                      //Bundle bn = new Bundle();
                      // bn.putString("username", username);
                      // bn.putString("password", password);
                      // i.putExtras(bn);
                      startActivity(i);
                  }
                  else if(urole.equals("2"))
                  {
                      Intent i = new Intent(MainActivity.this, Display.class);
                      i.putExtra("Username", str);
                      //Bundle bn = new Bundle();
                      // bn.putString("username", username);
                      // bn.putString("password", password);
                      // i.putExtras(bn);
                      startActivity(i);
                  }
                  else if(urole.equals("3"))
                  {
                      Intent i = new Intent(MainActivity.this, DisplayDoctor.class);
                      i.putExtra("Username", str);
                      //Bundle bn = new Bundle();
                      // bn.putString("username", username);
                      // bn.putString("password", password);
                      // i.putExtras(bn);
                      startActivity(i);
                  }
              }
                 else {
                    Toast.makeText(MainActivity.this, "Username and password don't match!", Toast.LENGTH_LONG).show();

              }


        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
