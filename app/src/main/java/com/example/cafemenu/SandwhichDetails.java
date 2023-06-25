package com.example.cafemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SandwhichDetails extends AppCompatActivity {

    private ImageView imgSandwhich;
    private TextView txtName;
    private TextView txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwhich_details);
        setupViews();

        Intent intent = getIntent();

        Sandwhich[] sandwhiches = Sandwhich.sandwhiches;

        Sandwhich chosen = sandwhiches[(int) intent.getExtras().get("id")];

        imgSandwhich.setImageResource(chosen.getImg());
        txtName.setText(chosen.getName());
        txtDesc.setText(chosen.getDesc());
    }

    private void setupViews() {
        imgSandwhich = findViewById(R.id.imgSandwhich);
        txtName = findViewById(R.id.txtName);
        txtDesc = findViewById(R.id.txtDesc);
    }
}