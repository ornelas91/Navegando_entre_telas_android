package com.example.navegarduastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalcular = findViewById(R.id.idbtnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtvalor1 = findViewById(R.id.idAltura);
                EditText txtvalor2 = findViewById(R.id.idPeso);

                float valor1 = Float.parseFloat(txtvalor1.getText().toString());
                float valor2 = Float.parseFloat(txtvalor2.getText().toString());

                TextView txtresultado = findViewById(R.id.idresultado2);
                txtresultado.setText(" " + valor2/(valor1 * valor1));
            }

        });
    }

    public void abrirCalculadora(View v) {
        Intent intencao = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(intencao);
    }

    public void voltar(View v) {
        finish();
    }


}