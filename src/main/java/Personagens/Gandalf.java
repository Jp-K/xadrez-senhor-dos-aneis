package Personagens;

import Classes.Mago;
import Racas.Maia;

public class Gandalf extends Personagem{

    public Gandalf() {
        super(2, 3, 10, 80, true, new Maia("A Wizard is never late, nor is he early. He arrives precisely when he means to.", null), new Mago());
    }

    @Override
    public String toString() {
        return "G";
    }

}
