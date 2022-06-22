package operador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Editora;

public class OperadorEditora {
    private List<Editora> editoras;

    public OperadorEditora() {
        editoras = new ArrayList<>();
    }

    public Editora buscarCodigo(int codigoBuscado) {
        for (int c = 0; c < this.editoras.size(); c++) {
            if (this.editoras.get(c).getCodigoEditora() == codigoBuscado) {
                System.out.println(this.editoras.get(c));
                return this.editoras.get(c);
            }
        }
        return null;
    }

    public void exibirEditoras() {
        for (int c = 0; c < this.editoras.size(); c++) {
            System.out.println(this.editoras.get(c));
        }
    }

    public void adicionarEditora() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o código da editora: ");
        int codigo = sc.nextInt();
        if (buscarCodigo(codigo) != null) {
            System.out.println("\nEditora já cadastrada anteriormente!");
            return;
        }

        sc.nextLine();
        System.out.print("Digite o nome da editora: ");
        String nome = sc.nextLine();

        System.out.print("Digite o telefone da editora: ");
        int fone = sc.nextInt();

        Editora novaEditora = new Editora(codigo, nome, fone);
        this.editoras.add(novaEditora);
        System.out.println("\nEditora cadastrada com sucesso!");
    }

    public void adicionarEditoraCodigo(int codigo) {
        Scanner sc = new Scanner(System.in);
        if (buscarCodigo(codigo) != null) {
            System.out.println("\nEditora já cadastrada anteriormente!");
            return;
        }
        System.out.print("Digite o nome da editora: ");
        String nome = sc.nextLine();

        System.out.print("Digite o telefone da editora: ");
        int fone = sc.nextInt();

        Editora novaEditora = new Editora(codigo, nome, fone);
        this.editoras.add(novaEditora);
        System.out.println("\nEditora cadastrada com sucesso!");
    }

    public void editarCodigo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o código da editora a ser alterado: ");
        int codigoAtual = sc.nextInt();
        Editora encontrada = buscarCodigo(codigoAtual);
        if (encontrada == null) {
            System.out.println("\nEditora não cadastrada!");
            return;
        }

        System.out.print("Digite o novo código da editora: ");
        int novoCodigo = sc.nextInt();
        if (buscarCodigo(novoCodigo) != null) {
            System.out.println("\nEditora já cadastrada anteriormente!");
            return;
        } else {
            encontrada.setCodigoEditora(novoCodigo);
            System.out.println("\nCódigo alterado com sucesso!");
        }

    }

    public void editarNome() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o código da editora a ser alterado: ");
        int codigoAtual = sc.nextInt();
        Editora encontrada = buscarCodigo(codigoAtual);
        if (encontrada == null) {
            System.out.println("\nEditora não cadastrada!");
            return;
        } else {
            sc.nextLine();
            System.out.print("Digite o novo nome da editora: ");
            String novoNome = sc.nextLine();
            encontrada.setNomeEditora(novoNome);
            System.out.println("\nNome alterado com sucesso!");
        }
    }

    public void editarFone() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o código da editora a ser alterado: ");
        int codigoAtual = sc.nextInt();
        Editora encontrada = buscarCodigo(codigoAtual);
        if (encontrada == null) {
            System.out.println("\nEditora não cadastrada!");
            return;
        } else {
            System.out.print("Digite o novo telefone da editora: ");
            int novoFone = sc.nextInt();
            encontrada.setFoneEditora(novoFone);
            System.out.println("\nTelefone alterado com sucesso!");
        }
        
    }

    public void removerEditora() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o código da editora a ser removido: ");
        int codigoAtual = sc.nextInt();
        Editora encontrada = buscarCodigo(codigoAtual);
        if (encontrada == null) {
            System.out.println("\nEditora não cadastrada!");
            return;
        } else {
            this.editoras.remove(encontrada);
            System.out.println("\nEditora removida com sucesso!");
        }
        
    }
}
