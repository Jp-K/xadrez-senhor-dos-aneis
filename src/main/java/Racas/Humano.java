package Racas;

public class Humano extends Raca{

    private String frase;

    private int danoEnvelhecer;

    public Humano(String frase, int danoEnvelhecer) {
        this.frase = frase;
        this.danoEnvelhecer = danoEnvelhecer;
    }

    public int envelhecer() {
        return danoEnvelhecer;
    }

    public String falar() {
        return frase;
    }
}
