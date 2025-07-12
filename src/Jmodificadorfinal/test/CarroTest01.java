package Jmodificadorfinal.test;

import Jmodificadorfinal.dominio.Carro;
import Jmodificadorfinal.dominio.Comprador;
import Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Jose");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Italia");
        ferrari.imprime();
    }
}
