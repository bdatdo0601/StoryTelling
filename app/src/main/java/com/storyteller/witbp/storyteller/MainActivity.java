package com.storyteller.witbp.storyteller;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String UserID;
    public Intent option_Activity;
    public static void getUserID(String x){
       UserID = x;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView UserName = (TextView) findViewById(R.id.textView);
        UserName.setText(UserID);
        String[] History = {"Story 1", "Story 2","The day my brother evolve", "Gotta lick'em all", "Yolo",  "Pepemon","Frickin' Frick","Dat Ninja Doe"};
        ListAdapter FirstAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, History);
        ListView PastStory = (ListView)findViewById(R.id.listView);
        PastStory.setAdapter(FirstAdapter);
        com.github.clans.fab.FloatingActionButton button1 = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.menu_item);
        com.github.clans.fab.FloatingActionButton button2 = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.menu_item_2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //connect to option_page
                option_Activity = new Intent(MainActivity.this, OptionScreen.class);
                startActivity(option_Activity);
                Toast.makeText(MainActivity.this, "Option page coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //connect to matching session
                Toast.makeText(MainActivity.this, "Matching Session coming soon", Toast.LENGTH_SHORT).show();
            }
        });




    }

}
