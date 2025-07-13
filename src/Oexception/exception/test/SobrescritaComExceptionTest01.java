package Oexception.exception.test;

import Oexception.exception.dominio.Funcionario;
import Oexception.exception.dominio.LoginInvalidoException;
import Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Funcionario f1 = new Funcionario();

        try {
            f1.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
