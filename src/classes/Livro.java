package classes;

public class Livro {
    private int ISBN;
    private String tituloLivro;
    private String autoresLivro;
    private float precoLivro;
    private String acabamentoLivro;
    private int codigoEditora;




    public Livro(int iSBN, String tituloLivro, String autoresLivro, float precoLivro, String acabamentoLivro,
            int codigoEditora) {
        ISBN = iSBN;
        this.tituloLivro = tituloLivro;
        this.autoresLivro = autoresLivro;
        this.precoLivro = precoLivro;
        this.acabamentoLivro = acabamentoLivro;
        this.codigoEditora = codigoEditora;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
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

    public float getPrecoLivro() {
        return this.precoLivro;
    }

    public void setPrecoLivro(float precoLivro) {
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


}
