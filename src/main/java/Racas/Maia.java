package Racas;

import Personagens.Personagem;

public class Maia extends Raca{

    private String frase;

    private Personagem onRessucitar;

    public Maia(String frase, Personagem onRessucitar) {
        this.frase = frase;
        this.onRessucitar = onRessucitar;
    }

    public Personagem ressucitar() {
        return onRessucitar;
    }

    public String falar() {
        return frase;
    }
}
