package Z2projetos.projetoDelegacia2.dominio.exceptions;

public class nivelAcessoException extends RuntimeException {
    public nivelAcessoException() {
        super("Nível de acesso abaixo do requerido!");
    }

    public nivelAcessoException(String message) {
        super(message);
    }
}
