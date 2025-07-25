package Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    public final String NOMERELATORIO;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.NOMERELATORIO = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for(TipoCliente tipoCliente : values()){
            if(tipoCliente.NOMERELATORIO.equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

}
