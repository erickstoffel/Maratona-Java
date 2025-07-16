package Z2projetos.projetoDelegacia.dominio;

import java.util.ArrayList;
import java.util.List;

public class Delegacia {
    private String nome;
    private List<Oficial> oficiais = new ArrayList<Oficial>();
    private List<BoletimOcorrencia> casosAbertos = new ArrayList<BoletimOcorrencia>();

    public void adicionarBO(BoletimOcorrencia boletimOcorrencia) {
        casosAbertos.add(boletimOcorrencia);
    }

    public void resolverBO(BoletimOcorrencia boletimOcorrencia) {
        System.out.println("Caso resolvido!");
        System.out.println("Registro:");
        System.out.println("Nome: " + boletimOcorrencia.getNome());
        System.out.println("Descricao: " + boletimOcorrencia.getDescricao());
        System.out.println("Id: " + boletimOcorrencia.getId());
        System.out.println("Denunciante: " + boletimOcorrencia.getDenunciante().getNome());
        System.out.println("Tipo caso: " + boletimOcorrencia.getTipoCasos().getCASO());
        System.out.println("Oficial encarregado: " + boletimOcorrencia.getEncarregado().getNome());
        boletimOcorrencia.getEncarregado().adicionarCasosResolvidos();
        boletimOcorrencia.getEncarregado().removerCaso(boletimOcorrencia);
        casosAbertos.remove(boletimOcorrencia);
    }

    public void cadastrarOficial(Oficial oficiais) {
        this.oficiais.add(oficiais);
    }

    public void removerOficial(Oficial oficiais) {
        this.oficiais.remove(oficiais);
    }

    public void listarOficials() {
        for (Oficial oficiais : oficiais) {
            oficiais.imprimir();
        }
    }

    public void listarCasos() {
        for (BoletimOcorrencia caso : casosAbertos) {
            System.out.println(caso.getNome());
            System.out.println(caso.getDescricao());
            System.out.println(caso.getId());
            System.out.println(caso.getDenunciante().getNome());
            System.out.println(caso.getTipoCasos().getCASO());
            System.out.println(caso.getEncarregado().getNome());
        }
    }


}
