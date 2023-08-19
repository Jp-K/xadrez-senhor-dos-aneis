package Personagens;

import Classes.Guerreiro;
import Racas.Humano;

public class Boromir extends Personagem{
    public Boromir() {
        super(7, 6, 3, 40, true, new Humano("One does not simply walk into Mordor.", 2), new Guerreiro());
    }

    public void envelhecer() {
        this.setConstituicao(this.getConstituicao()-this.getRaca().envelhecer());
    }

    @Override
    public String toString() {
        return "B";
    }
}
