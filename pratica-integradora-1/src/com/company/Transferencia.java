package com.company;

public class Transferencia implements transacao{
    @Override
    public void transacaoOk() {
        System.out.println("Realizando transferencia");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transferencia não pode ser realizado");
    }
}
