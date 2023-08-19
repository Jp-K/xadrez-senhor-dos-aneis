package Personagens;

import Classes.Arqueiro;
import Racas.Monstro;

public class Goblim extends Personagem{

    public Goblim() {
        super(3, 6, 1, 20, false, new Monstro("Iiisshhhh"), new Arqueiro());
    }

    @Override
    public String toString() {
        return "M";
    }
}
