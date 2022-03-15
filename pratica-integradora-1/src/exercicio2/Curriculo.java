package exercicio2;

import java.util.ArrayList;

public class Curriculo {
    private String nome;
    private String sobremnome;
    private String idade;
    private ArrayList<String> habilidades;

    public Curriculo(String nome, String sobremnome, String idade, ArrayList<String> habilidades) {
        this.nome = nome;
        this.sobremnome = sobremnome;
        this.idade = idade;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "nome='" + nome + '\'' +
                ", sobremnome='" + sobremnome + '\'' +
                ", idade='" + idade + '\'' +
                ", habilidades=" + habilidades +
                '}';
    }
}
