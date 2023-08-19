package Personagens;

import Classes.Mago;
import Racas.Maia;

public class Saruman extends Personagem{
    public Saruman() {
        super(2, 2, 9, 70, false, new Maia("Against the power of Mordor there can be no victory.", null), new Mago());
    }

    @Override
    public String toString() {
        return "S";
    }
}
