import model.Elevador;
import service.ElevadorService;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElevadorService service = new ElevadorService();

        Elevador elevador = inicializarElevador(scanner);

        while (true) {
            exibirMenu();
            int opcao = lerInteiro(scanner);

            switch (opcao) {
                case 1:
                    entrarPessoas(scanner, elevador, service);
                    break;
                case 2:
                    sairPessoas(scanner, elevador, service);
                    break;
                case 3:
                    subirAndares(scanner, elevador, service);
                    break;
                case 4:
                    descerAndares(scanner, elevador, service);
                    break;
                case 5:
                    exibirStatus(elevador, service);
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
        System.out.println("\n========== SISTEMA DE ELEVADOR ==========");
        System.out.println("1 - Entrar pessoas");
        System.out.println("2 - Sair pessoas");
        System.out.println("3 - Subir andares");
        System.out.println("4 - Descer andares");
        System.out.println("5 - Exibir status");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static Elevador inicializarElevador(Scanner scanner) {
        System.out.println("\n========== INICIALIZAÇÃO DO ELEVADOR ==========");
        System.out.print("Capacidade do elevador (número de pessoas): ");
        int capacidade = lerInteiro(scanner);

        System.out.print("Total de andares do prédio (sem contar térreo): ");
        int totalAndares = lerInteiro(scanner);

        Elevador elevador = new Elevador(capacidade, totalAndares);
        System.out.println("\nElevador inicializado com sucesso!");
        System.out.println("Capacidade: " + capacidade + " pessoas (" + elevador.getCapacidadeEmKg() + "kg)");
        System.out.println("Andares: Térreo até " + totalAndares);
        System.out.println("Peso médio por pessoa: " + Elevador.getPesoMedioPessoa() + "kg");
        return elevador;
    }

    private static void entrarPessoas(Scanner scanner, Elevador elevador, ElevadorService service) {
        System.out.print("\nQuantidade de pessoas para entrar: ");
        int quantidade = lerInteiro(scanner);

        int sucessos = 0;
        for (int i = 0; i < quantidade; i++) {
            if (service.entra(elevador)) {
                sucessos++;
            } else {
                System.out.println("Elevador cheio! Apenas " + sucessos + " pessoa(s) conseguiu(ram) entrar.");
                return;
            }
        }
        System.out.println(sucessos + " pessoa(s) entrou(ram) no elevador.");
    }

    private static void sairPessoas(Scanner scanner, Elevador elevador, ElevadorService service) {
        System.out.print("\nQuantidade de pessoas para sair: ");
        int quantidade = lerInteiro(scanner);

        int sucessos = 0;
        for (int i = 0; i < quantidade; i++) {
            if (service.sai(elevador)) {
                sucessos++;
            } else {
                System.out.println("Não há mais pessoas! Apenas " + sucessos + " pessoa(s) conseguiu(ram) sair.");
                return;
            }
        }
        System.out.println(sucessos + " pessoa(s) saiu(ram) do elevador.");
    }

    private static void subirAndares(Scanner scanner, Elevador elevador, ElevadorService service) {
        System.out.print("\nQuantidade de andares para subir: ");
        int quantidade = lerInteiro(scanner);

        int sucessos = 0;
        for (int i = 0; i < quantidade; i++) {
            if (service.sobe(elevador)) {
                sucessos++;
            } else {
                System.out.println("Último andar alcançado! Subiu " + sucessos + " andar(es).");
                return;
            }
        }
        System.out.println("Subiu " + sucessos + " andar(es).");
    }

    private static void descerAndares(Scanner scanner, Elevador elevador, ElevadorService service) {
        System.out.print("\nQuantidade de andares para descer: ");
        int quantidade = lerInteiro(scanner);

        int sucessos = 0;
        for (int i = 0; i < quantidade; i++) {
            if (service.desce(elevador)) {
                sucessos++;
            } else {
                System.out.println("Térreo alcançado! Desceu " + sucessos + " andar(es).");
                return;
            }
        }
        System.out.println("Desceu " + sucessos + " andar(es).");
    }

    private static void exibirStatus(Elevador elevador, ElevadorService service) {
        System.out.println("\n" + service.getStatus(elevador));
    }

    private static int lerInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, digite um número válido: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
}