package com.company.exercicio1;

public class saqueEmDinheiro implements transacao {
    @Override
    public void transacaoOk() {
        System.out.println("Realizando saque em dinheiro");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Saque em dinheiro não pode ser realizado");
    }
}
