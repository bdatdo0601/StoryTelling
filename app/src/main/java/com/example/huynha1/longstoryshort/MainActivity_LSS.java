package com.example.huynha1.longstoryshort;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_LSS extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity__lss);
        button = (Button) findViewById(R.id.bText);
        button.setOnClickListener(
                      new View.OnClickListener() {
                        @Override
                       public void onClick(View v) {
                        Intent intent = new Intent(MainActivity_LSS.this, TextOptionDemo.class);
                        startActivity(intent);
                        }

    } );
    }
}





