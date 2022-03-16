package exercicio3;

public class Main {
    public static void main(String[] args) {
        Cachorro fetuccine = new Cachorro();
        Gato tigre = new Gato();
        Vaca mimosa = new Vaca();

        fetuccine.emitirSom();
        tigre.emitirSom();
        mimosa.emitirSom();
        fetuccine.comerCarne();
        tigre.comerCarne();
        mimosa.comerPasto();
    }
}
