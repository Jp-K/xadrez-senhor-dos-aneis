package Personagens;

import Classes.Guerreiro;
import Racas.Humano;

public class Aragorn extends Personagem{

    public Aragorn() {
        super(10, 7, 6, 60, true, new Humano("A day may come when the courage of men fails… but it is not THIS day.", 1), new Guerreiro());
    }

    public void envelhecer() {
        this.setConstituicao(this.getConstituicao()-this.getRaca().envelhecer());
    }

    @Override
    public String toString() {
        return "A";
    }
}
