package Z1exercicios.Npolimorfismo.exercicio02.test;

import Z1exercicios.Npolimorfismo.exercicio02.dominio.Circulo;
import Z1exercicios.Npolimorfismo.exercicio02.dominio.Forma;
import Z1exercicios.Npolimorfismo.exercicio02.dominio.Retangulo;

public class FormaTest01 {
    public static void main(String[] args) {
        Forma c1 = new Circulo(3);
        Forma c2 = new Circulo(4);
        Forma c3 = new Circulo(5);
        Forma r1 = new Retangulo(2, 2);
        Forma r2 = new Retangulo(3, 3);
        Forma r3 = new Retangulo(4, 4);

        c1.calcularArea();
        c2.calcularArea();
        c3.calcularArea();
        r1.calcularArea();
        r2.calcularArea();
        r3.calcularArea();
    }
}
