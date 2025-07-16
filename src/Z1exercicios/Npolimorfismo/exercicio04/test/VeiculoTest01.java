package Z1exercicios.Npolimorfismo.exercicio04.test;

import Z1exercicios.Npolimorfismo.exercicio04.dominio.Bicicleta;
import Z1exercicios.Npolimorfismo.exercicio04.dominio.Carro;
import Z1exercicios.Npolimorfismo.exercicio04.dominio.Veiculo;
import Z1exercicios.Npolimorfismo.exercicio04.service.VeiculoService;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Veiculo v1 = new Carro();
        Veiculo v2 = new Carro();
        Veiculo v3 = new Bicicleta();

        VeiculoService.veiculoService(v1);
        VeiculoService.veiculoService(v2);
        VeiculoService.veiculoService(v3);
    }
}
