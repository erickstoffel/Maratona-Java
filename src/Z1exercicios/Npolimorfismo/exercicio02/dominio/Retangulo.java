package Z1exercicios.Npolimorfismo.exercicio02.dominio;

public class Retangulo implements Forma{
    double largura;
    double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Calculando area do retangulo...");
        double area = largura * altura;
        System.out.println("Area: " + area);
    }
}
