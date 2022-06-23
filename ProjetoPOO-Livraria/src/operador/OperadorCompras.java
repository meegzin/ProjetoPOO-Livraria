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

    public void adicionarCarrinho(double isbn) {
        salvarISBN.add(new Compras(isbn));
    }

 public void limparCarrinho() {
        for (int i = 0; i < salvarISBN.size(); i++) {
            this.salvarISBN.remove(salvarISBN.get(i));
            // System.out.println("\nEditora removida com sucesso!");
        }
        
    }
}
