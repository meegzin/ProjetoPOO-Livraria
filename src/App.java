import java.util.Scanner;

import operador.OperadorEditora;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opMenu = 0, opAdmin = 0, opEditora = 0, opLivro = 0;

        String cPswAdmin;
        String pswAdmin = "admin";
        OperadorEditora operador = new OperadorEditora();

        // /*---------------------------------------------------------*/
        do {
            System.out.println(
                    "\n\nBem Vindo a Livraria Digital! \n Escolha o acesso desejado:\n\n[0] SAIR\n[1] CLIENTE\n[2] ADMINISTRADOR");
            System.out.print("-> ");
            opMenu = sc.nextInt();
            switch (opMenu) {
                case 0 -> System.out.println("\nEncerrando...");
                case 1 -> System.out.println("\nEncerrando...");
                case 2 -> {
                    sc.nextLine();
                    System.out.println("Insira a senha de administrador: ");
                    cPswAdmin = sc.nextLine().toLowerCase();

                    if (pswAdmin.equals(cPswAdmin)) {
                        System.out.println("\n\n [0] SAIR\n [1] EDITORA\n [2] LIVRO");
                        System.out.print("-> ");
                        opAdmin = sc.nextInt();

                        switch (opAdmin) {
                            case 0 -> System.out.println("\nEncerrando...");
                            case 1 -> {
                                do{
                                System.out.println("""
                                        [0] SAIR
                                        [1] Adicionar editora
                                        [2] Deletar editora
                                        [3] Editar editora
                                        [4] Filtar editora
                                        [5] Exibir todas as editoras

                                        Escolha uma opção:\040""");
                                opEditora = sc.nextInt();
                                switch (opEditora) {
                                    case 0 -> System.out.println("\nEncerrando...");
                                    case 1 -> operador.adicionarEditora();
                                    case 2 -> operador.removerEditora();
                                    case 3 -> {
                                        System.out.print("""
                                                [0] SAIR
                                                [1] Alterar codigo
                                                [2] Alterar nome
                                                [3] Alterar telefone

                                                Escolha uma opção:\040""");
                                        opEditora = sc.nextInt();

                                        switch (opEditora) {
                                            case 0 -> System.out.println("\nEncerrando...");
                                            case 1 -> operador.editarCodigo();
                                            case 2 -> operador.editarNome();
                                            case 3 -> operador.editarFone();
                                            default -> System.out.println("\nOpção inválida!");
                                        }
                                    }
                                    case 4 -> {
                                        System.out.println("Insira o codigo de consulta: ");
                                        opEditora = sc.nextInt();
                                        operador.buscarCodigo(opEditora);
                                    }

                                    case 5 -> operador.exibirEditoras();
                                    default -> System.out.println("\nOpção inválida!");
                                }
                            }while(opEditora != 0);

                            }

                            case 2 -> {
                                System.out.print("""
                                        [0] SAIR
                                        [1] Adicionar livro
                                        [2] Deletar livro
                                        [3] Editar livro
                                        [4] Filtar livro
                                        [5] Exibir todos os livros

                                        Escolha uma opção:\040""");
                                opLivro = sc.nextInt();

                            }
                            default -> System.out.println("\nOpção inválida!");
                        }
                    } else {
                        System.out.println("Senha incorreta! ");
                    }

                }
                default -> System.out.println("\nOpção inválida!");
            }
        } while (opMenu != 0);
    }
}