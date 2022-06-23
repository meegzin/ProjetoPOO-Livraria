package classes;

public class Editora {
    private String codigoEditora;
    private String nomeEditora;
    private String foneEditora;

    public Editora(String codigoEditora, String nomeEditora, String foneEditora) {
        this.codigoEditora = codigoEditora;
        this.nomeEditora = nomeEditora;
        this.foneEditora = foneEditora;
    }

    public String getCodigoEditora() {
        return this.codigoEditora;
    }

    public void setCodigoEditora(String codigoEditora) {
        this.codigoEditora = codigoEditora;
    }

    public String getNomeEditora() {
        return this.nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getFoneEditora() {
        return this.foneEditora;
    }

    public void setFoneEditora(String foneEditora) {
        this.foneEditora = foneEditora;
    }

    @Override
    public String toString() {
        return "Código: " + this.codigoEditora + "\nNome da editora: " + this.nomeEditora + "\nTelefone da editora: " + this.foneEditora + "\n------------------------------------------";
    }

}
