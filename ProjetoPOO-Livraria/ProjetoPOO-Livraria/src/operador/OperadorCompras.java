package operador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Compras;

public class OperadorCompras {
    private List<Compras> salvarISBN;

    public OperadorCompras() {
        salvarISBN = new ArrayList<>();
    }

    public void adicionarCarrinho(String isbn, int quantidade) {
        salvarISBN.add(new Compras(isbn, quantidade));
    }

    public void limparCarrinho() {
        for (int i = 0; i < salvarISBN.size(); i++) {
            this.salvarISBN.remove(salvarISBN.get(i));
            // System.out.println("\nEditora removida com sucesso!");
        }

    }

    public void exibirCompras() {
        for (int c = 0; c < this.salvarISBN.size(); c++) {
            System.out.println(this.salvarISBN.get(c));
        }
    }
}
