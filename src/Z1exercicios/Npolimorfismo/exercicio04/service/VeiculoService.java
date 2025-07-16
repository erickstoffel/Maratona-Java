package Z1exercicios.Npolimorfismo.exercicio04.service;

import Z1exercicios.Npolimorfismo.exercicio04.dominio.Bicicleta;
import Z1exercicios.Npolimorfismo.exercicio04.dominio.Carro;
import Z1exercicios.Npolimorfismo.exercicio04.dominio.Veiculo;

public class VeiculoService{
    public static void veiculoService(Veiculo v) {
        if(v instanceof Carro){
           ((Carro) v).abrirPorta();;
        }else if(v instanceof Bicicleta){
            ((Bicicleta) v).pedalar();
        }
    }
}
