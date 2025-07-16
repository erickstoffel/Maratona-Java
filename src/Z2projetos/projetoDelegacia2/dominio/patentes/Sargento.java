package Z2projetos.projetoDelegacia2.dominio.patentes;

import Z2projetos.projetoDelegacia2.dominio.Delegacia;
import Z2projetos.projetoDelegacia2.dominio.Policial;

public class Sargento extends Policial {
    public Sargento(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public int setNivelAcesso() {
        return 2;
    }

    @Override
    public double setSalario() {
        return 9766.16;
    }

    @Override
    public String setDistintivo() {
        Delegacia.numeroDisitinvo.add(Delegacia.numeroDisitinvo.size()+1);
        return "003"+String.valueOf(Delegacia.numeroDisitinvo.size());
    }
}
