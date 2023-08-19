package Classes;

import Mapa.Mapa;
import Personagens.Personagem;

import java.util.ArrayList;
import java.util.Arrays;

public class Arqueiro extends Classe{
    public Arqueiro() {
        super(2);
    }


    public void fazerAcao(Personagem personagem, Mapa mapa) {
        ArrayList<Personagem> personagemList = new ArrayList<Personagem>(Arrays.asList(mapa.getPersonagems()));
        int index = personagemList.indexOf(personagem);
        if (index >= 0) {
            this.atacar(personagem, mapa, index);
            this.movimentar(personagem, mapa, index);
        }
    }

    public void atacar(Personagem personagem, Mapa mapa, int posicaoInicial) {
        Personagem[] personagems = mapa.getPersonagems();
        int multiplicadorDano = 0;
        int multiplicador = 1;
        if (!personagem.isSociedadeAnel()) {
            multiplicador = -1;
        }
        ArrayList<Personagem> alvos = new ArrayList<Personagem>();
        for (int i = 3; i >= 1; i--) {
            if ((posicaoInicial + (i*multiplicador)) >= 0 && (posicaoInicial + (i*multiplicador)) < 10) {
                if (personagems[posicaoInicial + (i*multiplicador)] != null) {
                    if (personagems[posicaoInicial + (i*multiplicador)].isSociedadeAnel() != personagem.isSociedadeAnel()) {
                        alvos.add(personagems[posicaoInicial + (i*multiplicador)]);
                        multiplicadorDano = i;
                        break;
                    }
                }
            }
        }
        int dano = personagem.getAgilidade()*multiplicadorDano;
        super.atacar(alvos, dano);
    }

    @Override
    public boolean movimentar(Personagem personagem, Mapa mapa, int posicaoInicial) {
        Personagem[] personagens = mapa.getPersonagems();
        boolean andou = false;
        boolean encontrarInicio = true;
        int multiplicador = 1;
        if (!personagem.isSociedadeAnel()) {
            multiplicador = -1;
            encontrarInicio = false;
        }
        int posicao = posicaoInicial;
        Personagem personagemEncontrado = null;
        for (int i=0; i<9; i++) {
            if (personagens[i] != null) {
                if(personagens[i].isSociedadeAnel() != personagem.isSociedadeAnel()) {
                    if (encontrarInicio) {
                        personagemEncontrado = personagens[i];
                        break;
                    } else {
                        personagemEncontrado = personagens[i];
                    }
                }
            }
        }
        super.movimentar(personagem, mapa, posicaoInicial);
        return true;
    }
}
