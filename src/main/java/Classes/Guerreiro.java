package Classes;

import Mapa.Mapa;
import Personagens.Personagem;

import java.util.ArrayList;
import java.util.Arrays;

public class Guerreiro extends Classe{
    public Guerreiro() {
        super(1);
    }

    @Override
    public boolean movimentar(Personagem personagem, Mapa mapa, int posicaoInicial) {
        Personagem[] personagems = mapa.getPersonagems();
        int multiplicador = 1;
        if(!personagem.isSociedadeAnel()) {
            multiplicador = -1;
        }
        if (personagems[posicaoInicial+multiplicador] == null) {
            return super.movimentar(personagem, mapa, posicaoInicial);
        }
        return false;
    }

    public void atacar(Personagem personagem, Mapa mapa, int posicaoInicial) {
        Personagem[] personagems = mapa.getPersonagems();
        ArrayList<Personagem> alvos = new ArrayList<Personagem>();
        int multiplicador = 1;
        if(!personagem.isSociedadeAnel()) {
            multiplicador = -1;
        }
        if (personagems[posicaoInicial+multiplicador] != null) {
            if(personagems[posicaoInicial+multiplicador].isSociedadeAnel() != personagem.isSociedadeAnel()) {
                alvos.add(personagems[posicaoInicial+multiplicador]);
            }
        }

        int dano = personagem.getForca()*2;
        super.atacar(alvos, dano);
    }

    public void fazerAcao(Personagem personagem, Mapa mapa) {
        ArrayList<Personagem> personagemList = new ArrayList<Personagem>(Arrays.asList(mapa.getPersonagems()));
        int index = personagemList.indexOf(personagem);
        if (index >= 0) {
            this.atacar(personagem, mapa, index);
            this.movimentar(personagem, mapa, index);
        }
    }
}
