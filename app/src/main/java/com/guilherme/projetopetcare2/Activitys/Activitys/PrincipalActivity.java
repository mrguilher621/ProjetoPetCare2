package com.guilherme.projetopetcare2.Activitys.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.guilherme.projetopetcare2.R;

public class PrincipalActivity extends AppCompatActivity {

    private TextView tvAbreCadastroPet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        tvAbreCadastroPet = (TextView) findViewById(R.id.tvAbreCadastroPet);

        tvAbreCadastroPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abreCadastroPet();
            }
        });
    }

    public void abreCadastroPet(){
        Intent intent = new Intent(PrincipalActivity.this, CadastroPetActivity.class);
        startActivity(intent);
    }
}
