package model;

public class Elevador {
    private static final int PESO_MEDIO_PESSOA = 80;

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantidadePessoas;

    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getCapacidadeEmKg() {
        return capacidade * PESO_MEDIO_PESSOA;
    }

    public int getPesoAtualEmKg() {
        return quantidadePessoas * PESO_MEDIO_PESSOA;
    }

    public static int getPesoMedioPessoa() {
        return PESO_MEDIO_PESSOA;
    }
}