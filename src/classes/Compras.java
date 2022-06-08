package classes;

public class Compras {
    private int indentificador;
    private int quantidade;
    private int preco;


    public Compras(int indentificador, int quantidade, int preco) {
        this.indentificador = indentificador;
        this.quantidade = quantidade;
        this.preco = preco;
    }


    public int getIndentificador() {
        return indentificador;
    }


    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public int getPreco() {
        return preco;
    }


    public void setPreco(int preco) {
        this.preco = preco;
    }

    
}
