package Z2projetos.projetoDelegacia2.dominio.patentes;

import Z2projetos.projetoDelegacia2.dominio.Delegacia;
import Z2projetos.projetoDelegacia2.dominio.Policial;

public class Soldado extends Policial{
    public Soldado(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public int setNivelAcesso() {
        return 0;
    }

    @Override
    public double setSalario() {
        return 5944.85;
    }

    @Override
    public String setDistintivo() {
        Delegacia.numeroDisitinvo.add(Delegacia.numeroDisitinvo.size()+1);
        return "001"+String.valueOf(Delegacia.numeroDisitinvo.size());
    }
}
