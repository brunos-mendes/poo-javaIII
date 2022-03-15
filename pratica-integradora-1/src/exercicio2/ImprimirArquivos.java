package exercicio2;

public class ImprimirArquivos <T>implements impressao{

    @Override
    public void imprimir(Object arquivo) {
        System.out.println(arquivo.toString());
    }
}
