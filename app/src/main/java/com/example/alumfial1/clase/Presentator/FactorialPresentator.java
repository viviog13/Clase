package com.example.alumfial1.clase.Presentator;

import com.example.alumfial1.clase.Interface.FactorialInterface;
import com.example.alumfial1.clase.Model.FactorialModel;
import com.example.alumfial1.clase.View.FactorialView;

public class FactorialPresentator implements FactorialInterface.Presenter{
    private FactorialInterface.View view;
    private FactorialInterface.Model model;

    public FactorialPresentator(FactorialView view){
        this.view = (FactorialInterface.View) view;
        model = new FactorialModel(this);
    }
    @Override
    public void mostrarResultado(String r) {
        if(view != null){
            view.mostrarResultado(r);
        }
    }

    @Override
    public void factorial(String n) {
        if(view!=null){
            model.factorial(n);
        }
    }
}
