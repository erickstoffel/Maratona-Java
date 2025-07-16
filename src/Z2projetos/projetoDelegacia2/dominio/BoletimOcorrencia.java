package Z2projetos.projetoDelegacia2.dominio;

import Z2projetos.projetoDelegacia2.dominio.enums.Crime;
import Z2projetos.projetoDelegacia2.dominio.exceptions.nivelAcessoException;

public class BoletimOcorrencia {
    private String nome;
    private String descricao;
    private Crime crime;
    private int nivelAcesso;
    private Policial encarregado;

    public BoletimOcorrencia(String nome, String descricao, Crime crime) {
        this.nome = nome;
        this.descricao = descricao;
        this.crime = crime;
        this.nivelAcesso = crime.getNivelAcesso();
    }

    public void setEncarregado(Policial encarregado) throws nivelAcessoException {
        if(encarregado.getNivelAcesso() >= this.nivelAcesso){
            this.encarregado = encarregado;
            encarregado.addCasosAberto(this);
            System.out.println("Policial encarregado adicionado com sucesso!");
        }else {
            throw new nivelAcessoException();
        }
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Crime getCrime() {
        return crime;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public Policial getEncarregado() {
        return encarregado;
    }
}
