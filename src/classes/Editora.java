package classes;

public class Editora {
    private int codigoEditora;
    private String nomeEditora;
    private int foneEditora;

    public Editora(int codigoEditora, String nomeEditora, int foneEditora) {
        this.codigoEditora = codigoEditora;
        this.nomeEditora = nomeEditora;
        this.foneEditora = foneEditora;
    }

    public int getCodigoEditora() {
        return this.codigoEditora;
    }

    public void setCodigoEditora(int codigoEditora) {
        this.codigoEditora = codigoEditora;
    }

    public String getNomeEditora() {
        return this.nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public int getFoneEditora() {
        return this.foneEditora;
    }

    public void setFoneEditora(int foneEditora) {
        this.foneEditora = foneEditora;
    }

    @Override
    public String toString() {
        return "Código: " + this.codigoEditora + "\nNome da editora: " + this.nomeEditora + "\nTelefone da editora: " + this.foneEditora + "\n------------------------------------------";
    }

}
