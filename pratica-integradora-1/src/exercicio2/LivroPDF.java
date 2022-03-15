package exercicio2;

public class LivroPDF {
    private Integer numeroDePaginas;
    private  String autor;
    private String titulo;
    private String genero;

    public LivroPDF(Integer numeroDePaginas, String autor, String titulo, String genero) {
        this.numeroDePaginas = numeroDePaginas;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "LivroPDF{" +
                "numeroDePaginas=" + numeroDePaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
