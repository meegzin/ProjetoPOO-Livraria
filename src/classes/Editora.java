package classes;

public class Editora {
    private int codigo;
    private String nomeEditora;
    private int foneEditora;

    public Editora(int codigo, String nomeEditora, int foneEditora) {
        this.codigo = codigo;
        this.nomeEditora = nomeEditora;
        this.foneEditora = foneEditora;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return "Código:" + this.codigo + "; \nNome da editora: " + this.nomeEditora + "; \nTelefone da editora: " + this.foneEditora;
    }

}
