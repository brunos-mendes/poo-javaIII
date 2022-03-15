package exercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> habilidadesBruno = new ArrayList<String>();
        habilidadesBruno.add("Estudar");
        habilidadesBruno.add("Programar");
        Curriculo curriculo = new Curriculo("bruno", "Mendes", "27", habilidadesBruno);
        LivroPDF livro = new LivroPDF(350, "Nina Simone", "It`s a new Life", "Acao");
        Relatorio relatorio = new Relatorio("Estou perdido por aqui nesse role", 3, "Euzinho", "Sobrou p mim");

        ImprimirArquivos<Object> imprimirArquivos = new ImprimirArquivos<Object>();
        imprimirArquivos.imprimir(curriculo);
        imprimirArquivos.imprimir(livro);
        imprimirArquivos.imprimir(relatorio);
    }
}
