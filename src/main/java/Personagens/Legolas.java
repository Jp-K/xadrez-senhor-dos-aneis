package Personagens;

import Classes.Arqueiro;
import Racas.Elfo;

public class Legolas extends Personagem{
    public Legolas() {
        super(5, 10, 6, 80, true, new Elfo("They're taking the Hobbits to Isengard!",  "I amar prestar aen, han mathon ne nem, han mathon ne chae, a han noston ned."), new Arqueiro());
    }

    @Override
    public String toString() {
        return "L";
    }
}
