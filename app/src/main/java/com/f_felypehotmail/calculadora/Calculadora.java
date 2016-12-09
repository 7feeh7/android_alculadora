package com.f_felypehotmail.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity {
    EditText ednumero1, ednumero2;
    Button btsomar, btsubtrair, btmultiplicar, btdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        //Instancia dos objetos Campo de Textos
        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);
        //Instancia dos objetos botões
        btsomar = (Button) findViewById(R.id.btsomar);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        btmultiplicar = (Button) findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);

        //Metodo de Somar
        btsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                double soma = num1 + num2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(Calculadora.this);
                dialogo.setTitle("Resultado");
                dialogo.setMessage("A soma é "+soma);
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        });

        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                double soma = num1 - num2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(Calculadora.this);

                dialogo.setTitle("Resultado");
                dialogo.setMessage("A subtração é "+soma);
                dialogo.setNeutralButton("OK",null);
                dialogo.show();

            }
        });

        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                double soma = num1 * num2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(Calculadora.this);

                dialogo.setTitle("Resultado");
                dialogo.setMessage("A multiplicação é "+soma);
                dialogo.setNeutralButton("OK",null);
                dialogo.show();

            }
        });

        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                double soma = num1 / num2;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(Calculadora.this);

                dialogo.setTitle("Resultado");
                dialogo.setMessage("A divisão é "+soma);
                dialogo.setNeutralButton("OK",null);
                dialogo.show();

            }
        });
    }
}
