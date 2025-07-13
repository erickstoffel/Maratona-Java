package ZZZexercicios.POOGeneral.ex02.dominio;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<MaterialBiblioteca> lista = new ArrayList<MaterialBiblioteca>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public void adicionarMaterial(MaterialBiblioteca m) {
        lista.add(m);
    }
    public void adicionarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void listarTodosMateriais(){
        for(MaterialBiblioteca m : lista){
            System.out.println(m.toString());
        }
    }
    public void listarTodosUsuarios(){
        for(Usuario u : usuarios){
            System.out.println(u.toString());
        }
    }
}
