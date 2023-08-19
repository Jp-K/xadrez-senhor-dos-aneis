package Simulador;
import Exceptions.SauronDominaOMundoException;
import Mapa.Mapa;
import Personagens.*;

import java.util.ArrayList;

public class Simulador {
    public Simulador() {

    }

    public void simular(Mapa mapa) {
        boolean fim = false;
        boolean hasSociedadeAnel = false;
        Personagem[] personagems;
        ArrayList<String> jaFizeramAcao = new ArrayList<>();
        boolean sociedadeDoAnelVence = true;
        while(!fim) {
            for (int i = 0; i < 10; i++) {
                personagems = mapa.getPersonagems();
                if (personagems[i] != null) {
                    if (!jaFizeramAcao.contains(personagems[i].toString())) {
                        jaFizeramAcao.add(personagems[i].toString());
                        personagems[i].fazerAcao(mapa);
                    }
                }
            }
            personagems = mapa.getPersonagems();
            for (Personagem personagem : personagems) {
                if (personagem != null) {
                    if (personagem.isSociedadeAnel()) {
                        hasSociedadeAnel = true;
                    }
                }
            }
            if (personagems[9] != null) {
                if(personagems[9].isSociedadeAnel()) {
                    fim = true;
                }
            }
            if (!hasSociedadeAnel) {
                fim = true;
                sociedadeDoAnelVence = false;
            }
            hasSociedadeAnel = false;
            jaFizeramAcao = new ArrayList<>();
        }
        if (!sociedadeDoAnelVence) {
            throw new SauronDominaOMundoException();
        }

    }
}
