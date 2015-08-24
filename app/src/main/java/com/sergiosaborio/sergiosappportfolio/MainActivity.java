package com.sergiosaborio.sergiosappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Define activity variables */
        final Context context;
        final int duration;
        //UI variable
        Button button;

        //Get app context
        context = getApplicationContext();

        //Set toast duration as short
        duration = Toast.LENGTH_SHORT;

        /* Set button's click listeners */
        // Built it bigger button
        button = (Button) findViewById(R.id.button_build_it_bigger);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final CharSequence text = "This button will launch my Built it bigger app!";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        // Library button
        button = (Button) findViewById(R.id.button_library_app);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final CharSequence text = "This button will launch my Library app!";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        // Scores button
        button = (Button) findViewById(R.id.button_scores_app);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final CharSequence text = "This button will launch my Scores app!";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        // Spotify Streamer button
        button = (Button) findViewById(R.id.button_spotify_streamer);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final CharSequence text = "This button will launch my Spotify Streamer app!";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        // XYZ Reader button
        button = (Button) findViewById(R.id.button_xyz_reader);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final CharSequence text = "This button will launch my XYZ Reader app!";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        // Capstone button
        button = (Button) findViewById(R.id.button_capstone);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final CharSequence text = "This button will launch my Capstone app!";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
