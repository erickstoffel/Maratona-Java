package ZZZexercicios.projetoDelegacia.dominio;

import ZZZexercicios.projetoDelegacia.dominio.enums.Casos;

public class BoletimOcorrencia {
    private String nome;
    private String descricao;
    private int id;
    private Pessoa denunciante;
    private Casos tipoCasos;
    private Oficial encarregado;

    public BoletimOcorrencia(String nome, String descricao, int id, Pessoa denunciante, Casos tipoCasos, Oficial encarregado) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
        this.denunciante = denunciante;
        this.tipoCasos = tipoCasos;
        this.encarregado = encarregado;
        encarregado.adicionarCaso(this);
    }

    public String getNome() {
        return nome;
    }

    public Casos getTipoCasos() {
        return tipoCasos;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public Oficial getEncarregado() {
        return encarregado;
    }

    public Pessoa getDenunciante() {
        return denunciante;
    }
}
