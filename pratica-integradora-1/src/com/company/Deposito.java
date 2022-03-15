package com.company;

public class Deposito implements transacao {

    @Override
    public void transacaoOk() {
        System.out.println("Realizando depósito");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Depósito não pode ser realizado");
    }
}
