package com.company.exercicio1;

public class Executivo {
    public void deposito() {
        Deposito d = new Deposito();
        d.transacaoOk();
    }

    public void transferencia() {
        Transferencia t = new Transferencia();
        t.transacaoOk();
    }

    public void consultaDeSaldo() {
        ConsultaDeSaldo cds = new ConsultaDeSaldo();
        cds.transacaoNaoOk();
    }

    public void pagamentoDeServico() {
        PagamentoDeServico pds = new PagamentoDeServico();
        pds.transacaoNaoOk();
    }

    public void saqueEmDinheiro() {
        saqueEmDinheiro sed = new saqueEmDinheiro();
        sed.transacaoNaoOk();
    }
}
