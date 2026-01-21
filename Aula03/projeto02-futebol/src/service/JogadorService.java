package service;

import model.Jogador;
import java.time.LocalDate;
import java.time.Period;

public class JogadorService {

    public int calcularIdade(Jogador jogador) {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(jogador.getDataNascimento(), dataAtual).getYears();
    }

    public int calcularTempoAposentadoria(Jogador jogador) {
        int idade = calcularIdade(jogador);
        int idadeAposentadoria = obterIdadeAposentadoria(jogador.getPosicao());
        int tempoRestante = idadeAposentadoria - idade;
        return tempoRestante > 0 ? tempoRestante : 0;
    }

    private int obterIdadeAposentadoria(String posicao) {
        String posicaoLower = posicao.toLowerCase();

        if (posicaoLower.contains("defesa") || posicaoLower.contains("zagueiro") ||
                posicaoLower.contains("lateral")) {
            return 40;
        } else if (posicaoLower.contains("meio") || posicaoLower.contains("meia") ||
                posicaoLower.contains("volante")) {
            return 38;
        } else if (posicaoLower.contains("atac") || posicaoLower.contains("centroavante") ||
                posicaoLower.contains("ponta")) {
            return 35;
        }
        return 35;
    }

    public void imprimirDados(Jogador jogador) {
        System.out.println("\n========== DADOS DO JOGADOR ==========");
        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Posição: " + jogador.getPosicao());
        System.out.println("Data de Nascimento: " + jogador.getDataNascimento());
        System.out.println("Nacionalidade: " + jogador.getNacionalidade());
        System.out.println("Altura: " + jogador.getAltura() + "m");
        System.out.println("Peso: " + jogador.getPeso() + "kg");
        System.out.println("Idade: " + calcularIdade(jogador) + " anos");

        int tempoAposentadoria = calcularTempoAposentadoria(jogador);
        if (tempoAposentadoria > 0) {
            System.out.println("Tempo para aposentadoria: " + tempoAposentadoria + " anos");
        } else {
            System.out.println("Já está em idade de aposentadoria");
        }
        System.out.println("======================================");
    }
}
