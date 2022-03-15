package com.company.exercicio1;

public class PagamentoDeServico implements  transacao {
    @Override
    public void transacaoOk() {
        System.out.println("Realizando pagamento de servico");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("pagamento de servico não pode ser realizado");
    }
}
