package Z2projetos.projetoDelegacia2.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Delegacia {
    static Scanner leitor = new Scanner(System.in);
    public static List<Integer> numeroDisitinvo = new ArrayList<Integer>();
    private String nome;
    private List<Policial> policiais = new ArrayList<Policial>();
    private List<BoletimOcorrencia> casosAbertos = new ArrayList<BoletimOcorrencia>();
    private List<Arma> armas = new ArrayList<Arma>();

    public void adicionarCaso(BoletimOcorrencia boletimOcorrencia) {
        casosAbertos.add(boletimOcorrencia);
        System.out.println("Caso adicionado com sucesso");
    }
    public void resolverCaso(BoletimOcorrencia boletimOcorrencia) {
        casosAbertos.remove(boletimOcorrencia);
        System.out.print("Deseja imprimir o relatorio? (s/n)");
        String resposta = leitor.nextLine().toLowerCase();
        if (resposta.equals("s")) {
            imprimirCaso(boletimOcorrencia);
        }
        System.out.println("Caso resolvido com sucesso!");
    }

    public void imprimirCaso(BoletimOcorrencia boletimOcorrencia) {
        System.out.println("Nome do caso: "+boletimOcorrencia.getNome());
        System.out.println("Descricacao do caso: "+boletimOcorrencia.getDescricao());
        System.out.println("Crime: "+boletimOcorrencia.getCrime().getNOME());
        System.out.println("Policial encarregado: "+boletimOcorrencia.getEncarregado().getNome());
    }

    public void adicionarPolicial(Policial policial) {
        policiais.add(policial);
        System.out.println("Policial adicionado com sucesso");
    }

    public void adicionarArma(Arma arma) {
        armas.add(arma);
        System.out.println("Arma adicionado com sucesso");
    }

    public void removerPolicial(Policial policial) {
        policiais.remove(policial);
        System.out.println("Policial removido com sucesso");
    }

    public void removerArma(Arma arma) {
        armas.remove(arma);
    }

    public void listarCasos(){
        System.out.println("Lista de casos");
        for (BoletimOcorrencia boletimOcorrencia : casosAbertos) {
            System.out.println(boletimOcorrencia.getNome());
            System.out.println(boletimOcorrencia.getDescricao());
        }
    }

    public void listarPoliciais(){
        System.out.println("Lista de policials");
        for (Policial policial : policiais) {
            System.out.println(policial.getNome());
            System.out.println(policial.getDistintivo());
        }
    }
}
