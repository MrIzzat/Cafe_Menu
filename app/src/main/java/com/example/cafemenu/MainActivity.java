package com.example.cafemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

        AdapterView.OnItemClickListener itmClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0){
                    Intent intent = new Intent(MainActivity.this, DrinksMenu.class);
                    startActivity(intent);
                }
                if(position ==1){
                    Intent intent = new Intent(MainActivity.this, SandwhichesMenu.class);
                    startActivity(intent);
                }
                if(position ==2){
                    Intent intent = new Intent(MainActivity.this, PizzasMenu.class);
                    startActivity(intent);
                }
            }
        };

        listView.setOnItemClickListener(itmClickListener);

    }

    private void setupViews() {
        listView = findViewById(R.id.mainmenu);
    }


}