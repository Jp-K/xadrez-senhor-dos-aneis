package Personagens;

import Classes.Guerreiro;
import Racas.Anao;

public class Gimli extends Personagem{
    public Gimli() {
        super(9, 2, 4, 60, true, new Anao("Let them come. There is one Dwarf yet in Moria who still draws breath.", "What did I say? He can't hold his liquor!"), new Guerreiro());
    }
    @Override
    public String toString() {
        return "I";
    }
}
