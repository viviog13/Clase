package com.example.alumfial1.clase.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alumfial1.clase.Interface.FactorialInterface;
import com.example.alumfial1.clase.Presentator.FactorialPresentator;
import com.example.alumfial1.clase.R;

public class FactorialView extends AppCompatActivity implements FactorialInterface.View{
    private EditText numero;
    private Button calcular;
    private TextView mostrar;
    private FactorialInterface.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.alumfial1.clase.R.layout.activity_main);
        numero = (EditText) findViewById(R.id.edtnumero);
        mostrar = (TextView) findViewById(R.id.tvmostrar);

        presenter = new FactorialPresentator(this);
    }

    public void calcular(View view){
        presenter.factorial(numero.getText().toString());


    }
    @Override
    public void mostrarResultado(String r) {
        mostrar.setText(r);
    }
}
