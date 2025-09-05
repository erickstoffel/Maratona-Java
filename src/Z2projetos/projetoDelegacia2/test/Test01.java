package Z2projetos.projetoDelegacia2.test;

import Z2projetos.projetoDelegacia2.dominio.Arma;
import Z2projetos.projetoDelegacia2.dominio.BoletimOcorrencia;
import Z2projetos.projetoDelegacia2.dominio.Delegacia;
import Z2projetos.projetoDelegacia2.dominio.Policial;
import Z2projetos.projetoDelegacia2.dominio.enums.Crime;
import Z2projetos.projetoDelegacia2.dominio.patentes.Coronel;
import Z2projetos.projetoDelegacia2.dominio.patentes.Soldado;

public class Test01 {
    public static void main(String[] args) {

        Delegacia delegacia = new Delegacia();

        Policial soldado1 = new Soldado("Erick", 18, "044.780.200-35");
        Policial coronel1 = new Coronel("Jose", 56, "111.222.333-44");

        delegacia.adicionarPolicial(soldado1);
        delegacia.adicionarPolicial(coronel1);

        Arma arma1 = new Arma("Soco Ingles", 0, 1);
        Arma arma2 = new Arma("Glock G17", 1, 16);

        delegacia.adicionarArma(arma1);
        delegacia.adicionarArma(arma2);

        BoletimOcorrencia bo1 = new BoletimOcorrencia("Assinato em Serie", "Mataram muito", Crime.ASSASINATO);
        BoletimOcorrencia bo2 = new BoletimOcorrencia("Assalto de idosas", "Assaltaram algumas idosas", Crime.ASSALTO);

        delegacia.adicionarCaso(bo1);
        delegacia.adicionarCaso(bo2);

        delegacia.listarCasos();
        System.out.println("----------");
        delegacia.listarPoliciais();

        bo2.setEncarregado(soldado1);

        delegacia.resolverCaso(bo2);

    }
}
