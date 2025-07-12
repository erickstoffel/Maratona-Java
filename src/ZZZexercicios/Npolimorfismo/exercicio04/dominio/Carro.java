package ZZZexercicios.Npolimorfismo.exercicio04.dominio;

public class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Movendo o carro...");
    }
    public void abrirPorta(){
        System.out.println("Abrindo a porta...");
    }
}
