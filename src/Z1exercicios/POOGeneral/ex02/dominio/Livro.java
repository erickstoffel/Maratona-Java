package Z1exercicios.POOGeneral.ex02.dominio;

public class Livro extends MaterialBiblioteca{
    private String autor;
    private Genero genero;

    public Livro(String titulo, int anoPublicacao, boolean emprestado, String autor, Genero genero) {
        super(titulo, anoPublicacao, emprestado);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public String getDescricao() {
        return "Livro: "+this.getTitulo()+", "+this.autor+", "+this.getAnoPublicacao()+", "+this.genero;
    }

}
