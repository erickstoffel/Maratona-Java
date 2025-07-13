package ZZZexercicios.POOGeneral.ex03.dominio;

import ZZZexercicios.POOGeneral.ex03.dominio.enums.Cor;
import ZZZexercicios.POOGeneral.ex03.dominio.enums.Marca;

public class Carro {
    private Marca marca;
    private String modelo;
    private Cor cor;
    private String placa;
    private double valor;

    public Carro(Marca marca, String modelo, Cor cor, String placa, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.valor = valor;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public double getValor() {
        return valor;
    }
}
