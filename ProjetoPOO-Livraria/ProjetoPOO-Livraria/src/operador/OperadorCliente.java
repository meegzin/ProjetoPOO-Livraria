package operador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Cliente;

public class OperadorCliente {
    private List<Cliente> clientes;

    public OperadorCliente() {
        clientes = new ArrayList<>();
    }

    public Cliente buscarEmail(String email) {
        for (int c = 0; c < this.clientes.size(); c++) {
            if (this.clientes.get(c).getEmailUsuario() == email) {
                System.out.println(this.clientes.get(c));
                return this.clientes.get(c);
            }
        }
        return null;
    }

    public boolean adicionarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCADASTRO DE CLIENTE");

        System.out.print("Digite o seu email: ");
        String email = sc.nextLine();

        for (int c = 0; c < this.clientes.size(); c++) {
            if (this.clientes.get(c).getEmailUsuario() == email) {
                System.out.println("Email ja cadastrado");
                return false;
            }
        }
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a sua senha (so é permitido numeros): ");
        int senha = sc.nextInt();

        Cliente novoCliente = new Cliente(email, nome, senha);
        this.clientes.add(novoCliente);

        System.out.println("\nUsuario cadastrado com sucesso!");

        return true;
    }

    public boolean loginCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite o seu email: ");
        String email = sc.next();

        for (int c = 0; c < this.clientes.size(); c++) {
            System.out.println(this.clientes.get(c).getEmailUsuario());
            if (this.clientes.get(c).getEmailUsuario().equals(email)) {

                System.out.println("\nDigite a sua senha: ");
                int senha = sc.nextInt();
                if (this.clientes.get(c).getSenhaUsuario() == senha) {
                    System.out.println("\nLogin realizado com sucesso!");
                    return true;
                } else {
                    System.out.println("\nSenha incorreta!");
                    return false;
                }
            } else {
                System.out.println("email n encontrado");
                return false;
            }
        }
        return false;
    }

    public void editarEmail() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o email do usuario a ser alterado: ");
        String email = sc.nextLine();
        Cliente encontrada = buscarEmail(email);
        if (encontrada == null) {
            System.out.println("\nEmail não cadastrada!");
            return;
        }

        sc.nextLine();
        System.out.print("Digite o novo email: ");
        String novoEmail = sc.nextLine();
        if (buscarEmail(novoEmail) != null) {
            System.out.println("\nEmail já cadastrada anteriormente!");
            return;
        } else {
            encontrada.setEmailUsuario(novoEmail);
            System.out.println("\nEmail alterado com sucesso!");
        }

    }

    public void editarNome() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o email do usuario a ser alterado: ");
        String email = sc.nextLine();
        Cliente encontrada = buscarEmail(email);
        if (encontrada == null) {
            System.out.println("\nEmail não cadastrada!");
            return;
        } else {
            sc.nextLine();
            System.out.print("Digite o novo nome do usuario: ");
            String novoNome = sc.nextLine();
            encontrada.setNomeUsuario(novoNome);
            System.out.println("\nNome alterado com sucesso!");
        }

    }

    public void editarSenha() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o email do usuario a ser alterado: ");
        String email = sc.nextLine();
        Cliente encontrada = buscarEmail(email);
        if (encontrada == null) {
            System.out.println("\nEmail não cadastrada!");
            return;
        } else {
            sc.nextLine();
            System.out.print("Digite a nova senha do usuario: ");
            int novaSenha = sc.nextInt();
            encontrada.setSenhaUsuario(novaSenha);
            System.out.println("\nSenha alterado com sucesso!");

        }

    }
}
