package Oexception.exception.dominio;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoException{
        System.out.println("Funcionario salvo com sucesso");
    }
}
