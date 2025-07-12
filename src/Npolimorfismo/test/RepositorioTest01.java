package Npolimorfismo.test;

import Npolimorfismo.repositorio.Repositorio;
import Npolimorfismo.servico.RepositorioArquivo;
import Npolimorfismo.servico.RepositorioBancoDeDados;
import Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Erick");
        list.add("Maria");
        System.out.println(list);
    }
}
