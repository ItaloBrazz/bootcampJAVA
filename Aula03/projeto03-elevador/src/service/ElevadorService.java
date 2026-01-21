package service;

import model.Elevador;

public class ElevadorService {

    public boolean entra(Elevador elevador) {
        if (elevador.getQuantidadePessoas() < elevador.getCapacidade()) {
            elevador.setQuantidadePessoas(elevador.getQuantidadePessoas() + 1);
            return true;
        }
        return false;
    }

    public boolean sai(Elevador elevador) {
        if (elevador.getQuantidadePessoas() > 0) {
            elevador.setQuantidadePessoas(elevador.getQuantidadePessoas() - 1);
            return true;
        }
        return false;
    }

    public boolean sobe(Elevador elevador) {
        if (elevador.getAndarAtual() < elevador.getTotalAndares()) {
            elevador.setAndarAtual(elevador.getAndarAtual() + 1);
            return true;
        }
        return false;
    }

    public boolean desce(Elevador elevador) {
        if (elevador.getAndarAtual() > 0) {
            elevador.setAndarAtual(elevador.getAndarAtual() - 1);
            return true;
        }
        return false;
    }

    public String getStatus(Elevador elevador) {
        return String.format("Andar: %d | Pessoas: %d/%d | Peso: %dkg/%dkg",
                elevador.getAndarAtual(),
                elevador.getQuantidadePessoas(),
                elevador.getCapacidade(),
                elevador.getPesoAtualEmKg(),
                elevador.getCapacidadeEmKg());
    }
}