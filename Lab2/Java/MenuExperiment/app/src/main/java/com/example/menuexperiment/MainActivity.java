package com.example.menuexperiment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        // Set up the Toolbar as the Action Bar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Customize the Action Bar's appearance
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("My Custom Action Bar"); // Change the title
            getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_bg)); // Set custom background
            getSupportActionBar().setElevation(10f); // Set elevation (shadow effect)
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu from the XML file
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);  // Inflate the custom menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle menu item selection
        if (item.getItemId() == R.id.action_settings) {
            textView.setText("Settings selected");
            return true;
        } else if (item.getItemId() == R.id.action_general_settings) {
            textView.setText("General Settings selected");
            return true;
        } else if (item.getItemId() == R.id.action_security_settings) {
            textView.setText("Security Settings selected");
            return true;
        } else if (item.getItemId() == R.id.action_about) {
            textView.setText("About selected");
            return true;
        } else if (item.getItemId() == R.id.action_help) {
            textView.setText("Help selected");
            return true;
        } else if (item.getItemId() == R.id.action_faq) {
            textView.setText("FAQ selected");
            return true;
        } else if (item.getItemId() == R.id.action_contact_support) {
            textView.setText("Contact Support selected");
            return true;
        } else if (item.getItemId() == R.id.action_contact_us) {
            textView.setText("Contact Us selected");
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
