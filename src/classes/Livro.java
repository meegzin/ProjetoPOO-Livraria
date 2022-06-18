package classes;

public class Livro {
    private Double ISBN;
    private String tituloLivro;
    private String autoresLivro;
    private double precoLivro;
    private String acabamentoLivro;
    private int codigoEditora;
    

    public Livro(Double iSBN, String tituloLivro, String autoresLivro, float precoLivro, String acabamentoLivro,
            int codigoEditora) {
        this.ISBN = iSBN;
        this.tituloLivro = tituloLivro;
        this.autoresLivro = autoresLivro;
        this.precoLivro = precoLivro;
        this.acabamentoLivro = acabamentoLivro;
        this.codigoEditora = codigoEditora;
    }

    public Double getISBN() {
        return this.ISBN;
    }

    public void setISBN(Double ISBN) {
        this.ISBN = ISBN;
    }

    public String getTituloLivro() {
        return this.tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutoresLivro() {
        return this.autoresLivro;
    }

    public void setAutoresLivro(String autoresLivro) {
        this.autoresLivro = autoresLivro;
    }

    public Double getPrecoLivro() {
        return this.precoLivro;
    }

    public void setPrecoLivro(Double precoLivro) {
        this.precoLivro = precoLivro;
    }

    public String getAcabamentoLivro() {
        return this.acabamentoLivro;
    }

    public void setAcabamentoLivro(String acabamentoLivro) {
        this.acabamentoLivro = acabamentoLivro;
    }

    public int getCodigoEditora() {
        return this.codigoEditora;
    }

    public void setCodigoEditora(int codigoEditora) {
        this.codigoEditora = codigoEditora;
    }

@Override
    public String toString() {
        return "ISBN: " + this.ISBN + "\nTitulo: " + this.tituloLivro + "\nAutores: " + this.autoresLivro + "\nPreço: " + this.precoLivro + "\nAcabamento: " + this.acabamentoLivro + "\nCodigo da editora: " + this.codigoEditora + "\n------------------------------------------";
    }

}
