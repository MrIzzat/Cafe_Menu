package com.example.cafemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaDetails extends AppCompatActivity {

    private ImageView imgPizza;
    private TextView txtPizzaName;
    private TextView txtPizzaDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_details);
        setupViews();

        Intent intent = getIntent();

        Pizza[] pizzas = Pizza.pizzas;


        Pizza chosen = pizzas[(int)intent.getExtras().get("id")];

        imgPizza.setImageResource(chosen.getImg());
        txtPizzaName.setText(chosen.getName());
        txtPizzaDesc.setText(chosen.getDesc());

    }

    private void setupViews() {
        imgPizza = findViewById(R.id.imgPizza);
        txtPizzaName = findViewById(R.id.txtPizzaName);
        txtPizzaDesc = findViewById(R.id.txtPizzaDesc);

    }
}