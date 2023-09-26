package com.mycompany.junit;

public class TransferenciaEntreContas {
    public void transfere(int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
    }
}
