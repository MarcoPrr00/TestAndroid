package com.example.testandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RubricaContatti extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubrica_contatti);
    }

    @Override
    protected void onResume()
    {
        /* Tramite id trovo il button */
        View addButton = findViewById(R.id.addContactButton);
        /* Definisco un listener di tipo onclick */
        addButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(),AggiungiContatto.class);
                startActivity(i);
            }
        });
        super.onResume();
    }
}