import model.Pessoa;
import service.PessoaService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main2 {

    private static Scanner scanner = new Scanner(System.in);
    private static PessoaService pessoaService = new PessoaService();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("  SISTEMA DE CADASTRO DE PESSOAS  ");
        System.out.println("===================================\n");

        boolean continuar = true;

        while (continuar) {
            Pessoa pessoa = cadastrarPessoa();

            if (pessoa != null && pessoaService.validarPessoa(pessoa)) {
                pessoaService.imprimirDados(pessoa);
            }

            System.out.print("Deseja cadastrar outra pessoa? (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            continuar = resposta.equals("s") || resposta.equals("sim");
            System.out.println();
        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }

    private static Pessoa cadastrarPessoa() {
        Pessoa pessoa = new Pessoa();

        try {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine().trim();
            pessoa.setNome(nome);

            LocalDate dataNascimento = null;
            boolean dataValida = false;

            while (!dataValida) {
                try {
                    System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
                    String dataStr = scanner.nextLine().trim();
                    dataNascimento = LocalDate.parse(dataStr, formatter);
                    dataValida = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Erro: Data invalida! Use o formato dd/MM/yyyy");
                }
            }
            pessoa.setDataNascimento(dataNascimento);

            double altura = 0;
            boolean alturaValida = false;

            while (!alturaValida) {
                try {
                    System.out.print("Digite a altura em metros (ex: 1.75): ");
                    String alturaStr = scanner.nextLine().trim().replace(",", ".");
                    altura = Double.parseDouble(alturaStr);
                    alturaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Altura invalida! Use números com . ou ,");
                }
            }
            pessoa.setAltura(altura);

            return pessoa;

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar pessoa: " + e.getMessage());
            return null;
        }
    }
}