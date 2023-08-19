package Racas;

public class Anao extends Raca{

    private int vezesQueBebeu;

    private String frase;

    private String fraseBebado;

    public Anao(String frase, String fraseBebado) {
        this.frase = frase;
        this.fraseBebado = fraseBebado;
        this.vezesQueBebeu = 0;
    }

    public void beber() {
        this.vezesQueBebeu += 1;
    }

    public String falar() {
        if (this.vezesQueBebeu > 3) {
            return this.fraseBebado;
        } else {
            return this.frase;
        }
    }
}
