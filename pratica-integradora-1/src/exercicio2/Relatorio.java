package exercicio2;

public class Relatorio {
    private String texto;
    private Integer n;
    private Integer paginas;
    private String autor;
    private String Revisor;

    public Relatorio(String texto, Integer paginas, String autor, String revisor) {
        this.texto = texto;
        this.n = texto.length();
        this.paginas = paginas;
        this.autor = autor;
        Revisor = revisor;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "texto='" + texto + '\'' +
                ", n=" + n +
                ", paginas=" + paginas +
                ", autor='" + autor + '\'' +
                ", Revisor='" + Revisor + '\'' +
                '}';
    }
}
