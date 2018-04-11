package com.example.alumfial1.clase.Model;

import com.example.alumfial1.clase.Interface.FactorialInterface;

public class FactorialModel implements FactorialInterface.Model{
    private FactorialInterface.Presenter presenter;
    private double resultado;

    public FactorialModel(FactorialInterface.Presenter presenter){
        this.presenter = presenter;
    }


    @Override
    public void factorial(String n) {
        int num = 1;
        int valor = Integer.parseInt(n);
        for (int i =2; i<=valor; i++)
            num = num * i;
        resultado = num;
        presenter.mostrarResultado(String.valueOf(resultado));



    }
}
