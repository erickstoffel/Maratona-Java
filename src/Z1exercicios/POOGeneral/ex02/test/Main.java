package Z1exercicios.POOGeneral.ex02.test;

import Z1exercicios.POOGeneral.ex02.dominio.*;

public class Main {
    public static void main(String[] args) {

        MaterialBiblioteca l1 = new Livro("Seducao com Guxta", 2024, false, "Guxta", Genero.ROMANCE);
        MaterialBiblioteca l2 = new Livro("Naruto", 2022, false, "Motta", Genero.MANGA);
        MaterialBiblioteca r1 = new Revista("Vogue", 2025, false, "2025", MesPublicacao.JULHO);

        Usuario usuario = new Usuario("Erick", "202501");

        usuario.emprestarMaterial(r1);
        usuario.emprestarMaterial(l1);
        usuario.listarMaterialEmprestados();
        usuario.devolverMaterial(l1);
        usuario.listarMaterialEmprestados();
    }
}
