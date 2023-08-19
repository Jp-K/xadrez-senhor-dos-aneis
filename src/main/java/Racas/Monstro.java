package Racas;

public class Monstro extends Raca{
    private String grunido;

    public Monstro(String grunido) {
        this.grunido = grunido;
    }

    public String grunir() {
        return this.grunido;
    }
}
