package Personagens;

import Classes.Guerreiro;
import Racas.Humano;
import Racas.Monstro;
import Racas.Raca;

public class Urukhai extends Personagem{

    private Raca[] raca = {null, null};
    public Urukhai() {
        super(8, 6, 3, 45, false, null, new Guerreiro());
        this.raca[0] = new Humano("Looks like meat's back on the menu boys!", 2);
        this.raca[1] = new Monstro("Uuurrrrrr");
    }

    @Override
    public String toString() {
        return "U";
    }
}
