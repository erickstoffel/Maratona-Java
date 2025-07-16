package Z2projetos.projetoDelegacia2.dominio.patentes;

import Z2projetos.projetoDelegacia2.dominio.Delegacia;
import Z2projetos.projetoDelegacia2.dominio.Policial;

public class Cabo extends Policial {
    public Cabo(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public int setNivelAcesso() {
        return 1;
    }

    @Override
    public double setSalario() {
        return 7659.94;
    }

    @Override
    public String setDistintivo() {
        Delegacia.numeroDisitinvo.add(Delegacia.numeroDisitinvo.size()+1);
        return "002"+String.valueOf(Delegacia.numeroDisitinvo.size());
    }
}
