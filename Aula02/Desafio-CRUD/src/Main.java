import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    String titulo;
    String autor;
    int ano;
    boolean disponivel;

    Livro(String titulo, String autor, int ano, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public String toString() {
        String status = disponivel ? "Disponível" : "Emprestado";
        return titulo + " | " + autor + " | " + ano + " | " + status;
    }
}

public class Main {
    static ArrayList<Livro> livros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            cabecalho("BIBLIOTECA");

            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Atualizar livro");
            System.out.println("4. Remover livro");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: adicionar(); break;
                case 2: listar(); break;
                case 3: atualizar(); break;
                case 4: remover(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }

            if (opcao != 0) {
                pausar();
            }

        } while (opcao != 0);
    }

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

        livros.add(new Livro(titulo, autor, ano, disponivel));
        System.out.println("\nLivro adicionado com sucesso!");
    }

    static void listar() {
        cabecalho("LISTA DE LIVROS");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (int i = 0; i < livros.size(); i++) {
            System.out.println(i + ". " + livros.get(i));
        }
    }

    static void atualizar() {
        listar();
        if (livros.isEmpty()) return;

        System.out.print("\nNúmero do livro: ");
        int indice = sc.nextInt();
        sc.nextLine();

        if (indice < 0 || indice >= livros.size()) {
            System.out.println("Número inválido!");
            return;
        }

        Livro livro = livros.get(indice);

        cabecalho("ATUALIZAR LIVRO");

        System.out.println("1. Título");
        System.out.println("2. Autor");
        System.out.println("3. Ano");
        System.out.println("4. Disponibilidade");
        System.out.println("5. Atualizar tudo");
        System.out.print("Opção: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Novo título: ");
                livro.titulo = sc.nextLine();
                break;

            case 2:
                System.out.print("Novo autor: ");
                livro.autor = sc.nextLine();
                break;

            case 3:
                System.out.print("Novo ano: ");
                livro.ano = sc.nextInt();
                sc.nextLine();
                break;

            case 4:
                System.out.print("Disponível? (true/false): ");
                livro.disponivel = sc.nextBoolean();
                sc.nextLine();
                break;

            case 5:
                System.out.print("Novo título: ");
                livro.titulo = sc.nextLine();

                System.out.print("Novo autor: ");
                livro.autor = sc.nextLine();

                System.out.print("Novo ano: ");
                livro.ano = sc.nextInt();

                System.out.print("Disponível? (true/false): ");
                livro.disponivel = sc.nextBoolean();
                sc.nextLine();
                break;

            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("\nLivro atualizado com sucesso!");
    }

    static void remover() {
        listar();
        if (livros.isEmpty()) return;

        System.out.print("\nNúmero do livro: ");
        int indice = sc.nextInt();
        sc.nextLine();

        if (indice >= 0 && indice < livros.size()) {
            livros.remove(indice);
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Número inválido!");
        }
    }

    static void cabecalho(String titulo) {
        System.out.println("\n=====================================");
        System.out.println("  " + titulo);
        System.out.println("=====================================\n");
    }

    static void pausar() {
        System.out.println("\nPressione ENTER para voltar ao menu...");
        sc.nextLine();
    }
}
