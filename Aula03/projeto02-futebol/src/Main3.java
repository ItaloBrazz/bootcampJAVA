import model.Jogador;
import service.JogadorService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    private static Scanner scanner = new Scanner(System.in);
    private static JogadorService service = new JogadorService();
    private static List<Jogador> jogadores = new ArrayList<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    cadastrarJogador();
                    break;
                case 2:
                    listarJogadores();
                    break;
                case 3:
                    visualizarJogador();
                    break;
                case 4:
                    calcularIdadeJogador();
                    break;
                case 5:
                    calcularTempoAposentadoria();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n========== SISTEMA DE JOGADORES ==========");
        System.out.println("1 - Cadastrar jogador");
        System.out.println("2 - Listar todos os jogadores");
        System.out.println("3 - Visualizar dados completos");
        System.out.println("4 - Calcular idade");
        System.out.println("5 - Calcular tempo para aposentadoria");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarJogador() {
        System.out.println("\n========== CADASTRO DE JOGADOR ==========");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Posição (Defesa/Meio-campo/Atacante): ");
        String posicao = scanner.nextLine();

        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        LocalDate dataNascimento = lerData();

        System.out.print("Nacionalidade: ");
        String nacionalidade = scanner.nextLine();

        System.out.print("Altura (em metros): ");
        double altura = lerDouble();

        System.out.print("Peso (em kg): ");
        double peso = lerDouble();

        Jogador jogador = new Jogador(nome, posicao, dataNascimento, nacionalidade, altura, peso);
        jogadores.add(jogador);

        System.out.println("\nJogador cadastrado com sucesso!");
    }

    private static void listarJogadores() {
        if (jogadores.isEmpty()) {
            System.out.println("\nNenhum jogador cadastrado!");
            return;
        }

        System.out.println("\n========== LISTA DE JOGADORES ==========");
        for (int i = 0; i < jogadores.size(); i++) {
            Jogador j = jogadores.get(i);
            System.out.println((i + 1) + " - " + j.getNome() + " (" + j.getPosicao() + ")");
        }
    }

    private static void visualizarJogador() {
        Jogador jogador = selecionarJogador();
        if (jogador != null) {
            service.imprimirDados(jogador);
        }
    }

    private static void calcularIdadeJogador() {
        Jogador jogador = selecionarJogador();
        if (jogador != null) {
            int idade = service.calcularIdade(jogador);
            System.out.println("\nIdade de " + jogador.getNome() + ": " + idade + " anos");
        }
    }

    private static void calcularTempoAposentadoria() {
        Jogador jogador = selecionarJogador();
        if (jogador != null) {
            int tempo = service.calcularTempoAposentadoria(jogador);
            if (tempo > 0) {
                System.out.println("\n" + jogador.getNome() + " tem " + tempo + " ano(s) até a aposentadoria");
            } else {
                System.out.println("\n" + jogador.getNome() + " já está em idade de aposentadoria");
            }
        }
    }

    private static Jogador selecionarJogador() {
        if (jogadores.isEmpty()) {
            System.out.println("\nNenhum jogador cadastrado!");
            return null;
        }

        listarJogadores();
        System.out.print("\nSelecione o número do jogador: ");
        int indice = lerInteiro() - 1;

        if (indice >= 0 && indice < jogadores.size()) {
            return jogadores.get(indice);
        } else {
            System.out.println("Jogador inválido!");
            return null;
        }
    }

    private static int lerInteiro() {
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, digite um número válido: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    private static double lerDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Por favor, digite um número válido: ");
            scanner.next();
        }
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    private static LocalDate lerData() {
        while (true) {
            try {
                String dataStr = scanner.nextLine();
                return LocalDate.parse(dataStr, formatter);
            } catch (Exception e) {
                System.out.print("Data inválida! Digite novamente (dd/MM/yyyy): ");
            }
        }
    }
}
