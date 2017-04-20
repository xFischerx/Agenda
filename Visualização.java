package com.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Visualização extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_visualizacao);
    }

    public void Voltar(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void TelaCadastro(View v) {
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

    }
}
