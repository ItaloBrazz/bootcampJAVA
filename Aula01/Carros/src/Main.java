import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] placas = {"ABC1234", "DEF5678", "GHI9012", "JKL3456"};
        String[] modelos = {"Onix", "HB20", "Civic", "Compass"};
        String[] marcas = {"Chevrolet", "Hyundai", "Honda", "Jeep"};
        double[] diarias = {150.00, 140.00, 250.00, 300.00};
        boolean[] disponiveis = {true, true, true, true};

        int opcao;

        do {
            System.out.println("\n========================================");
            System.out.println("   SISTEMA DE ALUGUEL DE CARROS");
            System.out.println("========================================");
            System.out.println("1 - Ver carros disponíveis");
            System.out.println("2 - Alugar carro");
            System.out.println("3 - Devolver carro");
            System.out.println("0 - Sair");
            System.out.println("========================================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n=== CARROS DISPONÍVEIS ===");
                    for (int i = 0; i < placas.length; i++) {
                        if (disponiveis[i]) {
                            System.out.printf("%d - %s %s (Placa: %s) - R$ %.2f/dia\n",
                                    i + 1, marcas[i], modelos[i], placas[i], diarias[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n=== ALUGAR CARRO ===");
                    System.out.print("Digite o número do carro: ");
                    int escolha = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (escolha >= 0 && escolha < placas.length) {
                        if (disponiveis[escolha]) {
                            System.out.print("Quantos dias de aluguel? ");
                            int dias = scanner.nextInt();
                            scanner.nextLine();

                            double total = dias * diarias[escolha];
                            disponiveis[escolha] = false;

                            System.out.println("\n*** ALUGUEL CONFIRMADO ***");
                            System.out.printf("Carro: %s %s\n", marcas[escolha], modelos[escolha]);
                            System.out.printf("Período: %d dias\n", dias);
                            System.out.printf("Valor total: R$ %.2f\n", total);
                        } else {
                            System.out.println("Este carro já está alugado!");
                        }
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    System.out.println("\n=== DEVOLVER CARRO ===");
                    System.out.print("Digite o número do carro: ");
                    int devolucao = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (devolucao >= 0 && devolucao < placas.length) {
                        if (!disponiveis[devolucao]) {
                            disponiveis[devolucao] = true;
                            System.out.println("Carro devolvido com sucesso!");
                        } else {
                            System.out.println("Este carro não está alugado!");
                        }
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}