package com.company.exercicio1;

public class Basico {
    public void deposito() {
        Deposito d = new Deposito();
        d.transacaoNaoOk();
    }

    public void transferencia() {
        Transferencia t = new Transferencia();
        t.transacaoNaoOk();
    }

    public void consultaDeSaldo() {
        ConsultaDeSaldo cds = new ConsultaDeSaldo();
        cds.transacaoOk();
    }

    public void pagamentoDeServico() {
        PagamentoDeServico pds = new PagamentoDeServico();
        pds.transacaoOk();
    }

    public void saqueEmDinheiro() {
        saqueEmDinheiro sed = new saqueEmDinheiro();
        sed.transacaoOk();
    }
}
