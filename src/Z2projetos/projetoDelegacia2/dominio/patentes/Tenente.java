package Z2projetos.projetoDelegacia2.dominio.patentes;

import Z2projetos.projetoDelegacia2.dominio.Delegacia;
import Z2projetos.projetoDelegacia2.dominio.Policial;

public class Tenente extends Policial {
    public Tenente(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public int setNivelAcesso() {
        return 3;
    }

    @Override
    public double setSalario() {
        return 13317.51;
    }

    @Override
    public String setDistintivo() {
        Delegacia.numeroDisitinvo.add(Delegacia.numeroDisitinvo.size()+1);
        return "004"+String.valueOf(Delegacia.numeroDisitinvo.size());
    }
}
