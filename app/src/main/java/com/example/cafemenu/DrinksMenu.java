package com.example.cafemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinksMenu extends AppCompatActivity {

    private ListView lvDrinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_menu);

        lvDrinks = findViewById(R.id.lvDrinks);

        ArrayAdapter<Drink> listAdapater = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Drink.drinks);

        lvDrinks.setAdapter(listAdapater);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DrinksMenu.this,DrinkDetails.class);
                intent.putExtra("id",(int)id);
                startActivity(intent);
            }
        };

        lvDrinks.setOnItemClickListener(itemClickListener);

    }
}