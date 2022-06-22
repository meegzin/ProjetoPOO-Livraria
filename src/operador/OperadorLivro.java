package operador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Livro;
import operador.OperadorEditora;

public class OperadorLivro {
    private List<Livro> livro;
    OperadorEditora editora = new OperadorEditora();

    public OperadorLivro() {
        livro = new ArrayList<>();
    }

    public Livro buscarISBN(Double ISBNBuscado) {
        for (int c = 0; c < this.livro.size(); c++) {
            if (this.livro.get(c).getISBN() == ISBNBuscado) {
                System.out.println(this.livro.get(c));
                return this.livro.get(c);
            }
        }
        return null;
    }

    public Livro buscarTitulo(String tituloBuscado) {
        for (int c = 0; c < this.livro.size(); c++) {
            if (this.livro.get(c).getTituloLivro().equals(tituloBuscado)) {
                System.out.println(this.livro.get(c));
                return this.livro.get(c);
            }
        }
        return null;
    }

    public boolean validarISBN(Double ISBNBuscado) {
        for (int c = 0; c < this.livro.size(); c++) {
            if (this.livro.get(c).getISBN() == ISBNBuscado) {
                return true;
            }
        }
        return false;
    }

    public Double buscarPreco(Double ISBN) {
        for (int c = 0; c < this.livro.size(); c++) {
            if (this.livro.get(c).getISBN() == ISBN) {
                return this.livro.get(c).getPrecoLivro();
            }
        }
        return null;
    }

    public void exibirLivro() {
        for (int c = 0; c < this.livro.size(); c++) {
            System.out.println(this.livro.get(c));
        }
    }

    public void adicioniarLivro(double ISBN, int codigoBuscado) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Digite o titulo do livro: ");
        String tituloLivro = sc.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autoresLivro = sc.nextLine();

        System.out.print("Digite o preço do livro: ");
        float precoLivro = sc.nextFloat();

        String acabamentoLivro = "";
        int tipoAcabamentoLivro;
        do {
            System.out.println("Escolha o acabamento do livro: ");
            System.out.println("caso deseje sair digite 0");
            System.out.println("[1] Brochura \n[2] Encadernado \n[3] Especial");
            tipoAcabamentoLivro = sc.nextInt();

            if (tipoAcabamentoLivro == 1)
                acabamentoLivro = "brochura";
            else if (tipoAcabamentoLivro == 2)
                acabamentoLivro = "encadernado";
            else if (tipoAcabamentoLivro == 3)
                acabamentoLivro = "especial";
            else
                System.out.println("Escolha uma opção valida");
        } while ((tipoAcabamentoLivro == 0) && (tipoAcabamentoLivro < 1) || (tipoAcabamentoLivro > 3));

        System.out.println(ISBN + " " + codigoBuscado);
        Livro novoLivro = new Livro(ISBN, tituloLivro, autoresLivro, precoLivro, acabamentoLivro,
                codigoBuscado);
        this.livro.add(novoLivro);
        System.out.println("\nLivro cadastrado com sucesso!");
    }

    public void editarISBN() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ISBN do livro: ");
        double ISBNAtual = sc.nextDouble();
        Livro encontrada = buscarISBN(ISBNAtual);
        if (encontrada == null) {
            System.out.println("\nLivro não cadastrado!");
            return;
        }

        System.out.print("Digite o novo ISBN do livro: ");
        double novoISBN = sc.nextDouble();
        if (buscarISBN(novoISBN) != null) {
            System.out.println("\nEditora já cadastrada anteriormente!");
            return;
        } else {
            encontrada.setISBN(novoISBN);
            System.out.println("\nALTERADO COM SUCESSO!!");
        }

    }

    public void editarTitulo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ISBN do livro: ");
        double ISBNAtual = sc.nextDouble();
        Livro encontrada = buscarISBN(ISBNAtual);
        if (encontrada == null) {
            System.out.println("\nLivro não cadastrado!");
            return;
        }
        System.out.print("Digite o novo novo do livro: ");
        String novoTitulo = sc.nextLine();
        if (buscarTitulo(novoTitulo) != null) {
            System.out.println("\nTitulo do livro já cadastrada anteriormente!");
            return;
        } else {
            encontrada.setTituloLivro(novoTitulo);
            System.out.println("\nALTERADO COM SUCESSO!!");
        }
    }

    public void editarAutores() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ISBN do livro: ");
        double ISBNAtual = sc.nextDouble();
        Livro encontrada = buscarISBN(ISBNAtual);
        if (encontrada == null) {
            System.out.println("\nLivro não cadastrado!");
            return;
        } else {
            System.out.print("Digite o novo nome dos autores: ");
            String novoAutor = sc.nextLine();
            encontrada.setAutoresLivro(novoAutor);
            System.out.println("\nALTERADO COM SUCESSO!!");
        }
    }

    public void editarAcabamentos() {
        Scanner sc = new Scanner(System.in);
        String acabamentoLivro = "";
        int tipoAcabamentoLivro;

        System.out.print("\nDigite o ISBN do livro: ");
        double ISBNAtual = sc.nextDouble();
        Livro encontrada = buscarISBN(ISBNAtual);
        if (encontrada == null) {
            System.out.println("\nLivro não cadastrado!");
            return;
        } else {

            do {
                System.out.println("Escolha o acabamento do livro: ");
                System.out.println("[1] Brochura \n[2] Encadernado \n[3] Especial");
                tipoAcabamentoLivro = sc.nextInt();

                if (tipoAcabamentoLivro == 1)
                    acabamentoLivro = "brocura";
                else if (tipoAcabamentoLivro == 2)
                    acabamentoLivro = "encadernado";
                else if (tipoAcabamentoLivro == 3)
                    acabamentoLivro = "especial";
                else
                    System.out.println("Escolha uma opção valida");
            } while ((tipoAcabamentoLivro < 1) || (tipoAcabamentoLivro > 3));
            encontrada.setAcabamentoLivro(acabamentoLivro);
            System.out.println("\nALTERADO COM SUCESSO!!");
        }
    }

    public void editarPreco() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ISBN do livro: ");
        double ISBNAtual = sc.nextDouble();
        Livro encontrada = buscarISBN(ISBNAtual);
        if (encontrada == null) {
            System.out.println("\nLivro não cadastrado!");
            return;
        } else {
            System.out.print("Digite o novo valor do livro: ");
            double novoValor = sc.nextFloat();
            encontrada.setPrecoLivro(novoValor);
            System.out.println("\nALTERADO COM SUCESSO!!");
        }
    }

    public void editarCodigoEditora() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ISBN do livro: ");
        double ISBNAtual = sc.nextDouble();
        Livro encontrada = buscarISBN(ISBNAtual);
        if (encontrada == null) {
            System.out.println("\nLivro não cadastrado!");
            return;
        } else {

            System.out.print("\nDigite o novo codigo da editora do livro: ");
            int codigoBuscado = sc.nextInt();
            if (editora.buscarCodigo(codigoBuscado) != null) {
                System.out.println("\nCodigo de editora ja cadastrado em outro registros");

            } else {
                encontrada.setCodigoEditora(codigoBuscado);
                System.out.println("\nALTERADO COM SUCESSO!!");
            }
        }
    }

    public void removerLivro() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ISBN do livro: ");
        double ISBNAtual = sc.nextDouble();
        Livro encontrada = buscarISBN(ISBNAtual);
        if (encontrada == null) {
            System.out.println("\nLivro não cadastrado!");
            return;
        } else {
            this.livro.remove(encontrada);
            System.out.println("\nLivro removido com sucesso!");
            sc.close();
        }

    }
}
