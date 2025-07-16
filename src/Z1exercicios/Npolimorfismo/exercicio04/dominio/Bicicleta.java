package Z1exercicios.Npolimorfismo.exercicio04.dominio;

public class Bicicleta extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Movendo a bicicleta...");
    }
    public void pedalar(){
        System.out.println("Pedalando a bicicleta...");
    }
}
