package exercicio3;

public class Cachorro extends Animal implements Carnivoro{
    public Cachorro() {
        setSom("Auau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo Carne");
    }
}
