package com.storyteller.witbp.storyteller;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String UserID;
    public static void getUserID(String x){
       UserID = x;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView UserName = (TextView) findViewById(R.id.textView);
        UserName.setText(UserID);
        String[] History = {"Story 1", "Story 2","The day my brother evolve", "Gotta lick'em all", "Yolo",  "Pepemon","Frickin' Frick","Dat Ninja Doe"};
        ListAdapter FirstAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, History);
        ListView PastStory = (ListView)findViewById(R.id.listView);
        PastStory.setAdapter(FirstAdapter);


    }

}
