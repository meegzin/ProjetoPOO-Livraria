import java.util.Scanner;

import operador.OperadorLivro;
import operador.OperadorCliente;
import operador.OperadorCompras;
import operador.OperadorEditora;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opMenu = 0, opAdmin = 0, opEditora = 0, opLivro = 0, opMenuInterno = 0;
        double valorTotal = 0;

        String cPswAdmin;
        String pswAdmin = "admin";
        boolean loginAcess = true;
        OperadorEditora operadorEditora = new OperadorEditora();
        OperadorLivro operadorLivro = new OperadorLivro();
        OperadorCompras operadorCompras = new OperadorCompras();
        OperadorCliente operadorCliente = new OperadorCliente();
        /*---------------------------------------------------------*/
        do {
            System.out.println(
                    "\n\nBem Vindo a Livraria Digital! \n Escolha o acesso desejado:\n\n[0] SAIR\n[1] CLIENTE\n[2] ADMINISTRADOR");
            System.out.print("-> ");
            opMenu = sc.nextInt();

            switch (opMenu) {
                case 0 -> System.out.println("\nEncerrando...");
                case 1 -> {
                    do {

                        sc.nextLine();

                        System.out.println("\n== Olá, seja bem-vindo esses são os livros disponíveis == ");

                        operadorLivro.exibirLivro();

                        System.out.println("\nEscolha o livro desejado(Insira o ISBN):");
                        System.out.print("-> ");
                        String isbn = sc.next();
                        boolean validarISBN = operadorLivro.validarISBN(isbn);

                        if (validarISBN) {

                            System.out.println("Quantos livros deseja comprar?");
                            System.out.print("-> ");
                            int qtdLivro = sc.nextInt();

                            operadorCompras.adicionarCarrinho(isbn, qtdLivro);
                            valorTotal += qtdLivro * operadorLivro.buscarPreco(isbn);

                            System.out.println("\nValor das suas compras : " + "R$ " + valorTotal);
                        } else {
                            System.out.println("ISBN inválido!");
                        }

                        System.out.println("\nDeseja comprar mais livros?\n[0] Não\n[1] Sim");

                        opMenu = sc.nextInt();

                        if (opMenu == 0) {
                            do {
                                System.out.println("[0] Sair sem comprar \n[1] Login \n[2] Cadastrar-se");
                                int op = sc.nextInt();

                                switch (op) {
                                    case 0:
                                        System.out.println("\nSaindo...");
                                        opMenu = 3;
                                        break;
                                    case 1:
                                        do {
                                            loginAcess = operadorCliente.loginCliente();
                                            if (loginAcess) {

                                                System.out.println("Compra realizada com sucesso!");
                                                operadorCompras.exibirCompras();

                                                opMenu = 3;
                                                valorTotal = 0;
                                                operadorCompras.limparCarrinho();
                                                
                                            } else {
                                                System.out.println("Deseja tentar novamente ? [s] - SIM [n] - NAO");
                                                String validarLoginAcess = sc.next().toLowerCase();

                                                if (validarLoginAcess.equals("s")) {
                                                    loginAcess = false;
                                                } else {
                                                    loginAcess = true;
                                                }
                                            }

                                        } while (loginAcess != true);
                                        break;

                                    case 2:
                                        do {
                                            loginAcess = operadorCliente.adicionarCliente();
                                            if (loginAcess) {

                                            } else {
                                                System.out.println("Deseja tentar novamente ? [s] - SIM [n] - NAO");
                                                String validarLoginAcess = sc.next().toLowerCase();

                                                if (validarLoginAcess.equals("s")) {
                                                    loginAcess = false;
                                                } else {
                                                    loginAcess = true;
                                                }
                                            }

                                        } while (loginAcess != true);

                                        break;
                                    default:
                                        break;
                                }

                            } while (opMenu < 3);
                        } else {
                            opMenu = 1;
                        }

                    } while (opMenu == 0);

                }
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
                                do {
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
                                        case 1 -> operadorEditora.adicionarEditora();
                                        case 2 -> operadorEditora.removerEditora();
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
                                                case 1 -> operadorEditora.editarCodigo();
                                                case 2 -> operadorEditora.editarNome();
                                                case 3 -> operadorEditora.editarFone();
                                                default -> System.out.println("\nOpção inválida!");
                                            }
                                        }
                                        case 4 -> {
                                            System.out.println("Insira o codigo de consulta: ");
                                            String consultaEditora = sc.next();
                                            operadorEditora.buscarCodigo(consultaEditora);
                                        }

                                        case 5 -> operadorEditora.exibirEditoras();
                                        default -> System.out.println("\nOpção inválida!");
                                    }
                                } while (opEditora != 0);

                            }

                            case 2 -> {
                                do {
                                    System.out.print("""
                                            [0] SAIR
                                            [1] Adicionar livro
                                            [2] Deletar livro
                                            [3] Editar livro
                                            [4] Filtar livro
                                            [5] Exibir todos os livros

                                            Escolha uma opção:\040""");
                                    opLivro = sc.nextInt();

                                    switch (opLivro) {
                                        case 0 -> System.out.println("\nEncerrando...");
                                        case 1 -> {
                                            System.out.print("\nDigite o ISBN do livro: ");
                                            String ISBN = sc.next();
                                            if (operadorLivro.buscarISBN(ISBN) != null) {
                                                System.out.println("\nLivro já cadastrada anteriormente!");
                                                return;
                                            }

                                            System.out.print("\nDigite o codigo da editora do livro: ");
                                            String codigoBuscado = sc.next();
                                            if (operadorEditora.buscarCodigo(codigoBuscado) != null) {
                                                System.out.println("\nEditora Encontrada");

                                            } else {
                                                System.out.println(
                                                        "Editora não encontrada, por favor cadastre a editora");
                                                operadorEditora.adicionarEditoraCodigo(codigoBuscado);
                                            }

                                            operadorLivro.adicioniarLivro(ISBN, codigoBuscado);
                                        }
                                        case 2 -> operadorLivro.removerLivro();
                                        case 3 -> {
                                            System.out.print("""
                                                    [0] SAIR
                                                    [1] Alterar ISBN
                                                    [2] Alterar titulo
                                                    [3] Alterar autor
                                                    [4] Alterar preço
                                                    [5] Alterar cod. editora
                                                    [6] Alterar acabamento

                                                    Escolha uma opção:\040""");
                                            opLivro = sc.nextInt();

                                            switch (opLivro) {
                                                case 0 -> System.out.println("\nEncerrando...");
                                                case 1 -> operadorLivro.editarISBN();
                                                case 2 -> operadorLivro.editarTitulo();
                                                case 3 -> operadorLivro.editarAutores();
                                                case 4 -> operadorLivro.editarPreco();
                                                case 5 -> operadorLivro.editarCodigoEditora();
                                                case 6 -> operadorLivro.editarAcabamentos();
                                                default -> System.out.println("\nOpção inválida!");
                                            }
                                        }
                                        case 4 -> {
                                            System.out.print("""
                                                    [0] SAIR
                                                    [1] Procurar por ISBN
                                                    [2] Procurar por título

                                                    Escolha uma opção:\040""");

                                            switch (opLivro) {
                                                case 1 -> {
                                                    System.out.println("Insira o ISBN do livro");
                                                    operadorLivro.buscarISBN(sc.next());
                                                }
                                                case 2 -> {
                                                    System.out.println("Insira o titulo do livro");
                                                    operadorLivro.buscarTitulo(sc.nextLine());
                                                }
                                                default -> System.out.println("\nOpção inválida!");
                                            }
                                        }
                                        case 5 -> operadorLivro.exibirLivro();
                                    }
                                } while (opLivro != 0);
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
        sc.close();
    }
}