package classes;

public class Compras {
    private double ISBNLivro;
    private double quantidade;
    private double preco;
    private double precoTotal;

    public Compras(double ISBNLivro, double quantidade, double preco, double precoTotal) {
        this.ISBNLivro = ISBNLivro;
        this.quantidade = quantidade;
        this.preco = preco;
        this.precoTotal = preco * quantidade;
    }

    public Compras(double ISBN){
        this.ISBNLivro = ISBN;
    }

    public double getISBNLivro() {
        return this.ISBNLivro;
    }

    public void setISBNLivro(double ISBNLivro) {
        this.ISBNLivro = ISBNLivro;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
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

}
