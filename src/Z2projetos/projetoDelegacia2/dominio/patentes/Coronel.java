package Z2projetos.projetoDelegacia2.dominio.patentes;

import Z2projetos.projetoDelegacia2.dominio.Delegacia;
import Z2projetos.projetoDelegacia2.dominio.Policial;

public class Coronel extends Policial {
    public Coronel(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public int setNivelAcesso() {
        return 4;
    }

    @Override
    public double setSalario() {
        return 29594.45;
    }

    @Override
    public String setDistintivo() {
        Delegacia.numeroDisitinvo.add(Delegacia.numeroDisitinvo.size()+1);
        return "005"+String.valueOf(Delegacia.numeroDisitinvo.size());
    }
}