package com.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCadastrar;
    Button btnVisuzalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastrar = (Button)findViewById(R.id.btnCadastrar);
        btnVisuzalizar = (Button)findViewById(R.id.btnVisualizar);

        btnCadastrar.setOnClickListener(this);
        btnVisuzalizar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCadastrar:
                Intent intentC = new Intent(this, Cadastro.class);
                startActivity(intentC);
                break;

            case R.id.btnVisualizar:
                Intent intentV = new Intent(this, Visualização.class);
                startActivity(intentV);
                break;
        }
    }
}
