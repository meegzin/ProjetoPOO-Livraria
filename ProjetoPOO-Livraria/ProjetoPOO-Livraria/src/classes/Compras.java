package classes;

public class Compras {
    private String ISBNLivro;
    private int quantidade;
    private double preco;
    private double precoTotal;

    public Compras(String ISBNLivro, int quantidade, double preco, double precoTotal) {
        this.ISBNLivro = ISBNLivro;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoTotal = preco * quantidade;
    }

    public Compras(String ISBN, int quantidade) {
        this.ISBNLivro = ISBN;
        this.quantidade = quantidade;
    }

    public String getISBNLivro() {
        return this.ISBNLivro;
    }

    public void setISBNLivro(String ISBNLivro) {
        this.ISBNLivro = ISBNLivro;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoTotal() {
        return this.precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override
    public String toString() {
        return " ISBN: " + getISBNLivro() + "\n" + "quantidade: " + getQuantidade();
    }

}
