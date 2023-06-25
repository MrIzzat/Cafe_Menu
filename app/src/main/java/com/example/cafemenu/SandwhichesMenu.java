package com.example.cafemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SandwhichesMenu extends AppCompatActivity {
    private ListView lvMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwhiches_menu);

        lvMenu = findViewById(R.id.sandwhichMenu);

        ArrayAdapter<Sandwhich> sandwhiches = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Sandwhich.sandwhiches);
        lvMenu.setAdapter(sandwhiches);

        AdapterView.OnItemClickListener ItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SandwhichesMenu.this,SandwhichDetails.class);
                intent.putExtra("id",(int) id);
                startActivity(intent);
            }
        };

        lvMenu.setOnItemClickListener(ItemClickListener);
    }
}