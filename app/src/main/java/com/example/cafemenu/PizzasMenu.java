package com.example.cafemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PizzasMenu extends AppCompatActivity {

    private ListView lvPizzaMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzas_menu);

        lvPizzaMenu = findViewById(R.id.lvPizzaMenu);

        Pizza[] pizzas = Pizza.pizzas;

        ArrayAdapter<Pizza> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,pizzas);
        lvPizzaMenu.setAdapter(adapter);
        AdapterView.OnItemClickListener ItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PizzasMenu.this,PizzaDetails.class);
                intent.putExtra("id",(int) id);

                startActivity(intent);

            }
        };

        lvPizzaMenu.setOnItemClickListener(ItemClickListener);


    }
}