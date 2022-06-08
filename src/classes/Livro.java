package classes;

public class Livro {
    private int ISBN;
    private String titulo;
    private String autores;
    private float precVenda;
    private String acabamento;
    private Editora editora;

    //--------------------------------------------

    public Livro(int ISBN, String titulo, String autores, float precVenda, String acabamento, Editora editora) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autores = autores;
        this.precVenda = precVenda;
        this.acabamento = acabamento;
        this.editora = editora;
    }
    


















    //------------------------------------------

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return this.autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }


    public float getPrecVenda() {
        return this.precVenda;
    }

    public void setPrecVenda(float precVenda) {
        this.precVenda = precVenda;
    }
  

    public String getAcabamento() {
        return this.acabamento;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    public Editora getEditora() {
        return this.editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

}
