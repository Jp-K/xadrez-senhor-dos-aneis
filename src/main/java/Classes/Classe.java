package Classes;
import Personagens.*;
import Mapa.*;

import java.util.ArrayList;

public class Classe {

    public Classe(int movimentacao) {
        this.movimentacao = movimentacao;
    }

    private int movimentacao;

    public void atacar(ArrayList<Personagem> alvos, int dano) {
        for (Personagem alvo : alvos) {
            alvo.setConstituicao(alvo.getConstituicao()-dano);
        }
    }

    public boolean movimentar(Personagem personagem, Mapa mapa, int posicaoInicial) {
        Personagem[] personagems = mapa.getPersonagems();
        int posicao = posicaoInicial;
        int multiplicador = -1;
        if (personagem.isSociedadeAnel()) {
            multiplicador = 1;
        }
        for (int i=1; i<=this.movimentacao; i++){
            if (posicao+(multiplicador) >=0 && posicao+(multiplicador) < 10) {
                if (personagems[posicao+(multiplicador)] == null) {
                    personagems[posicao] = null;
                    personagems[posicao+(multiplicador)] = personagem;
                    posicao = posicao+(multiplicador);
                }
            }
        }
        return true;
    }

    public int getMovimentacao() {
        return movimentacao;
    }

    public void fazerAcao(Personagem personagem, Mapa mapa) {
    }
}
