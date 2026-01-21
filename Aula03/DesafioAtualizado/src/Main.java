import model.Livro;
import service.BibliotecaService;
import service.AuthService;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static BibliotecaService biblioteca = new BibliotecaService();
    static AuthService auth = new AuthService();

    public static void main(String[] args) {
        int opcao;

        do {
            cabecalho("SISTEMA DE BIBLIOTECA");

            System.out.println("1. Cadastrar administrador");
            System.out.println("2. Login");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAdmin();
                case 2 -> {
                    if (loginAdmin()) {
                        menuBiblioteca();
                    }
                }
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    // ===================== LOGIN / CADASTRO =====================

    static void cadastrarAdmin() {
        cabecalho("CADASTRO DE ADMINISTRADOR");

        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (auth.cadastrar(usuario, senha)) {
            System.out.println("Administrador cadastrado com sucesso!");
        } else {
            System.out.println("Usuário já existente!");
        }

        pausar();
    }

    static boolean loginAdmin() {
        cabecalho("LOGIN");

        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (auth.login(usuario, senha)) {
            System.out.println("Login realizado com sucesso!");
            pausar();
            return true;
        } else {
            System.out.println("Usuário ou senha inválidos!");
            pausar();
            return false;
        }
    }

    // ===================== MENU BIBLIOTECA =====================

    static void menuBiblioteca() {
        int opcao;

        do {
            cabecalho("BIBLIOTECA - ADMIN");

            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Atualizar livro");
            System.out.println("4. Remover livro");
            System.out.println("0. Logout");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> adicionar();
                case 2 -> listar();
                case 3 -> atualizar();
                case 4 -> remover();
                case 0 -> System.out.println("Logout realizado!");
                default -> System.out.println("Opção inválida!");
            }

            if (opcao != 0) pausar();

        } while (opcao != 0);
    }

    // Crud

    static void adicionar() {
        cabecalho("ADICIONAR LIVRO");

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        System.out.print("Disponível? (true/false): ");
        boolean disponivel = sc.nextBoolean();
        sc.nextLine();

        biblioteca.adicionar(new Livro(titulo, autor, ano, disponivel));
        System.out.println("Livro adicionado com sucesso!");
    }

    static void listar() {
        cabecalho("LISTA DE LIVROS");

        if (biblioteca.estaVazio()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        int i = 0;
        for (Livro livro : biblioteca.listar()) {
            System.out.println(i++ + ". " + livro);
        }
    }

    static void atualizar() {
        listar();
        if (biblioteca.estaVazio()) return;

        System.out.print("\nNúmero do livro: ");
        int indice = sc.nextInt();
        sc.nextLine();

        Livro livro = biblioteca.buscarPorIndice(indice);
        if (livro == null) {
            System.out.println("Número inválido!");
            return;
        }

        cabecalho("ATUALIZAR LIVRO");

        System.out.print("Novo título: ");
        livro.setTitulo(sc.nextLine());

        System.out.print("Novo autor: ");
        livro.setAutor(sc.nextLine());

        System.out.print("Novo ano: ");
        livro.setAno(sc.nextInt());

        System.out.print("Disponível? (true/false): ");
        livro.setDisponivel(sc.nextBoolean());
        sc.nextLine();

        System.out.println("Livro atualizado com sucesso!");
    }

    static void remover() {
        listar();
        if (biblioteca.estaVazio()) return;

        System.out.print("\nNúmero do livro: ");
        int indice = sc.nextInt();
        sc.nextLine();

        if (biblioteca.remover(indice)) {
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Número inválido!");
        }
    }

    // ===================== UTILITÁRIOS =====================

    static void cabecalho(String titulo) {
        System.out.println("\n===============================");
        System.out.println("  " + titulo);
        System.out.println("===============================\n");
    }

    static void pausar() {
        System.out.println("\nPressione ENTER para continuar...");
        sc.nextLine();
    }
}
