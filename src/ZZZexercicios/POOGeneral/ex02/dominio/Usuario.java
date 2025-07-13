package ZZZexercicios.POOGeneral.ex02.dominio;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String matricula;
    private ArrayList<MaterialBiblioteca> materiaisEmprestados = new ArrayList<>();

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void emprestarMaterial(MaterialBiblioteca m) {
        materiaisEmprestados.add(m);
        m.emprestar();
    }
    public void devolverMaterial(MaterialBiblioteca m) {
        materiaisEmprestados.remove(m);
        m.devolver();
    }
    public void listarMaterialEmprestados() {
        for (MaterialBiblioteca m : materiaisEmprestados) {
            System.out.println(m.getDescricao());
        }
    }
}
