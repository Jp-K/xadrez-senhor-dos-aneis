package Classes;

import Mapa.Mapa;
import Personagens.Personagem;

import java.util.ArrayList;
import java.util.Arrays;

public class Mago extends Classe{

    public Mago() {
        super(1);
    }

    @Override
    public boolean movimentar(Personagem personagem, Mapa mapa, int posicaoInicial) {
        Personagem[] personagens = mapa.getPersonagems();
        boolean temInimigos = false;
        for(Personagem p : personagens) {
            if (p != null) {
                if (!(p.isSociedadeAnel() == personagem.isSociedadeAnel())) {
                    temInimigos = true;
                    break;
                }
            }
        }
        if (!temInimigos) {
            return super.movimentar(personagem, mapa, posicaoInicial);
        }
        return false;
    }

    public void atacar(Personagem personagem, Mapa mapa) {
        Personagem[] personagensMapa = mapa.getPersonagems();
        ArrayList<Personagem> personagensAtacar = new ArrayList<Personagem>();
        boolean sociedadePersonagem = personagem.isSociedadeAnel();
        for(Personagem personagemMapa : personagensMapa) {
            if (personagemMapa != null) {
                if (personagemMapa.isSociedadeAnel() != sociedadePersonagem) {
                    personagensAtacar.add(personagemMapa);
                }
            }
        }
        int dano = personagem.getInteligencia();
        super.atacar(personagensAtacar, dano);
    }

    public void fazerAcao(Personagem personagem, Mapa mapa) {
        ArrayList<Personagem> personagemList = new ArrayList<Personagem>(Arrays.asList(mapa.getPersonagems()));
        int index = personagemList.indexOf(personagem);
        if (index >= 0) {
            this.atacar(personagem, mapa);
            this.movimentar(personagem, mapa, index);
        }
    }
}
