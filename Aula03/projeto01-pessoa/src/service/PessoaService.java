package service;

import model.Pessoa;
import java.time.LocalDate;
import java.time.Period;

public class PessoaService {

    public int calcularIdade(Pessoa pessoa) {
        if (pessoa.getDataNascimento() == null) {
            return 0;
        }
        return Period.between(pessoa.getDataNascimento(), LocalDate.now()).getYears();
    }

    public void imprimirDados(Pessoa pessoa) {
        System.out.println("\n========== DADOS DA PESSOA ==========");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimentoFormatada());
        System.out.println("Altura: " + pessoa.getAltura() + " m");
        System.out.println("Idade: " + calcularIdade(pessoa) + " anos");
        System.out.println("=====================================\n");
    }

    public boolean validarPessoa(Pessoa pessoa) {
        if (pessoa.getNome() == null || pessoa.getNome().trim().isEmpty()) {
            System.out.println("Erro: Nome não pode ser vazio!");
            return false;
        }

        if (pessoa.getDataNascimento() == null) {
            System.out.println("Erro: Data de nascimento não pode ser nula!");
            return false;
        }

        if (pessoa.getDataNascimento().isAfter(LocalDate.now())) {
            System.out.println("Erro: Data de nascimento não pode ser no futuro!");
            return false;
        }

        if (pessoa.getAltura() <= 0 || pessoa.getAltura() > 3.0) {
            System.out.println("Erro: Altura inválida!");
            return false;
        }

        return true;
    }
}