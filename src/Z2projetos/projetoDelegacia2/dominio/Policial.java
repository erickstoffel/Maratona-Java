package Z2projetos.projetoDelegacia2.dominio;

import Z2projetos.projetoDelegacia2.dominio.BoletimOcorrencia;
import Z2projetos.projetoDelegacia2.dominio.exceptions.nivelAcessoException;

import java.util.ArrayList;
import java.util.List;

public abstract class Policial extends Pessoa{
    private double salario;
    private String distintivo;
    private int casosResolvidos = 0;
    private int nivelAcesso;
    private List<BoletimOcorrencia> casosAbertos = new ArrayList();
    private List<Arma> armas = new ArrayList();

    public Policial(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.nivelAcesso = setNivelAcesso();
        this.salario = setSalario();
        this.distintivo = setDistintivo();
    }

    public abstract double setSalario();
    public abstract String setDistintivo();
    public abstract int setNivelAcesso();

    public void addCasosAberto(BoletimOcorrencia boletimOcorrencia) {
        casosAbertos.add(boletimOcorrencia);
    }
    public void addArmas(Arma arma) throws nivelAcessoException {
        if(this.nivelAcesso >= arma.getNivelAcesso()){
            armas.add(arma);
            System.out.println("Arma adicionada com sucesso!");
        }else{
            throw new nivelAcessoException();
        }
    }

    public double getSalario() {
        return salario;
    }

    public String getDistintivo() {
        return distintivo;
    }

    public int getCasosResolvidos() {
        return casosResolvidos;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public List<BoletimOcorrencia> getCasosAbertos() {
        return casosAbertos;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDistintivo(String distintivo) {
        this.distintivo = distintivo;
    }

    public void setCasosResolvidos(int casosResolvidos) {
        this.casosResolvidos = casosResolvidos;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public void setCasosAbertos(List<BoletimOcorrencia> casosAbertos) {
        this.casosAbertos = casosAbertos;
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }
}
