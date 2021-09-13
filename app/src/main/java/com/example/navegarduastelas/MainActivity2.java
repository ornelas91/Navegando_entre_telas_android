package com.example.navegarduastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnSoma = findViewById(R.id.idbtnSoma);
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtvalor1 = findViewById(R.id.idvalor1);
                EditText txtvalor2 = findViewById(R.id.idvalor2);

                float valor = Float.parseFloat(txtvalor1.getText().toString());
                float valor2 = Float.parseFloat(txtvalor2.getText().toString());

                TextView txtresultado = findViewById(R.id.idresultado);
                txtresultado.setText(" " + (valor + valor2));
            }

        });

        Button btnSubtracao = findViewById(R.id.idbtnSubtracao);
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtvalor1 = findViewById(R.id.idvalor1);
                EditText txtvalor2 = findViewById(R.id.idvalor2);

                float valor = Float.parseFloat(txtvalor1.getText().toString());
                float valor2 = Float.parseFloat(txtvalor2.getText().toString());

                TextView txtresultado = findViewById(R.id.idresultado);
                txtresultado.setText(" " + (valor - valor2));
            }
        });

        Button btnDivisao = findViewById(R.id.idbtndivisao);
        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtvalor1 = findViewById(R.id.idvalor1);
                EditText txtvalor2 = findViewById(R.id.idvalor2);

                float valor = Float.parseFloat(txtvalor1.getText().toString());
                float valor2 = Float.parseFloat(txtvalor2.getText().toString());

                TextView txtresultado = findViewById(R.id.idresultado);
                txtresultado.setText(" " + (valor / valor2));
            }
        });

        Button btnMultiplicacao = findViewById(R.id.idbtnmultiplicacao);
        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtvalor1 = findViewById(R.id.idvalor1);
                EditText txtvalor2 = findViewById(R.id.idvalor2);

                float valor = Float.parseFloat(txtvalor1.getText().toString());
                float valor2 = Float.parseFloat(txtvalor2.getText().toString());

                TextView txtresultado = findViewById(R.id.idresultado);
                txtresultado.setText(" " + (valor * valor2));
            }
        });
    }

    public void voltar(View v) {
        finish();
    }
}