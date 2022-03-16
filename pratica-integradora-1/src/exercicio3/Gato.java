package exercicio3;

public class Gato extends Animal implements Carnivoro{
    public Gato() {
        setSom("miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo paixe");
    }
}
