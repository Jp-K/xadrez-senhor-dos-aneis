package Personagens;

import Classes.Guerreiro;
import Racas.Monstro;

public class Orc extends Personagem{
    public Orc() {
        super(7, 4, 1, 30, false, new Monstro("Arrrggghhh"), new Guerreiro());
    }

    @Override
    public String toString() {
        return "O";
    }
}
