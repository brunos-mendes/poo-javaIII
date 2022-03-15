package com.company;

public class Cobrador {
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
        pds.transacaoNaoOk();
    }

    public void saqueEmDinheiro() {
        saqueEmDinheiro sed = new saqueEmDinheiro();
        sed.transacaoOk();
    }
}
