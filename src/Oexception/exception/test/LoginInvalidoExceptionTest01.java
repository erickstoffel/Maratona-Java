package Oexception.exception.test;

import Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner leitor = new Scanner(System.in);
        String usuario = "Maria";
        String senha = "S2";

        System.out.println("Digite seu usuario: ");
        String usuarioDigitado = leitor.nextLine();
        System.out.println("Digite sua senha: ");
        String senhaDigitada = leitor.nextLine();
        if(!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Login efetuado com sucesso!");
    }
}
