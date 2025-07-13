package ZZZexercicios.POOGeneral.ex02.dominio;

import ZZZexercicios.POOGeneral.ex02.service.Emprestavel;

public abstract class MaterialBiblioteca implements Emprestavel {
    private String titulo;
    private int anoPublicacao;
    private boolean emprestado;

    public MaterialBiblioteca(String titulo, int anoPublicacao, boolean emprestado) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = emprestado;
    }

    public void emprestar(){
        this.emprestado = true;
    }

    public void devolver(){
        this.emprestado = false;
    }

    public abstract String getDescricao();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
