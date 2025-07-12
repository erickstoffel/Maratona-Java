package ZZZexercicios.Npolimorfismo.exercicio01.test;

import ZZZexercicios.Npolimorfismo.exercicio01.dominio.Animal;
import ZZZexercicios.Npolimorfismo.exercicio01.dominio.Cachorro;
import ZZZexercicios.Npolimorfismo.exercicio01.dominio.Gato;

public class AnimalTest01 {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        gato.fazerSom();
        cachorro.fazerSom();
    }
}
