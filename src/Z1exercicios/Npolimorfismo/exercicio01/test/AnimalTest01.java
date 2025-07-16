package Z1exercicios.Npolimorfismo.exercicio01.test;

import Z1exercicios.Npolimorfismo.exercicio01.dominio.Animal;
import Z1exercicios.Npolimorfismo.exercicio01.dominio.Cachorro;
import Z1exercicios.Npolimorfismo.exercicio01.dominio.Gato;

public class AnimalTest01 {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        gato.fazerSom();
        cachorro.fazerSom();
    }
}
