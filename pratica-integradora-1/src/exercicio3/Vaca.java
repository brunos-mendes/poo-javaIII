package exercicio3;

public class Vaca extends Animal implements Herbivoro{
    public Vaca() {
        setSom("mu");
    }

    @Override
    public void comerPasto() {
        System.out.println("Comendo umas graminhas");
    }
}
