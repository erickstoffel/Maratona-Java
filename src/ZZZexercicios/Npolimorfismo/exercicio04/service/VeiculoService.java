package ZZZexercicios.Npolimorfismo.exercicio04.service;

import ZZZexercicios.Npolimorfismo.exercicio04.dominio.Bicicleta;
import ZZZexercicios.Npolimorfismo.exercicio04.dominio.Carro;
import ZZZexercicios.Npolimorfismo.exercicio04.dominio.Veiculo;

public class VeiculoService{
    public static void veiculoService(Veiculo v) {
        if(v instanceof Carro){
           ((Carro) v).abrirPorta();;
        }else if(v instanceof Bicicleta){
            ((Bicicleta) v).pedalar();
        }
    }
}
