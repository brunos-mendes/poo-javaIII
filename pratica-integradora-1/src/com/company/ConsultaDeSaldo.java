package com.company;

public class ConsultaDeSaldo implements transacao {
    @Override
    public void transacaoOk() {
        System.out.println("Realizando consulta de saldo");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("consulta de saldo não pode ser realizado");
    }
}
