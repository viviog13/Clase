package com.example.alumfial1.clase.Interface;

public interface FactorialInterface {
    interface View{
        void mostrarResultado(String r);
    }
    interface Presenter{
        void mostrarResultado(String r);
        void factorial(String n);
    }
    interface Model{
        void factorial(String n);
    }
}
