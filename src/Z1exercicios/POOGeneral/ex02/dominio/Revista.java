package Z1exercicios.POOGeneral.ex02.dominio;

public class Revista extends MaterialBiblioteca{
    private String edicao;
    private MesPublicacao mesPublicacao;

    public Revista(String titulo, int anoPublicacao, boolean emprestado, String edicao, MesPublicacao mesPublicacao) {
        super(titulo, anoPublicacao, emprestado);
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }

    @Override
    public String getDescricao() {
        return "Revista: "+this.getTitulo()+", edição: "+this.edicao+" - "+mesPublicacao.NOME+"/"+this.getAnoPublicacao();
    }
}
