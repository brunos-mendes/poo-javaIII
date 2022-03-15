package com.company.exercicio1;

public class Main {

    public static void main(String[] args) {
	    Executivo executivo = new Executivo();
	    Basico basico = new Basico();
	    Cobrador cobrador = new Cobrador();
	    executivo.deposito();
	    executivo.pagamentoDeServico();
	    basico.consultaDeSaldo();
	    basico.deposito();
	    cobrador.saqueEmDinheiro();
	    cobrador.pagamentoDeServico();
    }
}
