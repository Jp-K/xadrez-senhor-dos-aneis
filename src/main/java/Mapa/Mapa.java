package Mapa;

import Exceptions.PersonagemJaEstaNoMapaException;
import Exceptions.PersonagemNaoEncontradoNoMapaException;
import Exceptions.PosicaoOcupadaException;
import Personagens.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Mapa {
    private Personagem[] personagems = new Personagem[10];

    private Personagem[] personagemsMortos = new Personagem[10];

    public Mapa() {
    }

    public Personagem[] getPersonagems() {
        for (int i=0; i<10; i++) {
            if (this.personagems[i] != null) {
                if(!(this.personagems[i].getConstituicao() > 0)) {
                    this.personagemsMortos[i] = this.personagems[i];
                    this.personagems[i] = null;
                }
            }
        }
        return this.personagems;
    }

    public Personagem buscarCasa(int posicao) {
        if (this.personagems[posicao] != null) {
            return this.personagems[posicao];
        }
        return null;
    }

    public Personagem buscarPosicao(int posicao) {
        if (this.personagems[posicao] != null) {
            return this.personagems[posicao];
        } else {
            throw new PersonagemNaoEncontradoNoMapaException();
        }
    }

    public void inserir(int posicao, Personagem personagem) {
        ArrayList<Personagem> personagemList = new ArrayList<Personagem>(Arrays.asList(this.getPersonagems()));
        int index = personagemList.indexOf(personagem);

        int posicaoCorrigida = posicao;
        if (posicao > 9) {
            posicaoCorrigida = 9;
        } else if (posicao < 0) {
            posicaoCorrigida = 0;
        }
        if (index >= 0) {
            throw new PersonagemJaEstaNoMapaException();
        }
        if (personagems[posicaoCorrigida] != null) {
            throw new PosicaoOcupadaException();
        }
        personagems[posicaoCorrigida] = personagem;
    }

    public String exibir() {
        StringBuilder mapa = new StringBuilder();
        Personagem[] personagemsList = this.getPersonagems();
        mapa.append("|");
        for (int i=0; i<10; i++) {
            if (personagemsList[i] != null) {
                mapa.append(personagemsList[i].toString());
            } else {
                mapa.append(" ");
            }
            mapa.append("|");
        }
        return mapa.toString();
    }
}
