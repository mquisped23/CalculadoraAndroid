package com.edu.calculadoraparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Creamos las variables con su respectiva clase (Button y EditText)
    Button btn_restar, btn_sumar;
    EditText txt_numero1, txt_numero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //dentro del metodo onCreate incializamos las variables
        btn_sumar  = (Button) findViewById(R.id.btn_sumar);
        btn_restar  = (Button) findViewById(R.id.btn_restar);
        txt_numero1 = (EditText) findViewById(R.id.txt_primerNumero);
        txt_numero2 = (EditText) findViewById(R.id.txt_segundoNumero);
    }

    //Creamos un metodo llamado sumar para poder hacer la suma de los dos numeros
    public void Sumar(View view){
        //Obtenemos el primer valor y lo pasamos a string
        String numero1 = txt_numero1.getText().toString();
        //Obtenemos el segundo valor y lo pasamos a string
        String numero2 = txt_numero2.getText().toString();

        //Los valores convertidos a String los parseamos a int
        int n1 = Integer.parseInt(numero1);
        int n2 = Integer.parseInt(numero2);
        //Realizamos la suma
        int suma = n1 + n2;

        //Mostramos por pantalla mediante un Toast
        Toast.makeText(getApplicationContext(), "La suma de los numeros es: "+ suma,Toast.LENGTH_LONG).show();
    }

    //Creamos un metodo llamado Restar para poder hacer la resta de los dos numeros
    public void Restar(View view){
        //Obtenemos el primer valor y lo pasamos a string
        String numero1 = txt_numero1.getText().toString();
        //Obtenemos el segundo valor y lo pasamos a string
        String numero2 = txt_numero2.getText().toString();

        //Los valores convertidos a String los parseamos a int
        int n1 = Integer.parseInt(numero1);
        int n2 = Integer.parseInt(numero2);
        //Realizamos la resta
        int resta = n1 - n2;

        //Mostramos por pantalla mediante un Toast
        Toast.makeText(getApplicationContext(), "La resta de los numeros es: "+ resta,Toast.LENGTH_LONG).show();
    }



}