package exercicio3;

public abstract class Animal {
    private String som;

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void emitirSom() {
        System.out.println(som);
    }
}
