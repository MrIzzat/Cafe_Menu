package com.example.cafemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkDetails extends AppCompatActivity {

    private ImageView imgCoffee;
    private TextView txtName;
    private TextView txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_details);
        setupViews();

        Intent intent = getIntent();

        Drink[] Drinks = Drink.drinks;

        Drink chosen = Drinks[(int) intent.getExtras().get("id")];

        imgCoffee.setImageResource(chosen.getImg());
        txtName.setText(chosen.getName());
        txtDesc.setText(chosen.getDesc());

    }

    private void setupViews() {
        imgCoffee = findViewById(R.id.imgCoffee);
        txtName = findViewById(R.id.txtName);
        txtDesc = findViewById(R.id.txtDesc);
    }
}