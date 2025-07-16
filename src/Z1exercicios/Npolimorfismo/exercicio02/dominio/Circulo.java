package Z1exercicios.Npolimorfismo.exercicio02.dominio;

public class Circulo implements Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Calculando area do circulo...");
        double area = Math.pow(this.raio, 2) * Math.PI;
        System.out.println("Area: " + area);
    }
}
